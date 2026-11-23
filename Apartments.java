import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        // Initializing a 2D array that represents an apartment building
        String[][] apartments = {
            {"Apt 101", "Apt 102"},
            {"Apt 201", "Apt 202"}
        };

        // Adding a new floor to the apartment building
        apartments = addNewFloor(apartments, new String[]{"Apt 301", "Apt 302"});
        System.out.println(Arrays.deepToString(apartments));
    }
        
           public  static String[][] addNewFloor(String[][] apartments, String[] strings) {
               int apartmentRows= apartments.length;
               int apartmentCols = apartments[0].length;
               String [][] renovatedApartments = new String[apartmentRows+1] [apartmentCols];
                for(int row =0 ; row < apartmentRows; row++){
                    for (int col = 0; col < apartmentCols; col++) {
                        renovatedApartments[row][col] = apartments[row][col];
                    }
                }
                renovatedApartments[apartmentRows] = strings;
return renovatedApartments;
            }

}
