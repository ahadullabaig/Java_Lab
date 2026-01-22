import javax.swing.*;
import java.awt.*;

public class ShortDemo extends JFrame
{
    public ShortDemo()
    {
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g)
    {
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));

        Color[]colors = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.ORANGE};

        int x = 50, y = 50;

        for(int i=0; i<5; i++)
        {
            g.setColor(colors[i]);
            g.drawString("All The Best", x, y);
            y += 50;
        }
    }

    public static void main(String[]args)
    {
        new ShortDemo();
    }
}

