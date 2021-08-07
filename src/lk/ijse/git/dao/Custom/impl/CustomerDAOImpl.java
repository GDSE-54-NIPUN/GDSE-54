/*
 *
 *  *
 *  *  *  *  * ---------------------------------------------------------------------------------------------
 *  *  *  *  *  *  Copyright (c) IJSE-intern. All rights reserved.
 *  *  *  *  *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *  *  *  *  --------------------------------------------------------------------------------------------/
 *  *
 *  *
 *
 */

package lk.ijse.git.dao.Custom.impl;

import lk.ijse.git.dao.Custom.CustomerDAO;
import lk.ijse.git.entity.Customer;
import lk.ijse.git.util.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class CustomerDAOImpl implements CustomerDAO {

    private SessionFactory sessionFactory;

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean save(Customer entity) throws Exception {
        return false;
    }
}
