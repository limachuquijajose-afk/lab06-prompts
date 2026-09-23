package login;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField txtCorreo;
    private JPasswordField txtContrasena;
    private JButton btnIngresar;

    private final LoginService loginService;

    public LoginFrame() {
        loginService = new LoginService();

        configurarVentana();
        crearComponentes();
    }

    private void configurarVentana() {
        setTitle("Inicio de sesión");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void crearComponentes() {

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel(
                "Iniciar sesión",
                SwingConstants.CENTER
        );
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel lblCorreo = new JLabel("Correo:");
        JLabel lblContrasena = new JLabel("Contraseña:");

        txtCorreo = new JTextField(20);
        txtContrasena = new JPasswordField(20);

        btnIngresar = new JButton("Ingresar");

        // Título
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(lblTitulo, gbc);

        // Correo
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(lblCorreo, gbc);

        gbc.gridx = 1;
        panel.add(txtCorreo, gbc);

        // Contraseña
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lblContrasena, gbc);

        gbc.gridx = 1;
        panel.add(txtContrasena, gbc);

        // Botón
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(btnIngresar, gbc);

        add(panel);

        btnIngresar.addActionListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {

        String correo = txtCorreo.getText().trim();
        String contrasena = new String(txtContrasena.getPassword());

        // Validar campos vacíos
        if (correo.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debe completar todos los campos.",
                    "Campos incompletos",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Validar que el correo contenga @
        if (!correo.contains("@")) {
            JOptionPane.showMessageDialog(
                    this,
                    "El correo debe contener el carácter @.",
                    "Correo inválido",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Validar longitud de contraseña
        if (contrasena.length() < 8) {
            JOptionPane.showMessageDialog(
                    this,
                    "La contraseña debe tener al menos 8 caracteres.",
                    "Contraseña inválida",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Autenticar
        if (loginService.autenticar(correo, contrasena)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Inicio de sesión exitoso.",
                    "Bienvenido",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Correo o contraseña incorrectos.",
                    "Error de autenticación",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}