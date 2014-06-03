package de.berndclaasen.calenderapp.backend.generic.dao;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Repository
@Scope( ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public class GenericHibernateDao< T extends Serializable >
  extends AbstractHibernateDao< T > implements IGenericDao< T >{
   //
}
