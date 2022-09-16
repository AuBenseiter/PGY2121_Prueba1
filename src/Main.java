import DatosPrueba.ClubPrueba;
import DatosPrueba.SuscripcionPrueba;
import DatosPrueba.UsuarioPrueba;
import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Clubes clubes = new Clubes();
        Suscripcion suscripcion = new Suscripcion();
        List<Club> lista_clubes = new ArrayList<Club>();
        CorrelativoActual correlativoActual = new CorrelativoActual();
        Usuario primerUsuario = UsuarioPrueba.crearPrimerUsuario();
        Club primerClub = ClubPrueba.CrearPrimerClub();
        Club segundoClub = ClubPrueba.CrearSegundoClub();
        lista_clubes.add(primerClub);
        lista_clubes.add(segundoClub);
        clubes.setClubes(lista_clubes);
        clubes.ConcatenarColoresClubes();
        primerClub.ActualizarNombreClub("Nuevo nombre Club 1");
        System.out.println(primerClub.getNombreClub());
        System.out.println(primerClub.getRolUnico());
        suscripcion.SuscripcionAClub(lista_clubes, primerUsuario, 50000);
        primerClub.setValorSuscripcion(300);
        suscripcion.ActualizarPrecios(lista_clubes);
        primerUsuario.CalcularEdadUsuario();
        suscripcion.DetalleSuscripcion();
    }
}
