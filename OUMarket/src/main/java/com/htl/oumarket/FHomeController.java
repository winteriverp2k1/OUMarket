/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.htl.oumarket;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author huynh
 */
public class FHomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private Button btnExit;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void Exit (ActionEvent event)throws SQLException,  IOException{
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Bạn chuẩn bị thoát chương trình");
        alert.setContentText("Bạn có muốn thoát chương trình?");
        
        if (alert.showAndWait().get() == ButtonType.OK){
            Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }
    
}
