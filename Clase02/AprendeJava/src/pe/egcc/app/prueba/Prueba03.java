package pe.egcc.app.prueba;

import pe.egcc.app.model.Venta;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    System.out.println("IGV: " + Venta.igv);
    
    Venta v1 = new Venta();
    v1.cliente = "Gustavo";
    v1.importe = 5000.0;
    v1.igv = 0.17;
    
    Venta v2 = new Venta();
    v2.cliente = "Claudia";
    v2.importe = 6000.0;
    v2.igv = 0.20;
    
    
    mostrar(v1);
    mostrar(v2);
    
    
    
    
  }

  private static void mostrar(Venta v) {
    System.out.println("-------------------");
    System.out.println("Cliente: " + v.cliente);
    System.out.println("Importe: " + v.importe);
    System.out.println("IVG: " + v.igv);
  }
  
}
