package de.berndclaasen.calenderapp;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


	@Autowired
	private PersonService personService;
	
    @RequestMapping("/hello")
    public @ResponseBody Person person(
            @RequestParam(value="id", required=false, defaultValue="1") String id) {
        return personService.findPersonById(Integer.parseInt(id));
    }
}
