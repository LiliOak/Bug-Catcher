package main.java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UIBugCollectionFrame extends UI{

    public UIBugCollectionFrame(GameManager gm) {
        super(gm);
        JFrame windowJFrame = getJFrame();
        BugCollectionFrameElements(windowJFrame);
    }

    private void BugCollectionFrameElements(JFrame windowJFrame){
        JPanel backgroundJPanel = createBackgroundJPanel("src\\main\\resources\\images\\backgrounds\\book.jpg");

        JPanel dialogBoxJPanel = createDialogBoxJPanel("This is my field notebook! I'll keep track of the bugs we find here...\n");

        JButton bugButtons[] = new JButton[6];
        String names[] = {"1", "2", "3", "4", "5", "6"};
        int x[] = {80, 210, 210, 430, 560, 560};
        int y[] = {160, 60, 260, 160, 60, 260};

        for (int i = 0; i < bugButtons.length; ++i){
            JButton btn = createImageButton("src\\main\\resources\\images\\bug icons\\small blacked out\\" + names[i] + ".png", x[i], y[i], 150, 150);
            btn.addActionListener(e -> {
                windowJFrame.add(dialogBoxJPanel);
            });
            bugButtons[i] = btn;
            windowJFrame.add(bugButtons[i]);
        }

        JButton toBugsButton = createImageButton("src\\main\\resources\\images\\buttons\\back-to-frog.png", 0, 0, 150, 150);
        toBugsButton.addActionListener(e -> {
            windowJFrame.getContentPane().removeAll();
            windowJFrame.revalidate();
            windowJFrame.repaint();
            gm.showFrogFrame();
        });

        JLabel counter = countDisplay();

        windowJFrame.add(counter);
        windowJFrame.add(toBugsButton);
        windowJFrame.add(dialogBoxJPanel);

        windowJFrame.add(backgroundJPanel);
        windowJFrame.setVisible(true);

    }
    
}
