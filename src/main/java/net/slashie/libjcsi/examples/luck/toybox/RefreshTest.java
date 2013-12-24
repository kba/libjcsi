package net.slashie.libjcsi.examples.luck.toybox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.ConsoleSystemInterface;

/**
 * This is a test for refreshing issues with the Swing interface.
 * @author Eben Howard
 */
public class RefreshTest {

    ConsoleSystemInterface mainInterface;
    Random rng = new Random();

    public RefreshTest(ConsoleSystemInterface csi) {
    	this.mainInterface = csi;
        ArrayList<CSIColor> list = new ArrayList<CSIColor>();
        for (int i = 0; i < CSIColor.FULL_PALLET.length; i++) {
            list.add(CSIColor.FULL_PALLET[i]);
        }

        Collections.sort(list);

        int x = 0, times = 0;
        Random rng = new Random();

        CSIColor tempColor = CSIColor.WHITE, backColor = CSIColor.BLACK;

        theLoop:
        do {
            tempColor = list.get(rng.nextInt(list.size()));
            backColor = list.get(rng.nextInt(list.size()));
            for (int k = 0; k < mainInterface.getYdim(); k++) {
                for (int i = 0; i < mainInterface.getXdim(); i++) {
                    mainInterface.print(i, k, 'X', tempColor, backColor);
                }
            }
            mainInterface.refresh();
            CharKey k = mainInterface.inkey();
            switch(k.code) {
            case CharKey.q : case CharKey.ESC :
            	break theLoop;

            }
        } while (true);
        mainInterface.shutdown();
        System.exit(0);
    }
}
