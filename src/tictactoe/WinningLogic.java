package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class WinningLogic {

    ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "initialState2", "initialState3", "initialState4", "initialState5", "initialState6", "initialState7", "initialState8", "initialState9"));

    WinnerRecognition winnerRecognition = new WinnerRecognition();

    String winnerOfTheGame;

    public boolean determineTheWinner(ArrayList<String> arrayList){

        for(int i = 0; i <= 7; ++i){

                if(Objects.equals(arrayList.get(WinningState.arrayOfTheWinningButton[i][0]), arrayList.get(WinningState.arrayOfTheWinningButton[i][1])) && Objects.equals(arrayList.get(WinningState.arrayOfTheWinningButton[i][0]), arrayList.get(WinningState.arrayOfTheWinningButton[i][2]))){

                    winnerOfTheGame = arrayList.get(WinningState.arrayOfTheWinningButton[i][0]);
                    winnerRecognition.printTheNameOfTheWinnerUsingAlert(winnerOfTheGame);
                    return true;
                }
        }

        return false;
    }

}