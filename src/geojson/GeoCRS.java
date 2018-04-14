package src.geojson;

/**
 * 坐标参考系统
 * 
 * @author Aojie
 * 
 */
public class GeoCRS {
	/**
	 * 一般指定为GeoType类中name或者link
	 */
	private String type;
	/**
	 * 坐标描述
	 */
	private GeoCRSProperty properties;

	public GeoCRS() {
	}

	public GeoCRS(String type, GeoCRSProperty properties) {
		this.type = type;
		this.properties = properties;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GeoCRSProperty getProperties() {
		return properties;
	}

	public void setProperties(GeoCRSProperty properties) {
		this.properties = properties;
	}

}
