
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class XMLRunner{

	public static void generateJavascript(JSClass c){
		StringBuilder s = new StringBuilder();
		
		String extend = "";
		if(c.getExtendsId() != null){
			extend = " extends " + c.getExtendsId();
		}
		
		s.append("class " + c.getName() + extend + "{");
		s.append(System.getProperty("line.separator"));
			
		
		s.append("\tconstructor(");
		StringBuilder param = new StringBuilder();
		for (Attribute a : c.getAttributes()) {
			param.append(a.getName() + ",");
		}
		if(param.length() > 0)
			s.append(param.substring(0, param.length() - 1));
		
		s.append("){");
		s.append(System.getProperty("line.separator"));
		
		for (Attribute a : c.getAttributes()) {
			s.append("\t\tthis." + a.getName() + " = " + a.getName() + ";");
			s.append(System.getProperty("line.separator"));
		}
		s.append("\t}");
		s.append(System.getProperty("line.separator"));
		
		for (Operation o : c.getOperations()) {
			param = new StringBuilder();
			s.append("\t");
			
			//static method
			if(o.isStatic())
				s.append("static ");
			
			//pseudo privacy
			if(o.getVisibility().equals("private"))
				s.append("_");
			
			//build signature
			s.append(o.getName() + "(");
			for (Parameter p : o.getParameters()) {
				if(!p.isReturn())
					param.append(p.getName() + ",");
			}
			if(param.length() > 0)
				s.append(param.substring(0, param.length() - 1));
			s.append("){");
			s.append(System.getProperty("line.separator"));
			s.append("\t}");
			s.append(System.getProperty("line.separator"));
		}
		
		s.append("}");
		System.out.println(s.toString());
	}
	
	public static void main( String[] args) throws Exception 
    {
		InputStream is = new FileInputStream(args[0]);
		
        ANTLRInputStream input = new ANTLRInputStream(is);

        XMLLexer lexer = new XMLLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        

        XMLParser parser = new XMLParser(tokens);
        //ParseTree tree = parser.document();
        
        XMLParser.DocumentContext document = parser.document();
        
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        Listener extractor = new Listener();
        walker.walk(extractor, document); // initiate walk of tree with listener
        
        
        
       for (JSClass c : extractor.getController().getClasses()) {
    	   
    	   if(c.getExtendsId() != null){
    		   for (JSClass cl : extractor.getController().getClasses()) {
    			   if(cl.getId() != null && cl.getId().equals(c.getExtendsId()))
    				   c.setExtendsId(cl.getName());
    		   }
    	   }
    	   
    	   generateJavascript(c);
       }
    }
	
	
}
