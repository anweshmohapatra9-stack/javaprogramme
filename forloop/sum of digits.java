sum of digits
__________________________

class Test
{
	public static void main(String arg[])
	{
	   int no=125,r=0,s=0;
	   while(no!=0)
	   {
	      r=no%10;
	      s=s+r;
	      no=no/10;
	   }
	    System.out.println("sum of digits="+s);
	}
}