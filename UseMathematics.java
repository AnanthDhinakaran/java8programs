package functionalInterface;

public class UseMathematics {
	public static void main (String[]args) {
		Mathematics add = (a,b)->a+b;
		Mathematics sub = (a,b)->a-b;
		Mathematics div = (a,b)->a/b;
		Mathematics mul = (b,i)->b*i;
		Mathematics mod = (r,j)->r%j;
		System.out.println(add.math(5, 5));
		System.out.println(sub.math(5, 7));
		System.out.println(mul.math(5, 9));
		System.out.println(div.math(6, 11));
		System.out.println(mod.math(9, 34));
		sub.print();
	}

}
