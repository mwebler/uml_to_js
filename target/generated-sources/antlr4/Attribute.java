
public class Attribute {

	private String id;
	private String name;
	private String visibility;
	
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
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public Attribute(String id, String name, String visibility) {
		super();
		this.id = id;
		this.name = name;
		this.visibility = visibility;
	}
	
	
}
