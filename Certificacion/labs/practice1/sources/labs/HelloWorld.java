package labs;
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello " + args[0]);

		byte a = 127, b = 5;

		//int c = a+b; // el compilador arroja error
		int c;

		c = a+b;
		System.out.println(c);
		byte e = (byte)(a+b);
		System.out.println(e);

		float h = (float)(a/b);  //por los parentesis primero se convierte en entero
		System.out.println(h);
		float i = (float)a/b;
		System.out.println(i);


		char x = 'x';
		char y = ++x;
		System.out.println(x);
	}
}