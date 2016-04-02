/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.dao;

import java.util.List;

/**
 *
 * @author ABYOR
 * @param <T>
 */
public interface AbstractDao <T>{
    
    void save(T t);
    void update(T t);
    void delete(T t);
    T findOne(Object id);
    List<T> findAll();
    
}
