package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		//implementation here...


				int i,j,count=0;


				System.out.println("prime number between 2 to 1 million \n");


				for(i=2;i<=1000000;i++)
				{
					for(j=1;j<=i;j++)
					{
						if(i%j==0)
							count++;
					}
					if(count==2)

						System.out.print(" "+i);
					count=0;
				}
			}

	}


