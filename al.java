import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections; 
public class al{  
    public static void main(String[] args) {  
    ArrayList list = new ArrayList();  
    list.add("Narub");  
    list.add("Iqbal");
    list.add("A");
    list.add("Z");
    list.add("B");
    list.add("C");
    list.add("D");
    System.out.println(list.isEmpty());
    System.out.println(list.size());  
    System.out.println(list); 
    Collections.sort(list);
    System.out.println(list); 
    System.out.println(list.remove("Z"));
    System.out.println(list);
    list.clear();
    System.out.println(list); 
    System.out.println(list.size());
    }  
    }  