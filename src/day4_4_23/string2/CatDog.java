package day4_4_23.string2;

public class CatDog {
    public static void main(String[] args) {
        catDog("1cat1cadodog");
    }
    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for(int i = 0; i < str.length() - 2; i++){
            String eachThree = str.substring(i, i+3);
            System.out.println("DEBUG: " + eachThree);
            if(eachThree.equals("cat")){
                cat++;
            } else if(eachThree.equals("dog")){
                dog++;
            }
        }
        return cat == dog;
    }
/*
catdog
cat  0 3
atd  1 4
tdo  2 5
...

*/
}
