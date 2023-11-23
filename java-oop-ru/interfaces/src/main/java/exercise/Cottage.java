package exercise;

// BEGIN
public class Cottage implements Home{
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    @Override
    public double getArea() {
        return area;
    }
    @Override
    public int compareTo(Home otherHome) {
        double thisArea = this.getArea();
        double otherArea = otherHome.getArea();

        if (thisArea > otherArea) {
            return 1;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }
}
// END
