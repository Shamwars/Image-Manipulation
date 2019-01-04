package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;

public class MaskDecorator extends PictureDecorator {

  private static final int BLACK = 0;
  private Picture mask;

  public MaskDecorator(Picture mask, Picture p) {
    super(p);
    this.mask = mask;
  }
  
  @Override
  public int[] getPixels() {
    int[] pixels = super.getPixels();
    for(int i = 0; i < pixels.length; i++) {
      if(mask.getPixels()[i] == BLACK) pixels[i] = BLACK;
    }
    return pixels;
  }

}
