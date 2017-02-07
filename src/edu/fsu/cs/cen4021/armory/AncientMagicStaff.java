package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Logan
 */
class AncientMagicStaff extends BasicWeapon implements Weapon {

    AncientMagicStaff() {
        super(0);
        FileInputStream fis;
        List<Integer> result = new ArrayList<>();

        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("conf/ancientstaff.obj");
            ois = new ObjectInputStream(fis);
            result = (List<Integer>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                //ois.close();
            }
        }

        //raise each element to 2nd power
        for(Integer element : result) {
            element = element * element;
        }
        //remove 2nd and 5th elements
        result.remove(1);
        result.remove(4);
        //reverse
        Collections.reverse(result);
        //DAMAGE = 1 + 3 + 7
        DAMAGE = result.get(0) + result.get(2) + result.get(6);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double reducedArmor = armor * .75;
        int damage = DAMAGE - (int) reducedArmor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

