package pe.egcc.ventaapp.service.spec;

import pe.egcc.ventaapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public interface CompSpec {

  Item[] procesar(double total);
  
}
