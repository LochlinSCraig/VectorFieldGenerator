package vectorFieldGenerator;
import javax.swing.SwingUtilities;
public class Main {
    // Created by Lochlin S. Craig
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new MainWindow();
            }
        });
//        ImprovedNoise noise = new ImprovedNoise();
//        for(double x = 0.0 ; x < 1.0 ; x += 0.1){
//            double val = noise.noise(x, x, x);
//            System.out.println(val);
//            System.out.println((val - 1) / 2);
//        }
    }
}
