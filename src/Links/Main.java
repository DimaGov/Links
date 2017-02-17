package Links;

public class Main {
	public static void main(String [] args) {
		int First[];
		int Second[];
		
		First = new int[10];
		Second = First;
		
		for(int i = 0; i < 10; i++) {
			First[i] = i;
		}
		
		System.out.println("1-st" + " " + " 2-nd");
		for(int i = 0; i < 10; i++) {
			System.out.println(First[i] + "   |  " + Second[i]);
		}
		
		First[5] = 100;
		System.out.println("\n\n\nArrays after update (First[5] = 100)");		
		System.out.println("1-st" + " " + " 2-nd");
		for(int i = 0; i < 10; i++) {
			if(i!=5){
				System.out.println(First[i] + "   |  " + Second[i]);
			} else {
				System.out.println(First[i] + " |  " + Second[i]);
			}
		}
		
		System.out.println("\n\n\n\nClass Links Demonstation: ");
		Link A = new Link();
		A.Number = 100;
		System.out.println("A.Number = " + A.Number);
		Link B = A;
		System.out.println("Link B = A =>\nB.Number = " + B.Number);
		
		B.Number = 200;
		System.out.println("\nNumbers after B.Number = 200");
		System.out.println("A.Number = " + A.Number);
		System.out.println("B.Number = " + B.Number);
		
		func(A);
		System.out.println("\nA.Number = " + A.Number + "    After func(A)");
	}
	
	public static void func(Link link) {
		link.Number = 300;
	}
}
