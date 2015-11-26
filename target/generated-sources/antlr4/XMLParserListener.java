// Generated from XMLParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XMLParser}.
 */
public interface XMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(XMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(XMLParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(XMLParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(XMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(XMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(XMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(XMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#jsclass}.
	 * @param ctx the parse tree
	 */
	void enterJsclass(XMLParser.JsclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#jsclass}.
	 * @param ctx the parse tree
	 */
	void exitJsclass(XMLParser.JsclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#ownedattr}.
	 * @param ctx the parse tree
	 */
	void enterOwnedattr(XMLParser.OwnedattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#ownedattr}.
	 * @param ctx the parse tree
	 */
	void exitOwnedattr(XMLParser.OwnedattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#ownedoper}.
	 * @param ctx the parse tree
	 */
	void enterOwnedoper(XMLParser.OwnedoperContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#ownedoper}.
	 * @param ctx the parse tree
	 */
	void exitOwnedoper(XMLParser.OwnedoperContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#ownedparam}.
	 * @param ctx the parse tree
	 */
	void enterOwnedparam(XMLParser.OwnedparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#ownedparam}.
	 * @param ctx the parse tree
	 */
	void exitOwnedparam(XMLParser.OwnedparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#genericelem}.
	 * @param ctx the parse tree
	 */
	void enterGenericelem(XMLParser.GenericelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#genericelem}.
	 * @param ctx the parse tree
	 */
	void exitGenericelem(XMLParser.GenericelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(XMLParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_xmiid}.
	 * @param ctx the parse tree
	 */
	void enterA_xmiid(XMLParser.A_xmiidContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_xmiid}.
	 * @param ctx the parse tree
	 */
	void exitA_xmiid(XMLParser.A_xmiidContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_name}.
	 * @param ctx the parse tree
	 */
	void enterA_name(XMLParser.A_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_name}.
	 * @param ctx the parse tree
	 */
	void exitA_name(XMLParser.A_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_visibility}.
	 * @param ctx the parse tree
	 */
	void enterA_visibility(XMLParser.A_visibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_visibility}.
	 * @param ctx the parse tree
	 */
	void exitA_visibility(XMLParser.A_visibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_type}.
	 * @param ctx the parse tree
	 */
	void enterA_type(XMLParser.A_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_type}.
	 * @param ctx the parse tree
	 */
	void exitA_type(XMLParser.A_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_datatype}.
	 * @param ctx the parse tree
	 */
	void enterA_datatype(XMLParser.A_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_datatype}.
	 * @param ctx the parse tree
	 */
	void exitA_datatype(XMLParser.A_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_return}.
	 * @param ctx the parse tree
	 */
	void enterA_return(XMLParser.A_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_return}.
	 * @param ctx the parse tree
	 */
	void exitA_return(XMLParser.A_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_static}.
	 * @param ctx the parse tree
	 */
	void enterA_static(XMLParser.A_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_static}.
	 * @param ctx the parse tree
	 */
	void exitA_static(XMLParser.A_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#a_generic}.
	 * @param ctx the parse tree
	 */
	void enterA_generic(XMLParser.A_genericContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#a_generic}.
	 * @param ctx the parse tree
	 */
	void exitA_generic(XMLParser.A_genericContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(XMLParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(XMLParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(XMLParser.MiscContext ctx);
}