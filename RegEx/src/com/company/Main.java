package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        String finalString = "";
        try{
            FileInputStream fstream = new FileInputStream("sentences.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                finalString += " " + strLine;
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }



//        System.out.println(finalString);
        Pattern pattern = Pattern.compile("[a-z]{2,}");
        Matcher matcher = pattern.matcher(finalString.toLowerCase());
        while(matcher.find()){
            System.out.println(finalString.substring(matcher.start(), matcher.end()));
        }

    }
}
