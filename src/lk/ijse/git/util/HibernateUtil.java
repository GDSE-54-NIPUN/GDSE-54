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

package lk.ijse.git.util;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import lk.ijse.git.entity.Customer;
import lk.ijse.git.entity.Item;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buidSessionFactory();

    private static SessionFactory buidSessionFactory() {

        StandardServiceRegistry sReg = new StandardServiceRegistryBuilder()
                .loadProperties("application.properties").build();

        WSEndpointReference.Metadata mData = (WSEndpointReference.Metadata) new MetadataSources(sReg)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class).getMetadataBuilder().build();
        return ((Metadata) mData).getSessionFactoryBuilder().build();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
