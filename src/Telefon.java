
/**
 * @author Dascalescu Tudor si Scriminti Augustin.
 *
 */
public class Telefon extends Abonament {
    
	/**
	 * variabila protected int pentru numarul de minute.
	 */
	protected int Nr_minute;
	
	/**
	 * variabila protected int pentru numarul de sms-uri.
	 */
	protected int Nr_sms;

	/**
     * Constructor ce creeaza un abonament de telefonie dupa unul existent.
     * @param formular Formularul dupa care se reinitializeaza parametrii abonamentului.
     */
	public Telefon(Telefon formular)  {
           super(formular);
           if(formular!=null){
               this.Nr_minute=formular.Nr_minute;
               this.Nr_sms= formular.Nr_sms;
           }
    }
	
	/**
     * Constructor pentru un abonament standard.
     */
    public Telefon() {
        Nr_sms = 10000;
        Nr_minute= 2000;
        Pret= 5;
    }

    /**
     * Metoda de aflare al numarului de minute.
     * @return Returneaza numarul de minute actual. 
     */
    private int getNr_minute(){
        return Nr_minute;
    }
    
    /**
     * Metoda de aflare al numarului de sms-uri.
     * @return Returneaza numarul de sms-uri actual. 
     */
    private  int getNr_sms(){
        return Nr_sms;
    }
    
    /**
     * Metoda de clonare a abonamentului.
     * @return Returneaza un obiect de tip Abonament cu referire la Telefonie.
     */
    @Override
        public Abonament clone() throws CloneNotSupportedException {
        return (Abonament) super.clone();
    }
    
    /**
     * Metoda de afisare a datelor cu privinta la abonamentul de telefonie.
     * @return Returneaza un sir de caractere cu informatiile abonamentului.
     */
    @Override
    public String toString() {
        return "Abonament Telefonie: [tip_abonament=" + gettip_abonament() + ", Pret:=" + getPret() + "€" + ", Numar minute:=" + getNr_minute() + ", Numar SMS:=" + getNr_sms() + "]";
    }

    /**
     * Metoda de customizare a abonamentului de tip telefonie.
     * @param minute Doar minutele si sms-urile sunt relevante dintre acesti patrametri, in consecinta se va apela metoda cu valoarea 0 pentru canale si viteza.
     * @param sms Numarul custom de sms-uri dorit
     */
    public void custom( int minute, int sms, int viteza, int canale) {

        int procent1;
        int procent2;
        double pret1;
        double pret2;

        tip_abonament = "costumizat";

        procent1 = (100 * minute) / Nr_minute;
        pret1 = ( procent1 / 100 ) * Pret;
        procent2 = ( 100 * sms ) / Nr_sms;
        pret2 = ( procent2 / 100 ) * Pret;

        Pret = pret1 + pret2;

        Nr_minute= minute;
        Nr_sms= sms;
    }
}