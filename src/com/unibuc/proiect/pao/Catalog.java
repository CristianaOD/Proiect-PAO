package com.unibuc.proiect.pao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog extends Clasa{
    private List<Materie> materii;
    private Map<Student, Map<Materie, Nota>> noteStudenti; // interogare 5

    /*private List<Clasa> clase;
    public void adaugaClasa(Clasa clasa) {
        clase.add(clasa);
    }*/

    public Catalog(int numar, String anScolar) {
        // constructorul clasei de baza trebuie sa fie apelat pentru a inițializa membrii moșteniti ai clasei
        super(numar, anScolar);
        this.materii = new ArrayList<>();
        this.noteStudenti = new HashMap<>();
        //this.clase = new ArrayList<>();
    }

    public List<Materie> getMaterii() {
        return materii;
    }

    public void setMaterii(List<Materie> materii) {
        this.materii = materii;
    }

    public Map<Student, Map<Materie, Nota>> getNoteStudenti() {
        return noteStudenti;
    }

    public void setNoteStudenti(Map<Student, Map<Materie, Nota>> noteStudenti) {
        this.noteStudenti = noteStudenti;
    }

    public void adaugaStudent(Student student1) {
    }

    // Metoda pentru adaugarea unei materii in catalog
    public void adaugaMaterie(Materie materie) {
        materii.add(materie);
    }

    public void adaugaNota(Student student, Materie materie, Nota nota) {
        // Verific daca exista deja o mapare pentru acest student
        if (!noteStudenti.containsKey(student)) {
            noteStudenti.put(student, new HashMap<>());
        }

        // adaug nota in maparea pentru studentul respectiv
        noteStudenti.get(student).put(materie, nota);

        System.out.println("Nota " + nota.getValoare() + " la materia " + materie.getNume() + " a fost atribuită studentului " + student.getNume());

    }

    //  returneaza o reprezentare sub forma de sir a obiectului de tip Catalog
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalog:\n");
        sb.append("Materii:\n");
        for (Materie materie : materii) {
            sb.append("- ").append(materie.getNume()).append("\n");
        }
        sb.append("Note:\n");
        for (Map.Entry<Student, Map<Materie, Nota>> entry : noteStudenti.entrySet()) {
            sb.append("Student: ").append(entry.getKey().getNume()).append("\n");
            sb.append("Note:\n");
            for (Map.Entry<Materie, Nota> noteEntry : entry.getValue().entrySet()) {
                sb.append("- Materie: ").append(noteEntry.getKey().getNume()).append(", Nota: ").append(noteEntry.getValue().getValoare()).append("\n");
            }
        }
        return sb.toString();
    }

    // Interogare 3 + 4
    public void afiseazaMaterii() {
        System.out.println("Materiile din catalogul clasei " + getNumar() + " sunt:");
        for (Materie materie : materii) {
            System.out.println(materie.getNume());
        }
    }
    // Interogare 5
    // Metoda pentru atribuirea unei note unui student la o materie
    public void atribuieNota(Student student, Materie materie, Nota nota) {
        if (!noteStudenti.containsKey(student)) {
            noteStudenti.put(student, new HashMap<>());
        }
        noteStudenti.get(student).put(materie, nota);
        System.out.println("Nota " + nota.getValoare() + " la materia " + materie.getNume() + " a fost atribuită studentului " + student.getNume());
    }

    // Interogare 10
    public void stergeMaterie(Materie materie) {
        materii.remove(materie);
        System.out.println("Materia " + materie.getNume() + " a fost ștearsă din catalog.");
    }

    // Interogare 11
    public void modificaNota(Student student, Materie materie, double nouaValoare) {
        if (noteStudenti.containsKey(student) && noteStudenti.get(student).containsKey(materie)) {
            Nota nota = noteStudenti.get(student).get(materie);
            nota.setValoare(nouaValoare);
            System.out.println("Nota pentru " + student.getNume() + " la materia " + materie.getNume() + " a fost modificată cu succes la " + nouaValoare);
        } else {
            System.out.println("Nu există o notă pentru " + student.getNume() + " la materia " + materie.getNume());
        }
    }




/*
    public void afiseazaStudentiInscrisi(int numarClasa) {
        for (Clasa clasa : clase) {
            if (clasa.getNumar() == numarClasa) {
                List<Student> studenti = clasa.getStudentiInscrisi();
                System.out.println("Studentii inscrisi in clasa " + numarClasa + ":");
                for (Student student : studenti) {
                    System.out.println(student.getNume());
                }
                return;
            }
        }
        System.out.println("Clasa cu numarul " + numarClasa + " nu a fost gasita.");
    }

 */

}
