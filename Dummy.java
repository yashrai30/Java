public class Dummy {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Dummy dummy = new Dummy();
        System.out.println("Addition: " + dummy.add(5, 3));
        System.out.println("Subtraction: " + dummy.subtract(5, 3));
    }
}