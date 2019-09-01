import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class Solution {
    public int solution(String[][] c) {
       
		int answer = 0;
        Map<String,Integer> m = new HashMap<String,Integer>();
                
        for(int i=0;i<c.length;i++){
            
            if(m.get(c[i][1])==null){
                m.put(c[i][1],1);
            }else{
                m.put(c[i][1],m.get(c[i][1])+1);
            }
            
        }
        Iterator i = m.entrySet().iterator();

        while(i.hasNext()){
        	
            //System.out.println((Map.Entry<String, Integer>)i.next());
            Map.Entry<String, Integer> mm = (Map.Entry<String, Integer>)i.next();
            if(answer ==0) {
            	answer = answer+(mm.getValue()+1)*1;
            }else {
            	answer = answer*(mm.getValue()+1);
            }
        }
        return answer-1;
        
        
    }
}