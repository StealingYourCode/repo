package factory;

public class SafeToy extends Toy 
{

	private boolean checked;
	
	public SafeToy(String name) {
		super(name);		
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	
}
