package main.java;

import java.awt.*;
import javax.swing.*;

public class UI {
    GameManager gm;

    JFrame window;
    JPanel bgPanel;
    JLabel bgPicture;
    JTextArea textArea;
    JLayeredPane layeredPane;

    public UI(GameManager gm) {
        this.gm = gm;
        createMainWindow();
        createBackground();
        createTextArea();
        createTheFrog();
        window.setVisible(true);
    }

    public void createMainWindow() {
        window = new JFrame("Bug Catcher Game");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a main JPanel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        window.add(mainPanel);

        // Create a layered pane for background and frog
        layeredPane = new JLayeredPane();
        mainPanel.add(layeredPane, BorderLayout.CENTER);
    }

    private void createBackground() {
        bgPanel = new JPanel();
        bgPicture = new JLabel();
        bgPicture.setIcon(new ImageIcon("src\\main\\resources\\images\\backgrounds\\pinterest_698832067209927748.jpg"));
        bgPanel.add(bgPicture);
        bgPanel.setBounds(0, 0, 800, 600);
        bgPanel.setOpaque(true); // Ensure that background panel is opaque
    
        // Add the background panel to the lowest layer
        layeredPane.add(bgPanel, JLayeredPane.DEFAULT_LAYER);
    }
    

    private void createTextArea() {
        textArea = new JTextArea("Welcome to Bug Catching, new guy! There are ??? bugs loose in the code, and your job is to help correct them. But don't stress too much! I'm here to help you out.\n");
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Consolas", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        // Add the text area to a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(700, 150));

        // Add the scroll pane to the south of the main panel
        window.getContentPane().add(scrollPane, BorderLayout.SOUTH);
    }

    private void createTheFrog() {
        JLabel frog = new JLabel();
        frog.setIcon(new ImageIcon("src\\main\\resources\\images\\npc\\pinterest_698832067209927882-removebg-preview.png"));
        frog.setBounds(300, 200, 200, 200); // You may adjust this based on your layout
        window.add(frog);
    }

    private void updateTextArea(String newText) {
        textArea.setText(newText);
    }

    private void updateBackground(String newBackgroundFilename) {
        bgPicture.setIcon(new ImageIcon(newBackgroundFilename));
    }
}
