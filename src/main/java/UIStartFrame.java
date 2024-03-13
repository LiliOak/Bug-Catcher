package main.java;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** This class is the UI for the start frame, and stores specific behaviour for that frame. */
public class UIStartFrame extends UI{
    public UIStartFrame(GameManager gm) {
        super(gm);
        this.windowJFrame = getJFrame();
        
        StartFrameElements(windowJFrame);
        
    }

    private void StartFrameElements(JFrame windowJFrame){
        JPanel backgroundJPanel = createBackgroundJPanel("src\\main\\resources\\images\\backgrounds\\start-screen.gif");
        
        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel();
        title.setIcon(new ImageIcon("src\\main\\resources\\images\\title.png"));
        titlePanel.add(title);
        titlePanel.setOpaque(false);
        titlePanel.setBounds(0, 50, 800,600 );

        JButton startButton = createImageButton("src\\main\\resources\\images\\buttons\\start.png", 300, 400, 200, 100);
        startButton.addActionListener(e -> {
            windowJFrame.getContentPane().removeAll();
            windowJFrame.revalidate();
            windowJFrame.repaint();
            gm.startGame();
        });

        
        windowJFrame.add(titlePanel);
        windowJFrame.add(startButton);
        windowJFrame.add(backgroundJPanel);
        windowJFrame.setVisible(true);
    }
    
}
