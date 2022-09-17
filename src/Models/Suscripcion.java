package Models;

import Utils.UtilsAtlas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Suscripcion {
    private Date fechaSuscripcion;
    private int valorSuscripcion;
    private int abonoTotal;
    private int correlativoVenta;
    private Usuario usuario;
    private String equipos;

    public Suscripcion(Date fechaSuscripcion, int valorSuscripcion, int abonoTotal, int correlativoVenta, Usuario usuario) {
        this.fechaSuscripcion = fechaSuscripcion;
        this.valorSuscripcion = valorSuscripcion;
        this.abonoTotal = abonoTotal;
        this.correlativoVenta = correlativoVenta;
        this.usuario = usuario;
    }

    public Suscripcion() {

    }

    public Date getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    public void setFechaSuscripcion() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaActual = LocalDate.now();
        Date fechaActualLocal = Date.from(
                fechaActual.atStartOfDay(ZoneId.systemDefault())
                        .toInstant());
        this.fechaSuscripcion = fechaActualLocal;
    }

    public int getValorSuscripcion() {
        return valorSuscripcion;
    }

    public void setValorSuscripcion(int valorSuscripcion) {
        this.valorSuscripcion = UtilsAtlas.ValidarNumerosPositivos("Valor Suscripción", valorSuscripcion);
    }

    public int getAbonoTotal() {
        return abonoTotal;
    }

    public void setAbonoTotal(int abonoTotal) {
        this.abonoTotal = abonoTotal;
    }

    public int getCorrelativoVenta() {
        return correlativoVenta;
    }

    public void setCorrelativoVenta(int correlativoVenta) {
        this.correlativoVenta = correlativoVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public void SuscripcionAClub(List<Club> clubes, Usuario usuario, int abonoTotal){
        IterarClubes(clubes);
        this.usuario = usuario;
        this.abonoTotal = abonoTotal;
        this.setFechaSuscripcion();
        this.correlativoVenta = 1;
        String nombreUsuario = usuario.getNombre();
        System.out.println("Usted " + nombreUsuario + " se ha suscrito a: " + this.equipos);
        System.out.println("Usted debe pagar la suma de: " + this.valorSuscripcion);
        ConcatenarFormatoClubes(clubes);
    }

    public void ActualizarPrecios(List<Club> clubes)
    {
        IterarClubes(clubes);
    }

    private void IterarClubes(List<Club> clubes)
    {
        String equipos = "";
        int valorSuscripcionTotal = 0;
        for (Club club: clubes) {
            String rolUnico = club.getRolUnico();
            String valorSuscripcion = String.valueOf(club.getValorSuscripcion());
            equipos += rolUnico + " $" + valorSuscripcion + "   ";
            valorSuscripcionTotal += club.getValorSuscripcion();
        }
        this.equipos = equipos;
        this.valorSuscripcion = valorSuscripcionTotal;
    }

    private void ConcatenarFormatoClubes(List<Club> clubes){
        String rolesConcatenados = "";
        for (Club club: clubes) {
            rolesConcatenados += club.getRolUnico();
        }
        System.out.println("Los roles concatenados son: " + rolesConcatenados);
    }

    public void DetalleSuscripcion(){
        System.out.println("Fecha Suscripcion: " + this.fechaSuscripcion);
        System.out.println("Valor Suscripcion: " + this.valorSuscripcion);
        System.out.println("Abono Total: " + this.abonoTotal);
        System.out.println("Correlativo Venta: " + this.correlativoVenta);
        System.out.println("Usuario : " + this.usuario.getNombre());
        System.out.println("Equipos : " + this.equipos);
    }
}
