package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.ClientService;
import entity.Client;
@RestController

@RequestMapping("/clients")
public class ClientController {

	
	@Autowired
	ClientService clientService;
	
	@GetMapping
	
	public ResponseEntity<List<Client>> getClients(){
		return null;
	}
}
	 