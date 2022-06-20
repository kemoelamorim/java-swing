import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExemplo {
  public static void main(String[] args) {

    // Border Layout: Organiza por regiões(norte, sul, centro, leste, oeste)
    
    JFrame f = new JFrame("BorderLayout");
    f.setLayout(new BorderLayout());

    f.add(BorderLayout.NORTH, new JButton("Norte"));
    f.add(BorderLayout.SOUTH, new JButton("Sul"));
    f.add(BorderLayout.EAST, new JButton("Leste"));
    f.add(BorderLayout.WEST, new JButton("Oeste"));
    f.add(BorderLayout.CENTER, new JButton("Center"));

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500, 300);
    f.setVisible(true);
  }
}
