
package pck_clases;

public class cls_Persona {
    
    protected String DNI, apellidos, nombres;
    protected boolean Estado_civil;
    protected int N_hijos;

    public cls_Persona() {
    }

    public cls_Persona(int N_hijos) {
        this.N_hijos = N_hijos;
    }

    public int getN_hijos() {
        return N_hijos;
    }

    public void setN_hijos(int pN_hijos) {
        this.N_hijos = pN_hijos;
    }    

}
