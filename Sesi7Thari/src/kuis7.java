import java.util.ArrayList;
import java.util.Scanner;
public class kuis7 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int[] array = new int[5]; //deklarasi
//		array= new int[] {1, 2, 3, 4, 5}; //insialisasi
//		
//		int arr[] = {1, 2, 3, 4, 5,};
//	System.out.print (arr[i]+" ");
//
//		}
//		Scanner sc= new Scanner (System.in);
//		int angka[] = new int[5];
//		for(int i=0;i<5;i++) {
//			angka[i] = sc.nextInt();
//			System.out.print (angka[i]+" ");
//			}
//		int arr[][] = {{1,2,3},
//						{4, 5, 6},
//						{7, 8, 9},
//						};
//		
//		for (int baris=0;baris<3;baris++) {
//			for(int kolom=0;kolom<3;kolom++) {
//				System.out.print(arr[baris][kolom]+" ");
//			}
//			System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1, 10);
//		list.clear();
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());
		}
	}

