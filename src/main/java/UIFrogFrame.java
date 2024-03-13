package main.java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.resources.data.frogDialog;

public class UIFrogFrame extends UI{
    public UIFrogFrame(GameManager gm) {
        super(gm);
        JFrame windowJFrame = getJFrame();
        FrogFrameElements(windowJFrame);
    }

    private void FrogFrameElements(JFrame windowJFrame) {
        JPanel backgroundJPanel = createBackgroundJPanel("src\\main\\resources\\images\\backgrounds\\pinterest_698832067209927748.jpg");
        JPanel frogJPanel = createTheFrogJPanel();
        JPanel dialogBoxJPanel = createDialogBoxJPanel(frogDialog.getDialog(Flag.TUTORIAL));

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
