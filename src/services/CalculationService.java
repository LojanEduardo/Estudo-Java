package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class CalculationService{
	
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		T max = list.get(0);	
		for(T item : list) {//percorre toda a lista e compara quem é maior no compare to
			if(item.compareTo(max) > 0) {//compareTo vem da classe que passo no T
				max = item;
			}
		}
		
		return max;
	}
	
	
	
}
