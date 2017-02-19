package pe.maxjohan.calculopromedio.service;

public class PromedioService {
    public double CalcularPromedioPracticas(int p1,int p2,int p3,int p4)
    {
    //declaracion de variables
        double PP;
        PP=(p1+p2+p3+p4)/4;
        return PP;
    }
    public double CalcularPromedioAlumnos(double PP,int EP,int EF)
    {
        //DECLARAR VARIABLES
        double PF;
        PF=PP*0.3+EP*0.3+EF*0.4;
        return PF;
        
    }
}
