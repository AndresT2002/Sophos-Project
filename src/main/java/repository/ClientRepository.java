package repository;
import entity.Client;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>{

	
	
	
}
