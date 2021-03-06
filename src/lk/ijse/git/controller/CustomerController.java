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

package lk.ijse.git.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import lk.ijse.git.bo.BOFactory;
import lk.ijse.git.bo.custom.CustomerBO;
import lk.ijse.git.dto.CustomerDTO;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class CustomerController implements Initializable {
    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    private JFXButton btnAdd;

    CustomerBO customerBO;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        customerBO = BOFactory.getInstance().getBO(BOFactory.BOType.CUSTOMER);
    }

    public void save(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        CustomerDTO customer = new CustomerDTO(id,name,salary);

        try {
            boolean isAdded = customerBO.addCustomer(customer);
            System.out.println("isAdded = " + isAdded);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
