package mantiksalOperatorlarLab;

public class Main {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		
		System.out.println(a && b);
//		and and operatöründe a ya bakılır eğer a false ise ikinci değere bakılmaz sonuc false olur
//		ama a true olursa ikinci değere bakılır ikinci değer false ise sonuç yine false olur ama eğer
//		b true ise sonuç true olarak karşımıza çıkar.
		
		System.out.println(a || b);
//		veya operatöründe a ya bakılır eğer a true ise ikinci değere bakılmaz sonuc true olur
//		ama a false olursa ikinci değere bakılır ikinci değer false ise sonuç yine false olur ama eğer
//		b true ise sonuç true olarak karşımıza çıkar.
		
		System.out.println(!a);
//		a nın değerini tam tersine çevirir.
		
		System.out.println(!a && b);
	}

}
