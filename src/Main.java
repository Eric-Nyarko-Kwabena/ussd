import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main extends Application  {



    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("frontInterface.fxml"));
        primaryStage.setTitle("ECG PREPAID USSD");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();



    }


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

                    Scene scene;
                    VBox vBox = new VBox();
                    Text text1 = new Text("1 Buy Prepaid");
                    Text text2 = new Text("2 Check Balance");
                    Text text3 = new Text("3 Previous Purchases");
                    Text text4 = new Text("4 My Account");
                    Text text5 = new Text("5 Ask for help");
                    vBox.getChildren().addAll(text1,text2,text3, text4, text5);

                    displayInput.setFont(new Font(25));
                    displayInput.setPadding(new Insets(23,0,0,0));
                    displayInput.setText(text1.getText() + "\n" + text2.getText() + "\n" + text3.getText() + "\n" + text4.getText() + "\n" + text5.getText() + "\n");
//                    scene = new Scene(vBox, 500,500);
//                    stage = new Stage();
//                    stage.setScene(scene);

                Scanner  choice = new Scanner(new InputStreamReader(InputStream.nullInputStream()));

                switch(choice.next())
                {
                    case "1":
                        Text buyPrepaid = new Text("Buy Prepaid");
                            buyPrepaid.setUnderline(true);
                            Text space = new Text("                     ");


                        StringBuilder amount = new StringBuilder("");
                        switch (amount.toString())
                        {
                            case "1":
                                Text enterAmount = new Text("Enter Amount");
                                displayInput.setText(enterAmount.getText() + "\n" );

                                StringBuilder options = new StringBuilder("");

                                switch (options.toString())
                                {
                                    case "1":
                                        Text confirmPayment = new Text("Confirm Payment");
                                        displayInput.setText(confirmPayment.getText() + "\n");


                                    case "2":
                                        Text cancel = new Text("Cancel");



                                }


                            case "2":
                                Text cancel = new Text("Enter Amount");
                                displayInput.setText(cancel.getText() + "\n" );
                        }
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

    public Scene afterDial()
    {

        Scene afterDialScene = new Scene(new AnchorPane());
        return afterDialScene;
    }



    public static void main(String[] args) {
        launch(args);
    }

}
