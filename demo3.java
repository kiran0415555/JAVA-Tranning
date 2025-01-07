public class demo3 {
    public static void main(String[] args) {
        int num1,num2, num3;
        num1 = 18;
        num2 = 20;
        num3 = 35;
        if ((num1 > num2) &&(num1 > num3)) {
            System.out.println(" num1 is grater");
        }
        else if ((num2 > num3) &&(num2 > num1)) {
            System.out.println("num2 is grater");
        }
        else {
            System.out.println("num3 is grater");
        }

    }
    
}
