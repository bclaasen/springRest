package de.berndclaasen.calenderapp.frontend;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import de.berndclaasen.calenderapp.backend.model.Person;
import de.berndclaasen.calenderapp.backend.service.PersonService;

@Controller
public class HelloController {

	@Autowired
	private PersonService personService;
	
    @RequestMapping("/hello")
    public @ResponseBody Person person(
            @RequestParam(value="id", required=false, defaultValue="1") String id) {
        return personService.findPersonById(Long.parseLong(id));
    }
    
    @RequestMapping("/helloAll")
    public @ResponseBody List<Person> personAll() {
        return personService.findAll();
    }
    
}
