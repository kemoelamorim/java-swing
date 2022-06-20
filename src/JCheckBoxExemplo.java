import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxExemplo {
  public static void main(String[] args) {
    JCheckBox chBox = new JCheckBox();
    chBox.setText("Item para marcar");

    JFrame f = new JFrame("JCheckBox");
    f.add(chBox, "Center");
    f.setSize(300, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  
}
