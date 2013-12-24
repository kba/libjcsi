package net.slashie.libjcsi.examples;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

/**
 *
 * @author ehoward
 */
public class RoguelikeHelpscreenSwing {

    public static void main(String[] args) {
        try {
            ConsoleSystemInterface mainInterface = new WSwingConsoleInterface("Swing Tutorial");
            new RoguelikeHelpscreen(mainInterface);
        } catch (ExceptionInInitializerError eiie) {
            System.out.println("Fatal Error Initializing Swing Console Box");
            eiie.printStackTrace();
            System.exit(-1);
        }
    }
}
