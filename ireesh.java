package String;

public class ireesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "girish@$#";
String []divide=s1.split("@");
System.out.println("Divide:"+divide[0]);

String reverse="";
for(int i=divide[0].length()-1;i>=0;i--) {
	reverse =reverse+divide[0].charAt(i);
}
System.out.println(reverse+divide[1]);
	}

}
