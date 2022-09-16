package Models;

import Utils.UtilsAtlas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String run;
    private String fechaNacimiento;
    private int numTelefono;
    private String usuario;
    private String password;

    public Usuario(int id, String nombreUsuario, String email, String run, String fechaNacimiento, int numTelefono, String usuario, String password) {
        this.id = id;
        this.nombre = nombreUsuario;
        this.email = email;
        this.run = run;
        this.fechaNacimiento = fechaNacimiento;
        this.numTelefono = numTelefono;
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = UtilsAtlas.ValidarNumerosPositivos("ID Usuario",id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@") && (email.contains(".com")||email.contains(".cl")))
            this.email = email;
        else System.out.println("El email es incorrecto, debe contener el siguiente formato ejemplo@ejemplo.ejemplo");
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        if (validaRut(run))
            this.run = run;
        else
            System.out.println("El run ingresado no es un run válido, por favor verifique que esté ingresado correctamente");
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        try {
            Period edad = CalcularEdad(fechaNacimiento);
            if (edad.getYears() < 18)
            {
                System.out.println("Usted debe ser mayor de edad para registrarse");
                return;
            }
            this.fechaNacimiento = fechaNacimiento;
        } catch (Exception e) {
            System.out.println("La fecha ingresada no corresponde al siguiente formato: yy/mm/dd ");
        }
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        String numTelefonoEnString = String.valueOf(numTelefono);
        String codNumTelefono = numTelefonoEnString.substring(0, 2);
        if (numTelefonoEnString.length() > 7 && codNumTelefono.equals("56"))
            this.numTelefono = numTelefono;
        else
            System.out.println("El número de teléfono es inválido, debe tener al menos 8 caracteres y comenzar con un 56");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario.length() < 4) {
            System.out.println("Su nombre de usuario debe tener 4 o más caracteres");
            return;
        }
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        ValidarPassword(password);
    }

    public boolean validarLoginUsuario(String usuario, String password)
    {
        if (usuario.equals(this.usuario) && password.equals(this.password))
            return true;

        return false;
    }

    public static Boolean validaRut ( String rut ) {
        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public void ComprobarLogin(String usuario, String password)
    {
        if (this.usuario.equals(usuario) && this.password.equals(password))
            System.out.println("El usuario y la password coinciden");
        else
            System.out.println("Las credenciales ingresadas son inválidas");
    }

    public void CrearPasswordTemporal(String passwordTemporal)
    {
        ValidarPassword(passwordTemporal);
    }


    private void ValidarPassword(String password) {
        boolean tieneMayus = false;
        boolean tieneNum = false;
        int totalCaracteres = 0;

        for (int i = 0; i < password.length(); i++ ){
            char letra = password.charAt(i);
            char letra_Mayus = Character.toUpperCase(letra);

            if (letra == letra_Mayus && !Character.isDigit(letra))
                tieneMayus = true;
            if (Character.isDigit(letra))
                tieneNum = true;
            totalCaracteres++;
        }

        if (tieneMayus && tieneNum && totalCaracteres >= 6)
            this.password = password;
        else
            System.out.println("Su contraseña debe contener al menos una mayúscula, tener al menos un número y no debe ser menor a 6 caracteres");
    }

    public void CalcularEdadUsuario()
    {
        System.out.println("La edad del usuario es: " + CalcularEdad(this.fechaNacimiento).getYears());
    }
    private static Period CalcularEdad(String fechaNacimiento) {
        LocalDate FechaActual = LocalDate.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaNacimientoConFormato = LocalDate.parse(fechaNacimiento, FormatoFecha);
        Period edad = Period.between(fechaNacimientoConFormato, FechaActual);
        return edad;
    }
}
