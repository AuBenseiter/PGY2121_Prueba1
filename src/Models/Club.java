package Models;
import Utils.UtilsAtlas;

import java.util.Date;

public class Club {
    private String rolUnico;
    private String nombreClub;
    private String nombreFundador;
    private int anioFundacion;
    private String paisOrigen;
    private String lema;
    private String colores;
    private int valorSuscripcion;
    private String deporte;
    private int correlativoClub;

    public Club(String rolUnico, String nombreClub, String nombreFundador, int anioFundacion, String paisOrigen, String lema, int valorSuscripcion, String deporte, int correlativoClub) {
        this.rolUnico = rolUnico;
        this.nombreClub = nombreClub;
        this.nombreFundador = nombreFundador;
        this.anioFundacion = anioFundacion;
        this.paisOrigen = paisOrigen;
        this.lema = lema;
        this.valorSuscripcion = valorSuscripcion;
        this.deporte = deporte;
        this.correlativoClub = correlativoClub;
    }

    public Club() {

    }

    public String getRolUnico() {
        return rolUnico;
    }

    public void setRolUnico() {
        this.rolUnico = this.nombreClub.substring(0,2).toUpperCase()
                + this.deporte.substring(0, 1).toUpperCase()
                + (this.correlativoClub);
        System.out.println("El rol único es: " + this.rolUnico);
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getNombreFundador() {
        return nombreFundador;
    }

    public void setNombreFundador(String nombreFundador) {
        this.nombreFundador = nombreFundador;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = UtilsAtlas.ValidarNumerosPositivos("Año Fundación", anioFundacion);
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getValorSuscripcion() {
        return valorSuscripcion;
    }

    public void setValorSuscripcion(int valorSuscripcion) {
        this.valorSuscripcion = UtilsAtlas.ValidarNumerosPositivos("Valor Suscripcion" , valorSuscripcion);
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getCorrelativoClub() {
        return correlativoClub;
    }

    public void setCorrelativoClub(int correlativoClub) {
        this.correlativoClub = UtilsAtlas.ValidarNumerosPositivos("Correlativo Club", correlativoClub);
    }

    public void ActualizarNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
        this.setRolUnico();
    }
}
