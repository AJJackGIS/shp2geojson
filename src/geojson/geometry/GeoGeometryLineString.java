package src.geojson.geometry;

import geojson.GeoType;

import java.util.List;

public class GeoGeometryLineString extends GeoGeometry {
	
	public GeoGeometryLineString(){
		this.type = GeoType.GEO_LINESTRING;
	}
	
	private List<double[]> coordinates;

	public List<double[]> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<double[]> coordinates) {
		this.coordinates = coordinates;
	}

}
