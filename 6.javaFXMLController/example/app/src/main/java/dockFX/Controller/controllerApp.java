import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class controllerApp {

    @FXML
    private Button tabBTN1;

    @FXML
    private Button tabBTN2;

    public void tabBTN1action(ActionEvent e) { 
        System.out.println("Hello, World!");
    }
 
    public void tabBTN2action(ActionEvent e) { 
        System.out.println("Hello, Exit!");
    }
}
