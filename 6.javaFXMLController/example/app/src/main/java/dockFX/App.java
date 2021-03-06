/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dockFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            String javaVersion   = System.getProperty("java.version");
            String javafxVersion = System.getProperty("javafx.version");

            // Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

            Parent root = FXMLLoader.load(getClass().getResource("../FXML/App.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setMaximized(true);
            // primaryStage.setFullScreen(true);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
