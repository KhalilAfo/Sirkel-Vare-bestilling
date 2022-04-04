package Oblig1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oblig1Oppgave2 {

    public static void main(String[] args){
        // les inn navn, antall og pris for vare 1
        String navn1;
        int antall1;
        double pris1;
        String innNavn1 = showInputDialog("skriv inn navn for vare 1:");
        String innAntall1 = showInputDialog("skriv inn antall for vare 1:");
        String innPris1 = showInputDialog("skriv inn pris for vare 1:");

        try {
           navn1 = innNavn1;
           antall1 = Integer.parseInt(innAntall1);
           pris1 = Double.parseDouble(innPris1);
        }
        catch (Exception e){
            navn1 = "";
            antall1 = 0;
            pris1 = 0;
        }

        // les inn navn, antall og pris for vare 2
        String navn2;
        int antall2;
        double pris2;
        String innNavn2 = showInputDialog("skriv inn navn for vare 2:");
        String innAntall2 = showInputDialog("skriv inn antall for vare 2:");
        String innPris2 = showInputDialog("skriv inn pris for vare 2:");

        try {
            navn2 = innNavn2;
            antall2 = Integer.parseInt(innAntall2);
            pris2 = Double.parseDouble(innPris2);
        }
        catch (Exception e){
            navn2 = "";
            antall2 = 0;
            pris2 = 0;
        }



        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2

        // opprett to vare-objekter med de innleste verdiene

        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        // beregn og skriv ut total pris for alle varer i System.out
         double totalPris1 = vare1.totalPris();
         double totalPris2 = vare2.totalPris();
         double totalpris = totalPris1 + totalPris2;
         String ut = "Totalprisen ble : " + totalpris;

         showMessageDialog(null, ut);
         System.out.println(ut);

    }
}
