import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        // TODO: Initialize a 3-story building with 3 units per floor using a 2D array.
        String [][] apartments =  {
            {"Apt 101", "Apt 102", "Apt 103"},
             {"Apt 201", "Apt 202", "Apt 203"}, 
             {"Apt 301", "Apt 302", "Apt 303"}
            };
            int apartmentRows = apartments.length;
            int apartmentCols = apartments[0].length;
            
             // TODO: Update the name of one of the apartments to "Vacant".

            for(int row = 0 ; row < apartmentRows; row++){
                for(int col = 0; col < apartmentCols; col++){
                    apartments[2][0] = "Vacant";
                }
            }
    
       
        // TODO: Traverse the building and print out the names of all units, one floor at a time.
        System.out.println(Arrays.deepToString(apartments));
    }
}
