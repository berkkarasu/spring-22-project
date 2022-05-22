import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

import medianProblem.*;
public class App {
    public static void main(String[] args){
        Operators operator = new Operators();
        double[][] facs_coordinates = operator.createDistanceMatrix(5,2);
        double[][] points_coordinates = operator.createDistanceMatrix(20,2);
        Facility[] facs = new Facility[5];
        Point[] points = new Point [20];
        for (int i=0; i<facs.length;i++){
            Facility f1 = new Facility(i,facs_coordinates[i][0],facs_coordinates[i][1],20*Math.random()+50);
            facs[i] = f1;
        }
        for (int i=0; i<points.length;i++){
            Point p1=new Point (i,points_coordinates[i][0],points_coordinates[i][1],2*Math.random()+1);
            points[i]=p1;
        }
        double[][] distanceMatrix = operator.distanceMatrix(facs, points);
        ArrayList<Facility> openedFacilities = new ArrayList<>();

        //added parts of code
        ArrayList<Point> unassignedPoints = new ArrayList<>();
        ArrayList<ArrayList<Point>> assignmentList = new ArrayList<>();
        ArrayList<Integer> openedFacilityNum=new ArrayList<>();
        ArrayList<Point> assignedPoints = new ArrayList<>();
        ArrayList<Double>totalDistance=new ArrayList<>();


        double[]recordDistancesOfRows=  new double[facs.length];
        int[]recordIndexes=  new int[facs.length];

        ArrayList<Integer>record=new ArrayList<>();
        int p =3;//number of facilities opened

            //It holds the time when the code start running.
            double TNOW = System.currentTimeMillis();

        double distance = 0;
        double holder;
        double min;
        int holdIndex=0;

        while( p!= openedFacilities.size()) {
            for (int i = 0; i < facs.length;i++) {
                distance=0;
                for (int j = 0; j < points.length; j++) {
                    distance += distanceMatrix[i][j];
                    //hold total distance for the facilty which has the id above
                }
                recordDistancesOfRows[i]=distance;

                System.out.println("Distance of facility "+i+" to total points: "+distance);

            }
            System.out.println();

            for(int l=0;l<facs.length;l++){
                holdIndex = 0;
                distance = 0;
                min = 999999;
              for(int i=0;i<facs.length;i++) {
                 //min will be equal to the first thing in the matrix
                 if (min > recordDistancesOfRows[i] && recordDistancesOfRows[i]!=-100) {
                     min=recordDistancesOfRows[i];
                     holdIndex=i;
                 }
              }
              recordDistancesOfRows[holdIndex]=-100;
              recordIndexes[l]=holdIndex;
            }
            for(int x=0;x<p;x++){
                openedFacilities.add(facs[recordIndexes[x]]);
                   System.out.println("Facility "+openedFacilities.get(x).id+" is opened.");
            }
            System.out.println();
        }

        distance=0;
        min=999999999;
        int holderOfPointIndex=0;
        int holderOfFacsIndex=0;
        //assign points to the facilities
        for(int i=0;i<points.length;i++){
            min=999999999;
            for(int j=0;j<openedFacilities.size();j++) {
                distance = distanceMatrix[openedFacilities.get(j).id][i];
                //it finds the distance and check it is greater than min or not
                //if it is not ,then it makes the necessary changes
                //it holds a holderOfPointIndex to be able to find which points assign which facility
                //it also holds holderOfFacsIndex to be able to find which facility is that
                if (min > distance) {
                    min = distance;
                    holderOfPointIndex = i;
                    holderOfFacsIndex = openedFacilities.get(j).id;
                }
            }
               // assignedPoints.add(points[holderOfPointIndex]);
                System.out.println("Point " + (i+1) + " assigned to the facility " + facs[holderOfFacsIndex].id);
        }


        //It holds the time when the code stop running.
        double LastTNOW=System.currentTimeMillis();
        double timeSpend=LastTNOW-TNOW;
        System.out.println("CPU Time:"+timeSpend);
    }
}
