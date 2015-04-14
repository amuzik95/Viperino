package vladosiq.viperino;

import javax.swing.*;
import java.awt.*;

public class JavaRectangleDrawingComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        for(int i=0; i<10; ++i) {
            for(int j=0; j<20; ++j) {
                g2D.drawRect(240+40*(j),160+40*(i),40,40);
            }
        }
    }
}
