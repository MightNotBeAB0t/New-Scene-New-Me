import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create scene objects
    LastYear lastYear = new LastYear();
    ThisYear thisYear = new ThisYear();

    // Call top level methods
    lastYear.drawScene();
    thisYear.drawScene();

    // This is the text used in the banner.
    String text = "This is a slow slide show of my 2025 recap of the last year.......  Airsoft, Guns, Broken Expensive Monitor, Chipmunk because of Wisdom Teeth Removal. After comes what I did this Year! Got night vision goggles, Friends constantly ragebaiting, and played CounterStrike!";
      

    // Create scene objects
    BannerText scene = new BannerText(text);


    // Call top level methods
    scene.drawBanner(200, 22);
    
    // Play scenes
    Theater.playScenes(scene, lastYear, thisYear);
  }

  

  
}










/*
---------------------------------------------------
I couldn't figure out how to get text to come after the images and it was pretty late
I wanted to ask, but I didnt want to interupt you helping Sam (took a while).
Takes a while for the images to load for some reason
---------------------------------------------------
*/



