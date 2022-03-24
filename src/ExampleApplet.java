import processing.core.PApplet;

public class ExampleApplet extends PApplet {

    public static void main(String args[]) {
        PApplet.main("ExampleApplet");
    }

    @Override
    public void setup() {
        // TODO: Your custom drawing and setup on applet start belongs here
        clear();
        windowResizable(true);
        windowRatio(1280, 720);
        cursor(CROSS);
    }

    @Override
    public void draw() {
        // TODO: Do your drawing for each frame here
        clear();
        fill(255);
        rect(50, 50, 100, 100);
    }
}
