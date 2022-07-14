package Buoi4.BTPuzzleSolution.Characters;

import Buoi4.BTPuzzleSolution.Character;
import Buoi4.BTPuzzleSolution.WeaponBehaviors.SwordBehavior;

public class Knight extends Character{

    public Knight(){
        setWeapon(new SwordBehavior());
    }

    @Override
    public void fight() {
        super.fight();
    }
}
