package tictactoe;

import java.util.ArrayList;

public class DefensiveAI extends TicTacToeAI{

    int checkGameSituationToGenerateDefensiveMove(ArrayList<String> arrayList,int firstMove,int secondMove,int thirdMove){

        String firstButton = arrayList.get(firstMove);
        String secondButton = arrayList.get(secondMove);
        String thirdButton = arrayList.get(thirdMove);

        if(isCross(firstButton) && isCross(secondButton) && !isCircle(thirdButton)){
            return thirdMove;
        }
        else if(isCross(secondButton) && isCross(thirdButton) && !isCircle(firstButton)){
            return firstMove;
        }
        else if(isCross(thirdButton) && isCross(firstButton) && !isCircle(secondButton)){
            return secondMove;
        }

        return -1;

    }

    public int getDefensiveIndex(ArrayList<String> arrayList){

        for(int i = 0; i < 7; ++i){

            if(checkGameSituationToGenerateDefensiveMove(arrayList, WinningState.arrayOfTheWinningButton[i][0], WinningState.arrayOfTheWinningButton[i][1], WinningState.arrayOfTheWinningButton[i][2]) != - 1){
                return checkGameSituationToGenerateDefensiveMove(arrayList, WinningState.arrayOfTheWinningButton[i][0], WinningState.arrayOfTheWinningButton[i][1], WinningState.arrayOfTheWinningButton[i][2]);
            }
        }

        return checkGameSituationToGenerateDefensiveMove(arrayList,2,4,6);
    }

}