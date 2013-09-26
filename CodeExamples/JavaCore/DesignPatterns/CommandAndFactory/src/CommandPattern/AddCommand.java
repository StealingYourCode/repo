package CommandPattern;

public class AddCommand implements IMathCommand {

	@Override
	public long calculate(long op1, long op2) 
	{
		return op1+op2;
	}

}
