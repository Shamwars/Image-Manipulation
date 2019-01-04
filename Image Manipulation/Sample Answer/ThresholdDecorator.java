package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;

public class ThresholdDecorator extends PictureDecorator {

  int threshold;
  
  public ThresholdDecorator(int threshold, Picture picture) {
    super(picture);
    this.threshold = threshold;
  }
  
  @Override
  public int[] getPixels() {
    int[] pixels = super.getPixels();
    for(int i = 0; i < pixels.length; i++) {
      pixels[i] = (pixels[i] < threshold)? 16777215 : 0;
    }
    return pixels;
  }

}
