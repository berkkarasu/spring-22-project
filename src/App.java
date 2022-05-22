import java.lang.Math;
import java.util.ArrayList;

import medianProblem.*;
public class App {
    public static void main(String[] args){
        Operators operator = new Operators();
        double[][] facs_coordinates = operator.createDistanceMatrix(5,2);
        double[][] points_coordinates = operator.createDistanceMatrix(20,2);
        Facility[] facs = new Facility[5];
        Point[] points = new Point [20];
        for (int i=0; i<facs.length;i++){
            Facility f1 = new Facility(i, facs_coordinates[i][0], facs_coordinates[i][1], 20*Math.random()+50);
            facs[i] = f1;
        }
        for (int i=0; i<points.length;i++){
            Point p1 = new Point (i, points_coordinates[i][0], points_coordinates[i][1], 2*Math.random()+1);
            points[i] = p1;
        }
        double[][] distanceMatrix = operator.distanceMatrix(facs, points);
        ArrayList<Facility> openedFacilities = new ArrayList<>();
        ArrayList<Point> unassignedPoints = new ArrayList<>();
        ArrayList<ArrayList<Point>> assignmentList = new ArrayList<>();
        double[][] Minfacility = operator.createDistanceMatrix(5,2);
        for(int i=0; i<distanceMatrix.length;i++) {
        	for(int j=0; j<distanceMatrix[0].length;j++) {
        		if(operator.findMinIndex(distanceMatrix[i][j])==facs_coordinates[i][j]) {
        		Minfacility[i][j]=facs_coordinates[i][j];
        		 for (int a=0; i<facs.length;i++){
        		if(facs[a].getX()== Minfacility[i][0]&& facs[a].getY()== Minfacility[0][j]) { 
        			openedFacilities.add(facs[i]);
        		}
        		 }
        		}
        	}
        }
        		 double[][] Minpoints= operator.createDistanceMatrix(20,2);
         		 for (int a=0; i<points.length;i++){
         			Minpoints[i][j]=points_coordinates[i][j];
         		 if(points[a].getX()== Minpoints[i][0]&& points[a].getY()== Minpoints[0][j]) { 
         			unassignedPoints.add(points[i]);
        
         		}
         		 
         		 }
                 for(int i=0; i<openedFacilities.size();i++) {
                	 for(int j=0; j<unassignedPoints.size();j++) {
                		 if(unassignedPoints.)
                	 }
                 }
                	 
                 }
         		 
}

        		     		

