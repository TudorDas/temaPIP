/**
 * @author Dascalescu Tudor si Scriminti Augustin.
 *
 */
public class Internet extends Abonament {
    
	/**
	 * variabila protected int pentru viteza internetului
	 */
	protected int Viteza_internet;

    /**
     * Constructor ce creeaza un abonament de internet dupa unul existent.
     * @param formular Formularul dupa care se reinitializeaza parametrii abonamentului.
     */
    public Internet(Internet formular)
    {
        super(formular);
        if (formular != null)
        {
            this.Viteza_internet = formular.Viteza_internet;
        }
    }

    /**
     * Constructor pentru un abonament standard.
     */
    public  Internet()
    {
            Viteza_internet = 500;
            Pret= 5;
    }

    /**
     * Metoda de aflare a vitezei de trafic.
     * @return Returneaza viteza actuala a internetului. 
     */
    private int getViteza_internet(){
        return  Viteza_internet;

    }
    
    /**
     * Metoda de clonare a abonamentului.
     * @return Returneaza un obiect de tip Abonament cu referire la Internet.
     */
    @Override
    public Abonament clone() throws CloneNotSupportedException {
        return (Internet) super.clone();
    }
    /**
     * Metoda de afisare a datelor cu privinta la abonamentul de internet.
     * @return Returneaza un sir de caractere cu informatiile abonamentului.
     */
    @Override
    public String toString() {
        return "Abonament Internet: [tip_abonament=" + gettip_abonament() + ", Pret:=" + getPret() +  "€" + ", viteza Internet:=" + getViteza_internet() + "]";
    }

    /**
     * Metoda de customizare a abonamentului de tip internet.
     * @param viteza Doar viteza este relevanta dintre acesti patrametri, in consecinta se va apela metoda cu valoarea 0 pentru minute, sms si canale.
     */
    public void custom( int minute, int sms, int viteza, int canale) {

        int procent1;
        double pret1;

        tip_abonament = "costumizat";

        procent1 = (100 * viteza) / Viteza_internet;

        Pret = ( procent1 / 100 ) * Pret;

        Viteza_internet=viteza;

    }
}
