package service;

import java.util.List;

import entity.Client;

public interface ClientService {

	
	public Client createClient(Client client);
	public Client deleteClient(Client client);
	public Client updateClient(Client client);
	public List<Client> listClients();
}
