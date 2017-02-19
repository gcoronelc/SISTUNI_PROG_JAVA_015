package pe.egcc.estadistica.controller;

import pe.egcc.estadistica.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 */
public class EstadisticaController {

  public String moda(int numero[]){
    return MyMath.moda(numero);
  }
  public double mediana(int numero[]){
    return MyMath.mediana(numero);
  }
  public double media(int num[]) {
    return MyMath.media(num);
  }
  
}
