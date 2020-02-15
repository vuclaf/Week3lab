 
import java.util.*;
import java.io.*;

/**
 * A testing and timing class for the IntegerList class
 * @author Evan Vu
 *
 */
public class ExperimentController {
    public static void main(String[] args) {
        ExperimentController tester = new ExperimentController();
        System.out.print("Execution Time: " + tester.timeAppend(8, 99));
        System.out.print("Execution Time: " + tester.timeAppend(8, 89));
    }
    
    /**
     * Testing and timing the performance of the append method
     * @return The runtime for the append method
     */
    public long timeAppend(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        IntegerList timeRunner = new IntegerList();
        int i=0;
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            timeRunner.append(rand.nextInt());
            i++;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of the toString method
     * @return The runtime for the toString method
     */
    public long timeToString(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        IntegerList timeRunner = new IntegerList();
        int i=0;
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            timeRunner.append(rand.nextInt());
            i++;
        }
        @SuppressWarnings("unused")
        String result = timeRunner.toString();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Writing results on to a text file for data analysis
     * @return an output file for data analysis
     */
    public void dataOut(){
        long executionTimeAppend;
        long executionTimeString;
        int numberOfInputs;
        int seed;
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(new File("output.txt"));
            for(int i=0; i<=100; i+=5){
                executionTimeAppend = timeAppend(i, System.currentTimeMillis());
                executionTimeString = timeToString(i, System.currentTimeMillis());
                
            }
            
    }
}
