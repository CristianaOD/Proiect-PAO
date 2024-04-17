package com.unibuc.proiect.pao;

public class Nota {
    private Materie materie;
    private double valoare;
    private boolean promovat;

    public Nota(Materie materie, double valoare, boolean promovat) {
        this.materie = materie;
        this.valoare = valoare;
        this.promovat = promovat;
    }

    public Materie getMaterie() {
        return materie;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public boolean isPromovat() {
        return promovat;
    }

    public void setPromovat(boolean promovat) {
        this.promovat = promovat;
    }

}
