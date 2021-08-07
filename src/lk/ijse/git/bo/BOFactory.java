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

package lk.ijse.git.bo;

import lk.ijse.git.bo.custom.impl.CustomerBOImpl;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class BOFactory {
    public static BOFactory BOFactory;

    private BOFactory() {
    }

    public enum BOType {
        CUSTOMER, ITEM
    }


    public static BOFactory getInstance() {
        if (BOFactory == null) {
            BOFactory = new BOFactory();
        }
        return BOFactory;
    }

    public <T> T getBO(BOType serviceType) {
        switch (serviceType) {
            case CUSTOMER:
                return (T) new CustomerBOImpl();
            case ITEM:
                //return (T) new ItemBOImpl();
            default:
                return null;
        }
    }
}
