public class TrianglesClassifier {
    public static String classifyTriangles(int sideA, int sideB, int sideC){

        boolean isTriangle = isTriangle(sideA,sideB,sideC);
        if(isTriangle){
            boolean isEquilateralTriangle = isEquilateralTriangle(sideA,sideB,sideC);
            boolean isIsoscelesTriangle = isIsoscelesTriangle(sideA,sideB,sideC);
            if(isEquilateralTriangle)
                return "Tam giac deu";
            else if (isIsoscelesTriangle)
                return "Tam giac can";
            else
                return "Tam giac thuong";
        } else {
            return "Khong phai la tam giac";
        }
    }

    private static boolean isTriangle(int sideA, int sideB, int sideC){
        boolean isSideGreaterThanZero = sideA > 0 && sideB > 0 && sideC > 0;
        int sumOfAB = sideA + sideB;
        int sumOfAC = sideA + sideC;
        int sumOfBC = sideB + sideC;


        if(isSideGreaterThanZero == false)
            return false;
        else if (sumOfAB <= sideC)
            return false;
        else if (sumOfAC <= sideB)
            return false;
        else if (sumOfBC <= sideA)
            return false;
        else
            return true;
    }

    private static boolean isIsoscelesTriangle(int sideA, int sideB, int sideC){
        if(sideA == sideB)
            return true;
        else if(sideB == sideC)
            return true;
        else if(sideA == sideC)
            return true;
        else
            return false;
    }

    private static boolean isEquilateralTriangle(int sideA, int sideB, int sideC){
        if(sideA == sideB && sideB == sideC)
            return true;
        else
            return false;
    }
}
