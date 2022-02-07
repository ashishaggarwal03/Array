
public class ArrayDelete {
	

void deleteAtEnd(int arr[]) {
			
		if(arr.length<=0) 
			
			return;
			
			count--;
		

		}	

void deleteAValue(int arr[], int val) {
	
	int i;
	
	for(i =0;i<count;i++) {
		if(arr[i]==val) {
			break;
		}
	}
		if(i==count) {
			System.out.println("Value doesnt exist");
			return;
		}
		for(int j=i;j<count-1;j++) {
			arr[j]=arr[j+1];
		}
		count--;	
}

	void deleteAtPosition(int arr[],int pos) {
		
		if(pos>count||pos<=0) {
			System.out.println("Position is not valid");
			return;
		}
		for(int i=pos-1;i<count-1;i++) {
			arr[i]=arr[i+1];
			
		}
		count--;
		
	}
		void show(int arr[]) {
			
			for(int i=0;i<count;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();

		}
	
		
	static int count=5;
	
	public static void main(String[] args) {
	
		
		int arr[]= {10,2,5,3};
		
		for(int i=0;i<arr.length-1;i++) {
			
				if(arr[i]==arr[i+1]/2) {
					System.out.println("true");
				}
				
			}
		}
		}
		
		
//		ArrayDelete del = new ArrayDelete();
//		del.show(arr);
//		//del.deleteAtEnd(arr);
		//del.deleteAValue(arr, 4);
//		del.deleteAtPosition(arr,2);
//		del.show(arr);
//
	


