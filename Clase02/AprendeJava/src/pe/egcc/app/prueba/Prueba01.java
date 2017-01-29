package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    Producto bean = new Producto();
    
    mostrar(bean);
    
    bean.setNombre("Televisor");
    bean.setPrecio(2580.0);
    bean.setStock(1000);
    bean.setActivo(true);
    
    mostrar(bean);
    
  }

  private static void mostrar(Producto bean) {
    System.out.println("-----------------------");
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
    System.out.println("Activo: " + bean.isActivo());
  
  }
  
}
