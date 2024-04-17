package com.unibuc.proiect.pao;
import java.util.List;
// Clasa de serviciu pentru gestionarea studentilor

public class StudentService {
    private List<Student> studenti;

    public StudentService(List<Student> studenti) {
        this.studenti = studenti;
    }
    // Interogare 1: adaugarea unui nou student
    public void adaugaStudent(Student student) {
        studenti.add(student);
        System.out.println("Student adăugat cu succes: " + student.getNume());
    }

    public void afiseazaStudenti() {
        System.out.println("Lista studentilor:");
        for (Student student : studenti) {
            System.out.println("Nume: " + student.getNume() + ", Varsta: " + student.getVarsta() + ", An studiu: " + student.getAnStudiu());
        }
    }
    // Interogare 12: ștergerea unui student din sistem
    public void stergeStudent(Student student) {
        if (studenti.contains(student)) {
            studenti.remove(student);
            System.out.println("Studentul " + student.getNume() + " a fost șters din sistem.");
        } else {
            System.out.println("Studentul " + student.getNume() + " nu există în sistem.");
        }
    }

    // Interogare 13
    public void modificaVarstaStudent(Student student, int varstaNoua) {
        if (studenti.contains(student)) {
            student.setVarsta(varstaNoua);
            System.out.println("Varsta studentului " + student.getNume() + " a fost actualizată cu succes la " + varstaNoua + " ani.");
        } else {
            System.out.println("Studentul " + student.getNume() + " nu există în sistem.");
        }
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

}
