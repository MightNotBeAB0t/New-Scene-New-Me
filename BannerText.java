import org.code.theater.*;
import org.code.media.*;

public class BannerText extends Scene {

  private String text;

  /** Constructor */
  public BannerText(String text) {
    this.text = text;
  }
  
  /**
   * Draws text coming in from right side of screen to left, 
   * Text should all leave screen based on calculator of help method
   */
  public void drawBanner(int yPos, int textSize) {
    setTextHeight(textSize);

    int xPos = 400; // start on right side of screen
    int textWidth = getEstimateLengthInPixels(text, textSize);

    while (xPos > -textWidth) {
      clear("white"); // can change to different color or image
      // drawImage("");
      
      drawText(text, xPos, yPos);
      pause(0.1); // this is the fastest it can be, can slow down
      
      xPos -= 10; // shift over by 10px, can change
    }
  }

  /**
   * Helper method, estimates the with of text in pixels
   */
  public static int getEstimateLengthInPixels(String text, int textSize) {
    // the average width per character at size 22 is ~15px, which is about 70%
    double avgWidthPerChar = 0.7 * textSize;
    // add 15% buffer to overestimate
    return (int) (text.length() * avgWidthPerChar * 1.15);
  }

  
}