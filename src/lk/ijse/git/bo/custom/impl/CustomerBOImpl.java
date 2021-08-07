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

package lk.ijse.git.bo.custom.impl;

import lk.ijse.git.bo.custom.CustomerBO;
import lk.ijse.git.dao.Custom.CustomerDAO;
import lk.ijse.git.dto.CustomerDTO;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class CustomerBOImpl implements CustomerBO {

    private CustomerDAO customerDAO;

    public CustomerBOImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) {
        return false;
    }
}
