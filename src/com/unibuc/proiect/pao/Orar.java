package com.unibuc.proiect.pao;

import java.util.ArrayList;
import java.util.List;

public class Orar {
    private String clasa;
    private String semestru;
    private List<String> materii;
    private List<String> profesori;
    private List<String> ore;
    private List<String> zile;

    // Constructor
    public Orar(String clasa, String semestru) {
        this.clasa = clasa;
        this.semestru = semestru;
        this.materii = new ArrayList<>();
        this.profesori = new ArrayList<>();
        this.ore = new ArrayList<>();
        this.zile = new ArrayList<>();
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public String getSemestru() {
        return semestru;
    }

    public void setSemestru(String semestru) {
        this.semestru = semestru;
    }

    // Interogare 7
    // Metoda pentru adăugarea unei materii la orar
    public void adaugaMaterie(String materie, String profesor, String ora, String zi) {
        materii.add(materie);
        profesori.add(profesor);
        ore.add(ora);
        zile.add(zi);
    }

    public void afiseazaOrarComplet() {
        System.out.println("Orar pentru clasa " + clasa + " în semestrul " + semestru + ":");
        for (int i = 0; i < materii.size(); i++) {
            System.out.println("Materie: " + materii.get(i) + ", Profesor: " + profesori.get(i) + ", Ora: " + ore.get(i));
        }
    }

    public void afiseazaOrar(String zi, String ora) {
        System.out.println("Orar pentru clasa " + clasa + " în semestrul " + semestru + ", pentru ziua " + zi + " și ora " + ora + ":");
        for (int i = 0; i < materii.size(); i++) {
            if (ore.get(i).equals(ora)) {
                System.out.println("Materie: " + materii.get(i) + ", Profesor: " + profesori.get(i) + ", Ora: " + ore.get(i));
            }
        }
    }

}
