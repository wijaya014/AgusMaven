/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.service;

import com.wury.app.entity.Author;
import java.util.List;

/**
 *
 * @author ABYOR
 */
public interface AuthorService {
    
    void save(Author a);
    void update(Author a);
    void delete(Integer id);
    Author findOne(Integer id);
    List<Author> findByNameLike(String authorName);
    List<Author> findAll();
    
}
