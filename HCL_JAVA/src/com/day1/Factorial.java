import java.math.BigInteger;
class Factorial 
{
	public static void main(String[] args) 
	{
		BigInteger fact=BigInteger.valueOf(1);
		int n=50000;
		for(int i=1;i<=n;i++){
		fact=fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
	}
}
