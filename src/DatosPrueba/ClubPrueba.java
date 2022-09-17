package DatosPrueba;

import Models.Club;

import java.util.Date;

public class ClubPrueba {
    public static Club PrimerClubSinErrores()
    {
        String nombreClub = "Los gallos de temuco";
        String nombreFundador = "Pedro Fundador";
        int anioFundacion = 1990;
        String paisOrigen = "Chile";
        String lema = "Por la razón o la fuerza";
        String colores = "Amarillo, azul";
        int valorSuscripcion = 200;
        String deporte = "Handboll";
        int correlativoClub = 1;

        Club club = new Club();
        club.setNombreClub(nombreClub);
        club.setDeporte(deporte);
        club.setRolUnico();
        club.setNombreFundador(nombreFundador);
        club.setAnioFundacion(anioFundacion);
        club.setPaisOrigen(paisOrigen);
        club.setLema(lema);
        club.setColores(colores);
        club.setValorSuscripcion(valorSuscripcion);
        club.setCorrelativoClub(correlativoClub);
        return club;
    }

    public static Club SegundoClubSinErrores()
    {
        String nombreClub = "Equipo la bandita de mi casa";
        String nombreFundador = "Diego Fundador";
        int anioFundacion = 2001;
        String paisOrigen = "Peru";
        String lema = "Todo o nada";
        String colores = "Rojo, verde";
        int valorSuscripcion = 100;
        String deporte = "Handboll";
        int correlativoClub = 2;

        Club club = new Club();
        club.setNombreClub(nombreClub);
        club.setDeporte(deporte);
        club.setRolUnico();
        club.setNombreFundador(nombreFundador);
        club.setAnioFundacion(anioFundacion);
        club.setPaisOrigen(paisOrigen);
        club.setLema(lema);
        club.setColores(colores);
        club.setValorSuscripcion(valorSuscripcion);
        club.setCorrelativoClub(correlativoClub);
        return club;
    }
}
