package com.example.new_gof_design_pattern._07_adapter.hfd.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {
	Iterator<?> iterator;
 
	public IteratorEnumeration(Iterator<?> iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
