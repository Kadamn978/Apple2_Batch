package Array1D;

public class ArrayLiterals {
	void arrayLength(int a[]) {
		System.out.println("Length of Array = "+a.length);
	}
	
	void arrayElements(int a[]) {
		System.out.println("Array Elements are : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
	
	void findArrayElement(int a[],int ele) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==ele) {
				System.out.println(ele+" is Present at Index "+i);
			}
			else {
				count++;
			}
		}
		if(count==a.length) {
			System.out.println(ele+" is Not Present in Array");
		}
	}
	void printAlternateElements(int a[]) {
		System.out.println("Even Index Array Elements are : ");
		 //for (int i = 0; i < a.length; i+=2)
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println(" \n");
		System.out.println("Odd Index Array Elements are : ");
		 //for (int i = 1; i < a.length; i+=2)
		for (int i = 0; i < a.length; i++) {
			if (i%2==1) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		ArrayLiterals al=new ArrayLiterals();
		al.arrayLength(arr);
		System.out.println("");
		al.arrayElements(arr);
		System.out.println("");
		al.findArrayElement(arr, 60);
		System.out.println("");
		al.printAlternateElements(arr);
		System.out.println("");

	}

}
