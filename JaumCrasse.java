import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by a1647881 on 23/05/16.
 */
public class JaumCrasse extends JLabel {
    BufferedImage ibage;
    public double rotarion;

    public JaumCrasse(){
        try {
            ibage = ImageIO.read(getClass().getResourceAsStream("/elehomi.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void paint(Graphics gp){

        Graphics2D opeq =  (Graphics2D) gp;
        opeq.rotate(Math.toRadians(rotarion),getWidth()/2,getHeight()/2);

     super.paint(gp);
        gp.drawImage(ibage,0,0,getWidth(),getHeight(),null);
    }
}
