package aritmetikLab;

public class Main {

	public static void main(String[] args) {
//		int x = 10;
//		float y = 20f;
//
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		
//		System.out.println(5%2);
//		
//		int a = 10;
//		//a = a + 2;
//		a+=2;
//		
//		System.out.println(a);
//		
//		int q = 12;
//		System.out.println(++q);
//		System.out.println(q);

		int i = 10; // 00000000 00000000 00000000 00001010
					
		int x = 4; //  00000000	00000000 00000000 00000100
		System.out.println(~i);// not operatörü herhangi gördüğü 
							   //bitleni 0 ise 1 yapar, 1 gördüğü sayıyı ise 0 yapar.
							   // 11111111 11111111 11111111 11110101 //not işlemiden sonra 
	
		System.out.println(i & x);//and operatörü kullanıldıktan sonra bit hali
								  //00000000 00000000 00000000 00000000
		//AND operatörünün yaptığı iş
		//0 & 0 = 0
		//0 & 1 = 0
		//1 & 0 = 1
		//1 & 1 = 1
		
		System.out.println(i | x);//OR operatörünün yaptığı iş
								  // 00000000 00000000 00000000 00001110
		//OR operatörünün yaptığı iş
		//0 | 0 = 0
		//0 | 1 = 0
		//1 | 0 = 1
		//1 | 1 = 1
		
		System.out.println(x >> 1);// sağa kaydırma işlemi ile x'in hali:
								   // 00000000 00000000 00000000 00000010
		
		System.out.println(x << 1);// sola kaydırma işlemi ile x'in hali
								   // 00000000 00000000 00000000 00000100
	}

}
