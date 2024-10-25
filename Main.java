public class Main {
    public static void main(String[] args) {
        int num1 = 1; 
        int num2 = 2;
        int maxNum = sacarNumMax(num1, num2);
        System.out.println(maxNum);
    }

    public static int sacarNumMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else { 
            return num1;
        }
    }
}
