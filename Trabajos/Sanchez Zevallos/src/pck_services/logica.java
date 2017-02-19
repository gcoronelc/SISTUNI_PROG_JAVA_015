/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pck_services;

import pck_clases.cls_trabajador;

/**
 *
 * @author Darato
 */
public class logica extends cls_trabajador{

    /**
     * @param args the command line arguments
     */
    
    public float Nhijos (){
        float bonif_hijos;
        
        bonif_hijos = 0.0f;
        if ((super.getN_hijos() >= 1) && (super.getN_hijos() <= 2)){
            bonif_hijos = this.getSuel_basi() * 0.01f;
        }
        else if ((super.getN_hijos() >= 3) && (super.getN_hijos() <= 4)){
            bonif_hijos = this.getSuel_basi() * 0.015f;
        }
        else if (super.getN_hijos() >= 5){
            bonif_hijos = this.getSuel_basi() * 0.02f;
        }        
        return bonif_hijos;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
