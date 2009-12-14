package org.jobs.persistence.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.jobs.persistence.bean.Order;
import org.jobs.persistence.dao.OrderDao;

@SuppressWarnings("unchecked")
public class OrderDaoImpl extends DaoImpl<Order> implements OrderDao {

	public OrderDaoImpl() {
	}

	@Override
	public List<Order> getAll() {
		return getHibernateTemplate().find("from Order");
	}

	@Override
	public Order get(Long id) {
		return get(Order.class, id);
	}

	@Override
	public List<Order> searchOrder(String search) {
		Disjunction dis = Restrictions.disjunction();
		dis.add(Restrictions.like("client.firstName", search, MatchMode.ANYWHERE));
		dis.add(Restrictions.ilike("client.middleName", search, MatchMode.ANYWHERE));
		dis.add(Restrictions.ilike("client.lastName", search, MatchMode.ANYWHERE));

		DetachedCriteria criteria = DetachedCriteria.forClass(Order.class);
		criteria.createAlias("client", "client");
		criteria.add(dis);

		List<Order> list = getHibernateTemplate().findByCriteria(criteria);
		return list;
	}

}
