package lux.graphics;

import static org.lwjgl.opengl.GL11.*;

public class Game {
    public static void setup() {
    	//glMatrixMode(GL_PROJECTION);
		//glLoadIdentity();
		//glOrtho(0, 800, 0, 600, 1, -1);
		//glMatrixMode(GL_MODELVIEW);
    }

    public static void loop() {
    	// Clear the screen and depth buffer
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		// set the color of the quad (R,G,B,A)
		//glColor3f(1f,0f,0f);

		// draw quad
		//glBegin(GL_QUADS);
  		//glVertex2f(100, 100);
    	//glVertex2f(300, 100);
    	//glVertex2f(300, 300);
    	//glVertex2f(100, 300);
    	//glEnd();
    }
}
