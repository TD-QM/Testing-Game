import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Screen extends JPanel implements ActionListener, KeyListener {

  Timer t = new Timer(10, this);
  Player p = new Player(350, 600, 10, 10, 0, 0);
  int x = 0;

  public Screen() {
    addKeyListener(this);
    setFocusable(true);

    t.start();

  }

  public void actionPerformed(ActionEvent e) {

    p.tick();

    repaint();

  }

  public void paint(Graphics g) {
    g.clearRect(0, 0, getWidth(), getHeight());

    p.draw(g);
  }

  public void keyTyped(KeyEvent k) {
    switch (k.getKeyCode()) {
      case KeyEvent.VK_K:
        System.out.println("K");
    }
  }

  @Override
  public void keyPressed(KeyEvent k) {

    switch (k.getKeyCode()) {

      case KeyEvent.VK_W:
        System.out.println("lfhskhfsd");
        p.setDy(-1);
        break;

      case KeyEvent.VK_A:
        p.setDx(-1);
        break;

      case KeyEvent.VK_S:
        p.setDy(1);
        break;

      case KeyEvent.VK_D:
        p.setDx(1);
        break;

    }

  }

  public void keyReleased(KeyEvent k) {
    switch (k.getKeyCode()) {

      case KeyEvent.VK_W:
        p.setDy(0);
        break;

      case KeyEvent.VK_A:
        p.setDx(0);
        break;

      case KeyEvent.VK_S:
        p.setDy(0);
        break;

      case KeyEvent.VK_D:
        p.setDx(0);
        break;
    }

  }

}