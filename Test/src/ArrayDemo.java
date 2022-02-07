import java.util.Arrays;

//class Student{
//	
//	int rollno;
//	String name;
//	
//	
//	
//}


public class ArrayDemo {
	
	// Inserting array at the start: 
	
//public void print(int arr[]) {
//	
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	
//}	
//	
	public void merge(int arr[],int m,int arr2[],int n) {		
		int count=0;
		int count1=0;
		
		for(int i=0;i<arr.length-m;i++) {

	System.out.print(arr[i]+" ");
	
	count++;
	
	
		}
		int l1=count;
		System.out.println(l1);
		
		

		for(int j=0;j<arr2.length-n;j++) {

			System.out.print(arr2[j]+" ");
		count1++;
		
		}
		int l2=count1;
		System.out.println(l2);
		
		int l3 = l1+l2;
		
	
		int[] arr3 = new int[l3];
		System.out.println(arr3.length);
		
	
		System.arraycopy(arr, l1, arr3, l3, l1);
		System.arraycopy(arr2, l2, arr3, l3, l2);
		
		System.out.println(Arrays.toString(arr3));
	}
	
	
	
	public static void main(String[] args) {
		
		
//		int arr[]= {1,2,3,4,5,56,6};
//		int arr2[]= {2,4,2,6,34,3,2};
//		
//			
//		ArrayDemo me = new ArrayDemo();
//		me.merge(arr, 2, arr2, 3);
		
		

//		
//		int[] arr3= new int[l3];
//		
//		System.arraycopy(arr, l1, arr3, l3, l1);
//		System.arraycopy(arr2, l2, arr3, l3, l2);
//		
//		System.out.println(Arrays.toString(arr3));
//		
		
//		
//		
		//me.merge(arr, 4, arr2, 3);
		//me.print(arr);
		//me.print(arr2);
		
//		int arr[]= {1,0,2,3};
//
//		ArrayDemo start = new ArrayDemo();
//		
//		start.print(arr);
//		
//		System.out.println();
//		
//		start.insertAtStart(arr, 12);
//	
//		start.print(arr);
//
//		System.out.println();
//
//		start.insertAtAnyPosition(arr, 3, 15);
//		
//		start.print(arr);

	//	start.occurrence(arr);

	//	start.print(arr);

		// Sorted square array: 
		
//		int a[]= {5,1,2,3};
//		int temp=0 ;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0; j<a.length-1;j++) {
//				
//				if(a[j]>a[j+1]) {
//					
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//				
//			
//		}
//			System.out.println(a[i]*a[i]);
//		
//		}
//		
		
		

//		public void insertAtStart(int arr[], int value) {
//		for(int i=arr.length-1; i>0; i--){
//
//			arr[i]=arr[i-1];	//That is starting from i=4 and then decrementing the value of i,  				//we are shifting a[4] = a[3].
//
//		}
//			arr[0]=value; 	//By shifting the values, index 0 has no value so to insert it, we will 				//input the value.
//		
//		}
//
//		
//
//// Inserting array at any position:
//
//public void insertAtAnyPosition(int arr[], int position, int value) {
//			
//			for(int i=arr.length-1;i>position;i--) {
//				
//				arr[i]=arr[i-1];
//				
//				arr[position]=value;
//				
//			}
//			
//		}
//
		
//// Duplication of 0 occurrence and then shift right: 

		
//public void occurrence(int arr[]) {
//	int pos =0;
//	
//	for(int i = arr.length-1;i>0;i--) {
//		
//		arr[i]=arr[i-1];
//	
//		if(arr[i]==0) {
//			arr[i]=pos;
//		
//	}
//	
//	}
//
//int x = arr.length;
//int arr2[] = {x};
//
//
//
//}		
//
//

		
		// Assigning value through array objects 
		// and array can also be a set of objects: 
		
		//Student s[] = new Student[4];
//		Student s1 = new Student();
//		
//		s1.name="Ashish";
//		s1.rollno=1;
//		
//		
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
//		
//		Student s[]= {s1,s2,s3,s4};
//		
//		System.out.println(s[0]);
		
	
//		String a[]= {"Ash","Yash"};
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);

	
		
	
		
		
	
	}

}
