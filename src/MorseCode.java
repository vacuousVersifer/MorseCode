import javax.swing.JFrame;
import java.awt.Dimension;

public class MorseCode {
  public static final int WIDTH = 300, HEIGHT = WIDTH / 9 * 12;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Morse Decoder");

    final Dimension dimension = new Dimension(WIDTH, HEIGHT);

    frame.setPreferredSize(dimension);
    frame.setMaximumSize(dimension);
    frame.setMinimumSize(dimension);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}