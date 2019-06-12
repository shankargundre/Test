package aaa;

public class bbb {
public static void main(String[] args) {
	
	A a= new A(); 
	B b= new  B();
	A a1 =new B();
	a.m1();
	System.out.println(b.m1(20));
	a1.m1();
}}
 class A{
	 public void m1() {
		 System.out.println("method class A");
	 }
 }
 class B extends A{
	 public int m1(int a) {
		return a;
	 }
	 public void m2() {
		 System.out.println("method class B but not m1");
	 }
 }
 class C extends A{
	 public void m1() {
		 System.out.println("method of class C which is override");
	 }
 }

class D{
}
