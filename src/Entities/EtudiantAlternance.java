package Entities;

public class EtudiantAlternance extends Etudiant{
    private int salaire;

    public EtudiantAlternance(int id, String nom, String prenom, float moyenne, int salaire) {
        super(id, nom, prenom, moyenne);
        this.salaire=salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence()
    {
        this.setSalaire(this.getSalaire()-50);
    }

    public String toString() {
        return "Id : " + super.getId() + "\nNom : " + super.getNom()+ "\nPrenom: " + super.getPrenom() +"\nSalaire :" + super.getMoyenne() + "\nSalaire : " + salaire;
    }
}
