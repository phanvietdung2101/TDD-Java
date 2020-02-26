public class FizzBuzz {

    public static void main(String[] args) {
        for(int i = 0 ; i < 200; i++){
            System.out.print(gameFizzBuzzUpgrade(i) + "\t");
        }
    }

    public static String gameFizzBuzzUpgrade(int num){
        if(num > 0 && num < Integer.MAX_VALUE){
            String result = "";
            result = checkNumberDivineByThreeOrFive(num);
            if(result != null)
                return result;
            result = checkSpecialNumber(num);
            if(result != null)
                return result;
            result = spellANumber(num);
            return result;
        } else {
            return "invalid input";
        }

    }

    public static String checkSpecialNumber(int num){
        String numberString = String.valueOf(num);
        String[] digits2 = numberString.split("(?<=.)");
        for(String element : digits2){
            if(element.equals("5"))
                return "buzz";
            else if(element.equals("3"))
                return "fizz";
        }
        return null;
    }

    public static String checkNumberDivineByThreeOrFive(int num){
        if(num % 5 == 0)
            return "buzz";
        else if(num % 3 == 0)
            return "fizz";
        else
            return null;
    }

    public static String spellANumber(int num){
        String result = "";
        String numberString = String.valueOf(num);
        String[] digits2 = numberString.split("(?<=.)");
        for(int i = 0; i < digits2.length; i++) {
            int element = Integer.parseInt(digits2[i]);
            result += spellADigit(element);
        }
        return result;
    }

    public static String spellADigit(int digit){
        switch (digit){
            case 1:
                return "Mot";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bon";
            case 5:
                return "Nam";
            case 6:
                return "Sau";
            case 7:
                return "Bay";
            case 8:
                return "Tam";
            case 9:
                return "Chin";
            case 0:
                return "Khong";
        }
        return "error";
    }

}
