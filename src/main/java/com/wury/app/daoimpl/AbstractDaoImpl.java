/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.daoimpl;

import com.wury.app.dao.AbstractDao;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ABYOR
 * @param <T>
 */
public abstract class AbstractDaoImpl<T> implements AbstractDao<T>{
    
    protected Class<T> model;
    
    @Autowired
    protected SessionFactory factory;
    
    public AbstractDaoImpl(Class<T> model){
        this.model = model;
    }

    @Override
    public void save(T t) {
        factory.getCurrentSession().save(t);
    }

    @Override
    public void update(T t) {
        factory.getCurrentSession().update(t);
    }

    @Override
    public void delete(T t) {
        factory.getCurrentSession().delete(t);
    }

    @Override
    public T findOne(Object id) {
        return (T) factory.getCurrentSession().get(model, (Serializable) id);
    }

    @Override
    public List<T> findAll() {
        return factory.getCurrentSession().createCriteria(model).list();
    }
    
}
