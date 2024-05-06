package day7_5_6;

public class No14 {
    public boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;
        boolean other = true;

        for(int each : nums){
            if(each == 1){
                hasOne = true;
            } else if(each == 4){
                hasFour = true;
            }
        }

        return hasOne ^ hasFour || !(hasOne && hasFour); // !false = true
        //return (hasOne && !hasFour) || (!hasOne && hasFour); // hasOne ^ hasFour;

    }

}
