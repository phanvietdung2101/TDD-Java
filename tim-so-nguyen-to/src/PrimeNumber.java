public class PrimeNumber {
    public static boolean isPrime(int number, int i){
        if(number <= 2)
            return (number == 2) ? true : false;
        if (number % i == 0)
            return false;
        if(i * i > number )
            return true;
        return isPrime(number, i+1);
    }

    public static int showPrimeNumberByPosition(int position){
        int count = 1;
        int number = 2;
        int output = -1;
        while(count <= position){
            if(isPrime(number,2)) {
                if(count == position)
                    return output = number;
                count++;
            }
            number++;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(showPrimeNumberByPosition(10));
    }
}
