package edu.fsu.cs.cen4021.armory;

/**
 * Created by Logan
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double reducedArmor = armor * .8;
        int damage = DAMAGE - (int) reducedArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

