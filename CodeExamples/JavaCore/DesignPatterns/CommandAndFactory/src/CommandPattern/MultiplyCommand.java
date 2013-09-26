package CommandPattern;

public class MultiplyCommand implements IMathCommand {

	@Override
	public long calculate(long op1, long op2) 
	{	
		return (op1/1)*(op2/1);
	}

}
