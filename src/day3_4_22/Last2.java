package day3_4_22;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
    }

    public static int last2(String str) {

        if(str.length() <= 2){
            return 0;
        }

        String lastTwo = str.substring(str.length() - 2);
        int count = 0;

        for(int i = 0; i < str.length() - 2; i++){
            System.out.println("DEBUGGING: " + i + ", " + (i + 2) + " = " + str.substring(i, i + 2));
            if(str.substring(i, i + 2).equals(lastTwo)){
                count++;
            }
        }
        return count;
    }
// sub 0 2
// sub 1 3
}
