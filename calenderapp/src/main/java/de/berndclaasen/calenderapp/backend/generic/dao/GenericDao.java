package de.berndclaasen.calenderapp.backend.generic.dao;

import java.util.List;


public interface GenericDao<T> {
    /**
     * Method that returns the number of entries from a table that meet some
     * criteria (where clause params)
     *
     * @param params
     *            sql parameters
     * @return the number of records meeting the criteria
     */

    void create(T t);

    void delete(T id);

    T findOne( long id );

    T update(T t); 
    
    List<T> findAll();
}
