package shallow;

public class ShallowCopycode 
{

	public static void main(String[] args) {
		int a[][] = { {1,2,3,4,5},{ 6,7,8,9,10 } };
		int cloneArray[][] = a.clone();
		System.out.println(a[0] == cloneArray[0]);
		System.out.println(a[1] == cloneArray[1]);
		

	}

}
