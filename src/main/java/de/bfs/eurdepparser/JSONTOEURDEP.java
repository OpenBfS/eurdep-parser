package de.bfs.eurdepparser;

import java.io.InputStream;

import de.bfs.eurdepparser.parser.EurdepJsonParser;
import de.bfs.eurdepparser.parser.EurdepJsonParser.MissingMandatoryFieldException;
import de.bfs.eurdepparser.parser.model.json.EurdepJsonStructure.InvalidStructureException;

public class JSONTOEURDEP {

    public String jsonToEurdep(InputStream jsonStream) {

        //Get strucutre json
        InputStream structureStream =
            getClass().getClassLoader().getResourceAsStream("eurdep_structure.json");

        String result;
        try {
            EurdepJsonParser parser = new EurdepJsonParser(structureStream);
            result = parser.convert(jsonStream);
        } catch (InvalidStructureException ise) {
            result = String.format(
                "Invalid structure JSON. Section: %s, Field: %s, Reason: %s",
                ise.getSection(), ise.getField(), ise.getReason()
            );
        } catch (MissingMandatoryFieldException mmfe) {
            result = String.format(
                "JSON could not be Converted: Missing mandatory field \"%s\" in the %s section.",
                mmfe.getFieldname(), mmfe.getPart());
        }
        return result;
    }
}
