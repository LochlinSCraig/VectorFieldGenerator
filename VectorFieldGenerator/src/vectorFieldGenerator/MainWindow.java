package vectorFieldGenerator;
import javax.swing.JFrame;
public class MainWindow  extends JFrame{
    // Created by Lochlin S. Craig
    private MainPanel mainPanel = new MainPanel();
    public MainWindow(){
        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Settings.WIDTH,Settings.HEIGHT);
        setVisible(true);
    }
}