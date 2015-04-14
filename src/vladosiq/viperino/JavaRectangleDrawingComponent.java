package vladosiq.viperino;

import javax.swing.*;
import java.awt.*;

public class JavaRectangleDrawingComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        for(int i=0; i<10; ++i) {
            for(int j=0; j<20; ++j) {
                if(i==5 && (j>5 && j<10)) {
                    g2D.setColor(new Color(0,255,0));
                    g2D.fillRect(220 + 40 * (j), 140 + 40 * (i), 40, 40);
                }
                else if(i==8 && j==8) {
                    g2D.setColor(new Color(255, 120, 120));
                    g2D.fillRect(220 + 40 * (j), 140 + 40 * (i), 40, 40);
                }
                else {
                    g2D.setColor(new Color(40, 36, 33));
                    g2D.drawRect(220 + 40 * (j), 140 + 40 * (i), 40, 40);
                }

            }
        }
    }
}
