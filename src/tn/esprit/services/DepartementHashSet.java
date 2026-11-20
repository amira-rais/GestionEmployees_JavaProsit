package tn.esprit.services;

import tn.esprit.entities.Departement;
import tn.esprit.interfaces.IDepartement;

import java.util.*;

public class DepartementHashSet implements IDepartement <Departement> {
    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département enregistré.");
            return;
        }
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        Set<Departement> sortedSet = new TreeSet<>(departements);
        System.out.println(sortedSet);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        Comparator <Departement> nomComparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };

        Comparator <Departement> nbEmployesComparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getNombreEmployes() - o2.getNombreEmployes();
            }
        };

        Set sortedDepartements = new TreeSet<>(nomComparator.thenComparing(nbEmployesComparator));
        sortedDepartements.addAll(departements);

        System.out.println(sortedDepartements);
    }
}
