package org.jobs.ws.bean;

import java.util.List;

import org.jobs.persistence.bean.Client;
import org.jobs.persistence.bean.Order;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProcessManager {

	List<Order> getOrderAll();

	Order getOrder(Long orderId);
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	Order createOrder(Order order);

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	Order updateOrder(Order order);

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	void deleteOrder(Long orderId) throws Exception;
		
	List<Order> getSearchOrder(String search);
	
	List<Client> getClientAll();
	
	Client getClient(Long clientId);
	
	Client findClientByFirstName(String firstName);
 	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	Client createClient(Client client);

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	Client updateClient(Client client);

	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	void deleteClient(Long clientId) throws Exception;
	
	/*List<Client> getSearchClient(String search);*/

}
