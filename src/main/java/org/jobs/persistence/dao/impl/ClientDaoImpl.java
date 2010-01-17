package org.jobs.persistence.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.jobs.persistence.bean.Client;
import org.jobs.persistence.dao.ClientDao;
import org.springframework.stereotype.Repository;
@Repository
public class ClientDaoImpl extends DaoImpl<Client> implements ClientDao{
	public ClientDaoImpl() {
	}

	@SuppressWarnings("unchecked")
	public List<Client> getAll() {
		return getHibernateTemplate().find("from Client");
	}

	@SuppressWarnings("unchecked")
	@Override
	public Client findClientByFirstName(String firstName) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Client.class);
		criteria.add(Restrictions.eq("firstName", firstName));
		List<Client> clients = (List<Client>) getHibernateTemplate().findByCriteria(criteria);
		return clients.isEmpty() ? null : clients.get(0);
	}

	@Override
	public Client get(Long id) {
		return get(Client.class, id);
	}

	@Override
	public List<Client> getAllBySort(String orderParam, Sort s) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Client.class);
		if (orderParam != null && Sort.ASC.equals(s)) {
			criteria.addOrder(Order.asc(orderParam));
		} else if (orderParam != null && Sort.DESC.equals(s)) {
			criteria.addOrder(Order.desc(orderParam));
		}
		List<Client> clients = getHibernateTemplate().findByCriteria(criteria);
		return clients;
	}
	
/*	@Override
	public List<Client> searchClient(String search) {
		Disjunction dis = Restrictions.disjunction();
		dis.add(Restrictions.like("client.firstName", search, MatchMode.ANYWHERE));
		dis.add(Restrictions.ilike("client.middleName", search, MatchMode.ANYWHERE));
		dis.add(Restrictions.ilike("client.lastName", search, MatchMode.ANYWHERE));

		DetachedCriteria criteria = DetachedCriteria.forClass(Order.class);
		criteria.createAlias("client", "client");
		criteria.add(dis);

		List<Order> list = getHibernateTemplate().findByCriteria(criteria);
		return list;
	}*/
	
}
