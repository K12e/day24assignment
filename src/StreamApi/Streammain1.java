package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streammain1 {
	
	    public static void main(String[] args) {  
	        List<Stream1> productsList = new ArrayList<Stream1>();  
	        //Adding Products  
	          
	        productsList.add(new Stream1(2,"Dell Laptop",30000f));  
	        productsList.add(new Stream1(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Stream1(4,"Sony Laptop",28000f));  
	        productsList.add(new Stream1(5,"Apple Laptop",90000f));  
	        List<Float> productPriceList2 =productsList.stream()  
	                                     .filter(p -> p.price > 30000)// filtering data  
	                                     .map(p->p.price)        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println(productPriceList2);  
	    }  
	}


