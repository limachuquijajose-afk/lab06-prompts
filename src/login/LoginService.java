package login;

public class LoginService {

    private final String correoCorrecto = "usuario@gmail.com";
    private final String contrasenaCorrecta = "12345678";

    public boolean autenticar(String correo, String contrasena) {
        return correoCorrecto.equals(correo)
                && contrasenaCorrecta.equals(contrasena);
    }
}