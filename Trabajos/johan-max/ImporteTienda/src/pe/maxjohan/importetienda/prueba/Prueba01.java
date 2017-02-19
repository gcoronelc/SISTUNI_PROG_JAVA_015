package pe.maxjohan.importetienda.prueba;

import pe.maxjohan.importetienda.service.ImporteService;

public class Prueba01 {
    public static void main(String[] args) {
        //variables
        String articulo;
        articulo = "Galleta";
        double cantidad = 2.0, descuento = 0;
        ImporteService Importe = new ImporteService();
        double precio = Importe.PresioArticulo(articulo);
        double Total = Importe.PrecioTotal(precio, cantidad, descuento);
        
        System.out.println("" + Total);       
    }
}
