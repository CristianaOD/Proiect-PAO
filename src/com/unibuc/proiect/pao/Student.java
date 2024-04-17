package com.unibuc.proiect.pao;

// Clasa Student care mosteneste Persoana
public class Student extends Persoana{
    private int anStudiu;

    public Student(String nume, int varsta, int anStudiu) {
        super(nume, varsta);
        this.anStudiu = anStudiu;
    }

    public int getAnStudiu() {
        return anStudiu;
    }
}
