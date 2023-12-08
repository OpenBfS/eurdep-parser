package de.bfs.eurdepparser;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import de.bfs.eurdepparser.parser.EurdepListener;
import de.bfs.eurdepparser.parser.eurdep.EurdepLexer;
import de.bfs.eurdepparser.parser.eurdep.EurdepParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class EURDEPToJSON {

    public String eurdepToJson(InputStream in) {
        CharStream is;
        // Convert to an antlr4 conform stream
        try {
            is = CharStreams.fromStream(in);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        EurdepLexer lexer = new EurdepLexer(is);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        EurdepParser parser = new EurdepParser(cts);
        ParseTree tree = parser.eurdepfile();
        ParseTreeWalker walker = new ParseTreeWalker();
        EurdepListener listener = new EurdepListener();
        ObjectMapper mapper = new ObjectMapper();
        walker.walk(listener, tree);

        ObjectNode result = listener.getResult();
        try {
            String resultString = mapper.writeValueAsString(result);
            return resultString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
