public class Triangle extends GeomitricObject{
    private double s1,s2,s3;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public Triangle(double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }

    @Override
    public double area() {
        return 0.5*getS1()*getS2();
    }



    @Override
    public double perimeter() {
        return getS1()+getS2()+getS3();

    }
    @Override
    public String toString() {
        return "Triangle{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }
}
