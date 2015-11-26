// Generated from XMLParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XMLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(XMLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#prolog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProlog(XMLParser.PrologContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(XMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(XMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#jsclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsclass(XMLParser.JsclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#ownedattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnedattr(XMLParser.OwnedattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#ownedoper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnedoper(XMLParser.OwnedoperContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#ownedparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnedparam(XMLParser.OwnedparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#genericelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericelem(XMLParser.GenericelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(XMLParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XMLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_xmiid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_xmiid(XMLParser.A_xmiidContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_name(XMLParser.A_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_visibility(XMLParser.A_visibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_type(XMLParser.A_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_datatype(XMLParser.A_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_return(XMLParser.A_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_static}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_static(XMLParser.A_staticContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#a_generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_generic(XMLParser.A_genericContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardata(XMLParser.ChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link XMLParser#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(XMLParser.MiscContext ctx);
}