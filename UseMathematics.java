package functionalInterface;

public class UseMathematics {
	public static void main (String[]args) {
		Mathematics add = (a,b)->a+b;
		Mathematics sub = (a,b)->a-b;
		Mathematics div = (a,b)->a/b;
		Mathematics mul = (b,i)->b*i;
		Mathematics mod = (r,j)->r%j;
		System.out.println(add.math(2, 5));
		System.out.println(sub.math(2, 5));
		System.out.println(mul.math(2, 5));
		System.out.println(div.math(2, 5));
		System.out.println(mod.math(2, 5));
		sub.print();
	}

}
