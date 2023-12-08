package de.bfs.eurdepparser.parser.model.json;

import java.lang.reflect.Method;
import java.util.Date;

import javax.json.bind.annotation.JsonbProperty;

/**
 * Class modeling a radiological eurdep entry.
 * @author Alexander Woestmann <awoestmann@intevation.de>
 */
public class Radiological {
    @JsonbProperty("AIR_VOLUME")
    private int airVolume;
    @JsonbProperty("APPARATUS")
    private String apparatus;
    @JsonbProperty("BACKGROUND")
    private String background;
    @JsonbProperty("BACKGROUND_METHOD")
    private String backgroundMethod;
    @JsonbProperty("BACKGROUND_CONSTRAINT")
    private String backgroundConstraint;
    @JsonbProperty("BEGIN")
    private String begin;
    @JsonbProperty("CLOUD_COVER")
    private int cloudCover;
    @JsonbProperty("DEPTH_MAX")
    private int depthMax;
    @JsonbProperty("DEPTH_MIN")
    private int depthMin;
    @JsonbProperty("DEW_POINT_TEMPERATURE")
    private float dewPointTemperature;
    @JsonbProperty("DOPPLER_RADAR")
    private float dopplerRadar;
    @JsonbProperty("END")
    private String end;
    @JsonbProperty("HEIGHT_ABOVE_LAND")
    private int heightAboveLand;
    @JsonbProperty("HEIGHT_ABOVE_SEA")
    private int heightAboveSea;
    @JsonbProperty("LATITUDE")
    private String latitude;
    @JsonbProperty("LOCALITY_CODE")
    private String localityCode;
    @JsonbProperty("LOCALITY_NAME")
    private String localityName;
    @JsonbProperty("LONGITUDE")
    private String longitude;
    @JsonbProperty("NUCLIDE")
    private String nuclide;
    @JsonbProperty("NUTS")
    private String nuts;
    @JsonbProperty("PRECIPITATION")
    private float precipitation;
    @JsonbProperty("PRECIPITATION_DURATION")
    private int precipitationDuration;
    @JsonbProperty("PRECIPITATION_INTENSITY")
    private float precipitationIntensitiy;
    @JsonbProperty("PRECIPITATION_OCCURENCE")
    private String precipitationOccurrence;
    @JsonbProperty("PRESSURE")
    private int pressure;
    @JsonbProperty("REFERENCE_DATE")
    private Date referenceDate;
    @JsonbProperty("REMARKS")
    private String remarks;
    @JsonbProperty("RELATIVE_HUMIDITY")
    private int relativeHumidity;
    @JsonbProperty("SAMPLE_BEGIN")
    private String sampleBegin;
    @JsonbProperty("SAMPLE_END")
    private String sampleEnd;
    @JsonbProperty("SAMPLE_TREATMENT")
    private String sampleTreatment;
    @JsonbProperty("SAMPLE_TYPE")
    private String sampleType;
    @JsonbProperty("SNOW")
    private float snow;
    @JsonbProperty("SNOW_OCCURENCE")
    private String snowOccurrence;
    @JsonbProperty("SOLAR_RADIATION")
    private float solarRadiation;
    @JsonbProperty("STABILITY_CLASS")
    private String stabilityClass;
    @JsonbProperty("TEMPERATURE")
    private float temperature;
    @JsonbProperty("TIME_BASE")
    private String timeBase;
    @JsonbProperty("UNCERTAINTY")
    private String uncertainty;
    @JsonbProperty("UNCERTAINTY_TYPE")
    private String uncertaintyType;
    @JsonbProperty("UNCERTAINTY_UNIT")
    private String uncertaintyUnit;
    @JsonbProperty("UNCERTAINTY_CONSTRAINT")
    private String uncertaintyConstraint;
    @JsonbProperty("UNIT")
    private String unit;
    @JsonbProperty("VALIDATED")
    private String validated;
    @JsonbProperty("VALUE")
    private String value;
    @JsonbProperty("VALUE_CONSTRAINT")
    private String valueConstraint;
    @JsonbProperty("VALUE_TYPE")
    private String valueType;
    @JsonbProperty("WEATHER_RADAR")
    private float weatherRadar;
    @JsonbProperty("WIND_DIRECTION")
    private int windDirection;
    @JsonbProperty("WIND_DIRECTION_FLUCTUATION")
    private int windDirectionFluctuation;
    @JsonbProperty("WIND_SPEED")
    private float windSpeed;
    @JsonbProperty("WIND_SPEED_FLUCTUATION")
    private float windSpeedFluctuation;


    public int getAirVolume() {
        return this.airVolume;
    }

    public void setAirVolume(int airVolume) {
        this.airVolume = airVolume;
    }

    public String getApparatus() {
        return this.apparatus;
    }

    public void setApparatus(String apparatus) {
        this.apparatus = apparatus;
    }

