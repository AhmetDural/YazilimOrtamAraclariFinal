package tr.medipol.edu.com.SpringBootFinalProjesi;

import org.junit.jupiter.api.Test;

public class HastaEkleSilGörüntüleTest extends HasstaRest {
	@Test
	public void EkleTest() {
		hastalar.add("Ahmet 4");
	}
	
	@Test
	public void ListeleTest() {
		
	}
	
	@Test
	public void SilTest() {
		hastalar.remove("Ahmet 4");
	}
}
