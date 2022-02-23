public class Main {

  public static void main(String[] args) {
    Point3D beginPoint = new Point3D();
    beginPoint.setPoint(0,0,0);
    Point3D endPoint = new Point3D();
    endPoint.setPoint(20.3,100.3,109);

    Distance distance = new Distance();
    distance.calculateDistance(beginPoint,endPoint);
  }
}