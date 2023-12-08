package de.bfs.eurdepparser;

/**
 * Class storing eurdep specific string .
 * @author Alexander Woestmann <awoestmann@intevation.de>
 */
public class EURDEPStrings {
    //String constants
    //Format specific constants
    public static final String BEGIN_LINE = "\\";
    public static final String END_LINE = ";";
    public static final String BEGIN_EURDEP = "BEGIN_EURDEP";
    public static final String END_EURDEP = "END_EURDEP";
    public static final String BEGIN_HEADER = "BEGIN_HEADER";
    public static final String END_HEADER = "END_HEADER";
    public static final String BEGIN_LOCALITY = "BEGIN_LOCALITY";
    public static final String END_LOCALITY = "END_LOCALITY";
    public static final String FIELD_LIST = "FIELD_LIST";
    public static final String BEGIN_RADIOLOGICAL = "BEGIN_RADIOLOGICAL";
    public static final String END_RADIOLOGICAL = "END_RADIOLOGICAL";
    public static final String LINE_BREAK = "\n";

    //Header field names
    public static final String COUNTRY_CODE = "COUNTRY_CODE";
    public static final String IMPORTANCE = "IMPORTANCE";
    public static final String SOFTWARE_VERSION = "SOFTWARE_VERSION";
    public static final String ORIGINATOR = "ORIGINATOR";
    public static final String CARRIER = "CARRIER";
    public static final String SENT = "SENT";
    public static final String FORMAT_VERSION = "FORMAT_VERSION";
    public static final String MESSAGE_ID = "MESSAGE_ID";
    public static final String FILENAME = "FILENAME";

    //Locality field names
    public static final String LOCAL_LOCALITY_CODE = "LOCALITY_CODE";
    public static final String LOCALITY_NAME = "LOCALITY_NAME";
    public static final String LOCAL_LONGITUDE = "LONGITUDE";
    public static final String LOCAL_LATITUDE = "LATITUDE";
    public static final String LOCAL_HEIGHT_ABOVE_LAND = "HEIGHT_ABOVE_LAND";
    public static final String LOCAL_HEIGHT_ABOVE_SEA = "HEIGHT_ABOVE_SEA";
    public static final String LOCAL_NUTS = "NUTS";

    //Radiological field names
    public static final String RAD_AIR_VOLUME = "AIR_VOLUME";
    public static final String RAD_APPARATUS = "APPARATUS";
    public static final String RAD_BACKGROUND = "BACKGROUND";
    public static final String RAD_BACKGROUND_METHOD = "BACKGROUND_METHOD";
    public static final String RAD_BACKGROUND_CONSTRAINT = "BACKGROUND_CONSTRAINT";
    public static final String RAD_BEGIN = "BEGIN";
    public static final String RAD_CLOUD_COVER = "CLOUD_COVER";
    public static final String RAD_DEPTH_MAX = "DEPTH_MAX";
    public static final String RAD_DEPTH_MIN = "DEPTH_MIN";
    public static final String RAD_DEW_POINT_TEMPERATURE = "DEW_POINT_TEMPERATURE ";
    public static final String RAD_DOPPLER_RADAR = "DOPPLER_RADAR";
    public static final String RAD_END = "END";
    public static final String RAD_HEIGHT_ABOVE_LAND = "HEIGHT_ABOVE_LAND";
    public static final String RAD_HEIGHT_ABOVE_SEA = "HEIGHT_ABOVE_SEA";
    public static final String RAD_LATITUDE = "LATITUDE";
    public static final String RAD_LOCALITY_CODE = "LOCALITY_CODE";
    public static final String RAD_LOCALITY_NAME = "LOCALITY_NAME";
    public static final String RAD_LONGITUDE = "LONGITUDE";
    public static final String RAD_NUCLIDE = "NUCLIDE";
    public static final String RAD_NUTS = "NUTS";
    public static final String RAD_PRECIPITATION = "PRECIPITATION";
    public static final String RAD_PRECIPITATION_DURATION = "PRECIPITATION_DURATION";
    public static final String RAD_PRECIPITATION_INTENSITY = "PRECIPITATION_INTENSITY";
    public static final String RAD_PRECIPITATION_OCCURENCE = "PRECIPITATION_OCCURENCE";
    public static final String RAD_PRESSURE = "PRESSURE";
    public static final String RAD_REFERENCE_DATE = "REFERENCE_DATE";
    public static final String RAD_REMARKS = "REMARKS";
    public static final String RAD_RELATIVE_HUMIDITY = "RELATIVE_HUMIDITY";
    public static final String RAD_SAMPLE_BEGIN = "SAMPLE_BEGIN";
    public static final String RAD_SAMPLE_END = "SAMPLE_END";
    public static final String RAD_SAMPLE_TREATMENT = "SAMPLE_TREATMENT";
    public static final String RAD_SAMPLE_TYPE = "SAMPLE_TYPE";
    public static final String RAD_SNOW = "SNOW";
    public static final String RAD_SNOW_OCCURENCE = "SNOW_OCCURENCE";
    public static final String RAD_SOLAR_RADIATION = "SOLAR_RADIATION";
    public static final String RAD_STABILITY_CLASS = "STABILITY_CLASS";
    public static final String RAD_TEMPERATURE = "TEMPERATURE";
    public static final String RAD_TIME_BASE = "TIME_BASE";
    public static final String RAD_UNCERTAINTY = "UNCERTAINTY";
    public static final String RAD_UNCERTAINTY_TYPE = "UNCERTAINTY_TYPE";
    public static final String RAD_UNCERTAINTY_UNIT = "UNCERTAINTY_UNIT";
    public static final String RAD_UNCERTAINTY_CONSTRAINT = "UNCERTAINTY_CONSTRAINT";
    public static final String RAD_UNIT = "UNIT";
    public static final String RAD_VALIDATED = "VALIDATED";
    public static final String RAD_VALUE = "VALUE";
    public static final String RAD_VALUE_CONSTRAINT = "VALUE_CONSTRAINT";
    public static final String RAD_VALUE_TYPE = "VALUE_TYPE";
    public static final String RAD_WEATHER_RADAR = "WEATHER_RADAR";
    public static final String RAD_WIND_DIRECTION = "WIND_DIRECTION";
    public static final String RAD_WIND_DIRECTION_FLUCTUATION = "WIND_DIRECTION_FLUCTUATION";
    public static final String RAD_WIND_SPEED = "WIND_SPEED";
    public static final String RAD_WIND_SPEED_FLUCTUATION = "WIND_SPEED_FLUCTUATION";
}
