import java.awt.*;
import javax.swing.*;

public class JRadioButtonExemplo {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    JRadioButton rBtn = new JRadioButton();
    rBtn.setText("Item para marcar");
    f.getContentPane().setLayout(new BorderLayout());
    f.add(rBtn, "Center");
    f.setSize(300, 300);
    f.setLocation(100, 100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
