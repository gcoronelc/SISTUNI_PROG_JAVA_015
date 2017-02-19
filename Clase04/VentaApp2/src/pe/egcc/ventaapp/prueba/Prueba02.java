package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.impl.BoletaService;
import pe.egcc.ventaapp.service.spec.CompSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    // Dato
    double total = 1000.0;
    // Proceso
    CompSpec comp = new BoletaService();
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.getConcepto() + " => " + i.getValor());
    }
  }
}
