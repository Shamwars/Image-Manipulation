package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;

public abstract class PictureDecorator implements Picture {

  private Picture picture;
  
  public PictureDecorator(Picture picture) {
    this.picture = picture;
  }
  
  @Override
  public int[] getPixels() {
    return picture.getPixels();
  }

  @Override
  public int getWidth() {
    return picture.getWidth();
  }

  @Override
  public int getHeight() {
    return picture.getHeight();
  }
}
