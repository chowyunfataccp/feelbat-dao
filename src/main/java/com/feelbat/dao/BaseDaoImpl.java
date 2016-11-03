package com.feelbat.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("baseDao")
public class BaseDaoImpl<T> implements IBaseDao<T>{
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	

	
	@SuppressWarnings("unchecked")
	public T get(Class<T> cls,Serializable id) {
		return (T)this.getSession().get(cls, id);
	}

	public T get(String hql, Object ... param) {
		List<T> list = this.find(hql, param);
		return (null == list || list.size() == 0) ? null : list.get(0);
	}

	public Serializable save(T o) {
		return this.getSession().save(o);
	}

	public void delete(T o) {
		this.getSession().delete(o);
		
	}

	public void update(T o) {
		this.getSession().update(o);
		
	}

	public void saveOrUpdate(T o) {
		this.getSession().saveOrUpdate(o);
		
	}
	
	@Override
	public List<T> findAll(Class<T> cls) {
		String hql = "FROM " + cls.getName();
		return find(hql);
	}

	@SuppressWarnings("unchecked")
	public List<T> find(String hql) {
		return this.getSession().createQuery(hql).list();
	}
	
	void setParameter(Query query, Object ... param) {
        for (int i = 0; i < param.length; i++) {
            query.setParameter(i, param[i]);
        }
    }
	

	@SuppressWarnings("unchecked")
	public List<T> find(String hql, Object... param) {
		Query query = this.getSession().createQuery(hql);
		setParameter(query,param);
		return query.list();
	}



	public int executeHql(String hql) {
		return this.getSession().createQuery(hql).executeUpdate();
	}

	public int executeHql(String hql, Object... param) {
		Query query = this.getSession().createQuery(hql);
		setParameter(query, param);
        return query.executeUpdate();
	}


	public int count(String hql) {
		Query query = this.getSession().createQuery(hql);
		ScrollableResults sr = query.scroll();
        sr.last();
        return sr.getRowNumber() == -1 ? 0 : sr.getRowNumber() + 1;
	}

	public int count(String hql, Object... param) {
		Query query = this.getSession().createQuery(hql);
		setParameter(query, param);
        ScrollableResults sr = query.scroll();
        sr.last();
        return sr.getRowNumber() == -1 ? 0 : sr.getRowNumber() + 1;
	}
	

	@Override
    public PageList<T> findPageList(String hql, int page, int rows) {
        Query query = getSession().createQuery(hql);
        return findPageList(query, page, rows);
    }
	
	@Override
    public PageList<T> findPageList(String hql, int page, int rows,
            Object... objects) {
        Query query = getSession().createQuery(hql);
        setParameter(query, objects);
        return findPageList(query, page, rows);
    }
	 
    PageList<T> findPageList(Query query, int page, int rows) {
        ScrollableResults sr = query.scroll();
        sr.last();
        int count = sr.getRowNumber() == -1 ? 0 : sr.getRowNumber() + 1;
        query.setFirstResult((page - 1) * rows);
        query.setMaxResults(page * rows);
        return new PageList<T>(page, rows, count, query.list());
    }
	
}