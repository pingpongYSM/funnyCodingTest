import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    
    public boolean solution(String[] p) {
        boolean answer = true;
        
        Arrays.sort(p);
        
        for(int i=0; i<p.length-1;i++){
            if(p[i].length()<=p[i+1].length()){
                if(p[i].equals(p[i+1].substring(0,p[i].length()))){
                    return false;
                }    
            }
            
        }
        return answer;
    }
}