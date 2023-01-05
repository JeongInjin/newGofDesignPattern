package com.example.new_gof_design_pattern._11_composite.hfd.menuiterator;
 
import java.util.Iterator;
  
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
   
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 * 
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}
