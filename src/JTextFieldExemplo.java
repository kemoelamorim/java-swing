import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExemplo {
  public static void main(String[] args) {
    
    JTextField t = new JTextField();
    t.setText("Digite algo aqui");
    t.setColumns(15);
    JFrame f = new JFrame();
    f.add(t);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300, 300);
    f.setVisible(true);
  }
}
