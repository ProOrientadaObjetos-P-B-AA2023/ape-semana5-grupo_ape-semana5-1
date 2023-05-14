package semana5_grupo_problema1;
public class PrecioProducto {
    private double precio;
    private int cantidad;
    private double descuento;
    private double precioFinal;
    public PrecioProducto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void calcularDescuento() {
        if (this.precio >= 1000 && this.cantidad >= 10) {
            this.descuento = 0.1;
        } else {
            this.descuento = 0.05;
        }
    }
    public void calcularPrecioFinal() {
        this.precioFinal = (this.precio * this.cantidad ) - (this.precio * this.descuento);
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getDescuento() {
        return (descuento * 100);
    }
    public double getPrecioFinal() {
        return precioFinal;
    }

    public String toString(){
        String msj = String.format("""
                                   
                                   DATOS DE VENTA DEL PRODUCTO
                                   
                                   El precio del producto es: %.2f
                                   La cantidad del mismo es: %d 
                                   Descuento en Porcentaje: %.2f 
                                   PRECIO FINAL: %.2f
                                   """
                ,this.getPrecio()
                ,this.getCantidad()
                ,this.getDescuento()
                ,this.getPrecioFinal());
        return msj;
    }
    
    
}
