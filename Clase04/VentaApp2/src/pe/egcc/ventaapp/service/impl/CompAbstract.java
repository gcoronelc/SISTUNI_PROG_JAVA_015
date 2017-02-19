package pe.egcc.ventaapp.service.impl;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.spec.CompSpec;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class CompAbstract implements CompSpec{
  
  protected final double IGV = 0.18;
  protected final double SERVICIO = 0.10;
  
  
  @Override
  public abstract Item[] procesar(double total);
  
  
  protected double redondear(double valor){
    valor *=  100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }
  
}
