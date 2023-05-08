import java.util.*;
public class ArrayEasy11 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type")){
                String value=items.get(i).get(0);
                if(value.equals(ruleValue)){
                    count=count+1;
                }
            }
            else if(ruleKey.equals("color")){
                String value=items.get(i).get(1);
                if(value.equals(ruleValue)){
                    count=count+1;
                }
            }
            else if(ruleKey.equals("name")){
                String value=items.get(i).get(2);
                if(value.equals(ruleValue)){
                    count=count+1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        Scanner sc=new Scanner(System.in);
        String ruleKey=sc.next();
        String ruleValue=sc.next();
        int count=countMatches(items,ruleKey,ruleValue);

    }
}
    
    
