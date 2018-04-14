package src.geojson.geometry;

import geojson.GeoType;


public class GeoGeometryPoint extends GeoGeometry {
	
	public GeoGeometryPoint(){
		this.type = GeoType.GEO_POINT;
	}
	
	private double[] coordinates;

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}

}
