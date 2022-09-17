import DatosPrueba.ClubPrueba;
import DatosPrueba.SuscripcionPrueba;
import DatosPrueba.UsuarioPrueba;
import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clubes clubes = new Clubes();
        Suscripcion suscripcion = new Suscripcion();
        List<Club> lista_clubes = new ArrayList<Club>();
        int AbonoTotal = 230000;

        //TODO: Validar códigos equipos en Club
        Club primerClubSinErrores = ClubPrueba.PrimerClubSinErrores();
        Club segundoClubSinErreres = ClubPrueba.SegundoClubSinErrores();
        lista_clubes.add(primerClubSinErrores);
        lista_clubes.add(segundoClubSinErreres);

        CorrelativoActual correlativoActual = new CorrelativoActual();

        //TODO: Crear usuario con errores
        Usuario usuarioConErrores = UsuarioPrueba.crearUsuarioConErrores();

        //TODO: Crear usuario sin errores
        Usuario usuarioSinErrores = UsuarioPrueba.crearPrimerUsuario();

        //TODO: Crear Suscripción y Listar Códigos Equipos
        suscripcion.SuscripcionAClub(lista_clubes, usuarioSinErrores, AbonoTotal);

        //TODO: Comprobar Login
        usuarioSinErrores.validarLoginUsuario("jperez","123A1ddsdsa.");
        //TODO:Comprobar Login Inconrrecto
        usuarioSinErrores.validarLoginUsuario("jperez","123A1ddsdsa");



        Club primerClub = ClubPrueba.PrimerClubSinErrores();
        Club segundoClub = ClubPrueba.SegundoClubSinErrores();
        lista_clubes.add(primerClub);
        lista_clubes.add(segundoClub);
        clubes.setClubes(lista_clubes);
        clubes.ConcatenarColoresClubes();
        primerClub.ActualizarNombreClub("Nuevo nombre Club 1");
        System.out.println(primerClub.getNombreClub());
        System.out.println(primerClub.getRolUnico());
        suscripcion.SuscripcionAClub(lista_clubes, usuarioSinErrores, 50000);
        primerClub.setValorSuscripcion(300);
        suscripcion.ActualizarPrecios(lista_clubes);
        usuarioSinErrores.CalcularEdadUsuario();
        suscripcion.DetalleSuscripcion();

    }
}
