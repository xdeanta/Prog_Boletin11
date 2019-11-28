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
public class Media {
    private String nom;
    private String autor;
    private int duradaSeguns;

    public Media(String nom, String autor, int duradaSeguns) {
        this.nom = nom;
        this.autor = autor;
        this.duradaSeguns = duradaSeguns;
    }

    public Media(String nom, String autor) {
        this(nom,autor,0);
    }

    public Media(String nom) {
        this(nom, null, 0);
    }

    public Media(){
        this(null,null,0);
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuradaSeguns() {
        return duradaSeguns;
    }

    public void setDuradaSeguns(int duradaSeguns) {
        this.duradaSeguns = duradaSeguns;
    }


}
