package com.unibuc.proiect.pao;

import java.util.ArrayList;
import java.util.List;

public class Sesiune {
    private static List<Sesiune> sesiuni = new ArrayList<>();
    private String tipSesiune;
    private String perioada;
    private int an;

    public Sesiune(String tipSesiune, String perioada, int an) {
        this.tipSesiune = tipSesiune;
        this.tipSesiune = tipSesiune;
        this.perioada = perioada;
        this.an = an;
    }

    public String getTipSesiune() {
        return tipSesiune;
    }

    public void setTipSesiune(String tipSesiune) {
        this.tipSesiune = tipSesiune;
    }

    public String getPerioada() {
        return perioada;
    }

    public void setPerioada(String perioada) {
        this.perioada = perioada;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public static void adaugaSesiune(Sesiune sesiune) {
        sesiuni.add(sesiune);
    }

    public static List<Sesiune> getSesiuni() {
        return sesiuni;
    }
}
