package py.edu.facitec.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UtilidadController {
	@RequestMapping("/comollegar")
	
	public String index(){
		System.out.println("pagina cargada");
		return "comollegar";
	}

}
