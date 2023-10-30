package Entities;

public class Etudiant3eme extends Etudiant{
    private String branche;

    public Etudiant3eme(int id, String nom, String prenom, float moyenne,String branche) {
        super(id, nom, prenom, moyenne);
        this.branche=branche;
    }
    @Override
    public void ajouterUneAbsence() {
        this.setMoyenne(this.getMoyenne()-50);
    }


    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }


}
