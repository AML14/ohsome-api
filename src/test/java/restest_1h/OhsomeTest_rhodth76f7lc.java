package restest_1h;

import org.evomaster.client.java.controller.SutHandler;
import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OhsomeTest_rhodth76f7lc {


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


	@Test
	public void test_urpmiy3mumus_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "w:8.6992,49.419,8.7211,49.3920")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-12-26")
				.queryParam("bpolys", "8.704561,49.403252,8.7248,49.426,8.731316,49.4397,8.706,49.430457,8.704561,49.403252|8.704561,49.403252,8.713871,49.414,8.717,49.4114,8.714,49.430,8.704561,49.403252")
				.queryParam("bcircles", "fxYtM:8.7369,49.425,15|c:8.747233,49.434,3|zX:8.726819,49.418,12|m:8.7206,49.412,6")
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
	public void test_us07ds9ragkj_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "QAd:8.67553,49.424,8.719,49.388|ESD:8.686555,49.4074,8.70197,49.385")
				.queryParam("format", "json")
				.queryParam("timeout", "54")
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
	public void test_1jew460vd1751_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "JLnB:8.69646,49.4295,8.707,49.383")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "78")
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
	public void test_1ji798iz7buwi_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "node,")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Wpr:8.704561,49.403252,8.716,49.405008,8.7455,49.4139,8.74928,49.40921,8.704561,49.403252")
				.queryParam("timeout", "35")
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
	public void test_rhgkw0uviz3q_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "cdAJ:8.704561,49.403252,8.722,49.407,8.70230,49.439,8.707,49.43307,8.704561,49.403252|wkgDK:8.704561,49.403252,8.736,49.4014,8.701,49.403,8.7058,49.422,8.704561,49.403252|IGtCT:8.704561,49.403252,8.710,49.4284,8.70146,49.4314,8.7418,49.401,8.704561,49.403252")
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
	public void test_urk4jgsu554p_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iUJCj:8.6617,49.4177,8.752,49.381|jF:8.659,49.424,8.739,49.389|Kk:8.672,49.42930,8.712,49.3810|UPtIS:8.695489,49.421,8.730,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-01-14")
				.queryParam("bcircles", "8.736,49.4260,9")
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
	public void test_1k252g948miph_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "waHzE:8.675,49.421,8.733,49.3812|ir:8.6546,49.400,8.737725,49.388")
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
	public void test_1k22bgbjef2ap_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-07-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741176,49.437],[8.714,49.425],[8.731076,49.4305],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "88")
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
	public void test_1iuy9pesh3ghc_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2010-08-11")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "HCHFl:8.7366,49.4249,2")
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
	public void test_skk0torriiqq_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6822,49.4005,8.751717,49.39260|8.659,49.422,8.732168,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
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
	public void test_1iuke1zg9xr94_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6651,49.400,8.745,49.381")
				.queryParam("values", "living_street")
				.queryParam("time", "2016-07-02")
				.queryParam("timeout", "75")
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
	public void test_r1cvmrvsdelw_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "p:8.69722,49.42871,8.710,49.391")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_sone0m40y2ib_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and id:(1 .. 9999)")
				.queryParam("time", "2016-04-06")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "nVa:8.702,49.4291,2|fHpZk:8.712,49.404,8|V:8.735,49.404,3|XhLH:8.7243,49.414,1")
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
	public void test_to536hqpoi0g_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "D:8.683914,49.407,8.711298,49.389|yjGe:8.68631,49.414,8.7274,49.387|V:8.687,49.428,8.731,49.388|nMR:8.6634,49.427618,8.735,49.386")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-01-04")
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
	public void test_vf0waccp0rqe_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-05-05")
				.queryParam("bcircles", "y:8.735,49.432,63")
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
	public void test_qdqhxj7srn05_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and geometry:line and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-02-04")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "i:8.7438,49.427,400|w:8.703,49.4349,9")
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
	public void test_urrv79liiomq_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and type:way or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "wj:8.655,49.409,8.75834,49.398")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
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
	public void test_1k1rpi6p7qtyo_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6562,49.414769,8.7449,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "no")
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
	public void test_qxyxy376v9es_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "p:8.704561,49.403252,8.739,49.429,8.704,49.411,8.7052,49.417,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_1iusq5iv81bn4_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "B:8.743,49.4271,819|fAvAr:8.719,49.41119,2|Z:8.7336,49.42909,70")
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
	public void test_r1a3sp4i831e_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-12-29")
				.queryParam("timeout", "42")
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
	public void test_1hraxf2iv397m_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "dZ:8.704561,49.403252,8.71780,49.437970,8.745030,49.404,8.70456,49.4285,8.704561,49.403252")
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
	public void test_urpo5pa5m8mo_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "OnSjr:8.726,49.416,9")
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
	public void test_1hv392pa0hw81_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* and type:relation and length:( .. 100)")
				.queryParam("bboxes", "VT:8.65771,49.414,8.756,49.395|f:8.693,49.40011,8.737,49.391")
				.queryParam("format", "json")
				.queryParam("time", "2010-07-02")
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
	public void test_rhak4bd5o6yg_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-12-23")
				.queryParam("bpolys", "ZPJ:8.704561,49.403252,8.72923,49.422316,8.7044,49.4195,8.7323,49.416,8.704561,49.403252|XSI:8.704561,49.403252,8.73780,49.4049,8.7388,49.4072,8.70476,49.439,8.704561,49.403252|ePD:8.704561,49.403252,8.739,49.404,8.70436,49.408,8.7098,49.409,8.704561,49.403252")
				.queryParam("timeout", "47")
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
	public void test_1jifilwxhqvs4_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* and length:( .. 100)")
				.queryParam("bboxes", "8.673981,49.414,8.727,49.3882|8.678,49.409,8.706,49.3972|8.663,49.4019,8.712,49.394")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YEUC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.418012],[8.7480,49.41960],[8.716,49.4266],[8.704561,49.403252]]]}}]}")
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
	public void test_rl2bl0uivi9l_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-12-08")
				.queryParam("bcircles", "gN:8.7035,49.438,7")
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
	public void test_1hruanzy8vjg7_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "TP:8.704561,49.403252,8.739,49.408,8.7211,49.409,8.74281,49.429,8.704561,49.403252|Q:8.704561,49.403252,8.71533,49.420,8.702,49.407928,8.7148,49.4042,8.704561,49.403252")
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
	public void test_1jylk1f8y0zef_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-09-10")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "8.710,49.403333,9")
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
	public void test_1hrorihc6h3cj_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-12-27")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "H:8.71384,49.417,4")
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
	public void test_tol92st2l8is_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("time", "2008-07-08")
				.queryParam("bpolys", "Jw:8.704561,49.403252,8.723854,49.430,8.70364,49.430,8.704,49.402,8.704561,49.403252|H:8.704561,49.403252,8.729,49.412,8.703837,49.4335,8.700593,49.4172,8.704561,49.403252|uGE:8.704561,49.403252,8.748,49.419445,8.726,49.436,8.708,49.43904,8.704561,49.403252")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "AbtT:8.7322,49.401,64")
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
	public void test_s505z08zu7n8_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "c:8.6541,49.4269,8.732,49.38913")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2012-08-12")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.7331,49.401,45")
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
	public void test_r1ie0mge13qo_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.745,49.400593,9|8.736,49.4066,9")
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
	public void test_rhr78a4bpovq_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-11-09")
				.queryParam("bpolys", "ARG:8.704561,49.403252,8.707,49.422,8.7252,49.423,8.744,49.421,8.704561,49.403252")
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
	public void test_qe6mn1da5bad_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_signals,cycleway,primary")
				.queryParam("bboxes", "LOa:8.661,49.4086,8.712,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "no")
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
	public void test_1iyns14juufl0_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,university,house")
				.queryParam("bboxes", "8.689,49.4193,8.70333,49.393|8.69599,49.427,8.7528,49.3854")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("bcircles", "Ge:8.74654,49.41107,19")
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
	public void test_t4qo08p8t0dy_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=*")
				.queryParam("groupByValues", "platform,crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-01-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.43407],[8.732298,49.415],[8.70438,49.434516],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "C:8.714,49.427,9")
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
	public void test_tol5yni8hues_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,unclassified")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-11-13")
				.queryParam("bpolys", "J:8.704561,49.403252,8.722,49.4284,8.70451,49.401,8.700,49.420,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_1jettuqceeur7_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.698,49.427,8.729352,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-04-09")
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
	public void test_qe10r6z65ph4_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725570,49.4179],[8.709,49.42046],[8.72842,49.4282],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"onOYK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.43831],[8.73267,49.430396],[8.7067,49.4315],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "69")
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
	public void test_qhqlhoi2vtbs_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,station")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "primary_link")
				.queryParam("time", "2008-11-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"eXnRO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.4254],[8.701,49.431506],[8.7294,49.4283],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.434573],[8.70440,49.435595],[8.700,49.4086],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "90")
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
	public void test_1hv618ptjqvjq_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,yes,cycleway")
				.queryParam("bboxes", "a:8.683,49.406,8.7446,49.385")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.716,49.416,8.720008,49.4245,8.72324,49.412,8.704561,49.403252|8.704561,49.403252,8.702,49.411,8.7043,49.438,8.709,49.4128,8.704561,49.403252")
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
	public void test_rhllc9uiiogx_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "8.732830,49.43667,857|8.723,49.408,5")
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
	public void test_t49h3092rkh2_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6994,49.4108,8.700,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
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
	public void test_1ibkc4innqj51_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.676564,49.400,8.735,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_1jer2h33yoj8l_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.403,8.755,49.381|8.676,49.4188,8.719074,49.384|8.6885,49.42372,8.746,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("timeout", "83")
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
	public void test_1iavf976ebb5f_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=*")
				.queryParam("groupByValues", "give_way,pedestrian,demolished")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "yes")
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
	public void test_rl8exsakikhk_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2018-03-06")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "abN:8.722,49.400,7|M:8.7164,49.4376,4")
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
	public void test_tru55gmm4i0p_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-02-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"b\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.418],[8.708,49.40296],[8.7042,49.433],[8.704561,49.403252]]]}}]}")
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
	public void test_vbce7h9x88de_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qmnFo:8.681,49.418,8.7443,49.38836")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
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
	public void test_qdw1jjrlkrhs_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* or geometry:point")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "2014-04-24")
				.queryParam("bpolys", "aoi:8.704561,49.403252,8.709,49.42807,8.723,49.419,8.704488,49.418,8.704561,49.403252|nI:8.704561,49.403252,8.718,49.416,8.7017,49.413,8.709,49.4141,8.704561,49.403252|Qo:8.704561,49.403252,8.7007,49.404,8.723,49.408,8.70487,49.43214,8.704561,49.403252")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "GTwdO:8.703,49.4121,90|L:8.742,49.4039,41|t:8.7288,49.406,3109351002|ZW:8.7392,49.410,41602226476")
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
	public void test_qhw4l66rqlba_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bcircles", "Lbv:8.745,49.417,8")
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
	public void test_ts2eww42u0xd_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* or geometry:point")
				.queryParam("bboxes", "TNhRY:8.654738,49.4073,8.733896,49.399|zf:8.6839,49.4107,8.7319,49.39891")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "66")
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
	public void test_1jezbud64vodv_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-07-12")
				.queryParam("bpolys", "8.704561,49.403252,8.7442,49.4150,8.7464,49.411,8.704145,49.425,8.704561,49.403252")
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
	public void test_s101mj73whmg_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "SjP:8.676,49.420,8.705,49.390|cP:8.6947,49.415,8.7157,49.384")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-01-02")
				.queryParam("timeout", "92")
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
	public void test_1hrdqd9vd0i1w_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* and geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "IwA:8.660,49.4278,8.7492,49.382")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "54")
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
	public void test_rl2vdx1oqwdi_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=*")
				.queryParam("bboxes", "oEXBa:8.672,49.416,8.733,49.392")
				.queryParam("format", "geojson")
				.queryParam("timeout", "65")
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
	public void test_s4mtcmrdejc3_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-09-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"P\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.424410],[8.724,49.435],[8.7269,49.403],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "93")
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
	public void test_1hv8ap7i5ib00_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and geometry:point and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-03-02")
				.queryParam("bpolys", "8.704561,49.403252,8.74508,49.4069,8.704127,49.4145,8.701486,49.432,8.704561,49.403252|8.704561,49.403252,8.743,49.409,8.702,49.423,8.70457,49.402,8.704561,49.403252|8.704561,49.403252,8.711627,49.42728,8.703,49.435,8.7045,49.400,8.704561,49.403252")
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
	public void test_somv8udfnioy_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and geometry:polygon or id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.714,49.401,4")
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
	public void test_rhg4fte1y0q8_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and type:node and not id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-12-06")
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
	public void test_to7dtcm9agxk_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.710,49.406,33|8.7166,49.43441,9|8.700660,49.429,9")
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
	public void test_ubmdbrjgal9v_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* or type:relation")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.718291,49.430,8.7186,49.402,8.7062,49.415,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_vb944dm093du_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.682,49.409,8.751,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("timeout", "79")
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
	public void test_1ib6hkg0pc605_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "FE:8.69703,49.421087,8.71099,49.383|dYMk:8.684,49.4053,8.714,49.383|G:8.6638,49.4121,8.7111,49.3966|r:8.695,49.4204,8.759,49.3909")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-04-17")
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
	public void test_rhdac2qpt2cz_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.682604,49.414,8.718,49.394")
				.queryParam("values", "stop")
				.queryParam("time", "2016-10-05")
				.queryParam("bpolys", "FZ:8.704561,49.403252,8.72884,49.437318,8.73962,49.4127,8.74995,49.4288,8.704561,49.403252|Z:8.704561,49.403252,8.716108,49.410,8.7342,49.400711,8.7485,49.4001,8.704561,49.403252")
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
	public void test_1hrs1ltmiyree_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Fp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.408],[8.701,49.42454],[8.708769,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "52")
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
	public void test_vbhwywtz1js3_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2013-05-21")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "8.748,49.400,8|8.74539,49.40666,415")
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
	public void test_s1b4py5qk1gk_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2009-07-28")
				.queryParam("bcircles", "8.735,49.407,2")
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
	public void test_skjzkqs91ni0_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-10-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"J\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.401186],[8.7075,49.4118],[8.70567,49.416],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "24")
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
	public void test_rhm57migj7ef_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.4089,8.739,49.387|8.677,49.42153,8.7280,49.39062|8.662,49.405962,8.7215,49.3986|8.678,49.404,8.746,49.392532")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "fnj:8.704561,49.403252,8.714,49.421,8.7057,49.424,8.70253,49.4191,8.704561,49.403252")
				.queryParam("timeout", "98")
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
	public void test_s4xfd7q32rsm_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"pO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.4067],[8.7476,49.420],[8.732,49.4293],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"xCY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.716,49.439],[8.729,49.4177],[8.739566,49.428],[8.704561,49.403252]]]}}]}")
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
	public void test_1ibh3wtk3jhv8_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory,chapel,tertiary")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "gS:8.73165,49.418925,6")
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
	public void test_trtnofl6bali_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "TKry:8.650,49.408,8.729080,49.382|qu:8.6550,49.408,8.759,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-09-19")
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
	public void test_us2yp5v8p6pi_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("bcircles", "8.70299,49.4367,45")
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
	public void test_1jefyzopq6fqw_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,synagogue,secondary")
				.queryParam("bboxes", "8.679,49.429,8.715,49.384|8.677,49.400,8.716880,49.3918")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2013-06-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ZDg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.431],[8.7316,49.428],[8.701,49.42961],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"nL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.4375],[8.706,49.414],[8.72552,49.42157],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "99")
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
	public void test_qxzf3hkr3ne9_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "civic,construction,church")
				.queryParam("bboxes", "tlf:8.670,49.403092,8.733,49.3947")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "33")
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
	public void test_t4cavoc4125u_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,unclassified")
				.queryParam("bboxes", "8.6524,49.4037,8.750,49.383|8.696,49.407,8.7463,49.381|8.652460,49.422,8.731,49.3941")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-06-24")
				.queryParam("timeout", "58")
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
	public void test_u8b870x62fs6_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship,school,hotel")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-11-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.433880],[8.7187,49.416],[8.7045,49.4292],[8.704561,49.403252]]]}}]}")
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
	public void test_1ib60tg5udvmq_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-11-10")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "8.710191,49.4279,7|8.7322,49.428,2")
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
	public void test_us30n1jfcbw9_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=*")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2015-03-14")
				.queryParam("groupByKeys", "surface,turn,tracktype")
				.queryParam("bcircles", "sk:8.726,49.439471,8|npi:8.73900,49.414576,7|NP:8.7448,49.416,4|L:8.724,49.439,68")
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
	public void test_rh4z2wggn144_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and id:(1 .. 9999)")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-03-30")
				.queryParam("bcircles", "BDKR:8.7254,49.421726,8")
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
	public void test_qdyc3tycpz5k_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-03-19")
				.queryParam("bpolys", "WH:8.704561,49.403252,8.70609,49.429,8.704904,49.434,8.749,49.4154,8.704561,49.403252")
				.queryParam("groupByKeys", "type,foot,destination")
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
	public void test_1hruaobsfifz6_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or type:way or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2018-03-09")
				.queryParam("groupByKeys", "ref,addr:country,oneway")
				.queryParam("bcircles", "8.703,49.4345,5")
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
	public void test_1h7whx1kcalo2_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ZLg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.433],[8.704369,49.4205],[8.705,49.423],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "29")
				.queryParam("groupByKeys", "tracktype,addr:country")
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
	public void test_1iv728tgae3as_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:polygon")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "62")
				.queryParam("groupByKeys", "addr:street,lit")
				.queryParam("bcircles", "d:8.706,49.4286,8|G:8.704108,49.40338,1")
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
	public void test_1iaxp6adhilo4_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "X:8.6987,49.401,8.708,49.388|OTdJ:8.65377,49.417,8.7312,49.395")
				.queryParam("format", "json")
				.queryParam("bpolys", "DLUbA:8.704561,49.403252,8.714,49.422,8.746,49.411,8.737,49.412,8.704561,49.403252|F:8.704561,49.403252,8.742,49.4339,8.704686,49.4104,8.7064,49.403,8.704561,49.403252|CUyP:8.704561,49.403252,8.71237,49.433,8.7045,49.417,8.7068,49.4376,8.704561,49.403252")
				.queryParam("bcircles", "S:8.72963,49.40725,13")
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
	public void test_1ies91kuqr5gk_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("groupByKeys", "destination,landuse,addr:street")
				.queryParam("bcircles", "b:8.704976,49.423,69")
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
	public void test_qxtdjw3mhtus_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "Jt:8.704561,49.403252,8.735,49.414,8.715,49.416,8.7325,49.43349,8.704561,49.403252")
				.queryParam("groupByKeys", "bicycle,addr:housenumber")
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
	public void test_u80510idra5z_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "name,bicycle")
				.queryParam("bcircles", "8.714885,49.400,8|8.702,49.401669,3")
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
	public void test_ubgtpl2i0b52_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,tower,stop")
				.queryParam("filter", "addr:postcode=* and geometry:polygon")
				.queryParam("bboxes", "j:8.680,49.408,8.7352,49.3911")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-07-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"hheDq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.43642],[8.739,49.419],[8.7207,49.4252],[8.704561,49.403252]]]}}]}")
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
	public void test_t4yimzbqpfty_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "give_way,station,ship")
				.queryParam("bboxes", "CE:8.688,49.418913,8.704,49.387|RI:8.675,49.429,8.718,49.398|nl:8.6741,49.4260,8.7514,49.3869")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "B:8.7397,49.4139,74|r:8.727978,49.408,8|CQbqD:8.726314,49.414,60|dT:8.74002,49.429670,2")
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
	public void test_rhr6tz43eijm_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,pedestrian,traffic_signals")
				.queryParam("bboxes", "vodKs:8.696,49.41860,8.7245,49.389|P:8.6556,49.415,8.7525,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "29")
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
	public void test_1ji1paedsfa78_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "public,bus_stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("time", "2013-07-06")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "y:8.746582,49.416,1")
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
	public void test_vf96fqhw70oh_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,elevator")
				.queryParam("filter", "maxspeed=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "qNop:8.672,49.42727,8.73203,49.3927")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "69")
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
	public void test_qxiro6gejm0i_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,demolished,ship")
				.queryParam("filter", "oneway=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "hsxd:8.6649,49.4207,8.718588,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("time", "2007-12-23")
				.queryParam("bcircles", "8.7321,49.433,9|8.74570,49.427,742")
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
	public void test_ureklqe0j12r_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform,residential,garage")
				.queryParam("bboxes", "aMBFi:8.665,49.424293,8.716,49.383|iMMz:8.6720,49.404,8.740,49.3949|a:8.653,49.41063,8.7368,49.3859|I:8.674,49.427,8.712,49.382")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.715278,49.437121,6")
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
	public void test_qhsw4ht0xdgh_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-12-04")
				.queryParam("bpolys", "MBq:8.704561,49.403252,8.746578,49.433,8.701911,49.41555,8.705,49.429,8.704561,49.403252|EY:8.704561,49.403252,8.7417,49.409196,8.708,49.4236,8.710,49.4195,8.704561,49.403252")
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
	public void test_ubgu60ynu5pi_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,stop_line,office")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "HRXqw:8.71546,49.4381,1|Vy:8.7457,49.423,5")
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
	public void test_r17t8kwijuck_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,living_street,school")
				.queryParam("filter", "oneway=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6614,49.423,8.757,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "45")
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
	public void test_uve5024g91yx_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69321,49.41037,8.7584,49.3839|8.695743,49.4218,8.7006,49.3981|8.679,49.41410,8.728,49.396")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.722766,49.4112,9")
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
	public void test_rl560o0057w1_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Cu:8.68605,49.42322,8.7513,49.393")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-07-22")
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
	public void test_1iyhq6524dq2h_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-09-06")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "8.73570,49.409,6|8.736,49.427,4")
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
	public void test_1hblimtgnh3dt_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "rAt:8.6791,49.4066,8.7340,49.398|JJn:8.67449,49.400199,8.751,49.3806|MA:8.668007,49.423622,8.7069,49.389|pn:8.676,49.428,8.758,49.3913")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "61")
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
	public void test_t4c9pkzvgkmc_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"oR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.412],[8.704995,49.402],[8.742,49.4249],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"pMipe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.4020],[8.7243,49.404],[8.731,49.409],[8.704561,49.403252]]]}}]}")
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
	public void test_vbelpru4x205_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-04-17")
				.queryParam("timeout", "64")
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
	public void test_s5072opdl2ld_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XF:8.680195,49.403,8.7222,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "76")
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
	public void test_qhl2c7uo0wva_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Om\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7031,49.4307],[8.722257,49.4250],[8.70195,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"a\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.421],[8.720,49.418],[8.7141,49.410],[8.704561,49.403252]]]}}]}")
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
	public void test_1hux77l46thyp_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and type:relation or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-01-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"C\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.404],[8.702,49.435],[8.74182,49.4045],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"cOvV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7015,49.40066],[8.721,49.408],[8.723,49.408],[8.704561,49.403252]]]}}]}")
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
	public void test_qxwmgmzaz9yw_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "8.721686,49.4278,1|8.717,49.4075,51")
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
	public void test_qhsts0veui42_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("values", "service")
				.queryParam("filter2", "oneway=* and not type:node and length:( .. 100)")
				.queryParam("time", "2010-09-15")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_mirror")
				.queryParam("bcircles", "8.724,49.4183,19|8.743100,49.425846,9")
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
	public void test_qxl307aiecs1_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "lit=* and not length:( .. 100)")
				.queryParam("time", "2009-10-28")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "71")
				.queryParam("values2", "footway")
				.queryParam("bcircles", "I:8.72975,49.4221,286|JJIPB:8.746532,49.438,3")
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
	public void test_urmbne1b1flg_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:point or id:(1 .. 9999)")
				.queryParam("types2", "node,way,")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "foot!=* and not geometry:line or length:( .. 100)")
				.queryParam("bpolys", "j:8.704561,49.403252,8.747,49.4270,8.700478,49.432,8.704,49.4133,8.704561,49.403252|L:8.704561,49.403252,8.7341,49.406,8.739,49.436,8.714,49.4201,8.704561,49.403252|bipp:8.704561,49.403252,8.7435,49.415,8.746,49.4395,8.714,49.4297,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_1jy27ykr5coqc_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* and not geometry:line and length:( .. 100)")
				.queryParam("bpolys", "X:8.704561,49.403252,8.736,49.4262,8.72419,49.41456,8.7288,49.425128,8.704561,49.403252")
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
	public void test_qxw63ipgpn3m_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* and geometry:line and id:(1 .. 9999)")
				.queryParam("types2", "node,relation")
				.queryParam("format", "csv")
				.queryParam("bpolys", "y:8.704561,49.403252,8.7153,49.436,8.704,49.43575,8.704580,49.411,8.704561,49.403252|qZWI:8.704561,49.403252,8.745,49.4030,8.704,49.407,8.709186,49.43877,8.704561,49.403252|q:8.704561,49.403252,8.742,49.4187,8.701,49.419,8.745,49.41539,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "60")
				.queryParam("values2", "traffic_signals")
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
	public void test_tolonyul5gs1_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or geometry:line and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("format", "json")
				.queryParam("filter2", "network=* or area:(1.0 .. 1E6)")
				.queryParam("timeout", "33")
				.queryParam("values2", "secondary_link")
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
	public void test_vbpp9qo1x10h_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,other")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("filter2", "maxspeed=* and geometry:polygon")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "22")
				.queryParam("values2", "crossing")
				.queryParam("bcircles", "zUk:8.7400,49.4026,3")
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
	public void test_1iuvgtugxmk4i_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-01-17")
				.queryParam("bcircles", "tZCyf:8.733,49.418,7")
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
	public void test_r17ss0zkekvk_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.683,49.4111,8.7492,49.3988")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-07-05")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "82")
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
	public void test_1hux8dqecm89x_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "unclassified")
				.queryParam("filter2", "lanes!=*")
				.queryParam("time", "2012-03-14")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "MQx:8.72062,49.407,2")
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
	public void test_1jeae9q49v29f_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "SsNnR:8.68675,49.4188,8.719,49.393|AZi:8.6701,49.422,8.7542,49.398")
				.queryParam("types2", "point,other")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-01-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gpJSx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.437],[8.707,49.418],[8.702331,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "81")
				.queryParam("values2", "service")
				.queryParam("bcircles", "fx:8.718748,49.4341,728|R:8.7415,49.437,24|NQSV:8.7463,49.4332,2")
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
	public void test_vb6unlpfgf38_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "name!=* and type:relation or length:( .. 100)")
				.queryParam("time", "2015-06-10")
				.queryParam("bpolys", "8.704561,49.403252,8.724,49.4249,8.702520,49.403,8.702,49.434,8.704561,49.403252|8.704561,49.403252,8.70682,49.425,8.704866,49.4088,8.704707,49.416,8.704561,49.403252|8.704561,49.403252,8.7359,49.403,8.738,49.435,8.74304,49.439,8.704561,49.403252")
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
	public void test_1ibbi0po98568_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.66449,49.419209,8.74653,49.3954|8.692,49.426,8.7545,49.381")
				.queryParam("types2", "node,relation")
				.queryParam("time", "2015-08-24")
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
	public void test_1jy262seg6xd2_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "node,way,relation")
				.queryParam("format", "csv")
				.queryParam("time", "2010-12-23")
				.queryParam("bpolys", "8.704561,49.403252,8.723031,49.432,8.728,49.432637,8.741,49.41704,8.704561,49.403252|8.704561,49.403252,8.7405,49.401,8.717,49.4024,8.743,49.4376,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_uve667st8t2o_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and geometry:line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-09-28")
				.queryParam("bpolys", "8.704561,49.403252,8.7415,49.41701,8.70735,49.419,8.700,49.41423,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_1jetu8t16xoag_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-06-02")
				.queryParam("values2", "crossing")
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
	public void test_1huzzua637s6b_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UE:8.686,49.416,8.735452,49.399|JCv:8.6967,49.428,8.751,49.3987|o:8.665,49.416,8.7461,49.393")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "maxspeed=*")
				.queryParam("time", "2009-06-12")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_mirror")
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
	public void test_urxy8ulh4hgl_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.653803,49.401,8.7048,49.399|8.6709,49.426,8.701,49.3919|8.6606,49.4130,8.7095,49.3854|8.6677,49.427,8.713,49.391480")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("filter2", "network!=* or type:way")
				.queryParam("time", "2013-06-18")
				.queryParam("timeout", "93")
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
	public void test_1jydsli9ynga9_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "K:8.7284,49.4288,1")
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
	public void test_1jydbg72xqc81_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.664306,49.4145,8.7548,49.39347")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-02-17")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "83")
				.queryParam("values2", "speed_camera")
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
	public void test_vbnftgvkq0qb_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
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
	public void test_qhqm9upcu92e_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.67513,49.403,8.743249,49.38023|8.6560,49.4265,8.758,49.3894|8.65696,49.4077,8.732962,49.3962")
				.queryParam("format", "csv")
				.queryParam("time", "2012-07-22")
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
	public void test_sl6pno4o4wo2_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or not geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-02-19")
				.queryParam("bpolys", "8.704561,49.403252,8.7076,49.40586,8.734,49.42222,8.734712,49.404,8.704561,49.403252|8.704561,49.403252,8.7167,49.4227,8.73725,49.404,8.729,49.418180,8.704561,49.403252|8.704561,49.403252,8.747903,49.4177,8.735,49.426,8.74048,49.414,8.704561,49.403252")
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
	public void test_1hr5ffnjmthly_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XQGqd:8.676,49.421704,8.744,49.384|nrTFU:8.650392,49.4012,8.7037,49.3897")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-08-24")
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
	public void test_vf9p7weovp6e_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("time", "2010-04-10")
				.queryParam("bpolys", "L:8.704561,49.403252,8.716,49.407,8.723,49.425,8.701,49.424,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_1hrorwkrk1rg1_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Xqu:8.677,49.427,8.7036,49.380")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"coMIr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7249,49.4029],[8.705,49.430],[8.728,49.433],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ls\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.427],[8.725,49.435],[8.71405,49.423885],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "25")
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
	public void test_rhiwm43u8851_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* and geometry:line and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-03-13")
				.queryParam("bcircles", "f:8.728,49.410,2|gk:8.742,49.415625,3|saleH:8.705,49.410,8")
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
	public void test_u8aob6ihxjcp_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6740,49.405,8.74603,49.392")
				.queryParam("format", "json")
				.queryParam("time", "2010-08-02")
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
	public void test_u7u387iec3tx_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bcircles", "X:8.723,49.4255,5|V:8.733,49.43463,704|Ki:8.7017,49.403,5")
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
	public void test_s4rwj1iv3l9d_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-08-01")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"rgQp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.429],[8.7003,49.421],[8.742,49.4288],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "60")
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
	public void test_to52vaurhrnd_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-01-25")
				.queryParam("bpolys", "8.704561,49.403252,8.707,49.409,8.73060,49.423,8.709,49.4123,8.704561,49.403252|8.704561,49.403252,8.740,49.429,8.7005,49.433,8.70489,49.4294,8.704561,49.403252")
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
	public void test_t4a0ywntyqn7_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-09-14")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "8.729,49.41738,6|8.704,49.405039,5|8.743704,49.4118,778")
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
	public void test_qhtdzdoio2sx_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2009-07-07")
				.queryParam("bcircles", "fOfN:8.710,49.4024,75|Aiydu:8.713,49.41026,382")
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
	public void test_urpmzlxt3vat_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or type:node or not length:( .. 100)")
				.queryParam("bcircles", "nS:8.742,49.4275,4")
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
	public void test_1hbaefv6p778k_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "sd:8.658072,49.428051,8.7433,49.391")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-03-16")
				.queryParam("timeout", "70")
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
	public void test_s1jxz4ybwzsj_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.664,49.4179,8.747,49.3917|8.67142,49.4060,8.717,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2007-12-27")
				.queryParam("timeout", "27")
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
	public void test_vbeo1o8wn19y_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("bpolys", "WSW:8.704561,49.403252,8.72317,49.40194,8.7097,49.4020,8.713682,49.4363,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_1h7ts33gs3n7d_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "8.7211,49.420,39|8.703,49.435,2|8.711,49.4263,4")
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
	public void test_1h7oofyi9jvp0_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "dO:8.699,49.4114,8.7596,49.390|t:8.69244,49.40999,8.724,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "29")
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
	public void test_s4xvqepp2wxd_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "VP:8.665,49.42763,8.72302,49.3979|F:8.673,49.404,8.748,49.391|NxKS:8.683,49.413,8.728,49.396|SjWZ:8.685,49.418,8.742,49.399")
				.queryParam("format", "geojson")
				.queryParam("timeout", "42")
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
	public void test_u7oiffzvf5f5_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-03-30")
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
	public void test_skpl5b396tyv_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LIlxb:8.683,49.4156,8.732,49.393|m:8.679,49.4035,8.718,49.381|o:8.695,49.4150,8.726,49.382")
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
	public void test_qxqluhhi9ahu_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "db:8.706,49.418,1|E:8.713,49.43466,15|budZF:8.73734,49.4345,40|X:8.700739,49.422,88")
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
	public void test_r1a30936s1np_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-11-25")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "cxtQG:8.70941,49.437,8")
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
	public void test_r1fnq4eo65h4_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* and type:way or id:(1 .. 9999)")
				.queryParam("time", "2016-10-16")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.727,49.433,3")
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
	public void test_qhhtqa28caxy_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "wMEEA:8.71428,49.403,98|ZHRYL:8.732,49.41072,722|YwH:8.738,49.4363,1")
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
	public void test_1jidbhlvrazc2_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "8.7146,49.417,303|8.702,49.4013,32|8.741,49.412,6|8.721,49.40134,625053506323")
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
	public void test_1hv88rdr49lx2_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.747,49.427,8.707,49.411,8.709,49.425,8.704561,49.403252|O:8.704561,49.403252,8.71232,49.4269,8.70471,49.425,8.712,49.4195,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_vbmx41lzm0xc_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "kYHQq:8.6558,49.409029,8.7407,49.399|kPNBh:8.659129,49.416,8.704200,49.396|s:8.6550,49.427,8.714,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "86")
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
	public void test_1jiajbkp5e3c1_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-09-28")
				.queryParam("bcircles", "mp:8.737,49.407,2|yrR:8.714,49.4106,8")
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
	public void test_vbemhxziprhe_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway")
				.queryParam("filter", "bicycle!=*")
				.queryParam("bboxes", "b:8.688,49.402765,8.7496,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-10-07")
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
	public void test_urhbl3u2fvw8_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing")
				.queryParam("bboxes", "O:8.67902,49.416,8.703,49.393594")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("timeout", "58")
				.queryParam("bcircles", "xkM:8.707,49.414,5|LHO:8.7379,49.431,9|GTHm:8.707740,49.41556,22|pn:8.738,49.421,980716802510")
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
	public void test_tocvvglng7qq_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2015-08-24")
				.queryParam("bcircles", "8.715793,49.4105,4")
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
	public void test_qdybe8hl2yib_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform,secondary,steps")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-01-22")
				.queryParam("bpolys", "pi:8.704561,49.403252,8.701,49.420364,8.748223,49.403,8.719150,49.43294,8.704561,49.403252|bDU:8.704561,49.403252,8.71470,49.412,8.7014,49.422,8.705,49.421,8.704561,49.403252|kK:8.704561,49.403252,8.7251,49.41848,8.7051,49.4241,8.70406,49.4310,8.704561,49.403252")
				.queryParam("timeout", "94")
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
	public void test_qe4d6rjbb49y_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church")
				.queryParam("filter", "maxspeed=* and length:( .. 100)")
				.queryParam("bboxes", "pD:8.6508,49.408680,8.701,49.380|bT:8.682,49.40656,8.7272,49.39772")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-05-07")
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
	public void test_to7dvtebqcds_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path")
				.queryParam("filter", "name=* or length:( .. 100)")
				.queryParam("bboxes", "DWwv:8.657707,49.410,8.7087,49.3959")
				.queryParam("groupByKey", "building")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-04-14")
				.queryParam("bcircles", "guu:8.7193,49.4081,995|E:8.7366,49.420,2|pb:8.702,49.43686,1")
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
	public void test_toa4t0a83jn9_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and geometry:polygon and id:(1 .. 9999)")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "Jo:8.72733,49.434,44|mnTgc:8.71894,49.438132,2")
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
	public void test_urv7mwiadw0z_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and not type:relation")
				.queryParam("bboxes", "aKMQa:8.689,49.401,8.74335,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
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
	public void test_1iynshwo2vdr8_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,hotel")
				.queryParam("bboxes", "d:8.672,49.401,8.732,49.391|gQvA:8.67706,49.4242,8.713,49.392|dy:8.68178,49.4230,8.751174,49.393247")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-02-27")
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
	public void test_uv6djpbsafky_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp")
				.queryParam("filter", "landuse!=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-06-04")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "fl:8.7252,49.4060,13")
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
	public void test_1iepy12o8906q_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "qati:8.704561,49.403252,8.73767,49.429,8.729544,49.42623,8.707,49.414633,8.704561,49.403252|PZ:8.704561,49.403252,8.743827,49.408,8.714,49.418898,8.7073,49.429,8.704561,49.403252|rdibo:8.704561,49.403252,8.7282,49.4239,8.73603,49.418,8.704809,49.419,8.704561,49.403252")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.749,49.42839,26")
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
	public void test_qhntq2ws7xpd_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=*")
				.queryParam("groupByValues", "hut,emergency_access_point")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.718,49.4383,8.700,49.412,8.704453,49.425856,8.704561,49.403252|8.704561,49.403252,8.749104,49.414,8.704,49.404,8.704560,49.42816,8.704561,49.403252|8.704561,49.403252,8.74982,49.40308,8.748,49.401,8.702,49.419,8.704561,49.403252")
				.queryParam("bcircles", "C:8.704638,49.417,8")
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
	public void test_1h7fv6w3qdi04_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,give_way")
				.queryParam("filter", "lanes=* and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "T:8.704561,49.403252,8.7283,49.438,8.732,49.429,8.703,49.4204,8.704561,49.403252|Ah:8.704561,49.403252,8.722,49.416,8.736,49.4228,8.708,49.426002,8.704561,49.403252|Yw:8.704561,49.403252,8.713,49.437,8.733,49.426,8.701,49.436,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_1iupz5jp9s86b_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XBTV:8.6722,49.401,8.7101,49.3945")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "99")
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
	public void test_sl3xvi4f7rky_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,stop_line,hospital")
				.queryParam("bboxes", "8.6824,49.406,8.739,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
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
	public void test_ubupcqwmzqd5_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,bus_stop")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719024,49.4067],[8.743,49.439],[8.702758,49.4319],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ek\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7303,49.41246],[8.705,49.4029],[8.709,49.406],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"DWCnF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7484,49.400302],[8.743,49.4268],[8.734,49.416249],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "QY:8.706,49.402,2")
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
	public void test_1iuyrpe6eafci_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and id:(1 .. 9999)")
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
	public void test_qe4c3eve9zdw_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,primary_link,path")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-09-28")
				.queryParam("timeout", "53")
				.queryParam("bcircles", "8.7330,49.4198,6|8.7333,49.417,18|8.716359,49.432146,60|8.702497,49.401,323183960")
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
	public void test_1jenrld4vie78_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,traffic_signals")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "QJX:8.739,49.4108,7|NWj:8.711,49.420,177|A:8.7055,49.433,273|M:8.745,49.404577,8")
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
	public void test_1jel0o8lx4x2b_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,house,stop")
				.queryParam("bboxes", "Ci:8.660,49.407103,8.732329,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-10-21")
				.queryParam("timeout", "47")
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
	public void test_skkj26opv8td_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=*")
				.queryParam("bboxes", "8.67301,49.421,8.713812,49.3961|8.66873,49.410,8.719,49.384|8.656,49.405,8.747,49.386")
				.queryParam("format", "csv")
				.queryParam("time", "2011-12-19")
				.queryParam("bpolys", "odbF:8.704561,49.403252,8.711,49.427,8.722,49.410,8.7485,49.438,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_uvbfyeg7sd45_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-08-24")
				.queryParam("bcircles", "8.718106,49.422,9")
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
	public void test_s18bs6xp076t_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "mjB:8.695,49.403,8.7150,49.38698")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-12-03")
				.queryParam("timeout", "32")
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
	public void test_1iv3tn9iq1fef_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and not geometry:line")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-08-08")
				.queryParam("bcircles", "zxN:8.735,49.413,1")
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
	public void test_u8aq9fmur0he_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2014-03-27")
				.queryParam("bpolys", "UMVwX:8.704561,49.403252,8.7322,49.4061,8.718,49.435,8.717,49.422,8.704561,49.403252|Y:8.704561,49.403252,8.729,49.4228,8.748,49.436140,8.70547,49.42868,8.704561,49.403252|BeIsX:8.704561,49.403252,8.701,49.437,8.70452,49.411,8.707,49.4138,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_qxisg8o8aiwg_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "Y:8.654,49.411,8.7040,49.399")
				.queryParam("time", "2012-04-30")
				.queryParam("bcircles", "8.704,49.412,6")
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
	public void test_vf6eo10fgh2c_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.7395,49.420,2")
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
	public void test_1jeiqr343hzza_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and not geometry:point and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "J:8.681,49.4185,8.7082,49.387|b:8.681,49.4271,8.733158,49.395")
				.queryParam("time", "2011-12-03")
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
	public void test_vbk6ttfh87qq_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "8.7429,49.405,6|8.709176,49.4008,63|8.701,49.400,5|8.7344,49.406549,958116474540")
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
	public void test_1jeqize551q3n_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface!=*")
				.queryParam("time", "2016-07-15")
				.queryParam("bcircles", "jEsRX:8.716,49.425,2|GVEam:8.707,49.436,84")
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
	public void test_skyeeh31ftps_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=*")
				.queryParam("bboxes", "tLqDh:8.697,49.424,8.755,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("timeout", "75")
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
	public void test_qy4edjnkvk9y_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687102,49.412,8.7559,49.3926|8.657,49.408,8.756,49.397|8.694,49.414231,8.749,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "79")
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
	public void test_vb3imgf8mk4i_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "EyRJi:8.683895,49.4295,8.71166,49.3898")
				.queryParam("time", "2016-08-04")
				.queryParam("timeout", "66")
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
	public void test_vbkotlnv66np_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.7007,49.415,8.7180,49.425,8.704,49.4139,8.704561,49.403252|8.704561,49.403252,8.7443,49.410,8.70885,49.422235,8.7086,49.402,8.704561,49.403252|8.704561,49.403252,8.7481,49.405,8.7009,49.4177,8.749,49.4271,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_rkzjcflnfyw2_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "K:8.704561,49.403252,8.747,49.412,8.7442,49.43740,8.700,49.4310,8.704561,49.403252|k:8.704561,49.403252,8.7376,49.408550,8.701,49.4005,8.70450,49.433,8.704561,49.403252|qouHP:8.704561,49.403252,8.70204,49.426,8.708336,49.408145,8.7329,49.439,8.704561,49.403252")
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
	public void test_qe9v6iopbwbl_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-10-10")
				.queryParam("bpolys", "N:8.704561,49.403252,8.735,49.4203,8.739974,49.419,8.70435,49.411,8.704561,49.403252")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "zn:8.718,49.4058,2")
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
	public void test_1iyc6lxnq2j3p_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.658,49.4199,8.7546,49.384|8.699,49.4230,8.726,49.382120|8.67039,49.42010,8.7066,49.393|8.663,49.421,8.744,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2008-08-21")
				.queryParam("timeout", "25")
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
	public void test_rl037vuabi9j_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("bpolys", "qG:8.704561,49.403252,8.724,49.4063,8.71718,49.43863,8.709,49.413,8.704561,49.403252|Gd:8.704561,49.403252,8.745,49.410911,8.741293,49.414,8.748,49.422,8.704561,49.403252|Uurh:8.704561,49.403252,8.749,49.423,8.70469,49.401,8.7481,49.4395,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_qxiqtjuk45rk_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-04-02")
				.queryParam("bcircles", "8.7115,49.417,4|8.748,49.418,7")
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
	public void test_rh896byw5r95_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-09-06")
				.queryParam("bpolys", "i:8.704561,49.403252,8.724309,49.42575,8.704686,49.431,8.707,49.422973,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_vbf574yrpvtw_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,track,roof")
				.queryParam("bboxes", "ozL:8.682,49.405,8.743,49.38211|v:8.695,49.422369,8.704,49.3917")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1hrmig90k03sn_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.68754,49.429,8.731772,49.395|8.697021,49.4186,8.747,49.39107|8.66242,49.4121,8.712678,49.380|8.651,49.4264,8.7519,49.385324")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7205,49.437],[8.742,49.405],[8.70456,49.4374],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "iPLrv:8.733,49.417308,2")
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
	public void test_ts4qrwxrpr21_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "university,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-08-08")
				.queryParam("bpolys", "8.704561,49.403252,8.7229,49.4149,8.73056,49.400,8.7048,49.43800,8.704561,49.403252|8.704561,49.403252,8.7203,49.437,8.703758,49.4220,8.705,49.41210,8.704561,49.403252|8.704561,49.403252,8.708,49.432934,8.74382,49.4237,8.7413,49.435,8.704561,49.403252")
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
	public void test_urxf7l622vs3_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "u:8.704561,49.403252,8.739,49.4283,8.738,49.4235,8.70655,49.422319,8.704561,49.403252|nzBna:8.704561,49.403252,8.7386,49.427,8.7088,49.434806,8.7256,49.4159,8.704561,49.403252")
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
	public void test_tonxqfqnj6ue_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-08-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.422],[8.734,49.426],[8.703,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UUwX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71138,49.414],[8.7368,49.42233],[8.706,49.402],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "77")
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
	public void test_qhnbptbhyb1e_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6959,49.42782,8.70826,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "bld:8.713,49.4035,789")
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
	public void test_1hbm1cab5oorq_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=*")
				.queryParam("groupByValues", "pedestrian")
				.queryParam("bboxes", "XFOAd:8.655,49.401,8.7208,49.38901")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "8.7165,49.40870,5|8.733314,49.41948,8|8.712,49.431,22|8.7183,49.408,34")
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
	public void test_1hrp9u5dk6b09_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "eHiA:8.718,49.4095,93|Qdy:8.73257,49.433560,18")
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
	public void test_vey4l36iq4ac_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* and geometry:line")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-09-04")
				.queryParam("bpolys", "SVD:8.704561,49.403252,8.71976,49.418555,8.7329,49.401628,8.71604,49.408,8.704561,49.403252|Gt:8.704561,49.403252,8.717934,49.422606,8.709,49.40384,8.7005,49.4110,8.704561,49.403252|L:8.704561,49.403252,8.745701,49.404051,8.738136,49.430,8.7046,49.435,8.704561,49.403252")
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
	public void test_qxr2zry2ky7l_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "q:8.721,49.424,5")
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
	public void test_1jy260dllggva_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=*")
				.queryParam("bboxes", "h:8.671,49.4243,8.7242,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("timeout", "83")
				.queryParam("groupByKeys", "surface,highway,addr:housenumber")
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
	public void test_s1649t62348o_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.664,49.421,8.757411,49.397|8.659,49.409,8.7278,49.3904|8.687,49.405,8.739,49.399")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-10-21")
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
	public void test_s18ujyzfosom_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2015-09-27")
				.queryParam("timeout", "32")
				.queryParam("groupByKeys", "lanes:forward,network")
				.queryParam("bcircles", "8.705,49.4057,198")
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
	public void test_t4ca11dk1d0z_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-02-03")
				.queryParam("bpolys", "xp:8.704561,49.403252,8.712,49.41487,8.7066,49.419,8.7480,49.4255,8.704561,49.403252|MDNon:8.704561,49.403252,8.713,49.42792,8.7492,49.414689,8.703,49.413,8.704561,49.403252|PhKil:8.704561,49.403252,8.7182,49.413,8.704545,49.4233,8.749476,49.432,8.704561,49.403252")
				.queryParam("timeout", "59")
				.queryParam("groupByKeys", "barrier,foot,sidewalk")
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
	public void test_1hbfxzl7yvjvn_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or geometry:line or not length:( .. 100)")
				.queryParam("time", "2016-07-28")
				.queryParam("bpolys", "E:8.704561,49.403252,8.724751,49.419,8.7381,49.421,8.747,49.4331,8.704561,49.403252|U:8.704561,49.403252,8.747008,49.410,8.713,49.415,8.704124,49.4180,8.704561,49.403252|JAZyQ:8.704561,49.403252,8.717,49.433,8.7428,49.429,8.70139,49.4190,8.704561,49.403252")
				.queryParam("groupByKeys", "bicycle,foot,tracktype")
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
	public void test_1iukewe524awm_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "zz:8.687,49.404,8.7077,49.385|TM:8.686,49.429,8.72025,49.384|bLnXl:8.6999,49.41827,8.70146,49.3951|gUAAg:8.6991,49.429,8.744259,49.395")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-06-01")
				.queryParam("groupByKeys", "surface,foot,highway")
				.queryParam("bcircles", "8.717,49.4345,9")
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
	public void test_t86v7w61e9tc_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("time", "2015-07-27")
				.queryParam("bcircles", "t:8.74408,49.404,357")
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
	public void test_1h7z8tynv84s1_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "H:8.704561,49.403252,8.716,49.400674,8.7044,49.4260,8.730,49.4117,8.704561,49.403252")
				.queryParam("timeout", "47")
				.queryParam("groupByKeys", "highway,tracktype")
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
	public void test_1iv129ie43jok_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "KDeEu:8.704561,49.403252,8.731,49.40525,8.7008,49.4120,8.743,49.4170,8.704561,49.403252")
				.queryParam("timeout", "51")
				.queryParam("groupByKeys", "addr:housenumber,surface,source:maxspeed")
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
	public void test_urguipm5mlic_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "bicycle,lanes:forward")
				.queryParam("bcircles", "tt:8.733,49.415,985")
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
	public void test_1jew4hgwa79rl_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "zxi:8.6601,49.412,8.724,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("bcircles", "RfNjU:8.7250,49.41246,7")
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
	public void test_urmdlzqfj86x_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street!=* or geometry:polygon and length:( .. 100)")
				.queryParam("groupByValues", "synagogue")
				.queryParam("bboxes", "8.67885,49.403,8.700,49.38438|8.689,49.404,8.726249,49.393")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "true")
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
	public void test_s1go9ib0z2p1_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,primary,give_way")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.733402,49.439,8.70477,49.423,8.7046,49.400,8.704561,49.403252|tRCPy:8.704561,49.403252,8.7303,49.40536,8.7498,49.4099,8.731,49.41211,8.704561,49.403252|d:8.704561,49.403252,8.744,49.433,8.7119,49.40403,8.7310,49.407,8.704561,49.403252")
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
	public void test_1jy7r6mijuyqr_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EtNgD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7227,49.413],[8.726,49.425],[8.739,49.402906],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "30")
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
	public void test_1jidae1bpxso1_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6583,49.419,8.759,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "true")
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
	public void test_1ies9fk0gihip_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or type:relation or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-06-27")
				.queryParam("bpolys", "8.704561,49.403252,8.732,49.411150,8.704,49.426,8.7415,49.435875,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_t4yhsiaic02u_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.749,49.413,3")
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
	public void test_1hvb2xt3slxrq_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship,apartments,turning_circle")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-11-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BAItN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718987,49.418],[8.70967,49.4022],[8.747,49.423],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BEM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7071,49.407],[8.7045,49.4162],[8.7063,49.42483],[8.704561,49.403252]]]}}]}")
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
	public void test_1jy7r43cp6g51_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:relation")
				.queryParam("bboxes", "QqrWH:8.667299,49.4009,8.744,49.397|Ig:8.6639,49.40561,8.7158,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-12-10")
				.queryParam("timeout", "37")
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
	public void test_rhakw3odrcc5_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "JrbNt:8.704561,49.403252,8.7431,49.40145,8.737,49.405,8.704539,49.417,8.704561,49.403252")
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
	public void test_1hbafxd92o110_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* or geometry:point or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-08-03")
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
	public void test_t8a5mglwfwbl_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2015-01-11")
				.queryParam("bcircles", "tSJnF:8.705,49.425897,5")
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
	public void test_t4fk6y2j4pbo_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and type:way")
				.queryParam("bboxes", "R:8.654,49.42707,8.759,49.391")
				.queryParam("showMetadata", "false")
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
	public void test_1jyg37xc5f320_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2007-11-09")
				.queryParam("bcircles", "sPHEb:8.738386,49.4243,98|KfR:8.7348,49.402,9")
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
	public void test_soppqo2vaeyf_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LC:8.691,49.4078,8.717201,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("timeout", "67")
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
	public void test_uve665f2q0yr_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:way or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.658,49.4117,8.722,49.386")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.706734,49.42440,6|8.724,49.416,339")
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
	public void test_1ib0h9eojkqbc_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "n:8.735,49.4130,8")
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
	public void test_ubgbs444icdu_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2013-12-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"g\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705926,49.431],[8.704,49.4243],[8.719,49.43290],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Iq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.413],[8.703,49.4324],[8.704,49.408509],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "77")
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
	public void test_qhiak63v1ysl_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or geometry:point and id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-01-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UKCzB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.435],[8.7047,49.418],[8.705,49.42919],[8.704561,49.403252]]]}}]}")
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
	public void test_r1a1gcivvi2a_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2015-05-11")
				.queryParam("bpolys", "SwQrh:8.704561,49.403252,8.718617,49.414,8.730,49.437,8.70440,49.4329,8.704561,49.403252|uerXO:8.704561,49.403252,8.738,49.4224,8.70447,49.419,8.722,49.415,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_u7ukrjh0wtb9_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or type:node or length:( .. 100)")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "oneway!=* and id:(1 .. 9999)")
				.queryParam("time", "2013-10-23")
				.queryParam("bpolys", "joce:8.704561,49.403252,8.739,49.412,8.723,49.405,8.7046,49.412,8.704561,49.403252|P:8.704561,49.403252,8.7354,49.4237,8.710,49.426,8.727,49.412,8.704561,49.403252|O:8.704561,49.403252,8.749057,49.40162,8.70130,49.420,8.7049,49.402,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "footway")
				.queryParam("bcircles", "Q:8.725,49.43063,4|f:8.730,49.435,567|ba:8.709,49.408,1|xSjib:8.746,49.416,4")
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
	public void test_1h7zb6dj44r3k_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "BIrzR:8.69732,49.428,8.723,49.383")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,other")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
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
	public void test_urjmajgwh168_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "crossing")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "g:8.703,49.412,51")
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
	public void test_uvbg0qw47srq_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("values", "footway")
				.queryParam("bpolys", "gRfzi:8.704561,49.403252,8.74110,49.400,8.7048,49.436,8.7264,49.41077,8.704561,49.403252|Av:8.704561,49.403252,8.7445,49.402281,8.703917,49.4188,8.720970,49.431,8.704561,49.403252|rT:8.704561,49.403252,8.7417,49.428,8.723,49.412,8.7007,49.428611,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_skk0r20nw3zp_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter2", "bicycle!=* and geometry:line")
				.queryParam("bpolys", "uE:8.704561,49.403252,8.746,49.413435,8.704244,49.416,8.732,49.428,8.704561,49.403252|n:8.704561,49.403252,8.713,49.428,8.736,49.437,8.747,49.426,8.704561,49.403252")
				.queryParam("timeout", "99")
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
	public void test_1je9yczg4ohut_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-05-02")
				.queryParam("keys2", "highway")
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
	public void test_u7oitndn2fcp_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-11-16")
				.queryParam("bpolys", "LDX:8.704561,49.403252,8.7214,49.431,8.7195,49.409,8.703567,49.43366,8.704561,49.403252|BB:8.704561,49.403252,8.707508,49.4383,8.70986,49.433,8.724,49.4362,8.704561,49.403252|WuiHO:8.704561,49.403252,8.727,49.4194,8.702,49.420,8.703,49.417904,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary_link")
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
	public void test_1hv0gx1vihvlj_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* and type:node")
				.queryParam("types2", "point,")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "lanes:backward!=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "n:8.704561,49.403252,8.716020,49.439,8.70456,49.427151,8.71562,49.425,8.704561,49.403252|Kh:8.704561,49.403252,8.741,49.420,8.738,49.431,8.72478,49.42887,8.704561,49.403252|ry:8.704561,49.403252,8.72296,49.416,8.7089,49.40616,8.70445,49.42489,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "91")
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
	public void test_qdqiryb3wuux_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "lanes:forward!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2011-06-06")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "U:8.740,49.4197,8|s:8.729,49.424956,9|XwGGC:8.721,49.421,8")
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
	public void test_vf97omgzlvlh_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.653,49.404,8.718,49.386")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "living_street")
				.queryParam("time", "2013-04-27")
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
	public void test_vbng4ndttsft_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "maxspeed=* and geometry:point and not area:(1.0 .. 1E6)")
				.queryParam("timeout", "89")
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
	public void test_s4plks7i0xte_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-03-19")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
				.queryParam("bcircles", "UNtzN:8.70826,49.425,8")
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
	public void test_1iynt79w0it6d_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-05-01")
				.queryParam("bpolys", "QIwX:8.704561,49.403252,8.7231,49.4070,8.724,49.410,8.73338,49.4360,8.704561,49.403252|PiMGS:8.704561,49.403252,8.714,49.416,8.743,49.439285,8.719,49.420,8.704561,49.403252|trg:8.704561,49.403252,8.725,49.409,8.7047,49.422,8.715,49.430,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_1ib0yetryk7s1_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("filter2", "destination=* or not area:(1.0 .. 1E6)")
				.queryParam("time", "2018-03-02")
				.queryParam("bpolys", "qTMXo:8.704561,49.403252,8.7041,49.4037,8.735,49.402,8.721,49.409,8.704561,49.403252|Z:8.704561,49.403252,8.7298,49.422,8.70459,49.4238,8.7100,49.4306,8.704561,49.403252|m:8.704561,49.403252,8.745,49.427727,8.7044,49.409,8.7041,49.424,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_1iesqnl3k6rmq_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("filter2", "addr:street=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2017-12-22")
				.queryParam("bpolys", "8.704561,49.403252,8.73849,49.42702,8.71200,49.416,8.735,49.400886,8.704561,49.403252|8.704561,49.403252,8.727,49.436,8.701,49.4076,8.747,49.404,8.704561,49.403252|8.704561,49.403252,8.737,49.408,8.704629,49.43384,8.742825,49.4214,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_vbmxvyalkxus_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or length:( .. 100)")
				.queryParam("bboxes", "8.676,49.407,8.745519,49.3906")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("filter2", "addr:street=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "dot:8.73803,49.402941,1")
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
	public void test_1k251ochag38i_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "name!=* or not area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "T:8.7383,49.433,6|hr:8.723464,49.4014,4|G:8.702,49.4093,9|WoKd:8.713,49.43646,8")
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
	public void test_1k1rpi0sejlf7_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "K:8.669,49.429,8.744,49.3983")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "42")
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
	public void test_uboo9swz7z8z_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.66902,49.408,8.730,49.3802")
				.queryParam("types2", "line,other")
				.queryParam("filter2", "source:maxspeed!=* and type:node and area:(1.0 .. 1E6)")
				.queryParam("time", "2010-06-15")
				.queryParam("keys2", "highway")
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
	public void test_1jezdv9eeifl1_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.710384,49.427,8.7264,49.4075,8.70447,49.436,8.704561,49.403252|8.704561,49.403252,8.7120,49.4087,8.7048,49.418,8.7042,49.415,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
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
	public void test_r1iv3a591dur_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not id:(1 .. 9999)")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-10-06")
				.queryParam("bpolys", "iPIas:8.704561,49.403252,8.72631,49.419579,8.7047,49.405,8.70681,49.417,8.704561,49.403252|JT:8.704561,49.403252,8.700,49.42030,8.7413,49.403,8.704,49.424,8.704561,49.403252|FATy:8.704561,49.403252,8.741,49.4255,8.70295,49.406524,8.700688,49.4175,8.704561,49.403252")
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
	public void test_us2zgqbabktt_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:node or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.677,49.42779,8.725,49.389")
				.queryParam("format", "json")
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
	public void test_toa61m1i9bol_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hx:8.652,49.418939,8.728303,49.386|jI:8.678,49.429,8.70352,49.395|CbxAn:8.695,49.4125,8.708,49.3950")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_vf6fik0311yw_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and geometry:point and length:( .. 100)")
				.queryParam("bboxes", "f:8.69256,49.4098,8.725,49.380")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-04-30")
				.queryParam("timeout", "30")
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
	public void test_1jict8k7lwp4n_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or type:node and id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "Ca:8.72745,49.43853,96|jq:8.747,49.411,64")
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
	public void test_1iynsvnwifz1s_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* or not type:node")
				.queryParam("bboxes", "8.682,49.408651,8.706,49.3895")
				.queryParam("keys", "highway")
				.queryParam("time", "2017-02-03")
				.queryParam("bpolys", "JwD:8.704561,49.403252,8.729,49.4138,8.724,49.43645,8.7458,49.4232,8.704561,49.403252")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.734,49.420,8")
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
	public void test_1hrotx6s4zk8h_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2016-10-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"C\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7425,49.4206],[8.7045,49.400],[8.704,49.4294],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713,49.4309],[8.70239,49.4024],[8.738,49.409],[8.704561,49.403252]]]}}]}")
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
	public void test_1jyljbxram6gg_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("time", "2009-08-15")
				.queryParam("bpolys", "L:8.704561,49.403252,8.738230,49.42759,8.7040,49.4157,8.71552,49.42779,8.704561,49.403252|hZTBM:8.704561,49.403252,8.73884,49.4360,8.708,49.409,8.7376,49.4334,8.704561,49.403252|zWf:8.704561,49.403252,8.734,49.411357,8.7138,49.4395,8.744,49.4338,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_1iesqz7qjrink_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and geometry:polygon and not id:(1 .. 9999)")
				.queryParam("bboxes", "VWy:8.663,49.40829,8.753,49.380")
				.queryParam("format", "json")
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
	public void test_qdysjjbiqjc2_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "VT:8.694,49.412920,8.72790,49.3804")
				.queryParam("timeout", "55")
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
	public void test_qdpz82epzoe1_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Wqx:8.658,49.404627,8.752,49.39898")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2016-03-11")
				.queryParam("bpolys", "ZFR:8.704561,49.403252,8.7348,49.4201,8.724766,49.41598,8.742,49.4158,8.704561,49.403252|d:8.704561,49.403252,8.70039,49.428975,8.71582,49.436549,8.704,49.42665,8.704561,49.403252")
				.queryParam("bcircles", "R:8.749,49.400,3")
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
	public void test_t4qn80wtbvht_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2010-04-13")
				.queryParam("bcircles", "wj:8.714,49.4279,4|MLl:8.708,49.436,9|e:8.7219,49.406,547088481|s:8.7043,49.411,8")
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
	public void test_1iyq1k7c87cc5_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=*")
				.queryParam("time", "2011-10-18")
				.queryParam("bcircles", "IHK:8.717,49.4229,4|i:8.7300,49.403,3")
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
	public void test_qhhrup94dv7a_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Ajlv:8.704561,49.403252,8.729,49.402,8.736,49.43060,8.701,49.41263,8.704561,49.403252|v:8.704561,49.403252,8.722,49.42354,8.7093,49.4375,8.7018,49.4091,8.704561,49.403252|sawe:8.704561,49.403252,8.727,49.419192,8.726,49.421,8.7041,49.418,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_1jewlp8gy1et0_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:forward=* or length:( .. 100)")
				.queryParam("bcircles", "8.723,49.4036,67")
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
	public void test_qdqgrccr1po5_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.680,49.4020,8.733,49.388")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "W:8.704561,49.403252,8.726214,49.432,8.7431,49.4112,8.701,49.41346,8.704561,49.403252|Q:8.704561,49.403252,8.729,49.4175,8.704,49.4110,8.7380,49.410,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_rhai8oxs30bp_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or not geometry:polygon or id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-08-21")
				.queryParam("bpolys", "VGCZa:8.704561,49.403252,8.739,49.4278,8.703,49.408704,8.7039,49.427,8.704561,49.403252")
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
	public void test_rhg2kmqn9ftv_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("timeout", "50")
				.queryParam("bcircles", "qmbCs:8.70968,49.4099,9")
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
	public void test_rl038613d2cz_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "neV:8.695,49.41093,8.748,49.3922|KDYZQ:8.6672,49.407,8.731,49.386|p:8.694,49.423,8.7202,49.391|g:8.656,49.408,8.7375,49.391")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1je9v8mmhtjqq_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "duaCF:8.7043,49.413,2|tKaLX:8.70046,49.435,4")
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
	public void test_s0uhaqzg52r5_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* or type:way and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "CRelc:8.66016,49.4058,8.724,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-08-19")
				.queryParam("bcircles", "eNGA:8.705,49.427,8|TqMu:8.746086,49.417,42|qDVh:8.711,49.4209,8|Vm:8.72361,49.4143,37")
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
	public void test_r1a3ekeqpgz6_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "pwfjb:8.6748,49.410,8.714,49.3982|F:8.6998,49.4014,8.7110,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
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
	public void test_t842z8mj8apc_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "GNSdm:8.7109,49.4297,97|eL:8.70733,49.412,2|GlO:8.730059,49.405,3")
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
	public void test_qhqn1yvdhyr9_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "dK:8.704561,49.403252,8.7172,49.4172,8.701,49.420,8.706787,49.40124,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_1if0kfwn0t3jq_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"MXQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722401,49.4128],[8.743,49.4262],[8.7007,49.4362],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73246,49.4367],[8.715,49.4230],[8.710,49.409438],[8.704561,49.403252]]]}}]}")
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
	public void test_toa3mulx0w8k_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "AlS:8.660,49.425,8.726,49.3951")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-06-05")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742109,49.410522],[8.7415,49.426],[8.733,49.422],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "Y:8.709,49.4139,2")
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
	public void test_sl3wpf54eq1y_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and type:node")
				.queryParam("bboxes", "wm:8.654876,49.4159,8.741,49.390")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-05-29")
				.queryParam("timeout", "44")
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
	public void test_1iusq5n59dt10_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("bpolys", "kkkho:8.704561,49.403252,8.72114,49.4286,8.701,49.407,8.717723,49.412,8.704561,49.403252|Z:8.704561,49.403252,8.706,49.410,8.724,49.4065,8.7043,49.42344,8.704561,49.403252|fAxP:8.704561,49.403252,8.723,49.435,8.701,49.400,8.7040,49.418,8.704561,49.403252")
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
	public void test_t4id26lbl9o4_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("time", "2012-07-28")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "CXUr:8.731,49.4321,6")
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
	public void test_r1lo1fm1ojld_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "oEOto:8.704561,49.403252,8.709,49.4038,8.707,49.418,8.70078,49.402759,8.704561,49.403252|y:8.704561,49.403252,8.7322,49.407,8.748,49.409030,8.743,49.401548,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_uvbf5yec9469_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:backward=* and type:node")
				.queryParam("bboxes", "tEL:8.681,49.4224,8.71960,49.383|H:8.691,49.426,8.705419,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7125,49.400],[8.7296,49.4278],[8.70483,49.434],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "36")
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
	public void test_1ies91uq6aqer_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform")
				.queryParam("bboxes", "v:8.6758,49.409,8.7284,49.387|g:8.686,49.421,8.74662,49.390|S:8.6778,49.4029,8.735,49.385385|w:8.695,49.427,8.718,49.397")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-04-15")
				.queryParam("bcircles", "8.739,49.408007,2|8.718,49.4357,2")
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
	public void test_1iyq3wfz27u5i_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,track")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"VZLq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7027,49.439925],[8.7025,49.439],[8.7366,49.40978],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7191,49.436],[8.700533,49.423],[8.704,49.420],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ngbVu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.4089],[8.700,49.4393],[8.706441,49.400],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "96")
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
	public void test_1hv37wxh37sqb_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.434],[8.727,49.406],[8.70947,49.438],[8.704561,49.403252]]]}}]}")
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
	public void test_qxi8ki7mfdbo_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-03-01")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "8.717,49.403,5|8.718,49.407,35")
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
	public void test_rlapk7q0y52p_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-09-01")
				.queryParam("timeout", "76")
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
	public void test_vbnhb4ho1zjl_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "zF:8.715,49.411607,58|xoHtx:8.713,49.436,747")
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
	public void test_to53kyam48xk_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "C:8.728,49.436,627236466|Xph:8.704,49.406,63")
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
	public void test_s0xamjbcrz1u_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary_link,track,hotel")
				.queryParam("filter", "surface=* and type:way or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2009-08-03")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "8.739,49.417,8|8.7465,49.41285,6|8.713330,49.406,2|8.74371,49.419,93")
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
	public void test_1k250yrd8lyzq_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "8.724,49.425,97|8.738,49.4125,4")
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
	public void test_qe1lf5lj3tx4_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:relation or length:( .. 100)")
				.queryParam("bboxes", "w:8.679495,49.4025,8.742,49.397|Tr:8.6560,49.4282,8.715414,49.3923")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-07-19")
				.queryParam("bpolys", "a:8.704561,49.403252,8.727,49.438,8.7114,49.4199,8.702,49.40421,8.704561,49.403252|liF:8.704561,49.403252,8.733,49.401953,8.734,49.434,8.708,49.42935,8.704561,49.403252|JFi:8.704561,49.403252,8.714,49.409,8.704,49.40172,8.705,49.43319,8.704561,49.403252")
				.queryParam("timeout", "81")
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
	public void test_t4nwlykifa5z_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-09-30")
				.queryParam("bpolys", "Zwx:8.704561,49.403252,8.73842,49.419361,8.716,49.4001,8.704545,49.438,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1hrucaz0xqlwk_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.681,49.4177,8.710,49.384")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-10-11")
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
	public void test_1hror4cmnbd4l_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "vJhTl:8.6984,49.428,8.747,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-02-05")
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
	public void test_qy1mjcz2mijp_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("time", "2016-01-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HXta\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7496,49.4106],[8.7032,49.429],[8.746,49.421241],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"jf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720864,49.428280],[8.704521,49.40325],[8.70286,49.4214],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7265,49.42835],[8.715,49.434],[8.708,49.4316],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "68")
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
	public void test_1jyovotmn2l41_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,station,pedestrian")
				.queryParam("bboxes", "kl:8.6999,49.4013,8.7134,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bpolys", "Fhiyw:8.704561,49.403252,8.7124,49.432112,8.70681,49.4028,8.707,49.431,8.704561,49.403252")
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
	public void test_qe12bbt0tqno_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* or type:node or id:(1 .. 9999)")
				.queryParam("groupByValues", "university")
				.queryParam("bboxes", "MLT:8.69632,49.425,8.74516,49.383")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7416,49.404],[8.720651,49.420],[8.705,49.4151],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "LGYqI:8.7278,49.400,9")
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
	public void test_rkziye458v1s_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "university,roof,commercial")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2016-08-22")
				.queryParam("bcircles", "bbebY:8.735,49.437,61")
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
	public void test_s1bn3v3lznzs_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:line and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2015-03-22")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "mEv:8.700,49.438,2")
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
	public void test_skscj3h1m4he_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,house")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"QC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.404667],[8.704568,49.432225],[8.712,49.421],[8.704561,49.403252]]]}}]}")
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
	public void test_sobv9dmoz1v9_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* or type:node")
				.queryParam("bboxes", "FGbz:8.677,49.408,8.7027,49.383")
				.queryParam("time", "2010-07-23")
				.queryParam("bpolys", "C:8.704561,49.403252,8.713,49.43220,8.72555,49.416872,8.725089,49.427,8.704561,49.403252|UkO:8.704561,49.403252,8.724,49.431,8.735,49.4053,8.7011,49.425,8.704561,49.403252|yK:8.704561,49.403252,8.747,49.41048,8.727,49.41637,8.720416,49.4226,8.704561,49.403252")
				.queryParam("bcircles", "8.7350,49.4181,4")
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
	public void test_trquchp7ox9d_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* and length:( .. 100)")
				.queryParam("bboxes", "Pc:8.673,49.4125,8.7073,49.3960|I:8.6983,49.411,8.75077,49.39347|uaNpH:8.65927,49.405884,8.716,49.3965")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-01-08")
				.queryParam("timeout", "69")
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
	public void test_1jeady7s4155v_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.728,49.400,8.7044,49.424,8.700,49.4369,8.704561,49.403252|8.704561,49.403252,8.722,49.4100,8.738,49.434,8.734,49.437233,8.704561,49.403252|8.704561,49.403252,8.7145,49.431,8.7099,49.424,8.744,49.4369,8.704561,49.403252")
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
	public void test_1iauulo1goylx_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"pz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70615,49.411],[8.729701,49.420],[8.7047,49.428],[8.704561,49.403252]]]}}]}")
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
	public void test_rhtw73wzjbcm_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "MV:8.7046,49.426,3|Jt:8.746,49.4046,1")
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
	public void test_1jy7orssa22cj_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-10-21")
				.queryParam("bpolys", "qcnDs:8.704561,49.403252,8.7287,49.423,8.734,49.402,8.713,49.413474,8.704561,49.403252|IkHo:8.704561,49.403252,8.702,49.410,8.742,49.406996,8.712545,49.421,8.704561,49.403252|H:8.704561,49.403252,8.74349,49.4104,8.70903,49.407,8.715,49.439,8.704561,49.403252")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "WT:8.749,49.4071,5")
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
	public void test_1hr877d3hjprt_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or length:( .. 100)")
				.queryParam("time", "2009-06-18")
				.queryParam("bpolys", "ub:8.704561,49.403252,8.724,49.4083,8.728,49.43150,8.704,49.422,8.704561,49.403252|f:8.704561,49.403252,8.70880,49.432727,8.741,49.4264,8.702,49.43103,8.704561,49.403252|dqdE:8.704561,49.403252,8.7394,49.4246,8.701,49.433307,8.7152,49.410,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_rlb6bh1ch4qc_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "R:8.704561,49.403252,8.7129,49.422,8.7021,49.412,8.702525,49.402790,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_r1ct80u4ixbk_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and type:node")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-11-04")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "j:8.71244,49.4016,1")
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
	public void test_1hrjqafp23rs6_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "jI:8.735,49.409818,2")
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
	public void test_1iavdpaaw9kja_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=*")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-11-06")
				.queryParam("bpolys", "8.704561,49.403252,8.718368,49.426,8.71182,49.426,8.727,49.41619,8.704561,49.403252|8.704561,49.403252,8.744429,49.4349,8.720420,49.409,8.734060,49.418,8.704561,49.403252|8.704561,49.403252,8.715,49.410,8.741,49.434,8.700796,49.4329,8.704561,49.403252")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "qV:8.735,49.400,3|tUok:8.747,49.416,26|d:8.7434,49.415292,5|sXPdx:8.740,49.437,901")
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
	public void test_1iyns0ym5ku9j_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-07-18")
				.queryParam("bpolys", "SR:8.704561,49.403252,8.7361,49.417,8.7066,49.410,8.720,49.43173,8.704561,49.403252|YF:8.704561,49.403252,8.743441,49.424,8.7015,49.4007,8.7099,49.402,8.704561,49.403252")
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
	public void test_1ieph9opbrebb_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-04-20")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.424,8.702,49.4362,8.708292,49.424,8.704561,49.403252")
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
	public void test_skyebss2n7so_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ZmLHQ:8.670,49.41039,8.712,49.382")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_1ibh1nbxmf68z_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "s:8.666,49.419779,8.74710,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-06-16")
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
	public void test_skv48qqz9ovn_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* and id:(1 .. 9999)")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2011-04-29")
				.queryParam("bpolys", "WyHvo:8.704561,49.403252,8.749,49.4257,8.704,49.4026,8.721,49.416,8.704561,49.403252|mI:8.704561,49.403252,8.7490,49.41798,8.736,49.428,8.70665,49.437,8.704561,49.403252")
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
	public void test_1ibbjnghou5o6_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-06-28")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "D:8.746,49.405,8|pI:8.708,49.427,66|PC:8.706408,49.431,90")
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
	public void test_1k22szreqyd6c_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "v:8.658,49.400,8.747,49.383|dPiDx:8.6987,49.409,8.727,49.395")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-10-11")
				.queryParam("timeout", "49")
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
	public void test_1h7ged13uh99t_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-11-05")
				.queryParam("bpolys", "O:8.704561,49.403252,8.741,49.435488,8.704026,49.425,8.739,49.421,8.704561,49.403252|Bh:8.704561,49.403252,8.729,49.409,8.7489,49.4168,8.7042,49.427,8.704561,49.403252|QffhK:8.704561,49.403252,8.714,49.4226,8.709,49.402656,8.7045,49.401,8.704561,49.403252")
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
	public void test_ts1w76mutxdh_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "vB:8.700,49.417,2")
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
	public void test_r1g4vd8gvt5v_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof")
				.queryParam("filter", "bicycle=* and length:( .. 100)")
				.queryParam("bboxes", "8.6585,49.4010,8.7164,49.3894")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "79")
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
	public void test_1hv5jpab6q9us_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or length:( .. 100)")
				.queryParam("values", "crossing")
				.queryParam("time", "2009-05-10")
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
	public void test_1hv5zor9bz59e_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,dormitory")
				.queryParam("bboxes", "ezB:8.66697,49.406,8.70961,49.384946|ulzjl:8.662615,49.4148,8.706,49.390|FF:8.660,49.415963,8.703,49.395|N:8.6896,49.409,8.7431,49.389187")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-01-29")
				.queryParam("timeout", "27")
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
	public void test_1k1rp6mpcm6at_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "W:8.735,49.402,7")
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
	public void test_t4sx4uk49u7m_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2009-02-12")
				.queryParam("bpolys", "8.704561,49.403252,8.7438,49.4014,8.708,49.41398,8.7219,49.403,8.704561,49.403252")
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
	public void test_qe75cgm9djci_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* and not length:( .. 100)")
				.queryParam("bboxes", "kmO:8.6774,49.402,8.7387,49.3975")
				.queryParam("groupByKey", "building")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("time", "2009-02-17")
				.queryParam("bpolys", "VtRE:8.704561,49.403252,8.73264,49.43293,8.744,49.439,8.716,49.41862,8.704561,49.403252|u:8.704561,49.403252,8.7069,49.439126,8.703,49.4151,8.70113,49.4238,8.704561,49.403252|I:8.704561,49.403252,8.725,49.4282,8.727,49.41166,8.721,49.417,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_rl8dg4z8q0c0_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-04-05")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "ptEjn:8.724,49.413,9")
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
	public void test_1iuvibrkkzx2p_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and not type:way")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "hZ:8.7224,49.421,79")
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
	public void test_trz4fesldirc_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2008-08-13")
				.queryParam("bpolys", "8.704561,49.403252,8.714139,49.4383,8.708,49.42724,8.7217,49.407,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_qxiqt7zjjujn_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street,stop_line,service")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lIWEy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.401],[8.710,49.4211],[8.7046,49.418437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"LPdeU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71815,49.421619],[8.7047,49.4352],[8.727,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70242,49.4023],[8.730,49.437452],[8.704,49.42984],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "33")
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
	public void test_ubupfdmq8ym0_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "WPL:8.704561,49.403252,8.7010,49.4353,8.7054,49.401,8.704714,49.435,8.704561,49.403252")
				.queryParam("groupByKeys", "sidewalk,surface")
				.queryParam("bcircles", "8.7312,49.409622,90")
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
	public void test_qhq3yiwjbf3t_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "8.655,49.4031,8.7229,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("timeout", "36")
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
	public void test_1hrdp9l1u1v7c_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.677162,49.417,8.722,49.392|8.6519,49.420,8.738,49.399|8.6604,49.4135,8.703860,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("groupByKeys", "bicycle")
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
	public void test_urxgrrjcmkaa_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "8.704561,49.403252,8.716,49.407,8.727042,49.438,8.73908,49.4076,8.704561,49.403252|8.704561,49.403252,8.700,49.407,8.7067,49.407,8.711,49.413,8.704561,49.403252|8.704561,49.403252,8.746,49.422125,8.704965,49.411,8.708,49.419,8.704561,49.403252")
				.queryParam("timeout", "86")
				.queryParam("groupByKeys", "lanes:backward,building,addr:housenumber")
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
	public void test_soq5q729om04_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=*")
				.queryParam("time", "2013-04-24")
				.queryParam("timeout", "78")
				.queryParam("groupByKeys", "addr:city,turn:lanes")
				.queryParam("bcircles", "8.7005,49.409,25|8.7069,49.405649,4")
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
	public void test_s1gonpcb6a7m_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and not type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "ChHh:8.6632,49.422,8.714,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "70")
				.queryParam("groupByKeys", "highway,maxspeed,ref")
				.queryParam("bcircles", "T:8.746,49.416,8|KP:8.72722,49.423,13|zH:8.734,49.410,4")
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
	public void test_rlb5jmrcrak4_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* or not area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "8.724,49.416070,1|8.71362,49.4135,9")
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
	public void test_urjmalsf2trl_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "network,addr:city")
				.queryParam("bcircles", "MWYkE:8.725984,49.414,3")
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
	public void test_1h7j62893qb8h_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("timeout", "72")
				.queryParam("groupByKeys", "destination,maxspeed")
				.queryParam("bcircles", "qvOyB:8.724,49.42560,3|q:8.705,49.41314,1|Iz:8.7315,49.400,3|iJOMH:8.7472,49.4396,4")
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
	public void test_t86ud977ng35_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* and not geometry:point and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-10-02")
				.queryParam("bpolys", "8.704561,49.403252,8.7181,49.425,8.739,49.406,8.723480,49.4225,8.704561,49.403252|8.704561,49.403252,8.713,49.415,8.700,49.435,8.709,49.4053,8.704561,49.403252|8.704561,49.403252,8.742,49.4212,8.7040,49.431,8.743,49.4057,8.704561,49.403252")
				.queryParam("timeout", "63")
				.queryParam("groupByKeys", "lanes:backward,addr:postcode,highway")
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
	public void test_u87xmuwu0nci_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,chapel")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7073,49.425229],[8.723798,49.403168],[8.70435,49.409677],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "8.724,49.431,3")
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
	public void test_1hbj9yfzqh4c0_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* or type:node and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "D:8.736,49.4228,9")
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
	public void test_1iuy87v3k32ux_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-12-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7399,49.43834],[8.7097,49.428],[8.7081,49.4327],[8.704561,49.403252]]]}}]}")
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
	public void test_s1jyr75lhyd3_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "fJyKk:8.724,49.41213,745")
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
	public void test_s1jyctvw7l86_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary_link,public,office")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"F\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743,49.401],[8.705429,49.419],[8.7045,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.423],[8.7465,49.4389],[8.723099,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "87")
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
	public void test_1if0jlbmnyywi_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,elevator,garage")
				.queryParam("filter", "tracktype!=*")
				.queryParam("bboxes", "oD:8.6709,49.407,8.704,49.3861|mVnBn:8.652,49.403,8.732881,49.394|MN:8.655,49.41402,8.729,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-10-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.420],[8.743,49.418],[8.7413,49.411],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "BE:8.71169,49.431,6|q:8.7112,49.428,9|vVGyU:8.718,49.421,77")
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
	public void test_1jet97b451qhx_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "69")
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
	public void test_t4l5auir6bmr_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,cycleway,primary_link")
				.queryParam("filter", "service=driveway or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-03-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748014,49.420],[8.726,49.422],[8.742,49.4217],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ZBA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71594,49.4104],[8.742382,49.42762],[8.7029,49.4126],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"QBRpA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.411],[8.739097,49.414],[8.704561,49.420],[8.704561,49.403252]]]}}]}")
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
	public void test_qdyajhz2fbdy_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "give_way,crossing,house")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "XZc:8.727322,49.410,2112349117")
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
	public void test_t4sxgay52at0_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bcircles", "Toqij:8.7292,49.408,54|Ib:8.729,49.4041,868")
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
	public void test_1jy27yet9m5wk_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* and type:relation or id:(1 .. 9999)")
				.queryParam("bboxes", "S:8.672,49.416912,8.7235,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "Tm:8.719,49.4068,6|sIkJd:8.702,49.421,8|dCCv:8.724465,49.417,7")
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
	public void test_qdqgr24s1lx2_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.672,49.419068,8.74338,49.386|8.6809,49.4171,8.703,49.389|8.689,49.422,8.758,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
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
	public void test_1iv12pwpo3zab_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("time", "2015-03-01")
				.queryParam("bpolys", "L:8.704561,49.403252,8.7309,49.4388,8.700,49.404,8.706,49.40699,8.704561,49.403252|g:8.704561,49.403252,8.7152,49.433587,8.704,49.406867,8.706365,49.423,8.704561,49.403252")
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
	public void test_skna2a59lmjm_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=*")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-01-14")
				.queryParam("bcircles", "k:8.714,49.421,9|uB:8.708865,49.422,214|lsRWS:8.7266,49.430,3")
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
	public void test_1hrmhnwxal3s6_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "TwrBY:8.704561,49.403252,8.71235,49.4252,8.7211,49.4287,8.7299,49.429171,8.704561,49.403252|BY:8.704561,49.403252,8.742818,49.419,8.735,49.42425,8.716097,49.4203,8.704561,49.403252")
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
	public void test_qhkl4en6uwq8_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=*")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
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
	public void test_us311ai0qe76_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "8.7478,49.407759,8")
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
	public void test_1jidbvsx9l750_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("time", "2012-07-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FtrA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.4135],[8.725,49.438],[8.710056,49.408],[8.704561,49.403252]]]}}]}")
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
	public void test_uvep9fw2v9rs_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2008-09-03")
				.queryParam("bpolys", "8.704561,49.403252,8.730,49.427,8.7055,49.431,8.729,49.435472,8.704561,49.403252|8.704561,49.403252,8.703,49.436,8.708,49.4174,8.7364,49.429,8.704561,49.403252")
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
	public void test_vf3ogf64qjc6_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("bpolys", "8.704561,49.403252,8.7162,49.416,8.701,49.431,8.7041,49.429485,8.704561,49.403252|8.704561,49.403252,8.734,49.409,8.705173,49.4259,8.72996,49.4304,8.704561,49.403252|8.704561,49.403252,8.71858,49.430,8.7045,49.429,8.746286,49.425,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_trzodm05gbp0_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or not geometry:point and length:( .. 100)")
				.queryParam("bboxes", "HvsW:8.6910,49.405,8.7584,49.3985")
				.queryParam("values", "living_street")
				.queryParam("filter2", "source:maxspeed!=* and not geometry:polygon or not id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.415],[8.704,49.434],[8.706429,49.4294],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.7273,49.414,1")
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
	public void test_s162s54x83so_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* and geometry:line and length:( .. 100)")
				.queryParam("types2", "point,line,other")
				.queryParam("time", "2014-06-29")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "28")
				.queryParam("values2", "footway")
				.queryParam("bcircles", "WUH:8.748,49.405814,6|Pd:8.747,49.422,51|DmqPW:8.707,49.428,2")
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
	public void test_1je9xwfjyt2yg_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("filter2", "addr:postcode!=*")
				.queryParam("time", "2015-03-08")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "86")
				.queryParam("values2", "traffic_signals")
				.queryParam("bcircles", "8.738,49.402,6")
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
	public void test_s4rteet6klki_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "W:8.6988,49.420,8.737026,49.3965")
				.queryParam("keys", "highway")
				.queryParam("types2", "way,relation")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("filter2", "oneway!=* or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "88")
				.queryParam("values2", "service")
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
	public void test_1iuqgpb03x3cp_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* or id:(1 .. 9999)")
				.queryParam("types2", "node,relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.722,49.40515,8.706,49.4328,8.704,49.407,8.704561,49.403252|8.704561,49.403252,8.7477,49.438,8.748,49.4392,8.731245,49.42260,8.704561,49.403252|8.704561,49.403252,8.702,49.405985,8.7122,49.424,8.70048,49.428625,8.704561,49.403252")
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
	public void test_qxiag6wugdic_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("bboxes", "8.6876,49.4039,8.727,49.3974")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("values2", "street_lamp")
				.queryParam("bcircles", "A:8.709,49.41188,7")
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
	public void test_t4f3fqcddzs4_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Bs:8.695,49.42918,8.755,49.394|Vkhq:8.683,49.40197,8.744,49.395|Xf:8.686,49.429930,8.7020,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "ref!=* and not length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "41")
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
	public void test_u7xd8usuq9td_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "landuse!=*")
				.queryParam("bcircles", "WeSv:8.735,49.423,414")
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
	public void test_tol8aecwtizq_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "other")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "ref!=* and type:way")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "fpJ:8.71282,49.4298,5|hMpkc:8.705,49.4113,21")
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
	public void test_rhm3z6njooxe_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.693,49.414314,8.745177,49.382|8.6967,49.41905,8.706943,49.393|8.667,49.40621,8.749,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("filter2", "turn=* and id:(1 .. 9999)")
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
	public void test_vf3pm8njls9t_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("filter2", "surface!=*")
				.queryParam("keys2", "highway")
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
	public void test_trwc9bvvkxmf_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
				.queryParam("values2", "living_street")
				.queryParam("bcircles", "YI:8.7082,49.439,3")
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
	public void test_1hr5v0rxzwu9c_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and area:(1.0 .. 1E6)")
				.queryParam("types2", "line,other")
				.queryParam("format", "json")
				.queryParam("filter2", "turn=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2017-05-16")
				.queryParam("bcircles", "8.7439,49.40695,1|8.749,49.4083,475")
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
	public void test_1iun7dvevavs2_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:forward=* or length:( .. 100)")
				.queryParam("types2", "node,way,")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "tracktype=* and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
				.queryParam("bcircles", "NfQ:8.738,49.4325,37|QAxaI:8.7404,49.411,5|mh:8.7323,49.430,58|Nz:8.7421,49.425,23948632879")
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
	public void test_vb6dkrnw6jp2_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city!=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "2013-11-28")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "85")
				.queryParam("values2", "secondary_link")
				.queryParam("bcircles", "8.749,49.415,5")
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
	public void test_trz5a226suar_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway or geometry:polygon or id:(1 .. 9999)")
				.queryParam("types2", "line,")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-03-02")
				.queryParam("keys2", "highway")
				.queryParam("values2", "cycleway")
				.queryParam("bcircles", "Z:8.700943,49.434,5|WR:8.718,49.41218,2|bKTli:8.746,49.4212,3")
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
	public void test_rl5mdsmxq1cx_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "network=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2015-10-08")
				.queryParam("bpolys", "aqQ:8.704561,49.403252,8.7359,49.4084,8.718,49.439,8.739,49.436,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "37")
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
	public void test_vb6thiqgl8ag_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "g:8.704561,49.403252,8.747,49.4175,8.70478,49.410,8.7387,49.425,8.704561,49.403252|nxOOF:8.704561,49.403252,8.741141,49.411,8.7032,49.400,8.718,49.41230,8.704561,49.403252|ggXlZ:8.704561,49.403252,8.7144,49.425,8.702,49.437,8.745,49.4202,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "33")
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
	public void test_u82wh43mdzkz_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or area:(1.0 .. 1E6)")
				.queryParam("types2", "point,")
				.queryParam("time", "2011-05-21")
				.queryParam("bpolys", "8.704561,49.403252,8.711,49.409,8.706796,49.4015,8.7363,49.429,8.704561,49.403252|8.704561,49.403252,8.715,49.429,8.702563,49.4014,8.70376,49.43785,8.704561,49.403252|8.704561,49.403252,8.718,49.425,8.732,49.407,8.7441,49.4362,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "elevator")
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
	public void test_s13b0d9tooc5_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:relation")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "uK:8.704561,49.403252,8.7107,49.40477,8.701,49.403,8.7177,49.435285,8.704561,49.403252|H:8.704561,49.403252,8.7300,49.4140,8.728,49.4246,8.7480,49.432,8.704561,49.403252|VdMHm:8.704561,49.403252,8.703,49.413,8.70231,49.4312,8.734321,49.4075,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "platform")
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
	public void test_ure0soahxen9_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "y:8.704561,49.403252,8.7166,49.4368,8.744,49.438,8.7161,49.408,8.704561,49.403252|YKEr:8.704561,49.403252,8.7372,49.4220,8.734,49.437,8.704972,49.412,8.704561,49.403252|sRghL:8.704561,49.403252,8.7033,49.410,8.704,49.4239,8.736,49.4042,8.704561,49.403252")
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
	public void test_s1jhafnnub1g_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.690357,49.405,8.749,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-08-17")
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
	public void test_1ji7qrujy9ve9_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=*")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-03-23")
				.queryParam("bpolys", "8.704561,49.403252,8.7217,49.425,8.7042,49.405,8.7389,49.4073,8.704561,49.403252|8.704561,49.403252,8.7349,49.423198,8.730,49.419,8.7353,49.405,8.704561,49.403252|8.704561,49.403252,8.725,49.419,8.7081,49.417,8.723,49.403030,8.704561,49.403252")
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
	public void test_trwwzle34mk3_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.671,49.420,8.7339,49.39860")
				.queryParam("format", "csv")
				.queryParam("timeout", "29")
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
	public void test_1hb878xtohhsz_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-07-19")
				.queryParam("bpolys", "p:8.704561,49.403252,8.724910,49.417,8.71649,49.433,8.703,49.4364,8.704561,49.403252|moCL:8.704561,49.403252,8.700,49.416,8.703700,49.418,8.705,49.429,8.704561,49.403252")
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
	public void test_sl14mcgu9mid_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood")
				.queryParam("bboxes", "8.6958,49.40314,8.712,49.3810|8.689,49.41405,8.7150,49.388")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-08-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.419],[8.740,49.405],[8.712,49.4136],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "42")
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
	public void test_1ies91yaxcg1j_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "BxoQF:8.7323,49.406,3|a:8.73085,49.430,51")
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
	public void test_toanihhqemat_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and geometry:point and not length:( .. 100)")
				.queryParam("bboxes", "8.663,49.4140,8.727,49.387|8.691,49.40594,8.709,49.395|8.663,49.426705,8.750,49.390|8.693,49.4072,8.74011,49.3871")
				.queryParam("format", "json")
				.queryParam("timeout", "36")
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
	public void test_sohcxmfl6p87_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country!=* and not type:node and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-03-21")
				.queryParam("timeout", "100")
				.queryParam("bcircles", "8.745119,49.43416,4")
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
	public void test_s1jhlserkaqt_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and geometry:line or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("time", "2014-01-02")
				.queryParam("bpolys", "LrQ:8.704561,49.403252,8.735,49.405,8.704976,49.419,8.704560,49.43427,8.704561,49.403252|Bv:8.704561,49.403252,8.72283,49.4180,8.70036,49.42767,8.7296,49.408,8.704561,49.403252")
				.queryParam("timeout", "26")
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
	public void test_t4q4kw57rsxi_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"WXPd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.433],[8.746,49.433086],[8.7325,49.426],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ls\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723,49.407],[8.7465,49.434],[8.7257,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "83")
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
	public void test_qxtvv8bxfodx_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.716,49.410823,8.705,49.420,8.733,49.434,8.704561,49.403252|8.704561,49.403252,8.7457,49.4364,8.704612,49.403,8.704734,49.42072,8.704561,49.403252")
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
	public void test_r1dbxtvhhxsy_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-05-21")
				.queryParam("bpolys", "xyPL:8.704561,49.403252,8.733116,49.4392,8.7042,49.4238,8.748106,49.415638,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_toogfumn1p2t_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "sf:8.743794,49.4372,8|eKU:8.718,49.4356,5")
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
	public void test_uv8l4o7gzbck_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "r:8.65548,49.4038,8.7418,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "23")
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
	public void test_qdvksc1zozsm_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=*")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("bpolys", "kyg:8.704561,49.403252,8.718,49.4215,8.738,49.43196,8.739301,49.410,8.704561,49.403252|ZN:8.704561,49.403252,8.70345,49.439801,8.734,49.4105,8.7448,49.4066,8.704561,49.403252|IyycO:8.704561,49.403252,8.73007,49.425,8.700,49.413,8.7029,49.426,8.704561,49.403252")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "KVja:8.725,49.41974,87")
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
	public void test_1ib5xawo8pppe_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "H:8.70250,49.433,7")
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
	public void test_qhncvsouhhdj_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=*")
				.queryParam("format", "json")
				.queryParam("time", "2017-03-06")
				.queryParam("bpolys", "JDXHp:8.704561,49.403252,8.73716,49.406,8.718,49.428,8.715968,49.415,8.704561,49.403252|NTCi:8.704561,49.403252,8.741,49.426,8.722,49.4319,8.727,49.41322,8.704561,49.403252|Z:8.704561,49.403252,8.745,49.419,8.7166,49.409,8.727,49.42322,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_1jydb1sj4stgw_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2007-12-02")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "jdzOx:8.7495,49.438,666837062922|q:8.743822,49.439,82|cGNJq:8.7106,49.422,2")
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
	public void test_rhgmfx3b26ux_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "SWISi:8.738799,49.411,4|qFaTC:8.736,49.406,5")
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
	public void test_rhg39sd8b144_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* and geometry:line or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "i:8.743,49.412,79")
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
	public void test_s4pkssct0qb5_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6853,49.42488,8.707667,49.3925|8.673,49.40348,8.744,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-01-17")
				.queryParam("timeout", "40")
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
	public void test_1hrgza4otkunm_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.683,49.406092,8.745,49.3802")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-09-21")
				.queryParam("timeout", "41")
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
	public void test_1jew2jf9yeteq_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.415,8.7417,49.40670,8.745,49.4074,8.704561,49.403252|8.704561,49.403252,8.711,49.428,8.707,49.4391,8.727,49.426,8.704561,49.403252|8.704561,49.403252,8.70549,49.437982,8.702,49.424,8.704,49.42289,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_tolqmany8dvd_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.66142,49.4108,8.703,49.384")
				.queryParam("format", "json")
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
	public void test_1iyq15zx2smcx_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("bboxes", "gOz:8.6527,49.428,8.7339,49.398")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-04-07")
				.queryParam("bpolys", "jxl:8.704561,49.403252,8.709,49.427518,8.7002,49.405,8.739,49.4139,8.704561,49.403252")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "8.714,49.420,81")
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
	public void test_1hrrk29tpywdi_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-03-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70650,49.40056],[8.725,49.427],[8.70783,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "37")
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
	public void test_1iycoxdq7csa9_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "Fp:8.662230,49.400,8.739,49.3832|E:8.693,49.410,8.748,49.397|qaOij:8.6879,49.405,8.7279,49.391")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-07-26")
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
	public void test_rhr61z8cfktx_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=*")
				.queryParam("format", "json")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "8.74384,49.412,4")
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
	public void test_u7zljdfrcpiu_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.4054],[8.743,49.4143],[8.723,49.422],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "87")
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
	public void test_u7xcgyh0cwv5_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_t4hsv7mhyan9_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "hospital,unclassified,speed_camera")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-05-19")
				.queryParam("timeout", "76")
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
	public void test_1h7io7ib95d29_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "NBOcA:8.7437,49.414,4")
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
	public void test_s1b4c0zucjsg_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "steps,ship")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2012-06-21")
				.queryParam("bpolys", "g:8.704561,49.403252,8.730,49.4352,8.705,49.431,8.704502,49.430,8.704561,49.403252|MSz:8.704561,49.403252,8.709,49.40546,8.728,49.401916,8.704,49.427,8.704561,49.403252")
				.queryParam("timeout", "80")
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
	public void test_1hv0giuu83muc_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "commercial,path,residential")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.7008,49.414,8.703598,49.423,8.7044,49.430,8.704561,49.403252|8.704561,49.403252,8.7164,49.407032,8.7287,49.4353,8.7078,49.4099,8.704561,49.403252|8.704561,49.403252,8.720,49.431,8.703366,49.436,8.749,49.439,8.704561,49.403252")
				.queryParam("timeout", "93")
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
	public void test_1jetafv7zjyuw_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* and length:( .. 100)")
				.queryParam("bboxes", "8.6664,49.4120,8.749,49.397|8.677,49.4160,8.704,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bpolys", "sIpFy:8.704561,49.403252,8.7406,49.423,8.70490,49.409,8.710,49.433,8.704561,49.403252|Gevv:8.704561,49.403252,8.7201,49.417036,8.706,49.424,8.7060,49.405,8.704561,49.403252|Zc:8.704561,49.403252,8.721,49.41340,8.720,49.422696,8.704,49.411663,8.704561,49.403252")
				.queryParam("bcircles", "8.7444,49.436,3|8.739,49.428,4")
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
	public void test_vbeo4n6gcfvl_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("groupByValues", "service,secondary_link")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-12-13")
				.queryParam("bpolys", "8.704561,49.403252,8.7223,49.416,8.740,49.40371,8.704835,49.404539,8.704561,49.403252|8.704561,49.403252,8.714986,49.411696,8.704,49.432,8.7135,49.417201,8.704561,49.403252|8.704561,49.403252,8.740,49.4224,8.7137,49.41439,8.745,49.406,8.704561,49.403252")
				.queryParam("bcircles", "AQGk:8.734,49.410495,7")
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
	public void test_vf0xuerz6ckx_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,hospital,living_street")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2016-07-25")
				.queryParam("bpolys", "qZ:8.704561,49.403252,8.702,49.41618,8.7284,49.426,8.711,49.400,8.704561,49.403252")
				.queryParam("timeout", "23")
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
	public void test_rhllnibuj3hg_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,steps")
				.queryParam("filter", "oneway=* and not geometry:line or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-06-25")
				.queryParam("bcircles", "x:8.714,49.439,4|E:8.729,49.421,2")
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
	public void test_s4xewo7kaq0g_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_signals,school,footway")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("bcircles", "8.725,49.425,9")
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
	public void test_sksdpcp9m2pi_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ltkP:8.6801,49.40331,8.715,49.3903")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2014-04-02")
				.queryParam("bcircles", "8.707,49.419,5")
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
	public void test_rhoe7ibyxttj_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("groupByValues", "platform")
				.queryParam("bboxes", "8.673,49.407,8.73313,49.399")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2007-11-18")
				.queryParam("bcircles", "NhfFn:8.7465,49.421,8|iwv:8.746285,49.404,9|ogC:8.73658,49.40125,2|nZgFJ:8.739,49.435,5237209749")
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
	public void test_s100gjtrdaar_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or not geometry:line or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-10-23")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "eUX:8.709,49.429,8|v:8.7444,49.400,8|qr:8.725019,49.418,1")
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
	public void test_urxetoc4va5w_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2011-07-26")
				.queryParam("bcircles", "LZSPH:8.714,49.422,4|m:8.705421,49.4076,1|xHKBB:8.7048,49.4389,49|H:8.7161,49.427,19")
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
	public void test_uv6dmfzdqxbl_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.4270],[8.72567,49.408183],[8.739,49.41361],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fYwx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7332,49.4145],[8.732,49.4139],[8.705,49.409],[8.704561,49.403252]]]}}]}")
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
	public void test_qy4fjj0h2gxk_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-02-21")
				.queryParam("bpolys", "mO:8.704561,49.403252,8.719,49.4024,8.742501,49.4388,8.7494,49.415060,8.704561,49.403252|tPO:8.704561,49.403252,8.706,49.432,8.73368,49.4379,8.72610,49.431530,8.704561,49.403252")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "R:8.715,49.434,579|V:8.714,49.4230,7")
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
	public void test_u7wu54yeo10y_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.686,49.408,8.719,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
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
	public void test_1h7fu18jyv1b7_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,traffic_signals")
				.queryParam("filter", "turn=* or geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "t:8.681,49.413,8.7489,49.3937|m:8.6760,49.4150,8.7251,49.3924")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
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
	public void test_t4hviv0sociq_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-11-15")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "WWEW:8.738,49.428,62|Hc:8.7412,49.418,3")
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
	public void test_1k200wj6gpfll_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2010-09-13")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "H:8.7005,49.436,533")
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
	public void test_1jyiu7knmt083_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and not area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "O:8.704561,49.403252,8.742,49.418,8.701,49.41863,8.7030,49.422,8.704561,49.403252")
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
	public void test_1k1wsovmcor3r_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "2016-12-05")
				.queryParam("bcircles", "8.747732,49.412,93|8.74495,49.4111,55")
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
	public void test_qxi8w2vuu9gh_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bcircles", "Dvs:8.740,49.435,4|LFsIJ:8.736,49.425,2")
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
	public void test_qhsw1p5u7h9y_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.407],[8.726,49.431],[8.70309,49.4025],[8.704561,49.403252]]]}}]}")
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
	public void test_s13ci3ajlbae_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-02-24")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "O:8.738,49.41724,9|z:8.7095,49.422871,6")
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
	public void test_s505i6fyfxh3_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "Kd:8.74072,49.414,6|hv:8.734007,49.41650,4")
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
	public void test_rhr4t59wdyk7_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.7365,49.400454,6|8.730,49.4301,5")
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
	public void test_sohcv1pqz52e_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "oL:8.671605,49.401,8.709,49.392353|SUAtW:8.6785,49.420785,8.74966,49.394|lyoWC:8.651694,49.4118,8.722,49.383773")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "20")
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
	public void test_qhhsjyi5w2g2_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "B:8.668,49.420,8.7095,49.3815|Gh:8.674,49.42624,8.754,49.3914")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "57")
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
	public void test_rl8ey05kz9es_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface!=*")
				.queryParam("format", "csv")
				.queryParam("bpolys", "sxI:8.704561,49.403252,8.726,49.437,8.719,49.4149,8.7198,49.417179,8.704561,49.403252|A:8.704561,49.403252,8.721,49.4154,8.72611,49.420,8.717,49.435,8.704561,49.403252")
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
	public void test_1hbliml8la5wh_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"A\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.424],[8.7240,49.439],[8.70733,49.41742],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"v\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.438],[8.704,49.419227],[8.704585,49.426],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "8.701,49.4319,13|8.700,49.421,3|8.7300,49.429,26")
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
	public void test_tnz07yyfwgfo_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-10-02")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "8.74531,49.419,4")
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
	public void test_qhl3feknk2lz_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "saUno:8.704561,49.403252,8.737,49.423,8.7029,49.43162,8.731,49.416,8.704561,49.403252|JHex:8.704561,49.403252,8.734630,49.427,8.716501,49.405,8.7475,49.4245,8.704561,49.403252|A:8.704561,49.403252,8.701,49.404,8.7247,49.40306,8.7429,49.412,8.704561,49.403252")
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
	public void test_r1dcedqvc95w_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-02-09")
				.queryParam("bpolys", "8.704561,49.403252,8.722,49.437,8.704684,49.40765,8.70273,49.4319,8.704561,49.403252|8.704561,49.403252,8.736802,49.418,8.74665,49.4209,8.703630,49.43009,8.704561,49.403252")
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
	public void test_rhr4vzuodyld_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "XwmQU:8.7407,49.4275,56|M:8.71373,49.400,9")
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
	public void test_t8f5as0ezbl0_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not length:( .. 100)")
				.queryParam("time", "2014-08-18")
				.queryParam("bpolys", "8.704561,49.403252,8.723,49.419,8.709,49.4373,8.745,49.426621,8.704561,49.403252|8.704561,49.403252,8.730,49.418,8.70054,49.434,8.707,49.4259,8.704561,49.403252")
				.queryParam("bcircles", "8.72956,49.4387,4|8.735,49.427,6|8.744280,49.4028,327")
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
	public void test_tolonwvk47xu_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=*")
				.queryParam("format", "json")
				.queryParam("time", "2014-03-27")
				.queryParam("bpolys", "tFA:8.704561,49.403252,8.711,49.435,8.733,49.423826,8.740,49.4273,8.704561,49.403252|NuxYy:8.704561,49.403252,8.712,49.418005,8.703079,49.4220,8.724110,49.421,8.704561,49.403252|GYX:8.704561,49.403252,8.729,49.43892,8.745,49.414,8.715,49.41682,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_1iyeydv3re71s_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2014-01-05")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.419897],[8.72306,49.4074],[8.72502,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.43456],[8.7005,49.429558],[8.728,49.4166],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"zL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.437],[8.723,49.417],[8.706,49.418],[8.704561,49.403252]]]}}]}")
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
	public void test_ubu6n9btjd5x_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or not length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "Gs:8.702,49.4104,1|PFWPy:8.742,49.410495,15")
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
	public void test_vb3img1n51kk_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "8.706,49.416,5")
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
	public void test_1ib3pss2iib1f_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,office,garage")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-12-05")
				.queryParam("bpolys", "VrQ:8.704561,49.403252,8.747,49.400274,8.704,49.431,8.707,49.4111,8.704561,49.403252|SzIsl:8.704561,49.403252,8.70769,49.418,8.703,49.401,8.70808,49.433,8.704561,49.403252|x:8.704561,49.403252,8.7396,49.422,8.7075,49.40775,8.743,49.415893,8.704561,49.403252")
				.queryParam("bcircles", "8.714,49.406,5|8.727,49.416244,9|8.729,49.432,5")
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
	public void test_t86tzeevct9s_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=*")
				.queryParam("groupByValues", "primary_link")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-11-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yZsih\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.427],[8.703377,49.408],[8.74970,49.43025],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "40")
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
	public void test_1ji7asn0388xc_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,synagogue")
				.queryParam("filter", "ref!=* or geometry:polygon")
				.queryParam("bboxes", "jYYXI:8.689,49.405,8.733,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-06-14")
				.queryParam("timeout", "36")
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
	public void test_1jy889a94jqk6_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "mU:8.679,49.421,8.7573,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-02-18")
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
	public void test_u7wu5cglox87_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,hotel")
				.queryParam("filter", "barrier!=* and type:node")
				.queryParam("bboxes", "kOlmY:8.6530,49.4278,8.72016,49.3950")
				.queryParam("groupByKey", "highway")
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
	public void test_qe3sxg5gq89x_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator")
				.queryParam("bboxes", "8.660,49.400,8.744080,49.399|8.667,49.424,8.7356,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-11-03")
				.queryParam("bcircles", "gh:8.7471,49.422,76")
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
	public void test_1jeaec4xwqiqt_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "G:8.686,49.406380,8.704,49.383|O:8.6712,49.4270,8.741,49.382|W:8.669,49.403,8.712967,49.399361")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-11-11")
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
	public void test_uvbfk9cuzhpd_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,unclassified,school")
				.queryParam("bboxes", "G:8.676,49.4137,8.759,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "72")
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
	public void test_tonyinw4n2uu_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,crossing,demolished")
				.queryParam("filter", "addr:city!=* and length:( .. 100)")
				.queryParam("bboxes", "zhZWS:8.651,49.4209,8.717819,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "97")
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
	public void test_rl2ve0ntc9bo_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,roof")
				.queryParam("bboxes", "Mq:8.666,49.414,8.7378,49.3879")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("timeout", "43")
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
	public void test_1iyfh3g91mk34_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "c:8.682,49.400,8.70271,49.392")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-08-27")
				.queryParam("bpolys", "JRlPC:8.704561,49.403252,8.737,49.4132,8.7345,49.437,8.733,49.437,8.704561,49.403252")
				.queryParam("groupByKeys", "oneway,type")
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
	public void test_u7zmbjlpbe5g_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6957,49.42547,8.731,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.4007,8.715,49.40836,8.732,49.402595,8.704561,49.403252|8.704561,49.403252,8.7299,49.418,8.730,49.4040,8.708,49.410,8.704561,49.403252|8.704561,49.403252,8.702,49.4337,8.704,49.414,8.726,49.428,8.704561,49.403252")
				.queryParam("bcircles", "sm:8.720364,49.419,66|tdAX:8.749332,49.4115,9|T:8.7337,49.432,88")
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
	public void test_t8cxh3fn89bo_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "whTTL:8.6630,49.402,8.7585,49.38970|i:8.652506,49.4201,8.715,49.39662|E:8.692,49.426,8.747,49.387|NP:8.689,49.416,8.70206,49.3897")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-10-27")
				.queryParam("groupByKeys", "addr:city,name,highway")
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
	public void test_to1tk14e5auw_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "sidewalk,addr:housenumber")
				.queryParam("bcircles", "8.708,49.405841,1")
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
	public void test_s102gzwd252v_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bpolys", "xiNbS:8.704561,49.403252,8.731,49.409,8.704507,49.405,8.7029,49.43700,8.704561,49.403252|kSvLj:8.704561,49.403252,8.716,49.434,8.7039,49.423,8.732,49.400162,8.704561,49.403252|nVGi:8.704561,49.403252,8.700429,49.402,8.7364,49.420,8.7045,49.412,8.704561,49.403252")
				.queryParam("timeout", "78")
				.queryParam("groupByKeys", "bicycle,addr:street")
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
	public void test_1hrrlb9duat0l_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or geometry:line")
				.queryParam("bboxes", "N:8.66520,49.411,8.749,49.3906")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-11-11")
				.queryParam("bpolys", "CG:8.704561,49.403252,8.743,49.42499,8.704555,49.439,8.72422,49.415,8.704561,49.403252|kY:8.704561,49.403252,8.749,49.430,8.703607,49.414,8.708,49.4045,8.704561,49.403252|zWOBW:8.704561,49.403252,8.708711,49.412362,8.745474,49.425325,8.700,49.4210,8.704561,49.403252")
				.queryParam("timeout", "95")
				.queryParam("groupByKeys", "turn,addr:postcode")
				.queryParam("bcircles", "IhVN:8.709,49.414,29")
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
	public void test_t84484jyriuq_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687,49.428,8.744427,49.396")
				.queryParam("values", "track")
				.queryParam("bpolys", "8.704561,49.403252,8.726,49.426,8.71739,49.4226,8.701,49.401,8.704561,49.403252|8.704561,49.403252,8.706341,49.403,8.7197,49.43256,8.70148,49.418,8.704561,49.403252")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "r:8.7241,49.419,6")
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
	public void test_t4q78f9h14ki_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2011-07-09")
				.queryParam("timeout", "56")
				.queryParam("groupByKeys", "highway,foot")
				.queryParam("bcircles", "8.747,49.412388,40|8.725,49.4027,8")
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
	public void test_urxhxswdn7ea_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "98")
				.queryParam("groupByKeys", "network,addr:street")
				.queryParam("bcircles", "8.716,49.400,3")
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
	public void test_rhodfocz4tpd_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6791,49.4240,8.759,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("timeout", "65")
				.queryParam("groupByKeys", "building,maxspeed,addr:street")
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
	public void test_vf9r3pi2ppb6_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2014-04-11")
				.queryParam("bpolys", "8.704561,49.403252,8.711,49.4056,8.730421,49.41825,8.70945,49.4354,8.704561,49.403252|8.704561,49.403252,8.738377,49.4365,8.706552,49.4077,8.7020,49.429,8.704561,49.403252")
				.queryParam("bcircles", "Mpx:8.716020,49.415,8|r:8.738,49.416,7|KrKAH:8.712,49.4354,994891197|s:8.706,49.432142,4")
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
	public void test_sknaujuk58hk_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "85")
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
	public void test_1h7z824o3ld14_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue")
				.queryParam("bboxes", "iE:8.697,49.40301,8.7593,49.39641|cK:8.6542,49.41332,8.7416,49.384|sAUIw:8.655960,49.41524,8.722,49.398|PNbtO:8.686,49.413,8.714,49.390379")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-02-04")
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
	public void test_1ibbgunxchnj9_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=*")
				.queryParam("bboxes", "ojUq:8.660,49.4248,8.739694,49.3943|SDAj:8.656,49.4209,8.73179,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
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
	public void test_t4a095a75dus_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-08-06")
				.queryParam("bcircles", "8.71442,49.4255,66|8.705034,49.416552,3|8.705,49.431,31")
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
	public void test_1iaxn7z8ppv75_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "T:8.695,49.4095,8.7277,49.391|SFOEh:8.683,49.411829,8.739,49.391|b:8.681,49.413032,8.713,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("bpolys", "watzs:8.704561,49.403252,8.747,49.41759,8.7064,49.426,8.70449,49.43260,8.704561,49.403252|AHmLP:8.704561,49.403252,8.704,49.424,8.7397,49.431,8.70640,49.4174,8.704561,49.403252|kx:8.704561,49.403252,8.7270,49.41765,8.7186,49.420,8.735,49.411,8.704561,49.403252")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "KWF:8.7081,49.408,67|jh:8.708873,49.41128,1|z:8.732079,49.412706,85")
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
	public void test_1hv2pln9pfi3p_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and not geometry:line")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
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
	public void test_1hbdq0ixetyli_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,primary_link")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "rX:8.704561,49.403252,8.713,49.423,8.719,49.417755,8.7212,49.425,8.704561,49.403252|bAD:8.704561,49.403252,8.743,49.408,8.704560,49.434,8.71991,49.4395,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_u82czokys0tw_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LcYty:8.686,49.4298,8.74571,49.391|oeWVA:8.687,49.426,8.717,49.383|Rl:8.6681,49.4281,8.734,49.3952")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
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
	public void test_trz78b8hngoj_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,platform")
				.queryParam("bboxes", "8.697,49.412,8.730,49.39797|8.655,49.419457,8.74980,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-11-10")
				.queryParam("timeout", "52")
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
	public void test_t87crc2a2zc2_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* or geometry:polygon or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "pt:8.7181,49.415,8|zel:8.7406,49.423057,42")
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
	public void test_1k229idiova06_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "APcdW:8.66195,49.408,8.7476,49.385|PDZuA:8.665,49.410,8.708,49.391|FdoWd:8.661197,49.411,8.7187,49.390|ws:8.662,49.427,8.743,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-25")
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
	public void test_trww7rfnhtno_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* and length:( .. 100)")
				.queryParam("bboxes", "xO:8.680,49.4149,8.728,49.389")
				.queryParam("timeout", "78")
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
	public void test_1iv9c3i67tlbr_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=*")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "Y:8.740399,49.420,9|T:8.743854,49.407,327|rc:8.7164,49.410,8|NQ:8.7133,49.404347,41")
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
	public void test_1jeqhtmb5khgm_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and geometry:polygon or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "Qh:8.704561,49.403252,8.743,49.408,8.73298,49.424,8.705,49.401112,8.704561,49.403252|Fsafr:8.704561,49.403252,8.746,49.4380,8.734499,49.405,8.7047,49.415,8.704561,49.403252")
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
	public void test_1iv4a36rco7jq_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "dXuG:8.67805,49.427,8.756,49.389|kv:8.670,49.418,8.750,49.386|wFjOb:8.688,49.422,8.715741,49.389|sLFVU:8.696932,49.404,8.747,49.3883")
				.queryParam("time", "2017-05-05")
				.queryParam("bpolys", "e:8.704561,49.403252,8.734892,49.4348,8.702,49.434,8.709,49.414,8.704561,49.403252|m:8.704561,49.403252,8.719,49.4192,8.713,49.410,8.700,49.412,8.704561,49.403252|x:8.704561,49.403252,8.736,49.41492,8.7044,49.425,8.725,49.423,8.704561,49.403252")
				.queryParam("bcircles", "NKVTx:8.703,49.428,29|fd:8.708223,49.411,1")
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
	public void test_t4caht4qedet_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.659,49.4111,8.726,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
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
	public void test_1jeoab6l9kzzk_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-03-27")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.406,8.71161,49.432521,8.70006,49.42780,8.704561,49.403252|8.704561,49.403252,8.72311,49.411,8.7193,49.4347,8.725,49.4054,8.704561,49.403252|8.704561,49.403252,8.742,49.433,8.741,49.4363,8.700,49.422878,8.704561,49.403252")
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
	public void test_t87dj8cod5bt_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "Ffb:8.73373,49.401,8")
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
	public void test_skkid2n93fj7_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("time", "2016-10-14")
				.queryParam("bcircles", "H:8.702,49.422,7")
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
	public void test_1iuys0om7h4qf_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("filter2", "addr:street=* or length:( .. 100)")
				.queryParam("timeout", "94")
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
	public void test_1iuvgty1cgm03_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "PXzCc:8.682326,49.421,8.720,49.3871")
				.queryParam("types2", "node,way,relation")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "addr:postcode!=* and length:( .. 100)")
				.queryParam("time", "2007-11-04")
				.queryParam("keys2", "highway")
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
	public void test_qe3sj2ulusf5_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,relation")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref=* or not id:(1 .. 9999)")
				.queryParam("time", "2014-10-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"LNmQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743,49.4128],[8.704,49.40255],[8.726,49.4211],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ir\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743,49.414],[8.727,49.4152],[8.7012,49.4302],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_u7zlzvcca8u1_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:point")
				.queryParam("time", "2012-05-04")
				.queryParam("bpolys", "aY:8.704561,49.403252,8.714,49.4095,8.704,49.428844,8.7139,49.403,8.704561,49.403252|ad:8.704561,49.403252,8.729,49.4320,8.730,49.409,8.716,49.42416,8.704561,49.403252")
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
	public void test_tol8ojf3uh5x_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-04-22")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "M:8.748710,49.409,631029582")
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
	public void test_trrd20wmy8u0_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:forward!=* or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("filter2", "addr:street!=* or not type:node")
				.queryParam("time", "2018-03-07")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "94")
				.queryParam("values2", "traffic_mirror")
				.queryParam("bcircles", "ojQKv:8.703387,49.419,7")
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
	public void test_1hrggnc5w0j8l_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "VU:8.697742,49.402,8.72613,49.39806|Rbada:8.677,49.425,8.7543,49.3860")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("filter2", "maxspeed=* and geometry:line and not length:( .. 100)")
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
	public void test_qhib9lnjckm9_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("format", "json")
				.queryParam("filter2", "foot!=* and type:relation or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_mirror")
				.queryParam("bcircles", "8.711430,49.403,1")
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
	public void test_urgsybaiwqqp_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "P:8.667,49.422,8.74643,49.3858")
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "service=driveway and type:node or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "57")
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
	public void test_qxzdjd4s6jc3_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* or type:node and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("filter2", "sidewalk=*")
				.queryParam("bpolys", "ik:8.704561,49.403252,8.7368,49.431,8.720705,49.429902,8.704778,49.4219,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "47")
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
	public void test_t89oh45n49br_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "A:8.679,49.41550,8.727,49.385")
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "name=* and not area:(1.0 .. 1E6)")
				.queryParam("values2", "speed_camera")
				.queryParam("bcircles", "YPkES:8.731,49.439,5")
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
	public void test_tofo1ditzntu_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("filter2", "building=* or type:relation or not length:( .. 100)")
				.queryParam("bpolys", "V:8.704561,49.403252,8.7122,49.401,8.704555,49.43612,8.704,49.412,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_1hbd8v8373q04_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not geometry:point or id:(1 .. 9999)")
				.queryParam("filter2", "smoothness!=* and geometry:polygon or not length:( .. 100)")
				.queryParam("bpolys", "Jpt:8.704561,49.403252,8.7411,49.413,8.738231,49.4039,8.70371,49.4060,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "49")
				.queryParam("values2", "give_way")
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
	public void test_trrbf9qc9dfc_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UL:8.675,49.4182,8.74110,49.394|CpPv:8.6894,49.417,8.733,49.3998|xHy:8.6552,49.4165,8.731,49.394")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("values", "secondary_link")
				.queryParam("filter2", "landuse!=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("timeout", "99")
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
	public void test_ubp5vpirwtv8_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("time", "2017-02-10")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
				.queryParam("bcircles", "8.74203,49.432,59|8.731349,49.438,14")
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
	public void test_1ib0fb7ifikvr_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "W:8.67667,49.406,8.7588,49.38955")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2007-11-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7189,49.434],[8.736,49.411],[8.718,49.414151],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "97")
				.queryParam("values2", "primary_link")
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
	public void test_1hv2qg0cty434_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "csv")
				.queryParam("time", "2014-09-02")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "8.732,49.425,9")
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
	public void test_skk01gmm71wj_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "jhypS:8.682,49.4145,8.701576,49.3968|xBHo:8.683,49.427,8.705,49.389|g:8.676,49.424,8.750842,49.399|DAzMr:8.6500,49.4121,8.723,49.38601")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "bicycle!=* and area:(1.0 .. 1E6)")
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
	public void test_r1lot5nfar05_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "O:8.660,49.42192,8.7349,49.391")
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("filter2", "addr:postcode!=* and not geometry:line")
				.queryParam("time", "2016-11-26")
				.queryParam("timeout", "79")
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
	public void test_skkj2a9quuk5_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.4289],[8.727,49.4089],[8.7074,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"HmKhD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736240,49.437],[8.716,49.431456],[8.7081,49.417],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.428610],[8.707943,49.410],[8.7096,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "20")
				.queryParam("values2", "bus_stop")
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
	public void test_vbhf1rpyjq5t_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=*")
				.queryParam("bboxes", "8.679,49.407,8.732,49.392")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "62")
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
	public void test_1hbghsb5vp1ep_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1M4D")
				.queryParam("bcircles", "8.702,49.421,7|8.709,49.406798,7")
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
	public void test_tog53zb5imnm_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "KP:8.6670,49.404,8.7521,49.3831")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_1h7incvc3kn5g_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:way or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.4350],[8.7202,49.4266],[8.739,49.4055],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.425025],[8.705,49.426708],[8.733,49.437595],[8.704561,49.403252]]]}}]}")
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
	public void test_1k254h10ieu05_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HSlO:8.656002,49.40050,8.73795,49.394")
				.queryParam("format", "json")
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
	public void test_toiywxl3rtbl_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.68932,49.419,8.74874,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.417,8.747,49.412,8.704,49.408,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_1iauuzf9m75ur_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y8M16D")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "mIQC:8.73274,49.429,1|ZMX:8.715,49.418948,50")
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
	public void test_1jekz49qtoxtj_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("bpolys", "XucgG:8.704561,49.403252,8.723,49.426,8.702,49.426229,8.7041,49.405,8.704561,49.403252|YhuoZ:8.704561,49.403252,8.719,49.4292,8.700,49.4386,8.71194,49.433,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_qe13hmnaamgj_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "xQPKX:8.704561,49.403252,8.723,49.43019,8.704,49.404,8.738,49.425,8.704561,49.403252")
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
	public void test_1jewkxa7qojtt_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "O:8.6502,49.400,8.70143,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y17D")
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
	public void test_vb43ce1tu4a8_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "//P2Y2M8D")
				.queryParam("timeout", "90")
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
	public void test_1hbfyardid55u_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and type:relation and length:( .. 100)")
				.queryParam("time", "//P20D")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "vMYxU:8.741,49.4318,76|T:8.713,49.404,6|n:8.7103,49.434,3|vB:8.711,49.432,921")
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
	public void test_qdvjjg48i1pt_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P10M15D")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.737342,49.40061,6|8.7168,49.401576,3")
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
	public void test_urmdzmoxcl6d_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=* or type:node and not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "//P7M8D")
				.queryParam("bpolys", "r:8.704561,49.403252,8.7142,49.408,8.749,49.400,8.721910,49.406,8.704561,49.403252|T:8.704561,49.403252,8.72809,49.412,8.7138,49.4017,8.70084,49.4260,8.704561,49.403252|HvuXx:8.704561,49.403252,8.7073,49.420695,8.716684,49.412,8.706259,49.425,8.704561,49.403252")
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
	public void test_qe12poq8oz8j_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.691342,49.418,8.7192,49.38355|8.6557,49.408,8.742,49.3833")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "100")
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
	public void test_urhbnuhc2zqe_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* or not length:( .. 100)")
				.queryParam("bboxes", "JZAGY:8.666,49.4150,8.704,49.398")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y5M1D")
				.queryParam("bpolys", "NX:8.704561,49.403252,8.737377,49.421,8.701969,49.421044,8.7023,49.42795,8.704561,49.403252")
				.queryParam("timeout", "23")
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
	public void test_qecoz2uulohj_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bpolys", "8.704561,49.403252,8.709,49.43700,8.704,49.427,8.71172,49.438388,8.704561,49.403252|8.704561,49.403252,8.7403,49.4293,8.743,49.424,8.735,49.418,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_1iextrjfdc5yx_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or type:relation and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y26D")
				.queryParam("bcircles", "QESRG:8.745,49.4285,572290270|b:8.733,49.4009,6")
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
	public void test_u85nuyrj4nqp_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("bcircles", "SF:8.703,49.4233,9|jXR:8.704,49.4312,6|FIoO:8.709,49.417,2")
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
	public void test_1hvbjme48k95y_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:line or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"e\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729208,49.420],[8.715,49.426],[8.7274,49.410],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UGugh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4277],[8.73940,49.437],[8.7011,49.4185],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "65")
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
	public void test_sl8z3ppqx1kp_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "S:8.6880,49.422,8.723,49.3946")
				.queryParam("values", "tertiary")
				.queryParam("time", "//P3M22D")
				.queryParam("bpolys", "G:8.704561,49.403252,8.705,49.405,8.730,49.412,8.7007,49.4229,8.704561,49.403252")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "8.746,49.432438,498|8.7433,49.416,3")
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
	public void test_1ib5zncszvyw2_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=*")
				.queryParam("bboxes", "Cv:8.693,49.406,8.7004,49.394135|N:8.6692,49.4262,8.752,49.399|bA:8.666,49.401,8.70976,49.381|P:8.696,49.4242,8.745,49.38822")
				.queryParam("time", "//P3Y4D")
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
	public void test_ubj40g7xfeba_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2M12D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wJp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.422],[8.704,49.432104],[8.707,49.419],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71093,49.4026],[8.717187,49.405],[8.717,49.429],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ljKZY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.408739],[8.710,49.4074],[8.7144,49.422],[8.704561,49.403252]]]}}]}")
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
	public void test_qhvn1ulf0isx_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "//P7M22D")
				.queryParam("bpolys", "T:8.704561,49.403252,8.703,49.405,8.704,49.42578,8.704721,49.439,8.704561,49.403252")
				.queryParam("timeout", "41")
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
	public void test_t4flobv523p1_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bpolys", "rn:8.704561,49.403252,8.738560,49.4324,8.700,49.4189,8.730,49.431,8.704561,49.403252|t:8.704561,49.403252,8.708511,49.438,8.703957,49.433,8.7097,49.431,8.704561,49.403252|sf:8.704561,49.403252,8.7008,49.4325,8.734547,49.414,8.71971,49.41964,8.704561,49.403252")
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
	public void test_1ibhl1yf1ri9k_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes=* or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "O:8.704561,49.403252,8.7204,49.433,8.7038,49.4345,8.7251,49.418,8.704561,49.403252")
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
	public void test_1k1r8cxvf9n3t_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69973,49.41410,8.750,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y3D")
				.queryParam("timeout", "67")
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
	public void test_1ib36rysp5en8_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P11M22D")
				.queryParam("bpolys", "C:8.704561,49.403252,8.702,49.426728,8.7069,49.42239,8.70612,49.430,8.704561,49.403252")
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
	public void test_s0xrrygxzu5i_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("time", "//P8M2D")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "pP:8.709,49.400,90")
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
	public void test_1k1wsd5qtw7jl_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "//P3M27D")
				.queryParam("bcircles", "mL:8.738,49.432,275")
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
	public void test_rhjdfqo4tooi_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y7D")
				.queryParam("bpolys", "sDJS:8.704561,49.403252,8.7195,49.403181,8.718126,49.418,8.7130,49.412,8.704561,49.403252|ZDu:8.704561,49.403252,8.7178,49.410,8.722,49.405,8.7008,49.432,8.704561,49.403252")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "YcpPQ:8.734684,49.416,307336142|h:8.719,49.432,84")
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
	public void test_rlan86zx6t0h_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("bpolys", "8.704561,49.403252,8.7325,49.403,8.74794,49.401723,8.7090,49.422167,8.704561,49.403252|8.704561,49.403252,8.736,49.4029,8.707,49.439997,8.735,49.4247,8.704561,49.403252|8.704561,49.403252,8.729,49.402,8.7021,49.4230,8.70597,49.415,8.704561,49.403252")
				.queryParam("bcircles", "8.745,49.409,5")
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
	public void test_rhm4czi8vsrp_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("bpolys", "JI:8.704561,49.403252,8.7485,49.419,8.7168,49.413464,8.73114,49.4085,8.704561,49.403252|yDQa:8.704561,49.403252,8.7096,49.4045,8.730,49.4159,8.704,49.400,8.704561,49.403252|MMkbM:8.704561,49.403252,8.702804,49.41591,8.7005,49.426,8.724793,49.409408,8.704561,49.403252")
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
	public void test_s1dxqm0bdhet_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified,yes")
				.queryParam("filter", "ref=* and not length:( .. 100)")
				.queryParam("bboxes", "8.673,49.4272,8.73875,49.38370")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
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
	public void test_1jyjbtjbui2pl_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"oM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7017,49.413],[8.704494,49.43929],[8.719607,49.433],[8.704561,49.403252]]]}}]}")
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
	public void test_urhat9kcuy40_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.699,49.400,8.7046,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("time", "//P7M6D")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "8.748,49.4040,5")
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
	public void test_soempz216ud3_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.686,49.4009,8.727,49.3846")
				.queryParam("keys", "highway")
				.queryParam("time", "//P1M9D")
				.queryParam("timeout", "70")
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
	public void test_vf6xdrqdaptk_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,elevator")
				.queryParam("bboxes", "O:8.676,49.40991,8.718,49.3913")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_u7u2rfrpwzlh_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"j\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.417],[8.705,49.413],[8.700,49.4366],[8.704561,49.403252]]]}}]}")
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
	public void test_1iv9uqgn4ojll_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and type:relation")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P8M5D")
				.queryParam("bcircles", "8.709,49.419,73|8.7301,49.4051,2")
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
	public void test_1hrj7yo3fnx9u_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "//P3Y1D")
				.queryParam("bpolys", "GxTBT:8.704561,49.403252,8.741,49.437,8.70451,49.423,8.713,49.425133,8.704561,49.403252")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "8.744,49.430,222|8.7435,49.405,7")
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
	public void test_1hvbjp0tef48l_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y20D")
				.queryParam("bcircles", "8.703,49.438,2")
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
	public void test_1hbd9n8d5db1w_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.4104,8.729,49.436,8.732057,49.406,8.704561,49.403252")
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
	public void test_tog5i89iwgmt_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:polygon or length:( .. 100)")
				.queryParam("bboxes", "mh:8.677,49.42063,8.70199,49.3939")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1M23D")
				.queryParam("timeout", "24")
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
	public void test_vb9kxztbbvp5_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "yUdqe:8.665,49.4214,8.755,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P2M2D")
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
	public void test_vf9qpo0aihbq_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "8.6823,49.40068,8.7278,49.385")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y2M3D")
				.queryParam("bpolys", "8.704561,49.403252,8.710791,49.41294,8.729314,49.4197,8.739,49.426,8.704561,49.403252|8.704561,49.403252,8.749949,49.417,8.718,49.403,8.740,49.421,8.704561,49.403252|8.704561,49.403252,8.7260,49.426,8.703,49.41097,8.726,49.438,8.704561,49.403252")
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
	public void test_qhvm9gjojhpg_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.7216,49.41312,8.704444,49.424,8.703,49.4122,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_r1fls2sy3uxw_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and geometry:line and id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y3M7D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.416],[8.7033,49.43986],[8.74371,49.408877],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"pyF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.429],[8.708,49.406],[8.700157,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"FCG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7020,49.416],[8.7383,49.4251],[8.722216,49.420],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "30")
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
	public void test_1jyd8bu90xgzb_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and id:(1 .. 9999)")
				.queryParam("bboxes", "E:8.6591,49.424,8.73614,49.391")
				.queryParam("timeout", "22")
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
	public void test_1jig2346pgcit_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.70115,49.400,9")
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
	public void test_t4q6uqbygd9s_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P14D")
				.queryParam("bpolys", "NVHtj:8.704561,49.403252,8.714,49.41196,8.7342,49.420554,8.709,49.4300,8.704561,49.403252|Hgxjx:8.704561,49.403252,8.748,49.419,8.735,49.407,8.7032,49.4046,8.704561,49.403252|qGcjX:8.704561,49.403252,8.707,49.421,8.704369,49.404,8.721791,49.432186,8.704561,49.403252")
				.queryParam("bcircles", "8.741,49.434,9")
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
	public void test_ts1w9rq2ocvr_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "n:8.704561,49.403252,8.7025,49.4119,8.7048,49.426585,8.705,49.432,8.704561,49.403252|drQ:8.704561,49.403252,8.70331,49.4145,8.703,49.421,8.73551,49.434,8.704561,49.403252")
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
	public void test_qhqmze5zd5ye_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
				.queryParam("time", "//P3M9D")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "8.729,49.409392,93")
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
	public void test_u855uvge10dt_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6519,49.424,8.75025,49.3943|8.68441,49.422,8.707,49.393|8.675,49.4241,8.731,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y2M7D")
				.queryParam("timeout", "93")
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
	public void test_1h7ts0mzrn2gi_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "//P3Y5M1D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"kI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7286,49.402],[8.737,49.413],[8.740662,49.411617],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_1hrs1ojxv26us_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "27")
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
	public void test_t49h3c4vez3l_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("format", "json")
				.queryParam("time", "//P7M2D")
				.queryParam("bpolys", "btcpt:8.704561,49.403252,8.7038,49.416,8.700,49.4065,8.708,49.400,8.704561,49.403252|uZ:8.704561,49.403252,8.749,49.4159,8.736,49.434,8.703,49.40746,8.704561,49.403252|XW:8.704561,49.403252,8.74091,49.4130,8.727,49.409,8.7009,49.42682,8.704561,49.403252")
				.queryParam("timeout", "91")
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
	public void test_1h820ma7xw2lv_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "VM:8.70877,49.400857,514")
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
	public void test_1jig39fr9tk6c_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hAApx:8.662,49.424,8.7206,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1D")
				.queryParam("timeout", "66")
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
	public void test_qxg0o8ugkiua_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P1Y2M3D")
				.queryParam("bcircles", "KBkas:8.743,49.4091,8")
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
	public void test_vbpp7hqei6p2_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "lID:8.6573,49.423,8.703,49.3889|Pg:8.68816,49.409,8.708,49.398")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P9M28D")
				.queryParam("groupByKeys", "lanes:forward,surface,maxspeed")
				.queryParam("bcircles", "WipFY:8.712,49.4257,703|PMK:8.712,49.435,7|k:8.749,49.436,1|guCDv:8.7003,49.423612,4")
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
	public void test_ublu5qf8809v_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Q:8.6516,49.409,8.757,49.3984|s:8.659,49.418,8.70718,49.386|kZalr:8.67395,49.417,8.70153,49.397")
				.queryParam("format", "json")
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
	public void test_1jy7r6sf55vzt_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.722312,49.421,8.70441,49.430,8.704,49.426,8.704561,49.403252|8.704561,49.403252,8.732,49.434,8.7006,49.403,8.70459,49.40164,8.704561,49.403252|8.704561,49.403252,8.72657,49.420,8.71799,49.435,8.730,49.4342,8.704561,49.403252")
				.queryParam("timeout", "26")
				.queryParam("groupByKeys", "highway,lit")
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
	public void test_qy258kncj7sl_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("groupByKeys", "tracktype,lanes,maxspeed")
				.queryParam("bcircles", "U:8.729,49.42444,2|Qt:8.7421,49.4277,141")
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
	public void test_1ji1okwvlcu2a_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y4D")
				.queryParam("groupByKeys", "landuse,smoothness")
				.queryParam("bcircles", "r:8.737,49.425,4")
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
	public void test_urp6jwvugq45_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not id:(1 .. 9999)")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("time", "//P1M26D")
				.queryParam("timeout", "68")
				.queryParam("groupByKeys", "building,barrier")
				.queryParam("bcircles", "h:8.732,49.430814,9")
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
	public void test_1jyjaz87z7os5_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.7385,49.407,4")
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
	public void test_vb95aao7mw4x_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "//P1Y2M2D")
				.queryParam("groupByKeys", "surface,lanes")
				.queryParam("bcircles", "lfB:8.704,49.410,27")
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
	public void test_1iaxoe47bpc1g_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Xbqy:8.6672,49.4015,8.716,49.384061|UZ:8.675,49.4265,8.75908,49.398|EgFIh:8.679081,49.40832,8.7025,49.3927")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("timeout", "83")
				.queryParam("groupByKeys", "surface,network")
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
	public void test_s1bmpubeilpf_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and type:node")
				.queryParam("time", "//P1Y10D")
				.queryParam("timeout", "43")
				.queryParam("groupByKeys", "addr:street,name,maxspeed")
				.queryParam("bcircles", "Z:8.707,49.403,10|r:8.710744,49.401,3")
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
	public void test_t4hssx3gabe8_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,traffic_signals,stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y11M28D")
				.queryParam("timeout", "66")
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
	public void test_qxzdggkf46ea_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"J\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.4194],[8.743,49.434],[8.700,49.43288],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "86")
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
	public void test_toixqrwp2sdv_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "u:8.69819,49.415,8.756892,49.3827|YI:8.653893,49.41645,8.7383,49.394|hLD:8.697715,49.423511,8.74758,49.399|Ihj:8.6658,49.4120,8.7559,49.3922")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("timeout", "73")
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
	public void test_r1g3s44qibtu_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "kV:8.694607,49.415,8.739,49.391")
				.queryParam("groupByKey", "building")
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
	public void test_1ievi1fskye76_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "XAl:8.6593,49.413,8.747,49.3995")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
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
	public void test_s4mtt4nycbas_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("bboxes", "8.659,49.4249,8.744008,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3M11D")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "opl:8.710,49.43546,2|sjz:8.7112,49.429,522")
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
	public void test_1k1ziwn26ow8k_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:way or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "66")
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
	public void test_qhncvsc4t2e9_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,stop")
				.queryParam("filter", "foot!=* and type:way or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "i:8.7374,49.402,4|hl:8.7350,49.402415,3|a:8.745,49.42310,8|FEuc:8.70142,49.4146,2")
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
	public void test_1ib5zbml7ttmh_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* and length:( .. 100)")
				.queryParam("bboxes", "8.6624,49.4224,8.734,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3M21D")
				.queryParam("timeout", "47")
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
	public void test_1hrub2d9nlzci_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.686,49.4112,8.728,49.395|8.6740,49.4033,8.705521,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2M13D")
				.queryParam("timeout", "54")
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
	public void test_s15kuo71xu0h_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* or not type:node and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2M20D")
				.queryParam("bpolys", "F:8.704561,49.403252,8.710971,49.43983,8.7364,49.409,8.748748,49.4374,8.704561,49.403252")
				.queryParam("bcircles", "8.722,49.42754,1")
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
	public void test_t4hsherr14j7_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "8.709647,49.437,5")
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
	public void test_1iepi4ji21z6p_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y2M9D")
				.queryParam("bcircles", "yjWJL:8.730,49.438,5|AOuH:8.7349,49.412,96|d:8.7170,49.429167,788886655|Knvya:8.7044,49.425,497578188")
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
	public void test_1hbfxww78vvi0_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "sT:8.6935,49.42825,8.707,49.39518")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_s0xtc2j9wx85_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Um:8.6508,49.418,8.72749,49.394|eHHHB:8.657,49.425,8.7098,49.39689")
				.queryParam("time", "//P11M3D")
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
	public void test_sl3gce374h9i_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "U:8.687,49.418,8.725,49.383")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P20D")
				.queryParam("bpolys", "yd:8.704561,49.403252,8.710,49.4124,8.7042,49.407,8.715,49.405,8.704561,49.403252|TSNqY:8.704561,49.403252,8.738827,49.411138,8.747,49.438182,8.7149,49.410,8.704561,49.403252|iJAUF:8.704561,49.403252,8.738,49.43052,8.7046,49.4032,8.707,49.41075,8.704561,49.403252")
				.queryParam("timeout", "23")
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

	@Test
	public void test_qhkjy5eypch1_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* or type:way and not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "mOscC:8.704989,49.434892,2|R:8.741,49.4142,1|FW:8.7199,49.404,6")
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

	@Test
	public void test_1jenqw3jca8gz_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.661,49.41768,8.74305,49.397|8.650,49.4286,8.7539,49.395|8.6780,49.400160,8.714,49.395")
				.queryParam("format", "csv")
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

	@Test
	public void test_qy1m56a1vneg_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bpolys", "Gcc:8.704561,49.403252,8.728,49.418,8.715,49.423,8.70580,49.411,8.704561,49.403252|QStF:8.704561,49.403252,8.735,49.423,8.715,49.404,8.748,49.41151,8.704561,49.403252")
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

	@Test
	public void test_s1h5t3p1fmev_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "M:8.7054,49.4380,9|rYgga:8.724069,49.4388,25")
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
