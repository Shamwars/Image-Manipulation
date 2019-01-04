package ie.cct.designpatterns.s12345;

import ie.cct.designpatterns.Picture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlurDecorator extends PictureDecorator {
  
  public BlurDecorator(Picture picture) {
    super(picture);
  }
  
  @Override
  public int[] getPixels() {
    int[] pixels = Arrays.copyOf(super.getPixels(), super.getPixels().length);
    for(int y = 0; y < super.getHeight(); y++) {
      for(int x = 0; x < super.getWidth(); x++) {
        pixels[y*super.getWidth()+x] = calculateAverage(super.getPixels(), x, y);
      }
    }
    return pixels;
  }

  private int calculateAverage(int[] pixels, int x, int y) {
    List<Point> neighbours = new ArrayList<>();
    neighbours.add(new Point(x, y));
    if(x-1 >= 0) neighbours.add(new Point(x-1, y));
    if(x+1 < super.getWidth()) neighbours.add(new Point(x+1, y));
    if(y-1 >= 0) neighbours.add(new Point(x, y-1));
    if(y+1 < super.getHeight()) neighbours.add(new Point(x, y+1));
    int avg = 0;
    for(Point p : neighbours) {
      avg += pixels[p.y*super.getWidth()+p.x];
    }
    return avg/neighbours.size();
  }

  private final class Point {
    private final int x; 
    private final int y;
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
