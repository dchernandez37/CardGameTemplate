package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point of Application
 * @author David C Hernandez
 */
public class Main extends Application {
    private static final String FXML_FILE = "sample.fxml";
    private static final String TITLE = "Guess The sample.Card";
    protected static final Double STAGE_WIDTH = 700d;
    protected static final Double STAGE_HEIGHT = 600d;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(FXML_FILE));
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(new Scene(root, STAGE_WIDTH, STAGE_HEIGHT));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
