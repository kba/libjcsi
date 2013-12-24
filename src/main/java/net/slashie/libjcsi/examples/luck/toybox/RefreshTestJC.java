package net.slashie.libjcsi.examples.luck.toybox;

import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

/**
 * This is a test for refreshing issues with the Swing interface.
 * @author Eben Howard
 */
public class RefreshTestJC {

    public static void main(String[] args) {
        new RefreshTest(new JCursesConsoleInterface("Refresh Test"));
    }
}
