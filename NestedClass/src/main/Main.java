package main;

public class Main {
	
	public static void main(String[] args) {
		
		Collection con1 = new Collection();
		Collection.FirstClass first1 = con1.new FirstClass(); 
		
		 first1.hasNext();
	}
}
