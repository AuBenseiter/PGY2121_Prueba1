package Models;

public class CorrelativoActual {
    private int correlativoSuscripcionActual = 1000;

    public void CorrelativoActual(){
    }

    public int AsignarCorrelativo(){
        int correlativoActual = this.correlativoSuscripcionActual;
        this.correlativoSuscripcionActual = correlativoActual + 10;
        return correlativoActual;
    }
}
