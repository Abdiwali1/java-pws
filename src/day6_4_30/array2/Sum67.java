package day6_4_30.array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean in6 = false;
        for(int each : nums){
            if(each == 6){ // range starts
                in6 = true;
            } else if(in6 && each == 7){ // range stops
                in6 = false;
            } else if(!in6){ // whenever we are not in the range 6-7 then add the number
                sum += each;
            }

        }

        return sum;
    }

}
