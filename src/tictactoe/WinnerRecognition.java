package tictactoe;

import javafx.scene.control.Alert;

public class WinnerRecognition {

    public void printTheNameOfTheWinnerUsingAlert(String winnerOfTheGame){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.getDialogPane().setStyle("-fx-background-color: TOMATO;");
        alert.setTitle("Winner Recognition");
        alert.setHeaderText("Congratulations!!!");
        alert.setContentText("Player  " +winnerOfTheGame+"  Has Won The Game.");
        alert.showAndWait();
    }

}
