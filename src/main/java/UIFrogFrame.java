package main.java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.resources.data.frogDialog;

/** This class is the UI for the frog frame, and stores specific behaviour for that frame. */
public class UIFrogFrame extends UI{
    public UIFrogFrame(GameManager gm) {
        super(gm);
        JFrame windowJFrame = getJFrame();
        FrogFrameElements(windowJFrame);
    }

    /// TODO BUG 1: pop up that asks user for their name during tutorial, and then stores it in the user_data.txt file (bug 1)

    /// TODO BUG 2: function that sets the counter based on the user's progress

    private void FrogFrameElements(JFrame windowJFrame) {
        JPanel backgroundJPanel = createBackgroundJPanel("src\\main\\resources\\images\\backgrounds\\pinterest_698832067209927748.jpg");
        JPanel frogJPanel = createTheFrogJPanel();
        JPanel dialogBoxJPanel = createDialogBoxJPanel(frogDialog.getDialog(FindGameStateAndSetFlag.flag));

        JButton toBugsButton = createImageButton("src\\main\\resources\\images\\buttons\\back-to-bugs.png", 0, 0, 150, 150);
        toBugsButton.addActionListener(e -> {
            windowJFrame.getContentPane().removeAll();
            windowJFrame.revalidate();
            windowJFrame.repaint();
            gm.showBugCollectionFrame();
        });

        JLabel counter = countDisplay();

        windowJFrame.add(counter);
        windowJFrame.add(toBugsButton);
        windowJFrame.add(frogJPanel);
        windowJFrame.add(dialogBoxJPanel);
        windowJFrame.add(backgroundJPanel);
        windowJFrame.setVisible(true);
    }
    
}
