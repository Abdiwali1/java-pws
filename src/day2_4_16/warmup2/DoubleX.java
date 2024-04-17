package day2_4_16.warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        int indexOfX = str.indexOf('x');
        return indexOfX == -1 || indexOfX == str.length() -1 ? false :
                (str.charAt(indexOfX + 1) == 'x');
    }

    boolean doubleX2(String str) {
        int indexOfX = str.indexOf('x');

        if(indexOfX == -1 || indexOfX == str.length() -1 ){
            return false;
        }
        return str.charAt(indexOfX + 1) == 'x';
    }

}
