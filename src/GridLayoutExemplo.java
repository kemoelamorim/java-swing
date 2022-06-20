import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class GridLayoutExemplo {
  public static void main(String[] args) {
    // Cria uma Grid com quantidade de linhas e colunas
    JFrame f = new JFrame();
    f.setLayout(new GridLayout(2,2));
    f.add(new JButton("Comp1"));
    f.add(new JButton("Comp4"));
    f.add(new JButton("Comp5"));
    f.add(new JButton("Comp6"));

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500, 300);
    f.setVisible(true);
  }
}
