package src.geojson;

import geojson.geometry.GeoGeometry;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 定义GeoJson中Feature对象类型
 * 
 * @author Aojie
 * 
 */
public class GeoFeature {
	/**
	 * 类型一般指定为GeoFeature类中的Feature
	 */
	private String type;
	/**
	 * 坐标参考系统(分为名字CRS和连接CRS,通过GeoCRS中的type属性指定类型)
	 */
	private GeoCRS crs;
	/**
	 * 边界框(bbox成员的值必须是2*n数组,由N个坐标点组成,前者为最低点,后者为最高点)
	 */
	private double[] bbox;
	/**
	 * GIS对象
	 */
	private GeoGeometry geometry;
	/**
	 * 自定义其他属性几何
	 */
	private Map<String, Object> properties = new LinkedHashMap<String, Object>();
	
	public GeoFeature() {
		this.type = GeoType.GEO_FEATURE;
	}

	public GeoFeature(GeoGeometry geometry) {
		this();
		this.geometry = geometry;
	}

	public GeoFeature(GeoGeometry geometry, Map<String, Object> properties) {
		this(geometry);
		this.properties = properties;
	}

	public GeoFeature(GeoCRS crs, GeoGeometry geometry, Map<String, Object> properties) {
		this(geometry, properties);
		this.crs = crs;
	}

	public GeoFeature(GeoCRS crs, double[] bbox, GeoGeometry geometry, Map<String, Object> properties) {
		this(crs, geometry, properties);
		this.bbox = bbox;
	}

	public String getType() {
		return type;
	}

	public GeoCRS getCrs() {
		return crs;
	}

	public void setCrs(GeoCRS crs) {
		this.crs = crs;
	}

	public double[] getBbox() {
		return bbox;
	}

	public void setBbox(double[] bbox) {
		this.bbox = bbox;
	}

	public GeoGeometry getGeometry() {
		return geometry;
	}

	public void setGeometry(GeoGeometry geometry) {
		this.geometry = geometry;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

}
