package tictactoe;

import java.util.Objects;

public class TicTacToeAI {

    public boolean isCross(String move){
        return Objects.equals(move, "X");
    }

    public boolean isCircle(String move){
        return Objects.equals(move, "O");
    }
}
