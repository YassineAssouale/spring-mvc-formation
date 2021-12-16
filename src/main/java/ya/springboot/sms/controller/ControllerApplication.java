package ya.springboot.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ya.springboot.sms.service.ServiceApplication;

@Controller
@RequestMapping("applications")
public class ControllerApplication {
	// Accès à une page statique/jsp : spring mvc
	@Autowired
	ServiceApplication serviceApplication;
	
	@GetMapping
	public String display() {
		return "applications";
	}
	@GetMapping("{id}")
	public String getPathVariable(@PathVariable Long id) {
		System.out.println(id);
		return "applications";
	}
	
	@GetMapping("filtre")
	public String getRequestParam(@RequestParam String name, @RequestParam("id") Long id) {
		System.out.println(name);
		System.out.println(id);
		return "applications";
	}
	
	@GetMapping("liste")
	public String displayListeApp(Model model) {
		model.addAttribute("nbApp",serviceApplication.getListeApp().size());
		model.addAttribute("listeApplications",serviceApplication.getListeApp());
		return "listeApp";
	}
}
