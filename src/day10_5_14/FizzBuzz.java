package day10_5_14;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {

        String result = "";

        while(start < end){
            String temp = "";

            if(start % 3 == 0){
                temp = "Fizz";
            }

            if(start % 5 == 0){
                temp += "Buzz";
            }

            result += (temp.isEmpty() ? String.valueOf(start) : temp) + ",";
            start++;
        }

        return result.split(",");

    }

}
