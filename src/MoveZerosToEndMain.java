
public class MoveZerosToEndMain {

	public static void main(String[] args) {
		System.out.println("Hello, this is Keith Wolf. Welcome to my first JAVA app at Disney.");
		
		int[] arr01 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		DisplayArray(arr01);
		System.out.println();
		int[] arr02 = MoveZerosToEnd.move(arr01);
		DisplayArray(arr02);
	}
	
	public static void DisplayArray(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
			if(i > 0)
				System.out.print(',');
			System.out.print(arr[i]);
		}
	}
}
