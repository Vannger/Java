public class Point3d {
    private double x;
    private double y;
    private double z;

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }

    public boolean equals(Point3d other) {
        return this.x == other.x && this.y == other.y && this.z == other.z;
    }
    
    public double distanceTo(Point3d other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;
        return Math.round(Math.sqrt(dx * dx + dy * dy + dz * dz) * 100.0) / 100.0;
    }
}
