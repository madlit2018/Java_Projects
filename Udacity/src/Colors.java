import helpers.Color;
import helpers.Rectangle;

// BlueJ project: lesson6/nested

// The x- and y- positions of the rectangles should start at
// 0, WIDTH, 2 * WIDTH, and so on.
// The colors should start at 0, end up at 255, and grow in
// equal increments.
// 7/2/13

public class Colors
{
    public static void main(String[] args)
    {
        final int WIDTH = 30;
        final int ROWS = 16;
        final int COLUMNS = 16;

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                int x = WIDTH * i;
                int y = WIDTH * j;
                Rectangle rect = new Rectangle(x, y,
                                               WIDTH - 1, WIDTH - 1);
                int blue = 255 / 15 * j;
                int green = 255 / 15 * i;
                Color fillColor = new Color(0, blue, green);
                rect.setColor(fillColor);
                rect.fill();
            }
        }
    }
}
