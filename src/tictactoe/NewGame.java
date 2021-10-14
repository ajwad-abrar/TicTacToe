package tictactoe;

import javafx.scene.image.ImageView;

public class NewGame {

    public void clearTheScreenToStartANewGame() {

            Controller.buttons.forEach(button -> {
                button.setDisable(false);
                button.setImage(null);
                button.setStyle("-fx-background-color:CORNSILK");
        });
    }

    public void disableTheClickedButton(ImageView currentButton){
        currentButton.setDisable(true);
    }
}
