package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.security.Key;

import static javafx.scene.input.KeyCode.*;

public class HelloController {
    @FXML
    TextArea textArea;

    @FXML
    Button button;

    @FXML
    TextField textField;


    public void sendMessage(){
        textArea.appendText(textField.getText()+ "\n");
            textField.clear();
            textField.requestFocus();
    }
    @FXML
    protected void keySendMessage(KeyEvent kEnter){
        if (kEnter.getCode() == KeyCode.ENTER) {
            sendMessage();
        }
    }
}