
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
		s.append("class " + c.getName() + "{");
		s.append(System.getProperty("line.separator"));
			
		
		s.append("constructor(){");
		s.append(System.getProperty("line.separator"));
		for (Attribute a : c.getAttributes()) {
			s.append("this." + a.getName() + " = " + a.getName() + ";");
			s.append(System.getProperty("line.separator"));
		}
		s.append("}");
		s.append(System.getProperty("line.separator"));
		
		for (Operation o : c.getOperations()) {
			StringBuilder param = new StringBuilder();
			s.append(o.getName() + "(");
			for (Parameter p : o.getParameters()) {
				if(!p.isReturn())
					param.append(p.getName() + ",");
			}
			if(param.length() > 0)
				s.append(param.substring(0, param.length() - 1));
			s.append("){");
			s.append(System.getProperty("line.separator"));
			s.append("}");
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
    	   generateJavascript(c);
       }
    }
	
	
}
