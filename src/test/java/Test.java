
public class Test {
 String name;
 int age;
 public Test(){
	 age = 0;
	 name="anononymous";
	 //System.out.println();
 }
 public Test(int i) throws Exception{
	 
	 name = "anononymus";
	 if(i<0) {
		 i=0;
		 throw new Exception("Age cannot be below zero");
	 }
	age = i;
	 // System.out.println(i);
 }
 public Test(int i,String n) {
	 age =i;
	 name = n;
	// System.out.println(i +"  "+ n);
 }
 public void print() {
	 System.out.println("name is :"+name+" age is "+age);
 }
 public static void main(String args[]) throws Exception {
	 Test t1 = new Test();
	 t1.print();
	 Test t2 = new Test(-1);
	 t2.print();
	 Test t3 = new Test(28,"pavan");
	 t3.print();
 }

}
