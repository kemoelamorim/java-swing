import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelExemplo {
  public static void main(String[] args) {
    JFrame f = new JFrame("Label");
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel l = new JLabel();
    l.setText("Texto de um JLabel novo");
    
    f.add(l);
    f.setVisible(true);
  }
}
