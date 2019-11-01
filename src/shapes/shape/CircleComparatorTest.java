package shapes.shape;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.0);
        circles[1] = new Circle();
        circles[2] = new Circle(2.0, "red", false);

        System.out.println("Pre-resize");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

//        circles[0].resize(5);
//        Comparator circleComparator = new CircleComparator();
//        Arrays.sort(circles, circleComparator);

        System.out.println("After-resize");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
