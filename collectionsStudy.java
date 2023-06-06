package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collectionsStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		
		System.out.println("Array handson");
	    int a[] = {10,78,12,98,23};
	    String[] arr = {"Ball","elephant","Apple","Zebra","Fox"};
	    String[] arradd = new String[5];
	    System.out.println(a);
	    System.out.println(arr);
	    System.out.println(a.toString());
	    System.out.println(arr.toString());
	    System.out.println(Arrays.toString(arr));
	    arradd[0] = "Sachin";
	    arradd[1] = "Saurav";
	    arradd[2] = "Dravid";
	    arradd[3] = "Sehwag";
	    arradd[4] = "Yuvraj";
	    
	    for(int i=0;i<5;i++) {
	    	System.out.println(a[i]);
	    	System.out.println(arr[i]);
	    	System.out.println(arradd[i]);
	    }
	    
	    System.out.println("Sorted values");
	    Arrays.sort(a);
	    Arrays.sort(arr);
	    Arrays.sort(arradd);
	    for(int i=0;i<5;i++) {
	    	System.out.println(a[i]);
	    	System.out.println(arr[i]);
	    	System.out.println(arradd[i]);
	    }
	    
	    System.out.println("ArrayList handson");
	    System.out.println("---------------");
	    List<String> L1 = new ArrayList<String>();
	    L1.add("One");
	      
	    L1.add("Little");
	    L1.add("Mango");
	    System.out.println(L1);
	    System.out.println(L1.get(0));
	    Collections.sort(L1);
	    System.out.println(L1);
	    System.out.println(L1.indexOf("Little"));
		System.out.println(L1.indexOf("One"));
	    
	   L1.remove(1);
	   System.out.println(L1);
	   System.out.println(L1.indexOf("Little"));
	   System.out.println(L1.indexOf("One"));
	   L1.add(1,"Octopus"); 
	   System.out.println(L1); 
	   System.out.println(L1.indexOf("Little"));
	   System.out.println(L1.indexOf("One"));
	   for(String display:L1) {
		   System.out.println(display);
	   }
	   
	   //Arraylist to array
	   String[] arr_arrlist = L1.toArray(new String[L1.size()]);
	   String[] array = L1.toArray(new String[L1.size()]);  
	   System.out.println("Printing Array: "+Arrays.toString(array));
	   System.out.println(arr_arrlist);
	   Arrays.toString(arr_arrlist);
	   System.out.println(Arrays.toString(arr_arrlist));
	   
	   L1.set(0, "Big");
	   System.out.println(L1);
	   
	   System.out.println("Set handson");
	    System.out.println("------------");
	    
	    Set<String> S1 = new HashSet<String>();
	    
	    for(String F1:arr) {
	    	S1.add(F1);
	    }
	    System.out.println(S1);
	    for(String F1:S1) {
	    	System.out.println(F1);
	    }
	    
	    System.out.println("------------------");
	    System.out.println("ArrayList to Set");
	    System.out.println("-------------------");
	    Set<String> S2 = new HashSet<String>();
	    S2.addAll(L1);
	    System.out.println(S2);
	    
	    System.out.println("=====================");
	    System.out.println("Array to set");
	    System.out.println("=================");
	    S2.addAll(Arrays.asList(arr));
	    System.out.println(S2);
	    
	    System.out.println("Contains check");
	    System.out.println("==============");
	    System.out.println(S2.contains("Fox"));
	    System.out.println("Contains all");
	    System.out.println(S2.containsAll(L1));
	    System.out.println(L1.containsAll(S2));
	    
	    System.out.println("Map");
	    System.out.println("--------------");
	    
	    HashMap<Integer,String> M1 = new HashMap<Integer,String>();
	    
	    for(int i=0;i<5;i++) {
	    	M1.put(a[i], arr[i]);
	    }
	    		
	    System.out.println(M1.get(98));
	    System.out.println(M1);
	    
	    Set S3 = M1.entrySet();
	    Set S4 = M1.keySet();
	   // Set	S5 = (Set) M1.values();
	    
	    System.out.println(S3);
	    System.out.println(S4);
	    //System.out.println(S5);
	    System.out.println("Non generic map");
	    Iterator I1 = S3.iterator();
	    while(I1.hasNext()) {
	    	Map.Entry MP1 = (Map.Entry)I1.next();
	    	System.out.println(MP1.getKey());
	    	System.out.println(MP1.getValue());
	    }
	    
	    System.out.println("Generic map");
	    System.out.println("=============");
	    
	    for(Map.Entry M2 : M1.entrySet()) {
	    	System.out.println(M2.getKey() + " - " +M2.getValue());
	    }
	    
	    System.out.println("Array to Array list");
	    System.out.println("-------------------");
	    
	    String[] A1 = {"Karan","Arjun", "Harish","Vikram", "karthik","karthik"};
	    List<String> LS1 = Arrays.asList(A1);
	    System.out.println(LS1);
	    
	    System.out.println("Array to Set");
	    Set<String> ST1 = new HashSet<String>();
	    
	    for(String SS1:A1) {
	    	ST1.add(SS1);
	    }
	    System.out.println(ST1);
	    
	    System.out.println("Arraylist to Array");
	    System.out.println("-------------------");
	    
	    String[] AR1 = LS1.toArray(new String[LS1.size()]);
	    
	    System.out.println(AR1.length);
	    System.out.println(Arrays.toString(AR1));
	    
	    System.out.println("Arraylist to set");
	    System.out.println("====================");
	    
	    Set ST2 = new HashSet();
	    ST2.addAll(LS1);
	    System.out.println(ST2);
	    
	    System.out.println("Set to Array");
	    
	    System.out.println("============");
	    
	    String[] STA = new String[ST2.size()];
	    ST1.toArray(STA);
	    System.out.println(Arrays.toString(STA));
	    
	    System.out.println("Set to ArrayList");
	    System.out.println("=================");
	    
	    List<String> LST1 = new ArrayList<String>();
	    LST1.addAll(ST2);
	    System.out.println(LST1);
	}

	
	
	
	
}
