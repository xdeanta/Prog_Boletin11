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
public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date() {
        dia=mes=1;
        ano=2000;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia <= 31 && dia > 0){
            if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31){
                this.dia = dia;
            }else{
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    this.dia = dia;
                }
                if(mes == 2 && dia < 30){
                    if(ano % 400 == 0 || (ano % 100 != 0 && ano % 4 == 0)){
                        this.dia = dia;
                    }
                }
            }
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes <= 12){
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
