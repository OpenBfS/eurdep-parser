package de.bfs.eurdepparser.parser.model.json;

import javax.json.bind.annotation.JsonbProperty;

import de.bfs.eurdepparser.EURDEPStrings;

/**
 * Class modeling a locality Object
 * @author Alexander Woestmann <awoestmann@intevation.de>
 */
public class Locality {

    @JsonbProperty("LOCALITY_CODE")
    private String localityCode;
    @JsonbProperty("LOCALITY_NAME")
    private String localityName;
    @JsonbProperty("LONGITUDE")
    private String longitude;
    @JsonbProperty("LATITUDE")
    private String latitude;
    @JsonbProperty("HEIGHT_ABOVE_LAND")
    private String heightAboveLand;
    @JsonbProperty("HEIGHT_ABOVE_SEA")
    private String heightAboveSea;
    @JsonbProperty("NUTS")
    private String nuts;

    public String getLocalityCode() {
        return this.localityCode;
    }

    public void setLocalityCode(String localityCode) {
        this.localityCode = localityCode;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getHeightAboveLand() {
        return this.heightAboveLand;
    }

    public void setHeightAboveLand(String heightAboveLand) {
        this.heightAboveLand = heightAboveLand;
    }

    public String getHeightAboveSea() {
        return this.heightAboveSea;
    }

    public void setHeightAboveSea(String heightAboveSea) {
        this.heightAboveSea = heightAboveSea;
    }

    public String getNuts() {
        return this.nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    /**
     * Return field by name
     * @param field Field name as String
     * @return Value as String
     */
    public String get(String field) {
        switch (field) {
            case EURDEPStrings.LOCAL_LOCALITY_CODE: return localityCode;
            case EURDEPStrings.LOCALITY_NAME: return localityName;
            case EURDEPStrings.LOCAL_LATITUDE: return latitude;
            case EURDEPStrings.LOCAL_LONGITUDE: return longitude;
            case EURDEPStrings.LOCAL_HEIGHT_ABOVE_LAND: return heightAboveLand;
            case EURDEPStrings.LOCAL_HEIGHT_ABOVE_SEA: return heightAboveSea;
            case EURDEPStrings.LOCAL_NUTS: return nuts;
            default: return null;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " localityCode='" + getLocalityCode() + "'" +
            ", localityName='" + getLocalityName() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", heightAboveLand='" + getHeightAboveLand() + "'" +
            ", heightAboveSea='" + getHeightAboveSea() + "'" +
            ", nuts='" + getNuts() + "'" +
            "}";
    }

}
