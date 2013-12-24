package net.slashie.libjcsi.examples;

import net.slashie.libjcsi.CSIColor;
import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.ConsoleSystemInterface;

public class SimpleRoguelike {
    private ConsoleSystemInterface csi;
    private int a, b;
    
    public SimpleRoguelike(ConsoleSystemInterface csi) {
    	this.csi = csi;
    	run();
	}

    public void run () {
    	csi.cls();
        csi.print(5, 5, "Welcome to TEH game!", CSIColor.BABY_BLUE);
        csi.saveBuffer();
        boolean exit = false;
        while (!exit){
        	csi.restore();
            csi.print(a, b, "@", CSIColor.ATOMIC_TANGERINE);
            csi.refresh();
            int key = csi.inkey().code;
            switch (key){
            case CharKey.UARROW:
            	b--;
            	break;
            case CharKey.DARROW:
            	b++;
            	break;
            case CharKey.LARROW:
            	a--;
            	break;
            case CharKey.RARROW:
            	a++;
            	break;
            case CharKey.Q: case CharKey.q:
            	exit = true;
            }
        }
        csi.print(1, 20, "Press space to continue");
        csi.refresh();
        csi.waitKey(CharKey.SPACE);
        System.exit(0);
    }
}