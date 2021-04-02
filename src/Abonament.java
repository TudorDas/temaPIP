

/**
 * Clasa ce structureaza un abonament.
 * @author Dascalescu Tudor si Scrimiti Augustin
 *
 */
public class Abonament implements  Cloneable {
	
    /**
     * variabila string ce indica tipul abonamentului
     */
    public String tip_abonament;
    /**
     * variabila double ce indica pretul abonamentului
     */
    protected double Pret;
    
    
    /**
     * Constructor ce creeaza un abonament dupa un abonament existent.
     * @param formular Parametrul pentru constructorul ce creeaza un abonament dupa un abonament existent deja.
     * 
     */
    public Abonament(Abonament formular) {
    	
        if(formular != null) {
        this.tip_abonament= formular.tip_abonament;
        this.Pret= formular.Pret;
       }
    }

    
    /**
     * Constructor ce creeaza un abonament standard.
     */
    public Abonament() {
          tip_abonament = "Standard";
          Pret = 5;
    }

    /**
     * Metoda pentru aflarea tipului de abonament
     * @return Returneaza tipul abonamentului.
     */
    public String gettip_abonament() {
        return tip_abonament;
    }

    /**
     * Metoda ce seteaza tipul unui abonament existent.
     * @param tip_abonament Noua denumire a abonamentului.
     */
    public void settip_abonament(String tip_abonament) {
        this.tip_abonament = tip_abonament;

    }

    /**
     * Metoda pentru aflarea pretului unui abonament.
     * @return Returneaza pretul abonamentului
     */
    public double getPret() {
        return Pret;
    }

    /**
     * Metoda de setare a unui nou pret pentru abonament.
     * @param Pret Noul pret alabonamentului.
     */
    public void setPret(int Pret) {
        this.Pret = Pret;
    }

    /**
     * Metoda de clonarea a unui sablon de abonament standard.
     * @return Returneaza un abonament standard.
     * 
     * 
     */
    public Abonament clone() throws CloneNotSupportedException {
        return (Abonament) super.clone();
    }

    /**
     * Metoda de customizare a abonamentelor standard.
     * @param minute Numarul custom de minute.
     * @param sms	Numarul custom de sms-uri.
     * @param viteza	Numarul custom de Mbps pentru internet.
     * @param canale	Numarul de canale.
     */
    public void custom(int minute, int sms, int viteza, int canale) {
    }
}