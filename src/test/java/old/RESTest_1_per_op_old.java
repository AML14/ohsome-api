package old;

import org.evomaster.client.java.controller.SutHandler;
import org.heigit.ohsome.ohsomeapi.EMDriver;
import org.junit.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RESTest_1_per_op_old {

	private static final SutHandler controller = new EMDriver();
	private static String baseUrlOfSut;


	@BeforeClass
	public static void initClass() {
		controller.setupForGeneratedTest();
		baseUrlOfSut = controller.startSut();
		assertNotNull(baseUrlOfSut);
//		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
//		RestAssured.useRelaxedHTTPSValidation();
//		RestAssured.urlEncodingEnabled = false;
//		RestAssured.config = RestAssured.config()
//				.jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
//				.redirect(redirectConfig().followRedirects(false));
	}


	@AfterClass
	public static void tearDown() {
		controller.stopSut();
	}


	@Before
	public void initTest() {
		controller.resetStateOfSUT();
	}


	@Test
	public void test_qeeycxsol8bo_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2010-04-10")
				.queryParam("bpolys", "PUoFQ:8.704561,49.403252,8.7411,49.4357,8.701,49.418,8.702,49.4225,8.704561,49.403252|QG:8.704561,49.403252,8.748,49.42822,8.70085,49.4307,8.734,49.422702,8.704561,49.403252|AIEqU:8.704561,49.403252,8.7322,49.415111,8.70613,49.42344,8.7359,49.424,8.704561,49.403252")
			.when()
				.get("/elements/area");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iukdcg05ee60_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-06-09")
				.queryParam("bpolys", "aU:8.704561,49.403252,8.720,49.401,8.7107,49.433815,8.70959,49.4361,8.704561,49.403252")
			.when()
				.post("/elements/area");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyi9pzcsn582_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "amj:8.72837,49.408158,7|ufSu:8.7248,49.433,7")
			.when()
				.get("/elements/area/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyq347ffuiib_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "sW:8.673,49.4047,8.7133,49.3962")
				.queryParam("keys", "highway")
				.queryParam("timeout", "65")
			.when()
				.post("/elements/area/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4q5r3sw0bas_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "lV:8.704561,49.403252,8.734,49.419,8.709,49.410,8.704,49.4079,8.704561,49.403252")
			.when()
				.get("/elements/area/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jefzd80d4m7a_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or geometry:line or not length:( .. 100)")
				.queryParam("bboxes", "w:8.689,49.4283,8.7405,49.39066|HXfjv:8.668369,49.426952,8.7475,49.397|ho:8.675607,49.407,8.754,49.3991|Qyi:8.672,49.417,8.741,49.38959")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-09-30")
				.queryParam("timeout", "83")
			.when()
				.post("/elements/area/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe133jxlxuep_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link,footway,commercial")
				.queryParam("bboxes", "8.6842,49.421,8.7131,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2008-01-27")
			.when()
				.get("/elements/area/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jenq3zchmaua_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2015-01-05")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "Av:8.724,49.4257,8")
			.when()
				.post("/elements/area/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t842zgv35gs8_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.672563,49.414,8.710509,49.3954|8.6877,49.400,8.724,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
			.when()
				.get("/elements/area/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrmjowpr5vzr_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-02-23")
				.queryParam("bpolys", "QJ:8.704561,49.403252,8.7096,49.404,8.733,49.415,8.73844,49.4320,8.704561,49.403252")
			.when()
				.post("/elements/area/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf45lnytdctz_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-08-14")
				.queryParam("bcircles", "Xlhcq:8.72804,49.419289,2|Yg:8.748,49.407,19|Q:8.741,49.430,5")
			.when()
				.get("/elements/area/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf6zbpbtdqnt_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6669,49.40337,8.72412,49.389|8.670,49.41950,8.7234,49.392")
				.queryParam("format", "csv")
			.when()
				.post("/elements/area/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb6agp4e0eup_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2017-04-12")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "MU:8.715134,49.402,2")
			.when()
				.get("/elements/area/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jefzdlv92ywh_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2016-06-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.413],[8.720,49.435],[8.7397,49.407],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "63")
			.when()
				.post("/elements/area/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbshqzzihxrm_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,emergency_access_point,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-05-23")
				.queryParam("bpolys", "8.704561,49.403252,8.719,49.425,8.747,49.436,8.704868,49.4199,8.704561,49.403252")
				.queryParam("timeout", "37")
			.when()
				.get("/elements/area/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skvm8m4y6vl1_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-03-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"J\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.412297],[8.707,49.420],[8.718,49.413],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.407],[8.704023,49.4247],[8.72944,49.430],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"n\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74334,49.423],[8.701,49.41019],[8.7045,49.4084],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "93")
			.when()
				.post("/elements/area/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1if3x4xzh46_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* or type:relation or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "lWKr:8.672,49.407,8.717,49.3897")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-02-26")
				.queryParam("groupByKeys", "oneway,tracktype")
			.when()
				.get("/elements/area/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8cwazrpaipj_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=*")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-04-17")
				.queryParam("timeout", "71")
				.queryParam("groupByKeys", "highway,ref,lanes:forward")
				.queryParam("bcircles", "8.70153,49.405,99")
			.when()
				.post("/elements/area/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1h6738clvsp_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2008-01-26")
				.queryParam("bpolys", "8.704561,49.403252,8.722,49.423,8.702119,49.424944,8.7110,49.416,8.704561,49.403252")
			.when()
				.get("/elements/area/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1gonuuyz2ut_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-09-18")
				.queryParam("bcircles", "Njg:8.742983,49.427,45")
			.when()
				.post("/elements/area/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urun1u56wpio_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bcircles", "uG:8.749,49.4061,8")
			.when()
				.get("/elements/area/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h84roh1kus6s_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UjM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73346,49.421],[8.7027,49.424],[8.705268,49.41186],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7037,49.4154],[8.726,49.415],[8.727,49.418679],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "62")
			.when()
				.post("/elements/area/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4q6gqul08de_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=*")
				.queryParam("types2", "line,")
				.queryParam("format", "csv")
				.queryParam("filter2", "addr:city!=* and not length:( .. 100)")
				.queryParam("time", "2014-01-03")
				.queryParam("bpolys", "JWbtF:8.704561,49.403252,8.723,49.425,8.704567,49.4158,8.7238,49.407,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "elevator")
			.when()
				.get("/elements/area/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyhs6syy9kc5_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "jSG:8.704561,49.403252,8.714,49.417,8.713,49.409471,8.70748,49.4377,8.704561,49.403252|d:8.704561,49.403252,8.7334,49.433,8.70008,49.409,8.749307,49.4106,8.704561,49.403252|D:8.704561,49.403252,8.7410,49.438426,8.7427,49.415,8.7060,49.404,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_signals")
			.when()
				.post("/elements/area/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5ygxpccawn_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,polygon,")
				.queryParam("time", "2016-07-16")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "91")
				.queryParam("values2", "bus_stop")
				.queryParam("bcircles", "HYtIG:8.70975,49.4216,2|K:8.729,49.421,93|h:8.732,49.422,4|a:8.712774,49.421,732410139182")
			.when()
				.get("/elements/area/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts4qdzs767vo_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or not type:way and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "58")
				.queryParam("values2", "emergency_access_point")
				.queryParam("bcircles", "s:8.7136,49.423,1")
			.when()
				.post("/elements/area/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skxx69puviht_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or geometry:line")
				.queryParam("format", "csv")
				.queryParam("bpolys", "vq:8.704561,49.403252,8.745,49.428,8.702,49.427,8.73360,49.433,8.704561,49.403252|c:8.704561,49.403252,8.7367,49.401,8.729,49.408077,8.743,49.417,8.704561,49.403252")
			.when()
				.get("/elements/count");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tnzjn5hjtwz8_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "id:8.69508,49.402,8.7524,49.381")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-09-01")
				.queryParam("timeout", "59")
			.when()
				.post("/elements/count");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbissuxjwwv7_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"VM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7486,49.42087],[8.725,49.437],[8.729,49.4082],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"bZk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71279,49.404],[8.722,49.4155],[8.71949,49.4165],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"SlY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.4338],[8.700,49.4217],[8.7324,49.413751],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "93")
			.when()
				.get("/elements/count/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5y38r7zgvq_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6846,49.421,8.741615,49.3964")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "26")
			.when()
				.post("/elements/count/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrh04x6xestf_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-12-03")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "s:8.7376,49.4269,4")
			.when()
				.get("/elements/count/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4nvu7u25bg2_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "8.711,49.438,7")
			.when()
				.post("/elements/count/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skstapcalagm_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vSi:8.660,49.409,8.752,49.3813|F:8.66819,49.407184,8.752,49.392|ADF:8.6862,49.422,8.75483,49.39437")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-04-21")
				.queryParam("timeout", "75")
			.when()
				.get("/elements/count/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7trpakdejw8_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.680,49.410,8.736,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("time", "2016-08-30")
				.queryParam("timeout", "64")
			.when()
				.post("/elements/count/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyis9f4cl6pi_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-10-16")
				.queryParam("bcircles", "jzo:8.735278,49.425805,6")
			.when()
				.get("/elements/count/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to7d3r5o0n5c_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,office,public")
				.queryParam("bboxes", "NOTXH:8.686,49.4298,8.7211,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
			.when()
				.post("/elements/count/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg1nwvecm03_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-07-26")
				.queryParam("bpolys", "qxHTl:8.704561,49.403252,8.7472,49.406,8.70788,49.420,8.70168,49.424,8.704561,49.403252|N:8.704561,49.403252,8.7112,49.417670,8.70491,49.41857,8.708,49.4120,8.704561,49.403252|nPp:8.704561,49.403252,8.7303,49.406,8.719,49.4340,8.74269,49.408,8.704561,49.403252")
			.when()
				.get("/elements/count/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s504q69pm9m9_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72322,49.426],[8.708,49.439],[8.716,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
			.when()
				.post("/elements/count/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rkzk4rnqsy8x_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "O:8.690,49.4238,8.71790,49.3903")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "95")
			.when()
				.get("/elements/count/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jefyo2f4mesh_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:line and length:( .. 100)")
				.queryParam("time", "2011-03-03")
				.queryParam("bpolys", "iC:8.704561,49.403252,8.7297,49.4019,8.7495,49.427,8.722,49.435,8.704561,49.403252|u:8.704561,49.403252,8.725,49.405,8.7350,49.424,8.701492,49.401192,8.704561,49.403252|s:8.704561,49.403252,8.7365,49.4331,8.726,49.41956,8.720,49.425,8.704561,49.403252")
			.when()
				.post("/elements/count/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t842zajufejp_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("bcircles", "bND:8.715,49.413,6")
			.when()
				.get("/elements/count/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl2vukvmyrfm_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and geometry:polygon")
				.queryParam("bboxes", "hJS:8.689,49.4238,8.7513,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
			.when()
				.post("/elements/count/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jel0ljl5cv37_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-03-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ly\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735831,49.421],[8.703,49.419],[8.7277,49.4012],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IlA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.405132],[8.704926,49.413],[8.72729,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7369,49.4085],[8.702,49.4009],[8.700,49.4192],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "lanes:backward,sidewalk,turn")
			.when()
				.get("/elements/count/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy2opoieh0dw_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "GgtQ:8.6791,49.4294,8.745,49.3837|L:8.65875,49.420,8.722,49.398|PJoiQ:8.6955,49.42856,8.71371,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "surface,lanes:forward,bicycle")
			.when()
				.post("/elements/count/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_soneq9twycdw_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,residential,university")
				.queryParam("filter", "foot=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "WM:8.688,49.4204,8.7557,49.387|XaMCX:8.6613,49.40937,8.7229,49.38669")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2017-11-30")
				.queryParam("timeout", "32")
			.when()
				.get("/elements/count/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhlmw6elhrhd_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,give_way")
				.queryParam("bboxes", "O:8.679,49.406,8.728,49.397|yVbXd:8.664107,49.400,8.704,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "45")
			.when()
				.post("/elements/count/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t49jhzj2ejq9_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-09-14")
				.queryParam("bpolys", "Q:8.704561,49.403252,8.735048,49.422,8.704,49.4136,8.708,49.4065,8.704561,49.403252|be:8.704561,49.403252,8.711,49.439,8.732,49.414206,8.702,49.414,8.704561,49.403252|l:8.704561,49.403252,8.725,49.407,8.7003,49.412,8.7493,49.42869,8.704561,49.403252")
				.queryParam("timeout", "21")
			.when()
				.get("/elements/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhnu19flhwz4_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or geometry:line or not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.7047,49.435,8|8.736,49.433,9|8.70991,49.41940,4")
			.when()
				.post("/elements/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t81tx1vk2am0_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.7360,49.422,1|8.71804,49.404,2")
			.when()
				.get("/elements/count/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbahvcjntm5f_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "C:8.6910,49.4247,8.743,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "maxspeed=* and geometry:point and id:(1 .. 9999)")
				.queryParam("timeout", "78")
			.when()
				.post("/elements/count/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvk8vyj1knqo_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or geometry:line")
				.queryParam("bboxes", "8.65557,49.423,8.748,49.391|8.661,49.410341,8.73633,49.3907|8.675,49.4072,8.733,49.3807")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
			.when()
				.get("/elements/count/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jelhtl22mlvc_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.714,49.4222,8.705,49.422926,8.732,49.424,8.704561,49.403252|8.704561,49.403252,8.7313,49.434,8.715,49.400,8.7008,49.4376,8.704561,49.403252|8.704561,49.403252,8.740,49.428722,8.74359,49.4204,8.705507,49.4309,8.704561,49.403252")
				.queryParam("timeout", "35")
			.when()
				.post("/elements/count/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv2ot5lmakvl_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "o:8.658,49.423393,8.7383,49.380")
				.queryParam("format", "csv")
				.queryParam("timeout", "96")
			.when()
				.get("/elements/length");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4a0kpma1sfs_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-09-21")
				.queryParam("bcircles", "8.746,49.42615,140")
			.when()
				.post("/elements/length");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbmy9z02zuqp_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or length:( .. 100)")
				.queryParam("time", "2012-06-17")
				.queryParam("bpolys", "F:8.704561,49.403252,8.745,49.430,8.7050,49.42913,8.741,49.415,8.704561,49.403252")
				.queryParam("timeout", "47")
			.when()
				.get("/elements/length/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1if0ljl48hmwo_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("bcircles", "PZ:8.731029,49.4126,26|HzFQU:8.721,49.410,6")
			.when()
				.post("/elements/length/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urv6uxunbfj9_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Pct:8.6893,49.410683,8.749,49.3840")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "79")
			.when()
				.get("/elements/length/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhdulspsyjow_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and not geometry:line")
				.queryParam("bboxes", "xG:8.696,49.4072,8.70783,49.394")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-07-03")
				.queryParam("timeout", "22")
			.when()
				.post("/elements/length/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skq30d7zw6k0_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,roof,speed_camera")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-12-31")
				.queryParam("bpolys", "8.704561,49.403252,8.701,49.401187,8.726,49.408,8.7048,49.424,8.704561,49.403252|8.704561,49.403252,8.702,49.41388,8.709,49.4342,8.7436,49.400811,8.704561,49.403252|8.704561,49.403252,8.73963,49.410,8.7049,49.41469,8.73838,49.421,8.704561,49.403252")
				.queryParam("timeout", "33")
			.when()
				.get("/elements/length/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1je9wsqp5n229_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("bpolys", "KqHvN:8.704561,49.403252,8.728,49.428,8.73892,49.413,8.727,49.406,8.704561,49.403252")
				.queryParam("timeout", "45")
			.when()
				.post("/elements/length/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbq92uema4he_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "F:8.704561,49.403252,8.743,49.4105,8.70417,49.428417,8.7043,49.438870,8.704561,49.403252")
			.when()
				.get("/elements/length/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl54wv68r969_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_mirror,street_lamp")
				.queryParam("filter", "foot!=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2012-09-14")
				.queryParam("bcircles", "S:8.719,49.40253,7|zD:8.718,49.4352,9")
			.when()
				.post("/elements/length/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh7schvypeev_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-02-13")
				.queryParam("bpolys", "8.704561,49.403252,8.705,49.417,8.711,49.407,8.72649,49.405909,8.704561,49.403252")
			.when()
				.get("/elements/length/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7zrjk5mv42q_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.674,49.41240,8.709,49.381")
				.queryParam("time", "2010-10-12")
			.when()
				.post("/elements/length/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iey9tbngosvr_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-04-30")
				.queryParam("bcircles", "tUZyk:8.736,49.436271,92")
			.when()
				.get("/elements/length/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh4yaw7fw0gz_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and geometry:point")
				.queryParam("bboxes", "ZTV:8.6958,49.400985,8.700,49.393|ou:8.6729,49.4075,8.7037,49.382|p:8.679749,49.416,8.740,49.389|BESY:8.67660,49.428,8.705,49.390764")
				.queryParam("format", "csv")
				.queryParam("time", "2011-06-02")
			.when()
				.post("/elements/length/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jig1p5et6hk1_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office")
				.queryParam("filter", "addr:housenumber=* and geometry:point or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"kxT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710333,49.408],[8.73070,49.410],[8.741,49.438],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734994,49.404162],[8.70753,49.427],[8.73998,49.434],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "97")
			.when()
				.get("/elements/length/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji7a0aytujp3_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tower,school")
				.queryParam("bboxes", "BAghT:8.66770,49.429809,8.754125,49.384|j:8.68924,49.421,8.75828,49.396|EhxlK:8.67678,49.42157,8.755566,49.384|sIBCc:8.6757,49.401,8.70117,49.3869")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "44")
			.when()
				.post("/elements/length/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hr5vsk9ud44z_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-02-06")
				.queryParam("timeout", "36")
				.queryParam("groupByKeys", "addr:city,destination")
				.queryParam("bcircles", "TFW:8.73417,49.429,6")
			.when()
				.get("/elements/length/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u803xdxxbtwz_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("time", "2010-06-03")
				.queryParam("bpolys", "UeK:8.704561,49.403252,8.71963,49.414,8.716,49.4308,8.7023,49.42997,8.704561,49.403252|v:8.704561,49.403252,8.706,49.400,8.728,49.422,8.733,49.408,8.704561,49.403252")
				.queryParam("timeout", "69")
				.queryParam("groupByKeys", "lit,landuse,addr:postcode")
			.when()
				.post("/elements/length/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ure1hrxjbqya_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XNc:8.6745,49.427,8.70508,49.399|ceH:8.6623,49.414,8.734,49.384|vAXfQ:8.651,49.42921,8.700,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
			.when()
				.get("/elements/length/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1wpn1liyusj_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,primary_link,elevator")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-02-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.4059],[8.700,49.4212],[8.703,49.431],[8.704561,49.403252]]]}}]}")
			.when()
				.post("/elements/length/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iauu9xteovad_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "DG:8.698,49.416587,8.722,49.389|zWUTj:8.668,49.420,8.744,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("time", "2009-12-24")
				.queryParam("timeout", "55")
			.when()
				.get("/elements/length/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7u4eauorr6t_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.431011],[8.748,49.404],[8.724,49.4009],[8.704561,49.403252]]]}}]}")
			.when()
				.post("/elements/length/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sok48yrocgfo_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=*")
				.queryParam("format", "geojson")
				.queryParam("filter2", "maxspeed=* and geometry:polygon and id:(1 .. 9999)")
				.queryParam("bcircles", "g:8.7269,49.411,33")
			.when()
				.get("/elements/length/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to4mf5pefvw1_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "type=* or geometry:line and id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Iw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7346,49.411538],[8.70457,49.410578],[8.705,49.42926],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "44")
				.queryParam("values2", "service")
			.when()
				.post("/elements/length/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toa4sudqq7oh_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* or not id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.709,49.4351,4")
			.when()
				.get("/elements/length/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4p39kegnepl_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "WGie:8.672,49.4271,8.755,49.380|fSF:8.673,49.40364,8.7370,49.3822")
				.queryParam("types2", "line,")
				.queryParam("showMetadata", "false")
			.when()
				.post("/elements/length/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyd93oybr2ar_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or not area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2013-01-25")
				.queryParam("bcircles", "8.748,49.407,46")
			.when()
				.get("/elements/perimeter");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hraynuvlls1d_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-09-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NsIfQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70733,49.4043],[8.7043,49.4160],[8.715286,49.412747],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"eu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7220,49.4044],[8.738342,49.4301],[8.706,49.4262],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7380,49.4125],[8.706,49.4140],[8.70194,49.406227],[8.704561,49.403252]]]}}]}")
			.when()
				.post("/elements/perimeter");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s163vpqcngom_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-12-31")
				.queryParam("bcircles", "rYecy:8.727,49.4112,625|TcpOr:8.747,49.422,6|QazrH:8.733918,49.4071,79|vpuYp:8.7118,49.410,27")
			.when()
				.get("/elements/perimeter/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhw5rbsn4px1_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("time", "2012-05-01")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "8.737,49.423,8|8.737,49.409,725|8.732,49.422799,6")
			.when()
				.post("/elements/perimeter/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts57gkaaivjq_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-08-23")
				.queryParam("bpolys", "d:8.704561,49.403252,8.722,49.439187,8.712,49.404,8.709,49.413,8.704561,49.403252")
			.when()
				.get("/elements/perimeter/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k2519tl9zfao_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-07-09")
				.queryParam("bpolys", "vaeZA:8.704561,49.403252,8.739,49.4231,8.7128,49.408521,8.7048,49.4338,8.704561,49.403252|S:8.704561,49.403252,8.7287,49.4084,8.74763,49.435,8.705055,49.433,8.704561,49.403252")
			.when()
				.post("/elements/perimeter/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urmc1vaig40x_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage")
				.queryParam("filter", "foot!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "DLPK:8.6878,49.42269,8.7330,49.396|O:8.6866,49.408,8.731,49.3812")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "74")
			.when()
				.get("/elements/perimeter/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7zaslyphe90_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "cycleway")
				.queryParam("filter", "turn=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.6894,49.4278,8.70424,49.395|8.688,49.4029,8.701416,49.388|8.67867,49.4077,8.709,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-11-22")
			.when()
				.post("/elements/perimeter/density/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxw4x939e1bs_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,synagogue,station")
				.queryParam("filter", "lanes:backward!=* or type:relation")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-09-19")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "8.7414,49.4198,6|8.701,49.405,5|8.732,49.434,815478014")
			.when()
				.get("/elements/perimeter/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbhdkcbl4rc6_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,roof,primary")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-08-08")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "8.7304,49.407376,2")
			.when()
				.post("/elements/perimeter/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyjclvr1606b_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "F:8.6623,49.4036,8.707,49.380|IMNY:8.650,49.409,8.751,49.3917|Sx:8.667526,49.41475,8.7400,49.384|G:8.662,49.401114,8.730,49.396")
				.queryParam("showMetadata", "no")
			.when()
				.get("/elements/perimeter/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1huxor4yzlx7l_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=*")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "rOqm:8.711880,49.402022,91")
			.when()
				.post("/elements/perimeter/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts1vhx1vt6ib_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or type:way or length:( .. 100)")
				.queryParam("bboxes", "wK:8.663,49.422,8.743,49.380")
				.queryParam("time", "2012-08-05")
				.queryParam("timeout", "72")
			.when()
				.get("/elements/perimeter/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrj9wpcg1ir6_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and length:( .. 100)")
				.queryParam("time", "2008-12-16")
				.queryParam("bpolys", "8.704561,49.403252,8.725934,49.422,8.711,49.425,8.723,49.43229,8.704561,49.403252|8.704561,49.403252,8.738,49.41136,8.723,49.429,8.7045,49.4106,8.704561,49.403252")
				.queryParam("timeout", "76")
			.when()
				.post("/elements/perimeter/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to1uc5b94qjq_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.68289,49.401,8.719,49.395|8.68557,49.419,8.7380,49.382|8.68908,49.416,8.737,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2013-10-26")
				.queryParam("timeout", "94")
			.when()
				.get("/elements/perimeter/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4vncpxf4ktf_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "csv")
				.queryParam("bpolys", "Ifl:8.704561,49.403252,8.7127,49.401,8.706392,49.4026,8.73467,49.438,8.704561,49.403252|i:8.704561,49.403252,8.70222,49.43013,8.70443,49.402,8.74746,49.416,8.704561,49.403252|b:8.704561,49.403252,8.74977,49.421034,8.70995,49.43990,8.704,49.433,8.704561,49.403252")
				.queryParam("timeout", "63")
			.when()
				.post("/elements/perimeter/groupBy/boundary/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1h7rhilku9c_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.748603,49.41964,8.731,49.42598,8.701,49.404,8.704561,49.403252|8.704561,49.403252,8.7366,49.417,8.7043,49.403,8.7093,49.4112,8.704561,49.403252")
				.queryParam("timeout", "59")
				.queryParam("groupByKeys", "maxspeed,network,smoothness")
			.when()
				.get("/elements/perimeter/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbg0pmnlq6uu_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and length:( .. 100)")
				.queryParam("time", "2018-01-28")
				.queryParam("groupByKeys", "addr:country,lit")
				.queryParam("bcircles", "8.743571,49.430,3|8.71664,49.434,6|8.726,49.422013,1|8.7050,49.41506,9225008069")
			.when()
				.post("/elements/perimeter/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbfzgt1x4h2b_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "Hyx:8.742,49.4297,7")
			.when()
				.get("/elements/perimeter/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skxu4ti6y3w5_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,pedestrian,track")
				.queryParam("bboxes", "xALJ:8.682,49.418248,8.746,49.3869|WlJ:8.654,49.4275,8.741511,49.397|Ws:8.696,49.4005,8.742,49.3899")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-03-08")
			.when()
				.post("/elements/perimeter/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h84uekin0w8j_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and not id:(1 .. 9999)")
				.queryParam("time", "2009-02-21")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "nFCcd:8.719,49.4224,56")
			.when()
				.get("/elements/perimeter/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us3ik8m3c9k4_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and geometry:polygon")
				.queryParam("format", "json")
				.queryParam("bcircles", "Qd:8.7197,49.43469,8|j:8.708648,49.410,86|Bng:8.737029,49.4084,6|ky:8.738,49.41452,770898518668")
			.when()
				.post("/elements/perimeter/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s164cfhpq7ua_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or type:node")
				.queryParam("bboxes", "8.676,49.400,8.748,49.381|8.663,49.4134,8.7395,49.3932")
				.queryParam("types2", "way,")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
			.when()
				.get("/elements/perimeter/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jylmu9crn48h_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,other")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("filter2", "source:maxspeed!=* or not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "j:8.704561,49.403252,8.721,49.42988,8.709,49.4307,8.72765,49.40688,8.704561,49.403252|kPM:8.704561,49.403252,8.735,49.431,8.7466,49.406,8.729,49.432,8.704561,49.403252|Bz:8.704561,49.403252,8.7105,49.43269,8.73841,49.4067,8.7029,49.4385,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "53")
				.queryParam("values2", "traffic_signals")
			.when()
				.post("/elements/perimeter/ratio");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg2u3sxtir8_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "y:8.677445,49.429,8.729,49.386")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "lit!=* and not length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
			.when()
				.get("/elements/perimeter/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvgwdr9gzrdw_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or not geometry:line and length:( .. 100)")
				.queryParam("types2", "polygon,other")
				.queryParam("time", "2016-09-20")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "WY:8.704,49.406,2")
			.when()
				.post("/elements/perimeter/ratio/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7rcjwmrllk2_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "iNUKc:8.704561,49.403252,8.739631,49.439,8.704,49.4194,8.73218,49.423,8.704561,49.403252")
				.queryParam("timeout", "33")
			.when()
				.get("/users/count");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy4y8taevewp_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.7110,49.414897,1|8.70254,49.437,77|8.736,49.43428,7|8.720,49.42843,2")
			.when()
				.post("/users/count");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k25lma7egl6g_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "O:8.704561,49.403252,8.742,49.4257,8.7140,49.437613,8.721,49.4202,8.704561,49.403252")
			.when()
				.get("/users/count/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4p375l1z6lx_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.745,49.40886,3|8.739,49.410,2|8.709,49.406558,402|8.719,49.4095,6751804620")
			.when()
				.post("/users/count/density");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf46ug0yajw5_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-10-31")
				.queryParam("bpolys", "v:8.704561,49.403252,8.7161,49.4214,8.708,49.424,8.704566,49.4041,8.704561,49.403252")
				.queryParam("timeout", "69")
			.when()
				.get("/users/count/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7zn3li5hizn_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city=* and type:relation and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2017-12-08")
				.queryParam("bcircles", "e:8.7020,49.431005,2|GQAJ:8.717,49.402,34|BS:8.74691,49.4047,7")
			.when()
				.post("/users/count/density/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxqkacornl13_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "M:8.655,49.400774,8.751,49.3912|J:8.671734,49.403,8.736,49.397|RYR:8.675,49.417,8.719668,49.395|P:8.67550,49.427682,8.7156,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-11-22")
			.when()
				.get("/users/count/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8dfmci6c6cx_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link")
				.queryParam("bboxes", "8.66738,49.410,8.751,49.3842|8.658,49.406,8.745,49.385|8.679,49.418401,8.741,49.386|8.656,49.402,8.722881,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-01-21")
			.when()
				.post("/users/count/density/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4mu4onjqq1v_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.709,49.411,981|8.74226,49.420,2389507382|8.7188,49.405,809423663")
			.when()
				.get("/users/count/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4vnnzzeikvn_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ke\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70355,49.401466],[8.714,49.4337],[8.704025,49.42922],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.43341],[8.740,49.4146],[8.716,49.43481],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BGe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.41309],[8.706,49.401],[8.704600,49.421],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "91")
			.when()
				.post("/users/count/density/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhvntepixc8h_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* and type:node and length:( .. 100)")
				.queryParam("bboxes", "s:8.663,49.40747,8.744,49.386")
				.queryParam("format", "csv")
				.queryParam("time", "2015-11-30")
			.when()
				.get("/users/count/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhtw7dfdi1bk_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"IhVhb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.417842],[8.728186,49.42663],[8.70615,49.41821],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "40")
			.when()
				.post("/users/count/groupBy/boundary");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrotxao9bnfo_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "yQF:8.704561,49.403252,8.74609,49.411,8.705,49.4044,8.704954,49.412554,8.704561,49.403252|L:8.704561,49.403252,8.713486,49.434,8.74871,49.401,8.720,49.4039,8.704561,49.403252|mV:8.704561,49.403252,8.734,49.425,8.72634,49.409,8.702,49.41086,8.704561,49.403252")
				.queryParam("timeout", "87")
				.queryParam("groupByKeys", "source:maxspeed,addr:postcode,turn")
			.when()
				.get("/users/count/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibh3zi8m8yep_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.661,49.4293,8.70910,49.381")
				.queryParam("format", "json")
				.queryParam("time", "2010-09-29")
				.queryParam("timeout", "59")
				.queryParam("groupByKeys", "type,lanes:backward")
			.when()
				.post("/users/count/groupBy/key");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jidarw4y0yn9_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,synagogue")
				.queryParam("bboxes", "VG:8.695,49.4033,8.74969,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-10-11")
			.when()
				.get("/users/count/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy7rigood84k_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "SjdNH:8.704561,49.403252,8.709,49.434,8.704,49.4263,8.704562,49.400183,8.704561,49.403252")
				.queryParam("timeout", "61")
			.when()
				.post("/users/count/groupBy/tag");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1huzylnr0359g_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "f:8.746,49.41001,7|N:8.701,49.426929,2|tK:8.71113,49.408,96")
			.when()
				.get("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7j6288jmn94_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-09-20")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "OW:8.7179,49.426,6|ne:8.711,49.427,6")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}
