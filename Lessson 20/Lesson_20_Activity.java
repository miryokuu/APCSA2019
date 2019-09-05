/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We'll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Gracie's data:
 * http://www2.whalenet.org/whalenet-stuff/Stop39382-09/data39382-09.html
 * 
 * Write a program to enter Gracie's longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 */

import java.util.Scanner;
import java.lang.Math;

class S_FARTHESTDATA {
    public double north;
    public double south;
    public double east;
    public double west;
    
    S_FARTHESTDATA()
    {
        this.north = -90.0d;
        this.south = 90.0d;
        this.east = -180.0d;
        this.west = 180.0d;
    }
}

class Lesson_20_Activity {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        S_FARTHESTDATA farthestData = new S_FARTHESTDATA();
        Double[] dataTemp = new Double[2];
        boolean loop = true;
        
        while(loop)
        {
            System.out.println("Please enter the latitude:");
            dataTemp[0] = input.nextDouble();   //  latitude
            System.out.println("Please enter the longitude:");
            dataTemp[1] = input.nextDouble();   //  longitude
            
            if(Math.abs(dataTemp[0]) <= 90.0d && Math.abs(dataTemp[0]) <= 180.0d) 
            {
                farthestData.north = farthestData.north < dataTemp[0] ? dataTemp[0] : farthestData.north;
                farthestData.south = farthestData.south > dataTemp[0] ? dataTemp[0] : farthestData.south;
                
                farthestData.east = farthestData.east < dataTemp[1] ? dataTemp[1] : farthestData.east;
                farthestData.west = farthestData.west > dataTemp[1] ? dataTemp[1] : farthestData.west;
                
                System.out.println("Would you like to enter another location?");
                loop = input.nextDouble() == 1;
            }
            else 
            {
                System.out.println("Incorrect Latitude or Longitude");
            }

        }
        
        System.out.println("Farthest North: " + farthestData.north + 
                "\nFarthest South: " + farthestData.south + 
                 "\nFarthest East: " + farthestData.east + 
                 "\nFarthest West: " + farthestData.west);
        
        input.close();
    }
}