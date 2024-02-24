package main.java;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class UI {
    protected GameManager gm;
    protected JFrame windowJFrame;

    public UI(GameManager gm) {
        this.gm = gm;
        this.windowJFrame = createWindowJFrame();
        
    }

    protected JFrame getJFrame() {
        return windowJFrame;
    }

    private JFrame createWindowJFrame() {
        JFrame window = new JFrame("Bug Catchers");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setResizable(false);
        window.setLayout(null);
        return window;
    }

    protected JPanel createBackgroundJPanel(String filename) {
        JPanel bgPanel = new JPanel();
        JLabel bgPicture = new JLabel();
        bgPicture.setIcon(new ImageIcon(filename));
        bgPicture.setOpaque(false);
        bgPanel.add(bgPicture);
        bgPanel.setOpaque(false);
        bgPanel.setBounds(0, 0, 800, 600);
        return bgPanel;
    }

    protected JPanel createDialogBoxJPanel(String text) {
        JPanel textPanel = new JPanel();
        JTextArea textArea = new JTextArea(text);
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

    protected JPanel createTheFrogJPanel() {
        JPanel frogPanel = new JPanel();
        JLabel frog = new JLabel();
        frog.setIcon(new ImageIcon("src\\main\\resources\\images\\n" + //
                        "pc\\pinterest_698832067209927882-removebg-preview-removebg-preview.png"));
        frogPanel.add(frog);
        frogPanel.setOpaque(false);
        frogPanel.setBounds(600, 250, 200, 300);
        return frogPanel;
    }

    protected JButton createImageButton(String path, int x, int y, int width, int height) {
        JButton button = new JButton();
        button.setIcon(new ImageIcon(path));
        button.setBounds(x, y, width, height);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        return button;
    }

}
