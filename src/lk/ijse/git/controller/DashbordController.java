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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 8/7/2021
 **/
public class DashbordController implements Initializable {

    @FXML
    private JFXButton btnCustomer;

    @FXML
    private JFXButton btnItem;

    private Stage stage = new Stage();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void customer(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(CustomerController.class.getResource("/lk/ijse/git/view/CustomerForm.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }

    public void item(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(ItemController.class.getResource("/lk/ijse/git/view/ItemForm.fxml"));
        Scene temp = new Scene(root);
        stage.setScene(temp);
        stage.show();
    }
}
