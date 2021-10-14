package tictactoe;

import javafx.scene.image.ImageView;

public class GameUI {

    public void drawButtonX(ImageView imageViewX, int presentTheme){
        if (presentTheme == 1) {
            imageViewX.setImage(GameImage.crossIcon);
        } else if(presentTheme == 2){
            imageViewX.setImage(GameImage.flowerIcon);
        } else {
            imageViewX.setImage(GameImage.blackIcon);
        }
    }

    public void drawButtonY(ImageView imageViewY, int presentTheme){
        if (presentTheme == 1) {
            imageViewY.setImage(GameImage.circleIcon);
        } else if(presentTheme == 2){
            imageViewY.setImage(GameImage.fruitIcon);
        } else {
            imageViewY.setImage(GameImage.whiteIcon);
        }
    }

}
