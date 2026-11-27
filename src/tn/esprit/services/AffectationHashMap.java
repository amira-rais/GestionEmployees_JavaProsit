package tn.esprit.services;

import com.sun.source.tree.Tree;
import tn.esprit.entities.Departement;
import tn.esprit.entities.Employe;

import java.util.*;

public class AffectationHashMap {
    public Map <Employe, Departement> affectationMap = new HashMap <> ();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectationMap.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        if (affectationMap.isEmpty())
            System.out.println("Map vide.");

        for (Map.Entry<Employe, Departement> e : affectationMap.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }

    public void supprimerEmploye(Employe e) {
            affectationMap.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        affectationMap.remove(e,d);
    }

    public void afficherEmployes() {
        Set <Employe> employes = affectationMap.keySet();
        for (Employe e : employes)
            System.out.println(e);
    }

    public void afficherDepartements() {
        Collection <Departement> departements = affectationMap.values();
        for (Departement d : departements)
            System.out.println(d);
    }

    public boolean rechercherEmploye(Employe e) {
        Set <Employe> employes = affectationMap.keySet();
        return employes.contains(e);
    }

    public boolean rechercherDepartement(Departement d) {
        Collection <Departement> departements = affectationMap.values();
        return departements.contains(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        Map<Employe, Departement> treemap = new TreeMap<>(affectationMap);
        return (TreeMap)treemap;
    }
}
