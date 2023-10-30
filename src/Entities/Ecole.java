package Entities;

import java.util.zip.ZipFile;

public class Ecole {
    private String nom;
    private Etudiant[] etudiants = new Etudiant[500];
    private int nombreEtudiants;

    public Ecole(String nom) {
        this.nom = nom;
    }

    public void ajouterEtudiant(Etudiant etudiant) throws EtudiantExisteException {
        if (nombreEtudiants < etudiants.length && rechercherEtudiant(etudiant) == -1) {
            etudiants[nombreEtudiants] = etudiant;
            nombreEtudiants++;
        } else {
            throw new EtudiantExisteException("The school is full ");
        }
    }

    public int rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < nombreEtudiants; i++) {
            if (etudiants[i].equals(e)) {
                return 1;
            }
        }
        return -1;
    }

    private float getMoyenneDes3A() {
        float sum = 0;
        int k = 0;
        for (int i = 0; i < nombreEtudiants; i++) {
            if (etudiants[i] instanceof Etudiant3eme) {
                sum += etudiants[i].getMoyenne();
                k++;
            }
        }
        return sum / k;
    }

    private float moyenneSalaireAlternants(){
        float sum = 0;
        int k = 0;
        for (int i = 0; i < nombreEtudiants; i++) {
            if (etudiants[i] instanceof EtudiantAlternance) {
                sum += etudiants[i].getMoyenne();
                k++;
            }
        }
       return sum / k ;

    }
    public void changerEcole(Etudiant etudiant,Ecole e){

    }

    @Override
    public String toString() {
        return "Nom : " + nom + "\nNombreEtudiant : " +nombreEtudiants ;
    }
}
