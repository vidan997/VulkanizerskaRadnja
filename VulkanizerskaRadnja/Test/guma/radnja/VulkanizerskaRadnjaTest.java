package guma.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import guma.AutoGuma;
import guma.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		v.dodajGumu(a);
		assertTrue(v.proveriGumu(a));
	}
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		v.dodajGumu(a);
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Michelin");
		a1.setPrecnik(20);
		a1.setSirina(150);
		a1.setVisina(50);
		v.dodajGumu(a1);
	}
	@Test
	public void testPronadjiGumuNull() {
		assertNull(v.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiGumuJedna() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		v.dodajGumu(a);
		LinkedList<AutoGuma> gume1 = new LinkedList<AutoGuma>();
		gume1.add(a);
		assertEquals(gume1,v.pronadjiGumu("Michelin"));
	}
	@Test
	public void testPronadjiGumuVise() {
		AutoGuma a = new AutoGuma();
		LinkedList<AutoGuma> gume1 = new LinkedList<AutoGuma>();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		v.dodajGumu(a);
		gume1.add(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Michelin");
		a2.setPrecnik(21);
		a2.setSirina(136);
		a2.setVisina(70);
		v.dodajGumu(a2);
		gume1.add(a2);
		assertEquals(gume1,v.pronadjiGumu("Michelin"));
	}
	@Test
	public void testPronadjiGumuPrazna() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		v.dodajGumu(a);
		LinkedList<AutoGuma> gume1 = new LinkedList<AutoGuma>();
		assertEquals(gume1,v.pronadjiGumu("Micheline"));
	}
}
