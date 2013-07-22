import helpers.*;

// Bluej project: lesson6/dim
// Dim the image set the 5th pixel to black 6/26/13



public class Dim
{
    public static void main(String[] args)
    {
        Picture pic = new Picture("arm.png");
        pic.draw();
        //pic.pause();
        // TODO iterate over the pixels in the image turning every 5th one to Color.BLACK
        // your code here.
        for (int i = 0; i < pic.pixels(); i = i + 5) {
        	// Process c
        	pic.setColorAt(i, Color.BLACK);
        }
    }
}
