import java.util.Scanner;

public class Main {

	public static void main(String arr[]) {
		ArrayLinearList arrlist = new ArrayLinearList();
		int[] array = new int[10];
		arrlist.add(array, 0);
		arrlist.add(array, 2);
		arrlist.add(array, 7);
		Scanner sc = new Scanner(System.in);
		System.out.println("1. isString\n2. Size\n3. Add\n4. Get\n5. indexOf\n6. Add");
		int songolt = sc.nextInt();
		
			switch (songolt) {
			case 1: {
				if (arrlist.isEmpty() == false) {
					arrlist.toString(array);
				} else {
					System.out.println("������ ������ �����");
				}
			}
				break;
			case 2:
				System.out.println("��������� ���: " + arrlist.size());
				break;
			case 3:
				System.out.println("������� ����� ����: ");
				int elements = sc.nextInt();
				arrlist.add(array, elements);
				break;
			case 4: 
				System.out.println("������� ������� ��?");
				int element = sc.nextInt();
				int index = arrlist.indexOf(array, element);
				System.out.println("���� �������� ������� �� " + index + " ������� �����");
				break;
				
			}
		
				
		
	}
}
