package leetCode;

import java.util.Arrays;

public class Defang_ip {
    public static void main(String[] args){
        String address ="1.1";
        System.out.println(defang_address(address));
    }

   static String defang_address(String str){
        StringBuilder a = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '.'){
                a.append("[.]");
            }
            else{
                a.append(str.charAt(i));
            }
        }
        return a.toString();
   }
}
