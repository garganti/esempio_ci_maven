package provamaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudenteTest {

	@Test
	public void testGetMatricola() {
		Studente s = new Studente();
		System.out.println("faccio andare i casi di test !!!!");
		assertEquals(10, s.getMatricola());
	}

}
