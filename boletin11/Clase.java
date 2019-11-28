/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author xdeantabelisario
 */
public class Clase {
    private int valorPrimario;
    private int valorSecundario;
    
    public Clase() {
        valorPrimario=5;
        valorSecundario=10;
    }
    
    public Clase(int vp) {
        valorPrimario=vp;
        valorSecundario=10;
    }
    
    public Clase(int vp1, int vp2) {
        valorPrimario=vp1;
        valorSecundario=vp2;
    }

    public int getValorPrimario() {
        return valorPrimario;
    }

    public int getValorSecundario() {
        return valorSecundario;
    }
    
}
