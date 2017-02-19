package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    // Dato
    String tipo = CompFactory.FACTURA;
    double total = 1000.0;
    // Proceso
    Item[] repo = CompFactory.getcomp(tipo).procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.getConcepto() + " => " + i.getValor());
    }
  }
}
