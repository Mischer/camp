package org.jobs.ws.bean;

import java.util.List;

import org.apache.log4j.Logger;
import org.jobs.persistence.bean.Client;
import org.jobs.persistence.bean.Order;
import org.jobs.persistence.dao.ClientDao;
import org.jobs.persistence.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unused")
public class ProcessManagerBean implements ProcessManager {

	private static Logger log = Logger.getLogger(ProcessManagerBean.class);
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ClientDao clientDao;
	
	@Override
	public Client createClient(Client client) {
		clientDao.create(client);
		return client;
	}
	
	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}
	public ClientDao getClientDao() {
		return clientDao;
	}
	public void deleteClient(Long clientId) throws Exception {
		Client client = clientDao.get(clientId);
		clientDao.delete(client);
	}
	public Client findClientByFirstName(String firstName){
		Client client = clientDao.findClientByFirstName(firstName);
		return client;
	}
	@Override
	public List<Client> getClientAll() {
		return clientDao.getAll();
	}
	@Override
	public Client updateClient(Client client) {
		clientDao.update(client);
		return client;
	}
	@Override
	public Client getClient(Long clientId) {
		return clientDao.get(clientId);
	}

	/*@Override
	public List<Client> getSearchClient(String search) {
		return orderDao.searchClient(search);
	}*/

	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	@Override
	public Order createOrder(Order order) {
		orderDao.create(order);
		return order;
	}

	@Override
	public void deleteOrder(Long orderId) throws Exception {
		Order order = orderDao.get(orderId);
		orderDao.delete(order);
	}

	@Override
	public List<Order> getOrderAll() {
		return orderDao.getAll();
	}

	@Override
	public Order updateOrder(Order order) {
		orderDao.update(order);
		return order;
	}

	@Override
	public Order getOrder(Long orderId) {
		return orderDao.get(orderId);
	}

	@Override
	public List<Order> getSearchOrder(String search) {
		return orderDao.searchOrder(search);
	}

}
