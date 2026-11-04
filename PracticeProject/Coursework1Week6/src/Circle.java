public class Circle {
    private double CenterX = 0.0;
    private double CenterY = 0.0;
    private double radius = 1.0;

    public Circle (double CenterX, double CenterY, double radius) {
        if (radius <= 0) {
            radius = 1.0;
        }
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
    }

    public Circle (double radius) {
        this(0.0, 0.0, radius);
    }

    public Circle () {
        this(0.0, 0.0, 1.0);
    }

    public void setCenter (double NewX, double NewY) {
        this.CenterX = NewX;
        this.CenterY = NewY;
    }

    public void setRadius (double NewRadius) {
        if (NewRadius > 0.0) {
            this.radius = NewRadius;
        }


    }

    public double getCenterX () {
        return this.CenterX;
    }

    public double getCenterY () {
        return this.CenterY;
    }

    public double getRadius () {
        return this.radius;
    }

    public double getArea () {
        return (this.radius * this.radius * Math.PI);
    }

    public double getCircumference () {
        return (2 * this.radius * Math.PI);
    }

    public String toString () {
        return "Circle(center=(" + this.CenterX + ", " + this.CenterY + "), "
                + "radius=" + this.radius + ")";
    }



}
