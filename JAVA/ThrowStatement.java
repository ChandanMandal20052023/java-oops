class Own {
    // Method to validate number
    public void validate(int n) throws Exception {
        if (n >= 1 && n <= 10) {
            System.out.println(n + " is a valid value");
        } else {
            throw new Exception(n + " is not a valid value");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Own obj = new Own();
        try {
            obj.validate(5);   // Test with a valid number
            obj.validate(15);  // Test with an invalid number
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
