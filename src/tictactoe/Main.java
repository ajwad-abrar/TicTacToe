package tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage currentStageOfTheGame;

    @Override
    public void start(Stage stage) {

        try {
            currentStageOfTheGame = stage;

            Image icon = new Image("images/tictactoe_icon.png");

            stage.getIcons().add(icon);
            stage.setTitle("TicTacToe");

            stage.setResizable(false);
            stage.setFullScreen(false);

            selectScene("classicTheme.fxml");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void selectScene(String currentScene) throws Exception{

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(currentScene)));
        Scene scene = new Scene(root);
        currentStageOfTheGame.setScene(scene);
    }
}
