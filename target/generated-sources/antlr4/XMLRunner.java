
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class XMLRunner{

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
    }
	
	
}
