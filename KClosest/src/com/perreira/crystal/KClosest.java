package com.perreira.crystal; //this prevents namespace collisions
import java.util.*;

/**
 * Created by crystal on 2/25/15.
 */
public class KClosest {

    public static List<Point> kClosestToOrigin(List<Point> points, int k) {
        Queue<Point> pointsQueue = new PriorityQueue<Point>(64,
                new Comparator<Point>(){
                    @Override
                    public int compare(Point p1, Point p2) {
                        Integer distanceOne = p1.distanceSquaredToOrigin();
                        Integer distanceTwo = p2.distanceSquaredToOrigin();
                        //autoboxing allows you to use Integer that has methods instead of primitive types
                        return distanceOne.compareTo(distanceTwo);
                    }
                });//initial capacity, comparitor

        List<Point> returnList = new ArrayList<Point>(k);
        pointsQueue.addAll(points);

        for (int i = 0; i < k; i++){
            returnList.add(pointsQueue.poll());
        }

        return returnList;
    }
    public static void main(String[] args){
        List<Point> myPoints = new LinkedList<Point>();
        Random random = new Random();
        int randomNumberOfPoints = random.nextInt(490)+10;

        for(int i = 0; i< randomNumberOfPoints; i++){
            int randomX = random.nextInt(100);
            int randomY = random.nextInt(100);
            myPoints.add(new Point(randomX, randomY));
        }
        List<Point> closePoints = kClosestToOrigin(myPoints, 10);

        for (Point p: closePoints){
            System.out.println(p);
        }

    }


}
