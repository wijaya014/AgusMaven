/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.daoimpl;

import com.wury.app.dao.RoleDao;
import com.wury.app.entity.Role;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ABYOR
 */
@Repository
public class RoleDaoImpl extends AbstractDaoImpl<Role> implements RoleDao{
    
    public RoleDaoImpl(){
        super(Role.class);
    }
    
}
