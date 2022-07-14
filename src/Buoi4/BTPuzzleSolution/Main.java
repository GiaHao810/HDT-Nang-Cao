package Buoi4.BTPuzzleSolution;

import Buoi4.BTPuzzleSolution.Characters.King;
import Buoi4.BTPuzzleSolution.Characters.Knight;
import Buoi4.BTPuzzleSolution.Characters.Queen;
import Buoi4.BTPuzzleSolution.Characters.Troll;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character troll = new Troll();
        Character knight = new Knight();

        troll.fight();
        knight.fight();
        queen.fight();
        king.fight();
    }
}
