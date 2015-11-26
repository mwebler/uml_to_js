import java.util.ArrayList;
import java.util.List;


public class Operation {

	private String id;
	private String name;
	private String visibility;
	private boolean isStatic;
	
	List<Parameter> parameters;
	
	

	public Operation(String id, String name, String visibility,
			boolean isStatic, List<Parameter> parameters) {
		super();
		this.id = id;
		this.name = name;
		this.visibility = visibility;
		this.isStatic = isStatic;
		this.parameters = parameters;
	}


	public Operation() {
		parameters = new ArrayList<Parameter>();
	}
	
	
	public void Parameter(Parameter param){
		parameters.add(param);
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

	public boolean isStatic() {
		return isStatic;
	}

	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	
}
