/**
 * @author Dascalescu Tudor si Scriminti Augustin.
 *
 */
public class Televiziune extends Abonament {
	
	/**
	 * variabila protected int pentru numarul de canale
	 */	
	protected  int Numar_canale;
 
	/**
     * Constructor ce creeaza un abonament de televiziune dupa unul existent.
     * @param formular Formularul dupa care se reinitializeaza parametrii abonamentului.
     */
	public Televiziune(Televiziune formular) {
         super(formular);
         if (formular != null){
         this.Numar_canale=formular.Numar_canale;

         }
    }
	
	/**
     * Constructor pentru un abonament standard.
     */
    public Televiziune() {
        Numar_canale = 100;

    }
    
    /**
     * Metoda de aflare al numarului de canale.
     * @return Returneaza numarul de canale actual. 
     */
    private  int getNumar_canale(){
        return Numar_canale;
    }
    
    /**
     * Metoda de clonare a abonamentului.
     * @return Returneaza un obiect de tip Abonament cu referire la Televiziune.
     */
    @Override
    public Abonament clone() throws CloneNotSupportedException {
        return (Televiziune) super.clone();
    }
    
    /**
     * Metoda de afisare a datelor cu privinta la abonamentul de televiziune.
     * @return Returneaza un sir de caractere cu informatiile abonamentului.
     */
    @Override
    public String toString() {
        return "Abonament Tv: [tip_abonament=" + gettip_abonament() + ", Pret:=" + getPret() +  "€" + ", Numar de canale:="+ getNumar_canale() + "]";
    }

    /**
     * Metoda de customizare a abonamentului de tip televiziune.
     * @param canale Doar canalele sunt relevante dintre acesti patrametri, in consecinta se va apela metoda cu valoarea 0 pentru minute, sms si viteza.
     */
    public void custom( int minute, int sms, int viteza, int canale) {

        int procent1;
        double pret1;

        tip_abonament = "costumizat";

        procent1 = (100 * canale) / Numar_canale;

        Pret = ( procent1 / 100 ) * Pret;

        Numar_canale=canale;

    }
}
