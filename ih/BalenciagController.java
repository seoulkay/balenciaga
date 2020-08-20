package rest.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BalenciagaController {
	@CrossOrigin(origins = "*")
	@GetMapping("/sample")
	public String getSample(){
		return "성공";
	}
}
