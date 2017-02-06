package edu.fsu.cs.cen4021.armory;
import java.io.*;

/**
 * Created by Logan
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon {

    TheChosenOneAxe() {
        super(0);
        String fileName = "conf/thechosenone.txt";
        String currentLine = null, prevLine = null, prevLine2 = null, defLine = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((currentLine = bufferedReader.readLine()) != null) {
                //find desired line and assign it to damage
                if((prevLine == currentLine && currentLine != null) ||
                        (prevLine2 == currentLine && currentLine != null) ||
                        (prevLine == prevLine2 && prevLine != null))
                {
                    defLine = currentLine;
                }

                if(defLine != null)
                {
                    if(prevLine2 != null && prevLine2 != defLine)
                    {
                        //is damage value
                        DAMAGE = Integer.parseInt(prevLine2);
                    }
                    else if(prevLine != null && prevLine != defLine)
                    {
                        //is damage value
                        DAMAGE = Integer.parseInt(prevLine);
                    }
                    else if(currentLine != null && currentLine != defLine)
                    {
                        //is damage value
                        DAMAGE = Integer.parseInt(currentLine);
                    }
                }

                prevLine2 = prevLine;
                prevLine = currentLine;
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if (armor < 20 && armor > 0) {
            armor = 0;
        }
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}

