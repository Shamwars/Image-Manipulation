package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;
import processing.core.PImage;

public class PImageAdapter implements Picture {

  PImage image;
  
  public PImageAdapter(PImage image) {
    this.image = image;
  }
  
  @Override
  public int[] getPixels() {
    return image.pixels;
  }
  
  @Override
  public int getWidth() {
    return image.width;
  }
  
  @Override
  public int getHeight() {
    return image.height;
  }
  
}
