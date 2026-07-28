class localvar{//class level
// {

    public static void main(String[] args) {
        calculateBill();
    }

   static void calculateBill() {//method
        int a = 10;   // Local variable
        int b = 20;   // Local variable

        System.out.println("Sum = " + (a + b));
    }
}
