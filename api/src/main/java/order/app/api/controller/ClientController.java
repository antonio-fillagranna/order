package order.app.api.controller;

import order.app.api.client.Client;
import order.app.api.client.ClientRepository;
import order.app.api.client.DTOClientRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @PostMapping
    public void registry(@RequestBody DTOClientRegistry data){
        repository.save(new Client(data));
    }
}
