package main.java;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class UI {
    GameManager gm;
    JFrame windowJFrame;

    public UI(GameManager gm) {
        this.gm = gm;

        JFrame windowJFrame = createWindowJFrame();
        JPanel backgroundJPanel = createBackgroundJPanel();
        JPanel frogJPanel = createTheFrogJPanel();
        JPanel dialogBoxJPanel = createDialogBoxJPanel();
        JButton startButton = createTextButton("Start", 50, 50, 100, 50);

        windowJFrame.add(startButton);
        windowJFrame.add(frogJPanel);
        windowJFrame.add(dialogBoxJPanel);
        windowJFrame.add(backgroundJPanel);


        windowJFrame.setVisible(true);
    }

    private JFrame createWindowJFrame() {
        JFrame window = new JFrame("Welcome to the bug catcher!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setResizable(false);
        window.setLayout(null);
        return window;
    }

    private JPanel createBackgroundJPanel() {
        JPanel bgPanel = new JPanel();
        JLabel bgPicture = new JLabel();
        bgPicture.setIcon(new ImageIcon("src\\main\\resources\\images\\backgrounds\\pinterest_698832067209927748.jpg"));
        bgPicture.setOpaque(false);
        bgPanel.add(bgPicture);
        bgPanel.setOpaque(false);
        bgPanel.setBounds(0, 0, 800, 600);
        return bgPanel;
    }

    private JPanel createDialogBoxJPanel() {
        JPanel textPanel = new JPanel();
        JTextArea textArea = new JTextArea("Welcome to Bug Catching, new guy! There are ??? bugs loose in the code, and your job is to help correct them. But don't stress too much! I'm here to help you out.\n");
        textArea.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setMargin(new Insets(10, 10, 10, 10));
        textArea.setForeground(Color.white);
        textArea.setBackground(Color.black);


        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(700, 150));
        textPanel.add(scrollPane);
        textPanel.setOpaque(false);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        textPanel.setBounds(50, 400, 700, 150);
        return textPanel;
    }

    private JPanel createTheFrogJPanel() {
        JPanel frogPanel = new JPanel();
        JLabel frog = new JLabel();
        frog.setIcon(new ImageIcon("src\\main\\resources\\images\\n" + //
                        "pc\\pinterest_698832067209927882-removebg-preview-removebg-preview.png"));
        frogPanel.add(frog);
        frogPanel.setOpaque(false);
        frogPanel.setBounds(600, 250, 200, 300);
        return frogPanel;
    }
    
    private JButton createTextButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }

    private void createImageButton(String path, int x, int y, int width, int height) {
        JButton button = new JButton();
        button.setIcon(new ImageIcon(path));
        button.setBounds(x, y, width, height);
    }

    private void createPopupWindowWithImage(String path) {
        JFrame popup = new JFrame();
        popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        popup.setSize(400, 400);
        popup.setResizable(false);
        popup.setLayout(null);
        JLabel picture = new JLabel();
        picture.setIcon(new ImageIcon(path));
        picture.setBounds(0, 0, 400, 400);
        popup.add(picture);
        popup.setVisible(true);
    }



}
