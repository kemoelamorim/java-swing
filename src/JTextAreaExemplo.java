import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaExemplo {
  public static void main(String[] args) {
    JFrame f = new JFrame("JTextArea");
    JTextArea tArea = new JTextArea();
    tArea.setColumns(12);
    tArea.setRows(5);
    tArea.setText("Começando a escrever.\nNa outra linha");

    f.add(tArea);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(200, 200);
    f.setVisible(true);
  }
}
