package lux;

import lux.graphics.Window;
import java.net.URISyntaxException;

import org.lwjgl.Sys;

public class Main {

	public static void main(String[] args) throws Exception {
		initNatives();
		Window.init();
		Window.terminate();
	}

	private static void initNatives() {
		String libDir = "lib/";
		try {
			String jarPath = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			libDir = jarPath.substring(0, jarPath.lastIndexOf("/")) + "/lib/";
		} catch(URISyntaxException e) {
			printerr("Error finding lux.jar");
		}
		// more things might actually make native loading fail
		System.setProperty("org.lwjgl.librarypath", libDir);
	}

 	public static void printerr(Object obj) {
		System.err.print(obj);
	}

	public  static void fatalError(Object obj) {
		printerr(obj);
		System.exit(-1);
	}
}
