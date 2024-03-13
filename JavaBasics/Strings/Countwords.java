package Strings;

public class Countwords {
    
    public static int countWords(String str)
    {
        // find and return the number of words 
        // present in the string
        
        int total =1;
        int i=0; 
        
        while(i<str.length()){
            
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                            total++;

            }
            i++;
        }
        
        return total;
    }
}
