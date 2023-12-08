package de.bfs.eurdepparser.parser.model.json;

import java.lang.reflect.Method;
import java.util.Arrays;

import javax.el.MethodNotFoundException;

import de.bfs.eurdepparser.EURDEPStrings;

/**
 * Class modeling eurdep structure json.
 * @author Alexander Woestmann <awoestmann@intevation.de>
 */
public class EurdepJsonStructure {

    private String[] headerFields;
    private String[] localityFields;
    private String[] radiologicalFields;

    public String[] getHeaderFields() {
        return this.headerFields;
    }

    public void setHeaderFields(String[] headerFields) {
        this.headerFields = headerFields;
    }

    public String[] getLocalityFields() {
        return this.localityFields;
    }

    public void setLocalityFields(String[] localityFields) {
        this.localityFields = localityFields;
    }

    public String[] getRadiologicalFields() {
        return this.radiologicalFields;
    }

    public void setRadiologicalFields(String[] radiologicalFields) {
        this.radiologicalFields = radiologicalFields;
    }

    /**
     * Checks if locality field values are valid
     * @throws InvalidStructureException Thrown if invalid fields are found
     */
    public void validateLocalityFields () throws InvalidStructureException {
        String[] validFields = {
            EURDEPStrings.LOCAL_LOCALITY_CODE, EURDEPStrings.LOCALITY_NAME,
            EURDEPStrings.LOCAL_LONGITUDE, EURDEPStrings.LOCAL_LATITUDE,
            EURDEPStrings.LOCAL_HEIGHT_ABOVE_LAND, EURDEPStrings.LOCAL_HEIGHT_ABOVE_SEA,
            EURDEPStrings.LOCAL_NUTS};
        String[] localityFields = getLocalityFields();
        for (int i = 0; i < localityFields.length; i++) {
            String field = localityFields[i];
            boolean valid = false;
            for (int j = 0; j < validFields.length; j++) {
                String toCheck = validFields[j];
                if (field.equals(toCheck)) {
                    valid = true;
                }
            }
            if (!valid) {
                throw new InvalidStructureException(field, "Unkown", "Locality");
            }
        };
    }

    /**
     * Checks if radiological field values are valid
     * @throws InvalidStructureException Thrown if invalid fields are found
     */
    public void validateRadiologicalFields () throws InvalidStructureException {
        String[] radiologicalFields = getRadiologicalFields();
        Radiological rad = new Radiological();
        for (int i = 0; i < radiologicalFields.length; i++) {
            String fieldName = radiologicalFields[i];
            String field = radiologicalFields[i];
            field = field.toLowerCase();
            field = field.substring(0, 1).toUpperCase()
                + field.substring(1);
            StringBuilder builder
                = new StringBuilder(field);
            for (int j = 0; j < builder.length(); j++) {
                if (builder.charAt(j) == '_') {
                    builder.deleteCharAt(j);
                    builder.replace(
                        j, j + 1,
                        String.valueOf(
                            Character.toUpperCase(
                                builder.charAt(j))));
                }
            }
            String methodName = "get" + builder.toString();
            try {
                Method method = rad.getClass().getMethod(methodName);
                method.invoke(rad);
            } catch (Exception e) {
                e.printStackTrace();
                throw new InvalidStructureException(fieldName, "Unkown", "Radiological");
            }
        };
    }

    @Override
    public String toString() {
        return "{" +
            " headerFields='" + String.join(",", getHeaderFields()) + "'" +
            ", localityFields='" + String.join(",", getLocalityFields()) + "'" +
            ", radiologicalFields='" + String.join(",", getRadiologicalFields()) + "'" +
            "}";
    }

    public class InvalidStructureException extends Exception {
        private String field;
        private String reason;
        private String section;
        public InvalidStructureException(String field, String reason, String section) {
            this.field = field;
            this.reason = reason;
            this.section = section;
        }
        public String getField() {
            return this.field;
        }
        public String getReason() {
            return this.reason;
        }
        public String getSection() {
            return this.section;
        }
    }
}
