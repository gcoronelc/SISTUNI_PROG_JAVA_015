package pe.maxjohan.importetienda.service;

public class ImporteService {
    public double PresioArticulo( String articulo ){
        double precio = 0;        
        if(articulo.equals("Cafe")){
            precio = 2.30;
        }else if(articulo.equals("Atun")){
            precio = 5.20;
        }else if(articulo.equals("Galleta")){
            precio = 0.70;
        }
        return precio;
    }
    
    public double PrecioTotal(double precio, double cantidad, double descuento){
        double Total;
        Total = (precio*cantidad)-descuento;
        return Total;
    }
}
