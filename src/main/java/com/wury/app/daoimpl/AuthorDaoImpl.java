/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.daoimpl;

import com.wury.app.dao.AuthorDao;
import com.wury.app.entity.Author;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ABYOR
 */
@Repository
public class AuthorDaoImpl extends AbstractDaoImpl<Author> implements AuthorDao{
    
    public AuthorDaoImpl(){
        super(Author.class);
    }
    
}
