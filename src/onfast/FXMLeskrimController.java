/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onfast;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLeskrimController implements Initializable {

    @FXML
    private JFXTextField jam1;
    @FXML
    private JFXTextField hari1;
    @FXML
    private JFXTextField nama1;
    @FXML
    private JFXTextField total;
    @FXML
    private JFXTextField pesananEs;
    @FXML
    private Button btnNota;
    @FXML
    private Button btnhpses;
    @FXML
    private TextField nama;
    @FXML
    private TextField hari;
    @FXML
    private TextField jam;
    @FXML
    private JFXCheckBox es2;
    @FXML
    private JFXCheckBox es5;
    @FXML
    private JFXCheckBox es7;
    @FXML
    private JFXCheckBox es3;
    @FXML
    private JFXCheckBox es4;
    @FXML
    private JFXCheckBox es8;
    @FXML
    private JFXCheckBox es1;
    @FXML
    private JFXCheckBox es6;
    @FXML
    private JFXCheckBox es9;
    @FXML
    private JFXTextField jmlh1;
    @FXML
    private JFXTextField jmlh2;
    @FXML
    private JFXTextField jmlh3;
    @FXML
    private JFXTextField jmlh4;
    @FXML
    private JFXTextField jmlh5;
    @FXML
    private JFXTextField jmlh6;
    @FXML
    private JFXTextField jmlh7;
    @FXML
    private JFXTextField jmlh8;
    @FXML
    private JFXTextField jmlh9;
    
    int jumlahmakan, jumlahminum;
    int hagatotal1,hagatotal2,hagatotal3,hagatotal4,hagatotal5,hagatotal6,hagatotal7,hagatotal8;
    String menu1, menu2, menu3, menu4,menu5,menu6,menu7,menu8;
    String menu="";
    String kasir="";
    String atasnama, tampilTotalBayar, ket;
    int harga, kembalian;
    int totalbayar, atasnama1;  


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bayar(ActionEvent event) {
        String namapesan = nama.getText();
        System.out.println(nama1);
        String tglhari = hari.getText();
        System.out.println(hari1);
        String jampsn = jam.getText();
        System.out.println(jam1);
        String menuu = null;
        
         if(es1.isSelected()){
            menuu = "Ice Cream Vanilla With Oreo";
            harga = 8000;
            menu += es1.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh1.getText());
            hagatotal1=harga*jumlahmakan;
            System.out.println(hagatotal1);
        }
        if(es2.isSelected()){
            menuu = "Ice Cream Chocolate with Oreo ";
            harga = 8000;
            menu += es2.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh2.getText());
            hagatotal2=harga*jumlahmakan;
            System.out.println(hagatotal2);
        }
        if(es3.isSelected()){     
            menuu = "Ice Cream Strawberry with Oreo";
            harga = 8000;
            menu += es3.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh3.getText());
            hagatotal3=harga*jumlahmakan;
            System.out.println(hagatotal3);
        }
        if(es4.isSelected()){     
            menuu = "Ice Cream Strawberry with Marshmallow";
            harga = 10000;
            menu += es4.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh4.getText());
            hagatotal4=harga*jumlahmakan;
            System.out.println(hagatotal4);
        }
        if(es5.isSelected()){     
            menuu = "Ice Cream Chocolate with Marshmallow ";
            harga = 10000;
            menu += es5.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh5.getText());
            hagatotal5=harga*jumlahmakan;
            System.out.println(hagatotal5);
        }
        if(es6.isSelected()){  
            menuu = "Ice Cream Vanila with Marshmallow ";
            harga = 10000;
            menu += es6.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh6.getText());
            hagatotal6=harga*jumlahmakan;
            System.out.println(hagatotal6);
        }
        if(es7.isSelected()){     
            menuu = "Ice Cream Chocolate with brownies";
            harga = 12000;
            menu += es7.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh7.getText());
            hagatotal7=harga*jumlahmakan;
            System.out.println(hagatotal7);
        }
        if(es8.isSelected()){     
            menuu = "Ice Cream Strawberry with brownies";
            harga = 12000;
            menu += es8.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh8.getText());
            hagatotal8=harga*jumlahmakan;
            System.out.println(hagatotal8);
        }
        if(es9.isSelected()){     
            menuu = "Ice Cream Vanila with brownies";
            harga = 12000;
            menu += es9.getText()+", ";
            jumlahmakan=Integer.parseInt(jmlh9.getText());
            hagatotal8=harga*jumlahmakan;
            System.out.println(hagatotal8);
        }
     if(nama.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan nama");
     }else if(hari.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan hari");
     }else if(jam.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan jam");
     }else{
         String name = nama.getText();
         String harii = hari.getText();
         String waktu = jam.getText();
        nama1.setText(name);
        hari1.setText(harii);
        jam1.setText(waktu);
        pesananEs.setText(menuu);
        
     }
        totalbayar = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5+hagatotal6+hagatotal7+hagatotal8;
        tampilTotalBayar=String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
    }
     @FXML
    void hpses(ActionEvent event) {
           nama.setText("");
           jam.setText("");
           hari.setText("");
           es1.setSelected(false);
           es2.setSelected(false);
           es3.setSelected(false);
           es4.setSelected(false);
           es5.setSelected(false);
           es6.setSelected(false);
           es7.setSelected(false);
           es8.setSelected(false);
           es9.setSelected(false);
           jmlh1.setText("");
           jmlh2.setText("");
           jmlh3.setText("");
           jmlh4.setText("");
           jmlh5.setText("");
           jmlh6.setText("");
           jmlh7.setText("");
           jmlh8.setText("");
           jmlh9.setText("");
           nama1.setText("");
           hari1.setText("");
           jam1.setText("");
           pesananEs.setText("");
           total.setText("");
    }
    }
