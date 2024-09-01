import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstWindow {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public FirstWindow(){
        super();
        
        setSize(WIDTH, HEIGHT);
        setTitle("First Window Class");

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener());
        add(endButton);
    }
}
