package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) throws Exception {
    Producto bean;
    
    bean = new Producto();
    System.out.println(bean);
    
    bean = (Producto) Class.forName("pe.egcc.app.model.Producto").newInstance();
    System.out.println(bean);
  
    bean = (Producto) Class.forName(Producto.class.getName()).newInstance();
    System.out.println(bean);
  
  
  }
  
}
