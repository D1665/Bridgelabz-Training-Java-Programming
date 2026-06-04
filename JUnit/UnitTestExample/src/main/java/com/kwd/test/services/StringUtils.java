package com.kwd.test.services;

public class StringUtils {


    public  String reverse(String str){

        if(str.isEmpty()){
            return str;
        }
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        return res;

    }
    public boolean ispalindrome(String str){
        return (str.equals(reverse(str)));
    }


}
