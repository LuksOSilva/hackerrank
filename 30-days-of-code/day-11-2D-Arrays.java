import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    
    public static void main(String[] args) throws IOException {
     
        List<List<Integer>> array = getArray();
        
        List<List<Integer>> allHourglasses = getAllHourglassesValues(array);
     
        List<Integer> highestSumHourglass = getHighestSumHourglass(allHourglasses);
        
        System.out.println(sumHourglass(highestSumHourglass));
    }
    
    public static List<List<Integer>> getArray() {    
        Scanner sc = new Scanner(System.in);
        
        List<List<Integer>> array = new ArrayList<>();
        
        while(sc.hasNext()) {
            
            List<Integer> row = new ArrayList<>();
            
            String rowValues = sc.nextLine();
            
            for (String value : rowValues.split(" ")) {

                row.add(Integer.parseInt(value));
            
            }
            array.add(row);
        }
        
        sc.close();
        return array;
    }
    
    public static List<List<Integer>> getAllHourglassesValues(List<List<Integer>> array) {
        
        List<List<Integer>> allHourglasses = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if (!hourGlassExists(array, i, j)) continue;
                
                List<Integer> hourGlass = new ArrayList<>();
                
                //top
                hourGlass.add(array.get(i).get(j));
                hourGlass.add(array.get(i).get(j +1));
                hourGlass.add(array.get(i).get(j +2));
                //middle
                hourGlass.add(array.get(i+1).get(j+1));
                //base
                hourGlass.add(array.get(i+2).get(j));
                hourGlass.add(array.get(i+2).get(j +1));
                hourGlass.add(array.get(i+2).get(j +2));
            
                allHourglasses.add(hourGlass);
            }
        
        }
        
        return allHourglasses;
    }
    
    public static boolean hourGlassExists(List<List<Integer>> array, int firstLayerIndex, int secondLayerIndex) {
        int farthestFirstLayerPoint = firstLayerIndex + 2;
        int farthestSecondLayerPoint = secondLayerIndex + 2;

    
        if (farthestFirstLayerPoint <= array.size()-1) {

            if (farthestSecondLayerPoint <= array.get(farthestFirstLayerPoint).size()-1) {

                return true;
            }
        }
        
        return false;
    }
    
    public static List<Integer> getHighestSumHourglass(List<List<Integer>> allHourglasses) {
        
        int indexOfHighestSumHourglass = 0;
        
        for (List<Integer> hourglass : allHourglasses) {
        
            if (sumHourglass(hourglass) > sumHourglass(allHourglasses.get(indexOfHighestSumHourglass))) {
                indexOfHighestSumHourglass = allHourglasses.indexOf(hourglass);
            }
            
        }
        
        return allHourglasses.get(indexOfHighestSumHourglass);
    }
    
    public static int sumHourglass(List<Integer> hourglass) {
        return hourglass.stream().mapToInt(Integer::intValue).sum();
    }
    
}
