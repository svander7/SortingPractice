package main.animals;


public class Pig implements Comparable<Pig> {

	// CREATE the field "name" which is a String		= done
	// CREATE the field "status" which is a String		= done
	
	private String name;
	private String status;
	
	public Pig(String name, String status) {
		// CREATE the constructor						= done
		this.name = name;
		this.status = status;
	}
	
	
		// Create getter and setter for name and status	= done
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String compareTo(Pig that) {
		if (this.name.compareTo(that.name) == 0) {
			return this.name;  
		} 
	
	
	
	
	

}
