public class Demo054 {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
        public static void main(String[] args) {
        Demo054 demo = new Demo054();
        int sum1 = demo.add(10, 20);
        System.out.println("Sum of 10 and 20 (integers): " + sum1);
        int sum2 = demo.add(10, 20, 30);
        System.out.println("Sum of 10, 20, and 30 (integers): " + sum2);
        double sum3 = demo.add(10.5, 20.5);
        System.out.println("Sum of 10.5 and 20.5 (doubles): " + sum3);
    }
}
