package main.java;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/** This class is the parent class for all the UI classes, stores shared elements. */
public class UI {
    protected GameManager gm;
    protected JFrame windowJFrame;
    private int text_index;

    public UI(GameManager gm) {
        this.gm = gm;
        this.windowJFrame = gm.getJFrame();
        this.text_index = 0;
        
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

    protected JPanel createDialogBoxJPanel(String[] text) {
        JPanel textPanel = new JPanel();
        System.err.println(text_index);

        JButton previous = createImageButton("src\\main\\resources\\images\\buttons\\backwards_arrow_for_dialog.png", 0, 550, 100, 50);
        JButton next = createImageButton("src\\main\\resources\\images\\buttons\\forwards_arrow_for_dialog.png", 700, 550, 100, 50);

        JTextArea textArea = new JTextArea(text[0]);
        textArea.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setMargin(new Insets(10, 10, 10, 100));
        textArea.setForeground(Color.white);
        textArea.setBackground(Color.black);

        textPanel.add(previous);
        textPanel.add(next);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(600, 150));
        textPanel.add(scrollPane);
        
        textPanel.setOpaque(false);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        textPanel.setBounds(50, 400, 700, 150);


        next.addActionListener(e -> {
            if (text_index < text.length - 1) {
                textArea.setText(text[++text_index]);}
        });

        previous.addActionListener(e -> {
            if (text_index > 0) {
                textArea.setText(text[--text_index]);
            }
        });

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

    protected JLabel countDisplay() {
        JPanel countPanel = new JPanel();

        JLabel heart = new JLabel();
        heart.setIcon(new ImageIcon("src\\main\\resources\\images\\heart.png"));
        heart.setBounds(700, 50, 100, 100);

        JLabel count = new JLabel("0/0");
        count.setFont(new Font("Comic Sans", Font.PLAIN, 30));
        count.setForeground(Color.white);
        count.setBounds(700, 50, 100, 50);
        return count;
    } 

    protected JFrame getJFrame() {
        return windowJFrame;
    }

}
