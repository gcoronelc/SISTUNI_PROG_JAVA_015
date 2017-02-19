package pe.egcc.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }

  public static final String FACTURA = "Factura";
  public static final String BOLETA = "Boleta";
  
  public static String[] getTipos(){
    String[] tipos = {FACTURA, BOLETA};
    return tipos;
  }

  public static CompAbstract getcomp(String tipo) {
    CompAbstract comp = null;
    switch (tipo) {
      case FACTURA:
        comp = new FacturaService();
        break;
      case BOLETA:
        comp = new BoletaService();
        break;
    }
    return comp;
  }

}
