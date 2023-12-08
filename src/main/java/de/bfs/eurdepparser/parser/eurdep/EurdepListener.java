// Generated from de/bfs/eurdepparser/parser/eurdep/Eurdep.g4 by ANTLR 4.9.2
package de.bfs.eurdepparser.parser.eurdep;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EurdepParser}.
 */
public interface EurdepListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EurdepParser#eurdepfile}.
	 * @param ctx the parse tree
	 */
	void enterEurdepfile(EurdepParser.EurdepfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#eurdepfile}.
	 * @param ctx the parse tree
	 */
	void exitEurdepfile(EurdepParser.EurdepfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#eurdep_header}.
	 * @param ctx the parse tree
	 */
	void enterEurdep_header(EurdepParser.Eurdep_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#eurdep_header}.
	 * @param ctx the parse tree
	 */
	void exitEurdep_header(EurdepParser.Eurdep_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(EurdepParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(EurdepParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#locality}.
	 * @param ctx the parse tree
	 */
	void enterLocality(EurdepParser.LocalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#locality}.
	 * @param ctx the parse tree
	 */
	void exitLocality(EurdepParser.LocalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#radiological}.
	 * @param ctx the parse tree
	 */
	void enterRadiological(EurdepParser.RadiologicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#radiological}.
	 * @param ctx the parse tree
	 */
	void exitRadiological(EurdepParser.RadiologicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(EurdepParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(EurdepParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#unknown_section}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_section(EurdepParser.Unknown_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#unknown_section}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_section(EurdepParser.Unknown_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#radiological_content}.
	 * @param ctx the parse tree
	 */
	void enterRadiological_content(EurdepParser.Radiological_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#radiological_content}.
	 * @param ctx the parse tree
	 */
	void exitRadiological_content(EurdepParser.Radiological_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#default_section}.
	 * @param ctx the parse tree
	 */
	void enterDefault_section(EurdepParser.Default_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#default_section}.
	 * @param ctx the parse tree
	 */
	void exitDefault_section(EurdepParser.Default_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#default_record}.
	 * @param ctx the parse tree
	 */
	void enterDefault_record(EurdepParser.Default_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#default_record}.
	 * @param ctx the parse tree
	 */
	void exitDefault_record(EurdepParser.Default_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#field_list}.
	 * @param ctx the parse tree
	 */
	void enterField_list(EurdepParser.Field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#field_list}.
	 * @param ctx the parse tree
	 */
	void exitField_list(EurdepParser.Field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#header_field}.
	 * @param ctx the parse tree
	 */
	void enterHeader_field(EurdepParser.Header_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#header_field}.
	 * @param ctx the parse tree
	 */
	void exitHeader_field(EurdepParser.Header_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link EurdepParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(EurdepParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link EurdepParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(EurdepParser.RecordContext ctx);
}