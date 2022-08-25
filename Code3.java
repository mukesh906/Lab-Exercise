import java.util.*;
public class  Code3{
	public static void main(String[] args){
		try{
			try{
				int n1,n2,n3;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter two numbers : ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				n3 = n1/n2;
				System.out.println(n3);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("A number cannot be divided by 0 !!!");
			}
			catch(Exception e3)
			{
				System.out.println("Enter numbers only!!!");
			}
			String n4 = null;
			if (n4.equals("abc"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
		}
		catch(Exception ee)
		{
			System.out.println("The String is assigned with a null value");
		}
	}
}