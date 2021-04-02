import java.util.Scanner;


/**
 * Aplicatie prentu generarea de noi abonamente pentru clienti.
 * @author Dascalescu Tudor si Scrimiti Augustin
 * @version 1.1
 *
 */
/**
 * @author TDR
 *
 */
public class PrototyPatternExample {

    /**Metoda main a aplicatiei.
     * @param args Array de argumente de tip String
     * @throws CloneNotSupportedException Exceptie aruncata de metoda clone din clasa cloneable
     */
    public static void main(String[] args) throws CloneNotSupportedException {

       Dialog x = new Dialog();
       x.iniAbonament();
    }
}
/*
        //Telefon Voce1 = new Telefon();
        //Internet Internet1= new Internet();
        //Televiziune Tele1 = new Televiziune();



        //System.out.println("=== Abonamente standard: ==="+newLine);
        //System.out.println(Voce1);
        //System.out.println("Default ID Abonament: " + System.identityHashCode(System.identityHashCode(Voce1))+newLine);


        //System.out.println(Internet1);
        //System.out.println("Default ID Abonament: " + System.identityHashCode(System.identityHashCode(Internet1))+newLine);

        //System.out.println(Tele1);
        //System.out.println("Default ID Abonament: " + System.identityHashCode(System.identityHashCode(Tele1))+newLine);


        //System.out.println("=== Abonamente costumizate: ===" + newLine);

        //Abonament Voce2 = Voce1.clone();
        //Voce2.custom(10000, 2000, 0, 0);
        //System.out.println(Voce2);
        //System.out.println("ID Abonament Utilizator: " + System.identityHashCode(System.identityHashCode(Voce2))+newLine);


       //Abonament Internet2 = Internet1.clone();
       //Internet2.custom(0,0, 1000, 0);
       //System.out.println(Internet2);
       //System.out.println("ID Abonament Utilizator: " + System.identityHashCode(System.identityHashCode(Internet2))+newLine);

        //Abonament Tele2 = Tele1.clone();
        //Tele2.custom(0,0, 0, 200);
        //System.out.println(Tele2);
        //System.out.println("ID Abonament Utilizator: " + System.identityHashCode(System.identityHashCode(Tele2))+newLine);
*/