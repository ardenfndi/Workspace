package GUIwithMenu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuDemo extends JFrame implements ActionListener {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluPanel;

    public static void main(String[] args){

        MenuDemo gui = new MenuDemo();
        gui.setVisible(true);
    }

    public MenuDemo(){

        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        add(redPanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);

        bluPanel = new JPanel();
        bluPanel.setBackground(Color.LIGHT_GRAY);
        add(bluPanel);

        JMenu colorMenu = new JMenu("Add Colors");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(this);
        colorMenu.add(redChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(this);
        colorMenu.add(whiteChoice);

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);
    }

    public void actionPerformed(ActionEvent e){
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Red")){
            redPanel.setBackground(Color.RED);
        } else if (buttonString.equals("White")){
            whitePanel.setBackground(Color.WHITE);
        } else if (buttonString.equals("Blue")){
            bluPanel.setBackground(Color.BLUE);
        } else {
            System.out.println("Unexpected Error");
        }
    }
}