package vectorFieldGenerator;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class MainPanel extends JPanel{
    // Created by Lochlin S. Craig
//    private Timer timer = new Timer(10, e -> repaint());
    private Particle[] particles = new Particle[Settings.NO_PARTICLES];
    public MainPanel(){
//        timer.start();
//        timer.setDelay(100);
        for(int x = 0 ; x < this.particles.length ; x++){
            particles[x] = new Particle();
        }   
    }
    @Override
    protected void paintComponent(Graphics g){
        int index = 0;
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(index = 0; index < 100 ; index++){
            ImprovedNoise noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
            noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
            noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
            noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
            noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
            noise = new ImprovedNoise(particles);
            noise.getVectorGrid(g2);
            System.out.println(index);
        }
    }
}