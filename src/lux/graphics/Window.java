package lux.graphics;

import lux.Main;

//change this later
import org.lwjgl.opengl.GLContext;

import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.Callbacks;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Window {


    // Philip was here
    private static long window;
    private static boolean running;

    public static void init() {
        if (glfwInit() != GL_TRUE)
            Main.fatalError("Error initializing GLFW");

        glfwWindowHint(GLFW_SAMPLES, 4);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
        glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
        // THIS LINE CAUSED WINDOW CREATION TO FAIL ON SCHOOL COMPUTERS
        // look into this
        //glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW_RESIZABLE, GL_FALSE);


        if((window = glfwCreateWindow(1600, 900, "test", glfwGetPrimaryMonitor(), NULL)) == NULL)
            Main.fatalError("Error creating a window");


        running = true;

        glfwMakeContextCurrent(window);
        GLContext.createFromCurrent();
        glfwSwapInterval(1);


        GLFWKeyCallback keyCallback = new GLFWKeyCallback() {
            public void invoke(long window, int key, int scancode, int action, int mods) {
                System.out.println("key: " + key + "  scancode: " + scancode + "  action: " + action + "  mods: " + mods);
                if(key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                    this.release();
                    running = false;
                }
            }
        };

        glfwSetKeyCallback(window, keyCallback);
        GLFWErrorCallback errorCallback;
        glfwSetErrorCallback(errorCallback = Callbacks.errorCallbackPrint(System.err));



        Game.setup();

        while(running && glfwWindowShouldClose(window) != GL_TRUE) {
            // if (glfwGetKey(window, GLFW_KEY_ESCAPE) == GLFW_PRESS)
            // {
            //     running = false;
            // }
            Game.loop();
            glfwPollEvents();
            glfwSwapBuffers(window);
        }

        errorCallback.release();
    }

    public static void makeFullscreen() {

    }

    public static void makeWindowed() {

    }

    public static void terminate() {
        glfwDestroyWindow(window);
        glfwTerminate();
    }
}
