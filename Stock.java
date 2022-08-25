public class Stock{
	static void stock(int num){
		if(num<5)
			try{
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("The stock is below 5 !!!");
			}
		else
			System.out.println("The stock is available");
	}
	public static void main(String[] args){
		stock(3);
		stock(8);
	}
}