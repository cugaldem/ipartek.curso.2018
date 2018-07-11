package com.ipartek.formacion.ejemplo1;

public class Punto {
	
	private int x, y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		this(1,1); //Es lo mismo que -> //x =1; y = 1;
		//this(1); Seria lo mismo tambien que lo de arriba.
	}

	public Punto (int xy) {
		this(xy, xy);
	}
	
	//Source->Generate toString.
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	//Source->Generate hashcode() and equals().
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Punto(x, y);
	}
	
	
}
