class Testing{
	
	
	int eid;
	int salary;
	static String ceo;
	static String cfo;

	static {
		
		ceo="adsafew";
		System.out.println("static-1");
	}
	
	Testing(){
		
		eid=1;
		salary=10000;
		System.out.println("constructor-1");

		
	}
	static {
		
		cfo="qde";
		System.out.println("static-2");
	}
		Testing(int j){
		
		eid=1;
		salary=j;
		System.out.println("constructor-2");
	
	}
//		void show() {
//			
//			System.out.println(eid +":"+salary);
//			
//		}
}
	 
		public class test {

			public static void main(String[] args) {
				
			Testing t = new Testing();
			Testing t1 = new Testing(30000);
//			t.show();
//			t1.show();
			}
				
			}
	 
	
//-----------> OR 
	 
	 
//		int result;
//	
//		public Testing(int num1,int num2){
//			
//			result = num1+num2;

	
	





//public class test {
//
//	public static void main(String[] args) {
//		
//	Testing t = new Testing();
//	System.out.println(t.result);
//	
//	}
//		
//	}
//
//	

//		int num = 50_00_00; // underscore works for versions above 1.7
//		System.out.println(num);
//		
//		int k = (int)5.6;
//		System.out.println(k); // Type casting -- explicit casting
//
//		*
//		**
//		***
//		**** : 
//			
//		for(int i=1;i<=4;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}

		
//		****
//		***
//		**
//		*  :
			
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j<=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
	
//	*
//	
//	*
//	*
//	
//	*
//	*
//	*
//	
//	*
//	*
//	*
//	*            : 
//		
//		
//		for(int i=1;i<=4;i++) 
//			{
//			for(int j=0;j<i;j++) {
//				System.out.print("* ");
//				if(j<i) {
//					System.out.println();
//				}
//				else
//					System.out.println();
//			}
//			
//			System.out.println();
//		}
		
		
//		Continue Keyword: 
//			
//			for(int i=1;i<=7;i++) {
//				if(i==5) {
//					continue;
//				}
//				System.out.println("value is: "+i);
//				
//			}
		

//		Break Keyword: 
//			
//			for(int i=1;i<=7;i++) {
//				if(i>5) {
//					break;
//				}
//				System.out.println("value is: "+i);
//				
//			}
			
			
		
		
	
