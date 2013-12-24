package net.slashie.libjcsi.examples;

import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;

public class SimpleRoguelikeJCurses {
	
	public static void main(String[] args) {
		new SimpleRoguelike(new JCursesConsoleInterface());
	}

}
