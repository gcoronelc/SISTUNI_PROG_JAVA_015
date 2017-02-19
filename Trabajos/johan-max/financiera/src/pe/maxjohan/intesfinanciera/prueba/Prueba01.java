package pe.maxjohan.intesfinanciera.prueba;

import pe.maxjohan.intesfinanciera.service.InteresService;

public class Prueba01 {
    public static void main(String[] args) {
        //datos
        double CapitalInicial = 100;
        double InteresMenssual = 0.1;
        int n = 12;
        
        InteresService service;
        service = new InteresService();
        double Importe = service.CalcularImporte(CapitalInicial, InteresMenssual, n);
        
        //prueba
        System.out.println("Importe = " + Importe);
    }
}
