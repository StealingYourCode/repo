package CommandPattern;

public class SubtractCommand implements IMathCommand {

	@Override
	public long calculate(long op1, long op2) 
	{	
		for (int i=0; i<op2; i++)
			op1--;
		return op1;
	}

}
