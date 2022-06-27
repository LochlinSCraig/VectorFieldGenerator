package vectorFieldGenerator;

public class Settings {
    // Created by Lochlin S. Craig
    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;
    public static final int SCALE = 20;
    public static final int ROWS = (int)Math.floor(HEIGHT / SCALE);
    public static final int COLLUMNS = (int) Math.floor(WIDTH / SCALE);
    public static final int NO_PARTICLES = 2500;
}