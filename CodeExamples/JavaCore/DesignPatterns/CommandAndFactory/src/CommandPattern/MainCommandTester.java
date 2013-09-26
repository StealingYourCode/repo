package CommandPattern;

import java.util.Random;

public class MainCommandTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random r = new Random();
		int op1 = 33;
		int op2 = 78;
		long answer=0;
		
		
		IMathCommand[] imc = new IMathCommand[3];
		imc[0] = new AddCommand();
		imc[1] = new SubtractCommand();
		imc[2] = new MultiplyCommand();				
		
		int nextAction = r.nextInt(4);
		while(nextAction != 3)
		{						
			answer = answer + imc[nextAction].calculate(op1, op2);
			nextAction = r.nextInt(4);
		}
		System.out.println("Answer = "+answer);
	}

}
