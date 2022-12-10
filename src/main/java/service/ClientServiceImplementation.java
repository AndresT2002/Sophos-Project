package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Client;
import repository.ClientRepository;

@Service
public class ClientServiceImplementation implements ClientService{

	@Autowired
	ClientRepository clientRpository;
	
	
	@Override
	public Client createClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client deleteClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
