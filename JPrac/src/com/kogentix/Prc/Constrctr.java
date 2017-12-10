package com.kogentix.Prc;

public class Constrctr {
	
	int a =0;
	int b =0;
	int c ;
	int d ;
	
	Constrctr(int w, int l){
		this.a = w;
		this.b = l;
	}
	
 void action() {
	 System.out.println(a);
 }
 
 void ad(int a,int b) {
	 
	 int zx = this.a+a;
	 //return zx;
	 System.out.println("the sum is"+zx);
	 System.out.println(this.a);
	 System.out.println(a);
	 
 }
}
