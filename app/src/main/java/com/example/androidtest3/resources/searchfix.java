package com.example.androidtest3.resources;

public class searchfix {

    public String searchfix(String s){

        String[] s1 = s.split("");
        StringBuilder sb = new StringBuilder();
        if (s1[0].length() > 0){
            sb.append(Character.toUpperCase(s1[0].charAt(0)) +
                    s1[0].subSequence(1, s1[0].length()).toString().toLowerCase());
            for(int i = 1; i < s.length(); i++){
                sb.append(" ");
                sb.append(Character.toUpperCase(s1[i].charAt(0)) +
                        s1[i].subSequence(1, s1[i].length()).toString().toLowerCase());
            }
        }
        return sb.toString();
    }



}

