package lux;

import org.lwjgl.Sys;

public class Main {

	public static void main(String[] args) {
		initNatives();
		System.out.println("Hello LWJGL " + Sys.getVersion() + "!");
	}

	private static void initNatives() {
		System.setProperty("org.lwjgl.librarypath", "lib/");
	}
}
