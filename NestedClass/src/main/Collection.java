package main;

import java.util.ArrayList;


public class Collection {

	ArrayList<Object> list;

	
	
	public Collection(ArrayList<Object> list) {
		super();
		this.list = list;
	}


	public Collection() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Collection [list=" + list + "]";
	}


	public class FirstClass implements Iterator{

		@Override
		public void hasNext() {
			
			list.add(17);
			list.add(14);
			list.add(13);
			
			
			for (Object object : list) {
				System.out.println(object);
			}
			
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	public class SecondClass implements Iterator{

		@Override
		public void hasNext() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
}
