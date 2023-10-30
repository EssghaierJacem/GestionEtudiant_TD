package main;

import Entities.Ecole;
import Entities.Etudiant;
import Entities.EtudiantAlternance;
import Entities.EtudiantExisteException;

public class Main {
    public static void main(String[] args) throws EtudiantExisteException {

        Etudiant jacem = new Etudiant(1, "Jacem", "Sghaier", 16.1f);
        System.out.println(jacem.toString());
        System.out.println("___________");
        EtudiantAlternance jess = new EtudiantAlternance(2,"Jess", "HoHo",14.2f, 600);
        System.out.println(jess.toString());
        jess.ajouterUneAbsence();
        try {
            Ecole ecole1 = new Ecole("PrepSchool");
            ecole1.ajouterEtudiant(jacem);
            ecole1.ajouterEtudiant(jess);
        }catch (EtudiantExisteException e){
                System.out.println(e.getMessage());
        }


    }
}