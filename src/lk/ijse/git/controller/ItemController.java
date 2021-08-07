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
import lk.ijse.git.bo.custom.ItemBO;
import lk.ijse.git.dao.Custom.ItemDAO;
import lk.ijse.git.dto.ItemDTO;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class ItemController implements Initializable {
    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPrice;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXTextField txtQty;

    private ItemBO itemBO;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        itemBO = BOFactory.getInstance().getBO(BOFactory.BOType.ITEM);
    }

    public void save(ActionEvent actionEvent) {
        String code = txtId.getText();
        String name = txtName.getText();
        double price = Double.parseDouble(txtPrice.getText());
        int qty = Integer.parseInt(txtQty.getText());

        ItemDTO itemDTO = new ItemDTO(code, name, price, qty);
        try {
            boolean isAdded = itemBO.addItem(itemDTO);
            System.out.println("isAdded = " + isAdded);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
