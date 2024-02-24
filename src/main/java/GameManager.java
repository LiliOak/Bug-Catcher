package main.java;

import javax.swing.JFrame;

public class GameManager {

    UI ui = new UI(this);
    private JFrame mainFrame;

    public static void main(String[] args) {
        new GameManager();
    }

    public GameManager() {
        mainFrame = ui.getJFrame();
        UIStartFrame startFrame = new UIStartFrame(this);
    }

    public void startGame() {
        UIFrogFrame frogFrame = new UIFrogFrame(this);
    }

    public void showBugCollectionFrame() {
        UIBugCollectionFrame bugCollectionFrame = new UIBugCollectionFrame(this);
    }
}
