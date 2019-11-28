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
public class NumeroComplejo {
    private double real;
    private double imaginario;
    public static NumeroComplejo ZERO = new NumeroComplejo();

    public NumeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    public NumeroComplejo(){
        this(0d,0d);
    }
            
    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }
    
    public NumeroComplejo add(NumeroComplejo a){
        NumeroComplejo res=new NumeroComplejo(real+a.getReal(),imaginario+a.getImaginario());
        return res;
    }
    
    @Override
    public String toString(){
        return ("Parte Real: " + real + " Parte Imaginaria: " +imaginario);
    }
}
