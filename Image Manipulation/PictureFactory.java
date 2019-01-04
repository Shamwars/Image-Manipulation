package ie.cct.designpatterns.s12345;

import processing.core.PImage;

public interface PictureFactory {

  public Picture createPicture(PImage p);

  public Picture createTintedPicture(int multiplier, Picture p);
  
  public Picture createThresholdPicture(int threshold, Picture p);
  
  public Picture createMaskedPicture(Picture mask, Picture p);
  
  public Picture createBlurredPicture(Picture p);

}
