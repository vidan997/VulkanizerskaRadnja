package gume;

/**
 * Klasa nam predstavlja auto gume.
 * 
 * @author Vidan Milojevic 271/16
 *
 */
public class AutoGuma {

	/**
	 * Atribut koji nam predstavlja marku gume.
	 */
	private String markaModel = null;
	/**
	 * Atribut koji nam predstavlja precnik gume.
	 */
	private int precnik = 0;
	/**
	 * Atribut koji nam predstavlja sirinu gume.
	 */
	private int sirina = 0;
	/**
	 * Atribut koji nam predstavlja visinu gume.
	 */
	private int visina = 0;

	/**
	 * Metoda za vracanje marke gume.
	 * 
	 * @return vraca marku gume.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda za namestanje marke gume.
	 * 
	 * @param markaModel
	 *            atribut za marku gume.
	 * @throws java.lang.RuntimeException
	 *             izuzetak koji se pojavljuje u skucaju da je uneta vrednost
	 *             <ul>
	 *             <li>koja ima manje od 3 znaka;
	 *             <li>null.
	 *             </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * Metoda za vracanje precnika gume
	 * @return Precnik gume.
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Metoda za postavljanje vrednosti precnika
	 * @param precnik Vrednost precnika u cm.
	 * @throws java.lang.RuntimeException izuzetak koji se pojavljuje u slucaju da je uneti precnik:
	 * <ul>
	 * <li>manji od 13cm.
	 * <li>veci od 22cm.
	 * </ul>
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Metoda za vracanje sirine gume
	 * @return Sirina gume.
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Metoda za postavljanje vrednosti sirine gume.
	 * @param sirina Sirina gume u cm.
	 * @throws java.lang.RuntimeException izuzetak koji se pojavljuje u slucaju da je uneti sirina:
	 * <ul>
	 * <li>manja od 135;
	 * <li>veca od 355.
	 * </ul>
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Metoda za vracanje visine gume.
	 * @return	Visina gume.
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Metoda za postavljanje visine gume. 
	 * @param visina Visina gume u cm.
	 * @throws java.lang.RuntimeException u slucaju ako je uneta za visinu gume:
	 * <ul>
	 * <li>manja od 25
	 * <li>veca od 95
	 * </ul>
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	/**
	 * Metoda koja vraca kratak opis gume u vidu String vrednosti.
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
	/**
	 * Metoda koja proverava da li je uneti objekat klase AutoGuma.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
