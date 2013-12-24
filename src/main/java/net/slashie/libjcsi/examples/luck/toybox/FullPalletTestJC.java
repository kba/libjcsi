package net.slashie.libjcsi.examples.luck.toybox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;

public class FullPalletTestJC {

    ConsoleSystemInterface mainInterface;
    Random rng = new Random();

    public FullPalletTestJC() {
        ArrayList<CSIColor> list = new ArrayList<CSIColor>();
        for (int i = 0; i < CSIColor.FULL_PALLET.length; i++) {
            list.add(CSIColor.FULL_PALLET[i]);
        }

        Collections.sort(list);

        try {
            mainInterface = new JCursesConsoleInterface();
        } catch (ExceptionInInitializerError eiie) {
            System.out.println("Fatal Error Initializing Swing Console Box");
            eiie.printStackTrace();
            System.exit(-1);
        }
        int x = 0, times = 0;

        CSIColor tempColor = CSIColor.WHITE, backColor = CSIColor.BLACK;
        int max_y = 25;
        int max_x = 80;
        for (int k = 0; k < max_y; k++) {
            for (int i = 0; i < max_x; i++) {

                if (!(x < list.size())) {
                    x = 0;
                    times++;
                }
                tempColor = list.get(x);
                x++;
                switch (times) {
                    case 0:
                        backColor = CSIColor.BLACK;
                        break;
                    case 1:
                        backColor = CSIColor.GRAY;
                        break;
                    case 2:
                        backColor = CSIColor.WHITE;
                        break;
                    case 3:
                        backColor = CSIColor.BLACK;
                        times = 0;
                }

                mainInterface.print(i, k, 'Q', new CSIColor(tempColor), new CSIColor(backColor));
            }
        }
        mainInterface.inkey();
        mainInterface.shutdown();
    }

    public static void main(String[] args) {
        new FullPalletTestJC();
    }
}
