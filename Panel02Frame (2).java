import javax.swing.*;
import java.awt.*;

public class Panel02Frame extends JPanel {
	
	public void paintComponent(Graphics g) {
        g.setColor(Color.GRAY);

        g.fillRect(-10, 0, 800, 800);
        g.setColor(Color.BLACK); 

        int borderWidth = 30; // Width of the border around the image
        int radius = 20; // Radius of the circles
        int spacing = 5; // Spacing between circles
        for (int x = 200 - borderWidth - radius; x <= 500 + borderWidth; x += (2 * radius + spacing)) {
            g.fillOval(x, 200 - borderWidth - radius, 2 * radius, 2 * radius); // Top border
            g.fillOval(x, 500 + borderWidth - radius, 2 * radius, 2 * radius); // Bottom border
        }

        for (int y = 200 - borderWidth - radius; y <= 500 + borderWidth; y += (2 * radius + spacing)) {
            g.fillOval(200 - borderWidth - radius, y, 2 * radius, 2 * radius); // Left border
            g.fillOval(500 + borderWidth - radius, y, 2 * radius, 2 * radius); // Right border
        }

        ImageIcon pic = new ImageIcon("C:/Users/farha/Downloads/tj.jpg");

        g.drawImage(pic.getImage(), 172, 170, 360, 360, null);
        g.setFont(new Font("Serif", Font.BOLD, 50));
        g.setColor(Color.BLACK);
        g.drawString("My Fearless Leader", 150, 600);
    }
}
