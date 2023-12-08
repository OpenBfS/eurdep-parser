package de.bfs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import de.bfs.eurdepparser.Data;
import de.bfs.eurdepparser.EURDEPToJSON;
import de.bfs.eurdepparser.JSONTOEURDEP;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit tests for EURDEP importer
 */
public class EURDEPTest extends TestCase{

    /**
     * Test loading the resource files.
     */
    @Test
    public void testLoadResources() {
        try {
            Data.getInstance();
        } catch (JsonParseException e) {
            assertTrue(false);
            e.printStackTrace();
        } catch (JsonMappingException e) {
            assertTrue(false);
            e.printStackTrace();
        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }

    /**
     * Test with an input file and print out the result on success.
     */
    @Test
    public void testImport() {
        EURDEPToJSON parser = new EURDEPToJSON();
        File initialFile = new File("test.EUR");
        try {
            InputStream targetStream = new FileInputStream(initialFile);
            String result = parser.eurdepToJson(targetStream);
            System.out.println("Importer Output:");
            assertNotNull(result);
            System.out.println(result);
        } catch (FileNotFoundException e) {
            fail("File for test not found");
        }
    }

    /**
     * Test with an input file and print out the result on success.
     */
    @Test
    public void testJsonImport() {
        JSONTOEURDEP parser = new JSONTOEURDEP();
        File initialFile = new File("test.json");
        try {
            InputStream targetStream = new FileInputStream(initialFile);
            String result = parser.jsonToEurdep(targetStream);
            System.out.println("Importer Output:");
            assertNotNull(result);
            System.out.println(result);
        } catch (FileNotFoundException e) {
            fail("File for test not found");
        }
    }
}
