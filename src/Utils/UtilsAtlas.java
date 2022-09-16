package Utils;

public class UtilsAtlas {
    public static int ValidarNumerosPositivos(String parametro, int valor){
        if (valor < 0)
        {
            System.out.println("El valor de: " + parametro + " no puede ser negativo");
            return 0;
        } else
            return valor;
    }
}
