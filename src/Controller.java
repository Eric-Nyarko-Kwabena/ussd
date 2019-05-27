package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    Button button = new Button();
    @FXML
    Button button2 = new Button();

    @FXML
    Button button3 = new Button();

    @FXML
    Button button4 = new Button();

    @FXML
    Button button5 = new Button();

    @FXML
    Button button6 = new Button();

    @FXML
    Button button7 = new Button();

    @FXML
    Button button8 = new Button();

    @FXML
    Button button9 = new Button();

    @FXML
    Button buttonZero = new Button();

    @FXML
    Button buttonHash = new Button();

    @FXML
    Button buttonStar = new Button();

    @FXML
    Button buttonCancel = new Button();

    @FXML
    Button buttonDelete = new Button();

    @FXML
    Button buttonSend = new Button();


    @FXML
    TextArea displayInput = new TextArea();

    public Controller() {
        displayInput.setFont(new Font(34));


        displayInput.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCharacter().matches("0123456780#9")){
                    displayInput.setText(keyEvent.getText());
                }
                else
                {
                    keyEvent.consume();
                    displayInput.clear();
                }

            }
        });



    }

    public void buttonActions() {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions2() {
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button2.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions3() {
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button3.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions4() {
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button4.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions5() {
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button5.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions6() {
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button6.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions7() {
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button7.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions8() {
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button8.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActions9() {
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = button9.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActionZero() {
        buttonZero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = buttonZero.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActionSend() throws Exception {


        buttonSend.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Parent optionTwo = FXMLLoader.load(getClass().getResource("optionselection.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }
@FXML
    public void buttonActionDelete(ActionEvent actionEvent) {
        displayInput.setText( displayInput.getText().substring(0, displayInput.getText().length()-1));

    }

    public void buttonActionCancel() {
        buttonCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                displayInput.clear();
            }
        });


    }

    public void buttonActionHash(ActionEvent actionEvent) {
        buttonHash.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = buttonHash.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    public void buttonActionStar(ActionEvent actionEvent) {
        buttonStar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String getText = buttonStar.getText();
                displayInput.setText(displayInput.getText() + getText);
            }
        });
    }

    @FXML
    public void processKeyEvent(KeyEvent ev) {
        String c = ev.getCharacter();

        if (!c.matches("[A-Za-z]")) ;
            displayInput.setText(null);
        ev.consume();

        displayInput.setText(ev.getSource().toString());

    }

}
