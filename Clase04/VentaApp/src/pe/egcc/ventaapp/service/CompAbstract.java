package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class CompAbstract {
  
  protected final double IGV = 0.18;
  protected final double SERVICIO = 0.10;
  
  
  public abstract Item[] procesar(double total);
  
  protected double redondear(double valor){
    valor *=  100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }
  
}
