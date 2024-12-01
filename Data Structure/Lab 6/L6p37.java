import java.util.*;
class Bank_Account{
	Scanner sc=new Scanner(System.in);
	int account_No;
	double balance=1000;
	String account_Holder;
	String name;
	public void deposit_Money(){
		System.out.println("enter money for deposit:");
		double temp=sc.nextDouble();
		balance+=temp;
	}
	public void withdraw_Money(){
		System.out.println("enter money for withdraw:");
			double temp=sc.nextDouble();
		try{
			if(temp>balance){
				System.out.println("Insephisiant balance");
			}
			else{
				balance-=temp;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public void check_Balance(){
		System.out.println("current balance is:"+balance);
	}
}
public class L6p37{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//making array of object
		System.out.println("Enter size of array: ");
		
		Bank_Account ba[]=new Bank_Account[5];
		for(int i=0;i<ba.length;i++){
			ba[i]=new Bank_Account();
		}
		System.out.println("enter no of obj betwwen 1 to 5:");
		int a=sc.nextInt();
		ba[a].deposit_Money();
		ba[a].withdraw_Money();
		ba[a].check_Balance();
	}
}
