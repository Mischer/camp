package org.jobs.persistence.dao;

import java.util.List;

import org.jobs.persistence.bean.Client;
import org.jobs.persistence.dao.impl.DaoImpl.Sort;

public interface ClientDao extends Dao<Client> {
	
	List<Client> getAll();

	Client findClientByFirstName(String firstName);

	Client get(Long id);

	/*List<Order> searchClient(String search);*/
	
	List<Client> getAllBySort(String sort, Sort s);
			
}

