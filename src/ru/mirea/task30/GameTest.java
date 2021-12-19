package ru.mirea.task30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mirea.task14.exercise1.Game;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class GameTest {

    @Test
    public void gameTest() {
        Deque<Game.Card> deck1 = createDeck(1, 3, 5, 7, 9);
        Deque<Game.Card> deck2 = createDeck(2, 4, 6, 8, 0);

        Game game = new Game(deck1, deck2);
        Game.Result result = game.getResult();

        Assertions.assertFalse(result.isDraw());
        Assertions.assertEquals("Second", result.getWinner());
        Assertions.assertEquals(5, result.getMoves());

    }

    private static Deque<Game.Card> createDeck(Integer... values) {
        return Arrays.stream(values).map(Game.Card::new)
                .collect(Collectors.toCollection(LinkedList::new));
    }

}
