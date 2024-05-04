public class Main {
    public static int fact(int i) {
        if(i == 1) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}    */
    public static int fact(int i) {
        if(i == 1) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }
    
    /**
     * Main method to test the 'fact' method by calculating the factorial of 4 and printing the result.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}