package group.redspider.template.controller;

import group.redspider.template.dao.repository.PersonRepository;
import group.redspider.template.model.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/hello")
    public String hello(){
        Employee a=new Employee("xy",8);

        personRepository.save(a);
        return "hello!";
    }
}
