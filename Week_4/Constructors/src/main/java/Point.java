public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   Point(int jojo) {
        this(jojo, 10);
   }

   Point(int x, int y, int factor) {
        this(x * factor, y * factor);
   }

   Point() {
        this.x = 0;
        this.y = 0;
   }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
