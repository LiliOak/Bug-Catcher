package main.java;

import javax.swing.JFrame;

public class GameManager {

    UI ui = new UI(this);
    private JFrame mainFrame;

    public static void main(String[] args) {
        new GameManager();
    }

    public GameManager() {
        mainFrame = createWindowJFrame();
        
        UIStartFrame startFrame = new UIStartFrame(this);
    }

    public void startGame() {
        UIFrogFrame frogFrame = new UIFrogFrame(this);
    }

    public void showBugCollectionFrame() {
        UIBugCollectionFrame bugCollectionFrame = new UIBugCollectionFrame(this);
    }

    public void showFrogFrame() {
        UIFrogFrame frogFrame = new UIFrogFrame(this);
    }

    protected JFrame getJFrame() {
        return mainFrame;
    }

    private JFrame createWindowJFrame() {
        JFrame window = new JFrame("Bug Catchers");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setResizable(false);
        window.setLayout(null);
        return window;
    }
}
