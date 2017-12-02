/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onfast;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLlogin3Controller implements Initializable {

    @FXML
    private JFXTextField inuser;
    @FXML
    private Button logins;
    public String usern="admin";
    public String passw="seratussatu";
    @FXML
    private JFXPasswordField pw;
    private Label tampilPass;
    private Label tampilUser;
    String user, pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) {
        user=inuser.getText();
        pass=pw.getText();
        
        if(user.equalsIgnoreCase(usern) && pass.equalsIgnoreCase(passw)){
        try {
        
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLPembayaran.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 241);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Login Admin");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }
    
}
