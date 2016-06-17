package com.example.base.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

public interface BaseDao {
	
	//---------- Retrieval related methods
	/**
	 * Loads all objects for the given class.
	 * @param classToBeLoaded
	 * @return List
	 */
	List loadAll(Class classToBeLoaded);
	/**
	 * Load a particular object with given unique identifier.
	 * @param classToBeLoaded
	 * @param identifier
	 * @return Object
	 */
	Object load(Class classToBeLoaded, Serializable identifier);
	
	
	//----------- Save/Update related methods
	/**
	 * Save an object.
	 * @param Object
	 * @return Object the identifier generated
	 */
	Object save(Object obj);
	/**
	 * Save or Update an object.
	 * @param object
	 */
	void saveOrUpdate(Object object);
	/**
	 * Save or Update a collection of objects.
	 * @param collectionOfObjects
	 */
	void saveOrUpdateAll(Collection collectionOfObjects);
	/**
	 * Update an object
	 * @param object
	 */
	void update(Object object);
	
	
	//---------- Deletion
	/**
	 * Delete an object.
	 * @param object
	 */
	void delete(Object object);
	/**
	 * Delete the whole collection of objects.
	 * @param collectionOfObjects
	 */
	void deleteAll(Collection collectionOfObjects);
	
	
	//--------- Query
	/**
	 * Creates a Criteria object for the given class.
	 * @param classToBeQueried
	 * @return Criteria
	 */
	Criteria createCriteria(Class classToBeQueried);
	/**
	 * Executes a HQL query and returns a List of result objects
	 * @param query
	 * @return List
	 */
	List find(String query);
	/**
	 * Executes a HQL query with a given parameter.
	 * @param query
	 * @param param
	 * @return List
	 */
	List find(String query, Object param);
	/**
	 * Executes a HQL query with multiple parameters.
	 * @param query
	 * @param param
	 * @return List
	 */
	List find(String query, Object[] param);
	
	/**
	 * SQL Query.
	 * @param query
	 * @return Query
	 */
	Query createQuery(String query);

}
