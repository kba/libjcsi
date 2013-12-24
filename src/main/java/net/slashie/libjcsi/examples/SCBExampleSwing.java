package net.slashie.libjcsi.examples;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

public class SCBExampleSwing {

	public static void main(String[] args) {
        try {
            ConsoleSystemInterface csi = new WSwingConsoleInterface("libjcsi example - Santiago Zapata");
            new SCBExample(csi);
            System.exit(0);
        } catch (ExceptionInInitializerError eiie) {
            System.out.println("Fatal Error Initializing Swing Console Box");
            eiie.printStackTrace();
            System.exit(-1);
        }
	}
}
