package allmethod;

public class Newp {
		public void parameteres(int a ,float b,String s,boolean	sts) {

	System.out.println(a);
	System.out.println(b);
	System.out.println(s);
	System.out.println(sts);
		}

		public static void main	(String [] args){
		Newp test=new Newp();
		test.parameteres(25,55f,"test string",true);
		test.parameteres(65,87f," string",false);


}
}