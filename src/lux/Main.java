package lux;

import java.net.URISyntaxException;

import org.lwjgl.Sys;

public class Main {

	public static void main(String[] args) throws Exception {
		initNatives();
		System.out.println("Hello LWJGL " + Sys.getVersion() + "!");
	}

	private static void initNatives() {
		String libdir = "lib/";
		try {
			String jar = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			libdir = jar.substring(0, jar.lastIndexOf("/")) + "/lib/";
		} catch(URISyntaxException e) {
			printerr("Error finding lux.jar");
		}
		System.setProperty("org.lwjgl.librarypath", libdir);
	}

	private static void printerr(Object obj) {
		System.err.print(obj);
	}
}
