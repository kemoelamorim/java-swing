import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutExemplo {
  public static void main(String[] args) {
    // Organiza os componentes em sequencia
    JFrame f = new JFrame("FlowLayout");
    f.setLayout(new FlowLayout());
    f.add(new JButton("Comp1"));
    f.add(new JButton("Comp2"));
    f.add(new JButton("Comp3"));
    f.add(new JButton("Comp4"));

    f.setSize(500,300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
