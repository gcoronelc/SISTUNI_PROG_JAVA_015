package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class CompController {

  public String[] getTipos() {
    return CompFactory.getTipos();
  }
  
  public Item[] procesar(String tipo, double total){
    return CompFactory.getcomp(tipo).procesar(total);
  }
  
}
