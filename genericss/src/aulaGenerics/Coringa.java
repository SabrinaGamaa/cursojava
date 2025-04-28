package aulaGenerics;

import java.util.Arrays;
import java.util.List;

public class Coringa {
	public static void main(String[] args) {
//		O supertipo de qualquer tipo de lista é:
//		List<?> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers;
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		System.out.println();
		List<String> myStrs = Arrays.asList("Joao", "Maria", "Ana");
		printList(myStrs);
	}
	
//	Esse metodo funciona para qualquer outro tipo de lista
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
//	NÃO É POSSIVEL ADICIONAR DADOS A UM COLEÇÃO DE TIPO CORINGA
}
