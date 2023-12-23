package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointList = new ArrayList<>();

    public void addPoint(Point point){
        pointList.add(point);
    }

    public double calculatePerimeter(){
        double perimeter = 0.0;
        int numPoints = pointList.size();

        for (int i = 0; i < numPoints; i++){
            Point current = pointList.get(i);
            Point nextIndex = pointList.get((i +1)%numPoints);

            perimeter += current.distanceTo(nextIndex);
        }
        return perimeter;


    }

    public double getLongest(){
        double max_side = 0;
        for (int i = 0; i < pointList.size(); i++){
            for (int k = i+1; k < pointList.size(); k++){
                double distance = pointList.get(i).distanceTo(pointList.get(k));
                if(distance>max_side){
                    max_side = distance;
                }

            }
        }
        return max_side;
    }

    public double averageSide(){
        double perimeter = calculatePerimeter();
        double average = perimeter / pointList.size();
        return average;
    }

}
