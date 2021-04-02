import java.util.Scanner;

/**
 * @author Dascalescu Tudor si Scriminti Augustin.
 *
 */
public class Dialog {
    /**
     * Metoda de initializare a abonametului.
     */
    void iniAbonament() {
        String newLine = System.getProperty("line.separator");

        Scanner scan = new Scanner(System.in);

        System.out.println("Ce tip de abonament doriti?" + newLine+ "Optiuni: Telefonie, Televizor, Internet" + newLine);

        String nume_abonament = scan.nextLine();
        String tip;
        boolean eroare = false;

        int nrMin = 0, nrSms = 0, nrCanale = 0, vitezaInternet = 0;

        Telefon Voce1 = new Telefon();
        Internet Internet1 = new Internet();
        Televiziune Tele1 = new Televiziune();

        switch (nume_abonament)
        {

            case "Telefonie":
                System.out.println("Doriti abonamentul standard sau customizat?");
                tip = scan.nextLine();

                switch (tip)
                {

                    case "Standard":

                        System.out.println("S-a creeat abonamentul standard:" + newLine);
                        System.out.println(Voce1 + newLine);
                        break;

                    case "Customizat":

                        Abonament Voce2 = null;
                        try
                        {
                            Voce2 = Voce1.clone();
                        }
                        catch (CloneNotSupportedException e)
                        {
                            e.printStackTrace();
                        }
                        System.out.println("Introduceti numarul de minute si sms-uri dorit");
                        System.out.println("Numar minute=");

                        do
                        {
                            try
                            {

                                int nrMin1 = scan.nextInt();
                                nrMin = nrMin1;
                                eroare = false;


                            }
                            catch (Exception e)
                            {

                                System.out.println("Nu ati introdus un numar" + newLine + "reintroduceti");
                                scan.next();
                            }
                        }
                        while (eroare);

                        System.out.println("Numar sms-uri=");

                        do
                        {
                            try
                            {

                                int nrSms1 = scan.nextInt();
                                nrSms = nrSms1;
                                eroare = false;


                            }
                            catch (Exception e)
                            {

                                System.out.println("Nu ati introdus un numar" + newLine + "reintroduceti");
                                scan.next();
                            }
                        }
                        while (eroare);

                        Voce2.custom(nrMin, nrSms, 0, 0);
                        System.out.println("S-a creeat:" + newLine);
                        System.out.println(Voce2);
                        System.out.println("ID Abonament Utilizator: " + System.identityHashCode(System.identityHashCode(Voce2)) + newLine);
                        break;

                    default:
                        System.out.println("Nu ati introdus un tip de abonament valid, reluati procesul");
                }
                break;


            case "Televizor":
                eroare = false;
                System.out.println("Doriti abonamentul Standard sau Customizat?");
                tip = scan.nextLine();

                switch (tip) {
                    case "Standard":

                        System.out.println("S-a creeat abonamentul standard:" + newLine);
                        System.out.println(Tele1 + newLine);
                        break;

                    case "Customizat":
                        Abonament Tele2 = null;
                        try {
                            Tele2 = Tele1.clone();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Introduceti numarul de minute si canale dorit");

                        System.out.println("numar canale=");
                        do {

                            try {

                                int nrCanale1 = scan.nextInt();
                                nrCanale = nrCanale1;
                                eroare = false;


                            } catch (Exception e) {

                                System.out.println("Nu ati introdus un numar" + newLine + "reintroduceti");
                                scan.next();
                            }
                        }
                        while (eroare);


                        Tele2.custom(0, 0, 0, nrCanale);
                        System.out.println("S-a creeat:" + newLine);
                        System.out.println(Tele2);
                        System.out.println("ID Abonament Utilizator: " + System.identityHashCode(System.identityHashCode(Tele2)) + newLine);
                        break;

                    default:
                        System.out.println("Nu ati introdus un tip de abonament valid, reluati procesul");
                }
                break;


            case "Internet":
                eroare = false;
                System.out.println("Doriti abonamentul Standard sau Customizat?");
                tip = scan.nextLine();

                switch (tip) {
                    case "Standard":

                        System.out.println("S-a creeat abonamentul standard:" + newLine);
                        System.out.println(Internet1 + newLine);
                        break;

                    case "Customizat":
                        Abonament Internet2 = null;
                        try {
                            Internet2 = Internet1.clone();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Introduceti viteza dorita");

                        System.out.println("viteza=");
                        do {

                            try {

                                int vitezaInternet1 = scan.nextInt();
                                vitezaInternet = vitezaInternet1;
                                eroare = false;


                            } catch (Exception e) {

                                System.out.println("Nu ati introdus un numar" + newLine + "reintroduceti");
                                scan.next();
                            }
                        }
                        while (eroare);


                        Internet2.custom(0, 0, vitezaInternet, 0);
                        System.out.println("S-a creeat:" + newLine);
                        System.out.println(Internet2);
                        System.out.println("ID Abonament Utilizator: " + System.identityHashCode(System.identityHashCode(Internet2)) + newLine);
                        break;

                    default:
                        System.out.println("Nu ati introdus un tip de abonament valid, reluati procesul");
                }
                break;

            default:
                System.out.println("Nu ati introdus un abonament valid, reluati procesul");
        }
    }
}
