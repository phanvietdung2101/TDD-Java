public class Fibonacci {
    public static int showFibonacci(int num){
        if (num <= 1)
            return 1;
        else
            return showFibonacci(num - 1) + showFibonacci(num - 2);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            System.out.print(showFibonacci(i) + "\t");
        }
    }
}
