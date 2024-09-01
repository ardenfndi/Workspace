package BorderLayoutManager;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BorderLayoutJFrame extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public BorderLayoutJFrame(){
        super("Border Layout Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel label1 = new JLabel("First label");
        add(label1, BorderLayout.NORTH);

        JLabel label2 = new JLabel("Second label");
        add(label2, BorderLayout.SOUTH);
        
        JLabel label3 = new JLabel("Third label");
        add(label3, BorderLayout.CENTER);
        
        // JLabel label4 = new JLabel("Fourth label");
        // add(label4, BorderLayout.WEST);
            
        // JLabel label5 = new JLabel("Fifth label");
        // add(label5, BorderLayout.EAST);
    }
}
