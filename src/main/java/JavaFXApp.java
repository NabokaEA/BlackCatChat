import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load (getClass().getResource( "MainWindow.fxml" ));
        primaryStage.setTitle( "BlackCatChat" );
        primaryStage.setScene( new Scene(root, 600 , 400 ));
        primaryStage.show();

    }
}
