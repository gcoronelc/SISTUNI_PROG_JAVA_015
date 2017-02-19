package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class AbstractVenta {
  
  
  public double getIgv(){
    return 0.18;
  }
  
  public abstract double calcularVenta();
  
}
