package Buoi4.BTPuzzleSolution.Characters;

import Buoi4.BTPuzzleSolution.Character;
import Buoi4.BTPuzzleSolution.WeaponBehaviors.AxeBehavior;

public class Troll extends Character{

    public Troll(){
        setWeapon(new AxeBehavior());
    }
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        super.fight();
    }
}
