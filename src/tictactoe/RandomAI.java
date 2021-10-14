package tictactoe;

import java.util.ArrayList;
import java.util.Random;

public class RandomAI extends TicTacToeAI{

    public int randomMoveAI(ArrayList<String> arrayList){

        Random rand = new Random();
        int randomIndex = arrayList.indexOf(arrayList.get(rand.nextInt(arrayList.size())));

        if(isCross(arrayList.get(randomIndex))|| isCircle(arrayList.get(randomIndex))){
            randomIndex = randomMoveAI(arrayList);
        }

        return randomIndex;
    }

}