    public String getBackground() {
        return this.background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackgroundMethod() {
        return this.backgroundMethod;
    }

    public void setBackgroundMethod(String backgroundMethod) {
        this.backgroundMethod = backgroundMethod;
    }

    public String getBackgroundConstraint() {
        return this.backgroundConstraint;
    }

    public void setBackgroundConstraint(String backgroundConstraint) {
        this.backgroundConstraint = backgroundConstraint;
    }

    public String getBegin() {
        return this.begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public int getCloudCover() {
        return this.cloudCover;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getDepthMax() {
        return this.depthMax;
    }

    public void setDepthMax(int depthMax) {
        this.depthMax = depthMax;
    }

    public int getDepthMin() {
        return this.depthMin;
    }

    public void setDepthMin(int depthMin) {
        this.depthMin = depthMin;
    }

    public float getDewPointTemperature() {
        return this.dewPointTemperature;
    }

    public void setDewPointTemperature(float dewPointTemperature) {
        this.dewPointTemperature = dewPointTemperature;
    }

    public float getDopplerRadar() {
        return this.dopplerRadar;
    }

    public void setDopplerRadar(float dopplerRadar) {
        this.dopplerRadar = dopplerRadar;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getHeightAboveLand() {
        return this.heightAboveLand;
    }

    public void setHeightAboveLand(int heightAboveLand) {
        this.heightAboveLand = heightAboveLand;
    }

    public int getHeightAboveSea() {
        return this.heightAboveSea;
    }

    public void setHeightAboveSea(int heightAboveSea) {
        this.heightAboveSea = heightAboveSea;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

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

    public String getNuclide() {
        return this.nuclide;
    }

    public void setNuclide(String nuclide) {
        this.nuclide = nuclide;
    }

    public String getNuts() {
        return this.nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public float getPrecipitation() {
        return this.precipitation;
    }

    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }

    public int getPrecipitationDuration() {
        return this.precipitationDuration;
    }

    public void setPrecipitationDuration(int precipitationDuration) {
        this.precipitationDuration = precipitationDuration;
    }

    public float getPrecipitationIntensitiy() {
        return this.precipitationIntensitiy;
    }

    public void setPrecipitationIntensitiy(float precipitationIntensitiy) {
        this.precipitationIntensitiy = precipitationIntensitiy;
    }

    public String getPrecipitationOccurrence() {
        return this.precipitationOccurrence;
    }

    public void setPrecipitationOccurrence(String precipitationOccurrence) {
        this.precipitationOccurrence = precipitationOccurrence;
    }

    public int getPressure() {
        return this.pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Date getReferenceDate() {
        return this.referenceDate;
    }

    public void setReferenceDate(Date referenceDate) {
        this.referenceDate = referenceDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getRelativeHumidity() {
        return this.relativeHumidity;
    }

    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getSampleBegin() {
        return this.sampleBegin;
    }

    public void setSampleBegin(String sampleBegin) {
        this.sampleBegin = sampleBegin;
    }

    public String getSampleEnd() {
        return this.sampleEnd;
    }

    public void setSampleEnd(String sampleEnd) {
        this.sampleEnd = sampleEnd;
    }

    public String getSampleTreatment() {
        return this.sampleTreatment;
    }

    public void setSampleTreatment(String sampleTreatment) {
        this.sampleTreatment = sampleTreatment;
    }

    public String getSampleType() {
        return this.sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public float getSnow() {
        return this.snow;
    }

    public void setSnow(float snow) {
        this.snow = snow;
    }

    public String getSnowOccurrence() {
        return this.snowOccurrence;
    }

    public void setSnowOccurrence(String snowOccurrence) {
        this.snowOccurrence = snowOccurrence;
    }

    public float getSolarRadiation() {
        return this.solarRadiation;
    }

    public void setSolarRadiation(float solarRadiation) {
        this.solarRadiation = solarRadiation;
    }

    public String getStabilityClass() {
        return this.stabilityClass;
    }

    public void setStabilityClass(String stabilityClass) {
        this.stabilityClass = stabilityClass;
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getTimeBase() {
        return this.timeBase;
    }

    public void setTimeBase(String timeBase) {
        this.timeBase = timeBase;
    }

    public String getUncertainty() {
        return this.uncertainty;
    }

    public void setUncertainty(String uncertainty) {
        this.uncertainty = uncertainty;
    }

    public String getUncertaintyType() {
        return this.uncertaintyType;
    }

    public void setUncertaintyType(String uncertaintyType) {
        this.uncertaintyType = uncertaintyType;
    }

    public String getUncertaintyUnit() {
        return this.uncertaintyUnit;
    }

    public void setUncertaintyUnit(String uncertaintyUnit) {
        this.uncertaintyUnit = uncertaintyUnit;
    }

    public String getUncertaintyConstraint() {
        return this.uncertaintyConstraint;
    }

    public void setUncertaintyConstraint(String uncertainityConstraint) {
        this.uncertaintyConstraint = uncertainityConstraint;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String Unit) {
        this.unit = Unit;
    }

    public String getValidated() {
        return this.validated;
    }

    public void setValidated(String validated) {
        this.validated = validated;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueConstraint() {
        return this.valueConstraint;
    }

    public void setValueConstraint(String valueConstraint) {
        this.valueConstraint = valueConstraint;
    }

    public String getValueType() {
        return this.valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public float getWeatherRadar() {
        return this.weatherRadar;
    }

    public void setWeatherRadar(float weatherRadar) {
        this.weatherRadar = weatherRadar;
    }

    public int getWindDirection() {
        return this.windDirection;
    }

    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindDirectionFluctuation() {
        return this.windDirectionFluctuation;
    }

    public void setWindDirectionFluctuation(int windDirectionFluctuation) {
        this.windDirectionFluctuation = windDirectionFluctuation;
    }

    public float getWindSpeed() {
        return this.windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getWindSpeedFluctuation() {
        return this.windSpeedFluctuation;
    }

    public void setWindSpeedFluctuation(float windSpeedFluctuation) {
        this.windSpeedFluctuation = windSpeedFluctuation;
    }

    public String get(String field) {
        //Convert snake case to camelCase
        field = field.toLowerCase();
        field = field.substring(0, 1).toUpperCase()
              + field.substring(1);
        StringBuilder builder
            = new StringBuilder(field);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(
                    i, i + 1,
                    String.valueOf(
                        Character.toUpperCase(
                            builder.charAt(i))));
            }
        }
        String methodName = "get" + builder.toString();
        try {
            Method method = this.getClass().getMethod(methodName);
            return (String) method.invoke(this);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " airVolume='" + getAirVolume() + "'" +
            ", apparatus='" + getApparatus() + "'" +
            ", background='" + getBackground() + "'" +
            ", backgroundMethod='" + getBackgroundMethod() + "'" +
            ", backgroundConstraint='" + getBackgroundConstraint() + "'" +
            ", begin='" + getBegin() + "'" +
            ", cloudCover='" + getCloudCover() + "'" +
            ", depthMax='" + getDepthMax() + "'" +
            ", depthMin='" + getDepthMin() + "'" +
            ", dewPointTemperature='" + getDewPointTemperature() + "'" +
            ", dopplerRadar='" + getDopplerRadar() + "'" +
            ", end='" + getEnd() + "'" +
            ", heightAboveLand='" + getHeightAboveLand() + "'" +
            ", heightAboveSea='" + getHeightAboveSea() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", localityCode='" + getLocalityCode() + "'" +
            ", localityName='" + getLocalityName() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", nuclide='" + getNuclide() + "'" +
            ", nuts='" + getNuts() + "'" +
            ", precipitation='" + getPrecipitation() + "'" +
            ", precipitationDuration='" + getPrecipitationDuration() + "'" +
            ", precipitationIntensitiy='" + getPrecipitationIntensitiy() + "'" +
            ", precipitationOccurrence='" + getPrecipitationOccurrence() + "'" +
            ", pressure='" + getPressure() + "'" +
            ", referenceDate='" + getReferenceDate() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", relativeHumidity='" + getRelativeHumidity() + "'" +
            ", sampleBegin='" + getSampleBegin() + "'" +
            ", sampleEnd='" + getSampleEnd() + "'" +
            ", sampleTreatment='" + getSampleTreatment() + "'" +
            ", sampleType='" + getSampleType() + "'" +
            ", snow='" + getSnow() + "'" +
            ", snowOccurrence='" + getSnowOccurrence() + "'" +
            ", solarRadiation='" + getSolarRadiation() + "'" +
            ", stabilityClass='" + getStabilityClass() + "'" +
            ", temperature='" + getTemperature() + "'" +
            ", timeBase='" + getTimeBase() + "'" +
            ", uncertainty='" + getUncertainty() + "'" +
            ", uncertaintyType='" + getUncertaintyType() + "'" +
            ", uncertaintyUnit='" + getUncertaintyUnit() + "'" +
            ", uncertainityConstraint='" + getUncertaintyConstraint() + "'" +
            ", Unit='" + getUnit() + "'" +
            ", validated='" + getValidated() + "'" +
            ", value='" + getValue() + "'" +
            ", valueConstraint='" + getValueConstraint() + "'" +
            ", valueType='" + getValueType() + "'" +
            ", weatherRadar='" + getWeatherRadar() + "'" +
            ", windDirection='" + getWindDirection() + "'" +
            ", windDirectionFluctuation='" + getWindDirectionFluctuation() + "'" +
            ", windSpeed='" + getWindSpeed() + "'" +
            ", windSpeedFluctuation='" + getWindSpeedFluctuation() + "'" +
            "}";
    }

}
