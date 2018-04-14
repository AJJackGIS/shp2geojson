package src.geojson.geometry;

import geojson.GeoType;

import java.util.List;

public class GeoGeometryPolygon extends GeoGeometry {
	
	public GeoGeometryPolygon(){
		this.type = GeoType.GEO_POLYGON;
	}
	
	private List<List<double[]>> coordinates;

	public List<List<double[]>> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<List<double[]>> coordinates) {
		this.coordinates = coordinates;
	}

}
