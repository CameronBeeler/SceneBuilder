package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

//    @FXML private Button    OKbutton;
    @FXML private Label     label;

    @FXML public void ButtonClicked()
    {
        label.setText("OK Button Pressed");
    }
}
