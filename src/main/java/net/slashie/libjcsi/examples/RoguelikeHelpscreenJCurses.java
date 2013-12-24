package net.slashie.libjcsi.examples;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;

/**
 *
 * @author ehoward
 */
public class RoguelikeHelpscreenJCurses {

    public static void main(String[] args) {
        try {
            ConsoleSystemInterface mainInterface = new JCursesConsoleInterface();
            new RoguelikeHelpscreen(mainInterface);
        } catch (ExceptionInInitializerError eiie) {
            System.out.println("Fatal Error Initializing Swing Console Box");
            eiie.printStackTrace();
            System.exit(-1);
        }
    }
}
