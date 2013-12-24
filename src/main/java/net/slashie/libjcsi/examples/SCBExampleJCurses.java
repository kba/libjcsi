package net.slashie.libjcsi.examples;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;

public class SCBExampleJCurses {

	public static void main(String[] args) {
        try {
            ConsoleSystemInterface csi = new JCursesConsoleInterface();
            new SCBExample(csi);
            System.exit(0);
        } catch (ExceptionInInitializerError eiie) {
            System.out.println("Fatal Error Initializing Swing Console Box");
            eiie.printStackTrace();
            System.exit(-1);
        }
	}
}
