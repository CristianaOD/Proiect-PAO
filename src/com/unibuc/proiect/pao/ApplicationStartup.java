package com.unibuc.proiect.pao;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ApplicationStartup {
    public static void main(String[] args) {

        // Crearea unei liste de studenti
        List<Student> studenti = new ArrayList<>();

        // Crearea unei liste de profesori
        List<Profesor> profesori = new ArrayList<>();

        // Crearea serviciului pentru gestionarea studentilor
        StudentService studentService = new StudentService(studenti);

        // Creare serviciu pentru gestionarea profesorilor
        ProfesorService profesorService = new ProfesorService();

        // Interogare 1: adaugarea unui nou student; Creare studenti
        Student student1 = new Student("Ion", 16, 2);
        Student student2 = new Student("Maria", 17, 2);
        Student student3 = new Student("Alexandru", 16, 2);
        Student student4 = new Student("Ana", 15, 2);

        Student student5 = new Student("Bianca", 14, 0);
        Student student6 = new Student("Dan", 17, 3);
        Student student7 = new Student("George", 18, 4);

        // Adaugare studenti in lista
        System.out.println("Interogare 1: Adaugarea unui nou student in sistem ");
        studentService.adaugaStudent(student1);
        studentService.adaugaStudent(student2);
        studentService.adaugaStudent(student3);
        studentService.adaugaStudent(student4);
        studentService.adaugaStudent(student5);
        studentService.adaugaStudent(student6);
        studentService.adaugaStudent(student7);

        // Afisare studenti
        studentService.afiseazaStudenti();

        // Creare profesori
        Profesor profesor1 = new Profesor("Profesor A", 40, "Matematica", 10);
        Profesor profesor2 = new Profesor("Profesor B", 45, "Informatica", 8);
        Profesor profesor3 = new Profesor("Profesor C", 50, "Fizica", 6);
        Profesor profesor4 = new Profesor("Profesor D", 27, "Biologie", 2);
        Profesor profesor5 = new Profesor("Profesor E", 39, "Geografie", 11);

        // Creare materii
        Materie matematica = new Materie("Matematica");
        Materie informatica = new Materie("Informatica");
        Materie fizica = new Materie("Fizica");
        Materie biologie = new Materie("Biologie");

        // Creare note
        Nota nota1 = new Nota(matematica, 9.5, true);
        Nota nota2 = new Nota(informatica, 8.7, true);
        Nota nota3 = new Nota(fizica, 7.8, true);
        Nota nota4 = new Nota(fizica, 4.3, false);
        Nota nota5 = new Nota(matematica, 6.8, true);
        Nota nota6 = new Nota(informatica, 7.9, true);

        // Creare catalog
        Catalog catalog0 = new Catalog(9, "2023-2024");
        Catalog catalog1 = new Catalog(10, "2023-2024");
        Catalog catalog2 = new Catalog(11, "2023-2024");
        Catalog catalog3 = new Catalog(12, "2023-2024");

        // Adaugare studenti in catalog
        catalog1.adaugaStudent(student1);
        catalog1.adaugaStudent(student2);
        catalog1.adaugaStudent(student3);
        catalog1.adaugaStudent(student4);
        catalog2.adaugaStudent(student6);
        catalog0.adaugaStudent(student5);
        catalog3.adaugaStudent(student7);

        // Adaugare materii in catalog
        catalog1.adaugaMaterie(matematica);
        catalog1.adaugaMaterie(informatica);
        catalog1.adaugaMaterie(fizica);
        catalog1.adaugaMaterie(biologie);

        catalog2.adaugaMaterie(fizica);

        catalog0.adaugaMaterie(matematica);
        catalog0.adaugaMaterie(informatica);
        catalog0.adaugaMaterie(fizica);

        catalog3.adaugaMaterie(fizica);
        catalog3.adaugaMaterie(biologie);
        catalog3.adaugaMaterie(fizica);
/*
        // Adaugare note in catalog pentru fiecare student si materie
        catalog1.adaugaNota(student1, matematica, nota1);
        catalog1.adaugaNota(student2, informatica, nota2);
        catalog1.adaugaNota(student3, fizica, nota3);
        catalog1.adaugaNota(student4, fizica, nota4);

        catalog0.adaugaNota(student5, matematica, nota5);
        catalog2.adaugaNota(student6, informatica, nota6);
        catalog3.adaugaNota(student7, informatica, nota6);
*/
        // Afisare catalog
        // System.out.println(catalog1);

        // Interogare 2: afisarea listei intr-o clasa; Crearea unei clase
        Clasa clasa10 = new Clasa(10,"2023-2024");
        Clasa clasa11 = new Clasa(11,"2023-2024");
        Clasa clasa12 = new Clasa(12,"2023-2024");
        Clasa clasa9 = new Clasa(9,"2023-2024");

        clasa10.adaugaStudent(student1);
        clasa10.adaugaStudent(student2);
        clasa10.adaugaStudent(student3);
        clasa10.adaugaStudent(student4);

        clasa9.adaugaStudent(student5);
        clasa11.adaugaStudent(student6);
        clasa12.adaugaStudent(student7);

        // Afisarea listei de studenti inscrisi în clasa
        System.out.println("Interogare 2: Afisarea listei de studenți inscrisi intr-o clasa");
        clasa10.afiseazaStudenti();
        clasa11.afiseazaStudenti();

        //Interogare 3: Adaugarea unei noi materii in catalog
        System.out.println("Interogare 3: Adaugarea unei noi materii in catalog");
        Materie geografie = new Materie("Geografie");
        catalog1.adaugaMaterie(geografie);
        System.out.println(catalog1);

        // Interogare 4
        // Afisarea listei de materii din catalog
        System.out.println("Interogare 4:  Afisarea listei de materii disponibile");
        catalog1.afiseazaMaterii();
        catalog2.afiseazaMaterii();
        catalog3.afiseazaMaterii();
        catalog0.afiseazaMaterii();

        // Interogare 5
        // Atribuirea notei studentului la o materie
        System.out.println("Interogare 5:  Atribuirea unei note unui student la o materie");
        catalog1.atribuieNota(student1, catalog1.getMaterii().get(0), nota1);
        catalog1.atribuieNota(student2, catalog1.getMaterii().get(2), nota2);
        catalog1.atribuieNota(student2, catalog1.getMaterii().get(3), nota4);
        catalog1.atribuieNota(student3, catalog1.getMaterii().get(3), nota3);
        catalog1.atribuieNota(student4, catalog1.getMaterii().get(3), nota3);

        /*
        // Crearea unei liste cu notele pentru materia fizica
        List<Nota> noteFizica = new ArrayList<>();
        noteFizica.add(new Nota(fizica, 7.5, true));
        noteFizica.add(new Nota(fizica, 8.0, true));
        noteFizica.add(new Nota(fizica, 9.2, true));

        // Obținerea listei de studenți din clasa a 11-a
        List<Student> studentiClasa11 = catalog.getStudentiInscrisi();

        // Atribuirea notelor pentru materia fizica fiecarui student
        for (Student student : studentiClasa11) {
            for (Nota nota : noteFizica) {
                catalog.atribuieNota(student, fizica, nota);
            }
        }
*/
        // Afisare studenti inscrisi in clasa 10A
        //catalog.afiseazaStudentiInscrisi(10);

        System.out.println("Interogare 6: Vizualizarea catalogului complet cu notele studenților");
        System.out.println(catalog1);

        // Interogare 7: Crearea unui nou orar pentru o clasa si un anumit semestru
        // Crearea unui nou orar pentru clasa a X-a in semestrul 1
        Orar orarClasa10Semestrul1 = new Orar( "a X-a", "1");

        // Adaugarea materiilor in orar
        orarClasa10Semestrul1.adaugaMaterie("Matematica", "Profesor A", "8:00", "Luni");
        orarClasa10Semestrul1.adaugaMaterie("Informatica", "Profesor B", "10:00", "Luni");
        orarClasa10Semestrul1.adaugaMaterie("Fizica", "Profesor C", "12:00", "Marti");
        orarClasa10Semestrul1.adaugaMaterie("Biologie", "Profesor D", "10:00", "Joi");
        orarClasa10Semestrul1.adaugaMaterie("Geografie", "Profesor E", "12:00", "Vineri");

        // Afisarea orarului
        System.out.println("Interogare 7: Crearea unui orar pentru o clasa si un anumit semestru");
        orarClasa10Semestrul1.afiseazaOrarComplet();

        // Interogare 8
        System.out.println("Interogare 8: Afisarea orarului unei clase pentru o anumita zi si o anumita ora");
        orarClasa10Semestrul1.afiseazaOrar("Luni", "8:00");

        // Interogare 9
        profesorService.adaugaProfesor(profesor1);
        profesorService.adaugaProfesor(profesor2);
        profesorService.adaugaProfesor(profesor3);
        profesorService.adaugaProfesor(profesor4);
        profesorService.adaugaProfesor(profesor5);

        // Afisare lista de profesori
        System.out.println("Interogare 9: Adaugarea unui nou profesor in sistem");
        List<Profesor> listaProfesori = profesorService.getProfesori();
        for (Profesor profesor : listaProfesori) {
            System.out.println(profesor.getNume() + " - " + profesor.getSpecializare());
        }

        // Interogare 10
        // Materie altaMaterie = catalog.getMaterii().get(0);
        System.out.println("Interogare 10: Stergerea unei materii din catalog");
        catalog1.stergeMaterie(geografie);
        catalog1.afiseazaMaterii();

        // Interogare 11
        //System.out.println(catalog);
        System.out.println("Interogare 11: Modificarea notei unui student la o anumita materie");
        double nouaValoare = 10;
        catalog1.modificaNota(student1, matematica, nouaValoare);
        System.out.println(catalog1);

        // Interogare 12: stergerea unui student din sistem
        //studentService.afiseazaStudenti();
        System.out.println("Interogare 12: Stergerea unui student din sistem");
        Student studentDeSters = studentService.getStudenti().get(3);
        studentService.stergeStudent(studentDeSters);
        studentService.afiseazaStudenti();

        // Interogare 13: modificarea varstei unui student
        // Student studentPentruActualizare = studentService.getStudenti().get(0);
        System.out.println("Interogare 13: Modificarea varstei unui student");
        //studentService.afiseazaStudenti();
        int varstaNoua = 15; // Varsta noua pentru student
        studentService.modificaVarstaStudent(student3, varstaNoua);

        // Sortarea profesorilor după vechime
        profesori.add(profesor1);
        profesori.add(profesor2);
        profesori.add(profesor3);
        profesori.add(profesor4);
        profesori.add(profesor5);

        Collections.sort(profesori, Comparator.comparingInt(Profesor::getVechime));

        System.out.println("Interogare 14: Sortarea profesorilor după vechime");
        // Afișarea profesorilor sortați
        for (Profesor profesor : profesori) {
            System.out.println(profesor.getNume() + " - Vechime: " + profesor.getVechime() + " ani");
        }

        // Adaugarea unei noi sesiuni in sistem
        Sesiune sesiune1 = new Sesiune("Sesiune de examene", "Iunie", 2024);

        // Adaugarea sesiunii in sistem
        Sesiune.adaugaSesiune(sesiune1);

        // Interogare 16: Afisarea listei de sesiuni disponibile
        System.out.println("Interogare 16: Afisarea listei de sesiuni disponibile");
        List<Sesiune> sesiuniDisponibile = Sesiune.getSesiuni();
        System.out.println("Sesiunile disponibile în sistem sunt:");
        for (Sesiune sesiune : sesiuniDisponibile) {
            System.out.println("Tip sesiune: " + sesiune.getTipSesiune() + ", Perioada: " + sesiune.getPerioada() + ", An: " + sesiune.getAn());
        }


    }
}


/*
1. Adaugarea unui nou student in sistem
2. Afisarea listei de studenți inscrisi intr-o clasa
3. Adaugarea unei noi materii in catalog
4. Afisarea listei de materii disponibile
5. Atribuirea unei note unui student la o materie
6. Vizualizarea catalogului complet cu notele studenților
7. Crearea unui nou orar pentru o clasa si un anumit semestru
8. Afisarea orarului unei clase pentru o anumita zi si o anumita ora
9. Adaugarea unui nou profesor in sistem
10. Stergerea unei materii din catalog
11. Modificarea notei unui student la o anumita materie
12. Stergerea unui student
13. Modificarea varstei unui student
14. Sortare crescatoare a profesorilor in functie de vechime
15. Afisarea listei de sesiuni disponibile
 */