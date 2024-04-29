package day5_4_29;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }

        int index = str.indexOf("xyz");

        if (index != str.lastIndexOf("xyz")) { //  this will be true when there is multiple 'xyz'
            index = str.indexOf("xyz", str.length() / 2 - 2);
        }

        String begin = str.substring(0, index);
        String end = str.substring(index + 3);
        return Math.abs(begin.length() - end.length()) <= 1;
    }
// xyzAxyzBBBB
// 11 /2 = 5
//xyz xyz xyzB xyz xyz

/*
AAxyzBB
str.indexOf("xyz"); -> 2
begin = 0, index
end = index + 3
compare lengths
*/
}