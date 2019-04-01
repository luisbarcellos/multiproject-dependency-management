package br.com.multiproject.dependencymanagement;

import br.com.multiproject.dependencymanagement.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return service.hello();
    }
}