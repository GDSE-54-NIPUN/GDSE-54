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

import lk.ijse.git.bo.custom.ItemBO;
import lk.ijse.git.dao.Custom.CustomerDAO;
import lk.ijse.git.dao.Custom.ItemDAO;
import lk.ijse.git.dao.DAOFactory;
import lk.ijse.git.dto.CustomerDTO;
import lk.ijse.git.dto.ItemDTO;
import lk.ijse.git.entity.Customer;
import lk.ijse.git.entity.Item;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class ItemBOImpl implements ItemBO {
    private ItemDAO itemDAO;

    public ItemBOImpl(ItemDAO itemDAO) {

        this.itemDAO = DAOFactory.getInstance().getRepo(DAOFactory.RepoType.ITEM);
    }

    public ItemBOImpl() {
    }

    @Override
    public boolean addItem(ItemDTO dto) throws Exception {

        return itemDAO.save(new Item(dto.getItemCode(),dto.getItemName(),dto.getPrice(),dto.getQty()));
    }
}
