

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class Listener extends XMLParserBaseListener{
	
	UMLElement currentElement;
	Stack<UMLElement> elements;

	public Listener() {
		// TODO Auto-generated constructor stub
		elements = new Stack<UMLElement>();
	}
	
	@Override
	public void enterJsclass(XMLParser.JsclassContext ctx) {
		
	}

	@Override
	public void exitJsclass(XMLParser.JsclassContext ctx) {
		
	}

	@Override
	public void enterOwnedattr(XMLParser.OwnedattrContext ctx) {
		
	}

	@Override
	public void exitOwnedattr(XMLParser.OwnedattrContext ctx) {
		
	}

	@Override
	public void enterOwnedoper(XMLParser.OwnedoperContext ctx) {
		
	}

	@Override
	public void exitOwnedoper(XMLParser.OwnedoperContext ctx) {
		
	}

	@Override
	public void enterOwnedparam(XMLParser.OwnedparamContext ctx) {
		
	}

	@Override
	public void exitOwnedparam(XMLParser.OwnedparamContext ctx) {
		
	}

	@Override
	public void enterGenericelem(XMLParser.GenericelemContext ctx) {
		
	}

	@Override
	public void exitGenericelem(XMLParser.GenericelemContext ctx) {
		
	}

	@Override
	public void enterElement(XMLParser.ElementContext ctx) {
		currentElement = new UMLElement();
		elements.push(currentElement);
	}

	@Override
	public void exitElement(XMLParser.ElementContext ctx) {
		currentElement = elements.pop();
		System.out.println("exit element: " + currentElement.getName());
	}

	@Override
	public void enterA_xmiid(XMLParser.A_xmiidContext ctx) {
		currentElement.setId(ctx.STRING().toString());
	}

	@Override
	public void enterA_name(XMLParser.A_nameContext ctx) {
		currentElement.setName(ctx.STRING().toString());
	}

	@Override
	public void enterA_visibility(XMLParser.A_visibilityContext ctx) {
	}

	@Override
	public void enterA_type(XMLParser.A_typeContext ctx) {
	}

	@Override
	public void enterA_datatype(XMLParser.A_datatypeContext ctx) {
	}

	@Override
	public void enterA_return(XMLParser.A_returnContext ctx) {
	}

	@Override
	public void enterA_static(XMLParser.A_staticContext ctx) {
	}

	@Override
	public void enterA_generic(XMLParser.A_genericContext ctx) {
	}

		
	
	
	
}
