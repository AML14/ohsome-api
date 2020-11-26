package restest_1h;

import org.evomaster.client.java.controller.SutHandler;
import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OhsomeTest_qy26v7gjl279 {


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
	public void test_qxqlga20zsdf_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "polygon,other")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-09-03")
				.queryParam("bpolys", "p:8.704561,49.403252,8.717,49.424,8.704,49.416,8.744653,49.406700,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_s15ke69ou6nl_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "node,way,relation")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.714,49.424,41|8.717,49.424417,5|8.72302,49.4216,36|8.714099,49.436399,65")
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
	public void test_vbele752gl68_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.695104,49.413,8.70382,49.383")
				.queryParam("time", "2016-07-17")
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
	public void test_sksugitpdqhy_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "polygon,")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "B:8.704561,49.403252,8.73434,49.411,8.730,49.426,8.704,49.400,8.704561,49.403252|VMKsW:8.704561,49.403252,8.707,49.4224,8.704312,49.416,8.707,49.4242,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_1jew1cwk49oad_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-06-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.4311],[8.7477,49.413],[8.704,49.425],[8.704561,49.403252]]]}}]}")
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
	public void test_s50nfzo5ujc1_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or type:relation and not area:(1.0 .. 1E6)")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-12-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Dcw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7055,49.417],[8.70073,49.414],[8.70484,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Kn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7479,49.423],[8.704109,49.4035],[8.713912,49.413100],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "kTFV:8.7229,49.4123,95")
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
	public void test_rlaos1jwtaar_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "SvJx:8.659,49.4282,8.75112,49.397")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_t4fkikq2f2nt_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-04-23")
				.queryParam("bcircles", "RHhOh:8.700,49.410511,1")
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
	public void test_tofpj6qnb6et_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("bcircles", "e:8.720,49.4170,1|f:8.715,49.438,5|X:8.739,49.432,1|uoVK:8.703,49.4031,9")
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
	public void test_tonykwsy42t5_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* or type:relation")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-08-09")
				.queryParam("timeout", "58")
				.queryParam("bcircles", "OQ:8.713,49.40590,2|OEMX:8.74108,49.438612,2|ZOUa:8.734,49.416,9|D:8.7080,49.430,3")
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
	public void test_1ji9zwrwj2xiq_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=* or id:(1 .. 9999)")
				.queryParam("bboxes", "BL:8.67662,49.4142,8.723502,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "dx:8.704561,49.403252,8.715,49.420,8.702,49.438,8.726,49.417,8.704561,49.403252|LJuzH:8.704561,49.403252,8.720003,49.4289,8.728348,49.408195,8.703,49.43702,8.704561,49.403252|C:8.704561,49.403252,8.722,49.429,8.743084,49.426,8.739,49.40465,8.704561,49.403252")
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
	public void test_t4a1t65nv1o1_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-08-24")
				.queryParam("bcircles", "mRDjD:8.741,49.439,3|ZUJDU:8.704741,49.408,8")
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
	public void test_t4f1sxkdbfxe_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2013-07-10")
				.queryParam("bpolys", "8.704561,49.403252,8.713,49.436,8.7189,49.421,8.736,49.4155,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_s4xg2jmuf3hd_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "kHsNR:8.69882,49.425255,8.710,49.3857")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-05-23")
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
	public void test_s0v02l066r7c_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or not geometry:line and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("bpolys", "PKWVE:8.704561,49.403252,8.74315,49.4023,8.732,49.403,8.738,49.40354,8.704561,49.403252")
				.queryParam("timeout", "35")
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
	public void test_1h7j5ai8i2z3q_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* and geometry:point")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-12-29")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "8.713,49.406457,2")
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
	public void test_1iepg68fvtmxx_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "rD:8.704561,49.403252,8.713,49.414,8.715,49.41340,8.71291,49.435068,8.704561,49.403252")
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
	public void test_1jelhcz6ljvw2_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and not geometry:polygon or id:(1 .. 9999)")
				.queryParam("bboxes", "8.652,49.404,8.749,49.385|8.669,49.427726,8.739,49.3896")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "93")
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
	public void test_qxyud8h731gx_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-02-19")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.420,8.706,49.409,8.7110,49.439,8.704561,49.403252|8.704561,49.403252,8.744,49.431,8.708,49.4147,8.7281,49.418,8.704561,49.403252|8.704561,49.403252,8.732,49.403,8.7080,49.41849,8.707,49.415334,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_uve667gnn8s7_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "V:8.704561,49.403252,8.7185,49.438,8.7426,49.406,8.7049,49.4074,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_u8dithlybbjs_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ILan:8.655,49.411,8.7506,49.391|D:8.667,49.413281,8.71939,49.382|WJd:8.69662,49.426,8.740,49.39687")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "ll:8.704561,49.403252,8.7110,49.403902,8.70581,49.426154,8.728,49.4304,8.704561,49.403252")
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
	public void test_urmeu9mf0v8x_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "w:8.704561,49.403252,8.7049,49.415,8.70443,49.4134,8.717,49.423293,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_1hr8nnccx0e9g_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6911,49.42163,8.750,49.3985")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-04-02")
				.queryParam("timeout", "93")
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
	public void test_1jeff6ix0ohnm_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street!=* or not length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "rZ:8.734,49.426,27|H:8.7421,49.408833,3")
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
	public void test_trz6uagsaeye_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.674,49.41965,8.7353,49.3802|8.699,49.4253,8.70682,49.396")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "35")
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
	public void test_ts57gjxh4h81_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* and type:way or id:(1 .. 9999)")
				.queryParam("bboxes", "8.659,49.415,8.734920,49.3985|8.68854,49.4209,8.7317,49.382")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("time", "2017-06-01")
				.queryParam("timeout", "59")
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
	public void test_urupba4a9tf7_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "H:8.678,49.423,8.7458,49.385|MW:8.685,49.4090,8.744,49.394")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2007-11-23")
				.queryParam("timeout", "20")
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
	public void test_urxhhbca92yb_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and type:node")
				.queryParam("bboxes", "8.6669,49.4097,8.7486,49.38192|8.651,49.4141,8.7111,49.38637|8.686,49.410819,8.704711,49.397")
				.queryParam("time", "2015-05-29")
				.queryParam("timeout", "73")
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
	public void test_qhw4kwnty15y_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or not type:way and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "F:8.698,49.428,8.70268,49.3926")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-07-23")
				.queryParam("timeout", "23")
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
	public void test_1hravgz9f8f92_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.729951,49.417865,8.742,49.41802,8.704,49.417058,8.704561,49.403252|8.704561,49.403252,8.715,49.4142,8.7112,49.434,8.735,49.40331,8.704561,49.403252|8.704561,49.403252,8.71191,49.42163,8.704,49.407,8.710,49.420180,8.704561,49.403252")
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
	public void test_1hrjqa853d2k6_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "epi:8.668520,49.416105,8.7235,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("bcircles", "8.710,49.428700,24439943995")
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
	public void test_t4htyu6fx2d5_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "H:8.704561,49.403252,8.749,49.402,8.705,49.4197,8.705,49.4120,8.704561,49.403252|uoho:8.704561,49.403252,8.718,49.4221,8.727,49.409,8.7278,49.429,8.704561,49.403252|FI:8.704561,49.403252,8.72347,49.4125,8.7389,49.432,8.704561,49.4026,8.704561,49.403252")
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
	public void test_urmeryrwe63l_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-07-27")
				.queryParam("bcircles", "J:8.72488,49.434724,39|MO:8.7495,49.43494,4")
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
	public void test_1iaxnjh99xowz_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,church")
				.queryParam("bboxes", "EBL:8.674,49.402,8.7151,49.393|t:8.682,49.42665,8.755,49.390|coQ:8.67360,49.416,8.74988,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("timeout", "31")
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
	public void test_t81d5ol0tr8y_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or type:node or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "mC:8.704561,49.403252,8.730,49.426,8.725,49.4162,8.7244,49.425,8.704561,49.403252|r:8.704561,49.403252,8.7044,49.408,8.7049,49.4136,8.74654,49.422972,8.704561,49.403252|j:8.704561,49.403252,8.712,49.4202,8.732,49.434,8.705,49.427,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_qy4hhwf01vsn_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* or type:relation")
				.queryParam("bboxes", "8.695,49.418694,8.749,49.383|8.655129,49.403568,8.7201,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-01-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"j\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.418],[8.710,49.402064],[8.71715,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"RnvCU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7332,49.433],[8.701,49.439],[8.719039,49.4349],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "8.71888,49.4344,1")
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
	public void test_1h7o7b1x363w4_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* and not area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "elevator")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-04-15")
				.queryParam("bpolys", "8.704561,49.403252,8.7331,49.412,8.703,49.418,8.707,49.435207,8.704561,49.403252|8.704561,49.403252,8.709225,49.4358,8.701,49.434,8.723,49.415,8.704561,49.403252")
				.queryParam("bcircles", "VwvXf:8.713,49.432577,6")
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
	public void test_qeco72kny15v_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,footway")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-07-11")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JGMA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.4059],[8.70482,49.402],[8.749,49.428],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"TVZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.4135],[8.704540,49.41411],[8.702,49.427],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wCVFo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.404],[8.7020,49.430],[8.728,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "65")
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
	public void test_qdq0uhbkib07_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or not length:( .. 100)")
				.queryParam("bboxes", "8.661,49.401,8.730,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-08-20")
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
	public void test_qdspi88xobw1_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.664,49.417,8.71702,49.3875|8.69709,49.401931,8.706,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2013-03-06")
				.queryParam("timeout", "94")
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
	public void test_1jyjanhyuz03c_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street,track")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "hof:8.732,49.412,6")
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
	public void test_tocvf0nvo6lg_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or id:(1 .. 9999)")
				.queryParam("groupByValues", "bus_stop,service,demolished")
				.queryParam("bboxes", "O:8.6821,49.406,8.715,49.387|q:8.696,49.418,8.73182,49.387|NbnMG:8.651,49.406,8.74045,49.384")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "L:8.704561,49.403252,8.702200,49.43110,8.708,49.40217,8.7285,49.421446,8.704561,49.403252|sf:8.704561,49.403252,8.703,49.408,8.70093,49.4262,8.744,49.4342,8.704561,49.403252")
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
	public void test_rhitvoh5rynl_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-05-11")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "E:8.7009,49.4034,91")
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
	public void test_1jew11jqckg8k_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,secondary,station")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-12-17")
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.433,8.70464,49.406788,8.718,49.426,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_vf96fuh0jhb9_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-02-07")
				.queryParam("bcircles", "t:8.7216,49.41496,8")
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
	public void test_1iv9aus5k1mxy_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,unclassified,primary")
				.queryParam("filter", "maxspeed=* or geometry:line or length:( .. 100)")
				.queryParam("bboxes", "8.699,49.423,8.701225,49.391|8.685,49.428,8.744,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "x:8.704561,49.403252,8.7123,49.409748,8.723,49.418,8.737427,49.4383,8.704561,49.403252|w:8.704561,49.403252,8.73274,49.436,8.735,49.4056,8.704583,49.435,8.704561,49.403252|lRSy:8.704561,49.403252,8.715,49.431943,8.745,49.420741,8.713,49.403,8.704561,49.403252")
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
	public void test_1ibkcg3cto9bn_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service")
				.queryParam("values", "service")
				.queryParam("time", "2010-12-12")
				.queryParam("bpolys", "T:8.704561,49.403252,8.724,49.404,8.734609,49.427,8.70957,49.432,8.704561,49.403252|Eb:8.704561,49.403252,8.739,49.436,8.7086,49.4266,8.722,49.415322,8.704561,49.403252|znhfq:8.704561,49.403252,8.7078,49.409,8.700,49.428401,8.725071,49.432,8.704561,49.403252")
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
	public void test_1jei9oimc690z_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,traffic_mirror")
				.queryParam("bboxes", "FWQ:8.66631,49.42673,8.704371,49.3845")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
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
	public void test_qdt8zo22n1h1_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,public,house")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-03-19")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "c:8.701,49.410,8|MSxMq:8.7147,49.402,6|u:8.704811,49.430816,3|j:8.720486,49.401020,71")
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
	public void test_s13axomdh4dd_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.739,49.430,39381779797|8.740,49.4316,4|8.721,49.434,3")
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
	public void test_uv5tqzr72kvq_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-07-15")
				.queryParam("timeout", "84")
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
	public void test_1ievhneo2fcqa_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "kyem:8.6645,49.40001,8.718,49.385|OWb:8.675,49.403,8.729,49.392|As:8.6724,49.409,8.752,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-12-22")
				.queryParam("timeout", "59")
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
	public void test_1hbaflqlrci1x_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-10-07")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "Csuxu:8.71341,49.406,1|gV:8.748,49.4227,3")
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
	public void test_1hvb07loe46k8_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "pBdyg:8.659783,49.401,8.737,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-10-21")
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
	public void test_1hvbkshfz4z1h_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "tj:8.666,49.40258,8.738,49.3923")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-01-04")
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
	public void test_1iyq13h5xoi0n_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and not id:(1 .. 9999)")
				.queryParam("bboxes", "PSV:8.6691,49.411020,8.718,49.3877")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
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
	public void test_trzmr2qx1bg7_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2016-08-24")
				.queryParam("bcircles", "pA:8.746,49.419,3|BNCkB:8.733,49.4030,2")
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
	public void test_uv945totygkj_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7466,49.4102],[8.71765,49.404],[8.7430,49.428],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"vls\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.4281],[8.7234,49.402],[8.704529,49.4230],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_qxr2xd4rewj4_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "D:8.668,49.4252,8.748,49.3810|Ig:8.650,49.4223,8.729154,49.385|OpY:8.6761,49.4131,8.754,49.391")
				.queryParam("keys", "highway")
				.queryParam("timeout", "63")
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
	public void test_qe1l3fpefak6_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "fmpx:8.704561,49.403252,8.72704,49.404227,8.728437,49.429985,8.73629,49.4085,8.704561,49.403252|l:8.704561,49.403252,8.733,49.4343,8.718,49.423,8.713,49.42549,8.704561,49.403252|h:8.704561,49.403252,8.722172,49.4221,8.71814,49.430874,8.720,49.4239,8.704561,49.403252")
				.queryParam("timeout", "86")
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
	public void test_rkwt7cjs431f_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:node or not area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7119,49.414,8.7335,49.4117,8.7041,49.4264,8.704561,49.403252|8.704561,49.403252,8.705,49.42015,8.72962,49.407,8.730,49.434,8.704561,49.403252|8.704561,49.403252,8.7092,49.432,8.7294,49.419,8.74247,49.411,8.704561,49.403252")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "K:8.709,49.400,4")
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
	public void test_1ji9ztx9tcgu0_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "K:8.65761,49.411,8.7267,49.389|n:8.651,49.425,8.702589,49.382")
				.queryParam("time", "2016-01-08")
				.queryParam("timeout", "85")
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
	public void test_1jyah0eraf41c_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("time", "2013-02-19")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "O:8.729,49.40979,24")
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
	public void test_toa61rxrlj5k_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("time", "2017-02-06")
				.queryParam("bpolys", "bEreg:8.704561,49.403252,8.7145,49.4313,8.707,49.439,8.7408,49.4358,8.704561,49.403252|a:8.704561,49.403252,8.743,49.4105,8.740134,49.432,8.736433,49.425,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_1jifj2ai36khi_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.434,8.728,49.40032,8.7399,49.418754,8.704561,49.403252|8.704561,49.403252,8.7436,49.439,8.714,49.426,8.7143,49.438,8.704561,49.403252|8.704561,49.403252,8.726,49.4252,8.7018,49.4110,8.706,49.408375,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_t841t5b0t6pe_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "T:8.695728,49.423,8.736,49.396|Hx:8.698669,49.4128,8.7161,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-01-27")
				.queryParam("bpolys", "j:8.704561,49.403252,8.702711,49.43810,8.705,49.40397,8.74683,49.414,8.704561,49.403252|QKx:8.704561,49.403252,8.733,49.401,8.702728,49.400,8.704,49.433,8.704561,49.403252")
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
	public void test_rhjdrl7kqt69_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "pr:8.721,49.439,81|xO:8.72126,49.414,5|Fa:8.7224,49.400,4|u:8.7136,49.403,5")
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
	public void test_ubj38dn266uo_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-12-10")
				.queryParam("bpolys", "c:8.704561,49.403252,8.72124,49.40218,8.70455,49.42508,8.7027,49.432,8.704561,49.403252|r:8.704561,49.403252,8.715,49.422,8.746,49.438139,8.7478,49.400,8.704561,49.403252")
				.queryParam("timeout", "37")
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
	public void test_1jent8e75c76p_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "RL:8.691051,49.4150,8.741012,49.382|r:8.650788,49.429,8.755619,49.383|Z:8.6859,49.422,8.707787,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-05-25")
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
	public void test_qxobxfwn2v6p_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6968,49.420,8.7590,49.3828|8.68848,49.413038,8.731,49.395|8.6745,49.42812,8.725410,49.395|8.67894,49.4082,8.723,49.3956")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-10-18")
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
	public void test_1h7j5d2zqil2v_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=*")
				.queryParam("groupByKey", "building")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-09-06")
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
	public void test_rkwt4jvljvax_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* and id:(1 .. 9999)")
				.queryParam("bboxes", "O:8.675,49.4031,8.70238,49.385|GzxfB:8.670,49.4292,8.7480,49.388|Hczd:8.678968,49.429,8.731,49.385")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-09-30")
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
	public void test_sl8ybxcqygrm_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("bcircles", "rlM:8.7200,49.408,83|fS:8.700,49.40834,7")
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
	public void test_us3hv1e0vi3p_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,dormitory")
				.queryParam("filter", "natural=wood or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.679,49.401,8.7593,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
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
	public void test_sohbook6qu5y_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "zXlUT:8.693,49.423,8.758,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-09-22")
				.queryParam("timeout", "33")
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
	public void test_1k1zkgjx39u1w_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,dormitory")
				.queryParam("filter", "smoothness!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Ra:8.669,49.4189,8.75193,49.3893|v:8.668,49.4136,8.7053,49.391|Ox:8.652,49.409,8.721,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-08-04")
				.queryParam("bpolys", "8.704561,49.403252,8.729,49.4214,8.700,49.40954,8.723,49.429,8.704561,49.403252|8.704561,49.403252,8.716,49.415910,8.704560,49.427,8.712017,49.4109,8.704561,49.403252|8.704561,49.403252,8.7492,49.439,8.704,49.401,8.70346,49.4377,8.704561,49.403252")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "B:8.74148,49.412,9|xm:8.7498,49.4198,217|tSE:8.736,49.400,93")
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
	public void test_s163vw0riwyt_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.658,49.415,8.73882,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "v:8.702,49.4010,6|Uer:8.748,49.425,506|XQSR:8.747,49.42729,2")
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
	public void test_rhufrfyxs27s_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "bXRRB:8.7048,49.4262,1")
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
	public void test_1hraxf8eaggh0_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,speed_camera")
				.queryParam("filter", "maxspeed=* and not geometry:line or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-08-17")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "HIBt:8.719,49.419039,4|M:8.71216,49.40358,97")
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
	public void test_uvbws8v2rj8w_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "ho:8.704561,49.403252,8.733,49.403,8.732,49.413911,8.700269,49.432,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_u7oi1r2uzjn8_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or type:relation or length:( .. 100)")
				.queryParam("bboxes", "8.6681,49.400,8.714428,49.380|8.67851,49.41413,8.726,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "barrier,sidewalk")
				.queryParam("bcircles", "JtLbM:8.721,49.438,8")
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
	public void test_1jeqhvtl3pqgh_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2017-05-15")
				.queryParam("bpolys", "8.704561,49.403252,8.7458,49.429412,8.702,49.413,8.741,49.435,8.704561,49.403252|8.704561,49.403252,8.710545,49.432,8.706,49.407,8.7369,49.432724,8.704561,49.403252|8.704561,49.403252,8.7468,49.422,8.720,49.423,8.7446,49.420,8.704561,49.403252")
				.queryParam("bcircles", "gDB:8.743,49.437672,9|UJnCa:8.7057,49.430925,9|WG:8.735,49.429,78|Tto:8.7248,49.4184,3")
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
	public void test_1iyez67ie9qnr_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "q:8.6956,49.409599,8.73523,49.383")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "51")
				.queryParam("groupByKeys", "lit,addr:country,landuse")
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
	public void test_1hblk6ziagfnb_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.692624,49.408601,8.745536,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-07-17")
				.queryParam("groupByKeys", "addr:housenumber")
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
	public void test_s0uigmfai5wl_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* and length:( .. 100)")
				.queryParam("bboxes", "8.682,49.425,8.705,49.395")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "addr:housenumber,turn:lanes,building")
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
	public void test_1jy87hbyv322g_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "track")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vJvlQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.4280],[8.70869,49.43234],[8.704,49.404],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713,49.402],[8.721367,49.431],[8.727120,49.402],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "73")
				.queryParam("groupByKeys", "maxspeed,addr:city")
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
	public void test_vbszofeeg5yq_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "v:8.6589,49.427,8.7474,49.392")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-12-30")
				.queryParam("bpolys", "8.704561,49.403252,8.7154,49.424,8.715,49.400,8.743,49.41385,8.704561,49.403252|8.704561,49.403252,8.711,49.434,8.713,49.407,8.736,49.425,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_qxisrf4tdnhu_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-06-14")
				.queryParam("groupByKeys", "barrier,network")
				.queryParam("bcircles", "8.717526,49.425,6|8.723,49.435,4")
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
	public void test_toogtm9brxo6_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687,49.42439,8.7379,49.397|8.65106,49.422682,8.705,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "type,smoothness,addr:housenumber")
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
	public void test_tolonv8yuxpx_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "U:8.6614,49.4196,8.758137,49.380")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "turn:lanes,network")
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
	public void test_1hrmhoad7020k_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country!=* or geometry:point or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-11")
				.queryParam("bpolys", "8.704561,49.403252,8.704,49.421555,8.735128,49.419,8.7464,49.404,8.704561,49.403252|8.704561,49.403252,8.7241,49.416,8.704,49.408,8.707589,49.411,8.704561,49.403252|8.704561,49.403252,8.704,49.4343,8.705,49.424540,8.711,49.409099,8.704561,49.403252")
				.queryParam("bcircles", "PQp:8.728,49.412,8|GTeiD:8.711,49.43854,36|XI:8.740,49.434,9|J:8.7389,49.40128,94")
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
	public void test_ubgc8nymliyf_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or geometry:point and id:(1 .. 9999)")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-04-02")
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
	public void test_to1sbl0jv67p_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,track")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2008-03-03")
				.queryParam("bcircles", "bMfwy:8.7260,49.402,3")
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
	public void test_soq7oalcukbl_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,school,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "8.734707,49.42912,4|8.7408,49.42282,8|8.7126,49.4350,558613623")
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
	public void test_1jyaz9llikv36_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line")
				.queryParam("filter", "foot!=* or geometry:line and length:( .. 100)")
				.queryParam("bboxes", "N:8.6564,49.4102,8.742,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-03-02")
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
	public void test_1je9yct603lmg_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2014-12-31")
				.queryParam("bcircles", "bj:8.7222,49.410,14")
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
	public void test_rhg4ua8rs27n_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.682005,49.42305,8.7265,49.398|8.699831,49.412,8.755,49.38781")
				.queryParam("values", "stop_line")
				.queryParam("time", "2012-11-01")
				.queryParam("bpolys", "V:8.704561,49.403252,8.7015,49.415,8.704519,49.414,8.702,49.428,8.704561,49.403252|A:8.704561,49.403252,8.7201,49.409,8.704,49.4303,8.747,49.428,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_skyeptjtp65g_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2014-11-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"DbXor\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.4399],[8.71659,49.429],[8.7062,49.43503],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"skm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7446,49.4281],[8.704,49.4239],[8.70803,49.436],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"t\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.4231],[8.7138,49.4031],[8.743,49.4216],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "52")
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
	public void test_1h7za0fqdhhkh_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary_link,turning_circle")
				.queryParam("bboxes", "CsJ:8.671,49.411,8.740275,49.3850|a:8.651868,49.4182,8.722646,49.397|TjvYx:8.674,49.4065,8.7207,49.3875")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-10-18")
				.queryParam("timeout", "26")
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
	public void test_1h7wjv192psmw_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,turning_circle")
				.queryParam("bboxes", "NvrKk:8.6930,49.420,8.7175,49.3828|sv:8.688035,49.429553,8.708,49.3938|u:8.6844,49.4195,8.743682,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-07-02")
				.queryParam("timeout", "78")
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
	public void test_s12vco56koro_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* and length:( .. 100)")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.749,49.4249,4")
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
	public void test_s4mcl37myce1_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.693,49.4020,8.730,49.392|8.661,49.4198,8.753,49.380|8.697,49.42366,8.732,49.3915|8.6773,49.411,8.744,49.382")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "59")
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
	public void test_s5074zme5s1c_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* and not geometry:line")
				.queryParam("bpolys", "EuIC:8.704561,49.403252,8.748,49.407,8.742,49.4183,8.70119,49.431828,8.704561,49.403252|g:8.704561,49.403252,8.733,49.417,8.735,49.410,8.746,49.405,8.704561,49.403252|De:8.704561,49.403252,8.70799,49.419,8.734,49.437,8.707,49.429,8.704561,49.403252")
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
	public void test_1hrj7ytzp1204_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes=* and type:node and not length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "8.722,49.409273,6|8.734057,49.411,4|8.7314,49.4052,8")
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
	public void test_trqv215wha3m_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "8.715,49.4215,9|8.745,49.421,4")
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
	public void test_s0xbepj4u4om_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or not geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.66259,49.4098,8.758,49.3938|8.688,49.417,8.709382,49.382|8.662,49.425,8.757,49.39393")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_t4a27d6dp10l_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.668,49.4252,8.73141,49.384|8.678,49.4217,8.736,49.393|8.677,49.4117,8.715,49.388|8.655,49.426,8.754,49.39415")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "20")
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
	public void test_1ieuzney7j2gk_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2014-12-05")
				.queryParam("bpolys", "UWayk:8.704561,49.403252,8.7007,49.433,8.744,49.4063,8.709,49.405,8.704561,49.403252")
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
	public void test_1h823c4j5expw_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2016-05-29")
				.queryParam("bpolys", "oy:8.704561,49.403252,8.712,49.42989,8.7084,49.437,8.736514,49.405,8.704561,49.403252|Q:8.704561,49.403252,8.728,49.41869,8.707,49.429,8.7315,49.425,8.704561,49.403252")
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
	public void test_1jyg1cc5g4h81_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2012-08-27")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "vlohu:8.721333,49.4122,47|GGh:8.729,49.43593,98|RH:8.740,49.4049,928128809|Je:8.72654,49.439,8")
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
	public void test_tocwkvpm9a9h_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "hiR:8.671,49.429,8.746,49.386|IE:8.6684,49.4115,8.719,49.397|KvBmb:8.660494,49.404,8.73823,49.387")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-05-08")
				.queryParam("bpolys", "t:8.704561,49.403252,8.7326,49.4355,8.702,49.426,8.732,49.438,8.704561,49.403252|ADJfP:8.704561,49.403252,8.730,49.433,8.700,49.40506,8.700,49.428102,8.704561,49.403252|E:8.704561,49.403252,8.7380,49.422,8.7002,49.422,8.724,49.426,8.704561,49.403252")
				.queryParam("bcircles", "ge:8.720,49.4212,9")
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
	public void test_1iepzz88whtur_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "barrier!=*")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "Zyh:8.73609,49.4098,44|w:8.7418,49.430,53")
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
	public void test_sobrr3oldlpv_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and id:(1 .. 9999)")
				.queryParam("types2", "node,relation")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "foot!=* or type:way or id:(1 .. 9999)")
				.queryParam("bpolys", "ylrg:8.704561,49.403252,8.7113,49.404,8.7328,49.435,8.7110,49.43833,8.704561,49.403252|yC:8.704561,49.403252,8.705,49.416,8.70408,49.4215,8.747325,49.439,8.704561,49.403252|MGMxf:8.704561,49.403252,8.7308,49.415,8.70453,49.40884,8.7263,49.402,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "39")
				.queryParam("values2", "service")
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
	public void test_u7zlj57hcuut_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-12-11")
				.queryParam("bpolys", "KL:8.704561,49.403252,8.717393,49.431,8.734,49.434,8.727,49.4226,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "tertiary")
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
	public void test_ubuonhalxo4l_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "addr:postcode!=* or type:node or length:( .. 100)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7296,49.417],[8.713252,49.416],[8.7358,49.408],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary_link")
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
	public void test_u7ojaetg08yq_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* or not type:relation and not length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-10-25")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "mnLx:8.7117,49.404,5")
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
	public void test_1hr5dk2e1ahq0_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:way and not area:(1.0 .. 1E6)")
				.queryParam("time", "2017-02-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"WGJE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.436714],[8.7050,49.40349],[8.705,49.41404],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UMWwL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7152,49.4154],[8.704096,49.433],[8.704,49.404],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "96")
				.queryParam("values2", "platform")
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
	public void test_s4umfcvoi5pi_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "node,relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "sidewalk=* and type:way or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_signals")
				.queryParam("bcircles", "8.708,49.426,85|8.700,49.4344,2|8.716517,49.4317,4|8.747,49.420,8")
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
	public void test_sopo9e95pjcj_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* or length:( .. 100)")
				.queryParam("bboxes", "pp:8.65765,49.404,8.751,49.398")
				.queryParam("keys2", "highway")
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
	public void test_t4tfgaots1nl_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and geometry:point")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "H:8.704561,49.403252,8.73953,49.40213,8.704,49.404,8.72080,49.433,8.704561,49.403252|C:8.704561,49.403252,8.737,49.409,8.708,49.432,8.7048,49.413,8.704561,49.403252|R:8.704561,49.403252,8.711602,49.40743,8.7200,49.430352,8.724762,49.424,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "speed_camera")
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
	public void test_s1gq7nhtkw9t_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "isZ:8.678,49.423,8.751,49.394130|HzFg:8.6801,49.411,8.755,49.3903|m:8.662342,49.403,8.729,49.395")
				.queryParam("keys", "highway")
				.queryParam("filter2", "lanes!=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("time", "2015-07-10")
				.queryParam("bpolys", "8.704561,49.403252,8.711,49.418,8.700,49.423,8.704,49.404,8.704561,49.403252|8.704561,49.403252,8.7296,49.402,8.718,49.400888,8.737,49.420,8.704561,49.403252|8.704561,49.403252,8.726,49.415,8.7020,49.4078,8.70450,49.434581,8.704561,49.403252")
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
	public void test_1iv6m6vbxe8va_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "S:8.682,49.425194,8.755,49.3943")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "foot!=* or length:( .. 100)")
				.queryParam("time", "2013-11-05")
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
	public void test_us2zh44g75mc_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and not type:relation and area:(1.0 .. 1E6)")
				.queryParam("types2", "point,polygon,other")
				.queryParam("filter2", "type!=* and type:node")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "THP:8.722,49.4125,6|SLa:8.710395,49.427189,5")
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
	public void test_tog6cxkzei5i_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "lit=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2008-06-30")
				.queryParam("bpolys", "EBP:8.704561,49.403252,8.7158,49.4053,8.7382,49.4269,8.7044,49.428,8.704561,49.403252|AA:8.704561,49.403252,8.7472,49.427,8.704071,49.406449,8.7090,49.41466,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "90")
				.queryParam("values2", "street_lamp")
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
	public void test_1ibesii5sqm2g_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=*")
				.queryParam("format", "json")
				.queryParam("filter2", "oneway=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"a\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746338,49.403139],[8.746,49.429],[8.7043,49.4230],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "26")
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
	public void test_1jy89471q9i01_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* and geometry:line or length:( .. 100)")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("filter2", "bicycle=* or type:relation and length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.7101,49.4232,8.713,49.4095,8.70491,49.439,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.722,49.4103,7|8.730667,49.417,2")
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
	public void test_1h82ixguau435_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.690,49.418,8.7411,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "oneway=* and not id:(1 .. 9999)")
				.queryParam("time", "2009-08-27")
				.queryParam("timeout", "56")
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
	public void test_s0v0s6gy32gm_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* and area:(1.0 .. 1E6)")
				.queryParam("types2", "relation")
				.queryParam("time", "2014-01-28")
				.queryParam("bpolys", "8.704561,49.403252,8.709,49.404,8.742,49.405,8.7285,49.430,8.704561,49.403252|8.704561,49.403252,8.700,49.4141,8.7045,49.4003,8.7044,49.403,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "path")
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
	public void test_1hr8oqj2uvf3r_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("filter2", "type!=* and type:way or id:(1 .. 9999)")
				.queryParam("time", "2014-04-14")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "88")
				.queryParam("values2", "cycleway")
				.queryParam("bcircles", "8.725,49.426,104")
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
	public void test_to7u8znsxid1_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or area:(1.0 .. 1E6)")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "geojson")
				.queryParam("filter2", "turn=* or type:way")
				.queryParam("time", "2016-04-24")
				.queryParam("bcircles", "8.735,49.4366,4|8.70618,49.407751,332516899|8.727,49.410492,6|8.745,49.427,3")
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
	public void test_urk31x3d9isj_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-06-21")
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
	public void test_1iv4a0ds2fqcx_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.664,49.428,8.7328,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-10-04")
				.queryParam("timeout", "98")
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
	public void test_1iextuc1mc65t_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "mn:8.7287,49.424,6|mBQ:8.728,49.428,8|NGLzL:8.745484,49.434373,1")
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
	public void test_u87z9qbgmt0m_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and geometry:line and id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-12-26")
				.queryParam("bcircles", "bE:8.717,49.4226,619")
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
	public void test_1hbgh0opilkys_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-04-27")
				.queryParam("bpolys", "r:8.704561,49.403252,8.71469,49.436,8.739,49.4122,8.73267,49.430,8.704561,49.403252")
				.queryParam("timeout", "41")
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
	public void test_1k22aa69ik182_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("time", "2018-03-21")
				.queryParam("bpolys", "8.704561,49.403252,8.7054,49.4386,8.704176,49.4043,8.70421,49.421,8.704561,49.403252")
				.queryParam("bcircles", "i:8.727771,49.418,5")
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
	public void test_s0v163nmh1t1_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-01-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"tR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4224],[8.715,49.420],[8.727,49.4181],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7279,49.415],[8.7074,49.416],[8.70459,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "73")
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
	public void test_sl16kc312oft_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-03-02")
				.queryParam("bpolys", "8.704561,49.403252,8.737377,49.419,8.724,49.427,8.732,49.415,8.704561,49.403252")
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
	public void test_1iyfh60ztxstv_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* or geometry:line")
				.queryParam("format", "csv")
				.queryParam("time", "2012-11-19")
				.queryParam("bcircles", "m:8.74556,49.439,250")
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
	public void test_1h7ldyzbtoh0z_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "FN:8.704561,49.403252,8.7018,49.416,8.710,49.4039,8.725,49.4169,8.704561,49.403252|smehZ:8.704561,49.403252,8.714,49.407,8.73724,49.416577,8.705,49.415,8.704561,49.403252|ZJBnP:8.704561,49.403252,8.72594,49.406,8.705,49.413,8.706,49.4255,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_1jyd8bsnba6go_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6905,49.414,8.757,49.3954|8.650,49.405,8.7387,49.395807")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-04-06")
				.queryParam("bpolys", "c:8.704561,49.403252,8.7082,49.424,8.734,49.4366,8.732,49.436,8.704561,49.403252|ygQ:8.704561,49.403252,8.71604,49.40821,8.736,49.420,8.704553,49.418,8.704561,49.403252")
				.queryParam("bcircles", "udG:8.729,49.4047,96")
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
	public void test_vb41bfix4soj_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "B:8.704561,49.403252,8.742935,49.434,8.71618,49.40422,8.7042,49.4127,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_u7ru32nuhvsi_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "FDz:8.66366,49.416,8.7109,49.385|BJAsE:8.6921,49.40923,8.716,49.388579|C:8.684,49.4047,8.753,49.3899")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-11-06")
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
	public void test_vb9mtqj8egxe_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Iu:8.687,49.401995,8.73115,49.398|s:8.673,49.42406,8.740,49.385|aAP:8.660,49.426,8.7427,49.3990")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-01-31")
				.queryParam("timeout", "68")
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
	public void test_t4nby9fpqfjm_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Gq:8.66797,49.406,8.7174,49.392|Fx:8.652,49.428896,8.712,49.396")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "93")
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
	public void test_1ji4z2dj9pn3s_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Rnskn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.4350],[8.700488,49.4365],[8.7045,49.430],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"gx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.40725],[8.713,49.403291],[8.7043,49.404],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "8.70300,49.434,4")
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
	public void test_1iay696pdn04l_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7407,49.4121,8.700,49.426,8.716554,49.435,8.704561,49.403252|8.704561,49.403252,8.7063,49.40005,8.704956,49.425,8.7291,49.430,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_1ibeta8w8yxk1_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-07-26")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "wv:8.716,49.42996,3|J:8.7458,49.4217,32")
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
	public void test_s1jfnst2p469_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("time", "2011-04-24")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "uO:8.715,49.4282,619138111|rX:8.7155,49.4145,17|wJ:8.7169,49.4087,24|R:8.7325,49.4183,899")
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
	public void test_toddqggbj9km_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "RrNVD:8.676,49.414,8.7094,49.389")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-07-25")
				.queryParam("timeout", "49")
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
	public void test_skvmk6id1k4z_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.674,49.413179,8.74884,49.3804")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "yes")
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
	public void test_urrx5j34wraq_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6606,49.4141,8.7400,49.39830")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_qe6n1il3dcty_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and not geometry:line and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-04-13")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "hgsM:8.726,49.423,75|IM:8.7358,49.434,1")
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
	public void test_1k25kg4wkuzax_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or geometry:polygon")
				.queryParam("bboxes", "N:8.697,49.4231,8.724,49.393|j:8.699,49.414,8.703,49.389|N:8.6958,49.429,8.72495,49.380|P:8.66086,49.42326,8.713915,49.387")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_rhlm4af8fdyc_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.694,49.423,8.712,49.386|8.6872,49.410,8.744,49.396|8.65984,49.423302,8.736,49.3824|8.65450,49.41287,8.723,49.384064")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "38")
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
	public void test_1jeqizc6fogtx_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "oD:8.67264,49.411,8.749,49.3988|wGy:8.695841,49.404,8.7466,49.3982|C:8.6646,49.427298,8.7032,49.391|iiv:8.68590,49.417620,8.7036,49.381")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.70413,49.43127,8.748,49.400,8.708,49.400,8.704561,49.403252|TQaB:8.704561,49.403252,8.7370,49.437764,8.716,49.4005,8.7444,49.438,8.704561,49.403252|p:8.704561,49.403252,8.7068,49.417,8.720,49.4339,8.702,49.435,8.704561,49.403252")
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
	public void test_qxw31y5l3eih_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "N:8.70124,49.423,2")
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
	public void test_s1b6o3piufz9_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.675,49.400155,8.736578,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-09-15")
				.queryParam("timeout", "94")
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
	public void test_urv7bhpzabsj_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-01-10")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "G:8.746,49.4214,11")
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
	public void test_s1dy24csv4v6_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6707,49.413437,8.700,49.393|8.6536,49.42167,8.7122,49.397|8.650,49.414,8.724,49.383")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
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
	public void test_rhgm1zuybhid_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof")
				.queryParam("bboxes", "Ve:8.675,49.40505,8.7522,49.385|P:8.697,49.4211,8.744,49.392|d:8.65136,49.429,8.732,49.384|N:8.689491,49.4226,8.712,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-03-27")
				.queryParam("bpolys", "gZxWE:8.704561,49.403252,8.749,49.4260,8.70721,49.42244,8.72927,49.406,8.704561,49.403252|U:8.704561,49.403252,8.720726,49.437,8.7015,49.423799,8.701,49.411069,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1jed7lc7fg4l4_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "yes")
				.queryParam("bboxes", "ftfiq:8.654,49.415,8.739,49.3838")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "42")
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
	public void test_rlapmy08zwx2_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,track,turning_circle")
				.queryParam("bboxes", "UbRn:8.678,49.406,8.751,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
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
	public void test_rhdspvp588ja_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or type:relation")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2012-05-03")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.405,8.7019,49.41708,8.7165,49.4293,8.704561,49.403252|8.704561,49.403252,8.7207,49.414,8.705,49.426,8.748,49.418,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1hrrkuhkzqp2a_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "V:8.655,49.4299,8.70440,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
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
	public void test_u8aomudzj71d_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("timeout", "96")
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
	public void test_toogi9tdhnp4_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "BW:8.685,49.4204,8.713,49.38354|xjb:8.68802,49.421988,8.735932,49.398|esmEh:8.684,49.4003,8.7076,49.384|c:8.674,49.4233,8.7014,49.394573")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-09-21")
				.queryParam("bpolys", "cDz:8.704561,49.403252,8.740,49.404,8.7094,49.403389,8.701,49.40237,8.704561,49.403252|O:8.704561,49.403252,8.700725,49.429410,8.703,49.432,8.7048,49.4096,8.704561,49.403252|BYD:8.704561,49.403252,8.7367,49.431,8.704,49.408332,8.7361,49.4215,8.704561,49.403252")
				.queryParam("timeout", "82")
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
	public void test_t49j3wg4p4c1_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,apartments,stop_line")
				.queryParam("filter", "type!=* or type:relation")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-04-24")
				.queryParam("bpolys", "O:8.704561,49.403252,8.72098,49.430288,8.7080,49.410,8.7087,49.4338,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_vbsg71utxlpt_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,speed_camera")
				.queryParam("bboxes", "Pr:8.686,49.423,8.70753,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-07-31")
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
	public void test_u7rbrilb46le_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.70733,49.423,8.7251,49.416,8.7181,49.429537,8.704561,49.403252|8.704561,49.403252,8.731,49.434,8.7155,49.43780,8.7078,49.43504,8.704561,49.403252|8.704561,49.403252,8.703,49.422,8.709,49.4335,8.745,49.414297,8.704561,49.403252")
				.queryParam("timeout", "71")
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
	public void test_us0qh89lrd4l_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-01-20")
				.queryParam("bpolys", "nOR:8.704561,49.403252,8.7209,49.4376,8.7127,49.415,8.72253,49.4322,8.704561,49.403252|PYoch:8.704561,49.403252,8.7263,49.4135,8.710,49.4109,8.7492,49.429,8.704561,49.403252|AWFGz:8.704561,49.403252,8.717824,49.406,8.711,49.4097,8.704,49.4207,8.704561,49.403252")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "nBuEJ:8.7372,49.425,42")
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
	public void test_uv5t9zrype0g_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.662,49.4139,8.7567,49.394|8.6669,49.420,8.739747,49.3876|8.653,49.405,8.713,49.3830|8.657,49.411011,8.7034,49.3832")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "71")
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
	public void test_somwvh76mou0_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,street_lamp,school")
				.queryParam("bboxes", "J:8.657,49.417,8.753,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
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
	public void test_1hrs1lnd8fxba_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,yes,emergency_access_point")
				.queryParam("filter", "name=* or type:way or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-10-08")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "gwf:8.719,49.4351,9|DhwY:8.7248,49.429,6")
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
	public void test_uv8lu7m7f529_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ECbCN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7016,49.4274],[8.702,49.427],[8.7076,49.439],[8.704561,49.403252]]]}}]}")
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
	public void test_1jenqtqr0a52t_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-02-26")
				.queryParam("bpolys", "8.704561,49.403252,8.702924,49.424,8.722339,49.42726,8.7027,49.425,8.704561,49.403252|8.704561,49.403252,8.706,49.407,8.701,49.401,8.7340,49.436,8.704561,49.403252|8.704561,49.403252,8.7362,49.41207,8.708,49.4069,8.70081,49.406,8.704561,49.403252")
				.queryParam("bcircles", "QPZ:8.718,49.405653,37|XdGNB:8.742761,49.40816,7")
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
	public void test_urrybkt5wzef_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "civic")
				.queryParam("time", "2016-08-03")
				.queryParam("bcircles", "Zn:8.717,49.43914,7")
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
	public void test_t81tiytocs39_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "8.721,49.4375,92|8.73904,49.4048,69|8.7080,49.4155,784")
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
	public void test_s4p2er4dwodi_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "rs:8.746,49.412,4")
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
	public void test_t89ohhmdjequ_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house")
				.queryParam("bboxes", "Tmh:8.68998,49.412,8.719804,49.3937|eUa:8.684172,49.4087,8.7315,49.3856|JH:8.699,49.401,8.706,49.38528|ieivK:8.695769,49.4147,8.72308,49.39036")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-09-12")
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
	public void test_1hbm0mx4w4egm_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street!=* or geometry:line or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-01-12")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.7341,49.425305,8.7230,49.4035,8.737,49.409,8.704561,49.403252")
				.queryParam("timeout", "45")
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
	public void test_vf3p8btku910_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "T:8.665,49.429,8.747677,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("timeout", "38")
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
	public void test_1k1r634183kh1_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2008-04-23")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "xmvfp:8.7357,49.435,2|rJ:8.7256,49.414,6|CMQHs:8.7158,49.42574,1|RyO:8.72979,49.433,68")
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
	public void test_rl03m6siy34z_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UY:8.666678,49.408,8.755866,49.3875|Z:8.6895,49.408,8.748,49.395|EasmE:8.676129,49.411,8.7229,49.395")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_s4mcl75f9opt_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.664,49.408,8.7269,49.393|8.673,49.419,8.756785,49.397|8.660,49.4187,8.701,49.3826")
				.queryParam("keys", "highway")
				.queryParam("timeout", "98")
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
	public void test_1ji7auzv0vtcz_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and geometry:line")
				.queryParam("keys", "highway")
				.queryParam("time", "2018-02-11")
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
	public void test_qxqklt1o6gc2_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-01-27")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.43805,8.703,49.4144,8.70370,49.4131,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_1ib8rt3vsvc6e_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "YDshH:8.673842,49.4109,8.743,49.383")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "43")
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
	public void test_1ji4i8n14q52r_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.70421,49.4242,8.704918,49.423722,8.7018,49.41617,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_rhb1c10o2wc2_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("bcircles", "ORTXL:8.736,49.423,9")
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
	public void test_rhjdd9uwwndy_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bpolys", "sm:8.704561,49.403252,8.731,49.438,8.706,49.436835,8.7018,49.4272,8.704561,49.403252")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "8.709,49.404223,97")
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
	public void test_tnz05oeizdbm_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73666,49.4289],[8.704,49.410871],[8.708,49.41608],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"H\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.43308],[8.722,49.413651],[8.707,49.43368],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "93")
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
	public void test_t86w02p0sfg4_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2015-09-17")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "8.7111,49.43345,6|8.706,49.407,9|8.7303,49.41105,3")
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
	public void test_qxl14kixjgiu_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-03-31")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.717,49.401,8.7351,49.431,8.7065,49.401418,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1hbah3k6xq4hf_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:backward!=*")
				.queryParam("format", "csv")
				.queryParam("time", "2018-04-20")
				.queryParam("bcircles", "M:8.7125,49.438,7")
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
	public void test_1jefzdnsnxw84_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=* or not id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-09-25")
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
	public void test_sof339ls4852_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-10-09")
				.queryParam("bcircles", "LRH:8.728,49.4213,30|wOp:8.7279,49.4052,9|S:8.708,49.4380,7")
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
	public void test_qhq523257eqr_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-12-25")
				.queryParam("bpolys", "eP:8.704561,49.403252,8.7320,49.434,8.7295,49.416,8.700,49.42308,8.704561,49.403252|KkNyS:8.704561,49.403252,8.705,49.410,8.73518,49.408,8.709,49.420,8.704561,49.403252|V:8.704561,49.403252,8.746,49.400385,8.736,49.419,8.704,49.421040,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_t81udlro688h_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:way and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.670,49.4188,8.706,49.387|8.671747,49.428,8.725296,49.387")
				.queryParam("format", "csv")
				.queryParam("timeout", "51")
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
	public void test_1ibebqp2a3mg6_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and not id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.748,49.400469,8.70432,49.4184,8.73640,49.405,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_qdsqlmv9o7qq_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "tH:8.714,49.4131,7")
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
	public void test_qdsqzo02dv7a_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=*")
				.queryParam("groupByValues", "civic,service,steps")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-07-06")
				.queryParam("bcircles", "U:8.745282,49.4367,4|skHcz:8.709325,49.438029,3|XdN:8.749,49.408,58|JQw:8.740,49.4170,1")
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
	public void test_1jyg0hjbyskzd_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,synagogue")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2012-09-07")
				.queryParam("bpolys", "mbm:8.704561,49.403252,8.726,49.43901,8.704587,49.4372,8.7008,49.434,8.704561,49.403252|RKeGf:8.704561,49.403252,8.745,49.4102,8.70022,49.4354,8.70410,49.40602,8.704561,49.403252|yK:8.704561,49.403252,8.737,49.418,8.7026,49.427,8.715,49.428734,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_1h82jbpg4to4m_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.660,49.424,8.7534,49.3847")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
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
	public void test_t81d8cxbr97q_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.697107,49.4189,8.752858,49.39736|8.665,49.420203,8.739245,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "76")
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
	public void test_qxwmguvpfcqe_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,station,traffic_signals")
				.queryParam("filter", "oneway!=* and not type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "J:8.678244,49.409,8.7489,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-09-23")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "sjJO:8.730,49.406,6")
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
	public void test_urmur8k805df_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-03-14")
				.queryParam("bcircles", "zj:8.71599,49.439,3|OsB:8.721,49.427,9|hjAo:8.7371,49.40615,30|t:8.7135,49.428212,886")
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
	public void test_1iv1imdifp6pk_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "station,school")
				.queryParam("filter", "destination!=* or type:relation or id:(1 .. 9999)")
				.queryParam("bboxes", "mSeXO:8.694575,49.42100,8.729,49.392|jS:8.679,49.420,8.739144,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-01-20")
				.queryParam("timeout", "97")
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
	public void test_1hv2pzegusrp4_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "Jaa:8.714,49.423,3")
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
	public void test_s4md1qnnzjvq_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-03-15")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "vp:8.700,49.437549,6")
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
	public void test_t81afejk5mqr_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-03-05")
				.queryParam("timeout", "84")
				.queryParam("groupByKeys", "addr:housenumber,oneway")
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
	public void test_qdyajdmcmi5d_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or length:( .. 100)")
				.queryParam("bboxes", "8.67097,49.40707,8.7372,49.392|8.6665,49.4121,8.757,49.382|8.685,49.408,8.7193,49.3816")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "IA:8.704561,49.403252,8.7223,49.4263,8.704,49.43758,8.7096,49.429,8.704561,49.403252")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "zW:8.718,49.419,9")
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
	public void test_vb69zwzo2q7o_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.689,49.413,8.7482,49.3932|8.658956,49.422,8.720,49.380|8.6710,49.402,8.715780,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("time", "2018-02-19")
				.queryParam("timeout", "75")
				.queryParam("groupByKeys", "foot,addr:housenumber")
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
	public void test_vbbtxtnqqque_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "D:8.672,49.402,8.759,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-06-25")
				.queryParam("groupByKeys", "lanes:forward,smoothness")
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
	public void test_us08v9zvnty9_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=*")
				.queryParam("timeout", "32")
				.queryParam("groupByKeys", "addr:housenumber,tracktype")
				.queryParam("bcircles", "ayWX:8.742,49.4365,9|AacOM:8.708,49.412,4|GGb:8.72227,49.434184,5|Tk:8.7136,49.43430,24")
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
	public void test_qe1lsoxxqf5c_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "Tg:8.679020,49.4217,8.758,49.395|Y:8.67266,49.428,8.7582,49.390")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("bpolys", "S:8.704561,49.403252,8.723,49.4144,8.70087,49.4392,8.713,49.401159,8.704561,49.403252|aOMwk:8.704561,49.403252,8.7110,49.414,8.703,49.4012,8.7309,49.418,8.704561,49.403252")
				.queryParam("timeout", "33")
				.queryParam("groupByKeys", "source:maxspeed,type,lit")
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
	public void test_1hbg0bphr72ht_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or geometry:polygon and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "xtgZb:8.704561,49.403252,8.711,49.414,8.704484,49.4326,8.713,49.42788,8.704561,49.403252|z:8.704561,49.403252,8.73046,49.425,8.70452,49.41427,8.7228,49.423,8.704561,49.403252|GGc:8.704561,49.403252,8.7109,49.425,8.70447,49.40215,8.748,49.4079,8.704561,49.403252")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "8.723,49.4295,1")
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
	public void test_1hux6wcmuotwm_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=*")
				.queryParam("bboxes", "bdppb:8.698,49.418,8.719483,49.3999")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-04-14")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "addr:housenumber,lanes")
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
	public void test_vf9q06iwtrae_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and length:( .. 100)")
				.queryParam("time", "2009-11-03")
				.queryParam("timeout", "97")
				.queryParam("groupByKeys", "addr:country,turn,landuse")
				.queryParam("bcircles", "8.719,49.40745,738|8.7489,49.4270,52|8.735,49.434,2|8.7215,49.4023,4")
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
	public void test_s4rukzx167ub_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "sTys:8.6967,49.4005,8.721,49.393")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "bicycle,maxspeed,name")
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
	public void test_1jefga3ja2wkl_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qSSgg:8.665,49.422,8.738,49.3996|jYvRN:8.658,49.427,8.7550,49.39983")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-07-08")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "D:8.72807,49.4045,9|zwTA:8.72145,49.4399,5|cW:8.716,49.427,1")
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
	public void test_1h7gdio1sb6ew_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship,synagogue,secondary")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "8.707,49.41022,6")
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
	public void test_uv8m86rd4z02_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,turning_circle,path")
				.queryParam("bboxes", "llmx:8.6843,49.40172,8.72520,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "96")
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
	public void test_1hrgzd38jgegn_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,footway,living_street")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "hkXVQ:8.704561,49.403252,8.71191,49.40544,8.71617,49.405,8.7139,49.40125,8.704561,49.403252|E:8.704561,49.403252,8.7047,49.4389,8.701981,49.4182,8.717,49.4395,8.704561,49.403252|BT:8.704561,49.403252,8.708,49.422,8.7045,49.402686,8.7045,49.413,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_1ien87lwosv8y_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,service,hut")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "pJvl:8.704561,49.403252,8.700,49.423,8.714844,49.406,8.7113,49.422703,8.704561,49.403252|Z:8.704561,49.403252,8.747,49.433,8.7042,49.405072,8.73272,49.4001,8.704561,49.403252|QINjH:8.704561,49.403252,8.736,49.434,8.7093,49.4377,8.72218,49.424802,8.704561,49.403252")
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
	public void test_1jy7rigaisbja_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,track,street_lamp")
				.queryParam("filter", "lanes!=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-11-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7264,49.438],[8.704,49.4329],[8.737,49.425],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
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
	public void test_1iyhpdqmis02r_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,secondary,yes")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-09-30")
				.queryParam("bpolys", "lFTOQ:8.704561,49.403252,8.70942,49.437372,8.71539,49.43036,8.704,49.4170,8.704561,49.403252|SZOxL:8.704561,49.403252,8.7084,49.406,8.725,49.416660,8.701,49.412,8.704561,49.403252|PM:8.704561,49.403252,8.7274,49.4315,8.728,49.4014,8.7043,49.4324,8.704561,49.403252")
				.queryParam("bcircles", "hG:8.7049,49.427,870")
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
	public void test_vb9lnpj0ngvr_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2009-04-04")
				.queryParam("bpolys", "8.704561,49.403252,8.711,49.4010,8.742,49.4164,8.72132,49.406,8.704561,49.403252|8.704561,49.403252,8.74040,49.406,8.705213,49.400,8.70481,49.403,8.704561,49.403252|8.704561,49.403252,8.7315,49.4143,8.7025,49.414763,8.736176,49.414,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_1h7qx4lwvxtfd_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,unclassified")
				.queryParam("bboxes", "L:8.687846,49.422,8.7178,49.38799")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
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
	public void test_1jy5g3p4amipk_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "turning_circle,house,hotel")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-01-09")
				.queryParam("bpolys", "HbP:8.704561,49.403252,8.707,49.404,8.740198,49.405015,8.706,49.400,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1iaxopco212d3_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* or id:(1 .. 9999)")
				.queryParam("bboxes", "k:8.66297,49.422,8.727,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-01-26")
				.queryParam("timeout", "78")
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
	public void test_1ien71ixzt1rm_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "pG:8.678,49.421,8.748,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-11")
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
	public void test_1h7z8g7dfsd2q_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "w:8.711,49.4197,7")
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
	public void test_urgv874yt8wy_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "8.711,49.4347,9|8.737,49.4075,9|8.711,49.413,9|8.7496,49.4319,95")
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
	public void test_tofnz2bvm69e_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "O:8.6715,49.423,8.739033,49.38346")
				.queryParam("keys", "highway")
				.queryParam("time", "2008-07-21")
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
	public void test_uvgxmbedjhh2_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2017-12-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72684,49.438818],[8.701,49.416],[8.748,49.4325],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.404],[8.7096,49.422],[8.7450,49.4277],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ek\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.439],[8.704562,49.413],[8.70836,49.4187],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "XEpp:8.74675,49.4143,89")
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
	public void test_1iuyqx8czqc6s_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "IkJf:8.6553,49.429,8.712,49.398")
				.queryParam("format", "json")
				.queryParam("timeout", "71")
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
	public void test_1ji1oi68xhqw1_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or type:relation or id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-08-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"H\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.431180],[8.709,49.415],[8.70486,49.4298],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tXD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728760,49.408],[8.72558,49.434],[8.709,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"xudY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7207,49.425617],[8.733,49.41845],[8.729,49.408],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "44")
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
	public void test_1hbaf7nkhesf8_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-01-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fW\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.4098],[8.703,49.420],[8.707,49.406669],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "89")
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
	public void test_rhivifzaa5wj_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "uG:8.65465,49.402,8.734,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
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
	public void test_uv5tabycug69_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=*")
				.queryParam("bboxes", "8.666106,49.412,8.73278,49.381")
				.queryParam("keys", "highway")
				.queryParam("filter2", "network=* and not area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary_link")
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
	public void test_trrbf9d0q3p5_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.662,49.4124,8.722,49.393")
				.queryParam("types2", "way,relation")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("values2", "platform")
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
	public void test_trtl9o9grk1c_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2010-02-24")
				.queryParam("bcircles", "d:8.708,49.43577,1")
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
	public void test_rhlogf3qbho3_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("filter2", "building!=* or id:(1 .. 9999)")
				.queryParam("bcircles", "e:8.739,49.430385,4")
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
	public void test_vf47mi7pzwx0_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.684328,49.412,8.746,49.387|8.667,49.420,8.7512,49.391")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,")
				.queryParam("values", "residential")
				.queryParam("format", "json")
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
	public void test_sl8yc38iavs1_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:line")
				.queryParam("bboxes", "eWx:8.6975,49.4051,8.757,49.385")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "addr:housenumber=*")
				.queryParam("time", "2013-10-30")
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
	public void test_1iv3rdp7ow290_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
				.queryParam("bcircles", "8.74293,49.40572,3")
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
	public void test_1iyhqxz0u04f5_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6500,49.412,8.756,49.3903|8.690637,49.4156,8.724121,49.385")
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "json")
				.queryParam("time", "2017-10-24")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_sohvyifeea7l_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "addr:street!=* or id:(1 .. 9999)")
				.queryParam("time", "2008-12-11")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "tQZc:8.743,49.423,6")
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
	public void test_rl2d596ivh2o_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Po:8.688504,49.412,8.746,49.3957|F:8.682,49.401994,8.753,49.391|vzEA:8.670639,49.41698,8.7110,49.384|rmGV:8.6786,49.4118,8.749426,49.387")
				.queryParam("types2", "point,polygon,other")
				.queryParam("showMetadata", "yes")
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
	public void test_urp4zmj20w1d_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-12-31")
				.queryParam("bpolys", "C:8.704561,49.403252,8.743,49.4177,8.708,49.404,8.7366,49.4107,8.704561,49.403252")
				.queryParam("timeout", "43")
				.queryParam("values2", "cycleway")
				.queryParam("bcircles", "8.740,49.437,599|8.748,49.422,4")
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
	public void test_t4nvubragbc6_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* or id:(1 .. 9999)")
				.queryParam("types2", "way,relation")
				.queryParam("format", "json")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.74948,49.418,8.704,49.429,8.70943,49.422,8.704561,49.403252")
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
	public void test_r1ibzw6bq99g_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* and not length:( .. 100)")
				.queryParam("time", "2014-04-09")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "fIh:8.714,49.4066,4|md:8.720,49.43335,43|zGlpp:8.732709,49.425,2|oEs:8.715,49.43402,201")
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
	public void test_r1cvym0koy0i_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.410,8.758,49.3927")
				.queryParam("keys", "highway")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "75")
				.queryParam("values2", "secondary")
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
	public void test_vevergv5j5ut_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and type:node")
				.queryParam("bboxes", "8.655725,49.42029,8.740,49.398|8.659,49.411,8.744,49.3940|8.65694,49.41739,8.729,49.389|8.693589,49.421,8.736,49.3930")
				.queryParam("format", "csv")
				.queryParam("time", "2010-12-15")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "38")
				.queryParam("values2", "pedestrian")
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
	public void test_r1cugweafmex_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* and not id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("format", "geojson")
				.queryParam("filter2", "name!=* and type:way or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "DB:8.745,49.426,9")
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
	public void test_1iv9tyet6hjjs_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6781,49.42043,8.74046,49.3835")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "oneway!=* or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "90")
				.queryParam("values2", "cycleway")
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
	public void test_s0x92l6wg2es_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or type:way and id:(1 .. 9999)")
				.queryParam("time", "2010-06-16")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "WbS:8.713,49.43382,97")
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
	public void test_t4ncf5jnt275_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6589,49.410,8.74236,49.392")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* and not id:(1 .. 9999)")
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
	public void test_urpnasfk9hly_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.66030,49.402825,8.745,49.392|8.6603,49.412,8.730,49.395|8.653,49.4222,8.737,49.38668|8.675,49.401,8.7504,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "service=driveway")
				.queryParam("time", "2010-02-23")
				.queryParam("timeout", "74")
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
	public void test_1ib8s6x1dazax_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "r:8.681805,49.426,8.710,49.393")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
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
	public void test_uv8knwgkc3zt_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "flZN:8.6949,49.422502,8.721,49.395|t:8.695711,49.420,8.747,49.38320|O:8.676,49.4285,8.7482,49.387")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-01-28")
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
	public void test_1hrm232dszxie_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "auEZV:8.653097,49.427,8.734,49.3818")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
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
	public void test_1jei6vi5xg8qc_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "GhJZu:8.688,49.425,8.733790,49.387")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-02-24")
				.queryParam("timeout", "91")
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
	public void test_1jeiqdfgwvtix_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "h:8.690,49.412,8.702,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-12-14")
				.queryParam("timeout", "95")
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
	public void test_uv5uwwtegl7l_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:node")
				.queryParam("bboxes", "b:8.6702,49.402,8.7013,49.387")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-08-30")
				.queryParam("bpolys", "wpRmg:8.704561,49.403252,8.738,49.4124,8.7049,49.418,8.7111,49.4175,8.704561,49.403252|ZeDQg:8.704561,49.403252,8.728015,49.419,8.704287,49.4309,8.725,49.409,8.704561,49.403252|lrkjT:8.704561,49.403252,8.7443,49.4221,8.7044,49.4098,8.706301,49.412,8.704561,49.403252")
				.queryParam("timeout", "73")
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
	public void test_1k22tu841uxbp_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* or not geometry:point or not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-07-01")
				.queryParam("bpolys", "8.704561,49.403252,8.7347,49.420,8.7178,49.415,8.704,49.4172,8.704561,49.403252|8.704561,49.403252,8.7065,49.432,8.7086,49.409802,8.709,49.407,8.704561,49.403252|8.704561,49.403252,8.727,49.427,8.704,49.431,8.739,49.4070,8.704561,49.403252")
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
	public void test_rl2ve2kmfdiu_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2017-09-02")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "szhlr:8.74852,49.4142,9")
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
	public void test_rkwr6epktt9h_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-12-03")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "PC:8.7470,49.419579,7|PONvZ:8.747,49.439,6")
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
	public void test_qxw3dkt6d4xc_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2015-07-13")
				.queryParam("bpolys", "RSSSf:8.704561,49.403252,8.731,49.439014,8.70841,49.4050,8.73352,49.40560,8.704561,49.403252|u:8.704561,49.403252,8.74891,49.421005,8.7490,49.4256,8.7231,49.4067,8.704561,49.403252|ugFfF:8.704561,49.403252,8.743,49.426004,8.7445,49.400447,8.748,49.408,8.704561,49.403252")
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
	public void test_1hrri6sm5809u_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.701,49.412,8.707,49.4227,8.7037,49.400846,8.704561,49.403252|sCJD:8.704561,49.403252,8.723,49.422,8.7073,49.437,8.7128,49.4323,8.704561,49.403252")
				.queryParam("bcircles", "tHnCS:8.7392,49.419665,771")
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
	public void test_sohwf883nt5u_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2009-09-20")
				.queryParam("bpolys", "NY:8.704561,49.403252,8.72930,49.43932,8.718,49.407,8.727645,49.4370,8.704561,49.403252")
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
	public void test_1je9wsop0gfhe_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "8.733,49.415,4")
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
	public void test_1h81zwp5joto8_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or geometry:point or not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "gOhya:8.704561,49.403252,8.709836,49.421,8.704813,49.420,8.715,49.402,8.704561,49.403252")
				.queryParam("timeout", "96")
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
	public void test_uv5tcqrzivz9_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6566,49.412,8.711,49.3828|8.692,49.408,8.740,49.380|8.676,49.426,8.742,49.388|8.68680,49.4248,8.73725,49.39039")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("timeout", "84")
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
	public void test_1h7zrxgzbvrs6_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or type:way or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("time", "2009-10-05")
				.queryParam("timeout", "40")
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
	public void test_1iyhq62r5s9io_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.676645,49.41313,8.703793,49.390548")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("time", "2012-01-07")
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
	public void test_t4w75jtdpjs1_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2014-05-08")
				.queryParam("bpolys", "h:8.704561,49.403252,8.725,49.400,8.7049,49.4257,8.722097,49.429,8.704561,49.403252|a:8.704561,49.403252,8.74057,49.4335,8.730,49.40237,8.702,49.422,8.704561,49.403252|ceitX:8.704561,49.403252,8.709,49.420,8.70979,49.432,8.747,49.406,8.704561,49.403252")
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
	public void test_rhgmfz226o1l_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.43574,8.7351,49.40254,8.70496,49.433,8.704561,49.403252")
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
	public void test_us2zxg47uvxy_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and geometry:point or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("time", "2012-06-28")
				.queryParam("bcircles", "X:8.708,49.425,2|ol:8.711,49.4235,8")
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
	public void test_1iuw08wrxsk0z_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and type:way")
				.queryParam("bboxes", "yXo:8.663,49.404,8.7223,49.396")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-07-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.4206],[8.701105,49.402],[8.717,49.42601],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"PLHqz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.42396],[8.707,49.4189],[8.706,49.425],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "43")
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
	public void test_s4v4cnxuhxdc_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2008-11-01")
				.queryParam("bcircles", "u:8.718631,49.426,5|eAuxd:8.741,49.4256,6")
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
	public void test_u7u1zdwnt10m_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ovcsy:8.6975,49.4248,8.737,49.387|itdz:8.6661,49.416,8.703,49.390|Pv:8.680,49.419,8.703566,49.38581|B:8.6750,49.4122,8.73880,49.39700")
				.queryParam("time", "2017-10-22")
				.queryParam("timeout", "93")
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
	public void test_1hr8n998jiypc_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-05-13")
				.queryParam("bpolys", "fox:8.704561,49.403252,8.70216,49.413,8.7048,49.416037,8.704,49.419,8.704561,49.403252")
				.queryParam("timeout", "62")
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
	public void test_s1b3xs0osi7t_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* or not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "MWTmZ:8.704561,49.403252,8.7218,49.4286,8.704023,49.420,8.70950,49.401,8.704561,49.403252|xx:8.704561,49.403252,8.7075,49.403,8.701,49.4006,8.705314,49.4334,8.704561,49.403252|GX:8.704561,49.403252,8.726,49.43624,8.70459,49.417,8.717,49.436,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_u8dita2tp06r_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ov:8.6543,49.423,8.7004,49.381|DYWqp:8.676,49.414,8.729,49.396|fPhaL:8.653,49.407,8.7149,49.398|u:8.66925,49.4257,8.728,49.383")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "y:8.7043,49.4032,3")
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
	public void test_s0ugit2gakwy_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.671,49.4215,8.7550,49.390|8.666,49.408729,8.7206,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_1jygk1ph27cqg_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and geometry:line or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "U:8.735390,49.401876,3|mH:8.70870,49.432,1|bVTl:8.715,49.434,84|izlqO:8.728,49.4019,7")
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
	public void test_qhqlt2xufh41_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "siNE:8.6892,49.410,8.7333,49.398")
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
	public void test_u7u1a0esa0qg_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* or geometry:point or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "8.7074,49.408,55|8.72138,49.438626,481|8.738,49.411,2|8.7286,49.4016,393")
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
	public void test_vbbuc31f9qnr_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and geometry:polygon or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-11-03")
				.queryParam("bpolys", "8.704561,49.403252,8.7296,49.419,8.704554,49.427,8.704,49.421,8.704561,49.403252|8.704561,49.403252,8.7281,49.4101,8.70424,49.421630,8.7095,49.439,8.704561,49.403252|8.704561,49.403252,8.7393,49.413,8.70406,49.4102,8.724,49.41273,8.704561,49.403252")
				.queryParam("timeout", "54")
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
	public void test_1h7o5cue7w94p_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,synagogue")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-02-11")
				.queryParam("bcircles", "N:8.72301,49.424,9|PMZDi:8.7116,49.415,9|hi:8.7291,49.438,3")
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
	public void test_u7r9hybfzuqq_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-06-20")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "oMUiE:8.728,49.438252,9|pZ:8.7463,49.4031,6|JTO:8.726,49.408461,68|mgD:8.7448,49.423,3")
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
	public void test_t4z03qg2vcrn_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,primary,service")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2012-02-28")
				.queryParam("bcircles", "ZBRdw:8.747,49.403,603|V:8.731402,49.4028,27|pHyPW:8.734,49.422,5|Eb:8.712,49.436,83")
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
	public void test_1hv87ytsm4mya_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,speed_camera,bus_stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.409,8.715,49.401,8.7268,49.434,8.704561,49.403252|8.704561,49.403252,8.7438,49.41691,8.734,49.4049,8.704,49.431,8.704561,49.403252|8.704561,49.403252,8.7038,49.413,8.7252,49.439,8.7048,49.4104,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_1jetbjfr8trom_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"WyyKd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.414],[8.741066,49.409],[8.743,49.411254],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "e:8.728,49.42896,2|smuju:8.732562,49.4308,3|SieoE:8.7318,49.4274,820239190")
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
	public void test_1if12ozwscrw3_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("bboxes", "TKwZD:8.678,49.4185,8.74836,49.393|If:8.670,49.4091,8.7568,49.380|cuRoP:8.672,49.417,8.7331,49.391|sl:8.6628,49.412,8.7206,49.3974")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-02-17")
				.queryParam("bpolys", "8.704561,49.403252,8.743,49.437,8.705,49.428848,8.7040,49.404,8.704561,49.403252")
				.queryParam("bcircles", "8.717,49.43277,2|8.741,49.40275,683")
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
	public void test_1ib0gv9libdq0_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.699,49.427,8.707,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("time", "2016-07-29")
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
	public void test_u7r9tqhx7ynm_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LzNKS:8.658,49.4009,8.7059,49.390|YioDr:8.683111,49.411,8.7040,49.388|EQ:8.672,49.42649,8.7445,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-10-15")
				.queryParam("timeout", "71")
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
	public void test_rhgkvwx5a25i_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,yes,tower")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2017-04-02")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "Ae:8.707,49.402,6|Jt:8.735,49.438,498")
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
	public void test_uv5vb1urmrtx_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6586,49.415,8.7128,49.381|8.654478,49.406619,8.736838,49.383|8.694,49.419,8.75797,49.3913")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "e:8.704561,49.403252,8.730,49.4115,8.705,49.43267,8.703,49.422578,8.704561,49.403252")
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
	public void test_rhala56g23p1_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=*")
				.queryParam("groupByValues", "station")
				.queryParam("bboxes", "Ceu:8.668304,49.420582,8.717,49.392452")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "YEZ:8.72258,49.414,8")
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
	public void test_u8aobdzyw2eq_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_signals,service")
				.queryParam("filter", "foot=*")
				.queryParam("bboxes", "gIftB:8.6586,49.405449,8.723574,49.3840")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2015-07-02")
				.queryParam("timeout", "71")
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
	public void test_urguu8bf2fxv_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.680542,49.42730,8.70033,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "65")
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
	public void test_s13chv1xlyyb_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "steps,cycleway,traffic_mirror")
				.queryParam("bboxes", "O:8.6826,49.400,8.748,49.3827")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-04-17")
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
	public void test_1iv72kdrkx204_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "YkizK:8.695608,49.4099,8.708,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2016-05-11")
				.queryParam("bpolys", "8.704561,49.403252,8.723,49.420,8.704,49.417,8.724412,49.408,8.704561,49.403252|8.704561,49.403252,8.735869,49.411,8.737,49.4189,8.745,49.4325,8.704561,49.403252|8.704561,49.403252,8.727,49.4160,8.716,49.414,8.746,49.415,8.704561,49.403252")
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
	public void test_u8anuwi3fu5d_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.43536,8.7232,49.431713,8.70445,49.408,8.704561,49.403252")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "b:8.7193,49.4021,65")
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
	public void test_1jyd9ybjlung0_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,civic")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2015-07-19")
				.queryParam("bcircles", "TQFM:8.749,49.413363,61|v:8.744780,49.42974,45")
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
	public void test_t81up42ju6up_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,civic")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "j:8.704561,49.403252,8.7332,49.413,8.7078,49.4199,8.7290,49.4245,8.704561,49.403252|SZ:8.704561,49.403252,8.708,49.429,8.708,49.43875,8.71434,49.41976,8.704561,49.403252|ExQao:8.704561,49.403252,8.735,49.422,8.7088,49.423,8.7351,49.4043,8.704561,49.403252")
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
	public void test_skxux014i04x_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "civic,secondary,roof")
				.queryParam("filter", "landuse!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-11-11")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "GNiR:8.735,49.436276,9")
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
	public void test_1k22bwv1qkawg_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* or area:(1.0 .. 1E6)")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2018-03-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"C\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713534,49.4305],[8.702,49.4243],[8.742,49.4376],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"JsXc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.42913],[8.7113,49.4064],[8.7005,49.400],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "82")
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
	public void test_vbcd1450vl13_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "mv:8.6745,49.411,8.71295,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("time", "2008-11-02")
				.queryParam("timeout", "89")
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
	public void test_1k22u5ogwmud2_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.718,49.400,8.732,49.433,8.704,49.4163,8.704561,49.403252|8.704561,49.403252,8.707,49.407,8.704,49.4212,8.7030,49.422081,8.704561,49.403252|8.704561,49.403252,8.737972,49.411,8.701,49.4199,8.718868,49.424,8.704561,49.403252")
				.queryParam("timeout", "32")
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
	public void test_1h7fuvjoxv49t_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-04-30")
				.queryParam("bpolys", "TBzL:8.704561,49.403252,8.7457,49.4201,8.7439,49.408914,8.7409,49.414,8.704561,49.403252|x:8.704561,49.403252,8.735600,49.408,8.7176,49.405,8.742704,49.416,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_1hv5jrx0g0g8n_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or geometry:line or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "P:8.704561,49.403252,8.738,49.424,8.726686,49.417,8.738,49.408,8.704561,49.403252|lsQ:8.704561,49.403252,8.73334,49.4026,8.701,49.4282,8.747,49.4274,8.704561,49.403252|Kr:8.704561,49.403252,8.7105,49.408416,8.7044,49.425,8.709,49.423643,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_u88gce1fn3vo_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=*")
				.queryParam("bboxes", "8.674,49.410,8.705,49.388")
				.queryParam("time", "2015-03-14")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "A:8.71651,49.4051,7")
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
	public void test_rkwtwuct7ujo_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-04-14")
				.queryParam("bcircles", "XSH:8.732,49.4376,7")
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
	public void test_skms4kxob49y_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-11-25")
				.queryParam("bpolys", "pt:8.704561,49.403252,8.71697,49.4199,8.744364,49.40757,8.744,49.405483,8.704561,49.403252|gyasD:8.704561,49.403252,8.719,49.417268,8.705,49.414833,8.721,49.423,8.704561,49.403252")
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
	public void test_1ib5xdoyc39eu_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("time", "2012-08-20")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "8.735,49.404,9")
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
	public void test_1ib36drrdf68y_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2007-12-14")
				.queryParam("bpolys", "R:8.704561,49.403252,8.72733,49.401,8.700,49.418845,8.703732,49.429,8.704561,49.403252|cyaOz:8.704561,49.403252,8.728382,49.4161,8.7141,49.41493,8.704571,49.410,8.704561,49.403252|CLhi:8.704561,49.403252,8.712805,49.438476,8.739,49.416,8.703,49.420,8.704561,49.403252")
				.queryParam("timeout", "54")
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
	public void test_1hux7abs8h645_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "YtYz:8.704561,49.403252,8.738,49.4326,8.7094,49.439,8.704,49.4090,8.704561,49.403252|ryy:8.704561,49.403252,8.7092,49.400,8.720,49.40118,8.7041,49.430,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_1jyg1ce5t8j1i_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "8.7436,49.421,4")
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
	public void test_1jy2pkhexn2nq_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "R:8.704561,49.403252,8.702,49.414,8.734,49.4235,8.70660,49.4110,8.704561,49.403252|BZoqE:8.704561,49.403252,8.713,49.42872,8.7044,49.40797,8.7432,49.42307,8.704561,49.403252|JH:8.704561,49.403252,8.7027,49.426,8.701,49.4091,8.73145,49.422,8.704561,49.403252")
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
	public void test_s50nfnh5xp9u_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or length:( .. 100)")
				.queryParam("bcircles", "ShswE:8.748,49.435,6|ZepL:8.746,49.403,51")
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
	public void test_1iv9vku3khzxy_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6622,49.403,8.7553,49.3941")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
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
	public void test_1iusre98f27g7_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "DZr:8.704561,49.403252,8.731,49.434,8.7012,49.4213,8.735,49.403,8.704561,49.403252|K:8.704561,49.403252,8.743,49.426060,8.72256,49.434,8.701539,49.4020,8.704561,49.403252|neoBq:8.704561,49.403252,8.749,49.43300,8.7484,49.4305,8.743,49.41018,8.704561,49.403252")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "I:8.714,49.428,10")
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
	public void test_1jew1d9zgqt68_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.685,49.417,8.7526,49.390|8.660,49.409,8.724,49.395")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_1h7zssg3y1ir7_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or not type:way and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "lT:8.67320,49.423,8.7018,49.3914|VJkKy:8.688,49.41700,8.714,49.38785|j:8.675,49.401,8.725536,49.380")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-12-12")
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
	public void test_u7ol5vmhy0xc_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=*")
				.queryParam("bboxes", "Kub:8.689,49.42153,8.721,49.395|qNV:8.663,49.4252,8.73001,49.391")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-03-29")
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
	public void test_1ib38q3zzwg8k_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "DkUL:8.679,49.422,8.7406,49.389|ShkyP:8.6936,49.427,8.7419,49.392|VqeO:8.687,49.412,8.7095,49.3878")
				.queryParam("keys", "highway")
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
	public void test_us2yp3ujkj7b_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2018-03-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"um\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7471,49.42523],[8.716,49.41237],[8.7355,49.431],[8.704561,49.403252]]]}}]}")
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
	public void test_uvhfhhhaf1v5_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=*")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("time", "2016-10-23")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "eShaE:8.709,49.415,5|c:8.73010,49.428,677")
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
	public void test_1hr5enb4oa0j6_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.67962,49.408,8.750,49.381|8.662133,49.406993,8.707,49.395")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-08-27")
				.queryParam("timeout", "96")
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
	public void test_vb91rov1vkv7_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("time", "2009-07-11")
				.queryParam("bcircles", "f:8.716058,49.4106,95|JxbQV:8.743,49.401,6")
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
	public void test_vbngisgypqw6_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,service")
				.queryParam("bboxes", "8.688,49.41438,8.7265,49.398")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
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
	public void test_r1fmmvnplhlv_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.654,49.426,8.7492,49.388|8.655,49.40625,8.735,49.384|8.667,49.416,8.730,49.380|8.6624,49.4219,8.74704,49.3945")
				.queryParam("groupByKey", "building")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-01-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7471,49.416],[8.706,49.42155],[8.7077,49.4203],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"vTj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.417],[8.70456,49.402],[8.716,49.4231],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "8.7050,49.40323,95396860114")
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
	public void test_t4nf2iok2a0g_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.705,49.4267,75")
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
	public void test_u88gck0qq44l_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "C:8.704561,49.403252,8.737,49.438925,8.708838,49.407,8.701,49.4048,8.704561,49.403252|b:8.704561,49.403252,8.738,49.4376,8.72947,49.428,8.70469,49.410029,8.704561,49.403252|OhgOR:8.704561,49.403252,8.710,49.4392,8.7141,49.433,8.704403,49.43800,8.704561,49.403252")
				.queryParam("timeout", "81")
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
	public void test_t4hssyp4amgh_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,service")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "U:8.704561,49.403252,8.739,49.438,8.704587,49.416,8.72866,49.4377,8.704561,49.403252")
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
	public void test_vf6z032p71h1_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.731,49.406,8.722761,49.4104,8.700,49.4158,8.704561,49.403252|8.704561,49.403252,8.743,49.410,8.7059,49.436,8.705,49.421,8.704561,49.403252|8.704561,49.403252,8.735,49.437,8.737,49.42051,8.7043,49.42838,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_vbsgz62sschf_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2017-08-18")
				.queryParam("timeout", "22")
				.queryParam("groupByKeys", "destination,sidewalk")
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
	public void test_t4vo4q67hbuh_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2011-07-10")
				.queryParam("bpolys", "8.704561,49.403252,8.7059,49.4333,8.734539,49.411,8.7046,49.412,8.704561,49.403252|8.704561,49.403252,8.700,49.4372,8.715,49.434927,8.7003,49.405,8.704561,49.403252")
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
	public void test_1jed6i3v69ovs_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2012-03-02")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.41442,8.7284,49.404,8.728,49.406,8.704561,49.403252|8.704561,49.403252,8.739,49.432401,8.702,49.415,8.741,49.4094,8.704561,49.403252")
				.queryParam("timeout", "70")
				.queryParam("groupByKeys", "lanes:forward,landuse")
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
	public void test_1jezcp240367m_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-10-24")
				.queryParam("bpolys", "sXj:8.704561,49.403252,8.746,49.416,8.70911,49.414840,8.7162,49.431,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:housenumber,bicycle")
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
	public void test_1hbg1hmwwfmub_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.6924,49.4087,8.741,49.3913|dMf:8.66673,49.4008,8.705,49.391|jRwrN:8.675,49.413,8.7357,49.3842|gyKa:8.675679,49.410829,8.723,49.396")
				.queryParam("format", "json")
				.queryParam("timeout", "29")
				.queryParam("groupByKeys", "type,turn:lanes")
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
	public void test_1iykislhje3hz_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.681,49.41555,8.705,49.3998|8.677,49.4090,8.721638,49.3861|8.69256,49.4019,8.7412,49.3855|8.6540,49.402,8.712,49.398042")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.71343,49.409704,8.700,49.4395,8.7045,49.428,8.704561,49.403252|8.704561,49.403252,8.745,49.4007,8.7043,49.4067,8.735,49.429707,8.704561,49.403252|8.704561,49.403252,8.7332,49.421544,8.733272,49.405,8.7342,49.432,8.704561,49.403252")
				.queryParam("groupByKeys", "destination,addr:city")
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
	public void test_s506akwq7vj6_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("time", "2011-01-27")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "8.73936,49.432,5|8.720,49.406,41|8.7445,49.4015,4|8.741590,49.425,77")
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
	public void test_s15msw3k808h_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "B:8.675,49.414,8.706,49.3928")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "48")
				.queryParam("groupByKeys", "network,destination,tracktype")
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
	public void test_1jym2fbsrp25v_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-03-21")
				.queryParam("bpolys", "8.704561,49.403252,8.7064,49.428,8.70579,49.4380,8.708,49.429930,8.704561,49.403252|8.704561,49.403252,8.712374,49.407,8.7048,49.432,8.7049,49.4233,8.704561,49.403252|8.704561,49.403252,8.715,49.4265,8.7143,49.4124,8.7336,49.4264,8.704561,49.403252")
				.queryParam("groupByKeys", "maxspeed,lanes:forward")
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
	public void test_1hbdqv7uhjtk6_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-04-11")
				.queryParam("bpolys", "io:8.704561,49.403252,8.716,49.413,8.7029,49.4245,8.707,49.428,8.704561,49.403252|nl:8.704561,49.403252,8.732,49.400,8.7323,49.434,8.714,49.420466,8.704561,49.403252")
				.queryParam("groupByKeys", "bicycle,addr:housenumber,foot")
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
	public void test_1hux4vqbqivxt_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "u:8.67324,49.4100,8.742,49.385|ad:8.681,49.426,8.742852,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "R:8.704561,49.403252,8.723,49.422021,8.7039,49.421,8.7373,49.422,8.704561,49.403252|EFB:8.704561,49.403252,8.7170,49.434649,8.740,49.4387,8.70821,49.434,8.704561,49.403252|y:8.704561,49.403252,8.704774,49.40137,8.748,49.42845,8.70451,49.422167,8.704561,49.403252")
				.queryParam("bcircles", "A:8.741,49.412147,1")
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
	public void test_ubguvay4akhl_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "DgoJ:8.6696,49.4193,8.742,49.395|wI:8.6925,49.424256,8.7526,49.397")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
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
	public void test_1hrjrwvbvkoc9_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,residential,primary_link")
				.queryParam("filter", "tracktype=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "CSj:8.669,49.419,8.746470,49.383|UNm:8.665,49.414,8.701,49.384|C:8.684,49.4297,8.701530,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-02-23")
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
	public void test_s1649n9aeycl_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,hotel,unclassified")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("bpolys", "gEH:8.704561,49.403252,8.71683,49.428,8.72321,49.41643,8.709,49.405668,8.704561,49.403252|vfQ:8.704561,49.403252,8.7443,49.421,8.706,49.43779,8.7484,49.4027,8.704561,49.403252")
				.queryParam("timeout", "71")
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
	public void test_1jxzg93pebfox_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "p:8.733,49.414,7")
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
	public void test_1jeqkjo5zxdfb_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary,yes")
				.queryParam("filter", "sidewalk!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "d:8.704561,49.403252,8.739,49.403,8.735,49.424,8.704608,49.437,8.704561,49.403252|gg:8.704561,49.403252,8.7157,49.415,8.706548,49.43416,8.741571,49.439,8.704561,49.403252")
				.queryParam("bcircles", "8.710501,49.428,1")
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
	public void test_ubrxnhfl6f6t_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "primary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-08-19")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.400443,8.700,49.438,8.7045,49.402112,8.704561,49.403252|8.704561,49.403252,8.7036,49.41726,8.7159,49.4262,8.738,49.430763,8.704561,49.403252|8.704561,49.403252,8.721443,49.405,8.722,49.4173,8.73326,49.402,8.704561,49.403252")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "8.705,49.435119,50")
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
	public void test_qhvnftd140v7_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,living_street")
				.queryParam("bboxes", "D:8.679,49.40952,8.7131,49.396|v:8.6903,49.42915,8.7593,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("timeout", "37")
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
	public void test_urunrjuxy5ia_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69328,49.4261,8.7179,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "71")
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
	public void test_to1ty0npjzuc_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("time", "2007-11-11")
				.queryParam("bcircles", "8.726,49.417241,3")
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
	public void test_qe4cevm6jjhg_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:forward!=* or not type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "8.697,49.419,8.725,49.384|8.6814,49.402,8.746,49.3961")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-10-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"mqwtR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72643,49.439],[8.707227,49.412],[8.70457,49.400],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7475,49.417],[8.733751,49.4059],[8.7202,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
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
	public void test_skxwv3961ago_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.69555,49.4171,8.7186,49.385")
				.queryParam("timeout", "46")
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
	public void test_vb6ae20rg9pu_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.65383,49.417,8.7521,49.395")
				.queryParam("format", "csv")
				.queryParam("time", "2011-11-15")
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
	public void test_1h7ilt2rile0j_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6593,49.4171,8.708,49.3996")
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
	public void test_urej40fqvip0_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ASRC:8.674,49.4288,8.752,49.3986")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-09-27")
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
	public void test_u7wt1zsf4rw5_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"mI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.429],[8.74108,49.403794],[8.702,49.43464],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ks\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.421],[8.7045,49.430],[8.707,49.400],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "SQZbh:8.7347,49.425,3")
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
	public void test_qhql3xn70d2p_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.70175,49.421,8.7481,49.400,8.7392,49.4222,8.704561,49.403252|8.704561,49.403252,8.72954,49.404,8.7364,49.418,8.70067,49.418060,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_qe6m8y8ma8v6_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "xe:8.704561,49.403252,8.72257,49.437,8.707803,49.412,8.704,49.4264,8.704561,49.403252|RX:8.704561,49.403252,8.707,49.419,8.748,49.417,8.70452,49.41310,8.704561,49.403252|q:8.704561,49.403252,8.720943,49.4154,8.7306,49.419,8.7049,49.430,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_skkio754y14j_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "xJ:8.686,49.4160,8.755,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2017-05-19")
				.queryParam("timeout", "61")
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
	public void test_1ibesyyfjzf50_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "FbTsf:8.704561,49.403252,8.727,49.435872,8.70699,49.43939,8.702,49.408,8.704561,49.403252|ba:8.704561,49.403252,8.713,49.418,8.7355,49.414,8.738,49.4221,8.704561,49.403252|NXcXV:8.704561,49.403252,8.720,49.40118,8.704596,49.426,8.70918,49.4122,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_rlb5m3w8cvvq_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "G:8.68593,49.403,8.730230,49.387")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "tracktype=*")
				.queryParam("time", "2011-09-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EAoS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7047,49.426],[8.700269,49.4043],[8.7307,49.4126],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7148,49.403],[8.7095,49.437],[8.7439,49.4328],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "41")
				.queryParam("values2", "emergency_access_point")
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
	public void test_to4m3xkvsgmq_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Q:8.663,49.415,8.747,49.396|w:8.656,49.414114,8.7545,49.3874")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref=* or type:node")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "29")
				.queryParam("values2", "secondary")
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
	public void test_qxttwswdrrkx_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("values", "steps")
				.queryParam("filter2", "ref!=* and type:node")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.41409,8.705,49.405,8.717,49.421117,8.704561,49.403252|8.704561,49.403252,8.731,49.418,8.709760,49.43667,8.701620,49.41482,8.704561,49.403252|8.704561,49.403252,8.742689,49.4355,8.70737,49.41385,8.735,49.4269,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "65")
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
	public void test_1ibbhmo6r1y5y_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "mUnHE:8.6542,49.407,8.735,49.3929|fvS:8.667,49.412,8.7292,49.3935")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "oneway=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
				.queryParam("values2", "track")
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
	public void test_t4tf2d5no6d3_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "barrier!=* or geometry:line")
				.queryParam("bpolys", "8.704561,49.403252,8.731,49.43641,8.704,49.4010,8.7327,49.432,8.704561,49.403252|8.704561,49.403252,8.745704,49.416,8.710947,49.4301,8.738,49.436114,8.704561,49.403252|8.704561,49.403252,8.713083,49.413,8.705964,49.42047,8.704,49.429551,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "34")
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
	public void test_1je9x6s5jw1nl_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("filter2", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("values2", "service")
				.queryParam("bcircles", "A:8.736,49.411,3|wi:8.723196,49.420,2")
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
	public void test_u82xkomlk8c5_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "J:8.655,49.40988,8.728,49.399")
				.queryParam("filter2", "sidewalk=* or not id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "84")
				.queryParam("values2", "steps")
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
	public void test_ursfh17paskw_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref!=* or not type:node or not area:(1.0 .. 1E6)")
				.queryParam("time", "2017-07-03")
				.queryParam("bpolys", "DCUs:8.704561,49.403252,8.740,49.401,8.7171,49.4381,8.704904,49.41901,8.704561,49.403252|BcVXa:8.704561,49.403252,8.7129,49.436114,8.7428,49.423,8.72730,49.411,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_vbf4t7ul75td_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("filter2", "maxspeed!=* or not geometry:polygon")
				.queryParam("time", "2008-04-22")
				.queryParam("bpolys", "8.704561,49.403252,8.714,49.4173,8.702,49.402,8.70454,49.439,8.704561,49.403252|8.704561,49.403252,8.703,49.4317,8.7253,49.436,8.7044,49.4192,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "68")
				.queryParam("values2", "primary_link")
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
	public void test_tnzjn7gj2t6f_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "other")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.415,8.7011,49.428,8.728,49.431137,8.704561,49.403252|8.704561,49.403252,8.744,49.421,8.711,49.404496,8.739,49.400,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_mirror")
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
	public void test_t81cg4timkok_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-08-12")
				.queryParam("bpolys", "vaU:8.704561,49.403252,8.737,49.405,8.73998,49.4277,8.7437,49.403,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "32")
				.queryParam("values2", "bus_stop")
				.queryParam("bcircles", "vT:8.725,49.4294,4")
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
	public void test_qe9vkcap1v1g_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2011-08-31")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "oYt:8.743,49.434,96")
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
	public void test_1jezd0ifsp44w_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("values", "street_lamp")
				.queryParam("filter2", "oneway=* and length:( .. 100)")
				.queryParam("time", "2008-11-18")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "47")
				.queryParam("values2", "steps")
				.queryParam("bcircles", "ksMO:8.7433,49.410,4|ahdAF:8.7310,49.411,4|oZ:8.7346,49.412,30|DDmX:8.7416,49.400253,5")
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
	public void test_1jy7r4d98ykbn_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-08-24")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "DvF:8.72274,49.438,4|anllS:8.7301,49.4153,8|U:8.70313,49.434,78|HMyhI:8.7132,49.410907,3")
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
	public void test_rhlnlq6f7crq_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "f:8.705,49.427,665|u:8.74152,49.4190,1")
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
	public void test_1ib0dr12x6dep_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qu:8.6838,49.420,8.739,49.386|N:8.653,49.420,8.734,49.3825|XYbI:8.661,49.404,8.7139,49.3885")
				.queryParam("types2", "other")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "sidewalk=*")
				.queryParam("time", "2008-03-04")
				.queryParam("values2", "unclassified")
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
	public void test_urhbzb981mph_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.720,49.40437,3|8.746101,49.4067,4|8.727,49.422,8")
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
	public void test_u82wvb3kftx4_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "line,")
				.queryParam("format", "csv")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "sFym:8.740,49.402,2|GCl:8.735,49.433,93")
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
	public void test_vevu9qoarw34_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* or not geometry:line or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "tracktype=* and not id:(1 .. 9999)")
				.queryParam("time", "2009-08-05")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Wv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7434,49.423],[8.7073,49.434840],[8.704,49.4115],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"clOwd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7359,49.431],[8.7155,49.41621],[8.7493,49.43839],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ly\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7015,49.405],[8.7257,49.410],[8.709,49.4304],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_1k253oowhaj3t_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.680748,49.424,8.754,49.3823|8.69881,49.400,8.7543,49.390|8.682781,49.4135,8.749,49.389")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("values", "secondary")
				.queryParam("filter2", "lit!=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_1iunpbepbdjl1_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
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
	public void test_qhndco11kisw_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "p:8.673077,49.4180,8.74780,49.3990")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-20")
				.queryParam("timeout", "98")
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
	public void test_1hrorz7h1ke2d_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-05-12")
				.queryParam("bpolys", "wqIp:8.704561,49.403252,8.7086,49.4118,8.704,49.4329,8.708,49.4278,8.704561,49.403252")
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
	public void test_urp33zdbpkc0_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* or geometry:polygon and id:(1 .. 9999)")
				.queryParam("bpolys", "wu:8.704561,49.403252,8.7163,49.432,8.72640,49.411,8.7018,49.4082,8.704561,49.403252")
				.queryParam("timeout", "60")
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
	public void test_qxl1tzog954g_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "ZikgV:8.704561,49.403252,8.714,49.430,8.706,49.438,8.702035,49.416,8.704561,49.403252|dxHrL:8.704561,49.403252,8.712,49.438,8.727777,49.423,8.714,49.415,8.704561,49.403252|Kozb:8.704561,49.403252,8.7015,49.416,8.7224,49.400,8.7012,49.4368,8.704561,49.403252")
				.queryParam("timeout", "73")
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
	public void test_qhq2blgg16b5_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "A:8.6655,49.4144,8.716485,49.3856|F:8.674,49.402,8.707,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.42582],[8.7042,49.410776],[8.707,49.4187],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "8.717518,49.40578,2|8.747446,49.413,4")
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
	public void test_1jew4haz73s6a_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "8.7055,49.421218,5|8.734,49.43968,8|8.732073,49.4276,6")
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
	public void test_qxocdrjx7j1x_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("bboxes", "KBY:8.6915,49.407,8.70356,49.381")
				.queryParam("time", "2016-11-23")
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
	public void test_trznwobvmyqp_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* or id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Kwd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.437630],[8.702,49.423],[8.700734,49.412],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"X\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723544,49.419],[8.715,49.407],[8.745,49.427],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "89")
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
	public void test_1hb7ps0q0yhx0_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "S:8.69746,49.422010,8.729115,49.394|QbIHx:8.694,49.40254,8.71689,49.3949")
				.queryParam("format", "csv")
				.queryParam("time", "2013-07-30")
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
	public void test_sobtdqvpnsrq_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "gBBzl:8.680069,49.42443,8.7213,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "Uzw:8.7363,49.4362,7")
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
	public void test_ts2g2n956drt_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2014-02-04")
				.queryParam("bcircles", "oZxrl:8.704,49.42564,4")
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
	public void test_s15lk3po2noj_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2008-07-24")
				.queryParam("bcircles", "8.741,49.421437,4|8.72862,49.415,44")
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
	public void test_1iextg3eo5k69_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and length:( .. 100)")
				.queryParam("time", "2009-04-23")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "yMX:8.736251,49.43446,80|YAy:8.737,49.41668,6")
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
	public void test_1jia2kgvzolrq_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.73228,49.415,8.70456,49.418,8.7334,49.4198,8.704561,49.403252|8.704561,49.403252,8.714,49.423,8.7257,49.408,8.704,49.415,8.704561,49.403252")
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
	public void test_1h84t8p1p4m7a_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:point or id:(1 .. 9999)")
				.queryParam("bboxes", "Iw:8.688440,49.417,8.706,49.3896|rrsp:8.68629,49.410,8.756007,49.381|K:8.6687,49.420,8.732,49.382")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-04-06")
				.queryParam("bcircles", "cyK:8.7349,49.429,1|v:8.711,49.4210,1")
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
	public void test_tnz1s1rbi5o7_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* and length:( .. 100)")
				.queryParam("bboxes", "8.6535,49.411,8.7426,49.388|8.667899,49.402,8.71967,49.3800")
				.queryParam("time", "2013-07-10")
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
	public void test_skv2acxqx83d_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "ATt:8.7476,49.410,1|C:8.722,49.4241,5|nF:8.726,49.418,3|y:8.70280,49.4350,5")
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
	public void test_s15meqno35fb_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-03-18")
				.queryParam("bpolys", "8.704561,49.403252,8.72161,49.4289,8.715,49.404,8.719,49.4148,8.704561,49.403252|8.704561,49.403252,8.728,49.434,8.70961,49.422,8.702,49.425610,8.704561,49.403252|8.704561,49.403252,8.72299,49.400064,8.720,49.43351,8.716,49.4135,8.704561,49.403252")
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
	public void test_vbhdvej2abe8_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-11-01")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745340,49.436492],[8.7087,49.409],[8.717,49.431],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "72")
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
	public void test_urun1qjnw4me_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("time", "2017-03-05")
				.queryParam("bpolys", "JXSSZ:8.704561,49.403252,8.734281,49.429,8.7045,49.439,8.73839,49.414,8.704561,49.403252|d:8.704561,49.403252,8.740,49.407644,8.715,49.407,8.720,49.409,8.704561,49.403252")
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
	public void test_rl7v4mjt0ks7_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Uu:8.704561,49.403252,8.740,49.412,8.7270,49.4396,8.712,49.436,8.704561,49.403252|ZrUm:8.704561,49.403252,8.73293,49.429,8.716,49.434,8.7462,49.428245,8.704561,49.403252|L:8.704561,49.403252,8.71635,49.404783,8.725,49.403,8.70648,49.400,8.704561,49.403252")
				.queryParam("timeout", "91")
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
	public void test_1iuvgdalvis6r_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and not id:(1 .. 9999)")
				.queryParam("bcircles", "b:8.734,49.4183,6|kNccn:8.74362,49.4188,8|H:8.7492,49.407,6")
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
	public void test_1ibeanhx13xv9_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-03-18")
				.queryParam("bcircles", "xIrrh:8.701,49.403,7|vFzaJ:8.745,49.433379,7")
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
	public void test_qhndqp5ugy1u_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Gok:8.6731,49.405,8.700,49.394")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-12-09")
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
	public void test_qhib9plnixr5_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "primary")
				.queryParam("time", "2018-03-28")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.748431,49.410,6|8.732281,49.4372,8|8.708,49.4180,3")
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
	public void test_qxtdxrotgcvo_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.67323,49.405,8.7277,49.380")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_qhvnic58ggu0_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.405,8.7344,49.419,8.7091,49.408,8.704561,49.403252|8.704561,49.403252,8.7151,49.435,8.706,49.413,8.727,49.428,8.704561,49.403252|8.704561,49.403252,8.7301,49.422934,8.706,49.417646,8.7003,49.426,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_vbmxvvxd4qqu_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "ITUco:8.704561,49.403252,8.7123,49.43674,8.738274,49.4390,8.700,49.4017,8.704561,49.403252|eAeAo:8.704561,49.403252,8.706,49.415,8.70459,49.411612,8.702,49.4076,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_s0uigunwaicl_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=*")
				.queryParam("bcircles", "8.734,49.405397,6")
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
	public void test_sok5evt8a2xu_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,commercial,service")
				.queryParam("filter", "building!=* and length:( .. 100)")
				.queryParam("bboxes", "8.653,49.429,8.737809,49.386|8.662145,49.428,8.724050,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-03-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7365,49.404],[8.72493,49.4243],[8.701,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Fn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.4082],[8.742,49.42946],[8.727,49.408],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"RVFsv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731438,49.41543],[8.717,49.407],[8.744156,49.42101],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "HGz:8.734,49.431,822|vYNIk:8.715,49.43740,2|g:8.74225,49.4382,8")
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
	public void test_u857vrbu5ooh_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "LUMg:8.73365,49.4285,3")
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
	public void test_trqtyac23039_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "steps,platform,primary_link")
				.queryParam("bboxes", "8.67456,49.417,8.716,49.39946")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("time", "2011-02-01")
				.queryParam("timeout", "82")
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
	public void test_s1efl4equa7n_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-08-04")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "8.733,49.4160,2")
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
	public void test_r17ty2qn6ag6_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_signals,steps")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "kZv:8.714,49.401,23|vPCd:8.7371,49.42860,29")
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
	public void test_r17a2a9y1bg2_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6703,49.423,8.715,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("time", "2012-03-13")
				.queryParam("bpolys", "8.704561,49.403252,8.707,49.403,8.7116,49.438,8.711,49.402,8.704561,49.403252|8.704561,49.403252,8.742110,49.42486,8.701,49.4005,8.7309,49.416,8.704561,49.403252|8.704561,49.403252,8.707,49.429,8.7436,49.412,8.7242,49.405,8.704561,49.403252")
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
	public void test_u805epr001nq_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"g\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739145,49.408],[8.702,49.430],[8.703,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.428],[8.703,49.412],[8.729,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "8.71209,49.43998,4|8.7092,49.430,253604545")
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
	public void test_1hvbjp8pafnty_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood")
				.queryParam("bboxes", "8.670119,49.400,8.714,49.380")
				.queryParam("groupByKey", "building")
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
	public void test_t8f5dcc5odo4_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "CLPqf:8.68787,49.421357,8.720889,49.387|ZSW:8.652,49.428,8.7226,49.385|d:8.697210,49.429511,8.709,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2015-05-06")
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
	public void test_u7oi1exavtbo_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-02-19")
				.queryParam("bcircles", "j:8.709844,49.4390,6")
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
	public void test_1jyljq4gd8pwx_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,stop,path")
				.queryParam("groupByKey", "building")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "I:8.704561,49.403252,8.7129,49.408,8.721,49.411,8.746,49.42657,8.704561,49.403252")
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
	public void test_rl2d2oi08850_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.74215,49.411,8.742,49.418,8.704352,49.430,8.704561,49.403252|8.704561,49.403252,8.716,49.412040,8.704561,49.428,8.7118,49.424,8.704561,49.403252|8.704561,49.403252,8.746,49.433,8.7038,49.4334,8.7039,49.401,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_tnz2hh928i0g_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-01-17")
				.queryParam("bpolys", "8.704561,49.403252,8.7019,49.421,8.700338,49.4135,8.7467,49.4107,8.704561,49.403252|8.704561,49.403252,8.719,49.419,8.718,49.4095,8.715,49.427022,8.704561,49.403252|8.704561,49.403252,8.70088,49.419,8.7192,49.432,8.709,49.407,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_qhibq9ezjwog_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory,garage")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-02-15")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "Cok:8.716377,49.4072,1|fD:8.728,49.402,25")
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
	public void test_1jelizua2jjn7_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-12-09")
				.queryParam("bpolys", "x:8.704561,49.403252,8.7435,49.4204,8.7355,49.43856,8.7475,49.413,8.704561,49.403252|o:8.704561,49.403252,8.733,49.435,8.703,49.409,8.736,49.438,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_s4p1n0s2vinl_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.65580,49.406068,8.756,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fIqe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713,49.4335],[8.707825,49.427],[8.724,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wAFPb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7225,49.4194],[8.702,49.4221],[8.725,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "iGruh:8.72677,49.4071,6|VlFmj:8.727,49.4021,3")
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
	public void test_ubuq4v3tifs6_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("bboxes", "wF:8.674,49.4034,8.716,49.3866")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-02-12")
				.queryParam("bcircles", "mE:8.7487,49.4163,6")
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
	public void test_tofnyog4agj7_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.659,49.419,8.72825,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("timeout", "90")
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
	public void test_rhlnafcytc1g_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,primary")
				.queryParam("filter", "lit!=* and geometry:line or length:( .. 100)")
				.queryParam("bboxes", "HHjx:8.683,49.4024,8.7219,49.385|l:8.660,49.427894,8.7337,49.3902|Q:8.669,49.426,8.72841,49.385")
				.queryParam("groupByKey", "highway")
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
	public void test_u82vp662db92_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,civic")
				.queryParam("bboxes", "goN:8.688,49.425,8.729,49.380|aL:8.68521,49.415211,8.715,49.38508|u:8.656,49.4011,8.7225,49.392|ZbC:8.676,49.418,8.7570,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
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
	public void test_qxr2iu7kqcl0_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and length:( .. 100)")
				.queryParam("bboxes", "zuBbR:8.6896,49.408,8.742,49.394")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-06-30")
				.queryParam("timeout", "34")
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
	public void test_1iesa7w2vyn3a_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-10-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"hvT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.410],[8.704560,49.406],[8.7003,49.429],[8.704561,49.403252]]]}}]}")
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
	public void test_1iepexlz325b5_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"sDNla\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.420],[8.702,49.430],[8.74376,49.433],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"QeCL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.433317],[8.7015,49.439421],[8.7411,49.411627],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"mw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.411],[8.7230,49.4194],[8.729,49.4271],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "26")
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
	public void test_ts4qruxon7tx_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iAg:8.670,49.428,8.727750,49.3908")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_t84lb0jz4m5x_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and not type:way")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-10-29")
				.queryParam("bpolys", "8.704561,49.403252,8.732362,49.415,8.735582,49.434,8.707,49.422,8.704561,49.403252|8.704561,49.403252,8.715,49.4119,8.704,49.4230,8.74970,49.4058,8.704561,49.403252|8.704561,49.403252,8.726,49.4114,8.7043,49.43168,8.719470,49.429792,8.704561,49.403252")
				.queryParam("timeout", "78")
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
	public void test_urel27wq0lde_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("bcircles", "Qv:8.742,49.4344,79|ZQB:8.70685,49.417,9")
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
	public void test_s0v18mcvospv_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-07-21")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "c:8.735,49.427735,9")
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
	public void test_r1icrzz31c9w_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-08-13")
				.queryParam("bpolys", "HTRD:8.704561,49.403252,8.7452,49.423,8.7109,49.418,8.712624,49.404827,8.704561,49.403252|QmJ:8.704561,49.403252,8.710,49.4145,8.72635,49.40409,8.706,49.401,8.704561,49.403252|v:8.704561,49.403252,8.733,49.4225,8.747,49.4366,8.70454,49.426,8.704561,49.403252")
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
	public void test_1iay55m5od0s8_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-04-09")
				.queryParam("timeout", "100")
				.queryParam("bcircles", "8.7332,49.402,6|8.705,49.4142,6")
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
	public void test_qeffkvanitt2_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "jk:8.7375,49.4175,50")
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
	public void test_skpl2nzaj1o1_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-09-26")
				.queryParam("timeout", "100")
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
	public void test_vbcea01w8bw7_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Y:8.697,49.417,8.711,49.397")
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
	public void test_t4f3d3zvm9mf_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and geometry:line or not area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-04-03")
				.queryParam("bpolys", "8.704561,49.403252,8.733461,49.409079,8.7040,49.416,8.703,49.434,8.704561,49.403252|8.704561,49.403252,8.70400,49.426,8.736,49.412,8.7370,49.422,8.704561,49.403252")
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
	public void test_t4sxj57v7hv5_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-06-17")
				.queryParam("bpolys", "n:8.704561,49.403252,8.7103,49.4022,8.701,49.416271,8.700,49.422,8.704561,49.403252")
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
	public void test_1hv0g4w1ttzcg_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-05-21")
				.queryParam("bpolys", "k:8.704561,49.403252,8.74017,49.400,8.7325,49.412,8.705,49.407,8.704561,49.403252|K:8.704561,49.403252,8.72871,49.425202,8.7100,49.4127,8.7318,49.415,8.704561,49.403252|O:8.704561,49.403252,8.731075,49.4154,8.702864,49.424,8.7061,49.434,8.704561,49.403252")
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
	public void test_toa43qpt27n4_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and geometry:line")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-08-07")
				.queryParam("bcircles", "8.72674,49.417,2|8.739,49.43668,1")
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
	public void test_vb6diis6ma0p_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ArTSN:8.6969,49.4000,8.717,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
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
	public void test_uvbe2pc0agdd_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "qU:8.720,49.4237,2")
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
	public void test_rl8e5gkkxd0y_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-09-09")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.70132,49.4209,3")
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
	public void test_rl8e84wbygkm_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2008-02-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yslfK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.400],[8.71651,49.408351],[8.7293,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_1ibjskqco2j3l_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,hospital,primary")
				.queryParam("bboxes", "J:8.665,49.4035,8.716,49.3862|sSWHZ:8.67033,49.424,8.736,49.3878|Qd:8.687023,49.411,8.726,49.388|qlz:8.655334,49.4027,8.7228,49.38676")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-07-19")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "t:8.712,49.40033,7")
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
	public void test_vbhfu26xwa43_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and length:( .. 100)")
				.queryParam("groupByValues", "give_way,hut,platform")
				.queryParam("bboxes", "GoAsy:8.659220,49.405926,8.7248,49.394|u:8.6521,49.400,8.706,49.3828")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2013-07-04")
				.queryParam("bpolys", "SJ:8.704561,49.403252,8.718,49.439,8.702,49.415,8.72439,49.4386,8.704561,49.403252|aW:8.704561,49.403252,8.7467,49.435,8.7182,49.404,8.728,49.425,8.704561,49.403252|fFnF:8.704561,49.403252,8.732,49.422,8.7100,49.4260,8.749,49.400,8.704561,49.403252")
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
	public void test_uvbcu7iw144z_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "g:8.6646,49.418,8.7274,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
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
	public void test_1jew2jbdm2hye_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=* and type:way and length:( .. 100)")
				.queryParam("bboxes", "WmSJ:8.6583,49.403,8.7222,49.393504|mRS:8.6740,49.426,8.752,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2007-10-16")
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
	public void test_toiyuchw1krm_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6513,49.425,8.728,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "56")
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
	public void test_qe4bpe4iwu3n_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-10-12")
				.queryParam("bcircles", "S:8.73909,49.40751,7|Ni:8.725,49.433019,9056362404")
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
	public void test_1hbdqei2wbgvn_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("groupByValues", "pedestrian,residential")
				.queryParam("bboxes", "8.6758,49.413,8.712,49.3932")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "89")
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
	public void test_qdpzlncseczc_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,pedestrian")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("time", "2009-08-03")
				.queryParam("bcircles", "hF:8.7025,49.407089,4|ihYK:8.703,49.42535,75")
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
	public void test_1jyd93qm14cae_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street,ship,tower")
				.queryParam("filter", "turn:lanes!=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "Bn:8.658191,49.4099,8.702,49.393|SI:8.658,49.410,8.7349,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2015-02-05")
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
	public void test_1h822k89j08xc_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,tertiary")
				.queryParam("bboxes", "nhWUs:8.6968,49.4217,8.7559,49.394|iM:8.6539,49.42785,8.7591,49.381|Ofg:8.6632,49.417,8.735266,49.3806|do:8.697,49.413,8.7594,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-02-16")
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
	public void test_qxiatw88ksit_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-06-19")
				.queryParam("groupByKeys", "surface,landuse")
				.queryParam("bcircles", "PIZqi:8.739,49.438,3")
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
	public void test_uv6cggl3l4xl_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or type:node and not length:( .. 100)")
				.queryParam("bboxes", "hAcRP:8.6606,49.413,8.708,49.387")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "id:8.704561,49.403252,8.740,49.4284,8.704581,49.41374,8.710,49.4098,8.704561,49.403252|F:8.704561,49.403252,8.733,49.404,8.704,49.413,8.708,49.4047,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_1h7rglxsarvj5_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687,49.427,8.717,49.3927|8.666,49.420600,8.7553,49.3811|8.664,49.408,8.707,49.383|8.669941,49.428,8.733,49.397644")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-05-16")
				.queryParam("groupByKeys", "source:maxspeed,addr:country")
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
	public void test_ublvbts0q9nn_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "62")
				.queryParam("groupByKeys", "addr:country,lanes:backward,turn")
				.queryParam("bcircles", "8.741883,49.411228,8")
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
	public void test_1h7lgdork12cz_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "f:8.655,49.40974,8.7546,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-10-24")
				.queryParam("groupByKeys", "addr:country,addr:city")
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
	public void test_vb41ph07eq7k_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or geometry:line")
				.queryParam("values", "bus_stop")
				.queryParam("groupByKeys", "network,name")
				.queryParam("bcircles", "a:8.731108,49.414,8")
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
	public void test_vey5d9ccqx4l_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=*")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-02-25")
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
	public void test_1iykjvq91q5gx_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("groupByKeys", "surface,addr:postcode,barrier")
				.queryParam("bcircles", "kqp:8.737,49.41529,9")
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
	public void test_ubgdsqs0apti_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "z:8.704561,49.403252,8.702,49.419,8.70479,49.438449,8.708,49.4225,8.704561,49.403252")
				.queryParam("timeout", "38")
				.queryParam("groupByKeys", "barrier,addr:street")
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
	public void test_toddq2mvjn06_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7296,49.409],[8.700,49.43583],[8.7470,49.438],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IfyUe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.407],[8.7048,49.436149],[8.712,49.409835],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
				.queryParam("groupByKeys", "bicycle,addr:country")
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
	public void test_1jia1s6qxoq49_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "U:8.704561,49.403252,8.728565,49.427,8.706,49.4363,8.7033,49.439196,8.704561,49.403252")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "8.7292,49.42952,3")
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
	public void test_1k1zkgphz5hyr_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or geometry:polygon")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-08-10")
				.queryParam("bpolys", "Rae:8.704561,49.403252,8.7331,49.430,8.70470,49.42133,8.747,49.416,8.704561,49.403252")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "Ab:8.7159,49.40277,5")
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
	public void test_1iut7rfier7ed_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,secondary_link")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-08-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"mB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7467,49.424],[8.705,49.4397],[8.702,49.419],[8.704561,49.403252]]]}}]}")
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
	public void test_1ib0x8q2kuj3q_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified,synagogue,give_way")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.701977,49.42153,6")
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
	public void test_toa2jcf0e5v9_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "H:8.666870,49.40868,8.700821,49.390|nm:8.650,49.405,8.7188,49.385")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-01-29")
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
	public void test_1jy89i870t3qq_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "track")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-02-02")
				.queryParam("timeout", "79")
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
	public void test_1hrgyl0o8auyd_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or length:( .. 100)")
				.queryParam("bboxes", "BqGY:8.697,49.424,8.718,49.3917|rW:8.6753,49.4062,8.732,49.384|RpCs:8.656,49.4138,8.713,49.383")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-01-25")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "m:8.7353,49.41615,2|jJCv:8.733,49.43761,1")
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
	public void test_1k1wt2v5dvfc1_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and length:( .. 100)")
				.queryParam("bboxes", "HBGmG:8.69137,49.408734,8.74349,49.384|p:8.677,49.4142,8.759038,49.390|t:8.668,49.416,8.74067,49.386|yXP:8.673,49.408,8.7232,49.38349")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2007-10-27")
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
	public void test_s506ohpj5vzo_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "station,secondary_link")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "a:8.7035,49.436,8")
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
	public void test_skyeel1npohj_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,station,path")
				.queryParam("bboxes", "8.6625,49.41781,8.715,49.3989")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("time", "2015-12-19")
				.queryParam("timeout", "50")
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
	public void test_1hv5iltcs3zhe_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* or not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-08-24")
				.queryParam("timeout", "41")
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
	public void test_vb41ec4488c9_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TUDJb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71851,49.438],[8.743,49.437],[8.7176,49.4213],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7039,49.428934],[8.704659,49.403963],[8.734,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"FG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725916,49.407666],[8.709,49.433],[8.727,49.438],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "58")
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
	public void test_t49in71cjeih_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "H:8.67272,49.425,8.72276,49.3816")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-08-02")
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
	public void test_t4svwjye2a1v_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.7416,49.429,8.727512,49.415,8.719,49.43296,8.704561,49.403252|8.704561,49.403252,8.701,49.420,8.70453,49.4396,8.721,49.42369,8.704561,49.403252")
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
	public void test_ure3iw07wzsm_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.724,49.41949,7|8.725,49.436,327")
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
	public void test_1ji1oilp8r6g1_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or not length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2018-02-07")
				.queryParam("bcircles", "zd:8.704,49.4351,9|w:8.745,49.426,8")
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
	public void test_1ibh21ez6kwmv_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "Gk:8.734,49.408,3|wO:8.721,49.43286,55")
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
	public void test_sl14maht5stx_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"F\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7034,49.426],[8.7183,49.4335],[8.723621,49.438],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "96")
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
	public void test_qxw3dks4fs52_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bcircles", "8.706,49.412789,89|8.7371,49.429,3|8.7104,49.4203,66")
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
	public void test_1iv3suv4gei5g_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2013-11-07")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "8.7293,49.427931,7|8.7495,49.418,81|8.736,49.4044,2")
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
	public void test_1k1wq0x4vr2au_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "SnMmy:8.66534,49.407,8.708,49.39046|wE:8.68000,49.411,8.709056,49.3956")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "Ds:8.737,49.420,9|K:8.74940,49.4278,92|i:8.740,49.425,76")
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
	public void test_1ib98933sen92_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and type:node")
				.queryParam("bboxes", "gDBWO:8.676,49.4227,8.7465,49.382")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
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
	public void test_qy1oxshfbcc2_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "87")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "qJ:8.702,49.40584,8")
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
	public void test_rhod3xrnktph_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("filter2", "service=driveway")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.708,49.420502,8|8.7486,49.4275,6")
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
	public void test_rlapk9oi2qt3_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "node,")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "highway!=* or geometry:polygon or not length:( .. 100)")
				.queryParam("bpolys", "OuTew:8.704561,49.403252,8.728,49.418,8.730,49.40169,8.727,49.413,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "59")
				.queryParam("values2", "cycleway")
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
	public void test_1iyfgdwqr4wmv_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "bus_stop")
				.queryParam("time", "2012-08-13")
				.queryParam("timeout", "25")
				.queryParam("values2", "service")
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
	public void test_r1ix48pt7nfn_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
				.queryParam("bcircles", "ovFls:8.738,49.427,551")
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
	public void test_1h7ooufexed0j_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "n:8.697,49.428270,8.738,49.384")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("format", "csv")
				.queryParam("time", "2007-11-01")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
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
	public void test_1jei6vo4eopiu_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,relation")
				.queryParam("values", "track")
				.queryParam("time", "2016-01-13")
				.queryParam("bcircles", "8.727,49.403,1")
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
	public void test_vbk6tjyz8dh4_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* and length:( .. 100)")
				.queryParam("bboxes", "8.693468,49.415863,8.7049,49.381|8.686,49.429,8.7591,49.393")
				.queryParam("types2", "polygon,")
				.queryParam("format", "csv")
				.queryParam("filter2", "building!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2011-11-18")
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
	public void test_s5072cw2trvn_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "rHR:8.704561,49.403252,8.711,49.401,8.704,49.4157,8.708,49.4044,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "speed_camera")
				.queryParam("bcircles", "rPJ:8.731982,49.421300,6")
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
	public void test_skye0c1kn22h_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "zM:8.704561,49.403252,8.7297,49.413624,8.727,49.424,8.703,49.427,8.704561,49.403252")
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
	public void test_1h81zwj8g9m48_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "smoothness=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "65")
				.queryParam("values2", "street_lamp")
				.queryParam("bcircles", "8.718,49.405,6|8.733,49.43536,3")
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
	public void test_qhtd77i0rdit_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hSgAi:8.6598,49.417216,8.740,49.397325|Citb:8.697,49.404,8.7239,49.395|F:8.658423,49.408,8.713,49.386")
				.queryParam("time", "2008-09-04")
				.queryParam("keys2", "highway")
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
	public void test_1hroqce049kqf_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("bcircles", "EN:8.744,49.4028,8")
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
	public void test_to7vce9n1t2c_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=*")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.742,49.427690,8.714424,49.41984,8.712,49.43720,8.704561,49.403252")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "hUC:8.716,49.4070,6|Q:8.7009,49.409,1")
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
	public void test_1hbm2i64na8mq_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,other")
				.queryParam("time", "2014-11-04")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "cPrL:8.719,49.418681,5|ZJU:8.7262,49.417,9")
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
	public void test_1jygit5c5e1iq_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "addr:postcode=* or id:(1 .. 9999)")
				.queryParam("time", "2008-08-29")
				.queryParam("bpolys", "tPa:8.704561,49.403252,8.702,49.434,8.7499,49.413,8.706,49.4357,8.704561,49.403252|I:8.704561,49.403252,8.703,49.4250,8.724,49.419,8.704,49.413,8.704561,49.403252|tl:8.704561,49.403252,8.701,49.431,8.700549,49.43407,8.720,49.407,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_sohw173yk8dh_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "turn!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2015-10-27")
				.queryParam("bpolys", "iQhtG:8.704561,49.403252,8.7288,49.402,8.700,49.40994,8.7132,49.404,8.704561,49.403252|BOnOl:8.704561,49.403252,8.7097,49.4073,8.743,49.4080,8.707,49.404,8.704561,49.403252|h:8.704561,49.403252,8.7252,49.4076,8.706,49.438,8.731,49.404,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
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
	public void test_t4flczsu0b3n_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
				.queryParam("values2", "traffic_mirror")
				.queryParam("bcircles", "L:8.745,49.414,5|dq:8.712,49.4262,2|wMfgu:8.74342,49.424,37|G:8.713829,49.417,429")
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
	public void test_1h7geoji06alz_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* and area:(1.0 .. 1E6)")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("bpolys", "f:8.704561,49.403252,8.740,49.40718,8.7058,49.4293,8.711,49.422,8.704561,49.403252")
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
	public void test_qy1m7kqx9jcp_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "Jfc:8.704561,49.403252,8.743,49.436,8.747074,49.423747,8.704585,49.424,8.704561,49.403252|trSl:8.704561,49.403252,8.749,49.422,8.733247,49.411,8.700,49.429,8.704561,49.403252|BH:8.704561,49.403252,8.714862,49.405,8.716,49.412,8.704561,49.4342,8.704561,49.403252")
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
	public void test_1h822mr05w4zc_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("time", "//P2Y2D")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.7056,49.416,9|8.7331,49.4399,6|8.719,49.4151,2|8.744,49.415,53")
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
	public void test_1iusnw37huo9t_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6896,49.412,8.735,49.388|8.6561,49.4169,8.753,49.38211|8.66027,49.42600,8.724,49.38304")
				.queryParam("keys", "highway")
				.queryParam("time", "//P14D")
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
	public void test_1jecmxxbfoq5g_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P4M1D")
				.queryParam("bpolys", "T:8.704561,49.403252,8.744961,49.431,8.708,49.415,8.70414,49.4397,8.704561,49.403252")
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
	public void test_1h85bjx9o0ztx_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "DAeD:8.655836,49.403,8.7026,49.393029|FEGy:8.686,49.40559,8.745,49.388")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
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
	public void test_1k25lxgd5x8bq_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7177,49.429,8.720869,49.413,8.714,49.4072,8.704561,49.403252|8.704561,49.403252,8.734912,49.4041,8.7278,49.422,8.700,49.416339,8.704561,49.403252|8.704561,49.403252,8.7427,49.405,8.701,49.405486,8.7059,49.4285,8.704561,49.403252")
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
	public void test_qeewvg30j0ag_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("time", "//P2Y9D")
				.queryParam("bpolys", "T:8.704561,49.403252,8.738217,49.4041,8.703,49.412299,8.706,49.4352,8.704561,49.403252|g:8.704561,49.403252,8.749,49.418361,8.7334,49.424,8.7158,49.4277,8.704561,49.403252|BGcuh:8.704561,49.403252,8.716,49.4153,8.7380,49.402,8.70456,49.409,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_rhjclblp9y5w_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("bpolys", "Tj:8.704561,49.403252,8.714958,49.40393,8.704077,49.430,8.719,49.4182,8.704561,49.403252")
				.queryParam("timeout", "49")
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
	public void test_1iunox9mu91rr_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and type:node")
				.queryParam("bboxes", "oH:8.683,49.405183,8.72337,49.386|Opk:8.661,49.413457,8.731,49.383161|hCZTn:8.682,49.4276,8.73971,49.383|K:8.6609,49.42015,8.710,49.398132")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P7M2D")
				.queryParam("timeout", "97")
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
	public void test_1iyq1ycdxl54o_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.673,49.404,8.743416,49.3996|8.699,49.410,8.737,49.3904|8.678945,49.428636,8.73390,49.385809")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1M22D")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "ycoJf:8.70498,49.4270,2|h:8.7483,49.4244,4")
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
	public void test_s1b6cncmeeyd_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "jbvnq:8.663232,49.4162,8.735013,49.3990")
				.queryParam("time", "//P2Y8D")
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
	public void test_rhocnhuxog1h_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("time", "//P3M6D")
				.queryParam("bpolys", "JWwbp:8.704561,49.403252,8.718,49.41689,8.730,49.423,8.715990,49.4330,8.704561,49.403252|z:8.704561,49.403252,8.70688,49.41281,8.7142,49.429,8.7068,49.422,8.704561,49.403252|X:8.704561,49.403252,8.7044,49.419,8.747835,49.40579,8.708,49.426833,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_sl9htire2eli_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* and type:node or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P8M2D")
				.queryParam("bpolys", "HW:8.704561,49.403252,8.734,49.405,8.730348,49.40368,8.7255,49.4230,8.704561,49.403252|H:8.704561,49.403252,8.738426,49.438,8.74673,49.4158,8.738,49.402878,8.704561,49.403252|o:8.704561,49.403252,8.719220,49.433,8.7056,49.424,8.7058,49.434,8.704561,49.403252")
				.queryParam("timeout", "91")
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
	public void test_1ievifqrvse3o_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=*")
				.queryParam("format", "csv")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "Y:8.73137,49.404,1|I:8.74239,49.430,9|urGXu:8.74393,49.401,7|B:8.747,49.401,42")
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
	public void test_1ji28gncgzepe_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:relation")
				.queryParam("bboxes", "XJB:8.655,49.401,8.7464,49.383")
				.queryParam("keys", "highway")
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
	public void test_urrwtz5rlvsh_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("time", "//P3Y5M20D")
				.queryParam("bpolys", "q:8.704561,49.403252,8.716,49.436,8.70750,49.436,8.74987,49.40048,8.704561,49.403252|D:8.704561,49.403252,8.717,49.434,8.702,49.405560,8.710662,49.4150,8.704561,49.403252|Q:8.704561,49.403252,8.747,49.438506,8.723,49.4014,8.7469,49.431,8.704561,49.403252")
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
	public void test_rhakwfiwayjm_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "wP:8.687,49.411,8.71280,49.389574")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "//P3M16D")
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
	public void test_sl6ohgizn2hv_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1M23D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.4385],[8.7010,49.409],[8.724492,49.4185],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "89")
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
	public void test_qhw51i43acdu_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Ugk:8.660300,49.4273,8.746,49.3844|vKL:8.6687,49.400,8.756776,49.3840|XoGSA:8.69108,49.428,8.73455,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_1if0llzzv9v8i_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HLb:8.668,49.411783,8.7528,49.386|exyDU:8.66436,49.403294,8.708,49.389")
				.queryParam("values", "secondary_link")
				.queryParam("timeout", "100")
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
	public void test_vf1fgfea719s_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P10D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ldU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70119,49.425],[8.7316,49.413],[8.7270,49.402],[8.704561,49.403252]]]}}]}")
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
	public void test_1ib60vr2au1r5_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iDBK:8.684078,49.412111,8.73339,49.395|wwY:8.681,49.424,8.72221,49.383|H:8.656,49.40157,8.718126,49.3814|ZRta:8.661,49.418,8.7111,49.3966")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "//P1M2D")
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
	public void test_rhahrv7uire8_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ldU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70119,49.425],[8.7316,49.413],[8.7270,49.402],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "29")
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
	public void test_1k1rp47wlili9_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bpolys", "L:8.704561,49.403252,8.708189,49.406,8.7403,49.40792,8.714,49.433,8.704561,49.403252")
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
	public void test_u82w0oj3ymus_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "l:8.680902,49.426,8.71801,49.396|pS:8.6826,49.406174,8.720,49.387")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "RrAVK:8.734,49.408942,8|oZhVA:8.7039,49.41172,1|q:8.737,49.400,8")
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
	public void test_1hrj94p2lh3cn_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and geometry:line")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y1M7D")
				.queryParam("bpolys", "UISVq:8.704561,49.403252,8.70494,49.408,8.748,49.409,8.701789,49.4341,8.704561,49.403252|fs:8.704561,49.403252,8.707,49.4085,8.702,49.402,8.71081,49.419236,8.704561,49.403252")
				.queryParam("timeout", "32")
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
	public void test_1jy88q01k4wu1_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "//P1Y9M1D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.435],[8.747,49.4255],[8.7128,49.438],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"H\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7113,49.418],[8.735,49.405],[8.700,49.42099],[8.704561,49.403252]]]}}]}")
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
	public void test_1hrlz160kwk81_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HMGp:8.693,49.410,8.756435,49.393|pRH:8.672,49.410,8.75985,49.381|n:8.663,49.402852,8.756,49.3989")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
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
	public void test_rh51ql1roylu_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "8.739,49.414,7")
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
	public void test_s1dw6dzx58ok_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified,ship")
				.queryParam("bboxes", "cUMkC:8.684753,49.417457,8.7347,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y10M26D")
				.queryParam("bpolys", "p:8.704561,49.403252,8.717,49.4016,8.737,49.4064,8.713,49.427,8.704561,49.403252|VlEV:8.704561,49.403252,8.716,49.4280,8.704,49.4160,8.702,49.401,8.704561,49.403252|wx:8.704561,49.403252,8.74420,49.43285,8.710160,49.423,8.714,49.418,8.704561,49.403252")
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
	public void test_skq1g6h47mt0_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P6D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Oe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7058,49.425],[8.706608,49.4309],[8.704,49.43249],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "evcFs:8.7259,49.432783,202")
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
	public void test_1hb7ps4ntb7fn_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage,emergency_access_point")
				.queryParam("bboxes", "IvAru:8.668921,49.409,8.71066,49.3935|sWg:8.691,49.4077,8.759,49.38236|Oy:8.6600,49.40192,8.741,49.3888")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P27D")
				.queryParam("timeout", "62")
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
	public void test_1iauuzrgkl8bm_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "B:8.6691,49.4035,8.758,49.395|F:8.69461,49.429,8.746,49.390|TmY:8.698,49.4064,8.753,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "98")
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
	public void test_skv32f6mpffl_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "construction,footway,service")
				.queryParam("bboxes", "8.6742,49.424,8.73864,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "//P2Y1M2D")
				.queryParam("timeout", "72")
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
	public void test_s13cka6w9ba9_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y2D")
				.queryParam("bpolys", "GQsPp:8.704561,49.403252,8.708,49.425,8.704,49.4141,8.70287,49.406,8.704561,49.403252|ti:8.704561,49.403252,8.7417,49.432,8.7494,49.417,8.704,49.42535,8.704561,49.403252")
				.queryParam("bcircles", "yZ:8.7206,49.4132,23")
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
	public void test_ursfjhzbee5u_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not length:( .. 100)")
				.queryParam("groupByValues", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "W:8.7451,49.413664,9")
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
	public void test_1jyfzs3u8i71s_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,secondary_link")
				.queryParam("bboxes", "8.656,49.42870,8.734,49.394|8.6964,49.402,8.753158,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
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
	public void test_1hrri4k2yrcc8_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=*")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "U:8.715,49.4384,9|Wuu:8.709,49.42002,72|PRVyh:8.707,49.412,4")
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
	public void test_1ibkcg1cwn6ub_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P10M8D")
				.queryParam("bpolys", "joZp:8.704561,49.403252,8.7341,49.40254,8.702,49.406,8.721,49.429,8.704561,49.403252|hm:8.704561,49.403252,8.749670,49.4204,8.704811,49.416,8.7088,49.426,8.704561,49.403252|UFYCo:8.704561,49.403252,8.729,49.433347,8.700,49.410,8.709,49.406,8.704561,49.403252")
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
	public void test_sl3ycc7mfn06_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and type:way and not area:(1.0 .. 1E6)")
				.queryParam("values", "primary_link")
				.queryParam("bcircles", "yI:8.705,49.409866,39")
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
	public void test_skv2r33hotgx_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "BoQnA:8.69561,49.405,8.7435,49.382|Cr:8.663,49.4024,8.7080,49.395")
				.queryParam("format", "json")
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
	public void test_t4vqgyek9f77_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "T:8.6721,49.408,8.739,49.398|M:8.673,49.4176,8.757,49.38945")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("timeout", "84")
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
	public void test_t4tfrqoglved_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("time", "//P1Y6M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.70720,49.4229,8.7097,49.425,8.743,49.4198,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_s12t0bkvvgol_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and geometry:point and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "NhYya:8.723,49.439247,5")
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
	public void test_tonxc6egm63l_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("timeout", "50")
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
	public void test_to2bhe53a2b4_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "jINt:8.732,49.402,6|q:8.716,49.4256,9|q:8.7320,49.439,664")
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
	public void test_vb946qgm70om_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69578,49.414,8.7412,49.395")
				.queryParam("format", "geojson")
				.queryParam("timeout", "39")
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
	public void test_qhswfmbyrktx_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "LV:8.664705,49.402,8.7544,49.384")
				.queryParam("showMetadata", "true")
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
	public void test_1iut7oyp8e3q9_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P11M4D")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "8.7483,49.429667,4")
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
	public void test_1h8210bprypnl_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("time", "//P5M16D")
				.queryParam("timeout", "70")
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
	public void test_1h7j4wercyek8_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y2M22D")
				.queryParam("bcircles", "f:8.718,49.420,11|Y:8.717,49.403,6")
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
	public void test_t4nx03lne7g4_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:line and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "T:8.704561,49.403252,8.744,49.415,8.7046,49.409,8.715,49.418469,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_trwwwwoemj50_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("bpolys", "zJbV:8.704561,49.403252,8.7203,49.40053,8.7079,49.4233,8.713802,49.431,8.704561,49.403252")
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
	public void test_1hb7mlcolyla0_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and geometry:line")
				.queryParam("bboxes", "N:8.67579,49.423,8.7376,49.382")
				.queryParam("showMetadata", "true")
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
	public void test_qhkksm1zzm7r_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "vjK:8.687106,49.4003,8.7047,49.390|MDDNU:8.653,49.401,8.718,49.395|rd:8.6871,49.424,8.730,49.389|D:8.65386,49.419,8.744,49.3837")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "eRpp:8.733,49.414,8|rw:8.730,49.400,1|rzyX:8.723531,49.4064,36|Bdyft:8.726,49.426,78")
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
	public void test_rh5he8l5nkms_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or not type:way or id:(1 .. 9999)")
				.queryParam("time", "//P20D")
				.queryParam("bpolys", "e:8.704561,49.403252,8.747,49.4236,8.708,49.434,8.7300,49.4342,8.704561,49.403252|I:8.704561,49.403252,8.700,49.4090,8.725,49.4244,8.723,49.4375,8.704561,49.403252|k:8.704561,49.403252,8.7327,49.4345,8.726,49.435512,8.7330,49.427,8.704561,49.403252")
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
	public void test_uvbes2ujci1v_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "QlM:8.719,49.431659,7|PRXA:8.7092,49.4111,1")
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
	public void test_rhlmtthrr2p1_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and id:(1 .. 9999)")
				.queryParam("bboxes", "vFMA:8.6587,49.411661,8.708,49.38067")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "49")
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
	public void test_rkxbtz4uk4tg_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "f:8.704561,49.403252,8.725,49.40026,8.701,49.429,8.7069,49.4153,8.704561,49.403252")
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
	public void test_1ibbguu8n916h_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "k:8.679273,49.426,8.725,49.385")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("time", "//P2M22D")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.4171,8.70488,49.407,8.705,49.4090,8.704561,49.403252")
				.queryParam("timeout", "62")
				.queryParam("groupByKeys", "lanes:backward,addr:postcode")
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
	public void test_t4c99533ux5v_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.728,49.403,8.704565,49.420153,8.72026,49.423,8.704561,49.403252")
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
	public void test_1h7ldyjiqq736_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "lip:8.664,49.412,8.723,49.388860|f:8.663884,49.402,8.7043,49.389|eI:8.6780,49.41538,8.718,49.387|o:8.69682,49.4034,8.7422,49.396")
				.queryParam("format", "csv")
				.queryParam("timeout", "49")
				.queryParam("groupByKeys", "smoothness,network")
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
	public void test_1hrosalvqv5f9_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and geometry:point")
				.queryParam("bboxes", "H:8.6937,49.428,8.753,49.38853")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y2M21D")
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
	public void test_1jeyt59sekk12_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y1M6D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"e\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7134,49.409],[8.709,49.40023],[8.713,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"lU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72296,49.403],[8.701,49.4260],[8.730,49.4091],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "lanes")
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
	public void test_1h84v43yrpnas_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.693,49.4111,8.703252,49.3800|8.669,49.4161,8.71254,49.385|8.6871,49.4001,8.711104,49.39572|8.672,49.403,8.701,49.396553")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "47")
				.queryParam("groupByKeys", "network,smoothness")
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
	public void test_1ies9u2ul79dg_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.66769,49.413,8.702,49.390|8.662,49.423,8.703707,49.385")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.707594,49.414,8.743,49.4302,8.705,49.4099,8.704561,49.403252|8.704561,49.403252,8.736,49.435,8.723,49.432,8.7040,49.439348,8.704561,49.403252|8.704561,49.403252,8.723,49.418,8.708,49.407,8.704,49.421,8.704561,49.403252")
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
	public void test_qe9f9o3m80fl_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P1Y1M21D")
				.queryParam("bpolys", "lSH:8.704561,49.403252,8.714,49.408,8.707470,49.417957,8.704143,49.4351,8.704561,49.403252|wU:8.704561,49.403252,8.741,49.408444,8.737,49.408,8.716,49.421,8.704561,49.403252")
				.queryParam("timeout", "97")
				.queryParam("groupByKeys", "type,tracktype,bicycle")
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
	public void test_rhm4rcu9jo10_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1M6D")
				.queryParam("bpolys", "hnPDW:8.704561,49.403252,8.712,49.4156,8.736,49.417991,8.70667,49.42761,8.704561,49.403252")
				.queryParam("groupByKeys", "lanes,lit,tracktype")
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
	public void test_u8dif8ld6cds_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("timeout", "75")
				.queryParam("groupByKeys", "bicycle")
				.queryParam("bcircles", "ZhcI:8.749,49.4373,601020329")
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
	public void test_s4ulysmqx1kg_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "station,church")
				.queryParam("filter", "ref!=* and not type:node and not length:( .. 100)")
				.queryParam("bboxes", "d:8.683697,49.417,8.7580,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "ynRpf:8.704561,49.403252,8.704570,49.41316,8.7045,49.411,8.72621,49.409,8.704561,49.403252|RxF:8.704561,49.403252,8.71942,49.407,8.704030,49.4211,8.70849,49.410,8.704561,49.403252|my:8.704561,49.403252,8.736,49.434,8.7161,49.41921,8.7413,49.438,8.704561,49.403252")
				.queryParam("bcircles", "bG:8.7408,49.412,257|zI:8.727,49.405,7")
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
	public void test_1iv9d6sw7ttf8_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=*")
				.queryParam("groupByValues", "construction,garage")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722080,49.4077],[8.701,49.4092],[8.730,49.42570],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "dQbF:8.7250,49.433,1|x:8.7164,49.425,5")
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
	public void test_sohdn1zbjpsy_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y2M26D")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "DvAQ:8.741,49.417,4")
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
	public void test_1hr5w6ytz703d_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P2Y25D")
				.queryParam("bcircles", "8.739,49.428,6|8.701,49.409,5")
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
	public void test_1jyljne5la2ck_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,elevator,church")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P5M9D")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "DBqK:8.721286,49.415,31")
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
	public void test_u82cljvrfcyu_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:line")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "l:8.701,49.43957,7|QIfX:8.722927,49.40706,97")
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
	public void test_1ji77cnw6dbvq_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "iYMcU:8.70013,49.420,8")
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
	public void test_toig7c27z59g_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage,track")
				.queryParam("filter", "foot=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.699280,49.40773,8.735,49.384|8.676,49.4133,8.7385,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1iut85ounm6at_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,civic")
				.queryParam("bboxes", "z:8.6577,49.4023,8.7192,49.384|N:8.67258,49.4181,8.728,49.3927|S:8.6504,49.407,8.706,49.386|URE:8.66264,49.4231,8.75095,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "yes")
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
	public void test_1hr5v0lmrds8i_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link")
				.queryParam("bboxes", "8.6919,49.429606,8.703,49.399|8.669,49.42403,8.738423,49.385")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("time", "//P4M6D")
				.queryParam("timeout", "77")
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
	public void test_r179a45g8y1x_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P27D")
				.queryParam("bcircles", "8.720,49.414,17")
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
	public void test_1iv3suz0ao75f_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or type:node or not length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.413,8.70482,49.432,8.731,49.437,8.704561,49.403252")
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
	public void test_1hr5dv59vz7e9_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P8M25D")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.723,49.4020,4")
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
	public void test_sof3ek0rok12_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2M27D")
				.queryParam("bpolys", "nocIH:8.704561,49.403252,8.7458,49.404,8.7256,49.404,8.727,49.43012,8.704561,49.403252|ZByQK:8.704561,49.403252,8.727,49.4101,8.7040,49.410,8.700,49.408,8.704561,49.403252")
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
	public void test_t4hv57be5e8z_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=*")
				.queryParam("bboxes", "fnjIo:8.658,49.4006,8.7519,49.398")
				.queryParam("format", "geojson")
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
	public void test_1h7lgawgyl6i9_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* and not length:( .. 100)")
				.queryParam("bboxes", "8.66632,49.408,8.749,49.3985")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "8.733,49.4338,6")
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
	public void test_vf3pp198gzsn_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "u:8.686,49.4106,8.732,49.392")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3M6D")
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
	public void test_1h821uoe5046r_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "HBXRx:8.7411,49.428,2|q:8.731331,49.437,6")
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
	public void test_veveavexwe9h_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "//P2M17D")
				.queryParam("bcircles", "8.719,49.4109,5|8.735,49.416,7915526083")
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
	public void test_1jekynpv9llya_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("time", "//P3Y8M1D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"e\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718690,49.41849],[8.740,49.402465],[8.704502,49.4199],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"CuZA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71519,49.400],[8.743,49.439211],[8.701,49.4169],[8.704561,49.403252]]]}}]}")
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
