package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //Add the remaining weapons here
        Weapon SimpleArrow = WeaponFactory.getWeapon("SimpleArrow");
        System.out.println("SimpleArrow has " + SimpleArrow.hit() + " of damage.");
        System.out.println("SimpleArrow was able to do " + SimpleArrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon SimpleAxe = WeaponFactory.getWeapon("SimpleAxe");
        System.out.println("SimpleAxe has " + SimpleAxe.hit() + " of damage.");
        System.out.println("SimpleAxe was able to do " + SimpleAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon SimpleMagicStaff = WeaponFactory.getWeapon("SimpleMagicStaff");
        System.out.println("SimpleMagicStaff has " + SimpleMagicStaff.hit() + " of damage.");
        System.out.println("SimpleMagicStaff was able to do " + SimpleMagicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon TheChosenOneAxe = WeaponFactory.getWeapon("TheChosenOneAxe");
        System.out.println("TheChosenOneAxe has " + TheChosenOneAxe.hit() + " of damage.");
        System.out.println("TheChosenOneAxe was able to do " + TheChosenOneAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon AncientMagicStaff = WeaponFactory.getWeapon("AncientMagicStaff");
        System.out.println("AncientMagicStaff has " + AncientMagicStaff.hit() + " of damage.");
        System.out.println("AncientMagicStaff was able to do " + AncientMagicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");
    }
}
