import org.code.theater.*;
import org.code.media.*;

/*
 * Displays a slideshow representing activities and interests this year.
 * Each image is shown with a short caption.
 */
public class ThisYear extends Scene {

  // Image filenames and corresponding captions
  private String[] pictures;
  private String[] captions = {
    "NVG",
    "Hmmm",
    "Counter Strike"
  };

  // No argument constructor
  public ThisYear() {
    pictures = new String[] {
      "NVG.jpg",
      "Hmmm.jpg",
      "CounterStrike.png"
    };
  }

  
   // Parameterized constructor
   
  public ThisYear(String[] pictures) {
    this.pictures = pictures;
  }


   // Main scene method
  public void drawScene() {
    drawImagesWithCaptions();
  }

  /*
   * Displays each image with its caption and a timed pause
   */
  public void drawImagesWithCaptions() {
    setCaptionStyle();

    for (int i = 0; i < pictures.length; i++) {
      drawImage(pictures[i], 0, 0, getWidth());
      drawText(captions[i], 50, getHeight() - 40);
      pause(2.0);
      clear("white");
    }
  }

  /*
   * Sets the font style used for captions
   */
  public void setCaptionStyle() {
    setTextHeight(30);
    setTextColor("white");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }
}
