import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;

public class AppSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TabPane mainTabPane;
    
    @FXML
    private Button tabBTN1;

    @FXML
    private Button tabBTN2;

    @FXML
    private Button tabBTN3;

    @FXML
    void tabBTN1action(ActionEvent event) {

    }

    @FXML
    void tabBTN2action(ActionEvent event) {

    }

    @FXML
    void tabBTN3action(ActionEvent event) {

    }

    @FXML
    void initialize() {
        // mainTabPane = new TabPane();
        mainTabPane.setTabDragPolicy(TabPane.TabDragPolicy.REORDER);
    }
}
