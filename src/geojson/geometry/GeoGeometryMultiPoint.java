package src.geojson.geometry;

import geojson.GeoType;

import java.util.List;

public class GeoGeometryMultiPoint extends GeoGeometry {
	
	public GeoGeometryMultiPoint(){
		this.type = GeoType.GEO_MULTIPOINT;
	}
	
	private List<double[]> coordinates;

	public List<double[]> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<double[]> coordinates) {
		this.coordinates = coordinates;
	}

}
