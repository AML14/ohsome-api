import org.evomaster.client.java.controller.SutHandler;
import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RESTest_1_per_op {

	private static final SutHandler controller = new org.heigit.ohsome.ohsomeapi.EMDriver();
	private static String baseUrlOfSut;

	@BeforeClass
	public static void initClass() {
		controller.setupForGeneratedTest();
		baseUrlOfSut = controller.startSut();
		assertNotNull(baseUrlOfSut);
		RestAssured.baseURI = "http://localhost:8080/";
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

	@Test
	public void test_s4p2smoizbcn_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "relation")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("bpolys", "wFZC:8.704561,49.403252,8.748,49.42584,8.7047,49.4204,8.716,49.40325,8.704561,49.403252|HZJKI:8.704561,49.403252,8.7496,49.410,8.746,49.43366,8.739,49.400,8.704561,49.403252")
			.when()
				.get("/elements/area");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdqibaupdwmb_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.70241,49.423812,678|8.738,49.423,31|8.744,49.430,2|8.705,49.4100,266")
			.when()
				.post("/elements/area");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy1m7mq6kkth_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=*")
				.queryParam("time", "2014-02-03")
				.queryParam("bpolys", "8.704561,49.403252,8.705,49.437415,8.718,49.431,8.731,49.435,8.704561,49.403252|8.704561,49.403252,8.745,49.412,8.701559,49.4312,8.73866,49.40699,8.704561,49.403252|8.704561,49.403252,8.71510,49.4357,8.706,49.401,8.70456,49.411,8.704561,49.403252")
			.when()
				.get("/elements/area/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb3iotacgbw0_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"izZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.40159],[8.70395,49.434],[8.73214,49.435],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7335,49.431],[8.746,49.4290],[8.70444,49.4141],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "49")
			.when()
				.post("/elements/area/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7o7op768yls_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.685,49.429,8.720,49.397|8.673,49.4183,8.73629,49.385|8.65152,49.405804,8.7222,49.38232")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("timeout", "36")
			.when()
				.get("/elements/area/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdtajuhcy5v7_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-12-03")
				.queryParam("bpolys", "8.704561,49.403252,8.7350,49.4113,8.704,49.411,8.7495,49.416669,8.704561,49.403252|8.704561,49.403252,8.720,49.425,8.702,49.43261,8.741,49.418,8.704561,49.403252")
			.when()
				.post("/elements/area/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iycps89i9b1v_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "f:8.73290,49.434,4")
			.when()
				.get("/elements/area/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jensdx4uydrm_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-01-23")
				.queryParam("bpolys", "cFe:8.704561,49.403252,8.708,49.418,8.7425,49.424682,8.704,49.403153,8.704561,49.403252|iN:8.704561,49.403252,8.716,49.403,8.741,49.427,8.743607,49.420,8.704561,49.403252|Jr:8.704561,49.403252,8.70359,49.435,8.7469,49.414,8.70488,49.422,8.704561,49.403252")
			.when()
				.post("/elements/area/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyfhhhd0ho4h_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2007-12-31")
				.queryParam("bpolys", "DNA:8.704561,49.403252,8.710,49.4010,8.737,49.43465,8.719,49.423,8.704561,49.403252|sZzG:8.704561,49.403252,8.706,49.4164,8.705,49.409,8.705,49.40713,8.704561,49.403252")
				.queryParam("timeout", "31")
			.when()
				.get("/elements/area/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1cvyi1wp1ko_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,roof")
				.queryParam("filter", "natural=wood or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-12-16")
				.queryParam("bcircles", "8.738,49.4052,9")
			.when()
				.post("/elements/area/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbt02rywifjm_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and type:node and length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "zOt:8.704561,49.403252,8.722,49.437,8.7151,49.4368,8.74621,49.400,8.704561,49.403252|Ed:8.704561,49.403252,8.719,49.4068,8.713,49.429,8.74790,49.4126,8.704561,49.403252")
				.queryParam("timeout", "62")
			.when()
				.get("/elements/area/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4vpmbga4vvq_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.655,49.4288,8.747,49.38219")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-02-07")
			.when()
				.post("/elements/area/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl9fv3coarms_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.430],[8.7485,49.4042],[8.731,49.426],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"N\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7498,49.4122],[8.7401,49.4147],[8.7047,49.400],[8.704561,49.403252]]]}}]}")
			.when()
				.get("/elements/area/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0uijdf3boz6_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "WB:8.737,49.400,9")
			.when()
				.post("/elements/area/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyiuziya0m5x_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-10-21")
				.queryParam("bcircles", "T:8.738688,49.412,2|Xm:8.7180,49.427,2|X:8.720,49.414,5|XpBdd:8.718551,49.402,693560199")
			.when()
				.get("/elements/area/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb3i815aqgkh_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,give_way")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "nk:8.721070,49.428,7|AJ:8.70608,49.405,92")
			.when()
				.post("/elements/area/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubuoky6nf59e_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country!=* and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "68")
				.queryParam("groupByKeys", "addr:country,source:maxspeed")
				.queryParam("bcircles", "YdE:8.71170,49.411291,6")
			.when()
				.get("/elements/area/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hruum9kp52k3_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "65")
				.queryParam("groupByKeys", "tracktype")
				.queryParam("bcircles", "8.7176,49.406,3")
			.when()
				.post("/elements/area/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toloqhyq243b_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,path")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-12-23")
				.queryParam("bcircles", "R:8.7440,49.41032,8")
			.when()
				.get("/elements/area/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1lnbpwccegg_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,primary_link")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("time", "2012-06-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"IT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.408],[8.739,49.41665],[8.7474,49.438],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "100")
			.when()
				.post("/elements/area/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4tf298z7145_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.416],[8.7044,49.436],[8.721,49.4394],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"XKyg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71104,49.4395],[8.7018,49.428684],[8.702,49.4168],[8.704561,49.403252]]]}}]}")
			.when()
				.get("/elements/area/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7ru30ac4wmo_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "sae:8.704,49.415,1|KdyKJ:8.72773,49.439607,64")
			.when()
				.post("/elements/area/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k22so4rfh5iq_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iP:8.665,49.424,8.7015,49.384|odTOM:8.67127,49.416,8.7350,49.3839")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("format", "json")
				.queryParam("filter2", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("timeout", "45")
			.when()
				.get("/elements/area/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toig4tc4tr36_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface!=* or geometry:line")
				.queryParam("bboxes", "8.684,49.424,8.73350,49.380|8.6637,49.401,8.73581,49.38086|8.655,49.418,8.70753,49.380|8.672,49.401217,8.756,49.382313")
				.queryParam("format", "geojson")
				.queryParam("filter2", "bicycle!=* and geometry:point")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary")
			.when()
				.post("/elements/area/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1je9v8mmhtjjk_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "relation")
				.queryParam("filter2", "maxspeed=* and type:way")
				.queryParam("time", "2016-11-10")
				.queryParam("bpolys", "XaFqF:8.704561,49.403252,8.732,49.41525,8.731814,49.4099,8.70389,49.4150,8.704561,49.403252|b:8.704561,49.403252,8.718,49.432,8.70370,49.408241,8.726,49.40421,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "77")
				.queryParam("values2", "speed_camera")
			.when()
				.get("/elements/area/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t86vxboxmp2a_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("filter2", "destination=* and length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.720954,49.4182,8.700584,49.405,8.743164,49.41856,8.704561,49.403252|8.704561,49.403252,8.747,49.4294,8.7315,49.429,8.741,49.4219,8.704561,49.403252|8.704561,49.403252,8.7307,49.406,8.748,49.413,8.742,49.4285,8.704561,49.403252")
			.when()
				.post("/elements/area/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tocvt5bxfi28_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-05-24")
				.queryParam("bcircles", "8.7205,49.402,62|8.718,49.4160,4")
			.when()
				.get("/elements/count");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4ccd4gw8v8y_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-07-02")
				.queryParam("bcircles", "8.7411,49.427,3|8.722,49.419,21|8.7076,49.4050,8|8.705,49.418,3")
			.when()
				.post("/elements/count");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u82wv7irzuch_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* and not geometry:line")
				.queryParam("bboxes", "8.696,49.422,8.700,49.393")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-10-05")
			.when()
				.get("/elements/count/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib37h4g3xdnl_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "SPt:8.671,49.419,8.715,49.383|gYy:8.671,49.403,8.711,49.381|Pj:8.686,49.4110,8.745,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-04-08")
			.when()
				.post("/elements/count/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl0401ysi5wm_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "W:8.65352,49.4210,8.756,49.394|IYsf:8.673,49.40040,8.710,49.394|NDG:8.689,49.4212,8.7307,49.3912")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
			.when()
				.get("/elements/count/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7o515sno8dh_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "U:8.691,49.425,8.732221,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
			.when()
				.post("/elements/count/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iynavo65gtpd_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-07-03")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "8.71700,49.4308,2|8.714,49.405840,7")
			.when()
				.get("/elements/count/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iun6lvj283lh_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,ship,demolished")
				.queryParam("bboxes", "qQ:8.665,49.428,8.7220,49.385")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-12-03")
			.when()
				.post("/elements/count/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4w6rw4ji6hw_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,track")
				.queryParam("filter", "lit=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.7295,49.425,59")
			.when()
				.get("/elements/count/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urupdx7oy62h_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-05-11")
				.queryParam("bcircles", "8.7287,49.4177,511146523|8.735735,49.4010,9")
			.when()
				.post("/elements/count/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuvzh0gng21t_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and not type:node and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-16")
				.queryParam("bcircles", "8.716,49.424,5")
			.when()
				.get("/elements/count/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5y3cdwo84w_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:line or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "wU:8.72695,49.401,9")
			.when()
				.post("/elements/count/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4f2yuzaa99f_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and geometry:line")
				.queryParam("bboxes", "8.6661,49.409,8.702522,49.3987|8.6922,49.4297,8.745,49.380")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
			.when()
				.get("/elements/count/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0xs5z6zdxrk_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-02-26")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "C:8.7458,49.4061,95|m:8.7031,49.4218,7|yGw:8.7208,49.413867,2")
			.when()
				.post("/elements/count/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jekynjy4e9f6_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "chapel,ship,station")
				.queryParam("bboxes", "t:8.6808,49.4148,8.735,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
			.when()
				.get("/elements/count/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts1wljlsgfvo_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.704,49.4246,8.706,49.400,8.70853,49.414,8.704561,49.403252|8.704561,49.403252,8.72565,49.434,8.7289,49.438,8.71336,49.4145,8.704561,49.403252|8.704561,49.403252,8.7426,49.4106,8.7042,49.438,8.704,49.4351,8.704561,49.403252")
				.queryParam("timeout", "51")
			.when()
				.post("/elements/count/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jifk5z0gov1u_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or not type:relation or length:( .. 100)")
				.queryParam("bboxes", "D:8.67699,49.4006,8.714,49.395")
				.queryParam("time", "2008-06-06")
				.queryParam("groupByKeys", "maxspeed,building")
			.when()
				.get("/elements/count/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to7bjsay8bhx_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"klWEK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.40444],[8.7341,49.426],[8.7019,49.41989],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"CV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.4263],[8.7070,49.424],[8.71570,49.4305],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "addr:country,landuse,surface")
			.when()
				.post("/elements/count/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji9zfwizqt68_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "public")
				.queryParam("bboxes", "j:8.672,49.403,8.736,49.397|R:8.652587,49.419761,8.7176,49.3926|J:8.692034,49.4046,8.71955,49.391|dJ:8.65206,49.417615,8.709,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("time", "2017-04-12")
				.queryParam("timeout", "28")
			.when()
				.get("/elements/count/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skxvmlf61fec_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform,demolished,residential")
				.queryParam("filter", "barrier=* and length:( .. 100)")
				.queryParam("bboxes", "vQF:8.655,49.4275,8.728,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-05-30")
			.when()
				.post("/elements/count/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4se23kzyofk_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or not type:node or not area:(1.0 .. 1E6)")
				.queryParam("time", "2011-05-21")
				.queryParam("bpolys", "8.704561,49.403252,8.71475,49.439,8.730918,49.430,8.709566,49.406,8.704561,49.403252|8.704561,49.403252,8.74665,49.4273,8.713,49.4368,8.745,49.4012,8.704561,49.403252|8.704561,49.403252,8.73788,49.436,8.739,49.43827,8.74104,49.4247,8.704561,49.403252")
			.when()
				.get("/elements/count/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyitwe6fs57p_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2009-10-14")
				.queryParam("bpolys", "cj:8.704561,49.403252,8.7424,49.434277,8.741,49.407490,8.705061,49.4065,8.704561,49.403252")
			.when()
				.post("/elements/count/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl2uagg9gu2a_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "line,polygon,")
				.queryParam("format", "json")
				.queryParam("filter2", "highway!=* and type:way or id:(1 .. 9999)")
				.queryParam("bpolys", "Pxk:8.704561,49.403252,8.739,49.412,8.74281,49.420,8.743,49.401,8.704561,49.403252|No:8.704561,49.403252,8.7071,49.4370,8.739,49.43189,8.7004,49.4125,8.704561,49.403252|lkcx:8.704561,49.403252,8.745,49.420500,8.700,49.414137,8.7472,49.424,8.704561,49.403252")
			.when()
				.get("/elements/count/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tog6crb4nubd_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("values", "secondary")
				.queryParam("filter2", "source:maxspeed=* and geometry:line or not length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.412,8.704,49.403,8.738,49.434,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "89")
			.when()
				.post("/elements/count/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh5i43walem0_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "T:8.673,49.410214,8.719815,49.392|ROZ:8.65122,49.40049,8.752,49.394")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "stop")
				.queryParam("filter2", "oneway=*")
				.queryParam("time", "2011-05-17")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "86")
			.when()
				.get("/elements/count/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qec6l69ylxlx_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.6822,49.4124,8.703,49.396")
				.queryParam("types2", "way,relation")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-11-01")
				.queryParam("timeout", "80")
			.when()
				.post("/elements/count/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyhqk7rqv1v5_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or type:node")
				.queryParam("bboxes", "AYkKt:8.666698,49.41469,8.7323,49.390|H:8.6884,49.421,8.735,49.390")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-10-30")
			.when()
				.get("/elements/length");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h85as1ct1pwm_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("bpolys", "t:8.704561,49.403252,8.743,49.418,8.7063,49.422,8.727,49.409,8.704561,49.403252")
				.queryParam("timeout", "71")
			.when()
				.post("/elements/length");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sok6l328n4tv_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "V:8.70319,49.416763,21105996463")
			.when()
				.get("/elements/length/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy27kdpcuxr8_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.424,8.734613,49.429,8.720,49.407,8.704561,49.403252")
			.when()
				.post("/elements/length/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibhliwg19ug4_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.660,49.4006,8.714,49.398|8.663,49.427764,8.7052,49.386|8.6672,49.41576,8.759,49.392")
				.queryParam("format", "json")
			.when()
				.get("/elements/length/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k200fxb9rx9w_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "vXLLR:8.72182,49.407,5|hi:8.7384,49.4030,48|fqB:8.731,49.4230,379|X:8.70791,49.4223,6")
			.when()
				.post("/elements/length/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrbg74f57x2r_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,garage")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "hGULh:8.703,49.4346,7|Yl:8.710403,49.4299,5|y:8.7086,49.416,9|S:8.719,49.417054,4")
			.when()
				.get("/elements/length/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sopq7dugznfo_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary,hut")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-08-26")
				.queryParam("bpolys", "q:8.704561,49.403252,8.700587,49.422,8.702,49.417,8.7216,49.417,8.704561,49.403252|lN:8.704561,49.403252,8.726,49.4243,8.7465,49.40504,8.7453,49.40630,8.704561,49.403252|V:8.704561,49.403252,8.7343,49.400,8.704,49.4115,8.70892,49.418,8.704561,49.403252")
				.queryParam("timeout", "90")
			.when()
				.post("/elements/length/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdybbg7psfvo_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,residential,turning_circle")
				.queryParam("filter", "oneway!=* and length:( .. 100)")
				.queryParam("bboxes", "8.652,49.416,8.711,49.397|8.6656,49.418,8.755,49.391|8.682844,49.429,8.7162,49.398|8.662,49.426,8.7088,49.39052")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-02-18")
				.queryParam("timeout", "48")
			.when()
				.get("/elements/length/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8f78vkfuxbl_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=*")
				.queryParam("bboxes", "RUlq:8.689,49.406,8.739003,49.386|RhK:8.655,49.407532,8.7590,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
			.when()
				.post("/elements/length/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1020844cd9v_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("time", "2013-11-20")
				.queryParam("bpolys", "SwiBz:8.704561,49.403252,8.748,49.4230,8.7369,49.437,8.7047,49.416179,8.704561,49.403252|wifgK:8.704561,49.403252,8.739,49.4261,8.7429,49.430938,8.703681,49.416,8.704561,49.403252")
			.when()
				.get("/elements/length/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl7xsbx55y02_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "S:8.650007,49.417,8.7080,49.381")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "53")
			.when()
				.post("/elements/length/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh893p7yz67l_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-04-02")
				.queryParam("bcircles", "K:8.744,49.404,6")
			.when()
				.get("/elements/length/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7whugvbtena_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "APE:8.704561,49.403252,8.744675,49.404,8.724,49.4226,8.734,49.415,8.704561,49.403252|Zy:8.704561,49.403252,8.742,49.430,8.70425,49.406,8.70311,49.400,8.704561,49.403252")
				.queryParam("timeout", "68")
			.when()
				.post("/elements/length/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toddq2kvo8qh_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2017-12-16")
				.queryParam("bcircles", "UO:8.7325,49.428,2|rKpem:8.709,49.43537,7|dHGF:8.729,49.4245,11")
			.when()
				.get("/elements/length/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to7cn8xfkg8o_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-12-26")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.404425,8.71500,49.437,8.7042,49.404,8.704561,49.403252")
				.queryParam("timeout", "77")
			.when()
				.post("/elements/length/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k229kwbi5naw_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-09-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.41163],[8.704510,49.427],[8.741,49.41668],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"YZo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738200,49.401210],[8.721,49.4180],[8.711097,49.426],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "smoothness,addr:postcode,turn:lanes")
			.when()
				.get("/elements/length/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8cd4yomyxbq_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and type:node")
				.queryParam("time", "2010-07-18")
				.queryParam("bpolys", "8.704561,49.403252,8.715,49.427,8.704,49.421,8.7359,49.404342,8.704561,49.403252|8.704561,49.403252,8.71469,49.4287,8.703,49.412,8.7273,49.405,8.704561,49.403252|8.704561,49.403252,8.7082,49.431063,8.7044,49.40704,8.7370,49.4235,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:country,destination,turn")
			.when()
				.post("/elements/length/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t845e7ul2m2a_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point")
				.queryParam("filter", "destination!=* or not type:node or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-10-15")
				.queryParam("bcircles", "8.716011,49.42870,86979371317")
			.when()
				.get("/elements/length/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyi8hh7d8rp4_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "8.728668,49.42156,9")
			.when()
				.post("/elements/length/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jefhio066h4m_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.414,8.732,49.4345,8.724,49.422,8.704561,49.403252|8.704561,49.403252,8.7129,49.405272,8.730,49.4282,8.712,49.429,8.704561,49.403252|8.704561,49.403252,8.743466,49.425,8.701,49.432,8.704,49.409,8.704561,49.403252")
			.when()
				.get("/elements/length/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbj96hc1pzjs_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or not id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "8.723,49.40349,2|8.715,49.416,6")
			.when()
				.post("/elements/length/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8dj7iqxfm0h_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "KSofN:8.6880,49.419,8.701,49.394|IyJ:8.6504,49.428,8.7035,49.394")
				.queryParam("types2", "polygon,")
				.queryParam("time", "2018-03-25")
				.queryParam("timeout", "47")
			.when()
				.get("/elements/length/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7zo9bc1l99z_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.674,49.425797,8.758,49.387")
				.queryParam("types2", "line,polygon,")
				.queryParam("format", "json")
				.queryParam("filter2", "maxspeed=* or not geometry:point and id:(1 .. 9999)")
				.queryParam("time", "2015-10-25")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "53")
			.when()
				.post("/elements/length/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl558bwgo2ls_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or not type:way or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "b:8.6619,49.42862,8.722,49.382002|qJWBD:8.686,49.4105,8.703,49.385|B:8.674,49.420,8.723293,49.385")
				.queryParam("types2", "line,other")
				.queryParam("format", "geojson")
			.when()
				.get("/elements/length/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tnz2vmbuy7a9_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and not geometry:polygon and not length:( .. 100)")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "oneway!=* or not area:(1.0 .. 1E6)")
				.queryParam("time", "2014-11-18")
				.queryParam("bpolys", "iHjkf:8.704561,49.403252,8.714,49.402,8.749018,49.413,8.717,49.4203,8.704561,49.403252")
				.queryParam("timeout", "57")
			.when()
				.post("/elements/length/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1h66xanb68z_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "G:8.68904,49.4200,8.7132,49.380|Q:8.6819,49.429114,8.726071,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-07-23")
				.queryParam("timeout", "59")
			.when()
				.get("/elements/perimeter");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_somwha6qfvxi_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-08-26")
				.queryParam("bpolys", "aee:8.704561,49.403252,8.700,49.4111,8.70430,49.412,8.710,49.4282,8.704561,49.403252|fTO:8.704561,49.403252,8.749,49.4089,8.7049,49.410,8.7272,49.404,8.704561,49.403252")
			.when()
				.post("/elements/perimeter");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeyv2xj0q7hi_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway or id:(1 .. 9999)")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "zQKu:8.740,49.403,4")
			.when()
				.get("/elements/perimeter/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrorihowcu2b_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("bpolys", "dxb:8.704561,49.403252,8.7485,49.431,8.7023,49.4395,8.7280,49.42736,8.704561,49.403252")
				.queryParam("timeout", "77")
			.when()
				.post("/elements/perimeter/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hb7q69c6tb1y_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.699,49.405,8.739,49.399|8.66921,49.4220,8.733065,49.3816")
				.queryParam("format", "geojson")
				.queryParam("timeout", "68")
			.when()
				.get("/elements/perimeter/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8dhktwt2be9_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-01-30")
				.queryParam("bcircles", "Q:8.703,49.411,1|b:8.705,49.419,28")
			.when()
				.post("/elements/perimeter/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u87yhnrxj61u_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,station,track")
				.queryParam("filter", "natural=wood and geometry:point or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"oH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747305,49.408],[8.700,49.402],[8.70500,49.432],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tisIw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73565,49.4207],[8.70909,49.413],[8.72289,49.4383],[8.704561,49.403252]]]}}]}")
			.when()
				.get("/elements/perimeter/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to1uc5d8omec_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,unclassified")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("time", "2016-05-10")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "E:8.747205,49.41476,2|h:8.728,49.412,3")
			.when()
				.post("/elements/perimeter/density/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_somyfnz6l2d3_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "IKceP:8.733089,49.4044,2|AdU:8.7406,49.418,5")
			.when()
				.get("/elements/perimeter/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbk77slp3tbp_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-06-08")
				.queryParam("bpolys", "8.704561,49.403252,8.7488,49.4116,8.731,49.412,8.716,49.439,8.704561,49.403252")
				.queryParam("timeout", "91")
			.when()
				.post("/elements/perimeter/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxnrcbw5s605_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-03-30")
				.queryParam("bcircles", "e:8.7066,49.40026,3|cetX:8.744,49.43087,6")
			.when()
				.get("/elements/perimeter/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbdr9axfnigh_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6790,49.42654,8.754,49.385")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
			.when()
				.post("/elements/perimeter/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy4h3psp5yld_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "geojson")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "B:8.74598,49.43392,1|M:8.700,49.413,3")
			.when()
				.get("/elements/perimeter/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jetbzvosstv4_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-10-30")
				.queryParam("bcircles", "T:8.725421,49.436,67")
			.when()
				.post("/elements/perimeter/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8fogv165oa9_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,steps,residential")
				.queryParam("bboxes", "8.669,49.407,8.7262,49.3804")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-06-19")
			.when()
				.get("/elements/perimeter/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeffhxd5yaev_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage,university")
				.queryParam("filter", "tracktype!=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.7024,49.425,8.734,49.4128,8.715092,49.4205,8.704561,49.403252")
			.when()
				.post("/elements/perimeter/groupBy/boundary/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf3owvg5yxbl_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "J:8.6884,49.427,8.748304,49.381|W:8.650624,49.426,8.7413,49.3927")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-07-08")
				.queryParam("groupByKeys", "addr:city")
			.when()
				.get("/elements/perimeter/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ure2qkbfp8oo_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("timeout", "98")
				.queryParam("groupByKeys", "bicycle,maxspeed")
				.queryParam("bcircles", "8.717,49.4130,3")
			.when()
				.post("/elements/perimeter/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rkxbg3x8wd46_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* and not length:( .. 100)")
				.queryParam("bboxes", "8.670,49.427,8.7488,49.386|8.699,49.4043,8.732,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-11-26")
				.queryParam("timeout", "37")
			.when()
				.get("/elements/perimeter/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hr8oqj2mpv7c_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage,pedestrian")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-05-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bUpqi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71053,49.432613],[8.723157,49.413],[8.703875,49.406762],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"CNkUC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7381,49.414583],[8.701,49.438],[8.711,49.436],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704375,49.403638],[8.70457,49.43468],[8.70495,49.417],[8.704561,49.403252]]]}}]}")
			.when()
				.post("/elements/perimeter/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl2ducwo7inn_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("time", "2016-01-02")
				.queryParam("bpolys", "8.704561,49.403252,8.704,49.412,8.739,49.4230,8.707,49.4164,8.704561,49.403252|8.704561,49.403252,8.74100,49.437480,8.7464,49.40977,8.7464,49.410,8.704561,49.403252|8.704561,49.403252,8.726,49.419,8.743,49.426,8.734317,49.426,8.704561,49.403252")
				.queryParam("timeout", "38")
			.when()
				.get("/elements/perimeter/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jig2h3bv1yyd_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.663,49.413,8.718,49.393")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
			.when()
				.post("/elements/perimeter/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iut85oudedlv_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("filter2", "building=* and type:relation")
				.queryParam("time", "2008-04-16")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.749,49.4302,6|8.743,49.409,1|8.728,49.426,6937610392|8.738,49.416,56")
			.when()
				.get("/elements/perimeter/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxywb5spahpy_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hDqY:8.68439,49.416,8.712010,49.389493")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
			.when()
				.post("/elements/perimeter/ratio");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7gerc3f64ir_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.693358,49.403090,8.750,49.395363")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "62")
				.queryParam("values2", "unclassified")
			.when()
				.get("/elements/perimeter/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sohvn1pg4x9d_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "46")
				.queryParam("values2", "residential")
				.queryParam("bcircles", "K:8.7227,49.43334,93")
			.when()
				.post("/elements/perimeter/ratio/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7wujjv9dxsx_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "GJ:8.7236,49.4307,4|Ow:8.714,49.41607,50")
			.when()
				.get("/users/count");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbazh9ke2ick_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and geometry:polygon and length:( .. 100)")
				.queryParam("time", "//P1Y4D")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "DU:8.7477,49.406507,2|QZZ:8.713,49.433,5|DZtEr:8.726,49.418,55")
			.when()
				.post("/users/count");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7wuxapl61iw_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("bcircles", "tjtnU:8.7069,49.425,28")
			.when()
				.get("/users/count/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1fmmnfxtmih_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.744,49.4349,7")
			.when()
				.post("/users/count/density");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubgbe4zssy0g_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "sYUh:8.704561,49.403252,8.730,49.4269,8.7334,49.43417,8.7045,49.424065,8.704561,49.403252|P:8.704561,49.403252,8.7338,49.432,8.704,49.4143,8.746,49.423913,8.704561,49.403252|jlH:8.704561,49.403252,8.73481,49.4282,8.704,49.412,8.704561,49.434749,8.704561,49.403252")
				.queryParam("timeout", "78")
			.when()
				.get("/users/count/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vb6ady1x21iu_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UsxMR:8.6996,49.42108,8.7236,49.386|Hz:8.68666,49.420,8.70181,49.391|Xc:8.6866,49.42509,8.7277,49.397|fq:8.697755,49.401,8.738,49.39262")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P6M25D")
				.queryParam("timeout", "64")
			.when()
				.post("/users/count/density/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbbvhuix2jhy_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,church,hospital")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y2M5D")
				.queryParam("bcircles", "daVZ:8.715256,49.410,4|OUzYX:8.709,49.402,2|m:8.732020,49.401,70|g:8.7302,49.413,1580058951")
			.when()
				.get("/users/count/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyodg66sj1vd_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2M17D")
				.queryParam("bpolys", "FNV:8.704561,49.403252,8.7164,49.436,8.710,49.4217,8.729,49.419,8.704561,49.403252|Clo:8.704561,49.403252,8.707,49.422,8.74109,49.4392,8.7335,49.42294,8.704561,49.403252|q:8.704561,49.403252,8.726,49.413125,8.709,49.423,8.703,49.418,8.704561,49.403252")
			.when()
				.post("/users/count/density/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1dcbj4niv6t_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("bcircles", "OH:8.740,49.4137,90|R:8.716,49.431,8|qC:8.728,49.433,26")
			.when()
				.get("/users/count/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jxzwxqos3bjs_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or not type:node or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y2M3D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"CI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74450,49.403],[8.701,49.429],[8.701,49.432],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "81")
			.when()
				.post("/users/count/density/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ien7fjqkz6eo_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("bpolys", "ibDLR:8.704561,49.403252,8.702,49.422,8.7233,49.4396,8.7340,49.434,8.704561,49.403252")
				.queryParam("timeout", "91")
			.when()
				.get("/users/count/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1huzxfeudpt0w_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P18D")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "A:8.74094,49.4294,8|JBc:8.709695,49.404,7")
			.when()
				.post("/users/count/groupBy/boundary");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us08gwoi9e1u_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "hPfPi:8.704561,49.403252,8.706,49.418,8.708,49.4182,8.701,49.4036,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:postcode,network")
			.when()
				.get("/users/count/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhajbxbdir8k_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "y:8.6920,49.4204,8.715682,49.3990|s:8.6786,49.4077,8.7004,49.3916|u:8.650,49.424818,8.72764,49.3972|B:8.657,49.4069,8.736,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P3M4D")
				.queryParam("timeout", "49")
				.queryParam("groupByKeys", "oneway,lanes,destination")
			.when()
				.post("/users/count/groupBy/key");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdvkpppa36ew_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,track")
				.queryParam("bboxes", "8.697,49.429,8.741,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P5M7D")
				.queryParam("timeout", "97")
			.when()
				.get("/users/count/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf0xgbpv7asi_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,construction")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7282,49.426],[8.745,49.433],[8.72908,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"K\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.401],[8.726,49.4223],[8.708,49.4314],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"pz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.422],[8.711,49.402710],[8.707650,49.424],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "100")
			.when()
				.post("/users/count/groupBy/tag");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7o64wa46a1v_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "ZboO:8.650,49.41762,8.71568,49.381|wMX:8.6657,49.408,8.702,49.3949")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y2M2D")
			.when()
				.get("/users/count/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxg0zx5xd9h5_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bcircles", "o:8.737,49.41341,387")
			.when()
				.post("/users/count/groupBy/type");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}
