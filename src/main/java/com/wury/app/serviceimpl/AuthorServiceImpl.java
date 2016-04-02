/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.serviceimpl;

import com.wury.app.dao.AuthorDao;
import com.wury.app.entity.Author;
import com.wury.app.service.AuthorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ABYOR
 */
@Service
@Transactional(readOnly = false)
public class AuthorServiceImpl implements AuthorService{
    
    @Autowired
    private AuthorDao authorDao;

    @Override
    public void save(Author a) {
        authorDao.save(a);
    }

    @Override
    public void update(Author a) {
        authorDao.update(a);
    }

    @Override
    public void delete(Integer id) {
        Author a = authorDao.findOne(id);
        authorDao.delete(a);
    }

    @Override
    @Transactional(readOnly = true)
    public Author findOne(Integer id) {
        return authorDao.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Author> findByNameLike(String authorName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly = true)
    public List<Author> findAll() {
        return authorDao.findAll();
    }
    
}
