
public class ArrayLinearList {
	
	//array - ��� ������� �����
	public int size;
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size()== 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getElement(int[] arr, int index) {
		int element;
		element = arr[index];
		return element;
	}
	public int indexOf(int[] arr, int elements) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == elements) {
				return i;
			}
		}
		return -1;
	}
	public void add(int arr[], int index) {
		arr[size()] = index;
		size = size + 1;
	}
	public void toString(int arr[]) {
		System.out.println("������� ������ ����: ");
		for(int i = 0; i < this.size(); i++) {
			System.out.println("������: "+i+ " �������: " + this.getElement(arr, i ) + " ");
		}
	}
}