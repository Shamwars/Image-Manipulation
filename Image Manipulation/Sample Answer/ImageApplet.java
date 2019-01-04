package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;
import ie.cct.designpatterns.PictureFactory;
import processing.core.PApplet;
import processing.core.PImage;

public class ImageApplet extends PApplet {
  
  private Picture p;

  public static void main(String[] args) {
    PApplet.main(ImageApplet.class);
  }
  
  @Override
  public void settings() {
    PictureFactory factory = new PictureDecoratorFactory();
    PImage image = loadImage("decorator_crab.jpg");
    System.out.println(image.pixels[new java.util.Random().nextInt(image.pixels.length)]);
    p = factory.createTintedPicture(2, factory.createPicture(image));
//    for(int i = 0; i < p.getHeight(); i++) {
//      for(int j = 0; j < p.getWidth(); j++) {
//        System.out.print(p.getPixels()[i*width+j]+"\t");
//      }
//      System.out.println();
//    }
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
