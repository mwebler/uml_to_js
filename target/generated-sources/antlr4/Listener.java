

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;




public class Listener extends XMLParserBaseListener{
	
	UMLElement currentElement;
	Stack<UMLElement> elements;
	
	ElementController controller;

	public Listener() {
		// TODO Auto-generated constructor stub
		elements = new Stack<UMLElement>();
		controller = new ElementController();
	}
	
	public ElementController getController(){
		return controller;
	}

	@Override
	public void enterElement(XMLParser.ElementContext ctx) {
		currentElement = new UMLElement();
		elements.push(currentElement);
	}

	@Override
	public void exitElement(XMLParser.ElementContext ctx) {
		currentElement = elements.pop();
		if(currentElement != null){
			System.out.println("exit element: " + currentElement.getName());
			controller.addElement(currentElement);
		}
	}

	@Override
	public void enterA_xmiid(XMLParser.A_xmiidContext ctx) {
	}

	@Override
	public void enterA_name(XMLParser.A_nameContext ctx) {
		currentElement.setName(ctx.STRING().toString().replace("\"", ""));
	}

	@Override
	public void enterA_visibility(XMLParser.A_visibilityContext ctx) {
		currentElement.setVisibility(ctx.STRING().toString().replace("\"", ""));
	}

	@Override
	public void enterA_type(XMLParser.A_typeContext ctx) {
		currentElement.setType(ctx.STRING().toString().replace("\"", ""));
	}

	@Override
	public void enterA_datatype(XMLParser.A_datatypeContext ctx) {
		currentElement.setDataType(ctx.STRING().toString().replace("\"", ""));
	}

	@Override
	public void enterA_return(XMLParser.A_returnContext ctx) {
		currentElement.setReturn(Boolean.parseBoolean(ctx.STRING().toString().replace("\"", "")));
	}

	@Override
	public void enterA_static(XMLParser.A_staticContext ctx) {
		currentElement.setStatic(Boolean.parseBoolean(ctx.STRING().toString().replace("\"", "")));
	}

	@Override
	public void enterA_generic(XMLParser.A_genericContext ctx) {
	}

	@Override
	public void exitDocument(XMLParser.DocumentContext ctx) {
		// TODO Auto-generated method stub
		super.exitDocument(ctx);
	}

		
	
	
	
}
