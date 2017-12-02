/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onfast;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLLoginAdminController implements Initializable {
    @FXML
    private TextField useradmin;

    @FXML
    private TextField passadmin;
    
    @FXML
    private Button btnAdmin;
    private Component rootPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     void admin(ActionEvent event) throws IOException {
       Connection connection;
    PreparedStatement ps;
    
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onfast?zeroDateTimeBehavior=convertToNull","root","");
    ps = connection.prepareStatement("SELECT * FROM `login` WHERE username = ? AND password = ?");
    ps.setString(1, useradmin.getText());
    ps.setString(2, passadmin.getText());
    ResultSet result = ps.executeQuery();
    if(result.next()){
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Sukses Login COY !!!");
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLWaffle.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 487, 310);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Login Admin");
            stage.show();
        
              
    } else {
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Remed Login Coy !!!");
        passadmin.setText("");
        useradmin.requestFocus();
    }
    }   catch (java.sql.SQLException ex) {
           javax.swing.JOptionPane.showMessageDialog(rootPane,"gagal");
        }      
        
        
//        if(username.equalsIgnoreCase("tomboluwe") && password.equalsIgnoreCase("mangan")){
//          Parent Home = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
//          Scene homescene = new Scene(Home);
//          Stage on = (Stage)((Node)event.getSource()).getScene().getWindow();
//          on.setScene(homescene);
//            on.show();
//        }
    }
    }
