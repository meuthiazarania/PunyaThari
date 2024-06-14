package Main;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> listNilai = new ArrayList<>();
	static ArrayList<String> listNama = new ArrayList<>();
	
	public static void main(String[] args) {
		int selection;
		do {
			System.out.println(""
					+ " __ ___ _ _ _ _ ___ __| |_(_)___| || | \\| |\r\n"
					+ " / _/ _ \\ '_| '_/ -_) _|  _| / _ \\ __ | .` |\r\n"
					+ " \\__\\___/_| |_| \\___\\__|\\__|_\\___/_||_|_|\\_|\r\n"
					+ "                                            ");
			System.out.println("1.add new data");
			System.out.println("2. View all");
			System.out.println("3. Search data");
			System.out.println("4. Exit");
			
			do {
			System.out.print(">>");
			selection = scan.nextInt();
			scan.nextLine();
			}while(selection<1||selection>4);
			
			switch(selection) {
			case 1:
				AddNewData();
				break;
			case 2:
				ViewAll();
				break;
			case 3:
				SearchData();
				break;
			case 4:
				break;
			}
			
			
		}while(selection != 4);
	
	}

	private static void SearchData() {
		// TODO Auto-generated method stub
		
	}

	private static void ViewAll() {
		if(listNama.isEmpty()) {
			System.out.println("Please input a data!");
			return;
		}
		
		bubbleSort();
		
		for(int i =0; i<listNama.size();i++) {
			System.out.println(listNama.get(i)+" "+listNilai.get(i));
		}
	}

	private static void bubbleSort() {
		for(int i = 0;i<listNilai.size();i++) {
			for(int j=0;j<listNilai.size()-i-1;i++) {
				if(listNilai.get(j)<listNilai.get(j+1)) {
					int temp =listNilai.get(j+1);
					listNilai.set(j, listNilai.get(j+1));
					listNilai.set(j+1, temp);
					
					String temp1 =listNama.get(j+1);
					listNama.set(j, listNama.get(j+1));
					listNama.set(j+1, temp1);
				}
				
			}
		}
		
	}

	private static void AddNewData() {
		String nama;
		int nilai;
		System.out.print("input nama:");
		nama = scan.nextLine();
		do {
		System.out.print("input nilai");
		nilai = scan.nextInt();
		scan.nextLine();
		}while(nilai<0||nilai>100);
		listNama.add(nama);
		listNilai.add(nilai);
	}

}
