package de.bfs.eurdepparser.parser.model.json;

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;

import de.bfs.eurdepparser.EURDEPStrings;

/**
 * Class modeling an eurdep json file
 * @author Alexander Woestmann <awoestmann@intevation.de>
 */
public class EurdepJson {

    /**
     * Header Section
     */
    @JsonbProperty("COUNTRY_CODE")
    private String countryCode;
    @JsonbProperty("IMPORTANCE")
    private String importance;
    @JsonbProperty("SOFTWARE_VERSION")
    private String softwareVersion;
    @JsonbProperty("ORIGINATOR")
    private String originator;
    @JsonbProperty("CARRIER")
    private String carrier;
    @JsonbProperty("SENT")
    private Date sent;
    @JsonbProperty("FORMAT_VERSION")
    private String formatVersion;
    @JsonbProperty("MESSAGE_ID")
    private String messageId;
    @JsonbProperty("FILENAME")
    private String filename;

    /**
     * Locality list
     */
    @JsonbProperty("LOCALITY")
    private List<Locality> locality;

    /**
     * Measure list
     */
    @JsonbProperty("MEASURE")
    private List<Radiological> measure;

    /**
     * Get eurdep header fields as map
     * Format: <FIELD_NAME, FIELD_VALUE>
     * @return header as map
     */
    public Map<String, String> getHeaderFields() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);

        Map<String, String> header = new HashMap<String, String>();
        header.put(EURDEPStrings.COUNTRY_CODE, getCountryCode());
        header.put(EURDEPStrings.IMPORTANCE, getImportance());
        header.put(EURDEPStrings.SOFTWARE_VERSION, getSoftwareVersion());
        header.put(EURDEPStrings.ORIGINATOR, getOriginator());
        header.put(EURDEPStrings.CARRIER, getCarrier());
        header.put(EURDEPStrings.SENT, df.format(getSent()));
        header.put(EURDEPStrings.FORMAT_VERSION, getFormatVersion());
        header.put(EURDEPStrings.MESSAGE_ID, getMessageId());
        header.put(EURDEPStrings.FILENAME, getFilename());
        return header;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getImportance() {
        return this.importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getOriginator() {
        return this.originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Date getSent() {
        return this.sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public String getFormatVersion() {
        return this.formatVersion;
    }

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<Locality> getLocality() {
        return this.locality;
    }

    public void setLocality(List<Locality> locality) {
        this.locality = locality;
    }

    public List<Radiological> getMeasure() {
        return this.measure;
    }

    public void setMeasure(List<Radiological> measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "{" +
            " countryCode='" + getCountryCode() + "'" +
            ", importance='" + getImportance() + "'" +
            ", softwareVersion='" + getSoftwareVersion() + "'" +
            ", originator='" + getOriginator() + "'" +
            ", carrier='" + getCarrier() + "'" +
            ", sent='" + getSent() + "'" +
            ", formatVersion='" + getFormatVersion() + "'" +
            ", messageId='" + getMessageId() + "'" +
            ", filename='" + getFilename() + "'" +
            ", locality='" + getLocality() + "'" +
            ", measure='" + getMeasure() + "'" +
            "}";
    }
}
