public class StringEvol implements Comparable<StringEvol> {

	private String value = "";
	
	public StringEvol(String value) {
		this.setValue(value);
	}
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(StringEvol o) {
				
		if(o.getValue().equals("a") || o.getValue().equals("c")) { return -1; } 
		 
		return 0;
		//return o.getValue().compareTo( this.getValue()); 
	}
	
}