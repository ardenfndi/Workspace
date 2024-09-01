import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColoredWindow extends JFrame{

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public ColoredWindow(Color theColor){
        super("No Charge for Color");

        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(theColor);

        JLabel alabel = new JLabel("Close window button works");
        add(alabel);
    }

    public ColoredWindow(){
        this(Color.PINK);
    }
}
