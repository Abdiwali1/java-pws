package day3_4_22;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int smallest = Math.min(a.length(), b.length());
        for(int i = 0; i < smallest - 1; i++){
            if(a.substring(i, i + 2).equals(b.substring(i, i + 2))){
                count++;
            }
        }
        return count;
    }

}
