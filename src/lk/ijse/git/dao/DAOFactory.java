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

package lk.ijse.git.dao;

import lk.ijse.git.dao.Custom.impl.CustomerDAOImpl;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class DAOFactory {
    public enum RepoType {
        CUSTOMER, ITEM;
    }

    public static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public <T>T getRepo(RepoType repoType) {
        switch (repoType) {
            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            case ITEM:
                //return (T) new CourseDAOImpl();
            default:
                return null;
        }
    }
}
