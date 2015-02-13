package lux.graphics;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;
import org.lwjgl.BufferUtils.*;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;

public class Game {
    public static void setup() {
        //match opengl view port with window size
        glViewport(0, 0, 1600, 900);

        //enable blending, can cause transpart objects to render oddly without
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

        //sets screen to this color, RGBA, 0 - 1
        glClearColor(0f, 0f, 0f, 0f);
    }

    public static void loop() {
        //clears screen buffer
    	glClear(GL_COLOR_BUFFER_BIT);

        //expected counter clockeise
        float[] triangle = {
            -1f, -1f, 0f,
            0f, 1f, 0f,
            1f, -1f, 0f,
        };

        FloatBuffer triBuffer = BufferUtils.createFloatBuffer(triangle.length);
        triBuffer.put(triangle);
        triBuffer.flip();

        // Create VAO and select it (bind)
        int vaoId = glGenVertexArrays();
        glBindVertexArray(vaoId);

        // Create VBO and select it (bind)
        int vboId = glGenBuffers();

        glBindBuffer(GL_ARRAY_BUFFER, vboId);
        glBufferData(GL_ARRAY_BUFFER, triBuffer, GL_STATIC_DRAW);

        // Put the VBO in the attributes list at index 0
        glVertexAttribPointer(0, 3, GL_FLOAT, false, 0, 0);

        // Deselect (bind to 0) the VBO
        glBindBuffer(GL_ARRAY_BUFFER, 0);

        // Deselect (bind to 0) the VAO
        glBindVertexArray(0);
    }
}
