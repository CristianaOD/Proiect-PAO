package com.unibuc.proiect.pao;

import java.util.ArrayList;
import java.util.List;

public class ProfesorService {
    private List<Profesor> profesori;

    public ProfesorService() {
        this.profesori = new ArrayList<>();
    }

    public void adaugaProfesor(Profesor profesor) {
        profesori.add(profesor);
    }

    public List<Profesor> getProfesori() {
        return profesori;
    }

}
