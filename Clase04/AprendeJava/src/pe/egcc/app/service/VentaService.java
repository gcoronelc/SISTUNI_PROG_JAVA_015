
package pe.egcc.app.service;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaService extends AbstractVenta{

  @Override
  public double calcularVenta() {
    System.out.println("IGV: " + getIgv());
    System.out.println("Venta ok");
    return 0;
  }
  
}
