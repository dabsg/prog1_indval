package egengrafik.bollar;

import java.awt.Color;

public class Boll {

	int x;
	int y;
	int xv;
	int yv;
	Color c;
	
	
	public Boll(int x, int y ,int xv, int yv, Color c ) {
	
		
	this.x=x;
	this.y=y;
	this.xv=xv;
	this.yv=yv;
	this.c=c;
	
	}
	
	
	public void move() {
		
		x=x+xv;
		y=y+yv;
		
		
	}
	
	
	
}
