package src.geojson;

/**
 * 坐标描述对象 如果crs的type指定为name,则只需指定name属性即可,如果type指定为link,则只需指定href和type属性
 * 
 * @author Aojie
 * 
 */
public class GeoCRSProperty {
	/**
	 * 坐标名称(例如：urn:ogc:def:crs:OGC:1.3:CRS84)
	 */
	private String name;
	/**
	 * 引用的URI(统一资源标识)
	 */
	private String href;
	/**
	 * 可选,一般指定为PROJ4、OGCWKT或ESRIWKT,也可以使用其他值
	 */
	private String type;

	public GeoCRSProperty() {
	}

	public GeoCRSProperty(String name) {
		this.name = name;
	}

	public GeoCRSProperty(String href, String type) {
		this.href = href;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
