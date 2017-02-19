package pe.maxjohan.intesfinanciera.service;
/**
 *
 * @author DELL
 */
public class InteresService {
    
    public double CalcularImporte( double CapitalInicial, double InteresMensual, int n){
        double Importe ;
        Importe = CapitalInicial*Math.pow( 1 + InteresMensual, n);
        return Importe;
    }
    
}
