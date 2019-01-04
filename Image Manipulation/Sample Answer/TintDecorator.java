package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;

public class TintDecorator extends PictureDecorator {

  private int multiplier;

  public TintDecorator(int multiplier, Picture picture) {
    super(picture);
    this.multiplier = multiplier;
  }
  
  @Override
  public int[] getPixels() {
    int[] pixels = super.getPixels();
    for(int x = 0; x < pixels.length; x++) {
      pixels[x] *= multiplier;
    }
    return pixels;
  }

}
