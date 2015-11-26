import java.util.ArrayList;
import java.util.List;


public class JSClass {

	private String id;
	private String name;
	private String visibility;
	
	private List<Operation> operations;
	private List<Attribute> attributes;
	
	public JSClass(){
		operations = new ArrayList<Operation>();
		attributes = new ArrayList<Attribute>();
	}
	
	public void addOperation(Operation op){
		operations.add(op);
	}
	
	public void addAttribute(Attribute att){
		attributes.add(att);
	}
	
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
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	
}
