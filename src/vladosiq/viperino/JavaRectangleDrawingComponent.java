package vladosiq.viperino;

import javax.swing.*;
import java.awt.*;

public class JavaRectangleDrawingComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        int[][] field = Field.getArrayField();

        for(int i=0; i<10; ++i) {
            for(int j=0; j<20; ++j) {
                switch(field[i][j]) {
                    case 1:
                        g2D.setColor(new Color(0,255,0));
                        g2D.fillRect(220+40*j, 140+40*i, 40, 40); break;
                    case 2:
                        g2D.setColor(new Color(255,0,0));
                        g2D.fillRect(220+40*j, 140+40*i, 40, 40); break;
                    default:
                        g2D.setColor(new Color(178, 191, 171));
                        g2D.drawRect(220+40*j, 140+40*i, 40, 40); break;
                }
            }
        }
    }
}
