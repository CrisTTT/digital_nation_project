package basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
@Controller

public class ContactController {

	@Autowired
	private ContactRepository contactRepository;
		
	@GetMapping("/category")
	public String getcategory() {
		return "category.html";
	}
	

	@GetMapping("/education")
	public String geteducation() {
		return "education.html";
	}
	
	
	@GetMapping("/experience")
	public String getexperience() {
		return "experience.html";
	}
	

	
	@GetMapping("/hobby")
	public String gethobby() {
		return "hobby.html";
	}

	
	@GetMapping("/contact")
	public String getcontact() {
		return "contact.html";
	}
	
	@PostMapping("/addContact" )
	public String addContact(Contact a) {
		System.out.println(a);
		contactRepository.save(a);
		return "contact.html";
	}
	
	
	
	
	}