package day4_4_23.string2;

public class XYZThere {
    // public boolean xyzThere(String str) {
//   for(int i = 0; i < str.length() - 2; i++){
//     String eachThree = str.substring(i, i+3);
//     if(eachThree.equals("xyz")){
//       if(i == 0){
//         return true;
//       }
//       if(str.charAt(i-1) != '.'){
//         return true;
//       }
//     }
//   }
//   return false;
// }


    public boolean xyzThere(String str) {
        for(int i = 1; i < str.length() - 2; i++){
            String eachThree = str.substring(i, i+3);
            if(eachThree.equals("xyz")){
                if(str.charAt(i-1) != '.'){
                    return true;
                }
            }
        }
        return str.startsWith("xyz");
    }

}
