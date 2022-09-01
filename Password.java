import java.util.* ;
public class Password{
	public static void main(String[] args){
		char a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a password : ");
		a = s.next().charAt(0);
		System.out.println("Confirm your password : ");
		b = s.next().charAt(0);
		if(a!=b)
			try {
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("The passwords do not match!!!");
			}
		else
			System.out.println("Welcome!!");
	}
}