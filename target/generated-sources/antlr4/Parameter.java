
public class Parameter {

	private String id;
	private String name;
	private boolean isReturn;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isReturn() {
		return isReturn;
	}
	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}
	public Parameter(String id, String name, boolean isReturn) {
		super();
		this.id = id;
		this.name = name;
		this.isReturn = isReturn;
	}
	
	
}
