package radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa VulkanizerskaRadnja koja predstavlja rad.
 * @author Vidan Milojevic
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Predstavlja istu guma koja radnja poseduje.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	/**
	 * Metoda koja dodaje novu gumu u listu
	 * @param Objekat klase AutoGuma
	 * @throws java.lang.NullPointerException kada je uneti objekat null.
	 * @throws java.lang.RuntimeException kada uneti objekat vec postoji u listi.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Metoda koja vraca listu sa svim gumama od date marke
	 * @param Marka gume
	 * @return Lista sa gumama
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
