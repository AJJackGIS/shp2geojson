package src.geojson;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义GeoJson格式的对象类
 * 
 * @author Aojie
 * 
 */
public class GeoFeatureCollection {
	/**
	 * 一般指定为GeoType类中的FeatureCollection
	 */
	private String type;
	/**
	 * Feature集合
	 */
	private List<GeoFeature> features = new ArrayList<>();

	public GeoFeatureCollection() {
		this.type = GeoType.GEO_FEATURECOLLECTION;
	}

	public GeoFeatureCollection(List<GeoFeature> features) {
		this();
		this.features = features;
	}
	
	public String getType() {
		return type;
	}

	public List<GeoFeature> getFeatures() {
		return features;
	}

	public void setFeatures(List<GeoFeature> features) {
		this.features = features;
	}

}
