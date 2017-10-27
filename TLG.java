import java.util.Scanner;
class TheLeadGame
{
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
		int s1 = 0,s2 = 0, p=0, lead=0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			s1+=sc.nextInt();
			s2+=sc.nextInt();
			if(s1-s2>lead){
				p=1;
				lead =s1-s2;}
				else if(s2-s1>lead){
					p=2;
					lead = s2-s1;}				
		}
		System.out.print(p+" "+lead);
	}
} 
