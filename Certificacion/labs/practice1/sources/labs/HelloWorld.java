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


		//ahora probando lo del if si se puede sin corchetes
		if (a>b) 
			System.out.println("se puede el if sin corchetes pero de una sola linea");
		else
			System.out.println("pues es menor");


		 char a1='a', a2='\141', a3='\u0061'; //ascii y unicode
		 System.out.println(a1);
		 System.out.println(a2);
		 System.out.println(a3);

		 int i1=0141, i2=0x61;  //octal y hexa

	}
}