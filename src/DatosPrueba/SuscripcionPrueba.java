package DatosPrueba;

import Models.Suscripcion;
import Models.Usuario;

public class SuscripcionPrueba {
    public static Suscripcion CrearPrimeraSuscripcion(int correlativoActual, Usuario usuario){
        int valorSuscripcion = 1;
        int abonoTotal = 19090;

        Suscripcion suscripcion = new Suscripcion();
        suscripcion.setValorSuscripcion(valorSuscripcion);
        suscripcion.setAbonoTotal(abonoTotal);
        suscripcion.setCorrelativoVenta(correlativoActual);
        suscripcion.setFechaSuscripcion();
        return suscripcion;
    }
}
