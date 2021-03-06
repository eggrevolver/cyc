package com.unlocked;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

/**
 * User: mtolstykh
 * Date: 19.08.14
 * Time: 17:15
 */
public class World {

    public static void landscape(GL2 gl2) {
        gl2.glBegin(GL.GL_POINTS);
        for (float i = -5.0f; i < 5.0f; i += 0.01)
            for (float j = -5.0f; j < 5.0f; j += 0.01) {
                if (i < 0 && j < 0) {
                    gl2.glColor3f(255, 0, 255);
                } else if (i > 0 && j > 0) {
                    gl2.glColor3f(255, 255, 255);
                } else if (i > 0 && j < 0) {
                    gl2.glColor3f(0, 255, 255);
                } else if (i < 0 && j > 0) {
                    gl2.glColor3f(255, 255, 0);
                }
                gl2.glVertex3f(i, j, 0.0f);
            }
        gl2.glEnd();
    }

    public static void pyramide(GL2 gl2) {
        gl2.glBegin(GL.GL_TRIANGLES);

        gl2.glVertex3f(0.51f, 0.49f, 0.0f);
        gl2.glVertex3f(0.5f, 0.5f, 0.05f);
        gl2.glVertex3f(0.51f, 0.51f, 0.0f);

        gl2.glVertex3f(0.49f, 0.49f, 0.0f);
        gl2.glVertex3f(0.5f, 0.5f, 0.05f);
        gl2.glVertex3f(0.51f, 0.49f, 0.0f);

        gl2.glVertex3f(0.49f, 0.51f, 0.0f);
        gl2.glVertex3f(0.5f, 0.5f, 0.05f);
        gl2.glVertex3f(0.49f, 0.49f, 0.0f);

        gl2.glVertex3f(0.51f, 0.51f, 0.0f);
        gl2.glVertex3f(0.5f, 0.5f, 0.05f);
        gl2.glVertex3f(0.49f, 0.51f, 0.0f);

        gl2.glEnd();
    }

    public static Qube qube() {
        Qube qube = new Qube(new Vertex(0.0f, 0.0f, 0.0f));
        return qube;
    }
}
