package pkg1intface.fxmx1;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FrontController  implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        try {
            Parent parent = FXMLLoader.load(url,resourceBundle);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
