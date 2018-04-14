package src.geojson.geometry;

import geojson.GeoType;

import java.util.List;

public class GeoGeometryCollection extends GeoGeometry {
	/**
	 * GIS类型,一般指定GeometryCollection
	 */
	public GeoGeometryCollection() {
		this.type = GeoType.GEO_GEOMETRYCOLLECTION;
	}

	private List<GeoGeometry> geometries;

	public List<GeoGeometry> getGeometries() {
		return geometries;
	}

	public void setGeometries(List<GeoGeometry> geometries) {
		this.geometries = geometries;
	}

}
