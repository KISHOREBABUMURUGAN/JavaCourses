package classwork;

import java.util.Scanner;

public class starPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String star="*";
for (int i=0;i<=5;i++) {
	for (int j=1;j<=i;j++) {
	System.out.print(star);
	}
	System.out.println();
}


Scanner sc= new Scanner(System.in);
System.out.println("Enter a value : ");
String str=sc.next();
int count=0;
for (int i=0;i<str.length();i++) {
if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u' ) {
	count++;
	System.out.println(str.charAt(i));
}
}

System.out.println(count);


//prime
int nums;
System.out.println("Enter a number");
nums=sc.nextInt();
if(nums%2==0) {
	System.out.println("prime");
}
else {
	System.out.println("not");
}


//fibonacci
int a=-1,b=1,c;
for(int k=0;k<nums;k++) {
	c=a+b;
	System.out.print(c);
	a=b;
	b=c;
}

//factor









	}
	
	

}
