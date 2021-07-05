package com.Testing_Java.JavaTest.util.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loses_when_dice_number_is_too_low() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturns(2);


        Player player = new Player(dice, 3);
        assertEquals(false, player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturns(4);

        Player player = new Player(dice, 3);
        assertEquals(false, player.play());
    }
}