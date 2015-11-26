import java.util.ArrayList;
import java.util.List;


public class ElementController {
	
	List<Operation> operations;
	List<Parameter> parameters;
	List<Attribute> attributes;
	List<JSClass> classes;
	
	public ElementController() {
		this.operations = new ArrayList<Operation>();
		this.parameters = new ArrayList<Parameter>();
		this.attributes = new ArrayList<Attribute>();
		this.classes = new ArrayList<JSClass>();
	}
	
	public void addElement(UMLElement e){
		switch (e.getType()) {
		case Class:
			addClass(e);
			break;
		case Attribute:
			addAttribute(e);
			break;
		case Operation:
			addOperation(e);
			break;
		case Parameter:
			addParameter(e);
			break;
		default:
			break;
		}
	}
	
	public void addAttribute(UMLElement e){
		Attribute a = new Attribute(e.getId(), e.getName(), e.getVisibility());
		attributes.add(a);
	}
	
	public void addParameter(UMLElement e){
		Parameter p = new Parameter(e.getId(), e.getName(), e.isReturn());
		parameters.add(p);
	}
	
	public void addOperation(UMLElement e){
		Operation o = new Operation(e.getId(), e.getName(), e.getVisibility(), e.isStatic(), this.parameters);
		this.parameters = new ArrayList<Parameter>();
		operations.add(o);
	}
	
	public void addClass(UMLElement e){
		JSClass c = new JSClass(e.getId(), e.getName(), e.getVisibility(),this.operations, this.attributes);
		this.operations = new ArrayList<Operation>();
		this.attributes = new ArrayList<Attribute>();
		classes.add(c);
	}
}
