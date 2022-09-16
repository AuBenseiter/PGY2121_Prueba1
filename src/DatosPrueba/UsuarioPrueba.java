package DatosPrueba;

import Models.Usuario;

import java.time.LocalDate;

public class UsuarioPrueba {
    public static Usuario crearPrimerUsuario() {
        int idUsuario = 1;
        String nombre = "jperez.";
        String email = "juan.p@gmail.com";
        String run = "22.633.895-0";
        String fechaNacimiento = "1991/01/01";
        int  numTelefono = 56123456;
        String usuarioNombre = "jperez12.";
        String password = "123A1ddsdsa.";

        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setRun(run);
        usuario.setFechaNacimiento(fechaNacimiento);
        usuario.setNumTelefono(numTelefono);
        usuario.setUsuario(usuarioNombre);
        usuario.setPassword(password);
        return usuario;
    }

    public static Usuario crearSegundoUsuario() {
        int idUsuario = 1;
        String nombre = "jperez.";
        String email = "juan.p@gmail.com";
        String run = "22.633.895-0";
        String fechaNacimiento = "1991/01/01";
        int  numTelefono = 56123456;
        String usuarioNombre = "jperez12.";
        String password = "123A1ddsdsa.";

        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setRun(run);
        usuario.setFechaNacimiento(fechaNacimiento);
        usuario.setNumTelefono(numTelefono);
        usuario.setUsuario(usuarioNombre);
        usuario.setPassword(password);
        return usuario;
    }

    public static Usuario crearTerceroUsuario() {
        int idUsuario = 1;
        String nombre = "jperez.";
        String email = "juan.p@gmail.cl";
        String run = "18.908.112-k";
        String fechaNacimiento = "2004/01/01";
        int numTelefono =56345678;
        String usuarioNombre = "jperez";
        String password = "123456A";

        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setRun(run);
        usuario.setFechaNacimiento(fechaNacimiento);
        usuario.setNumTelefono(numTelefono);
        usuario.setUsuario(usuarioNombre);
        usuario.setPassword(password);
        return usuario;
    }
}
