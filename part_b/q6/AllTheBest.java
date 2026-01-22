import javax.swing.*;
import java.awt.*;

class Panel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Color[]colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE};

        g.setFont(new Font("Serif", Font.BOLD, 30));

        int x = 50, y = 50;

        for(int i=0; i<5; i++)
        {
            g.setColor(colors[i]);
            g.drawString("All The Best", x, y);
            y += 50;
        }
    }
}

public class AllTheBest extends JFrame
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("Display");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Panel p = new Panel();

        frame.add(p);
        frame.setVisible(true);
    }
}

