package exercise;

// BEGIN
public interface Home {
    double getArea();

    default int compareTo(Home otherHome) {
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
}
// END
