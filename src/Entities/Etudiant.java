package Entities;

import java.util.Objects;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    protected float moyenne;
    private String ecoleAc;

    public Etudiant(int id, String nom, String prenom, float moyenne){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id == etudiant.id && Float.compare(etudiant.moyenne, moyenne) == 0 && Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom);
    }
    @Override
    public String toString() {
        return "Id : " + id + "\nNom : " + nom+ "\nPrenom: " + prenom +"\nMoyenne :" + moyenne;
    }
    public void ajouterUneAbsence(){


    }

}
