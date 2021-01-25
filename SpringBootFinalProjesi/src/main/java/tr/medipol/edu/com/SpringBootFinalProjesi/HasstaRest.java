package tr.medipol.edu.com.SpringBootFinalProjesi;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hastalar")
public class HasstaRest {

	public static List<String> hastalar = new ArrayList();
	
	@GetMapping("/listele")
	public List<String> listele() {
		return hastalar;
	}
	

	@PostMapping("/ekle")
	public String ekle(@RequestBody String ad) {
		hastalar.add(ad);
		return ad;
	}
	

	@PostMapping("/sil")
	public String sil(@RequestBody String ad) {
		hastalar.remove(ad);
		return ad;
	}

}	
	
