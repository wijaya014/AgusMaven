/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.serviceimpl;

import com.wury.app.dao.RoleDao;
import com.wury.app.entity.Role;
import com.wury.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ABYOR
 */
@Service
public class RoleServiceImpl implements RoleService{
    
    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional(readOnly = true)
    public Role fineOne(Integer id) {
        return roleDao.findOne(id);
    }
    
}
