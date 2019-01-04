package ie.cct.designpatterns.s12345;

import processing.core.PApplet;
import processing.core.PImage;


public class ImageApplet extends PApplet {
  
  private Picture p;

  public static void main(String[] args) {
    PApplet.main(ImageApplet.class);
  }
  
  @Override
  public void settings() {
    PictureFactory factory = new YourPictureFactoryImplementation();
    p = factory.createTintedPicture(2, factory.createPicture(loadImage("decorator_crab.jpg")));
    size(p.getWidth(), p.getHeight());  
  }
  
  @Override
  public void setup() {
    PImage pic = new PImage(p.getWidth(), p.getHeight());
    int[] pixels = p.getPixels();
    for(int i = 0; i < p.getWidth()*p.getHeight(); i++) {
      pic.pixels[i] = pixels[i];
    }
    pic.loadPixels();
    image(pic, 0, 0);
  }

}
