package models;

public class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point another){
        double distance = Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
        return distance;
    }

    public String toString() {
        return "x : " + this.x +
                "y : " + this.y + "\n";
    }

}





