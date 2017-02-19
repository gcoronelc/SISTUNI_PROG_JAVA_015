package pe.maxjohan.calculopromedio.prueba;
import pe.maxjohan.calculopromedio.service.PromedioService;
public class Prueba01 {
    public static void main(String[] args) {
        int p1 = 13, p2=15,p3=11,p4=12, EP=15, EF=18;
        
        
        PromedioService Promedio = new PromedioService();
        double PP= Promedio.CalcularPromedioPracticas(p1, p2, p3, p4);
        double PF= Promedio.CalcularPromedioAlumnos(PP, EP, EF);
        //prueba
        System.out.println("" + PF);
        
    }
}
