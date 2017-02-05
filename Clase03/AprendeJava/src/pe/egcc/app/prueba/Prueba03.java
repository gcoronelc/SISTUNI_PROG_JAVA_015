package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase1;
import pe.egcc.app.model.Clase2;
import pe.egcc.app.model.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    Clase1 bean = new Clase2();
    System.out.println("8 + 6 = " + bean.sumar(8, 6));
    
    
    Clase2 obj = (Clase2) bean;
    System.out.println("8 + 6 = " + obj.sumar(8, 6));
    System.out.println("8 * 6 = " + obj.multiplicar(8, 6));
    
    
    if(bean instanceof Clase4){
      Clase4 clase4 = (Clase4) bean;
      System.out.println("Si hay compatibilidad.");
    } else {
      System.err.println("No hay compatibilidad entre bean y Clase4.");
    }
    
  }
  
}
