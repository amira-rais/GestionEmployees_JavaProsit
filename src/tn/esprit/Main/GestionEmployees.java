package tn.esprit.Main;

import tn.esprit.entities.Departement;
import tn.esprit.entities.Employe;
import tn.esprit.services.AffectationHashMap;

public class GestionEmployees {
    public static void main (String[] args) {
        AffectationHashMap map = new AffectationHashMap();

        Employe e1 = new Employe(3, "Ali", "Ali", "Informatique", 2);
        Employe e2 = new Employe(1, "Ahmed", "Ahmed", "RH", 1);
        Employe e3 = new Employe(2, "Mohammed", "Mohammed", "Finance", 3);

        Departement d1 = new Departement(10, "Informatique", 15);
        Departement d2 = new Departement(20, "RH", 5);
        Departement d3 = new Departement(30, "Finance", 8);

        map.ajouterEmployeDepartement(e1, d1);
        map.ajouterEmployeDepartement(e2, d2);
        map.ajouterEmployeDepartement(e3, d3);

        map.afficherEmployesEtDepartements();

        map.ajouterEmployeDepartement(e3, d2);
    }
}
