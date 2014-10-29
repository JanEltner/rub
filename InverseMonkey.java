public class InverseMonkey 
{

	public static void main(String[] args) 
	{
		tryAndError(1,26);
		tryAndError(21,26);
		tryAndError(387,26);
		tryAndError(512,26);
	}
	
	public static void tryAndError(int element, int modulo) 
	{
		int tmp;
		for(int i =1; i<=modulo;i++)
		{
			tmp = (i*element)%modulo;
			System.out.println(i+"*"+element+ "=" + tmp + " \\\\");
			if (tmp == 1)
			{
				System.out.println("\\Rightarrow Das inverse Element zu " + element + " in Z_{" + modulo + "} lautet: " + i + " \\\\");
				return;
			}
		}
		System.out.println("Das Element" + element + " hat in Z_{" + modulo + "} kein inverses Element \\\\");
	}

}
