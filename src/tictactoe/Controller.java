package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {

    public int presentTheme;
    public static String currentGameMode;
    public int buttonClickCount = 0;
    final int totalButton = 9;
    public boolean gameFinish = false;

    @FXML
    public ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9;

    static public ArrayList<ImageView> buttons;

    WinningLogic winningLogic = new WinningLogic();
    RandomAI randomAI = new RandomAI();
    GameUI gameUI = new GameUI();
    Main main = new Main();
    NewGame newGame = new NewGame();
    DefensiveAI defensiveAI = new DefensiveAI();

    @FXML
    public void initialize() {
        buttons = new ArrayList<>(Arrays.asList(imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9));

        if(classicTheme.isSelected()){
            presentTheme = 1;
        } else if(forestTheme.isSelected()){
            presentTheme = 2;
        } else {
            presentTheme = 3;
        }
    }

    public void setButtonState(ImageView button, String stateOfTheButton){

        for (int buttonIndex = 0; buttonIndex < totalButton; buttonIndex++) {
            if(button == buttons.get(buttonIndex)){
                winningLogic.buttonState.set(buttonIndex, stateOfTheButton);
            }
        }
    }


    public void drawButtonWhenPressed(MouseEvent event) {

        ImageView currentButton = (ImageView) event.getTarget();
        increaseButtonClickCountByOne();

        if (gameFinish) {
            return;
        }

        gameUI.drawButtonX(currentButton, presentTheme);
        setButtonState(currentButton, "X");
        newGame.disableTheClickedButton(currentButton);
        isGameCompleted();

        if (buttonClickCount < 9 && !gameFinish) {

            if (Objects.equals(currentGameMode, "defensiveAI")) {

                int defensiveButtonIndex = defensiveAI.getDefensiveIndex(winningLogic.buttonState);

                if (defensiveButtonIndex != -1) {
                    ImageView defensiveButton = buttons.get(defensiveButtonIndex);
                    drawAIButton(defensiveButton, presentTheme, "O");
                } else {
                    randomMove();
                }
            } else {
                randomMove();
            }

            increaseButtonClickCountByOne();
        }
    }

    public void randomMove(){

        if(buttonClickCount < 9 && !gameFinish) {
            int buttonIndex = randomAI.randomMoveAI(winningLogic.buttonState);
            ImageView randomButton = buttons.get(buttonIndex);
            drawAIButton(randomButton, presentTheme, "O");
        }
    }

    public void drawAIButton(ImageView AIButton, int presentTheme, String stateOfTheButton){
        gameUI.drawButtonY(AIButton, presentTheme);
        setButtonState(AIButton, stateOfTheButton);
        newGame.disableTheClickedButton(AIButton);
        isGameCompleted();
    }

    public void isGameCompleted(){
        gameFinish = winningLogic.determineTheWinner(winningLogic.buttonState);
    }

    public void increaseButtonClickCountByOne(){
        buttonClickCount++;
    }

    public void setGameModeToRandomAI(ActionEvent e) throws Exception {
        currentGameMode = "randomAI";
        startNewGame();
    }
    public void setGameModeToDefensiveAI(ActionEvent e) throws Exception {
        currentGameMode = "defensiveAI";
        startNewGame();
    }

    public void startNewGame(){
        newGame.clearTheScreenToStartANewGame();
        setNewThemeConfiguration();
    }

    @FXML
    private RadioButton classicTheme, forestTheme, highContrastTheme;

    public void toggleScene(ActionEvent e) throws Exception {

        if(classicTheme.isSelected()) {
            main.selectScene("classicTheme.fxml");
        }
        else if (forestTheme.isSelected()) {
            main.selectScene("forestTheme.fxml");
        }
        else if (highContrastTheme.isSelected()){
            main.selectScene("highContrastTheme.fxml");
        }

        setNewThemeConfiguration();
    }

    public void setNewThemeConfiguration(){
        gameFinish = false;
        winningLogic.buttonState = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i"));
        buttonClickCount = 0 ;
    }
}