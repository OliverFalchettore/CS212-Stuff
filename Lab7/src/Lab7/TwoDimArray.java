package Lab7;

public class TwoDimArray {
    
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Calls fillArray method to read a file and fill a 2D array
        int[][] myArray = fillArray(args[0]);
        
        // Prints the contents of the array
        printArray(myArray);
        
        // Prints the array, replacing odd numbers with '*'
        printArrayEven(myArray);
    }
    
    // Method to print the entire 2D array
    private static void printArray(int[][] theArray) {
        // Loop through each row
        for (int i = 0; i < theArray.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < theArray[i].length; j++) {
                // Print each element using display method
                display(theArray[i][j]);
            }
            // Print a new line after each row
            System.out.println();
        }
    }

    // Helper method to display an integer value
    private static void display(int num) {
        // Prints the number followed by a space
        System.out.print(num + " ");
    }
    
    // Method to print the array, but replace odd numbers with '*'
    private static void printArrayEven(int[][] theArray) {
        // Loop through each row
        for (int i = 0; i < theArray.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < theArray[i].length; j++) {
                // Check if the number is odd
                if (theArray[i][j] % 2 != 0) {
                    // If odd, print '*'
                    System.out.print("* ");
                } else {
                    // If even, print the number
                    display(theArray[i][j]);
                }
            }
            // Print a new line after each row
            System.out.println();
        }
    }

    // Method to read the file and fill a 2D array with data
    public static int[][] fillArray(String myFile) {
        // Create a new TextFileInput object to read from the file
        TextFileInput in = new TextFileInput(myFile);
        
        // Read the first two lines for the number of rows and columns
        int row = Integer.parseInt(in.readLine()); // Reads the number of rows
        int col = Integer.parseInt(in.readLine()); // Reads the number of columns
        
        // Create a 2D array with the specified number of rows and columns
        int[][] arr = new int[row][col];
        
        // Loop through the array and fill it with values from the file
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Read the next line from the file and assign it to the array
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }
        // Return the filled array
        return arr;
    }
}