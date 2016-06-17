package com.example.base.daoimpl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.example.base.dao.BaseDao;



public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {
	
	/**
	 * To load all rows from the table to which classToBeLoaded is mapped.
	 * @param classToBeLoaded
	 * @return List
	 */
	public List loadAll(final Class classToBeLoaded){
		return getHibernateTemplate().loadAll(classToBeLoaded);
	}
	
	/**
	 * To load a particular row with a given primary key.
	 * @param classToBeLoaded
	 * @param identifier
	 * @return Object
	 */
	public Object load(final Class classToBeLoaded, final Serializable identifier){
		return getHibernateTemplate().load(classToBeLoaded, identifier);
	}
	
	/**
	 * @param Object to be persisted
	 * @return Identifier generated on save
	 */
	public Object save(final Object obj) {
		return getHibernateTemplate().save(obj);
	}
	
	/**
	 * Save or Update an object
	 * @param object to be persisted
	 */
	public void saveOrUpdate(final Object object) {
		getHibernateTemplate().saveOrUpdate(object);
	}
	
	/**
	 * Save or update a collections of objects
	 * @param collectionOfObjects to be persisted
	 */
	public void saveOrUpdateAll(final Collection collectionOfObjects) {
		getHibernateTemplate().saveOrUpdateAll(collectionOfObjects);
	}
	
	/**
	 * 
	 * @param object to be updated
	 */
	public void update(final Object object) {
		getHibernateTemplate().update(object);
	}
	
	/**
	 * 
	 * @param object to be deleted
	 */
	public void delete(final Object object) {
		getHibernateTemplate().delete(object);
	}
	
	/**
	 * Delete all objects inside the parameter with given primary keys.
	 * @param collectionOfObjects
	 */
	public void deleteAll(final Collection collectionOfObjects) {
		getHibernateTemplate().deleteAll(collectionOfObjects);
	}
	/**
	 * To create a Criteria object with a given class.
	 * @param classToBeQueried
	 * @return Criteria
	 */
	public Criteria createCriteria(final Class classToBeQueried) {
		return getSession().createCriteria(classToBeQueried);
	}
	/**
	 * Executes a query passed as String.
	 * @param query
	 * @return List
	 */
	public List find(final String query) {
		return getHibernateTemplate().find(query);
	}
	/**
	 * Executes a query passed as String and 1 parameter.
	 * @param query
	 * @param param
	 * @return List
	 */
	public List find(final String query, Object param) {
		return getHibernateTemplate().find(query, param);
	}
	/**
	 * Executes a query passed as String and array of parameters.
	 * @param query
	 * @param params
	 * @return List
	 */
	public List find(final String query, Object[] params) {
		return getHibernateTemplate().find(query, params);
	}
	/**
	 * Creates a SQL query.
	 * @param query
	 * @return Query
	 */
	public Query createQuery(final String query) {
		return getSession().createQuery(query);
	}
	
	/**
	 * Executes a query by passing the name of the query written inside hbm.xml
	 * @param queryName
	 * @return List
	 */
	public List findByNamedQuery(String queryName) {
		return getHibernateTemplate().findByNamedQuery(queryName);
	}
	
	/**
	 * Executes a query by passing the name of the query written inside hbm.xml and a single parameter.
	 * @param queryName
	 * @param param
	 * @return List
	 */
	public List findByNamedQuery(String queryName, Object param) {
		return getHibernateTemplate().findByNamedQuery(queryName, param);
	}
	
	/**
	 * Executes a query by passing the name of the query written inside hbm.xml and multiple parameters.
	 * @param queryName
	 * @param params
	 * @return
	 */
	public List findByNamedQuery(String queryName, Object[] params) {
		return getHibernateTemplate().findByNamedQuery(queryName, params);
	}
}
