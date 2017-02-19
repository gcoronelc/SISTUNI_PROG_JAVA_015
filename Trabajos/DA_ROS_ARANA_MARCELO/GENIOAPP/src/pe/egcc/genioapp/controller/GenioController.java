package pe.egcc.genioapp.controller;

import pe.egcc.genioapp.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 */
public class GenioController {

  public long factorial(int num) {
    return MyMath.factorial(num);
  }
  public String fibonacci_serie(int num) {
    return MyMath.fibonacci_serie(num);
  }
  public boolean primo(int num) {
    return MyMath.primo(num);
  }
  public int mcd(int a,int b) {
    return MyMath.mcd(a,b);
  }
  public int mcm(int a,int b) {
    return MyMath.mcm(a,b);
  }
  
}
