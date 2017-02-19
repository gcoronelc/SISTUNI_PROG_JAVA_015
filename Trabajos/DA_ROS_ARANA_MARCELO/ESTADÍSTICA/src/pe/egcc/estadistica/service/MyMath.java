package pe.egcc.estadistica.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }

    public static String moda(int numero[])
    {
            int frecuencia_max=0;
            int tamanio=numero.length;
            String moda="";
            int arregloOrdenado[]=null;
            int[] frecuencia = new int[tamanio];
         
            for(int j=0;j<tamanio;j++){
                    frecuencia[j]=0;
            }
            
            for(int j=0;j<tamanio;j++){
                for(int i=0;i<tamanio;i++){
                    if(numero[j]==numero[i]){
                        frecuencia[j]++;
                    }
                }
            }
            
            for(int j=0;j<tamanio;j++)
                if(frecuencia[j]>frecuencia_max)
                {
                    frecuencia_max=frecuencia[j];
                }
            
            
            for(int j=0;j<tamanio;j++){
                if((frecuencia_max==frecuencia[j])&&(buscarArregloPos(numero,numero[j],j)==false)){
                    if(moda=="")
                        moda+=numero[j];
                    else moda+="  ,  "+numero[j];
                }
            }
            
            return moda;
         
    }
 
    public static double mediana(int numero[])
    {
        int tamanio=numero.length;
        int[] arregloOrdenado = new int[tamanio];
        double suma;
        double mediana;
        arregloOrdenado=ordenaArreglo(numero);
        if(numero.length%2==0){
            suma=arregloOrdenado[(tamanio)/2]+arregloOrdenado[((tamanio)/2)-1];
            mediana=suma/2;
        }
        else
            mediana=arregloOrdenado[(tamanio)/2];         
        return mediana;
    }
     
    public static double media(int numero[])
    {
        double media,sum=0,tamanio=numero.length;
        for(int i=0;i<tamanio;i++)
        {
            sum=sum+numero[i];
        }
        media=sum/tamanio;
        return media;
    }
    
    public static int[] ordenaArreglo(int arreglo[])
    {
 
        int k=0;
        for(int i=1;i<arreglo.length;i++)
        {
            for(int j=0;j<arreglo.length-i;j++)
            {
                if(arreglo[j]>arreglo[j+1])
                {
                    k=arreglo[j+1]; 
                    arreglo[j+1]=arreglo[j];
                    arreglo[j]=k;
                }
            }
        }
        return arreglo;     
     
    }
    
    public static boolean buscarArregloPos(int arreglo[], int numero, int tamanio)
    {
            boolean respuesta=false;
            for(int j=0;j<tamanio;j++)
            {
                if(arreglo[j]==numero)
                {
                    respuesta=true;
                }
            }
            return respuesta;     
     
    }

}
