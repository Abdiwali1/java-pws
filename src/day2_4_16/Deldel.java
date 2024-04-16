package day2_4_16;

public class Deldel {
    public String delDel(String str) {
        if(str.indexOf("del") == 1){// str.substring(1,4).equal("del")
            str = str.replace("del", "");
        }
        return str;
    }

}
