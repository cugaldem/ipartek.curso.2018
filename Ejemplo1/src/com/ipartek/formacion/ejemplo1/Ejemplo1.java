package com.ipartek.formacion.ejemplo1;

public class Ejemplo1 {
	
	public static void main(String[] args) {
		
		
		//int [] arr = new int [2];
		
		//arr[1] = 5;
		
		Punto p = new Punto(3, 4);
		
		Punto pt2 = new Punto (3, 4);
		
		//Punto pt2 = p;
	//	Pu nto pt2 =(Punto) p.clone();
		p.setX(100);
		
		System.out.println(p.equals(pt2));
		
		System.out.println(p);		//.hashCode());
		System.out.println(pt2);		//.hashCode());
		
		Object o = p;
		Punto pt1 = (Punto) o; 
		
		System.out.println(pt1);
		int i = 5;
		
		Object o2 = i; // Lo que ocurre es -> new Integer(i);
	}

}
