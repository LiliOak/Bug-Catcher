package main.java;

import javax.swing.JFrame;

/** Main class that runs our minigame. */
public class GameManager {

    UI ui = new UI(this);
    private JFrame mainFrame;
    private String userName;

    public static void main(String[] args) {
        new GameManager();
    }

    public GameManager() {
        mainFrame = createWindowJFrame();
        
        /// TODO: ALL BUGS call FindGameStateAndSetFlag

        UIStartFrame startFrame = new UIStartFrame(this); 
        
    }

    //TODO BUG 1: function that reads the user_data.txt file and sets the user's name
    
    //TODO BUG 1: function that writes the user's name to the user_data.txt file

    //TODO BUG 3: function that runs the infinite execution loop - still figuring out this one (maybe a fun little ant circle that runs around the screen) (bug 2)

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
