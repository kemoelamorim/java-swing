import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelExemplo {
  public static void main(String[] args) {
    JFrame f = new JFrame("JPanel");
    JPanel p = new JPanel();
    p.add(new JLabel("Digite seu nome"));
    p.add(new JTextField(10));
    f.add(p);
    f.setSize(300, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
