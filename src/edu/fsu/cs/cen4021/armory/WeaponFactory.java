/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen4021.armory;

/**
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "SimpleArrow":
                return new SimpleArrow();
            case "SimpleAxe":
                return new SimpleAxe();
            case "SimpleMagicStaff":
                return new SimpleMagicStaff();
            case "TheChosenOneAxe":
                return new TheChosenOneAxe();
            case "AncientMagicStaff":
                return new AncientMagicStaff();

            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
