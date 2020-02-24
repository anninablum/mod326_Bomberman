package bomberman.clienttesting;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MotionListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = (int) (e.getPoint().getX() / Constants.SQUARE_SIZE);
        int y = (int) (e.getPoint().getY() / Constants.SQUARE_SIZE);

        System.out.println("Clicked: [X=" + x + ", Y=" + y + "]");
    }
}
