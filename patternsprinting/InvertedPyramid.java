package patternsprinting;

public class InvertedPyramid {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows - i; j++) { 
                System.out.print("  "); 
            }
            for (int k = 0; k < i; k++) { 
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
}
