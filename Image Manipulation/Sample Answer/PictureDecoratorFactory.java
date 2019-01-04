package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;
import ie.cct.designpatterns.PictureFactory;
import processing.core.PImage;

public class PictureDecoratorFactory implements PictureFactory {
  
  @Override
  public Picture createPicture(PImage p) {
    return new PImageAdapter(p);
  }

  @Override
  public Picture createTintedPicture(int multiplier, Picture p) {
    return new TintDecorator(multiplier, p);
  }
  
  @Override
  public Picture createThresholdPicture(int threshold, Picture p) {
    return new ThresholdDecorator(threshold, p);
  }
  
  @Override
  public Picture createMaskedPicture(Picture mask, Picture p) {
    return new MaskDecorator(mask, p);
  }
  
  @Override
  public Picture createBlurredPicture(Picture p) {
    return new BlurDecorator(p);
  }
  
}
