package com.unibuc.proiect.pao;

public class Profesor extends Persoana {
    private String specializare;
    private int vechime;
    private int idClasaAsociata;

    public Profesor(String nume, int varsta, String specializare, int vechime) {
        super(nume, varsta);
        this.specializare = specializare;
        this.vechime = vechime;
    }
    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public int getIdClasaAsociata() {
        return idClasaAsociata;
    }

    public void setIdClasaAsociata(int idClasaAsociata) {
        this.idClasaAsociata = idClasaAsociata;
    }
}
