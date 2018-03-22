package guma.radnja;

import java.util.LinkedList;

import guma.AutoGuma;

/**
 * Klasa VulkanizerskaRadnja koja predstavlja rad.
 * 
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
	 * 
	 * @param AutoGuma
	 *            objekat klase AutoGuma
	 * @throws java.lang.NullPointerException
	 *             kada je uneti objekat null.
	 * @throws java.lang.RuntimeException
	 *             kada uneti objekat vec postoji u listi.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		for (int i = 0; i < gume.size(); i++) {
			if (gume.get(i).getMarkaModel().equals(a.getMarkaModel()) && gume.get(i).getPrecnik() == a.getPrecnik()
					&& gume.get(i).getSirina() == a.getSirina() && gume.get(i).getVisina() == a.getVisina()) {
				throw new RuntimeException("Guma vec postoji");
			}
		}
		gume.add(a);
	}

	/**
	 * Metoda koja vraca listu sa svim gumama od date marke
	 * 
	 * @param markaModel
	 *            Model gume koja se pretrazuje
	 * @return Lista sa gumama
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

	/**
	 * Proverava da li se guma nalazi u listi.
	 * 
	 * @param AutoGuma Objekat klase AutoGuma
	 * @return da ili ne
	 */
	public boolean proveriGumu(AutoGuma a) {
		return gume.contains(a);
	}
}
