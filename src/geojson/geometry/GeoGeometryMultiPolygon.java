package src.geojson.geometry;

import geojson.GeoType;

import java.util.List;

public class GeoGeometryMultiPolygon extends GeoGeometry {
	
	public GeoGeometryMultiPolygon(){
		this.type = GeoType.GEO_MULTIPOLYGON;
	}
	
	private List<List<List<double[]>>> coordinates;

	public List<List<List<double[]>>> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<List<List<double[]>>> coordinates) {
		this.coordinates = coordinates;
	}

}
