/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htl.oumarket;


//import com.htl.utils.HashP;
import com.htl.utils.Utils;
import com.htl.pojo.User;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


//Controller cho Login
public class FLoginController implements Initializable {
    @FXML private AnchorPane myPane;
    @FXML private TextField txtUsername;
    @FXML private TextField txtPassword;
    @FXML private ComboBox<String> cbChucVu;
    @FXML public Button btnDangNhap;
    public static String username;
    public static boolean login = false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
                ObservableList a = FXCollections.observableArrayList("Quản lý", "Nhân viên");
               cbChucVu.setItems(a);
               
        }catch(Exception ex){
                    Logger.getLogger(FLoginController.class.getName()).log(Level.SEVERE, null, ex);      

        }
    }
    public void btnDangNhap (ActionEvent event)throws SQLException,  IOException{
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FHome.fxml"));
        Parent d = loader.load();
        Scene scene = new Scene(d);
        stage.setScene(scene);
    }
    //ban đầu abcdef
    // sau đó nhập ___abc___def___(_ là space) => xử lý sai
    // so sánh độ dài username trong textbox và username trong csdl (equalsTo)


   
   
}


