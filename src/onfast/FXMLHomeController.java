/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onfast;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private Button btnadminnext;
    @FXML
    private Button btnpelanggannext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adminnext(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLlogin3.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 414, 765);         
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Welcome Admin");
            stage.show();
    }

    @FXML
    private void pelangganext(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 722, 618);         
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Welcome Pelanggan");
            stage.show();
    }
    
}
