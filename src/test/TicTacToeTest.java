package test;

import javafx.embed.swing.JFXPanel;
import org.junit.jupiter.api.Test;
import tictactoe.Controller;
import tictactoe.RandomAI;
import tictactoe.TicTacToeAI;


import static org.junit.jupiter.api.Assertions.*;
class TicTacToeTest {

    JFXPanel jfxPanel = new JFXPanel();

    @Test
    public void shouldTestInitialButtonCount(){
        System.out.println("Testing Initial Button Count");
        Controller controller = new Controller();
        int initialButtonCount = controller.buttonClickCount;
        assertEquals(0, initialButtonCount);
    }

    @Test
    public void shouldTestInitialGameFinishState(){
        System.out.println("Initial Game Finish Testing");
        Controller controller = new Controller();
        assertFalse(controller.gameFinish);
    }

    @Test
    public void shouldTestIfCrossButtonIsRecognized(){
        System.out.println("Testing if cross button can be recognized correctly");
        TicTacToeAI ticTacToeAI = new TicTacToeAI();
        boolean isX = ticTacToeAI.isCross("X");
        assertTrue(isX);
    }

    @Test
    public void shouldTestIfCircleButtonIsRecognized(){
        System.out.println("Testing if circle button can be recognized correctly");
        TicTacToeAI ticTacToeAI = new TicTacToeAI();
        boolean isO = ticTacToeAI.isCircle("O");
        assertTrue(isO);
    }
}