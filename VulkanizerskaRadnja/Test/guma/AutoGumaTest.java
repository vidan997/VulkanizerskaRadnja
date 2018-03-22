package guma;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import guma.AutoGuma;

public class AutoGumaTest {
	AutoGuma a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Michelin");
		assertEquals("Michelin",a.getMarkaModel());
	}
	@Test 
	public void testSetPrecnik() {
		a.setPrecnik(20);
		assertEquals(20,a.getPrecnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		a.setPrecnik(0);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVise() {
		a.setPrecnik(50);
	}
	@Test
	public void testSetSirina() {
		a.setSirina(150);
		assertEquals(150,a.getSirina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		a.setSirina(50);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVise() {
		a.setSirina(400);
	}
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50,a.getVisina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		a.setVisina(10);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVise() {
		a.setVisina(100);
	}
	@Test
	public void testToString() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=Michelin, precnik=20, sirina=150, visina=50]",a.toString());
	}

	@Test
	public void testEqualsObject() {
		AutoGuma a2 = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		a2.setMarkaModel("Michelin");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(50);
		assertTrue(a.equals(a2));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		AutoGuma a2 = new AutoGuma();
		a.setMarkaModel("Michelin");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		a2.setMarkaModel("Mihelin");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(50);
		assertFalse(a.equals(a2));
	}

}
