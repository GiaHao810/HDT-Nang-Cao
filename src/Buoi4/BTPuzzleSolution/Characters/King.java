package Buoi4.BTPuzzleSolution.Characters;

import Buoi4.BTPuzzleSolution.Character;
import Buoi4.BTPuzzleSolution.WeaponBehaviors.WhiteFlag;

public class King extends Character{

    public King(){
        setWeapon(new WhiteFlag());
    }
    @Override
    public void fight() {
        super.fight();
    }
}
