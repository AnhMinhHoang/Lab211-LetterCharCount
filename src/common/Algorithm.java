/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Set;

public class Algorithm {
    public String countingLetter(String string){
        StringTokenizer st = new StringTokenizer(string);
        StringBuilder result = new StringBuilder();
        Set<String> countedWords = new HashSet<>();
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(!countedWords.contains(str)){
                int index = 0, count = 0;
                while(true){
                    index = string.indexOf(str, index);
                    if(index!=-1){
                        count++;
                        index += str.length();
                    }
                    else{
                        break;
                    }
                }
                result.append(str).append("=").append(count).append(", ");
                countedWords.add(str);
            }
        }
        String finalResult = result.toString().replaceAll(", $", "");
        return finalResult;
    }
    
    public String countingChar(String string){
        StringBuilder result = new StringBuilder();
        string = string.replaceAll("\\s+","");
        int[] count = new int[256];
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for(int i = 0; i < string.length(); i++){
            count[string.charAt(i)]++;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                char c = (char)i;
                result.append(c).append("=").append(count[i]).append(", ");
            }
        }
        String finalresult = result.toString().replaceAll(", $", "");
        return finalresult;
    }
}
