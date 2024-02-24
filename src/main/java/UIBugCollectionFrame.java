package main.java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIBugCollectionFrame extends UI{

    public UIBugCollectionFrame(GameManager gm) {
        super(gm);
        BugCollectionFrameElements(windowJFrame);
    }

    private void BugCollectionFrameElements(JFrame windowJFrame){
        JPanel backgroundJPanel = createBackgroundJPanel("src\\main\\resources\\images\\backgrounds\\pinterest_698832067209927117.jpg");

        JPanel dialogBoxJPanel = createDialogBoxJPanel("Please help me catch the bugs! I'm counting on you! \n");

        JButton bugButtons[] = new JButton[6];
        String names[] = {"1", "2", "3", "4", "5", "6"};
        int x[] = {50, 250, 450, 150, 350, 550};
        int y[] = {50, 50, 50, 200, 200, 200};

        for (int i = 0; i < bugButtons.length; ++i){
            JButton btn = createImageButton("src\\main\\resources\\images\\bug icons\\small blacked out\\" + names[i] + ".png", x[i], y[i], 150, 150);
            btn.addActionListener(e -> {
                windowJFrame.add(dialogBoxJPanel);
            });
            bugButtons[i] = btn;
            windowJFrame.add(bugButtons[i]);
        }

        windowJFrame.add(backgroundJPanel);
        windowJFrame.setVisible(true);

    }
    
}
