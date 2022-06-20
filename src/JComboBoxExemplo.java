import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxExemplo {
  public static void main(String[] args) {
    
    JFrame f = new JFrame("ComboBox");
    JComboBox<String> c = new JComboBox<String>();
    
    c.addItem("Iten1");
    c.addItem("Item2");
    c.addItem("Item3");
  
    f.add(c);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300, 300);
    f.setVisible(true);
  
  }
}
