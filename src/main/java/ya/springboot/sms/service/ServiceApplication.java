package ya.springboot.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ya.springboot.sms.model.Application;

@Service
public class ServiceApplication {

	private List<Application> listeApp = new ArrayList<Application>();

	public ServiceApplication() {
		listeApp.add(new Application(1L,"Ecmoss","Enquête coût main d'oeuvre et salaire."));
		listeApp.add(new Application(2L,"N4ds","Enquête démographie sociale."));
		listeApp.add(new Application(3L,"Neptune","Enquête statistique domaine touristique."));
	}

	public List<Application> getListeApp(){
		return listeApp;
	}
}
