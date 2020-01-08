package vectorFieldGenerator;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;
public class MainPanel extends JPanel{
    // Created by Lochlin S. Craig
//    private Timer timer = new Timer(30, e -> repaint());
    private Particle[] particles = new Particle[Settings.NO_PARTICLES];
    public MainPanel(){
//        timer.start();
        for(int x = 0 ; x < this.particles.length ; x++){
            particles[x] = new Particle();
        }   
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0 ; i < 1000 ; i++){
            ImprovedNoise noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
        }
    }
}