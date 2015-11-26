
public class UMLElement {
	private String id;
	private String name;
	private String visibility;
	private ElementType type;
	private String dataType;
	private boolean isReturn;
	private boolean isStatic;

	public UMLElement(){
		this.type = ElementType.None;
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
	public ElementType getType() {
		return type;
	}
	public void setType(String type) {
		if(type.equalsIgnoreCase("\"uml:Class\""))
			this.type = ElementType.Class;
		else if(type.equalsIgnoreCase("\"uml:Operation\""))
			this.type = ElementType.Operation;
		else if(type.equalsIgnoreCase("\"uml:Property\""))
			this.type = ElementType.Attribute;
		else if(type.equalsIgnoreCase("\"uml:Parameter\""))
			this.type = ElementType.Parameter;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public boolean isReturn() {
		return isReturn;
	}
	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}
	public boolean isStatic() {
		return isStatic;
	}
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}
	
	
}
