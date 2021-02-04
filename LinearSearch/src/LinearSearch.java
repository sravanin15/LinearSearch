import java.util.Scanner;

public class LinearSearch {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int index=searchElement(array,key);
		System.out.println("Element is at index:"+index);
	}
	private static int searchElement(int[] array, int key) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key) {
				index=array[i];
			}
		}
		return index;
	}
}
