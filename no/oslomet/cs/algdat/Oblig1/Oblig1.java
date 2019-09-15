package algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) throws NotImplementedException {
        throw new NotImplementedException();
    }

    public static int ombyttinger(int[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new NotImplementedException();
    }
    //test

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new NotImplementedException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        if (s == null || t == null) {
            throw new NotImplementedException();
        }

        //her konvereter vi strings til array
        //lengden på arrayet vil være like langt som lengden på stringen
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        //her fletter vi arrayene sammen vet å legge de inn
        //i et nytt array, altså nytt objekt
        char[] flettetStrings = new char[a1.length + a2.length];

        //Math.min returnerer den minste verdien
        int b = Math.min(a1.length, a2.length);

        //for løkke for annen hver
        for (int i = 0, j = 0; i < b; i++) {
            flettetStrings[j++] = a1[i];
            flettetStrings[j++] = a2[i];
        }

        //arraycopy(metode med parametre) kopierer arrays fra en spesifik posisjon til gitt array
        // 1) fra arrayet som skal kopieres fra
        // 2) start posisjon til arrayet det skal kopieres fra
        // 3) arrayet det skal kopieres til
        // 4) start posisjon i arrayet kopiert til
        // 5) total antall komponenter som skal kopieres
        System.arraycopy(a1, b, flettetStrings, 2 * b, a1.length - 1);
        System.arraycopy(a2, b, flettetStrings, 2 * b, a2.length - 1);

        //Gjør om char arrayet flettetStrings til en string. ValueOf() metode som lar oss konvertere
        //til de fleste typer av string.
        return String.valueOf(flettetStrings);
    }

    /// 7b)
    public static String flett(String[] s) {
        //throw new NotImplementedException();

        //hvis lengden til s er 0 (ingen verdier) vil den retunerer tom string.
        if (s.length == 0) {
            return "";
        }

        //int a er første streng i tabellen s og retunerer lengden
        int a = s[0].length();

        //for løkke gjennom arrayet
        for (int i = 1; i < s.length; i++) {
            //lengde er i posisjon i arrayet s og returnert olengde
            int lengde = s[i].length();

            //hvis lengde er større enn a, som vi først fant,
            //så skal a oppdateres
            if (lengde > a) {
                a = lengde;
            }
        }

        //lager ny stringbuilder, har startkapasitet på 16 tegn.
        StringBuilder Stringbuilder = new StringBuilder();

        //for løkke som går gjennom lengden
        for (int i = 0; i < a; i++) {
            //for alle string verdder i arrayet
            for (String t : s) {
                //hvis i er mindre enn veridene
                if (i < t.length()) {
                    //legger til strenger av et argument til sekvensen.
                    //charAt() = skriver ut alle tegnenen i en streng, viser tegn ved hver iterasjon av løkken
                    Stringbuilder.append(t.charAt(i));
                }
            }
        }
        return Stringbuilder.toString();
    }


    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new NotImplementedException();
    }


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new NotImplementedException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new NotImplementedException();
    }

}  // Oblig1
