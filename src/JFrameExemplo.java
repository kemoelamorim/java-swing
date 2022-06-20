import javax.swing.JFrame;

public class JFrameExemplo {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setSize(300, 300);
    f.setLocation(100,100);
    f.setTitle("Titulo 1");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
