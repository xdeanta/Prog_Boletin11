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
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Clase A =  new Clase ( ) ;
       Clase B =  new Clase ( 20 ) ;
       Clase C =  new Clase ( 20 , 40 ) ;
       System . out . println ( "El objeto _a: _ contiene:"  + A.getValorPrimario()  +  ","  + A.getValorSecundario() ) ;
       System . out . println ( "El objeto _a: _ contiene:"  + B.getValorPrimario()  +  ","  + B.getValorSecundario() ) ;
       System . out . println ( "El objeto _a: _ contiene:"  + C.getValorPrimario()  +  ","  + C.getValorSecundario() ) ;
       
       
       Media D = new Media();
       System.out.println("Media: " + D.getNom() +" - "+ D.getAutor() +"\nDuracion: "+ D.getDuradaSeguns() + " seg");
       Media E = new Media("hola");
       System.out.println("Media: " + E.getNom() +" - "+ E.getAutor() +"\nDuracion:"+ E.getDuradaSeguns() + " seg");
       //Media F = new Media("Ella" , "No te quiere", 120);
       E.setAutor("No te quiere");
       E.setNom("Ella");
       E.setDuradaSeguns(120);
       System.out.println("Media: " + E.getNom() +" - "+ E.getAutor() +"\nDuracion: "+ E.getDuradaSeguns() + " seg");
       
       
       Date G = new Date();
       System.out.println(G.getDia() +"/"+ G.getMes() +"/"+ G.getAno());
       G.setAno(2020);
       G.setMes(2);
       G.setDia(29);
       System.out.println(G.getDia() +"/"+ G.getMes() +"/"+ G.getAno());
       }
               
}
    
