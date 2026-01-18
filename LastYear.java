import org.code.theater.*;
import org.code.media.*;

/*
 * Displays a slideshow of images representing events from last year.
 * Images are read from a text file and shown one at a time.
 */
public class LastYear extends Scene {

  // Stores image filenames and background clear color
  private String[] images;
  private String clearColor;


  // No-argument constructor

  public LastYear() {
    images = FileReader.toStringArray("data.txt");
    clearColor = "white";
  }


  // Parameterized constructor

  public LastYear(String[] images, String clearColor) {
    this.images = images;
    this.clearColor = clearColor;
  }

  /*
   * Main scene method
   * Controls what happens when this scene plays
   */
  public void drawScene() {
    drawImagesInOrder();
  }

  /*
   * Displays each image in sequence with a pause between them
   */
  public void drawImagesInOrder() {
    for (int i = 0; i < images.length; i++) {
      drawImage(images[i], 0, 0, getWidth());
      pause(1.5);
      clear(clearColor);
    }
  }
}
