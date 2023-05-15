package semana5_grupo_problema1;
import java.util.Scanner;
public class Semana5_Grupo_Problema1 {
    public static void main(String[] args) {
        // objeto que permite ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        double opcion1;
        int opcion2;

        // Proceso de discriminación en función de la opción que 
        // selecciona el Precio
        System.out.println("""
                           VENTA PRODUCTO
                           
                           Ingrese los siguientes datos:
                           PRECIO PRODUCTO // CANT. PRODUCTO 
                           """);
        opcion1 = entrada.nextDouble();
        opcion2 = entrada.nextInt();
        
        PrecioProducto precioproducto1 = new PrecioProducto(opcion1,opcion2);
        precioproducto1.calcularDescuento();
        precioproducto1.calcularPrecioFinal();
        System.out.print(precioproducto1);
    }
    
}
