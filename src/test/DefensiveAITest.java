package test;

import org.junit.jupiter.api.Test;
import tictactoe.DefensiveAI;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DefensiveAITest extends DefensiveAI {

    @Test
    public void shouldTestInitialDefensiveAIMove(){
        System.out.println("Testing if the initial defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "initialState2", "initialState3", "initialState4", "initialState5", "initialState6", "initialState7", "initialState8", "initialState9"));

        DefensiveAI defensiveAI = new DefensiveAI();
        int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);

        assertEquals(-1, defensiveIndex);
    }


    @Test
    public void shouldTestFirstDefensiveAIMove(){
        System.out.println("Testing if first critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("X", "X", "initialState3", "initialState4", "initialState5", "initialState6", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI(); int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(2, defensiveIndex);
    }

    @Test
    public void shouldTestSecondDefensiveAIMove(){
        System.out.println("Testing if second critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "initialState2", "initialState3", "X", "X", "initialState6", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI(); int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(5, defensiveIndex);
    }

    @Test
    public void shouldTestThirdDefensiveAIMove(){
        System.out.println("Testing if third critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "initialState2", "initialState3", "initialState4", "initialState5", "initialState6", "X", "X", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI(); int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(8, defensiveIndex);
    }

    @Test
    public void shouldTestForthDefensiveAIMove(){
        System.out.println("Testing if forth critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("X", "initialState2", "initialState3", "X", "initialState5", "initialState6", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI(); int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(6, defensiveIndex);
    }

    @Test
    public void shouldTestFifthDefensiveAIMove(){
        System.out.println("Testing if fifth critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "X", "initialState3", "initialState4", "X", "initialState6", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI(); int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(7, defensiveIndex);
    }

    @Test
    public void shouldTestSixthDefensiveAIMove(){
        System.out.println("Testing if sixth critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "initialState2", "X", "initialState4", "initialState5", "X", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI();
        int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(8, defensiveIndex);
    }

    @Test
    public void shouldTestSeventhDefensiveAIMove(){
        System.out.println("Testing if seventh critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("X", "initialState2", "initialState3", "initialState4", "X", "initialState6", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI();

        int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(8, defensiveIndex);
    }


    @Test
    public void shouldTestEighthDefensiveAIMove(){
        System.out.println("Testing if eighth critical defensive move is ok or not");
        ArrayList<String> buttonState = new ArrayList<>(Arrays.asList("initialState1", "initialState2", "X", "initialState4", "X", "initialState6", "initialState7", "initialState8", "initialState9"));
        DefensiveAI defensiveAI = new DefensiveAI();

        int defensiveIndex = defensiveAI.getDefensiveIndex(buttonState);
        assertEquals(6, defensiveIndex);
    }

}