package PatternProgram;

public class ForwardBackwardNumberPattern {

	public static void main(String[] args) {
int n=5;
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for (j= 1; j<=i;j++) 
			{
				System.out.print(j);
			}
				for(k=i-1;k>0;k--)
			{
			 System.out.print(k);
			}
           System.out.println();
		}

	}

}
