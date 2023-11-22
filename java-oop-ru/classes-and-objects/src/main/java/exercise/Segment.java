package exercise;

// BEGIN
public class Segment {
    private Point BeginPoint;
    private Point EndPoint;

    public Segment(Point beginPoint, Point endPoint) {
        BeginPoint = beginPoint;
        EndPoint = endPoint;
    }

    public Point getBeginPoint() {
        return BeginPoint;
    }

    public Point getEndPoint() {
        return EndPoint;
    }
    public Point getMidPoint() {
        int midX = (beginPoint.getX() + endPoint.getX()) / 2;
        int midY = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(midX, midY);
    }
}
// END
