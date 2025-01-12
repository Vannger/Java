import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите координаты первой точки (x y z):");
            Point3d point1 = new Point3d(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

            System.out.println("Введите координаты второй точки (x y z):");
            Point3d point2 = new Point3d(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

            System.out.println("Введите координаты третьей точки (x y z):");
            Point3d point3 = new Point3d(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

            if (point1.equals(point2) || point2.equals(point3) || point1.equals(point3)) {
                System.out.println("Точки не должны совпадать.");
                return;
            }

            double area = computeArea(point1, point2, point3);
            System.out.printf("Площадь треугольника: %.2f\n", area);
        } finally {
            scanner.close();
        }
    }
    
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);

        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
