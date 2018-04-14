package src.geojson;

/**
 * GeoType类型
 * 
 * @author Aojie
 * 
 */
public class GeoType {
	/**
	 * 点
	 */
	public static String GEO_POINT = "Point";
	/**
	 * 多点
	 */
	public static String GEO_MULTIPOINT = "MultiPoint";
	/**
	 * 线
	 */
	public static String GEO_LINESTRING = "LineString";
	/**
	 * 多线
	 */
	public static String GEO_MULTILINESTRING = "MultiLineString";
	/**
	 * 面
	 */
	public static String GEO_POLYGON = "Polygon";
	/**
	 * 多面
	 */
	public static String GEO_MULTIPOLYGON = "MultiPolygon";
	/**
	 * 几何集合
	 */
	public static String GEO_GEOMETRYCOLLECTION = "GeometryCollection";
	/**
	 * 特征对象
	 */
	public static String GEO_FEATURE = "Feature";
	/**
	 * 特征集合对象
	 */
	public static String GEO_FEATURECOLLECTION = "FeatureCollection";
	/**
	 * 坐标参考系统(名字CRS)
	 */
	public static String CRS_NAME = "name";
	/**
	 * 坐标参考系统(连接CRS)
	 */
	public static String CRS_LINK = "link";
	/**
	 * CRS参数的格式(PROJ4)
	 */
	public static String CRS_PROJ4 = "proj4";
	/**
	 * CRS参数的格式(OGCWKT)
	 */
	public static String CRS_OGCWKT = "ogcwkt";
	/**
	 * CRS参数的格式(ESRIWKT)
	 */
	public static String CRS_ESRIWKT = "esriwkt";
}
