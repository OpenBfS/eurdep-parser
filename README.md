# EURDEP Parser

The EURDEP (EUropean Radioactivity Data Exchange Platform) 2.1 format is a data interface for exchanging radiological monitoring data. This library parses either EURDEP data files to JSON or vice versa.


## License

The software is available under the GNU GPL v>=3 licence. For details see file COPYING.

## Using

The entry point for parsing EURDEP data is the function 'eurdepToJson' of the class 'EURDEPToJSON'. For parsing JSON data use the function 'jsonToEurdep' of the class 'JSONToEURDEP'. Both functions expect a 'java.io.InputStream' as input parameter and returns the result as 'String' (JSON object or EURDEP string).

## Structure

The importer uses ANTLR4 (V 4.9) to parse the data format and split it into its components. Further interpretation of the data is done in the 'de.bfs.eurdepparser.parser.EurdepListener', which types the input data.

With 'mvn clean compile package' the jar can be created.

## Tests

The function of the importer is tested by unit tests. To do this, it is necessary to place the file to be imported in the main folder (the same as this readme) and rename it to test.EUR or test.json.
The tests can be started with 'mvn test'.

## Contact

Marco Pochert\
mpochert@bfs.de\
Bundesamt für Strahlenschutz │ Federal Office for Radiation Protection\
Koordination Notfallschutzsysteme │ Coordination Emergency Systems │ RN 1\

Willy-Brandt-Strasse 5\
38226 Salzgitter\
info@bfs.de\
<https://www.bfs.de>
