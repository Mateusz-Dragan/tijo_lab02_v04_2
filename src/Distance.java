import java.lang.Math;
public class Distance {
  public void calculateDistance(Point3D beginPoint, Point3D endPoint){
    System.out.println(Math.sqrt(Math.pow(beginPoint.x - endPoint.x,2)+Math.pow(beginPoint.y - endPoint.y,2)+Math.pow(beginPoint.z - endPoint.z,2)));
  }
}
