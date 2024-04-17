package com.unibuc.proiect.pao;

import java.util.ArrayList;
import java.util.List;

public class Clasa {
    private int numar;
    private String anScolar;
    private List<Student> studentiInscrisi;
    private List<Profesor> profesoriAsociati;

    public Clasa(int numar, String anScolar) {
        this.numar = numar;
        this.anScolar = anScolar;
        this.studentiInscrisi = new ArrayList<>();
        this.profesoriAsociati = new ArrayList<>();
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getAnScolar() {
        return anScolar;
    }

    public List<Student> getStudentiInscrisi() {
        return studentiInscrisi;
    }

    public void setStudentiInscrisi(List<Student> studentiInscrisi) {
        this.studentiInscrisi = studentiInscrisi;
    }

    public void setAnScolar(String anScolar) {
        this.anScolar = anScolar;
    }
    //Interogarea 2: afisarea listei de studenti inscridi intr-o clasa
    public void adaugaStudent(Student student) {
        studentiInscrisi.add(student);
    }

    public void afiseazaStudenti() {
        System.out.println("Lista de studenți înscriși în clasa " + numar + ":");
        for (Student student : studentiInscrisi) {
            System.out.println(student.getNume());
        }
    }

    // Profesori asociati unei clase
    public List<Profesor> getProfesoriAsociati() {
        return profesoriAsociati;
    }

    public void setProfesoriAsociati(List<Profesor> profesoriAsociati) {
        this.profesoriAsociati = profesoriAsociati;
    }

    public void adaugaProfesor(Profesor profesor) {
        profesoriAsociati.add(profesor);
    }

}

