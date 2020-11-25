import org.evomaster.client.java.controller.SutHandler;
import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RESTest_10_per_op {


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
	public void test_rhugxhbbh0s2_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "way,")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
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
	public void test_1iauxppdol1dl_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and not length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-11-08")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "sl:8.704,49.42556,5|VfQFq:8.744,49.404,6|PQtg:8.7446,49.4235,3")
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
	public void test_vf3mkservmn7_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "rnzHt:8.704561,49.403252,8.718,49.422,8.703,49.412,8.7342,49.402,8.704561,49.403252|Fr:8.704561,49.403252,8.727,49.409,8.70404,49.436655,8.726,49.405,8.704561,49.403252")
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
	public void test_1jetcbq90mkhi_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "X:8.662,49.4050,8.748692,49.381|R:8.697,49.4242,8.743,49.380|s:8.6541,49.4215,8.7396,49.393|O:8.682,49.414906,8.711,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-11-24")
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
	public void test_1iun49usoibtu_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* and not length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-04-24")
				.queryParam("bpolys", "RSL:8.704561,49.403252,8.7371,49.439,8.707,49.4129,8.704,49.4016,8.704561,49.403252|N:8.704561,49.403252,8.711,49.431,8.703545,49.411,8.703,49.4138,8.704561,49.403252")
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
	public void test_vbk59n1ktx6e_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.707252,49.406,8.704,49.423,8.738,49.42701,8.704561,49.403252|8.704561,49.403252,8.708,49.405,8.710,49.406,8.70512,49.424,8.704561,49.403252|8.704561,49.403252,8.740,49.402,8.7266,49.434,8.700,49.403,8.704561,49.403252")
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
	public void test_1k25ljuzu4v95_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=*")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "8.70571,49.40264,5|8.722659,49.4269,3")
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
	public void test_1h84suobxn2gl_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "point,")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2010-09-06")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.727,49.42846,8")
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
	public void test_t4symm5hoqwm_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-11-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744620,49.40952],[8.7003,49.437],[8.705,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "92")
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
	public void test_u7ul5mwi6nue_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6897,49.4203,8.7147,49.39330|8.694,49.428704,8.72163,49.396|8.668,49.4212,8.730,49.3908|8.652644,49.418,8.737,49.38229")
				.queryParam("keys", "highway")
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
	public void test_1jia28sl90h84_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.676,49.418,8.73367,49.39941|8.697,49.410,8.7549,49.387")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-02-27")
				.queryParam("bpolys", "8.704561,49.403252,8.733,49.410,8.705,49.413,8.70079,49.438647,8.704561,49.403252|8.704561,49.403252,8.7410,49.435,8.70792,49.4332,8.705,49.413,8.704561,49.403252|8.704561,49.403252,8.72508,49.433,8.7159,49.400,8.709194,49.40377,8.704561,49.403252")
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
	public void test_qdvhlsc056wl_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6934,49.417,8.709,49.393|8.6698,49.407,8.7414,49.398")
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
	public void test_1hbm1eyzwfh9u_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "gM:8.744,49.40758,8")
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
	public void test_sonf48lzhfsn_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-03-17")
				.queryParam("bcircles", "O:8.722977,49.41456,2|Z:8.713172,49.432,2|x:8.735,49.429500,4|E:8.703,49.409,9")
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
	public void test_1huzxw895qnac_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-02-20")
				.queryParam("bcircles", "z:8.72442,49.411,85")
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
	public void test_1hb7nr63h0wgz_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and geometry:line or not length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.70852,49.4338,8.726,49.438651,8.72961,49.41539,8.704561,49.403252|8.704561,49.403252,8.73412,49.4098,8.71095,49.435,8.71386,49.4019,8.704561,49.403252")
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
	public void test_1iyfgpfh2bbl2_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "A:8.65785,49.406,8.75270,49.389|b:8.686,49.424,8.747,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "77")
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
	public void test_t4vnqqoc63p4_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "vWXkX:8.704561,49.403252,8.735339,49.422,8.7316,49.40980,8.74986,49.4026,8.704561,49.403252|cdR:8.704561,49.403252,8.715,49.403,8.717000,49.4300,8.704,49.422849,8.704561,49.403252|X:8.704561,49.403252,8.7160,49.416,8.702,49.421,8.7171,49.4143,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_1iyfgbg0kyxyd_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "R:8.653,49.422885,8.713,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-09-26")
				.queryParam("timeout", "59")
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
	public void test_1jylmu3sprwab_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=*")
				.queryParam("bboxes", "8.683,49.4175,8.74419,49.3862|8.684218,49.425759,8.703220,49.382")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "76")
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
	public void test_uveoy1grsy0m_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=*")
				.queryParam("bboxes", "8.681,49.4224,8.7026,49.3895")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.7463,49.42435,6")
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
	public void test_1hr5cbad8dboi_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "yetNt:8.74792,49.4101,5|lYO:8.720,49.415677,8")
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
	public void test_s1dwi1w6lkxe_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "iUWGg:8.73274,49.415,1")
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
	public void test_1jy7pk0wetd2b_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Gapm:8.656,49.4142,8.725,49.390")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
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
	public void test_rkzlddr6o869_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("timeout", "69")
				.queryParam("bcircles", "yARTw:8.709,49.430,1")
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
	public void test_urv7mm9l64bo_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("time", "2012-08-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wDB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.42799],[8.706,49.429669],[8.748,49.416],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "20")
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
	public void test_1ibbiesezsbhx_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2015-03-16")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "N:8.747,49.43169,70|q:8.739,49.412,3|dofrD:8.748,49.41856,9|DSPri:8.7438,49.416,82")
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
	public void test_t4qmtxgvqwyq_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "8.709,49.432,5|8.716,49.427,400|8.7486,49.409,53")
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
	public void test_1iv115px64wva_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "beiRR:8.6834,49.413,8.719630,49.380|VxNzD:8.69880,49.40623,8.706,49.382919|aK:8.6832,49.4245,8.734497,49.3844|u:8.660248,49.42473,8.71918,49.3814")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-08-26")
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
	public void test_1ies8npnz4g2r_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "jPhbe:8.668,49.416,8.7552,49.394|l:8.67891,49.418,8.758,49.3939|WcMJj:8.669,49.407,8.71000,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("time", "2018-04-27")
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
	public void test_rhg4u6czaqls_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69053,49.424,8.725659,49.381|8.656,49.41449,8.744,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "zBJ:8.729,49.4158,32")
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
	public void test_s4xewtsec4s0_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=*")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "MUGjm:8.7135,49.405,3|z:8.741,49.4226,8")
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
	public void test_1iv9bbaf87jg7_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "PZR:8.668,49.405,8.742,49.3877|V:8.670,49.418392,8.700,49.391")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-02-15")
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
	public void test_sl8wufmb4568_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.712,49.430,4|8.7358,49.431075,6|8.708,49.430,3")
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
	public void test_1jig3nmeopa9k_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or not geometry:line")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"nc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7482,49.431],[8.723,49.41253],[8.7045,49.418],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "31")
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
	public void test_rhr622tp3709_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qM:8.684,49.414,8.7455,49.382|AbqcS:8.6691,49.4215,8.715,49.399")
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
	public void test_vbcdi3qw3u5f_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "QI:8.689,49.413023,8.713,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-09-16")
				.queryParam("timeout", "60")
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
	public void test_qe75coubaw4y_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and type:relation")
				.queryParam("bboxes", "sJID:8.675,49.4125,8.7306,49.3949|z:8.66922,49.409,8.75213,49.394|T:8.666,49.414,8.754401,49.386|i:8.667,49.418585,8.724,49.391")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-05-12")
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
	public void test_qxi8kohf669l_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"LZBRd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.4319],[8.7498,49.439242],[8.7486,49.4197],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"X\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7102,49.413],[8.704538,49.43390],[8.704,49.403],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
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
	public void test_ubp69wl7tnxi_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.740,49.418,85")
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
	public void test_rhm55438t55x_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or type:relation or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.653,49.419803,8.759,49.389|8.696,49.422170,8.741,49.388|8.660,49.417,8.711,49.392961")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "UWGc:8.746,49.406,1|V:8.737326,49.409,25")
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
	public void test_rhtyje5h4110_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.68929,49.417,8.70205,49.386|uFxNt:8.675,49.4066,8.746,49.3816")
				.queryParam("format", "json")
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
	public void test_1iut8jpmyk9bq_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and geometry:line")
				.queryParam("bboxes", "v:8.699,49.427,8.7480,49.394|bZ:8.678024,49.403,8.75598,49.387")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "65")
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
	public void test_uvgvzxpfdylh_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("bcircles", "G:8.723,49.430,79")
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
	public void test_qy279guqekiq_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.660,49.405,8.7214,49.39657")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-11-23")
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
	public void test_t4knrencpppd_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-09-15")
				.queryParam("bpolys", "OQ:8.704561,49.403252,8.7440,49.4023,8.738,49.416,8.703970,49.438,8.704561,49.403252|yj:8.704561,49.403252,8.705,49.4221,8.736,49.435,8.7015,49.406,8.704561,49.403252")
				.queryParam("timeout", "82")
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
	public void test_1jelhqwq3fxo4_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "8.7023,49.408,2|8.70522,49.437268,7")
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
	public void test_1h823ewsgch84_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "V:8.6592,49.404,8.711,49.382")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "80")
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
	public void test_vbcdw4v2p1km_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ZbL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.409],[8.7166,49.4309],[8.719,49.422],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714834,49.4295],[8.703,49.406],[8.7037,49.40296],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"mh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.437],[8.7122,49.437],[8.70085,49.4083],[8.704561,49.403252]]]}}]}")
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
	public void test_1iun6odw27whe_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or geometry:line and not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "K:8.700,49.40012,9|et:8.718,49.420,6")
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
	public void test_1hv89xdj7oxtc_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "W:8.704561,49.403252,8.7113,49.417722,8.7154,49.428,8.745,49.429,8.704561,49.403252|FzUiY:8.704561,49.403252,8.710991,49.4152,8.703,49.433,8.701,49.40582,8.704561,49.403252|Pl:8.704561,49.403252,8.732,49.432,8.70164,49.42952,8.7041,49.411,8.704561,49.403252")
				.queryParam("bcircles", "iFI:8.704,49.416,41|N:8.741016,49.41455,1|a:8.7438,49.4050,5|rS:8.717,49.400,200463035936")
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
	public void test_trquqcv9925y_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.404],[8.708,49.403],[8.7343,49.426],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "29")
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
	public void test_ubp5vpwn6wqc_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "q:8.682,49.419,8.7185,49.396|bjf:8.6720,49.425,8.7354,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-03-03")
				.queryParam("timeout", "93")
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
	public void test_1jed6i7fd93z5_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-03-09")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "j:8.742,49.416,6|GBCP:8.718,49.424,174")
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
	public void test_r17t8kwsb0vk_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or not length:( .. 100)")
				.queryParam("bboxes", "8.67351,49.4232,8.738,49.398144|8.6536,49.428,8.707,49.392")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-09-26")
				.queryParam("timeout", "92")
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
	public void test_to2amjax0j05_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=*")
				.queryParam("bboxes", "M:8.681,49.419,8.743681,49.394|ZpF:8.690,49.423105,8.757,49.390|o:8.6644,49.425,8.755,49.397|h:8.6904,49.4184,8.7003,49.386")
				.queryParam("timeout", "93")
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
	public void test_s1b4pu7mqctf_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "aPamm:8.6874,49.419,8.7540,49.3981")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-02-18")
				.queryParam("timeout", "57")
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
	public void test_qxr3p3hsr22h_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Kn:8.704561,49.403252,8.7279,49.4276,8.700704,49.42261,8.704,49.4125,8.704561,49.403252|O:8.704561,49.403252,8.71730,49.4262,8.7083,49.408,8.7059,49.431827,8.704561,49.403252")
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
	public void test_1ji4fhzhtt084_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-10-22")
				.queryParam("bpolys", "8.704561,49.403252,8.731,49.4382,8.712250,49.4369,8.7016,49.419,8.704561,49.403252|8.704561,49.403252,8.7162,49.411,8.7282,49.407,8.7271,49.4303,8.704561,49.403252|8.704561,49.403252,8.7197,49.424,8.722,49.4330,8.729383,49.4111,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_rhlnm215xoaf_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and id:(1 .. 9999)")
				.queryParam("bboxes", "HLvzQ:8.681898,49.407881,8.741,49.38993")
				.queryParam("format", "json")
				.queryParam("time", "2007-12-02")
				.queryParam("timeout", "38")
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
	public void test_t4q3t3sves6t_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "8.733,49.438,7598330737")
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
	public void test_s50nwh73jd5v_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("bcircles", "pSG:8.743,49.433,9|m:8.7131,49.414,3|Xn:8.708,49.432,91|KSbzT:8.7328,49.418,537")
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
	public void test_qhnci31t2jw7_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2016-03-29")
				.queryParam("bpolys", "ANp:8.704561,49.403252,8.7272,49.404,8.706,49.413,8.709,49.417,8.704561,49.403252|tcf:8.704561,49.403252,8.72890,49.422,8.719,49.439886,8.704707,49.402,8.704561,49.403252|Sq:8.704561,49.403252,8.737,49.421,8.74013,49.416,8.7450,49.4317,8.704561,49.403252")
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
	public void test_skxto80bhysj_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bpolys", "BcWJB:8.704561,49.403252,8.736,49.41723,8.702,49.405,8.7459,49.4256,8.704561,49.403252")
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
	public void test_qxfz1btkoaia_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage,pedestrian")
				.queryParam("bboxes", "8.67431,49.412116,8.727,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "36")
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
	public void test_1huzx1jn8e2ph_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel")
				.queryParam("filter", "name!=*")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "EDN:8.704561,49.403252,8.702807,49.42004,8.709,49.431,8.7499,49.401,8.704561,49.403252|v:8.704561,49.403252,8.724,49.4207,8.724,49.405,8.730,49.428,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_urxhh52nfjud_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qLKbB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745051,49.41581],[8.717,49.426],[8.704281,49.431],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713434,49.41936],[8.716374,49.40018],[8.7331,49.42543],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"jFxKq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712443,49.438],[8.709,49.4159],[8.72436,49.42648],[8.704561,49.403252]]]}}]}")
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
	public void test_uv5u4ulkr3he_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,footway")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("time", "2012-08-13")
				.queryParam("bcircles", "8.749,49.417,9")
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
	public void test_1hrlzf54ybho3_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.7234,49.407,8.725,49.4106,8.70658,49.419,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_ts4or0pk5ffo_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2007-11-19")
				.queryParam("bcircles", "8.73619,49.421,7")
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
	public void test_qe4cez6n1xyr_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,apartments")
				.queryParam("bboxes", "F:8.655,49.4065,8.747,49.393|wQ:8.687,49.4283,8.704183,49.383|Cq:8.680,49.403680,8.7494,49.383596")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2016-09-13")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "LLR:8.735,49.433,2")
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
	public void test_qxi9cggs64hh_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* or length:( .. 100)")
				.queryParam("groupByValues", "primary_link")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("bcircles", "DYzJF:8.7329,49.4335,9")
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
	public void test_1hv0giqwfy6p2_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,synagogue")
				.queryParam("bboxes", "u:8.655,49.428,8.749,49.395|taJX:8.651,49.423,8.735,49.389|qioPc:8.664,49.407,8.745,49.380173")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "76")
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
	public void test_vey6gpzprd4m_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.652,49.406603,8.728,49.3988")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "33")
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
	public void test_rhtxd6vq7kfp_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2008-09-09")
				.queryParam("bcircles", "q:8.72908,49.412,2|b:8.709,49.403,861|p:8.7192,49.4213,6")
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
	public void test_qeco4m5lgaqs_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "construction,public")
				.queryParam("bboxes", "jv:8.66509,49.415,8.733,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
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
	public void test_sknb89ipswgx_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and not geometry:point and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "SoZhR:8.6843,49.426,8.7080,49.385|l:8.659,49.41888,8.708607,49.394|c:8.686,49.4209,8.7459,49.392|mij:8.675,49.415360,8.7374,49.391717")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "39")
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
	public void test_tony4ek5x2zo_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified")
				.queryParam("filter", "foot!=* and type:node or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "zobV:8.7116,49.4027,9")
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
	public void test_1jiflq9dhh06x_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,dormitory")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "dx:8.741,49.4296,519")
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
	public void test_t4sym9zxl1rm_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "n:8.704561,49.403252,8.7068,49.439,8.729768,49.409,8.736,49.4237,8.704561,49.403252|k:8.704561,49.403252,8.7395,49.430,8.704,49.4000,8.709843,49.406,8.704561,49.403252")
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
	public void test_sl9gbt53c0v9_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,crossing,footway")
				.queryParam("bboxes", "H:8.691,49.4184,8.707,49.398")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "wgu:8.704561,49.403252,8.7155,49.404778,8.7445,49.422,8.701,49.418334,8.704561,49.403252|iZAHm:8.704561,49.403252,8.723,49.421,8.741,49.412,8.715987,49.40235,8.704561,49.403252")
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
	public void test_qxtebufu05dd_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("bboxes", "dBhpZ:8.6646,49.428,8.7048,49.3800")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("time", "2013-10-25")
				.queryParam("bpolys", "ze:8.704561,49.403252,8.7353,49.40583,8.733,49.406,8.710,49.4158,8.704561,49.403252|j:8.704561,49.403252,8.744,49.412,8.700382,49.411,8.7059,49.41590,8.704561,49.403252")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "Nrnzk:8.7190,49.415,4")
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
	public void test_u8aq6wutmt7n_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary,tower")
				.queryParam("bboxes", "Dg:8.681318,49.41519,8.735,49.384")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_rl02fzw3e4iq_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship,university")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-02-20")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "X:8.73976,49.431580,4")
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
	public void test_qhl1y55lh35h_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "GcR:8.704561,49.403252,8.717,49.418,8.743,49.409,8.74532,49.428,8.704561,49.403252|BifEf:8.704561,49.403252,8.7497,49.424,8.740310,49.41834,8.744,49.41142,8.704561,49.403252|Qqyg:8.704561,49.403252,8.720,49.40773,8.7045,49.411,8.700,49.4381,8.704561,49.403252")
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
	public void test_r1flgrz9hhkp_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,give_way,stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-03-20")
				.queryParam("bpolys", "qG:8.704561,49.403252,8.706,49.40265,8.7149,49.407,8.702760,49.427,8.704561,49.403252|Fsa:8.704561,49.403252,8.74871,49.40610,8.702,49.415,8.7039,49.426373,8.704561,49.403252|PsnPO:8.704561,49.403252,8.713,49.43596,8.723,49.4340,8.706683,49.410,8.704561,49.403252")
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
	public void test_1iuw0n24ybsxc_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "r:8.702,49.4212,3|MuEr:8.7289,49.428,7|Hl:8.71799,49.400,883")
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
	public void test_s0uij9gh6xx4_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "BgmPX:8.654,49.416,8.7126,49.38955|r:8.663,49.403,8.754696,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-03-13")
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
	public void test_sl3xhkx4wcvm_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.651,49.4275,8.71002,49.394|8.65438,49.415,8.7500,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("timeout", "83")
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
	public void test_1ies8ccw1r5uu_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified,civic")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "s:8.745610,49.4387,8|hovaS:8.709,49.400,17")
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
	public void test_s1b5hugf3dk6_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,traffic_signals")
				.queryParam("filter", "foot!=* or type:node or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Eczdf:8.655823,49.4180,8.737,49.384|q:8.672,49.428849,8.709,49.384|HwE:8.677,49.414,8.741,49.38632")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-03-13")
				.queryParam("bpolys", "Jy:8.704561,49.403252,8.738,49.4018,8.7045,49.4105,8.7048,49.43073,8.704561,49.403252|EB:8.704561,49.403252,8.738,49.407,8.726,49.4236,8.718,49.4279,8.704561,49.403252")
				.queryParam("timeout", "53")
				.queryParam("bcircles", "SX:8.703,49.415,9|ox:8.7388,49.4169,6")
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
	public void test_1hraw95gqzfhu_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and geometry:point or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.741,49.434,8.7435,49.41436,8.73761,49.4066,8.704561,49.403252|8.704561,49.403252,8.700859,49.426,8.738,49.4052,8.727,49.427,8.704561,49.403252|8.704561,49.403252,8.726,49.439,8.70331,49.411,8.7141,49.409,8.704561,49.403252")
				.queryParam("bcircles", "fkt:8.741,49.4123,16|Nimmi:8.7291,49.426,5")
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
	public void test_1iemoekhosrp4_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.657072,49.406572,8.75847,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "43")
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
	public void test_vb6d6yu1437a_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-12-11")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"a\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.4085],[8.7274,49.435],[8.746,49.4382],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.408],[8.739,49.428],[8.74709,49.402],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "99")
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
	public void test_vevwar6gfm1y_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.717151,49.4227,8.723,49.421,8.708,49.419,8.704561,49.403252")
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
	public void test_1hb86jdyiq1bl_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.721,49.405,5|8.724,49.420,8")
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
	public void test_1jy262w098huq_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "clSiW:8.69149,49.419,8.733,49.392804|myc:8.6608,49.4273,8.708483,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_qdvhzlkamiwl_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,civic")
				.queryParam("filter", "network!=* or geometry:point and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-11-05")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"g\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7295,49.429],[8.706,49.439],[8.703387,49.4063],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.4216],[8.7031,49.4057],[8.7080,49.429],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7z8io59yfxz_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,civic")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-12-22")
				.queryParam("bcircles", "OvNL:8.734,49.43988,2")
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
	public void test_t89oh3u9nplx_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,tower,residential")
				.queryParam("bboxes", "8.657072,49.406572,8.75847,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_tol5ya2uctb8_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and geometry:line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.73461,49.439,8.70490,49.426,8.718,49.434,8.704561,49.403252")
				.queryParam("bcircles", "EUyQc:8.703248,49.4243,54")
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
	public void test_t81bo6waialw_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and geometry:polygon")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-06")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "NTxAR:8.7179,49.4129,9")
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
	public void test_rhiv1y25elwk_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or not length:( .. 100)")
				.queryParam("bboxes", "8.654,49.423466,8.742,49.389")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-03-09")
				.queryParam("timeout", "33")
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
	public void test_1ji4h50tzy82u_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-05-30")
				.queryParam("bpolys", "Jf:8.704561,49.403252,8.7356,49.421,8.729994,49.401,8.728271,49.4312,8.704561,49.403252|U:8.704561,49.403252,8.721,49.4182,8.716,49.420165,8.70278,49.421,8.704561,49.403252|WDk:8.704561,49.403252,8.73062,49.4275,8.706,49.4306,8.702,49.4042,8.704561,49.403252")
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
	public void test_uv8moyillsv6_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-01-11")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"v\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.409],[8.735,49.4168],[8.716,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"waURy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.415],[8.704,49.432],[8.705,49.414261],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "61")
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
	public void test_1iut8382v322e_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bcircles", "8.720,49.439,2")
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
	public void test_u85neb0d5eua_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or geometry:point or length:( .. 100)")
				.queryParam("bboxes", "8.687,49.40520,8.726,49.399|8.668974,49.419,8.747,49.385|8.655,49.40347,8.70475,49.386|8.690,49.422593,8.751,49.3847")
				.queryParam("time", "2016-01-17")
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
	public void test_r1g5c8knzyuo_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6978,49.4164,8.737,49.3823|8.672,49.427,8.757,49.399")
				.queryParam("format", "geojson")
				.queryParam("timeout", "71")
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
	public void test_1iemphutj0son_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"n\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7213,49.433],[8.704,49.427],[8.7021,49.420],[8.704561,49.403252]]]}}]}")
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
	public void test_1hb85p0wa5vlf_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "P:8.677,49.408,8.71561,49.3997|ojn:8.67356,49.422,8.732711,49.383|MAG:8.68190,49.409432,8.731590,49.395024")
				.queryParam("time", "2018-05-01")
				.queryParam("timeout", "78")
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
	public void test_1hvb3bqmqismb_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "zzgb:8.661422,49.413,8.751,49.3840")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-06-18")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "TD:8.72302,49.414,74|zerZ:8.734,49.40019,9|EU:8.7348,49.41905,2|aUwqb:8.734329,49.400,281")
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
	public void test_1iay6bljuwp5v_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-02-03")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "cP:8.7411,49.417,35|E:8.7394,49.409,2|TzPI:8.700,49.42356,214932511")
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
	public void test_1hrdnmzt0dylf_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:way")
				.queryParam("bboxes", "8.699356,49.401,8.70302,49.3917|8.6529,49.41857,8.725,49.393|8.6860,49.41006,8.747057,49.394")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-10-05")
				.queryParam("timeout", "90")
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
	public void test_u7wuzzfho3mr_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "Ghid:8.741,49.43678,4")
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
	public void test_qe4d6rx6o9q0_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2009-04-19")
				.queryParam("bpolys", "8.704561,49.403252,8.726,49.424,8.704,49.41999,8.724,49.405,8.704561,49.403252|8.704561,49.403252,8.7362,49.414,8.7017,49.433,8.700,49.421,8.704561,49.403252|8.704561,49.403252,8.7495,49.403,8.714,49.437,8.702,49.4085,8.704561,49.403252")
				.queryParam("timeout", "49")
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
	public void test_1hrjrg5j6fcrq_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "FIEz:8.672,49.42642,8.74911,49.388|xE:8.657,49.415,8.741537,49.388")
				.queryParam("showMetadata", "no")
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
	public void test_1jiflc8a4gsvp_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "O:8.74425,49.41995,3")
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
	public void test_ubup1k0gklet_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or type:way and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-04-12")
				.queryParam("bpolys", "8.704561,49.403252,8.738907,49.410260,8.712,49.434558,8.71520,49.42935,8.704561,49.403252|8.704561,49.403252,8.72722,49.4107,8.7128,49.439642,8.725,49.4066,8.704561,49.403252|8.704561,49.403252,8.73626,49.4198,8.704561,49.400,8.713,49.424,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_rkwrymg2mh4p_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2010-01-09")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.413,8.72165,49.434,8.7440,49.438,8.704561,49.403252|8.704561,49.403252,8.7216,49.4130,8.7054,49.423,8.721,49.4226,8.704561,49.403252")
				.queryParam("timeout", "99")
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
	public void test_1hrrk2plmxrnb_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "r:8.720,49.423,68|lY:8.72699,49.4232,132665390")
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
	public void test_s12t2uc30d9v_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "OO:8.704561,49.403252,8.728602,49.416,8.704,49.411,8.7272,49.426,8.704561,49.403252|mhR:8.704561,49.403252,8.7272,49.406778,8.7312,49.406133,8.74467,49.402,8.704561,49.403252")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "T:8.742,49.433,89|RF:8.703,49.416,2|RStrZ:8.739,49.430,3|XK:8.706,49.43934,32")
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
	public void test_u7p14z5unsjb_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or geometry:point or not length:( .. 100)")
				.queryParam("bboxes", "8.681,49.4082,8.7244,49.3819|8.659,49.405,8.715559,49.39047|8.67464,49.42106,8.7177,49.395|8.652,49.412761,8.727,49.382586")
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
	public void test_s1b5krexds1k_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.734,49.421,8.705,49.430,8.734,49.403,8.704561,49.403252|8.704561,49.403252,8.703,49.407,8.743072,49.437,8.720,49.4054,8.704561,49.403252|8.704561,49.403252,8.733,49.4347,8.7164,49.438,8.74411,49.425806,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_us3hseo1dco5_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-11-19")
				.queryParam("bpolys", "aN:8.704561,49.403252,8.733,49.41246,8.711,49.418,8.703,49.4264,8.704561,49.403252|Q:8.704561,49.403252,8.717,49.42353,8.72011,49.434,8.70407,49.4186,8.704561,49.403252|ooNPa:8.704561,49.403252,8.710,49.425,8.70281,49.439620,8.70037,49.431,8.704561,49.403252")
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
	public void test_1hbgikqtdglyx_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("bcircles", "LkZK:8.710,49.400,4|Eut:8.718951,49.413,7")
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
	public void test_to4lbwyrq9uq_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Q:8.668,49.414,8.719533,49.388|kM:8.6625,49.427,8.715,49.3894|C:8.685,49.417,8.720,49.391")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-11-22")
				.queryParam("timeout", "51")
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
	public void test_1k22b4v71ve48_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "j:8.690,49.423,8.7174,49.392|Bn:8.696,49.4056,8.753,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "2008-03-19")
				.queryParam("timeout", "73")
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
	public void test_1ib5y5jmsnz95_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.682896,49.415,8.7395,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "65")
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
	public void test_1jyllo03ds8c1_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2015-06-09")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "aDMu:8.734,49.4352,6|dc:8.7233,49.401323,7|w:8.72821,49.417234,8")
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
	public void test_1h7z8g1ujwapi_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* or geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("bcircles", "T:8.729,49.43444,529|nZo:8.726,49.43115,5")
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
	public void test_1hrmjosrn0zli_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "PlLX:8.6543,49.406222,8.715,49.3912|Nh:8.669,49.403,8.706,49.38888|MfaUp:8.650,49.419,8.7220,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-08-08")
				.queryParam("bcircles", "8.7444,49.408,2")
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
	public void test_1k1zjofq6mhx1_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "MpE:8.683,49.411806,8.7316,49.39370|i:8.660,49.420,8.720,49.3998")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-12-08")
				.queryParam("timeout", "38")
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
	public void test_ts1w9xnfusdx_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or type:way")
				.queryParam("bboxes", "X:8.6889,49.402,8.724,49.3897")
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
	public void test_vb9lnbefejxe_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2013-09-29")
				.queryParam("bcircles", "u:8.717,49.426,4")
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
	public void test_vbbx28sw4ear_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or not type:relation or length:( .. 100)")
				.queryParam("bboxes", "D:8.653,49.406595,8.7188,49.396|UYU:8.686,49.4164,8.715,49.3802|pdJsl:8.687,49.4015,8.715,49.3850|z:8.684,49.4118,8.732,49.398")
				.queryParam("time", "2009-01-22")
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
	public void test_t49hveb32kom_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or type:way")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "8.7093,49.423,63|8.7108,49.411,5")
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
	public void test_t89miymwzluq_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"kV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741554,49.418],[8.733,49.407],[8.703,49.43112],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "95")
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
	public void test_u7oifmase4bo_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and length:( .. 100)")
				.queryParam("bboxes", "Me:8.685842,49.416,8.755,49.3884|eg:8.678058,49.410,8.731,49.383|SHSH:8.68016,49.413,8.720388,49.391|m:8.698,49.413,8.717,49.3986")
				.queryParam("format", "geojson")
				.queryParam("time", "2018-01-22")
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
	public void test_t89ltp1q0t2v_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Xdydc:8.6546,49.4234,8.715,49.399|Q:8.679,49.412,8.7512,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-01-15")
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
	public void test_qxturnr0c84y_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "vvcxa:8.713,49.4230,366620340|EEVN:8.735,49.426507,80|FkEg:8.747,49.415,4")
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
	public void test_vf6fwukzyee9_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,chapel")
				.queryParam("bboxes", "D:8.663,49.407962,8.7547,49.39257")
				.queryParam("groupByKey", "building")
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-12-13")
				.queryParam("bcircles", "yQ:8.709,49.414,374|tv:8.7025,49.406,1")
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
	public void test_1iun5tn1fq6gm_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and not id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "Iq:8.729,49.400,7")
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
	public void test_u7zlzp3lgiet_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "give_way,track,platform")
				.queryParam("filter", "bicycle!=* and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-12-27")
				.queryParam("bpolys", "J:8.704561,49.403252,8.71982,49.433,8.704523,49.428595,8.723,49.4047,8.704561,49.403252|i:8.704561,49.403252,8.70093,49.4063,8.74657,49.42727,8.701,49.406,8.704561,49.403252|S:8.704561,49.403252,8.713,49.408,8.707,49.426,8.702,49.4069,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_1ien71coqvu49_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,roof,school")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or not id:(1 .. 9999)")
				.queryParam("bboxes", "OE:8.680,49.426,8.73081,49.3859")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-05-12")
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
	public void test_t81v39jian38_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "commercial,track,synagogue")
				.queryParam("filter", "maxspeed!=* and type:way and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-06-05")
				.queryParam("bpolys", "uSo:8.704561,49.403252,8.7036,49.408,8.7219,49.4247,8.741,49.4199,8.704561,49.403252|FS:8.704561,49.403252,8.714,49.4017,8.740,49.415,8.70311,49.4293,8.704561,49.403252|j:8.704561,49.403252,8.716,49.403,8.709595,49.4249,8.70640,49.419,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_t84mxi6g4dgy_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-01-20")
				.queryParam("bcircles", "8.710,49.418144,6|8.7440,49.42516,2")
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
	public void test_1jyd8pvcxq2ie_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hg:8.686,49.40347,8.744,49.392|s:8.66855,49.4088,8.731,49.396|hH:8.6991,49.4288,8.70663,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_tocwl3o6m7g4_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary,ship,turning_circle")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2015-03-05")
				.queryParam("bpolys", "WmxcY:8.704561,49.403252,8.724,49.4231,8.704,49.42221,8.70069,49.4318,8.704561,49.403252|oNr:8.704561,49.403252,8.74910,49.428,8.712,49.422,8.745,49.4164,8.704561,49.403252|ur:8.704561,49.403252,8.739,49.4189,8.7352,49.423,8.7211,49.424701,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_qe9wqr390m5x_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary_link,church")
				.queryParam("bboxes", "U:8.695064,49.42480,8.7266,49.3814|Z:8.66945,49.419988,8.7265,49.395|wYKUV:8.6600,49.4190,8.7288,49.398")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_uve669fon2uw_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-02-08")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.72388,49.42055,8.709,49.4335,8.703,49.408,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_1iuvipitwbepf_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,station")
				.queryParam("filter", "lit=* and not type:way")
				.queryParam("bboxes", "usf:8.697894,49.4192,8.753,49.383|n:8.69010,49.403,8.7350,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-04-03")
				.queryParam("bpolys", "8.704561,49.403252,8.7292,49.4123,8.74303,49.410,8.714,49.424,8.704561,49.403252|8.704561,49.403252,8.714,49.43767,8.700,49.4057,8.7359,49.400957,8.704561,49.403252")
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
	public void test_1ji7asn1j4px0_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=*")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "VBUtl:8.704561,49.403252,8.7327,49.418,8.724,49.413,8.708,49.431,8.704561,49.403252|nXI:8.704561,49.403252,8.716932,49.419,8.704299,49.43118,8.737,49.439,8.704561,49.403252|m:8.704561,49.403252,8.7363,49.421,8.70416,49.419901,8.724,49.409,8.704561,49.403252")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "8.7326,49.410,3|8.733,49.4035,50")
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
	public void test_t4teogcajz1y_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street,synagogue,demolished")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-04-07")
				.queryParam("bpolys", "8.704561,49.403252,8.705568,49.417,8.716,49.417,8.706,49.40041,8.704561,49.403252|8.704561,49.403252,8.73195,49.428531,8.72778,49.414,8.7186,49.427910,8.704561,49.403252|8.704561,49.403252,8.711,49.410,8.747,49.42066,8.7051,49.4361,8.704561,49.403252")
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
	public void test_skscupqpf4mo_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,hotel")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "8.7154,49.421,6")
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
	public void test_rl2ve6k4mhbo_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,speed_camera")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Uo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.4128],[8.718822,49.422],[8.70456,49.4204],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.438],[8.7009,49.422],[8.713,49.401],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.4052],[8.7057,49.4335],[8.70067,49.424],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "66")
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
	public void test_1jyahq81ylcfk_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,living_street")
				.queryParam("filter", "lanes:forward=*")
				.queryParam("bboxes", "vLgfF:8.697,49.41220,8.706,49.399|VEp:8.689,49.4048,8.758,49.393|gMqoP:8.697,49.414,8.752,49.3803")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "23")
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
	public void test_1ji9z20zx2e5v_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* and not type:node or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2016-08-23")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72423,49.410],[8.715,49.4167],[8.700,49.411],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "77")
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
	public void test_u85o9678pdme_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,yes,synagogue")
				.queryParam("bboxes", "8.664,49.4098,8.7216,49.3809")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-08-10")
				.queryParam("timeout", "81")
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
	public void test_vf6finy56cf5_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=*")
				.queryParam("bboxes", "Y:8.651,49.416,8.744,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-08-05")
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
	public void test_s4rteuzb93jn_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,traffic_signals")
				.queryParam("bboxes", "RZ:8.654,49.41696,8.728,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_qe6lv70gw94n_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.665,49.4000,8.70059,49.3822")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "TRxF:8.704561,49.403252,8.7375,49.431,8.709433,49.42003,8.70216,49.424,8.704561,49.403252|W:8.704561,49.403252,8.732,49.408,8.704,49.402,8.7045,49.407,8.704561,49.403252|TS:8.704561,49.403252,8.732,49.422077,8.728,49.43552,8.708849,49.420,8.704561,49.403252")
				.queryParam("timeout", "67")
				.queryParam("groupByKeys", "addr:housenumber,turn:lanes")
				.queryParam("bcircles", "E:8.7445,49.411,8")
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
	public void test_qxqk7iff936s_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1iv1296ijl7hz_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-02-12")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "landuse,bicycle")
				.queryParam("bcircles", "8.734,49.414,1|8.7242,49.414,71")
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
	public void test_t86wp9y77bxu_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "23")
				.queryParam("groupByKeys", "barrier,addr:postcode,turn:lanes")
				.queryParam("bcircles", "b:8.736,49.420,641230767|XUyuh:8.740,49.420,42")
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
	public void test_1k251o0zn61py_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("timeout", "49")
				.queryParam("groupByKeys", "type,lit,lanes")
				.queryParam("bcircles", "uiZLd:8.704,49.428,2|vTXd:8.708,49.404,3")
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
	public void test_qhnt92y3tzxu_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7062,49.4243,8.700,49.4354,8.72757,49.4302,8.704561,49.403252|8.704561,49.403252,8.7048,49.41250,8.724,49.43117,8.718,49.406,8.704561,49.403252|8.704561,49.403252,8.707,49.4292,8.723081,49.42177,8.742,49.411,8.704561,49.403252")
				.queryParam("groupByKeys", "lanes,landuse")
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
	public void test_s4muippip0dt_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6724,49.420,8.738,49.397")
				.queryParam("showMetadata", "no")
				.queryParam("groupByKeys", "addr:country,tracktype,foot")
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
	public void test_1hrm25f9gzd4n_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.663,49.417,8.759,49.3968")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-11-19")
				.queryParam("timeout", "32")
				.queryParam("groupByKeys", "surface,addr:postcode,sidewalk")
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
	public void test_1jyaikj75snkx_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Rjndr:8.6757,49.408,8.729,49.39733|vI:8.668422,49.415,8.7575,49.381|TrK:8.650,49.41925,8.717,49.39172|c:8.6624,49.41036,8.719,49.391038")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-09-05")
				.queryParam("timeout", "87")
				.queryParam("groupByKeys", "lanes:forward,ref,building")
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
	public void test_1h7lyb1q9bc54_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* or geometry:line or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("time", "2014-03-31")
				.queryParam("timeout", "68")
				.queryParam("groupByKeys", "lanes:forward,lanes")
				.queryParam("bcircles", "S:8.706,49.402009,3")
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
	public void test_ubooqio0h4kk_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and type:way and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-01-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xUT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.42611],[8.714,49.423],[8.746,49.433732],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tPPqK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7000,49.414],[8.746,49.424],[8.704078,49.43666],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"cxhy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7236,49.4111],[8.700,49.41657],[8.7055,49.429475],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "landuse,ref,lanes")
				.queryParam("bcircles", "UXuP:8.731,49.411,1")
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
	public void test_t4hvlfqeub1f_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "8.709,49.439,4")
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
	public void test_1hbljhjze6eea_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or geometry:line and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "38")
				.queryParam("groupByKeys", "name,addr:country,lanes:forward")
				.queryParam("bcircles", "8.743,49.42579,2")
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
	public void test_u8diqtafid0h_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or geometry:point and not area:(1.0 .. 1E6)")
				.queryParam("timeout", "61")
				.queryParam("groupByKeys", "name,bicycle")
				.queryParam("bcircles", "V:8.746379,49.4074,533578404")
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
	public void test_sl3fmwkq262e_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "X:8.680,49.419,8.717,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("groupByKeys", "ref,building,source:maxspeed")
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
	public void test_s1eflklqyyb5_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and geometry:line and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Q:8.704561,49.403252,8.732,49.4088,8.7040,49.429,8.704599,49.431,8.704561,49.403252|joA:8.704561,49.403252,8.7185,49.438,8.703,49.4170,8.710,49.41824,8.704561,49.403252")
				.queryParam("timeout", "52")
				.queryParam("groupByKeys", "landuse,maxspeed,oneway")
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
	public void test_vb91s0nuhysl_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "W:8.704561,49.403252,8.712,49.400488,8.738,49.415,8.704,49.423283,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:postcode,addr:country,landuse")
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
	public void test_s1gp1q2koj7b_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:node and not length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.437051,8.7053,49.4158,8.74550,49.4012,8.704561,49.403252")
				.queryParam("groupByKeys", "oneway,lanes")
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
	public void test_1hvb1ox6bd6pl_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and not type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "8.682375,49.42241,8.709,49.381|8.6521,49.4068,8.70043,49.3988")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "turn:lanes,barrier,type")
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
	public void test_skmu2wpr3tye_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Xdod:8.68147,49.404,8.722,49.384")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "smoothness,building,lit")
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
	public void test_1iynba34m9zdt_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,turning_circle")
				.queryParam("filter", "lit!=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-04-25")
				.queryParam("bpolys", "8.704561,49.403252,8.733,49.400,8.7042,49.439,8.7053,49.4004,8.704561,49.403252|8.704561,49.403252,8.7401,49.4239,8.700,49.412,8.722,49.414,8.704561,49.403252|8.704561,49.403252,8.746504,49.4001,8.716,49.40264,8.704556,49.43624,8.704561,49.403252")
				.queryParam("bcircles", "IQIy:8.7444,49.4135,9")
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
	public void test_1jy2p3pn5cncp_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "civic")
				.queryParam("bboxes", "8.695,49.4043,8.726,49.390|8.66022,49.420020,8.7108,49.3815|8.67163,49.4065,8.738,49.397")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-09-21")
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
	public void test_vbpofdlhezp1_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway")
				.queryParam("filter", "oneway=* or id:(1 .. 9999)")
				.queryParam("bboxes", "iulVU:8.6753,49.408,8.755,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "46")
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
	public void test_1k1wqch3lcmya_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "u:8.6527,49.4069,8.753,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-05-07")
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
	public void test_rhr75ls8upf6_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,footway,stop_line")
				.queryParam("bboxes", "8.684,49.40570,8.73496,49.380|8.684,49.424,8.757,49.3942")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
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
	public void test_qe4bmv0y3lgj_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,yes")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-05-02")
				.queryParam("bpolys", "HVg:8.704561,49.403252,8.70914,49.419,8.7160,49.430,8.728,49.4024,8.704561,49.403252")
				.queryParam("timeout", "94")
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
	public void test_rlb73t69h1eu_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("time", "2009-12-21")
				.queryParam("bpolys", "8.704561,49.403252,8.72793,49.403,8.708,49.416581,8.714,49.433172,8.704561,49.403252|8.704561,49.403252,8.735,49.428655,8.705,49.416158,8.7475,49.4322,8.704561,49.403252")
				.queryParam("timeout", "26")
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
	public void test_t87cr45bo9br_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and type:way and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2014-07-03")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "MrJ:8.742,49.4033,37|RvHlE:8.722,49.427967,8")
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
	public void test_vbk5nac1u8h1_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "cngA:8.6544,49.418,8.737,49.3888")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2018-04-16")
				.queryParam("timeout", "48")
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
	public void test_sl6q1jbrf321_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-04-22")
				.queryParam("bpolys", "8.704561,49.403252,8.74709,49.411,8.749,49.4393,8.720,49.420,8.704561,49.403252|8.704561,49.403252,8.749057,49.4198,8.70012,49.435224,8.707,49.423,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_qhiahdh08svl_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "F:8.65739,49.404667,8.707,49.392|A:8.689,49.426,8.717,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("values", "track")
				.queryParam("showMetadata", "no")
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
	public void test_s164qd1zwwtx_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,service,hospital")
				.queryParam("bboxes", "sTV:8.653,49.419,8.724,49.381|OQMsC:8.690848,49.424,8.728,49.387|smc:8.651,49.404933,8.7231,49.389")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.702,49.406892,8.7029,49.4250,8.7088,49.4344,8.704561,49.403252|8.704561,49.403252,8.735,49.425,8.702991,49.4009,8.7477,49.427,8.704561,49.403252|8.704561,49.403252,8.700879,49.4029,8.713,49.421,8.715,49.4160,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_1ib3pv98jpanl_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "TAOHM:8.7481,49.437,4|Twjs:8.732,49.4209,4")
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
	public void test_qhvn1u7jhrg5_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "U:8.704561,49.403252,8.7175,49.403,8.745,49.4093,8.701,49.419,8.704561,49.403252|NbKkS:8.704561,49.403252,8.709,49.4108,8.7082,49.407,8.704560,49.401,8.704561,49.403252")
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
	public void test_1h7u7lr17af5e_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-10-31")
				.queryParam("bpolys", "Pc:8.704561,49.403252,8.700818,49.4263,8.745,49.40137,8.70461,49.42985,8.704561,49.403252|tKrA:8.704561,49.403252,8.736,49.43582,8.70446,49.407,8.7075,49.4025,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_1k25kg8ihezc4_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,service")
				.queryParam("bboxes", "jt:8.6828,49.421,8.7120,49.3944")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-02-17")
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
	public void test_to2b0mdux834_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:line or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2016-11-03")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "z:8.741,49.421,5")
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
	public void test_1hbd6jbadh4df_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("time", "2012-02-03")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "8.721,49.400733,3|8.730,49.436,6|8.703,49.425,7|8.718,49.416,81975822278")
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
	public void test_1jezcp60oepf7_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bpolys", "z:8.704561,49.403252,8.70316,49.409511,8.71544,49.41550,8.749,49.418174,8.704561,49.403252|cypTb:8.704561,49.403252,8.71720,49.4292,8.707,49.437,8.710651,49.409164,8.704561,49.403252|hIo:8.704561,49.403252,8.700,49.4275,8.7463,49.433,8.709,49.4262,8.704561,49.403252")
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
	public void test_ubrx75flk4z9_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,cycleway")
				.queryParam("bboxes", "EGL:8.672,49.405,8.724,49.387|oOxHA:8.6814,49.404,8.75786,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "97")
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
	public void test_s4um17th7n8i_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "turning_circle")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7241,49.412],[8.702,49.406772],[8.700,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.425],[8.702,49.410],[8.705,49.4180],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"HVsns\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.427],[8.7146,49.404],[8.725,49.404],[8.704561,49.403252]]]}}]}")
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
	public void test_vb6dkzm0b5m8_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iyier:8.653,49.4258,8.726,49.397|ss:8.677,49.409,8.7022,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1iavdoyg5hsmq_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("time", "2016-05-29")
				.queryParam("bcircles", "Go:8.7028,49.426,60")
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
	public void test_ubjlxyriikbn_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Qgo:8.696,49.4030,8.738276,49.381")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2009-02-07")
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
	public void test_t4f1vkagdx6e_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and geometry:polygon or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "xlTNp:8.704561,49.403252,8.71757,49.419,8.741,49.41267,8.704593,49.405,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_skvlul0pkl7q_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6562,49.426,8.7114,49.3927")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("time", "2018-01-07")
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
	public void test_s1jyttilhfsn_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ye:8.690824,49.410966,8.709076,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_u82drp72xxlu_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "K:8.6922,49.401236,8.729,49.387|J:8.65590,49.4124,8.7496,49.3844")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "48")
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
	public void test_1hrawna5ypwf5_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.4314],[8.731,49.400],[8.7065,49.4264],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"CBv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73065,49.435],[8.704,49.41221],[8.704590,49.4040],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.4021],[8.71670,49.412],[8.71467,49.430],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "100")
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
	public void test_tol7l748mdko_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-09-02")
				.queryParam("bpolys", "8.704561,49.403252,8.719,49.423,8.704840,49.428,8.70490,49.4158,8.704561,49.403252|8.704561,49.403252,8.709,49.428,8.737523,49.438,8.7159,49.40357,8.704561,49.403252|8.704561,49.403252,8.733,49.429080,8.703,49.412907,8.739,49.413,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_qec6737asson_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6990,49.404,8.706,49.397")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-06-09")
				.queryParam("bpolys", "8.704561,49.403252,8.704,49.428,8.713,49.433961,8.704,49.406060,8.704561,49.403252|8.704561,49.403252,8.706,49.4284,8.70458,49.430107,8.704567,49.4018,8.704561,49.403252|8.704561,49.403252,8.739,49.429,8.74904,49.416041,8.73889,49.425,8.704561,49.403252")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "esF:8.747,49.410701,7|J:8.703355,49.438,3|iz:8.709,49.426321,1")
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
	public void test_t4yzs845a2wl_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and type:relation or length:( .. 100)")
				.queryParam("bboxes", "8.6774,49.428621,8.7087,49.382|8.696,49.41767,8.719,49.3981|8.67011,49.4043,8.74575,49.398|8.691,49.42931,8.7403,49.383524")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-05-26")
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
	public void test_qecnqeqfuss1_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-06-16")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "VuW:8.740,49.439,1|Z:8.74952,49.404,9|Tf:8.710274,49.404,812")
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
	public void test_s0uj8uk7bexw_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.435,8.708,49.434057,8.741,49.433,8.704561,49.403252")
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
	public void test_tocumq89zk2q_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "jJUNh:8.652,49.41017,8.720,49.399000")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1ies9tykvlsfp_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.653,49.418122,8.707,49.3861")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "25")
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
	public void test_ureka5r4dpb8_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "8.747,49.40700,4|8.7132,49.424,8|8.7211,49.407,5")
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
	public void test_1hblk9go1p8ae_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* or geometry:line and not length:( .. 100)")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "zVVr:8.709,49.4290,1|dEty:8.7224,49.424,3")
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
	public void test_1hrj7yvmitzkz_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"KlyE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.420],[8.7091,49.419],[8.706037,49.4363],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "85")
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
	public void test_ts2g33dng46o_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-01-01")
				.queryParam("bpolys", "NbTK:8.704561,49.403252,8.732,49.421,8.749347,49.4161,8.7083,49.4216,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_urgshtg5z12w_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "qqS:8.7032,49.4009,158|S:8.7468,49.415483,750")
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
	public void test_ubj2gdr9hhdg_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "QFlwl:8.665821,49.428137,8.715,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("timeout", "28")
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
	public void test_t4w75vncdxrp_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "a:8.699,49.421,8.74157,49.3869|TQKwK:8.6642,49.427,8.725,49.381|h:8.6823,49.4111,8.752,49.392|p:8.658,49.410,8.755,49.393")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-07-31")
				.queryParam("keys2", "highway")
				.queryParam("values2", "emergency_access_point")
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
	public void test_rhalab43etrm_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "SM:8.6856,49.404556,8.711,49.398|bf:8.694,49.422844,8.706,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("filter2", "lanes!=* or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "traffic_mirror")
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
	public void test_1hbjat0m7px6h_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("types2", "point,line,other")
				.queryParam("format", "geojson")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.748012,49.414968,7")
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
	public void test_qefeq8c3qf5f_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and not type:node")
				.queryParam("bboxes", "RO:8.6751,49.414,8.7449,49.395")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("showMetadata", "false")
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
	public void test_1ib0wxfn3d7w3_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "node,way,relation")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-07-26")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "97")
				.queryParam("values2", "path")
				.queryParam("bcircles", "V:8.70024,49.4170,8")
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
	public void test_1h7lgrhxeg3si_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "json")
				.queryParam("filter2", "lit!=* and area:(1.0 .. 1E6)")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "8.705,49.408,3|8.728,49.401,59")
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
	public void test_1iyc6m57348kh_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,line,polygon,")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and not length:( .. 100)")
				.queryParam("time", "2011-08-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7137,49.423],[8.73132,49.418546],[8.711,49.43629],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
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
	public void test_qy4gpslqu248_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "fwodG:8.6525,49.420,8.728698,49.38156")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_vey62mw82jp2_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "polygon,")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "cycleway")
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
	public void test_1hv0fqwwzzmsw_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "turning_circle")
				.queryParam("time", "2012-12-01")
				.queryParam("bpolys", "yjq:8.704561,49.403252,8.7007,49.4014,8.742,49.421,8.70367,49.4315,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_veynm0tp8zsj_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "93")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "yyWFy:8.732,49.409,3")
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
	public void test_1hbfz5k77wawk_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "GlD:8.666,49.422,8.756,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "98")
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
	public void test_qxfio7jeaxk1_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "way,relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-12-26")
				.queryParam("bpolys", "mPcHE:8.704561,49.403252,8.722552,49.4385,8.707,49.403711,8.728,49.42353,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "21")
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
	public void test_vb943vgupvfl_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.697,49.416065,8.7381,49.383|8.662,49.420,8.711,49.384086|8.651,49.402179,8.753,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("filter2", "turn!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2018-04-19")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "44")
				.queryParam("values2", "elevator")
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
	public void test_s1h7u094ybmp_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "barrier=* or not geometry:line and area:(1.0 .. 1E6)")
				.queryParam("time", "2010-04-23")
				.queryParam("bpolys", "eQEzV:8.704561,49.403252,8.70525,49.43391,8.704,49.42661,8.7054,49.410673,8.704561,49.403252|pD:8.704561,49.403252,8.702,49.418,8.703,49.403,8.709,49.410,8.704561,49.403252")
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
	public void test_1jed6tntnkbq9_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Smy:8.67456,49.4016,8.745,49.392|RW:8.672,49.426,8.720,49.383|KZg:8.689,49.400,8.719076,49.391")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-08-31")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "27")
				.queryParam("values2", "elevator")
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
	public void test_qxob51ucto4k_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-09-09")
				.queryParam("bpolys", "8.704561,49.403252,8.743,49.425,8.749,49.4311,8.703466,49.42725,8.704561,49.403252|8.704561,49.403252,8.7405,49.408,8.7497,49.420671,8.70630,49.416,8.704561,49.403252|8.704561,49.403252,8.725278,49.400,8.70382,49.41119,8.736,49.401,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_vb9l98aza4pv_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-03-16")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "WI:8.733,49.4022,89")
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
	public void test_vf961vq0ac6o_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "cI:8.689,49.414,8.724105,49.3905")
				.queryParam("format", "geojson")
				.queryParam("filter2", "landuse!=* or geometry:line and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "mW:8.704561,49.403252,8.7243,49.423,8.733,49.423,8.720,49.4063,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "crossing")
				.queryParam("bcircles", "8.739,49.4207,69")
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
	public void test_s4xewq7fdtut_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* and geometry:line and area:(1.0 .. 1E6)")
				.queryParam("time", "2018-03-10")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "8.7216,49.433743,7|8.733,49.408,7")
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
	public void test_1ibbj76fu6g6c_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=*")
				.queryParam("time", "2009-11-21")
				.queryParam("bpolys", "YQRNk:8.704561,49.403252,8.7445,49.414729,8.7375,49.418,8.7331,49.4214,8.704561,49.403252|onhdD:8.704561,49.403252,8.7039,49.42902,8.70409,49.424308,8.703,49.4321,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_ubrgfu4namuq_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("filter2", "highway!=*")
				.queryParam("time", "2014-01-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.4377],[8.741,49.402],[8.718,49.413],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"TJG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7119,49.40696],[8.704,49.42679],[8.704521,49.4020],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "85")
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
	public void test_rkwtisvkrfat_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2017-10-31")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "66")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "8.731,49.429,4|8.745,49.4173,90")
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
	public void test_t4fjqc7k9xlw_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "ref!=* or geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.73521,49.4197,8.713512,49.433747,8.746,49.419,8.704561,49.403252|8.704561,49.403252,8.717,49.407,8.701,49.4054,8.7280,49.42407,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
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
	public void test_r1ics6a00lrs_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703749,49.438],[8.7091,49.432],[8.702,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "bus_stop")
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
	public void test_vbhx1teu8unp_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("filter2", "sidewalk!=* or id:(1 .. 9999)")
				.queryParam("time", "2008-08-26")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.744712,49.43141,6")
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
	public void test_t89ndpi5gg8l_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2013-06-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lEFgp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743,49.4132],[8.700,49.4315],[8.723010,49.4071],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "63")
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
	public void test_1jeqi7hu4q6w5_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("filter2", "bicycle=* and type:node")
				.queryParam("bpolys", "K:8.704561,49.403252,8.728,49.40762,8.704047,49.4199,8.70456,49.42542,8.704561,49.403252")
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
	public void test_1jewm3dwkdge1_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Tm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71419,49.408],[8.7048,49.4091],[8.7047,49.40147],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.4027],[8.704,49.4310],[8.723,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.700,49.417721,7|8.710348,49.425148,1")
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
	public void test_uv94mdkg7azm_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "m:8.6612,49.420,8.730,49.390")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-01-05")
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
	public void test_vb42khedmpur_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.688,49.425,8.742,49.3953|8.664,49.4123,8.758,49.3811|8.6521,49.400,8.7337,49.397|8.667,49.420,8.715,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "2012-04-24")
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
	public void test_ubj5i7e7tbua_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "QBH:8.7300,49.4290,5")
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
	public void test_1jyoe7yi2hmb9_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "secondary_link")
				.queryParam("filter2", "ref=* or not geometry:point")
				.queryParam("time", "2009-12-24")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "8.70970,49.40985,7")
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
	public void test_toig4tbawd9u_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or geometry:line and length:( .. 100)")
				.queryParam("types2", "point,polygon,other")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "lit=* and not area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "rP:8.738,49.408,795")
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
	public void test_trz5l8khqmas_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-06-05")
				.queryParam("bpolys", "8.704561,49.403252,8.74464,49.439,8.704,49.4053,8.73788,49.437,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "emergency_access_point")
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
	public void test_qhkkbwawpg6o_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("values", "path")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "destination!=* and geometry:line")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "ei:8.7194,49.425,6|Eb:8.7476,49.419110,7|dlRVQ:8.720,49.403,9|K:8.730695,49.404,108")
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
	public void test_1jyiuocsengwx_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-06-01")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "8.703938,49.405,8|8.703542,49.4209,68")
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
	public void test_ubmf7i9dg8rl_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "primary")
				.queryParam("filter2", "highway!=* and geometry:line")
				.queryParam("time", "2017-09-03")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.433060,8.73198,49.424,8.708160,49.4140,8.704561,49.403252|8.704561,49.403252,8.712,49.420,8.718,49.425,8.714,49.43592,8.704561,49.403252|8.704561,49.403252,8.7466,49.4282,8.70651,49.416,8.7031,49.403,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_s1efz9gg0t9v_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"jiO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.422],[8.719,49.4069],[8.706,49.402],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"foIc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707542,49.423],[8.7041,49.416],[8.709,49.4061],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Sk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.413],[8.749,49.40428],[8.705,49.401],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "KemPY:8.70672,49.41391,259|JtGaX:8.70745,49.4366,5")
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
	public void test_1ibc1we6e40fk_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "vyjw:8.704561,49.403252,8.724,49.422,8.704,49.4132,8.707,49.42402,8.704561,49.403252|QZKOH:8.704561,49.403252,8.713392,49.425,8.7147,49.411,8.7358,49.4392,8.704561,49.403252|pK:8.704561,49.403252,8.724,49.432,8.728,49.414,8.702,49.423,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_1h7im71jct2ed_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "boV:8.6857,49.4043,8.739,49.3865|l:8.6602,49.4047,8.708,49.393|fg:8.679,49.4271,8.72458,49.383")
				.queryParam("format", "json")
				.queryParam("time", "2010-09-01")
				.queryParam("timeout", "47")
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
	public void test_tru39ocew8c8_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6673,49.414,8.749,49.396")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
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
	public void test_t4ctwhzudtur_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-06-14")
				.queryParam("bpolys", "8.704561,49.403252,8.7385,49.439,8.707,49.428940,8.72808,49.436,8.704561,49.403252|8.704561,49.403252,8.7140,49.415,8.7094,49.43533,8.719306,49.4117,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_rh89hksxsdie_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "L:8.727,49.419,7")
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
	public void test_1iyhq5x6a2ptl_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.654,49.4255,8.7521,49.380|8.674,49.405,8.71507,49.384")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-08-18")
				.queryParam("timeout", "47")
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
	public void test_tnzjmxnlm1iq_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=*")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "b:8.717,49.427637,8")
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
	public void test_1hrbfqf0nai5e_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "V:8.686,49.409600,8.7292,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-10-07")
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
	public void test_vf6ftwfj7uqr_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "E:8.681,49.40143,8.7580,49.3929|ogEad:8.650,49.408,8.756,49.3817")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
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
	public void test_1hrs1aaxa2auc_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "GVT:8.6855,49.4102,8.75215,49.393|UUJu:8.6640,49.4116,8.75635,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2018-01-05")
				.queryParam("bpolys", "s:8.704561,49.403252,8.7002,49.426,8.7051,49.4334,8.7372,49.419,8.704561,49.403252")
				.queryParam("bcircles", "lRhE:8.735,49.403079,6")
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
	public void test_qdvksafs0rj9_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-03-07")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "8.7036,49.406,5")
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
	public void test_1h84tk5fnm8fp_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* or geometry:polygon")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-02-19")
				.queryParam("bpolys", "BCGmV:8.704561,49.403252,8.7136,49.428,8.721901,49.438491,8.704,49.416,8.704561,49.403252|l:8.704561,49.403252,8.710,49.414,8.721,49.4058,8.7045,49.4066,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_qxfi9y5t8yue_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-07-29")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "j:8.702,49.419,8|cIh:8.7326,49.415,9")
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
	public void test_1ji1po97kn9kg_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2011-01-12")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.416,8.70457,49.4062,8.70765,49.402,8.704561,49.403252|8.704561,49.403252,8.744263,49.407,8.734,49.411,8.7093,49.43671,8.704561,49.403252")
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
	public void test_t8cx37uyhg84_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-05-24")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.4298,8.7156,49.401060,8.70882,49.41132,8.704561,49.403252|8.704561,49.403252,8.7124,49.408,8.704560,49.43554,8.704588,49.4399,8.704561,49.403252|8.704561,49.403252,8.735,49.401,8.71256,49.4377,8.727,49.4074,8.704561,49.403252")
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
	public void test_u804p8mmddgi_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "8.722,49.4386,3")
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
	public void test_1hv8r2e44jkv7_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "HRvcQ:8.704561,49.403252,8.74918,49.43253,8.700,49.404071,8.722712,49.411,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_1iuqh5n0zerlh_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or geometry:polygon and length:( .. 100)")
				.queryParam("bboxes", "G:8.671848,49.4023,8.700,49.384|Pfgm:8.663,49.426720,8.7395,49.396")
				.queryParam("timeout", "86")
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
	public void test_vf1eznmtw3zr_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "GE:8.659,49.4061,8.736,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("time", "2011-11-17")
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
	public void test_skxu2gmj7ynp_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* and not length:( .. 100)")
				.queryParam("bboxes", "KrS:8.65385,49.401,8.731147,49.3878")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "Pj:8.749,49.4270,2")
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
	public void test_r17cecn3kep0_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6963,49.414590,8.7258,49.3870")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-03-09")
				.queryParam("timeout", "87")
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
	public void test_1jyiuzx3zdj5d_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.7040,49.4146,16")
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
	public void test_rhrp2wh3jl0y_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "n:8.689,49.425,8.72150,49.388")
				.queryParam("time", "2012-04-11")
				.queryParam("timeout", "43")
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
	public void test_ubu698l9yfqx_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-11-08")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "t:8.718,49.408,40|tC:8.725,49.437,91")
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
	public void test_1iun6zmqzelwl_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Wln:8.662,49.423,8.707,49.38881|IcUQ:8.68932,49.4264,8.708295,49.386")
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
	public void test_1jxzwme9zfjae_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and geometry:point or not length:( .. 100)")
				.queryParam("bboxes", "nQ:8.6591,49.404,8.71718,49.39142")
				.queryParam("time", "2016-12-22")
				.queryParam("timeout", "27")
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
	public void test_rhivft8p1d9g_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not geometry:polygon and length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-06-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iVfT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.4025],[8.702859,49.4074],[8.741,49.4122],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "61")
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
	public void test_s12ukkc7021v_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-04-02")
				.queryParam("bpolys", "k:8.704561,49.403252,8.7042,49.409,8.74592,49.4073,8.7333,49.428,8.704561,49.403252|qC:8.704561,49.403252,8.728,49.432,8.7206,49.429,8.7134,49.425,8.704561,49.403252|J:8.704561,49.403252,8.742,49.428573,8.704,49.4315,8.705,49.400,8.704561,49.403252")
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
	public void test_vbhfi7ns4coo_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-01-08")
				.queryParam("bpolys", "b:8.704561,49.403252,8.72012,49.404377,8.71256,49.402270,8.7213,49.411310,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_rh5hpqy76351_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* and type:relation or not id:(1 .. 9999)")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("time", "2014-06-09")
				.queryParam("bpolys", "Xfr:8.704561,49.403252,8.746,49.42290,8.744693,49.431,8.7495,49.4384,8.704561,49.403252|cvG:8.704561,49.403252,8.726,49.427,8.704560,49.403,8.74039,49.4389,8.704561,49.403252|YkI:8.704561,49.403252,8.7077,49.414,8.7032,49.409071,8.70763,49.418,8.704561,49.403252")
				.queryParam("bcircles", "8.715112,49.438524,736")
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
	public void test_urp4a8mhafxt_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-06-20")
				.queryParam("bpolys", "F:8.704561,49.403252,8.70486,49.4168,8.716207,49.40296,8.704,49.429,8.704561,49.403252|t:8.704561,49.403252,8.717,49.437559,8.70382,49.414,8.70833,49.4093,8.704561,49.403252|UOr:8.704561,49.403252,8.701,49.425662,8.7022,49.42144,8.709,49.403,8.704561,49.403252")
				.queryParam("timeout", "47")
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
	public void test_1hrben0d3imhx_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "b:8.677,49.418,8.70385,49.384")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_1jygj7cpv5v7a_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "echM:8.681,49.428347,8.70505,49.397")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-06-29")
				.queryParam("timeout", "100")
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
	public void test_ureji1iljiw1_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "XHDCn:8.746,49.419,186082966")
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
	public void test_1h82khov71y75_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or not id:(1 .. 9999)")
				.queryParam("time", "2016-02-27")
				.queryParam("bcircles", "B:8.733,49.439,5")
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
	public void test_1jictk8i0trab_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "u:8.6912,49.40891,8.751,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("timeout", "67")
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
	public void test_1hru9w5mjqqlv_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "eG:8.7476,49.4044,61")
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
	public void test_1ibc16ucmd275_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or geometry:line and not id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "keogO:8.7065,49.435,9")
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
	public void test_t8fp6mekxnp2_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.685,49.404,8.737,49.384|8.6892,49.4236,8.718,49.395")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2010-12-03")
				.queryParam("timeout", "63")
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
	public void test_sl3fmwkpzdr7_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* and not id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-02-18")
				.queryParam("bcircles", "8.719,49.410,8|8.737,49.4081,9")
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
	public void test_skplgx19w2ev_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "C:8.650,49.423,8.730,49.3840")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-03-25")
				.queryParam("timeout", "95")
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
	public void test_1ji77nwg0el2w_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-02-27")
				.queryParam("bpolys", "TqL:8.704561,49.403252,8.739967,49.416,8.709,49.426,8.738763,49.422,8.704561,49.403252|omHw:8.704561,49.403252,8.72270,49.403,8.702,49.409931,8.706,49.421,8.704561,49.403252|ofeW:8.704561,49.403252,8.725,49.408,8.704,49.400,8.706,49.4158,8.704561,49.403252")
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
	public void test_u7ul5emq9c9v_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-03-05")
				.queryParam("bpolys", "y:8.704561,49.403252,8.713576,49.434,8.7045,49.425,8.70237,49.401,8.704561,49.403252|M:8.704561,49.403252,8.748,49.42186,8.7082,49.4124,8.708522,49.419841,8.704561,49.403252|V:8.704561,49.403252,8.7146,49.4211,8.7406,49.412,8.746,49.4135,8.704561,49.403252")
				.queryParam("timeout", "81")
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
	public void test_somuulcucfab_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* or type:way")
				.queryParam("bboxes", "DD:8.666,49.405,8.70667,49.392")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-07-02")
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
	public void test_1jiai5r8a49d2_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2017-03-24")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "uIKtD:8.70416,49.43550,49")
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
	public void test_1hb7oxpkttzcm_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.7303,49.410777,7")
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
	public void test_vf3og3ci1nw4_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "rPRLG:8.659,49.4143,8.7442,49.384|E:8.6710,49.412,8.726,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-12-22")
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
	public void test_1hux5q9c6f0a9_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "DIKa:8.689308,49.4181,8.740,49.397|ZEI:8.651,49.4171,8.715,49.3957")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
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
	public void test_us08uztcamus_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6717,49.4084,8.704,49.3951|8.67339,49.429,8.7043,49.386|8.698,49.413097,8.7284,49.3829|8.671,49.426010,8.732226,49.3810")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "22")
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
	public void test_1jenpq2kadb94_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ijY:8.652,49.411,8.70934,49.395")
				.queryParam("keys", "highway")
				.queryParam("time", "2013-08-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"SgfQa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.4242],[8.704,49.421596],[8.747439,49.406293],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BhDIt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7226,49.42393],[8.722,49.435539],[8.710,49.416],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7390,49.4169],[8.73226,49.426],[8.70464,49.423],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "8.729,49.4000,3")
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
	public void test_sl6p9d65h1sy_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "I:8.680,49.417,8.739,49.381")
				.queryParam("format", "csv")
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
	public void test_1jeo9lmqfre46_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* and geometry:line")
				.queryParam("bboxes", "s:8.688,49.405796,8.7099,49.395")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_1hr8nkxvhrrxt_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.68814,49.400512,8.7025,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
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
	public void test_t4q472zn0lys_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "f:8.704561,49.403252,8.7210,49.439,8.724,49.415,8.705,49.4298,8.704561,49.403252|vRXqM:8.704561,49.403252,8.700,49.4191,8.706,49.420786,8.700,49.430,8.704561,49.403252|RuNd:8.704561,49.403252,8.704,49.419,8.704091,49.406,8.70128,49.436,8.704561,49.403252")
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
	public void test_tonzd0lxm4ol_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("bcircles", "YFa:8.705,49.415,504")
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
	public void test_1jezbx5rlsj79_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "BS:8.704561,49.403252,8.744,49.410848,8.704,49.415,8.704560,49.40381,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1jiak67z4iqua_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "yFV:8.66357,49.4105,8.747,49.385")
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
	public void test_qxw483gwp1rp_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and geometry:line")
				.queryParam("bboxes", "Ou:8.6882,49.427,8.712674,49.391")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-03-07")
				.queryParam("timeout", "33")
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
	public void test_s15lk80rm34x_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-04-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"H\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.429],[8.704,49.409380],[8.738,49.41376],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"kB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.418],[8.7322,49.430],[8.704,49.42007],[8.704561,49.403252]]]}}]}")
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
	public void test_sof2p4wknm0h_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,school,hotel")
				.queryParam("filter", "lanes:forward!=* or type:way and not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.715,49.412,8.724,49.427,8.704911,49.407,8.704561,49.403252|8.704561,49.403252,8.743,49.426,8.707,49.417,8.742,49.416,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_1iuspfzdfak3d_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,stop_line,demolished")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "XYDey:8.704561,49.403252,8.705,49.4164,8.704080,49.434,8.717797,49.421,8.704561,49.403252|Rz:8.704561,49.403252,8.7264,49.420,8.703,49.4393,8.727,49.427,8.704561,49.403252|Yqo:8.704561,49.403252,8.734,49.413157,8.709,49.426,8.70931,49.405,8.704561,49.403252")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "MdP:8.7183,49.4374,50")
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
	public void test_to4m3t97zsxf_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-06-20")
				.queryParam("bpolys", "f:8.704561,49.403252,8.7354,49.424,8.704590,49.407,8.73576,49.4044,8.704561,49.403252")
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
	public void test_1hrp9g09d7n79_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "university,path")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "qE:8.704561,49.403252,8.72277,49.417,8.74048,49.414,8.705,49.416,8.704561,49.403252|XD:8.704561,49.403252,8.705,49.417,8.728,49.4124,8.711,49.4142,8.704561,49.403252|qLvtN:8.704561,49.403252,8.7366,49.407986,8.745,49.410121,8.732,49.4109,8.704561,49.403252")
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
	public void test_s18ekrkkha9l_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2010-05-02")
				.queryParam("bcircles", "yy:8.702,49.4392,3")
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
	public void test_r179cstd2drq_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=*")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-03-14")
				.queryParam("bcircles", "oYS:8.748,49.4204,4175800597|DF:8.7368,49.43054,9")
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
	public void test_1hblimr4wmyqu_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "ALWkS:8.704561,49.403252,8.718,49.4317,8.7069,49.419,8.7046,49.425,8.704561,49.403252")
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
	public void test_to4jb14felia_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* and geometry:line or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2013-10-25")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.733,49.4156,97|8.701,49.402,36|8.7215,49.419573,37")
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
	public void test_tru554tv6ijq_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* or id:(1 .. 9999)")
				.queryParam("bboxes", "s:8.6948,49.4243,8.7275,49.383|RoaeM:8.667,49.42147,8.7300,49.398|DHOz:8.6620,49.428,8.719,49.390|YqwwJ:8.698,49.403,8.7414,49.385333")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
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
	public void test_1hrdpz2htllpv_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,church")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("bcircles", "8.716,49.417,98")
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
	public void test_vb9mftqrb9dl_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.411,8.709357,49.416,8.700,49.415,8.704561,49.403252")
				.queryParam("bcircles", "Zp:8.705,49.4266,6|J:8.730707,49.432,920")
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
	public void test_t4flaincpp2q_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary")
				.queryParam("bboxes", "8.6950,49.40157,8.7052,49.388")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-09-28")
				.queryParam("bcircles", "8.721,49.4210,8|8.7121,49.420,7")
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
	public void test_1hrjruk4nj4mv_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-06-04")
				.queryParam("bpolys", "SmJFK:8.704561,49.403252,8.7092,49.400,8.72662,49.436,8.700,49.434,8.704561,49.403252|yhW:8.704561,49.403252,8.71052,49.435,8.70453,49.42094,8.704,49.428,8.704561,49.403252|DKrf:8.704561,49.403252,8.731,49.406909,8.730917,49.405871,8.70933,49.419175,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_1iuyrb7hnaqt0_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2011-12-10")
				.queryParam("bcircles", "fk:8.706,49.40149,7|PE:8.712544,49.40520,6")
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
	public void test_uve5s4or6pgi_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,stop,path")
				.queryParam("filter", "oneway!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "8.721,49.40885,2|8.72658,49.424915,8")
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
	public void test_vbhdhtjnrnlh_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.737,49.40005,8.745265,49.427,8.727,49.409607,8.704561,49.403252|8.704561,49.403252,8.705,49.429,8.712,49.424,8.700,49.4017,8.704561,49.403252|8.704561,49.403252,8.701,49.430,8.707,49.420906,8.70284,49.420,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_u7zo97ehm9uu_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,living_street,give_way")
				.queryParam("bboxes", "8.672,49.4174,8.7357,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-06-14")
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
	public void test_1iuqf58k1jnzl_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("bcircles", "CS:8.724,49.406,676|Z:8.705,49.4032,1")
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
	public void test_t8fp6mf34869_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-10-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73854,49.434],[8.727,49.418],[8.705,49.4355],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"sz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7180,49.42758],[8.7098,49.402799],[8.718,49.429],[8.704561,49.403252]]]}}]}")
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
	public void test_1iv3tboupv6m1_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-07-23")
				.queryParam("bcircles", "8.714,49.4032,8")
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
	public void test_1jxzg6fe5lzz9_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "D:8.652,49.429,8.7405,49.385|ULiOA:8.66386,49.412,8.7571,49.3915")
				.queryParam("groupByKey", "building")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("timeout", "55")
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
	public void test_1jy7ri2i4vodu_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and geometry:line or not area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "hotel")
				.queryParam("bboxes", "LwgZj:8.650148,49.4097,8.715,49.393")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-02-12")
				.queryParam("bpolys", "8.704561,49.403252,8.725,49.43381,8.7415,49.419,8.712,49.426,8.704561,49.403252|8.704561,49.403252,8.710,49.412,8.712566,49.4164,8.712,49.431,8.704561,49.403252")
				.queryParam("bcircles", "UoNhV:8.70799,49.428,3")
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
	public void test_s1eet4jto9px_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,path,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2008-05-01")
				.queryParam("bcircles", "Y:8.710,49.402918,2|NVH:8.718,49.4366,343")
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
	public void test_urxgb04nk9x0_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "public,give_way")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-01-13")
				.queryParam("bcircles", "zF:8.7286,49.412,3|TrW:8.710,49.405,72")
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
	public void test_1ib8qpp64tj5h_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "X:8.7080,49.434,8|DkBCL:8.72776,49.4321,9")
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
	public void test_1h7ts0eqdn6sz_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,service")
				.queryParam("filter", "building=* and length:( .. 100)")
				.queryParam("bboxes", "8.663453,49.421,8.747,49.39306|8.655,49.40296,8.739693,49.392091")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-01-07")
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
	public void test_s4mb12qbwo53_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "woVAc:8.6897,49.4266,8.749,49.396|RDC:8.6505,49.427,8.75582,49.390|Yt:8.693,49.412,8.743,49.399|g:8.679576,49.415841,8.7331,49.397")
				.queryParam("groupByKey", "building")
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
	public void test_qe11jh488eoy_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,synagogue,commercial")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"hiKI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705665,49.411],[8.742,49.4244],[8.700,49.4377],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "48")
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
	public void test_1hre7ierx9jjp_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,track,school")
				.queryParam("bboxes", "8.6920,49.428609,8.743,49.3881|8.6771,49.413,8.7443,49.394|8.659264,49.426,8.7175,49.381|8.67955,49.406,8.7354,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_1ievi1i55ydkn_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "civic,dormitory")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.40042],[8.7127,49.434318],[8.704,49.41258],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "74")
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
	public void test_s1gq7vqxvasj_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=*")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2008-08-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"DIaY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74980,49.404],[8.708,49.4269],[8.70401,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "90")
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
	public void test_qhnajzidt4j5_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "traffic_signals,primary_link,steps")
				.queryParam("bboxes", "v:8.65152,49.404,8.703,49.393")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Ed:8.704561,49.403252,8.709,49.405,8.7049,49.432,8.7045,49.437,8.704561,49.403252")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.747,49.4251,8")
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
	public void test_qdyam88qros7_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "ML:8.726,49.425515,17")
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
	public void test_tolpfz3ly5ib_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "give_way,church")
				.queryParam("filter", "addr:housenumber!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "CsmBv:8.6687,49.419,8.745,49.386|i:8.6615,49.4238,8.735,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-03-05")
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
	public void test_urxzewapxd15_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("time", "2011-06-02")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "lYOmS:8.74695,49.425060,45|v:8.736,49.407,5")
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
	public void test_1iykzv41dptth_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or geometry:point and not id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "dt:8.724,49.411121,2|UmBhe:8.7241,49.429,1")
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
	public void test_uvbwpju11agj_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "DrlW:8.7190,49.408,3")
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
	public void test_ublxqfkk65v5_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "chapel")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-03-17")
				.queryParam("bcircles", "8.722,49.4080,2")
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
	public void test_qxtv3a11zx9x_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "lL:8.687,49.412,8.755,49.384")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_qxw3dmf64ies_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("bpolys", "8.704561,49.403252,8.74844,49.421,8.70456,49.41492,8.7131,49.410,8.704561,49.403252")
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
	public void test_1iuvhjdxk8kz4_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.673,49.402,8.743067,49.390|8.6522,49.400,8.759,49.3950")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-01-21")
				.queryParam("bcircles", "r:8.725549,49.410,4")
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
	public void test_1ib0exhwrvho5_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-11-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.41996],[8.735300,49.433101],[8.734,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"aKHZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7177,49.412557],[8.706,49.408],[8.703,49.427],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qgNrD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710482,49.438],[8.704689,49.404],[8.7047,49.4377],[8.704561,49.403252]]]}}]}")
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
	public void test_uvbdzv2vrr6u_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and not geometry:polygon or not length:( .. 100)")
				.queryParam("bpolys", "yTZ:8.704561,49.403252,8.749,49.4176,8.710,49.416628,8.707383,49.427,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_1h84u0no5zho6_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or length:( .. 100)")
				.queryParam("bboxes", "8.693156,49.426,8.736867,49.3803")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-01-30")
				.queryParam("timeout", "72")
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
	public void test_t8cx0hkg36g6_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "gSb:8.6530,49.405,8.71929,49.389|W:8.67500,49.410,8.736,49.386|dEI:8.69328,49.4169,8.715,49.383|Ip:8.65775,49.4232,8.712075,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-07-12")
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
	public void test_t49ibs9vrazo_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "b:8.683,49.400737,8.74733,49.3933|fR:8.674,49.407,8.711,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
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
	public void test_ubgu3mk2ebfn_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.707,49.43529,8.716930,49.412,8.72557,49.402,8.704561,49.403252")
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
	public void test_sohbrf5st2r8_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "8.704561,49.403252,8.73734,49.424,8.73123,49.400,8.704,49.431,8.704561,49.403252|8.704561,49.403252,8.724100,49.4095,8.70497,49.42384,8.74841,49.425356,8.704561,49.403252|8.704561,49.403252,8.712,49.439,8.70081,49.423,8.737,49.437,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1hv897u33dpvd_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-05-15")
				.queryParam("bpolys", "Sx:8.704561,49.403252,8.7190,49.4207,8.7302,49.421554,8.7089,49.400203,8.704561,49.403252|yNF:8.704561,49.403252,8.747389,49.431901,8.7340,49.420247,8.703,49.407,8.704561,49.403252|x:8.704561,49.403252,8.718,49.42408,8.722,49.423,8.7030,49.4033,8.704561,49.403252")
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
	public void test_qxtaw5ja91dg_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "hBJtz:8.7026,49.420,79|FRBMv:8.722,49.431,50")
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
	public void test_1k1zkwzu16436_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "EUkJd:8.692,49.405,8.75529,49.381|Fe:8.66065,49.410,8.74405,49.398|Jn:8.65713,49.404,8.712,49.382|D:8.673201,49.42704,8.733,49.397")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
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
	public void test_qhnva7d7xc2p_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "yZ:8.704561,49.403252,8.73430,49.439,8.701,49.403,8.709055,49.424457,8.704561,49.403252|NF:8.704561,49.403252,8.7126,49.404,8.710,49.414004,8.740,49.43054,8.704561,49.403252|QwO:8.704561,49.403252,8.7125,49.408,8.70842,49.432,8.704599,49.401,8.704561,49.403252")
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
	public void test_ubonhumnom60_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.71663,49.4379,749920686|8.730,49.405,3|8.70530,49.40057,1")
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
	public void test_1ies7k9204ppx_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.7350,49.433,6|8.72182,49.4323,5")
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
	public void test_1iuvz5i2645rn_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "KfrhB:8.660,49.410,8.7041,49.381|oOZ:8.666,49.42620,8.704,49.386|taX:8.6810,49.423324,8.716356,49.381")
				.queryParam("format", "geojson")
				.queryParam("timeout", "66")
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
	public void test_1iupy2evruv5e_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-09-08")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.72292,49.405,7")
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
	public void test_1h7gdwt1t7qrb_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "sL:8.681,49.4187,8.71036,49.382")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-11-01")
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
	public void test_socc0hgq263q_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* or length:( .. 100)")
				.queryParam("bboxes", "8.66394,49.415,8.7013,49.394|8.66425,49.40857,8.747,49.380")
				.queryParam("format", "csv")
				.queryParam("time", "2011-04-26")
				.queryParam("timeout", "52")
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
	public void test_s4xvnzv6cdo1_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("bboxes", "SXxa:8.68875,49.42658,8.72342,49.396")
				.queryParam("format", "json")
				.queryParam("time", "2016-04-17")
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
	public void test_1hrdo0p24z61y_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "EWUid:8.696,49.418,8.7432,49.3958|shhM:8.655,49.41981,8.748,49.3916")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_1iyia1rkfuyjp_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and geometry:line or id:(1 .. 9999)")
				.queryParam("bboxes", "vcW:8.681,49.4002,8.727349,49.3841|EEULH:8.686607,49.415,8.749,49.387|ZHEc:8.674893,49.406484,8.7064,49.391")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "62")
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
	public void test_1iyhq632v1baa_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "CiqJR:8.654,49.416972,8.702,49.382")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-08-10")
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
	public void test_1jyobvxg1f0hl_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and type:node")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-04-13")
				.queryParam("bpolys", "SxBE:8.704561,49.403252,8.7008,49.429,8.712,49.42635,8.701,49.427,8.704561,49.403252|bjPvz:8.704561,49.403252,8.7249,49.414,8.70470,49.417,8.706112,49.419,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_t4catdtup4q8_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "KT:8.68336,49.415,8.7320,49.394|b:8.697,49.403,8.7135,49.392")
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
	public void test_sksai978x6pf_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "w:8.704561,49.403252,8.722,49.4350,8.7327,49.4386,8.7324,49.42261,8.704561,49.403252|Kj:8.704561,49.403252,8.724499,49.438217,8.705,49.414,8.703,49.4006,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_s1dw3pbeqqn7_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.681574,49.411329,8.711184,49.386|8.6585,49.423,8.745,49.381|8.670347,49.419,8.707,49.382|8.6653,49.429,8.726,49.385221")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "78")
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
	public void test_1iepiiintsym1_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:line and not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.737,49.434,613|8.701,49.413,92|8.707,49.420,9")
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
	public void test_rl2twgwemb79_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.428,8.705,49.421,8.7043,49.401,8.704561,49.403252|8.704561,49.403252,8.703,49.401,8.7044,49.413,8.708,49.42556,8.704561,49.403252|8.704561,49.403252,8.703396,49.411346,8.708,49.40398,8.704612,49.40565,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_qxiau43h5dm9_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or geometry:line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-07-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"eG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.419],[8.700,49.4373],[8.7040,49.42422],[8.704561,49.403252]]]}}]}")
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
	public void test_1h84sgou8kawo_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("time", "2010-09-27")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "8.738,49.4083,4|8.7195,49.423,9")
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
	public void test_1ib8p5n4g6v5g_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or id:(1 .. 9999)")
				.queryParam("bboxes", "lnnIi:8.652513,49.4108,8.715,49.3849")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_1hux642jqj0x2_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "wdi:8.6905,49.412,8.743,49.3801|d:8.659,49.415,8.70788,49.3817")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_vbhe9fnkyp29_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and length:( .. 100)")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "tb:8.704561,49.403252,8.727900,49.427,8.736,49.428,8.7031,49.425,8.704561,49.403252|iYT:8.704561,49.403252,8.735,49.418,8.706,49.424,8.7044,49.418035,8.704561,49.403252|yU:8.704561,49.403252,8.715,49.437,8.735,49.425,8.729,49.419,8.704561,49.403252")
				.queryParam("timeout", "47")
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
	public void test_1k1zkuqxrmo9u_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "p:8.661,49.418,8.70097,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-02-20")
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
	public void test_1iukdqb5t50td_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-07-25")
				.queryParam("bcircles", "bQBYd:8.7105,49.418,2|e:8.723,49.412,16|MFIL:8.7044,49.408,3|YYO:8.724,49.4167,8")
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
	public void test_1ien696w4oodh_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "n:8.6970,49.410,8.711,49.3986")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("timeout", "21")
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
	public void test_s4ukshew5y5v_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-12-09")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "8.7105,49.409,2|8.737,49.43234,5")
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
	public void test_r1g4hrj991t0_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-02-18")
				.queryParam("timeout", "100")
				.queryParam("bcircles", "meU:8.7167,49.4398,2|OC:8.702,49.4368,68")
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
	public void test_qhsuhgsqnecj_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=* and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-07-31")
				.queryParam("bpolys", "Rj:8.704561,49.403252,8.715,49.403,8.700,49.439922,8.706,49.4231,8.704561,49.403252|nCk:8.704561,49.403252,8.719,49.415,8.70019,49.438,8.701528,49.427,8.704561,49.403252|hjAs:8.704561,49.403252,8.747,49.4242,8.7087,49.434,8.72786,49.4221,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_1k22soanorq01_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Wh:8.662376,49.415,8.713,49.387")
				.queryParam("format", "json")
				.queryParam("time", "2016-06-15")
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
	public void test_1k253mc1bc20h_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,yes")
				.queryParam("filter", "source:maxspeed=* or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-01-23")
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
	public void test_rhdccl5zrvxh_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street")
				.queryParam("bboxes", "fYy:8.6915,49.421,8.731,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("time", "2010-03-27")
				.queryParam("bpolys", "8.704561,49.403252,8.73035,49.434,8.7175,49.430,8.703,49.412,8.704561,49.403252|8.704561,49.403252,8.701,49.419,8.742,49.433,8.70484,49.439,8.704561,49.403252|8.704561,49.403252,8.742,49.422,8.701,49.419,8.704561,49.4120,8.704561,49.403252")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.712265,49.407,2")
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
	public void test_us0qsqlbbjhi_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_signals,secondary_link")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-11-17")
				.queryParam("bpolys", "8.704561,49.403252,8.7491,49.431,8.7014,49.419,8.734,49.403,8.704561,49.403252|8.704561,49.403252,8.732,49.412,8.70441,49.4163,8.738,49.410,8.704561,49.403252")
				.queryParam("timeout", "94")
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
	public void test_1if0i13b4ld81_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bcircles", "HvmWV:8.732554,49.423,1")
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
	public void test_s1jevcepwbw6_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "8.732,49.4363,5")
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
	public void test_vf1eaibwg1fa_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2009-10-19")
				.queryParam("bpolys", "wEv:8.704561,49.403252,8.701,49.4115,8.711153,49.4233,8.7079,49.416,8.704561,49.403252|n:8.704561,49.403252,8.742,49.408469,8.70007,49.431,8.726,49.43386,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_u7ol5vozvt4g_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-03-09")
				.queryParam("bpolys", "e:8.704561,49.403252,8.728,49.4239,8.701087,49.4081,8.705,49.430216,8.704561,49.403252|TP:8.704561,49.403252,8.724,49.404,8.7274,49.42449,8.724,49.403,8.704561,49.403252|pQpIY:8.704561,49.403252,8.7037,49.428,8.7157,49.422,8.709230,49.4237,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_1hv88frgabk8g_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,chapel,turning_circle")
				.queryParam("bboxes", "8.678,49.4164,8.722,49.3839")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "92")
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
	public void test_r1cuurl20f1u_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,secondary_link,path")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("bcircles", "TxwW:8.714,49.4105,1|BM:8.7378,49.402,1|LUU:8.74880,49.434,261")
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
	public void test_1iepzl377cpx0_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,footway,platform")
				.queryParam("filter", "turn=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "8.7374,49.427048,7")
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
	public void test_qhnva6yu7zg1_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,pedestrian,traffic_signals")
				.queryParam("filter", "turn!=* and not geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "M:8.746,49.400,3|W:8.706,49.427,410")
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
	public void test_rhg23qp73eph_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.7390,49.412993,8")
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
	public void test_1k1wsr4kc72gj_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,street_lamp,garage")
				.queryParam("bboxes", "8.66811,49.403,8.708,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "no")
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
	public void test_1ib8rt5sc1mba_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,pedestrian,traffic_signals")
				.queryParam("filter", "service=driveway or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "p:8.704561,49.403252,8.7105,49.402404,8.7042,49.4022,8.7190,49.4185,8.704561,49.403252|sS:8.704561,49.403252,8.720786,49.42980,8.7040,49.4223,8.747063,49.406,8.704561,49.403252")
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
	public void test_u8dz47silt29_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,church,platform")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "cBPOl:8.710,49.4125,435")
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
	public void test_1iv4a0pnb70px_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,stop_line,synagogue")
				.queryParam("filter", "highway=* or type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "EVe:8.6857,49.40683,8.709,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "40")
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
	public void test_us2z5m4q402q_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,civic")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2015-08-15")
				.queryParam("bcircles", "UUjoW:8.723,49.4340,8")
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
	public void test_qhvn1smnvtpu_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "qHF:8.704561,49.403252,8.748,49.43550,8.70834,49.430912,8.717487,49.415,8.704561,49.403252|ufdiJ:8.704561,49.403252,8.7362,49.4016,8.728,49.4065,8.717,49.402,8.704561,49.403252")
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
	public void test_1ieya4xwko8rq_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,service")
				.queryParam("bboxes", "aea:8.654,49.402,8.7293,49.3976|hR:8.6850,49.401,8.725,49.382|lT:8.67766,49.415955,8.7267,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
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
	public void test_to2c9kcvhult_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory,demolished,residential")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "8.729064,49.421,3|8.7326,49.4166,7")
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
	public void test_qhsw1l8du06e_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and not type:way and not id:(1 .. 9999)")
				.queryParam("bboxes", "rwpnS:8.6727,49.4166,8.722,49.3801|HB:8.6541,49.42015,8.737490,49.386|RPTpg:8.659,49.418,8.7338,49.3902")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-03-20")
				.queryParam("groupByKeys", "turn:lanes,foot")
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
	public void test_u7znhgp6zm1y_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "P:8.687,49.425,8.715,49.398|RTgZF:8.692182,49.41845,8.707,49.3923")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("bcircles", "BikQ:8.703,49.400,4|BVCeM:8.701,49.424324,4|xZ:8.749264,49.4056,2|Q:8.734762,49.420264,5")
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
	public void test_qy1mx8hjq5o5_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"szRDF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72434,49.425],[8.700,49.411],[8.7200,49.4139],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"NRXgq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.4085],[8.702,49.405369],[8.737,49.41449],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "59")
				.queryParam("groupByKeys", "addr:postcode,smoothness")
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
	public void test_1ji1rb2acdftu_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "VoLLp:8.6880,49.4047,8.726,49.3843|FBxC:8.662,49.4234,8.704,49.395")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "80")
				.queryParam("groupByKeys", "addr:city,destination,surface")
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
	public void test_ubop230d62pi_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("timeout", "76")
				.queryParam("groupByKeys", "lanes:forward,addr:country,network")
				.queryParam("bcircles", "T:8.70717,49.419511,11|FX:8.7114,49.41449,8")
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
	public void test_1jig3c23pvsdi_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and geometry:polygon and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2013-07-28")
				.queryParam("bpolys", "8.704561,49.403252,8.7478,49.429469,8.735,49.419,8.704184,49.418,8.704561,49.403252")
				.queryParam("groupByKeys", "highway,lit,turn:lanes")
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
	public void test_rhg1pxh2rzuc_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or id:(1 .. 9999)")
				.queryParam("time", "2013-09-03")
				.queryParam("groupByKeys", "oneway")
				.queryParam("bcircles", "UmfF:8.7469,49.4171,5")
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
	public void test_1iyf0c8gy2wc8_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "type,ref")
				.queryParam("bcircles", "Pm:8.7020,49.439264,1")
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
	public void test_s1gocehie8mo_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "t:8.704561,49.403252,8.740,49.411,8.71009,49.418,8.701,49.4306,8.704561,49.403252|bsKK:8.704561,49.403252,8.732368,49.428,8.711,49.4001,8.718508,49.429,8.704561,49.403252")
				.queryParam("timeout", "80")
				.queryParam("groupByKeys", "sidewalk,network")
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
	public void test_1h7rglzs3xm5g_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-01-13")
				.queryParam("bpolys", "sBbKS:8.704561,49.403252,8.724,49.415486,8.704560,49.410907,8.7206,49.4285,8.704561,49.403252")
				.queryParam("timeout", "72")
				.queryParam("groupByKeys", "surface,bicycle,turn")
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
	public void test_to2bhe5xa0qf_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "G:8.675841,49.428431,8.749,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-07-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HgBg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.415],[8.7042,49.418046],[8.716,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"bVgi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7202,49.425],[8.71837,49.403],[8.742,49.409],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "29")
				.queryParam("groupByKeys", "type,smoothness,landuse")
				.queryParam("bcircles", "gwCKM:8.700533,49.437010,6|d:8.731,49.420865,207")
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
	public void test_ubrwsyejej3p_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "dcmf:8.688,49.416,8.747,49.3954|Zq:8.690,49.401537,8.75594,49.397|MWmU:8.6516,49.416601,8.741,49.3905|ft:8.685266,49.408,8.74528,49.382")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2007-12-06")
				.queryParam("bcircles", "8.734,49.4334,1|8.712,49.4280,61|8.7076,49.4021,8")
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
	public void test_t49ipts691eu_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=*")
				.queryParam("format", "csv")
				.queryParam("time", "2010-01-17")
				.queryParam("timeout", "84")
				.queryParam("groupByKeys", "surface,type,ref")
				.queryParam("bcircles", "H:8.713725,49.43932,7")
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
	public void test_uv8l27f4o2ud_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "li:8.688,49.421,8.7348,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "lanes")
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
	public void test_1jyd93qxeman8_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "as:8.704561,49.403252,8.7396,49.431,8.7040,49.415,8.726,49.4278,8.704561,49.403252|idQY:8.704561,49.403252,8.7400,49.422,8.70839,49.40941,8.705211,49.4191,8.704561,49.403252")
				.queryParam("timeout", "42")
				.queryParam("groupByKeys", "lanes:forward,surface,building")
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
	public void test_rl03m2uqmhiv_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.743,49.418,8.7486,49.414259,8.7385,49.4260,8.704561,49.403252|ESNpR:8.704561,49.403252,8.710983,49.4226,8.7302,49.429,8.741,49.427,8.704561,49.403252|p:8.704561,49.403252,8.722379,49.400,8.70205,49.428997,8.714,49.405,8.704561,49.403252")
				.queryParam("timeout", "81")
				.queryParam("groupByKeys", "highway,oneway,building")
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
	public void test_t4yftwyoz96d_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "23")
				.queryParam("groupByKeys", "turn:lanes,name,lit")
				.queryParam("bcircles", "Iykpt:8.712,49.424,3|Ny:8.7188,49.4351,72")
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
	public void test_qxnrnua1koc8_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:node")
				.queryParam("bboxes", "8.653,49.407893,8.736717,49.387")
				.queryParam("time", "2013-02-26")
				.queryParam("timeout", "34")
				.queryParam("groupByKeys", "bicycle,barrier")
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
	public void test_t8f65mgxt5px_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6722,49.427,8.75452,49.382")
				.queryParam("format", "csv")
				.queryParam("timeout", "70")
				.queryParam("groupByKeys", "source:maxspeed,network,name")
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
	public void test_toiyg1jnlsv8_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or type:relation and length:( .. 100)")
				.queryParam("time", "2011-01-07")
				.queryParam("bpolys", "8.704561,49.403252,8.737,49.4369,8.728,49.4232,8.70476,49.418,8.704561,49.403252|8.704561,49.403252,8.729954,49.4191,8.70454,49.434,8.748,49.434,8.704561,49.403252")
				.queryParam("groupByKeys", "highway,oneway,building")
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
	public void test_rhoeabbv22xv_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "turning_circle,service")
				.queryParam("filter", "destination!=* or type:node")
				.queryParam("bboxes", "nG:8.657,49.40301,8.722,49.39754")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.4060],[8.74347,49.437],[8.7246,49.423],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qwnK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.432],[8.700,49.401],[8.736,49.404090],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"S\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7419,49.4024],[8.704,49.436],[8.728703,49.432],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "O:8.71435,49.4128,6|F:8.701,49.419,7|uxrVF:8.74014,49.427,8")
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
	public void test_t4w6rmnl7h9y_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or not type:way")
				.queryParam("bboxes", "jMMfD:8.684,49.400,8.741,49.390|P:8.671,49.411,8.752,49.388|bTvON:8.651,49.413,8.716,49.392|Gg:8.680,49.40841,8.717,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2012-07-16")
				.queryParam("bpolys", "PB:8.704561,49.403252,8.749394,49.421,8.736,49.425,8.714,49.433,8.704561,49.403252")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "8.700,49.401,7")
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
	public void test_rhtw73jy10tf_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,traffic_mirror,secondary")
				.queryParam("bboxes", "HLfzu:8.6759,49.405830,8.74708,49.387|poGxv:8.6722,49.40286,8.704,49.380")
				.queryParam("groupByKey", "highway")
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
	public void test_t89ojwgakyn7_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory,residential")
				.queryParam("bboxes", "NArj:8.65146,49.4009,8.712,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
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
	public void test_skk14x7zdkc2_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory")
				.queryParam("bboxes", "8.6979,49.41696,8.751,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-10-05")
				.queryParam("timeout", "77")
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
	public void test_rl2uztzaqkhk_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and id:(1 .. 9999)")
				.queryParam("bboxes", "NfY:8.669,49.414373,8.755,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
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
	public void test_1jettuqbkagxe_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-06-18")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "8.7339,49.4284,80")
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
	public void test_vf6xrf0ghr8y_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "commercial,emergency_access_point")
				.queryParam("bboxes", "zr:8.676,49.416854,8.7530,49.3955")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "2012-06-09")
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
	public void test_1iyn9s77d61iv_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,chapel,civic")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.7048,49.429,4")
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
	public void test_vf3myrjzcnqp_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.65890,49.404214,8.736,49.389|8.6550,49.401506,8.7337,49.387|8.687,49.418,8.71748,49.3978")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
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
	public void test_1ji1oibu3b3g2_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "JDP:8.683,49.41884,8.731,49.3816")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-04-27")
				.queryParam("bcircles", "I:8.706,49.4014,7|Iaf:8.7260,49.4247,61|FTe:8.73891,49.41581,9")
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
	public void test_qdy9u5zt3uxu_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-05-20")
				.queryParam("bpolys", "n:8.704561,49.403252,8.7492,49.4378,8.730,49.433,8.74386,49.43383,8.704561,49.403252")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "zo:8.739,49.424,5")
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
	public void test_tru3737r86ee_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,speed_camera,primary")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "vyg:8.721,49.430,4|k:8.7022,49.407,2|LcJw:8.71072,49.411845,8")
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
	public void test_qxyud8h707xw_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "uzFqr:8.693,49.41358,8.710,49.380|BM:8.6664,49.400,8.740,49.3806")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_1h7fuf7pelc2t_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,service,give_way")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2008-05-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"B\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74278,49.406],[8.7415,49.427548],[8.704918,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"X\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743447,49.429],[8.714,49.409],[8.701,49.420],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ybzrg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734338,49.419],[8.722,49.428],[8.72183,49.410],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "20")
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
	public void test_u82dpadfyrzo_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,residential,track")
				.queryParam("bboxes", "x:8.653038,49.400,8.716,49.388|nkaNE:8.685,49.419,8.7407,49.39799|H:8.656,49.419,8.718877,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "43")
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
	public void test_uv5tcqqvu3xh_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "commercial,school")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "lSdC:8.704561,49.403252,8.724,49.401,8.7005,49.426,8.700,49.406356,8.704561,49.403252|X:8.704561,49.403252,8.709,49.430738,8.743566,49.405,8.704,49.4327,8.704561,49.403252|D:8.704561,49.403252,8.7251,49.439,8.747,49.405,8.701,49.436,8.704561,49.403252")
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
	public void test_1hr5bwzrfixr9_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and geometry:point and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-07-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.428],[8.706,49.401533],[8.725,49.41162],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"JYf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.413],[8.709279,49.43822],[8.73700,49.431],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "36")
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
	public void test_1jefgnqsbbh41_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "E:8.704561,49.403252,8.745,49.41505,8.70753,49.43017,8.706421,49.401,8.704561,49.403252")
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
	public void test_r1ajrn2xjmg3_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-08-14")
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.429,8.709,49.43893,8.745619,49.4386,8.704561,49.403252|8.704561,49.403252,8.748674,49.4027,8.720,49.432386,8.704,49.430,8.704561,49.403252|8.704561,49.403252,8.721,49.43175,8.701,49.400241,8.7045,49.42253,8.704561,49.403252")
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
	public void test_to7d1fxlup9f_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.722816,49.405,8.738844,49.439486,8.70045,49.4055,8.704561,49.403252")
				.queryParam("bcircles", "RFPp:8.744,49.4024,15")
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
	public void test_r1aju7gm8oc0_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-08-27")
				.queryParam("bpolys", "bBfMi:8.704561,49.403252,8.738,49.403251,8.708,49.427,8.726,49.4020,8.704561,49.403252|K:8.704561,49.403252,8.7293,49.434,8.747,49.430,8.7438,49.42854,8.704561,49.403252|F:8.704561,49.403252,8.712,49.4262,8.702,49.4335,8.736,49.4043,8.704561,49.403252")
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
	public void test_urxy8uwksppw_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-09-12")
				.queryParam("bpolys", "kEa:8.704561,49.403252,8.738,49.423,8.728,49.420,8.708,49.425,8.704561,49.403252")
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
	public void test_1hbd7p2udloag_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("bpolys", "QqYW:8.704561,49.403252,8.737382,49.4220,8.726741,49.402672,8.704,49.436202,8.704561,49.403252|X:8.704561,49.403252,8.732,49.4280,8.702,49.417,8.7059,49.4395,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_sohwcr2o77sj_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or length:( .. 100)")
				.queryParam("bboxes", "d:8.67363,49.400047,8.755862,49.396")
				.queryParam("time", "2011-03-12")
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
	public void test_urgv87hokrc1_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* and not geometry:line or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JFJR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.432],[8.7081,49.427],[8.703,49.437],[8.704561,49.403252]]]}}]}")
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
	public void test_s1ji27zhzby0_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or geometry:line")
				.queryParam("bboxes", "Re:8.6531,49.4201,8.750,49.3847|Odv:8.651587,49.402548,8.72314,49.382")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-12-11")
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
	public void test_qhvlvhe0spio_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "h:8.65241,49.417,8.737,49.398|WR:8.662,49.421290,8.706,49.399")
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
	public void test_1iay68yt9jfhs_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:polygon or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-10-16")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "8.734,49.430116,6")
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
	public void test_vf3pm6nwlppd_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2008-01-24")
				.queryParam("bpolys", "lDSS:8.704561,49.403252,8.743,49.402,8.709571,49.412,8.737,49.429,8.704561,49.403252|fPJ:8.704561,49.403252,8.728934,49.4341,8.7358,49.43266,8.7152,49.412,8.704561,49.403252|Epq:8.704561,49.403252,8.7454,49.4238,8.705,49.429,8.702,49.4017,8.704561,49.403252")
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
	public void test_to1tvps4iwjb_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "DsMpa:8.678,49.4247,8.731,49.3893|DkUCo:8.6580,49.4155,8.731,49.388142")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-09-18")
				.queryParam("bpolys", "G:8.704561,49.403252,8.72539,49.4012,8.736,49.42233,8.70457,49.401169,8.704561,49.403252|sHCsS:8.704561,49.403252,8.741,49.4024,8.726713,49.420,8.7224,49.417,8.704561,49.403252|pthY:8.704561,49.403252,8.7424,49.402856,8.72277,49.40848,8.7049,49.4207,8.704561,49.403252")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "8.710,49.4325,486")
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
	public void test_1iauwjhouihx4_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "uJ:8.6942,49.4292,8.717115,49.398")
				.queryParam("format", "geojson")
				.queryParam("timeout", "68")
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
	public void test_sobs7pi49v77_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=*")
				.queryParam("bboxes", "a:8.696,49.405,8.748369,49.3868|nIW:8.6811,49.4135,8.721,49.3981|q:8.697,49.427,8.7332,49.398")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-04-07")
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
	public void test_u85oypndfrjt_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=*")
				.queryParam("bboxes", "aoYkY:8.674,49.41857,8.73200,49.3899")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-02-01")
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
	public void test_1ibc0f01qzrcj_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("time", "2017-12-16")
				.queryParam("bpolys", "f:8.704561,49.403252,8.705,49.424,8.7429,49.408,8.7096,49.406,8.704561,49.403252|k:8.704561,49.403252,8.721,49.4279,8.741957,49.418,8.7033,49.430,8.704561,49.403252|WYMZZ:8.704561,49.403252,8.739958,49.4362,8.714,49.4103,8.70339,49.4060,8.704561,49.403252")
				.queryParam("timeout", "80")
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
	public void test_1iupz5na0l8px_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "cLw:8.742,49.402,9")
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
	public void test_t4w6g9u9hx6a_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "p:8.674,49.412,8.731,49.3958|BsR:8.685,49.406,8.730,49.3818")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("timeout", "56")
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
	public void test_r1a3emelv3vo_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2008-05-08")
				.queryParam("bpolys", "mZ:8.704561,49.403252,8.722209,49.4031,8.7083,49.427700,8.736,49.4129,8.704561,49.403252|SrK:8.704561,49.403252,8.7251,49.430543,8.746,49.432,8.717,49.404,8.704561,49.403252|DBuL:8.704561,49.403252,8.722,49.430,8.748,49.43737,8.7001,49.40004,8.704561,49.403252")
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
	public void test_rhtw9yin3zhg_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-09-24")
				.queryParam("bpolys", "wN:8.704561,49.403252,8.714,49.407,8.7292,49.420463,8.704,49.421,8.704561,49.403252")
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
	public void test_soempp61p6i9_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "MTJt:8.656,49.408,8.708,49.388")
				.queryParam("format", "csv")
				.queryParam("timeout", "48")
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
	public void test_1hbm2i5se3qsl_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "NfCXs:8.654,49.41775,8.720,49.3983")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("filter2", "building=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "71")
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
	public void test_rhug2o4297w7_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "line,polygon,other")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "addr:housenumber!=* and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "unclassified")
				.queryParam("bcircles", "Fl:8.716,49.4294,5|Vgg:8.715,49.422710,9")
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
	public void test_qe1l3jocomd5_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("types2", "way,relation")
				.queryParam("filter2", "building!=* or not length:( .. 100)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Wx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7137,49.4299],[8.703,49.433],[8.7485,49.412],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "84")
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
	public void test_1jiajscfrmjar_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and not type:way or id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "network=* and type:relation or not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.7254,49.427,8.718,49.4261,8.729,49.4121,8.704561,49.403252|8.704561,49.403252,8.7436,49.43028,8.74362,49.42260,8.70824,49.405,8.704561,49.403252|8.704561,49.403252,8.74990,49.4115,8.704642,49.414,8.7325,49.415,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_r1a3gwv7456c_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-04-18")
				.queryParam("bpolys", "AE:8.704561,49.403252,8.7296,49.428,8.741,49.4012,8.7032,49.423,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_u87w2musbyhx_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HXYly:8.682,49.4087,8.717,49.3817|YeL:8.6644,49.4179,8.71163,49.3854|g:8.681,49.424,8.7435,49.391|bjXb:8.680,49.413,8.754,49.394")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "addr:street!=* and id:(1 .. 9999)")
				.queryParam("time", "2011-09-03")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "59")
				.queryParam("values2", "turning_circle")
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
	public void test_1h820aidm6gqd_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* or type:way and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-07-03")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.409,8.70497,49.416,8.721,49.400,8.704561,49.403252|8.704561,49.403252,8.720,49.439,8.7045,49.4202,8.701,49.433,8.704561,49.403252|8.704561,49.403252,8.73618,49.42006,8.7001,49.417,8.734,49.426,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_rkwtlbofycz4_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-03-30")
				.queryParam("bcircles", "UuoZX:8.74051,49.435,284")
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
	public void test_r1lmvhtj8hmc_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or not type:way")
				.queryParam("bboxes", "dOlsy:8.690,49.412845,8.70333,49.399")
				.queryParam("types2", "node,way,relation")
				.queryParam("filter2", "ref!=* and not id:(1 .. 9999)")
				.queryParam("time", "2016-11-07")
				.queryParam("keys2", "highway")
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
	public void test_to4kvff89wzc_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "v:8.695,49.405,8.7099,49.393|N:8.6529,49.42331,8.739,49.384")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "surface=* or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_1h81zts85cjtv_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "mKA:8.663,49.4087,8.74731,49.385|t:8.671,49.40859,8.7439,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "foot!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "HW:8.72163,49.4202,6|An:8.733,49.400,7")
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
	public void test_urjl21bivak4_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "20")
				.queryParam("values2", "give_way")
				.queryParam("bcircles", "OKg:8.71105,49.420,9")
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
	public void test_qxyucy8q846q_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("format", "csv")
				.queryParam("filter2", "foot!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("time", "2012-05-30")
				.queryParam("bcircles", "T:8.701839,49.4294,4")
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
	public void test_1hr84v8rb6wqh_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "line,")
				.queryParam("filter2", "network!=* and type:way")
				.queryParam("time", "2016-07-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EPWE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7311,49.433],[8.704577,49.409292],[8.702,49.41370],[8.704561,49.403252]]]}}]}")
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
	public void test_qxwn93d45hyt_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qHn:8.696,49.404721,8.712,49.395|k:8.6980,49.413,8.7360,49.386|r:8.692380,49.417153,8.734,49.389")
				.queryParam("types2", "node,way,")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "69")
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
	public void test_1ji7seg4j33g0_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2016-09-13")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "66")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "8.714,49.4249,62")
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
	public void test_s13bsbl94rp4_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=* or type:way and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "lanes:backward!=*")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "t:8.703616,49.409,6|s:8.7462,49.439,9")
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
	public void test_1iepig7tayzp2_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "x:8.665,49.4010,8.7367,49.394")
				.queryParam("types2", "polygon,")
				.queryParam("format", "json")
				.queryParam("time", "2016-06-25")
				.queryParam("timeout", "46")
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
	public void test_1jeqhhy1ip3dy_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and not area:(1.0 .. 1E6)")
				.queryParam("types2", "point,polygon,")
				.queryParam("format", "geojson")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "ctkTE:8.700,49.401,2|Bzb:8.7203,49.439,9")
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
	public void test_t4vpm9gz03fm_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and type:node")
				.queryParam("types2", "way,relation")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-03-28")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "rw:8.7432,49.416,3")
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
	public void test_1hr8nktlg6uee_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "uB:8.704561,49.403252,8.7180,49.434209,8.726320,49.403842,8.749923,49.434801,8.704561,49.403252|RVtX:8.704561,49.403252,8.7211,49.417,8.70604,49.427182,8.746,49.432693,8.704561,49.403252")
				.queryParam("bcircles", "8.714,49.418,2")
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
	public void test_1jifky5khxtgj_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "node,way,")
				.queryParam("filter2", "addr:housenumber!=* and id:(1 .. 9999)")
				.queryParam("time", "2008-05-15")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "IS:8.7157,49.414702,47")
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
	public void test_qxtc22ji5q3q_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.655,49.402,8.717,49.38170|8.66654,49.404,8.727,49.392|8.6854,49.40603,8.74366,49.380")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "31")
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
	public void test_1h8228rh4v2gl_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "I:8.658,49.424,8.757867,49.3830|jdecr:8.67453,49.411155,8.700650,49.399")
				.queryParam("types2", "node,relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "name!=* or type:way and id:(1 .. 9999)")
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
	public void test_qhnc3u1jjne8_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or id:(1 .. 9999)")
				.queryParam("types2", "relation")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "barrier!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2011-12-08")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "zag:8.74069,49.400,8")
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
	public void test_1if0kg2jk4orq_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "polygon,")
				.queryParam("format", "csv")
				.queryParam("filter2", "ref!=* and geometry:line")
				.queryParam("time", "2011-12-28")
				.queryParam("bpolys", "8.704561,49.403252,8.714126,49.4321,8.746,49.4045,8.733,49.425,8.704561,49.403252|8.704561,49.403252,8.726889,49.414,8.731,49.409273,8.7204,49.420,8.704561,49.403252|8.704561,49.403252,8.748358,49.42739,8.711,49.40271,8.746,49.422,8.704561,49.403252")
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
	public void test_1ib6hyvavi2bb_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "awgqG:8.686,49.417,8.727,49.397")
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
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
	public void test_toanid80meyd_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "ref=* and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "8.737,49.4089,52")
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
	public void test_skxv8a3mb0hh_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.7413,49.4151,8.709,49.417,8.701,49.4280,8.704561,49.403252|8.704561,49.403252,8.74765,49.4005,8.704598,49.408,8.733,49.430812,8.704561,49.403252")
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
	public void test_uvbvj8kjvfhv_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("filter2", "type=*")
				.queryParam("bcircles", "8.730,49.418,682|8.703,49.413509,7|8.741,49.415,3|8.74974,49.423,626")
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
	public void test_u82cx47w1sh0_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "P:8.670,49.420,8.757,49.399|L:8.66838,49.416,8.7307,49.399|p:8.680,49.405396,8.7217,49.3975")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "ref!=* or length:( .. 100)")
				.queryParam("time", "2017-05-12")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.723,49.4382,4")
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
	public void test_rkwtws1kikpt_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "F:8.671,49.415,8.728,49.39730|Q:8.660,49.4015,8.75306,49.390")
				.queryParam("types2", "node,relation")
				.queryParam("showMetadata", "yes")
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
	public void test_1h823cg1ei71w_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=* and length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-09-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7135,49.423981],[8.711,49.412],[8.730887,49.429604],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"VJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.435],[8.725,49.427],[8.7373,49.4374],[8.704561,49.403252]]]}}]}")
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
	public void test_1ji1rb68eqvxw_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6854,49.4196,8.757276,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("filter2", "addr:housenumber!=* and not type:relation and id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "pedestrian")
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
	public void test_1jyd9hm4q5645_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("bpolys", "8.704561,49.403252,8.707,49.4395,8.704590,49.404988,8.7045,49.437,8.704561,49.403252|8.704561,49.403252,8.71907,49.426,8.7078,49.405,8.729,49.420,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_u857tavdh9b9_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* or geometry:polygon and not id:(1 .. 9999)")
				.queryParam("filter2", "surface!=* and type:way and not area:(1.0 .. 1E6)")
				.queryParam("time", "2013-05-25")
				.queryParam("bpolys", "Gh:8.704561,49.403252,8.705,49.407,8.74534,49.4178,8.708,49.4023,8.704561,49.403252")
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
	public void test_qxfzfos7udsy_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "j:8.698,49.4094,8.707944,49.380")
				.queryParam("format", "geojson")
				.queryParam("filter2", "addr:postcode=* or length:( .. 100)")
				.queryParam("time", "2012-03-09")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
				.queryParam("values2", "pedestrian")
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
	public void test_1hbiquneerdk1_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref=* or type:node or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "56")
				.queryParam("values2", "platform")
				.queryParam("bcircles", "ct:8.7209,49.429,7")
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
	public void test_uvhfvilf67ue_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("filter2", "smoothness!=* or length:( .. 100)")
				.queryParam("bpolys", "b:8.704561,49.403252,8.732210,49.41626,8.746,49.419,8.741,49.409083,8.704561,49.403252|O:8.704561,49.403252,8.71840,49.434,8.723,49.419,8.702,49.426,8.704561,49.403252|ddF:8.704561,49.403252,8.7387,49.411,8.70371,49.42895,8.700287,49.43686,8.704561,49.403252")
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
	public void test_1hrbgiv1ynias_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:node")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-10-13")
				.queryParam("bpolys", "p:8.704561,49.403252,8.7319,49.412,8.70456,49.421,8.7045,49.421,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "platform")
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
	public void test_t87dumrzqpmf_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* and length:( .. 100)")
				.queryParam("bboxes", "8.664,49.424,8.7152,49.380")
				.queryParam("format", "json")
				.queryParam("time", "2008-07-04")
				.queryParam("bpolys", "tx:8.704561,49.403252,8.70261,49.403985,8.708,49.41828,8.7127,49.4335,8.704561,49.403252")
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
	public void test_s1jhlmh479eu_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "2012-11-27")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "XJMM:8.737,49.41573,8")
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
	public void test_s1b3y09kq1x0_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ZrI:8.679,49.420,8.717530,49.387|jv:8.6980,49.411,8.721,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
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
	public void test_qdqip7ockig2_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fhQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723,49.425],[8.7043,49.4372],[8.70440,49.43251],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "54")
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
	public void test_1hrotj3ox1lr5_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* and type:node and not area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-08-18")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "8.701828,49.411,7|8.743,49.4210,5")
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
	public void test_rlapk3ef6hr9_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "bgw:8.704561,49.403252,8.7284,49.428,8.7166,49.437,8.745,49.425,8.704561,49.403252|nBf:8.704561,49.403252,8.7048,49.427,8.702,49.411,8.718,49.421,8.704561,49.403252")
				.queryParam("timeout", "25")
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
	public void test_t87eb8lr6bsi_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("time", "2013-10-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.426],[8.7008,49.406564],[8.737,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ebK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.408],[8.7059,49.419],[8.705532,49.439],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Gu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.42106],[8.731,49.439],[8.7019,49.426],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "49")
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
	public void test_1ji1pr64guesj_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "pOlF:8.719184,49.41459,9")
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
	public void test_toa5l8ff7m7s_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "b:8.729,49.4029,2|r:8.721,49.424,6|G:8.71399,49.412,3|DK:8.748,49.433,88")
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
	public void test_vbcdfb5z9g6r_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7425,49.421,8.7043,49.439449,8.736,49.408,8.704561,49.403252|8.704561,49.403252,8.708,49.4055,8.703301,49.4004,8.725,49.40268,8.704561,49.403252|8.704561,49.403252,8.709,49.4386,8.7096,49.421089,8.727,49.438,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_soeljpsz4483_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* or length:( .. 100)")
				.queryParam("bboxes", "8.684,49.40129,8.753,49.398")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "ecsh:8.737,49.4021,1|nzK:8.727,49.4371,78")
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
	public void test_qhvlv95yss4j_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-12-03")
				.queryParam("bpolys", "e:8.704561,49.403252,8.703,49.411,8.7300,49.426,8.704560,49.438248,8.704561,49.403252|MQP:8.704561,49.403252,8.743,49.418,8.7029,49.41406,8.707,49.422,8.704561,49.403252|xMwJ:8.704561,49.403252,8.745,49.4044,8.705,49.4122,8.744994,49.411,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_vf3mksck3cjd_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or type:relation and not id:(1 .. 9999)")
				.queryParam("bboxes", "8.659,49.426744,8.7559,49.3803")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-10-17")
				.queryParam("timeout", "50")
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
	public void test_r1ifi1srghth_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "P:8.704561,49.403252,8.7268,49.404,8.70832,49.402,8.7271,49.423279,8.704561,49.403252|j:8.704561,49.403252,8.713,49.428910,8.749880,49.40492,8.704,49.425,8.704561,49.403252|vMSCm:8.704561,49.403252,8.727,49.43485,8.704,49.4326,8.74439,49.404,8.704561,49.403252")
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
	public void test_toixa2i51a2c_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-04-21")
				.queryParam("bcircles", "jR:8.700,49.40427,24|bg:8.704,49.429,8|r:8.7446,49.431334,4")
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
	public void test_1iv1ip5rownz5_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-09-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"GHDmi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.41256],[8.7046,49.40577],[8.7076,49.415],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"vTM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7307,49.438],[8.720,49.4135],[8.707,49.433],[8.704561,49.403252]]]}}]}")
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
	public void test_s506ad0jntbq_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "h:8.6573,49.4115,8.737153,49.380|AyUua:8.66942,49.400,8.7565,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-09-19")
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
	public void test_1h7o6zbb5nb5f_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "QL:8.677,49.425,8.728892,49.380|Jy:8.684,49.4160,8.731,49.3896")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2007-12-18")
				.queryParam("timeout", "24")
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
	public void test_t4neaocuuo1l_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "wzSuG:8.704561,49.403252,8.70993,49.407,8.70558,49.418,8.746,49.434,8.704561,49.403252")
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
	public void test_1h7wjscj4nsxi_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bpolys", "XIjJ:8.704561,49.403252,8.7239,49.40497,8.702,49.4198,8.7270,49.407,8.704561,49.403252|Nq:8.704561,49.403252,8.745,49.4395,8.722,49.422,8.741,49.411,8.704561,49.403252")
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
	public void test_rkzjcd854dpd_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.680327,49.418,8.758,49.38267")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iLqyC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.41334],[8.722,49.431],[8.704,49.4332],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "n:8.747,49.4295,5|VcO:8.735,49.4389,8")
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
	public void test_t89ohfn4awyp_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-10-01")
				.queryParam("bcircles", "8.726,49.410,2")
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
	public void test_1hrmiu3ubzo0z_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-12-18")
				.queryParam("bpolys", "tMzm:8.704561,49.403252,8.739,49.4203,8.734308,49.408050,8.712,49.4304,8.704561,49.403252|FZwZ:8.704561,49.403252,8.703,49.423,8.70642,49.4098,8.70457,49.40410,8.704561,49.403252|X:8.704561,49.403252,8.7088,49.424,8.745,49.408659,8.714,49.416,8.704561,49.403252")
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
	public void test_to4kxtuxxyli_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk=* or geometry:line")
				.queryParam("bboxes", "xJ:8.651,49.422,8.714,49.380")
				.queryParam("time", "2014-03-07")
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
	public void test_1ievir9hyj42p_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "x:8.661687,49.412,8.75960,49.3976")
				.queryParam("format", "csv")
				.queryParam("time", "2009-12-15")
				.queryParam("timeout", "60")
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
	public void test_1jiflbyskazw9_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-11-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"RGYv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730655,49.421041],[8.747,49.418],[8.7232,49.436],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"xBCG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7454,49.410],[8.73628,49.405759],[8.745385,49.401506],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "93")
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
	public void test_qxw3dmdidxes_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and geometry:point")
				.queryParam("time", "2010-12-26")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.404,8.7042,49.400,8.7363,49.40826,8.704561,49.403252|8.704561,49.403252,8.745,49.427,8.70696,49.425,8.707,49.420,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_vf9pxprmy2ci_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "gIN:8.704561,49.403252,8.730,49.426,8.7408,49.432,8.7072,49.43013,8.704561,49.403252|G:8.704561,49.403252,8.7366,49.434,8.730,49.434,8.733,49.407,8.704561,49.403252")
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
	public void test_qdsqaeejgpiv_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "jKZD:8.659391,49.418,8.7596,49.384|N:8.695,49.421,8.719,49.382")
				.queryParam("keys", "highway")
				.queryParam("time", "2008-10-26")
				.queryParam("timeout", "81")
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
	public void test_1iukfapgm1gzd_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:line or length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "XK:8.7279,49.4318,771468174")
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
	public void test_1hr5e9cb7oxgi_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* or not length:( .. 100)")
				.queryParam("bboxes", "hmiyG:8.657,49.4120,8.72103,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-11-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.4126],[8.727,49.417],[8.702,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ZTHNC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.40334],[8.746,49.4336],[8.709,49.4306],[8.704561,49.403252]]]}}]}")
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
	public void test_rkzk76gtrign_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.691,49.421,8.728,49.398|8.675,49.405,8.752,49.385")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
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
	public void test_s4rwixy496jp_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-01-31")
				.queryParam("bpolys", "qUldf:8.704561,49.403252,8.747,49.410,8.73724,49.4320,8.742,49.407,8.704561,49.403252|E:8.704561,49.403252,8.739928,49.406,8.717,49.41445,8.724,49.426,8.704561,49.403252|M:8.704561,49.403252,8.7184,49.4362,8.7091,49.4269,8.703,49.428,8.704561,49.403252")
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
	public void test_urxy8kphiv5f_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "D:8.704561,49.403252,8.73823,49.4230,8.718,49.427,8.7129,49.422,8.704561,49.403252|PbVio:8.704561,49.403252,8.718,49.41408,8.7449,49.419,8.718,49.4073,8.704561,49.403252|R:8.704561,49.403252,8.72813,49.403,8.7046,49.404,8.7132,49.417338,8.704561,49.403252")
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
	public void test_1hvbksjeykvg2_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.428300],[8.707125,49.4342],[8.7346,49.4354],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "30")
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
	public void test_u8dz6o71gym1_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* or id:(1 .. 9999)")
				.queryParam("time", "2012-05-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"OhdTl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7463,49.409],[8.748,49.425],[8.7162,49.404],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wnF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714787,49.433677],[8.710442,49.429],[8.726,49.40234],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"cOM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7007,49.4240],[8.705,49.41743],[8.704,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
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
	public void test_rhahs6phpq9j_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JTa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.438468],[8.703886,49.41710],[8.732,49.4376],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ga\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712091,49.41115],[8.726,49.416],[8.707,49.402471],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.4043],[8.700,49.4218],[8.7085,49.4286],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "84")
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
	public void test_qdsqa6v4l92q_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-09-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"hY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.4031],[8.726,49.4119],[8.725893,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"uk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71330,49.4056],[8.733,49.408],[8.700824,49.426203],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"bRM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.401],[8.7429,49.43735],[8.702073,49.415],[8.704561,49.403252]]]}}]}")
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
	public void test_1hb865h73g5t2_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-01-03")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "xqPuf:8.736,49.43097,44|h:8.704,49.4159,3")
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
	public void test_1ji1quihi7iuo_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.691,49.408,8.7476,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "85")
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
	public void test_1jelixdii92zn_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or type:way and not length:( .. 100)")
				.queryParam("bboxes", "I:8.687314,49.4018,8.713,49.3947")
				.queryParam("time", "2015-02-19")
				.queryParam("bpolys", "8.704561,49.403252,8.729,49.409,8.7020,49.435,8.721,49.42016,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1k1rqo81z742s_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "yXJJ:8.704561,49.403252,8.716,49.405,8.7064,49.4193,8.707441,49.408,8.704561,49.403252|sPJ:8.704561,49.403252,8.7003,49.41898,8.700,49.4154,8.70450,49.42997,8.704561,49.403252|IpjHr:8.704561,49.403252,8.733,49.427,8.7022,49.410573,8.714451,49.4203,8.704561,49.403252")
				.queryParam("timeout", "50")
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
	public void test_1hv87z1qekysz_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-12-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qYspP\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7212,49.414],[8.706523,49.424],[8.704,49.4067],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7325,49.417904],[8.712,49.437],[8.739667,49.425],[8.704561,49.403252]]]}}]}")
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
	public void test_t49hxp8boe29_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2010-06-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7407,49.414],[8.70530,49.42040],[8.70459,49.43847],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.410],[8.7045,49.420243],[8.718,49.427],[8.704561,49.403252]]]}}]}")
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
	public void test_vbf6fv0trbxt_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.65874,49.4278,8.704,49.398")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-04-11")
				.queryParam("timeout", "90")
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
	public void test_1jy258bdjlf8m_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "R:8.660,49.417,8.706722,49.390")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-12-28")
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
	public void test_to2abf62q4vp_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HvjcN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.411],[8.739,49.4071],[8.704561,49.4062],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"WngNu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.400772],[8.7221,49.403],[8.703,49.4084],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"g\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73555,49.439],[8.7013,49.422740],[8.719,49.4057],[8.704561,49.403252]]]}}]}")
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
	public void test_1jeffhxcvyotv_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-01-06")
				.queryParam("bpolys", "VHYy:8.704561,49.403252,8.718,49.424,8.7333,49.42672,8.702,49.421,8.704561,49.403252|seSWZ:8.704561,49.403252,8.743,49.4386,8.704703,49.427,8.7480,49.415,8.704561,49.403252")
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
	public void test_1ieybdpwjs9bk_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bpolys", "Mbb:8.704561,49.403252,8.711,49.431,8.735,49.4371,8.7046,49.41055,8.704561,49.403252")
				.queryParam("timeout", "60")
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
	public void test_1iaxn837nr1v4_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687,49.4195,8.707,49.399854|8.6705,49.409,8.72137,49.395")
				.queryParam("keys", "highway")
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
	public void test_ts57jajonjg1_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* or type:way or length:( .. 100)")
				.queryParam("bboxes", "8.6864,49.4097,8.741069,49.385")
				.queryParam("time", "2011-08-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"nI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.43793],[8.707393,49.408214],[8.7298,49.4230],[8.704561,49.403252]]]}}]}")
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
	public void test_1ies91qf2wxma_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2014-11-26")
				.queryParam("bcircles", "8.7273,49.4276,6|8.712,49.438,5")
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
	public void test_1iemqab7ly6w4_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:way and id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-09-17")
				.queryParam("timeout", "58")
				.queryParam("bcircles", "8.728,49.4383,3|8.721,49.431874,13|8.7496,49.4197,1")
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
	public void test_t81v2tc8a3qc_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-09-28")
				.queryParam("bpolys", "8.704561,49.403252,8.707,49.41614,8.7091,49.4136,8.7400,49.4337,8.704561,49.403252")
				.queryParam("timeout", "99")
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
	public void test_tog56rx8cfn9_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("time", "2010-02-14")
				.queryParam("bpolys", "8.704561,49.403252,8.714035,49.4302,8.711,49.4238,8.7443,49.4372,8.704561,49.403252|8.704561,49.403252,8.732668,49.431,8.70042,49.415,8.729,49.425,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_1jyg2wixy6fci_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.7350,49.422,8.734,49.404,8.7050,49.430,8.704561,49.403252|8.704561,49.403252,8.736,49.43579,8.701,49.430052,8.720,49.431,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_1k1r6esbx63ar_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2018-02-16")
				.queryParam("bcircles", "N:8.705,49.434,69|TIXvb:8.73488,49.4243,845")
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
	public void test_1h7trbbf7nsc4_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706772,49.428],[8.7083,49.4133],[8.708,49.40992],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "99")
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
	public void test_u8dfmehrjm7m_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "B:8.675,49.4246,8.737,49.392|b:8.694,49.410752,8.703,49.399|cZ:8.658,49.410,8.708,49.3856|D:8.67788,49.41612,8.7512,49.39632")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "55")
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
	public void test_s1b6o62pazhy_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"PoABB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73989,49.403413],[8.712,49.4141],[8.7404,49.401],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"WH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7147,49.4179],[8.709982,49.418],[8.7066,49.412],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "75")
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
	public void test_sl3ws5esk4dv_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,school")
				.queryParam("bboxes", "8.667,49.414,8.730,49.391|8.6636,49.417,8.70041,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("bcircles", "iN:8.70080,49.4333,3|eVe:8.740,49.436,36")
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
	public void test_1iemqqkv9777a_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or length:( .. 100)")
				.queryParam("groupByValues", "stop_line,give_way")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "MobR:8.704561,49.403252,8.707262,49.422,8.700,49.437,8.712,49.406,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_1iyezxxwkz3vp_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,service,traffic_signals")
				.queryParam("filter", "building=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "m:8.715,49.402,3|SQ:8.728869,49.415,972|g:8.724,49.40732,674719387")
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
	public void test_1jei666nv8leu_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "TRPgx:8.7142,49.40885,8")
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
	public void test_1iv4a0a7jtqat_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,dormitory,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.70653,49.418980,1|8.743,49.422616,17")
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
	public void test_1hrrjo6eul2k5_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,dormitory,turning_circle")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "cCqKw:8.7171,49.43582,552")
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
	public void test_s0x8oo0817ax_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tertiary,residential,street_lamp")
				.queryParam("filter", "lit!=* and geometry:line or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2013-04-23")
				.queryParam("bcircles", "MhiZ:8.746,49.406,3")
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
	public void test_vb93q0oiijja_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.404712],[8.733,49.402],[8.7254,49.400],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"dEr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.412],[8.72684,49.418],[8.732,49.4229],[8.704561,49.403252]]]}}]}")
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
	public void test_ubme3u49r708_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path")
				.queryParam("filter", "tracktype=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-12-13")
				.queryParam("bcircles", "lJ:8.728,49.411,6|ORx:8.7278,49.412,616")
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
	public void test_rhtzs08mzghi_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and geometry:line or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "W:8.742,49.430,9")
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
	public void test_uvgy0ci0flth_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "22")
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
	public void test_1hrud0mrk6ypf_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,steps,street_lamp")
				.queryParam("bboxes", "8.690,49.421771,8.7450,49.394")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-02-19")
				.queryParam("timeout", "23")
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
	public void test_1h85cnk5jnxpe_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("bpolys", "ZctU:8.704561,49.403252,8.721430,49.4110,8.738115,49.4339,8.704,49.4240,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_vbbwa887up81_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-06-09")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.745,49.4026,8.704,49.407,8.7073,49.433,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_r1g3bolwfyhu_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory,stop_line")
				.queryParam("bboxes", "mRquQ:8.6889,49.404,8.72478,49.391|OI:8.6950,49.409509,8.7237,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("timeout", "31")
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
	public void test_1hv88r3vqe4ac_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,bus_stop,chapel")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.7217,49.434,6")
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
	public void test_qy1mj7dczasl_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary,elevator,stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-06-25")
				.queryParam("bpolys", "SxKrL:8.704561,49.403252,8.738,49.4170,8.70421,49.41472,8.749,49.417,8.704561,49.403252")
				.queryParam("timeout", "60")
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
	public void test_1iuy9p4wrle7t_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-04-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qbU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7347,49.4276],[8.711,49.4060],[8.741,49.403],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "100")
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
	public void test_veveddt1fm0h_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,turning_circle,give_way")
				.queryParam("bboxes", "xNLHC:8.6879,49.40756,8.7294,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "50")
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
	public void test_qxnrq73baofk_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,unclassified")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"LF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7236,49.438],[8.728,49.428512],[8.719,49.4294],[8.704561,49.403252]]]}}]}")
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
	public void test_qxyx3nry64af_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary_link,emergency_access_point")
				.queryParam("bboxes", "fztLL:8.699,49.413,8.714,49.389|i:8.652002,49.408,8.724,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.730,49.4018,8.714,49.4216,8.748767,49.4334,8.704561,49.403252|8.704561,49.403252,8.74324,49.432,8.72327,49.43567,8.7455,49.430,8.704561,49.403252|8.704561,49.403252,8.71687,49.40762,8.7017,49.41948,8.704,49.430,8.704561,49.403252")
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
	public void test_u7wvbi4z2gc8_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:line or length:( .. 100)")
				.queryParam("bboxes", "qr:8.695,49.415,8.7367,49.395|GZGf:8.66361,49.419,8.723,49.382")
				.queryParam("format", "json")
				.queryParam("time", "2011-06-30")
				.queryParam("bpolys", "VRw:8.704561,49.403252,8.749902,49.4313,8.726,49.416,8.7404,49.420,8.704561,49.403252|zV:8.704561,49.403252,8.7162,49.431,8.7429,49.4023,8.7165,49.4104,8.704561,49.403252|Y:8.704561,49.403252,8.724,49.411,8.702,49.437,8.712541,49.437,8.704561,49.403252")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "S:8.7446,49.4196,55|KO:8.723,49.438,1|Emr:8.7273,49.416,7")
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
	public void test_s4p2vhbgzho7_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "garage,unclassified,school")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-12-27")
				.queryParam("bpolys", "ux:8.704561,49.403252,8.7092,49.4303,8.708,49.4293,8.72325,49.41224,8.704561,49.403252")
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
	public void test_rl5638bstxlu_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "public,station")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2011-07-25")
				.queryParam("bpolys", "J:8.704561,49.403252,8.733,49.40924,8.718,49.4377,8.704,49.42472,8.704561,49.403252")
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
	public void test_qxttwuw8qeeb_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "jvlEb:8.678,49.416,8.7402,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "53")
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
	public void test_qxljdbk32gki_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "X:8.69891,49.428,8.7180,49.385|y:8.6881,49.418,8.7422,49.380164|deU:8.6800,49.42278,8.7224,49.3813")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-10-11")
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
	public void test_1k1zk53kgp4jd_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bcircles", "dV:8.7030,49.420,4|krlx:8.73328,49.4317,3|JH:8.749,49.429,9|l:8.7010,49.425,702")
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
	public void test_1iykisfy1jgwx_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.689,49.418,8.723,49.389|8.65571,49.421,8.728,49.389|8.6862,49.4123,8.750,49.3912|8.6746,49.417,8.720,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-18")
				.queryParam("timeout", "86")
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
	public void test_1iyey05rl98ip_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "zj:8.650,49.424826,8.710,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
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
	public void test_1hb7q61ewj1v9_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.721158,49.4332,2")
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
	public void test_t4qmu1g00sx0_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "cZNum:8.685,49.4259,8.708,49.381|jeh:8.690,49.41570,8.720187,49.391|Ubn:8.653188,49.4008,8.734056,49.380|PN:8.678107,49.413,8.739,49.3841")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-11-23")
				.queryParam("bpolys", "keXJw:8.704561,49.403252,8.731,49.43617,8.706,49.420,8.7435,49.408,8.704561,49.403252|EI:8.704561,49.403252,8.736,49.4123,8.737,49.422,8.7309,49.42679,8.704561,49.403252|RQ:8.704561,49.403252,8.701,49.438,8.7042,49.418,8.700,49.411,8.704561,49.403252")
				.queryParam("timeout", "25")
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
	public void test_u8aqkuejrinq_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,ship,traffic_signals")
				.queryParam("bboxes", "Uh:8.699,49.411,8.7340,49.3834")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.716,49.418106,8.723,49.4294,8.704444,49.418,8.704561,49.403252")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "C:8.711696,49.416211,6|j:8.7113,49.416,9")
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
	public void test_us2zjiwh39lw_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-08-16")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "vsRja:8.704,49.413,2")
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
	public void test_qdpzzofd4pbo_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("bcircles", "8.733,49.40009,1|8.700,49.426,1|8.7030,49.424,894")
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
	public void test_uvbxhtyatmjn_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2013-01-04")
				.queryParam("bcircles", "wBe:8.707,49.418019,4")
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
	public void test_t4km4l4j7jnc_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,primary")
				.queryParam("bboxes", "P:8.689,49.408,8.7520,49.390|whsH:8.653,49.40933,8.756,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-02-21")
				.queryParam("timeout", "67")
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
	public void test_1hrgi4thak7z8_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "G:8.685,49.414,8.712,49.3801|aNG:8.665,49.423,8.706,49.381|W:8.664848,49.4189,8.7501,49.383|KcgWt:8.682014,49.4085,8.724180,49.399643")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-11-17")
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
	public void test_1h7o8grei0bw2_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital")
				.queryParam("bboxes", "8.671937,49.414,8.7196,49.397|8.672650,49.425,8.7014,49.3952")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "53")
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
	public void test_1k251ocfwm2wh_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.654,49.41399,8.719,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "42")
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
	public void test_rhofryy0delx_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,tertiary")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("time", "2009-10-26")
				.queryParam("bpolys", "frEx:8.704561,49.403252,8.73675,49.4080,8.735,49.4149,8.7205,49.41478,8.704561,49.403252|A:8.704561,49.403252,8.704374,49.439034,8.704537,49.439,8.723305,49.439,8.704561,49.403252|H:8.704561,49.403252,8.721,49.4046,8.73302,49.408,8.704560,49.40329,8.704561,49.403252")
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
	public void test_uvgwduupr5mb_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ERbqv:8.6693,49.42088,8.733,49.391|J:8.6725,49.4035,8.7095,49.384|aTO:8.660,49.4155,8.700357,49.3871")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-01-21")
				.queryParam("bpolys", "iMcU:8.704561,49.403252,8.7457,49.43744,8.733,49.430617,8.74195,49.434,8.704561,49.403252|m:8.704561,49.403252,8.746,49.432019,8.723,49.4018,8.708,49.42786,8.704561,49.403252|NoX:8.704561,49.403252,8.708,49.402,8.70498,49.426,8.7049,49.418,8.704561,49.403252")
				.queryParam("bcircles", "8.74962,49.410,8|8.731,49.403,8|8.71113,49.4007,8|8.7283,49.40003,374468720")
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
	public void test_1iyi9q4x2jq04_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:polygon")
				.queryParam("time", "2015-12-05")
				.queryParam("bcircles", "8.700740,49.412913,9")
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
	public void test_trtm4b6wrfoy_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "RrV:8.706,49.431,198|K:8.701626,49.420,73")
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
	public void test_qdq02dhr00va_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* or geometry:polygon and not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-05-25")
				.queryParam("bpolys", "OT:8.704561,49.403252,8.7138,49.400,8.7041,49.42263,8.7018,49.418434,8.704561,49.403252|Kn:8.704561,49.403252,8.7195,49.419,8.704923,49.43582,8.704,49.4326,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_somvpa9x6rsj_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.717,49.425,8.712,49.429,8.701,49.40798,8.704561,49.403252")
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
	public void test_1iyc8k2u0rvw4_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "8.740053,49.42886,84")
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
	public void test_t89oxrnfy3oy_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or type:node or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.697,49.429615,8.7478,49.387")
				.queryParam("timeout", "86")
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
	public void test_qxtdxndfrq60_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-04-16")
				.queryParam("bcircles", "zRTD:8.731832,49.409,11|f:8.709817,49.42445,2")
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
	public void test_1ibjskeuyrz20_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=*")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "Av:8.700680,49.422,7|HA:8.720,49.4108,75")
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
	public void test_1hraw9917ygdf_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2014-12-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"sZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.427],[8.717937,49.4225],[8.70833,49.40460],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "94")
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
	public void test_1h7lfj3r76e5u_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2017-03-06")
				.queryParam("bpolys", "WHCij:8.704561,49.403252,8.727,49.4318,8.744979,49.432,8.7298,49.402,8.704561,49.403252")
				.queryParam("bcircles", "ppjvI:8.714,49.4320,9")
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
	public void test_t4q44o4y1bhe_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Afv:8.666,49.420213,8.7169,49.3931")
				.queryParam("keys", "highway")
				.queryParam("timeout", "32")
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
	public void test_tocw9dd4n50z_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* and length:( .. 100)")
				.queryParam("bcircles", "S:8.741,49.426,5")
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
	public void test_s1gp4erwxug3_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.672,49.425,8.718607,49.396|8.683,49.4274,8.706,49.399|8.6883,49.4134,8.71016,49.388|8.668,49.412,8.716,49.38297")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
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
	public void test_s4p23gpyqsl5_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* or length:( .. 100)")
				.queryParam("time", "2013-05-13")
				.queryParam("bpolys", "BFhe:8.704561,49.403252,8.719332,49.432,8.716101,49.404,8.718,49.428,8.704561,49.403252|Jfp:8.704561,49.403252,8.726886,49.41552,8.706,49.42033,8.701,49.428,8.704561,49.403252|r:8.704561,49.403252,8.715,49.41669,8.74204,49.4383,8.7041,49.421,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_toam11qbeijn_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "pg:8.686968,49.40845,8.755,49.384|N:8.656,49.419670,8.737,49.389|nS:8.671,49.401043,8.714762,49.3894|Ei:8.66446,49.405,8.700,49.389861")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-12-13")
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
	public void test_1ji4z2fh6s8xe_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "f:8.704561,49.403252,8.745,49.428342,8.722,49.4340,8.70427,49.424,8.704561,49.403252|Zx:8.704561,49.403252,8.7057,49.416,8.704539,49.42355,8.7350,49.426,8.704561,49.403252|XTp:8.704561,49.403252,8.711,49.418,8.742,49.438,8.704,49.43268,8.704561,49.403252")
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
	public void test_sonec2tyr4fo_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:polygon and id:(1 .. 9999)")
				.queryParam("time", "2015-05-25")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.40885,8.7045,49.4292,8.702,49.4034,8.704561,49.403252|8.704561,49.403252,8.749,49.4022,8.720,49.408,8.706,49.419,8.704561,49.403252")
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
	public void test_ubompohnl8is_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2017-06-30")
				.queryParam("bpolys", "mjijF:8.704561,49.403252,8.717,49.4337,8.7053,49.40730,8.7017,49.4226,8.704561,49.403252|dqHtb:8.704561,49.403252,8.72535,49.42407,8.7062,49.425,8.7336,49.40605,8.704561,49.403252|FS:8.704561,49.403252,8.74819,49.434,8.7025,49.407552,8.705,49.415,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_1ib0g3f994col_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UAdYa:8.685,49.401,8.743018,49.395|Ss:8.695,49.415,8.742122,49.382|G:8.658,49.42134,8.752,49.3957")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_rlb6e1rueqt5_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "EZGW:8.676,49.412,8.7486,49.391|T:8.653384,49.425,8.755,49.3850|QDgfP:8.6931,49.404303,8.730569,49.389|Qmect:8.6576,49.4206,8.748659,49.390672")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-05-23")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.4294,8.706,49.439,8.7110,49.423331,8.704561,49.403252|8.704561,49.403252,8.73679,49.428,8.702,49.405,8.701,49.408,8.704561,49.403252|8.704561,49.403252,8.735,49.431,8.7312,49.436,8.747,49.421717,8.704561,49.403252")
				.queryParam("bcircles", "8.7211,49.4055,380")
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
	public void test_t87cohh83dpw_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "HZ:8.704561,49.403252,8.7113,49.403,8.731,49.403,8.74619,49.413120,8.704561,49.403252")
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
	public void test_skv1z2h1thyq_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "I:8.674,49.428,8.7583,49.385")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-09-16")
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
	public void test_1jeipzebe42t0_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "J:8.6802,49.403,8.720836,49.3811")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "77")
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
	public void test_1jel07y9h9wdx_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or geometry:point")
				.queryParam("bboxes", "8.69838,49.4164,8.741,49.394")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "33")
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
	public void test_skpjwkoo3r5d_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* and length:( .. 100)")
				.queryParam("bboxes", "HgxsW:8.672,49.424057,8.722,49.397|tDuIf:8.6567,49.422,8.7193,49.3987")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-08-13")
				.queryParam("timeout", "57")
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
	public void test_rhdb6roavdya_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "8.713,49.410476,66")
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
	public void test_1k1ty6ikh4bhz_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "8.731,49.401,14")
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
	public void test_r1l5sjvjd6qp_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2011-01-16")
				.queryParam("bpolys", "kKvLH:8.704561,49.403252,8.729545,49.4015,8.702,49.40396,8.715,49.40244,8.704561,49.403252|dr:8.704561,49.403252,8.719,49.4380,8.7273,49.4096,8.7070,49.411,8.704561,49.403252")
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
	public void test_1hb7o5n10wegi_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2015-09-20")
				.queryParam("bpolys", "V:8.704561,49.403252,8.715,49.408,8.70477,49.432,8.737,49.415886,8.704561,49.403252|SY:8.704561,49.403252,8.736577,49.407,8.709,49.41451,8.7433,49.421,8.704561,49.403252|yMzM:8.704561,49.403252,8.7378,49.408,8.718,49.435,8.707,49.421,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_ts1yj9axm3c4_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* or length:( .. 100)")
				.queryParam("bboxes", "U:8.673910,49.425,8.724,49.384")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("bpolys", "U:8.704561,49.403252,8.724,49.406,8.7322,49.40474,8.733,49.4251,8.704561,49.403252")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "sy:8.7050,49.412,1")
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
	public void test_1ib35jeax7l9h_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=*")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-09-11")
				.queryParam("bpolys", "U:8.704561,49.403252,8.7362,49.404309,8.7303,49.400797,8.737,49.422,8.704561,49.403252|Mys:8.704561,49.403252,8.7003,49.416,8.706,49.412,8.7056,49.4260,8.704561,49.403252")
				.queryParam("timeout", "86")
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
	public void test_ubj2e2j71f7b_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2014-02-10")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "g:8.7304,49.43896,1")
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
	public void test_s4xel5hz5ik0_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "uj:8.690457,49.4115,8.731,49.393|IQ:8.6871,49.420587,8.7482,49.397806|M:8.681,49.401,8.731965,49.384|o:8.692,49.420,8.73116,49.395899")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-01-23")
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
	public void test_1jew1rf29nk2s_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "VTb:8.704561,49.403252,8.731,49.410,8.705,49.402,8.7084,49.4242,8.704561,49.403252|GjXiS:8.704561,49.403252,8.729150,49.429232,8.70452,49.430,8.7047,49.43565,8.704561,49.403252")
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
	public void test_1h7wgohuewgtv_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "fvuYZ:8.699,49.400,8.701,49.3913")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
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
	public void test_trwvcqnbteuc_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-07-10")
				.queryParam("bpolys", "ROnns:8.704561,49.403252,8.7192,49.4179,8.701,49.41742,8.7160,49.401,8.704561,49.403252|Hy:8.704561,49.403252,8.727,49.43022,8.736,49.4221,8.734,49.401,8.704561,49.403252|u:8.704561,49.403252,8.7370,49.418205,8.704,49.43132,8.7061,49.412387,8.704561,49.403252")
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
	public void test_r1l7a9ghu1ip_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:point or not area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-10-17")
				.queryParam("bpolys", "8.704561,49.403252,8.7108,49.409,8.72889,49.421,8.748,49.432,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_s1jxysrpjucj_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:backward!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-06-01")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "X:8.733,49.426809,67")
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
	public void test_1iv9dl7tm9zjq_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* or geometry:polygon")
				.queryParam("bboxes", "ZnqBW:8.684,49.418016,8.7117,49.3953")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-11-10")
				.queryParam("timeout", "56")
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
	public void test_1iv9uszdptpwk_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,crossing,speed_camera")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-07-12")
				.queryParam("timeout", "72")
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
	public void test_1hr5v0m0egx2e_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=*")
				.queryParam("bpolys", "W:8.704561,49.403252,8.745,49.420,8.732131,49.425,8.71504,49.4076,8.704561,49.403252")
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
	public void test_r1dce3j88w2r_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "8.7129,49.43175,6")
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
	public void test_t8cg8zljf67k_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "Ge:8.713,49.418677,5")
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
	public void test_1jyaivzkmgbaw_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.678,49.405,8.759,49.3891")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("time", "2018-03-31")
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
	public void test_1iv3u3ngmusl4_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "nl:8.6781,49.426284,8.7363,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_qec48lgsl3z7_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "turning_circle")
				.queryParam("filter", "turn=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "w:8.749,49.438,9")
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
	public void test_1iusr07rqr4mt_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,construction")
				.queryParam("filter", "name!=* and not type:way and not id:(1 .. 9999)")
				.queryParam("bboxes", "p:8.6600,49.400,8.71217,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-05-23")
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
	public void test_1iupy2ak46ott_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("time", "2018-01-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zskbQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.4208],[8.700,49.430],[8.725,49.42820],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"FfRT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718306,49.423],[8.74581,49.42967],[8.70456,49.4267],[8.704561,49.403252]]]}}]}")
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
	public void test_us3hh1wzonxy_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,living_street")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2010-07-08")
				.queryParam("bpolys", "kUHxq:8.704561,49.403252,8.740596,49.4243,8.708,49.40137,8.714,49.433522,8.704561,49.403252|e:8.704561,49.403252,8.703,49.4114,8.7379,49.403785,8.7370,49.4316,8.704561,49.403252|h:8.704561,49.403252,8.731,49.433,8.7336,49.4073,8.704,49.407,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_1ies7hegmi8fn_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6807,49.4230,8.7324,49.388|8.6650,49.420804,8.747,49.382|8.671,49.41189,8.732,49.3867")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "stop_line")
				.queryParam("time", "2011-10-21")
				.queryParam("bpolys", "8.704561,49.403252,8.723,49.40841,8.733,49.40460,8.7255,49.424,8.704561,49.403252")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "8.731,49.4064,82|8.712,49.40548,79|8.73112,49.431,41|8.7401,49.41643,297226650")
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
	public void test_t4sxgcxzy52u_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=*")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2018-04-12")
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
	public void test_1iauwjm0u1pb9_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tertiary,emergency_access_point")
				.queryParam("bboxes", "s:8.65443,49.4166,8.7326,49.397|RvCmB:8.682,49.42084,8.71781,49.393|HfDd:8.661,49.401,8.728,49.394547|veY:8.68487,49.419,8.7550,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
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
	public void test_s4pl71c0f0it_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,yes,platform")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("bpolys", "Q:8.704561,49.403252,8.719,49.42724,8.7064,49.4164,8.7348,49.41943,8.704561,49.403252|uLq:8.704561,49.403252,8.7349,49.406,8.716,49.424,8.704502,49.4042,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_1hrjaaqsumv5f_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,turning_circle")
				.queryParam("bboxes", "YEv:8.66952,49.41700,8.7580,49.395")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2010-01-11")
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
	public void test_1ibhko372g40z_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "bvKlr:8.704561,49.403252,8.7413,49.415,8.723,49.425,8.703,49.40883,8.704561,49.403252")
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
	public void test_qdqgr2gfx73o_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("time", "2012-02-15")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "8.728056,49.4192,2|8.74082,49.427545,7")
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
	public void test_vbmzrcumlzci_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,house,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.426501,8.700030,49.412,8.7048,49.425,8.704561,49.403252|8.704561,49.403252,8.74189,49.4196,8.730797,49.428,8.738,49.424,8.704561,49.403252")
				.queryParam("timeout", "45")
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
	public void test_s1gonpc99gfa_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.660021,49.424,8.759,49.391|8.675,49.41462,8.7151,49.382")
				.queryParam("groupByKey", "building")
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
	public void test_1ien87kagxl5v_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,service,service")
				.queryParam("filter", "type=* or geometry:line")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "lHV:8.704561,49.403252,8.707,49.4209,8.703,49.426,8.704,49.402,8.704561,49.403252")
				.queryParam("timeout", "96")
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
	public void test_1huzxfodbuh4k_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "yQvO:8.704561,49.403252,8.725,49.426,8.707,49.411876,8.7036,49.435,8.704561,49.403252")
				.queryParam("timeout", "20")
				.queryParam("groupByKeys", "name,smoothness")
				.queryParam("bcircles", "8.7461,49.406,82")
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
	public void test_1ib8r0vodyq1x_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.663,49.4049,8.739,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.71458,49.426,7|8.70378,49.410,2|8.746,49.426,4|8.719,49.4248,7")
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
	public void test_s4p3z1v8aiih_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XKwjX:8.663,49.424,8.751,49.3898|oOoiN:8.67277,49.41617,8.745,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("time", "2009-07-02")
				.queryParam("groupByKeys", "lanes:forward,bicycle")
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
	public void test_s1jzix6quecy_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-06-14")
				.queryParam("groupByKeys", "foot,maxspeed")
				.queryParam("bcircles", "T:8.736,49.402899,4|Icv:8.7252,49.435,6")
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
	public void test_ubp69wy7jbxt_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or type:way")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-02-08")
				.queryParam("timeout", "47")
				.queryParam("groupByKeys", "addr:postcode,highway")
				.queryParam("bcircles", "8.732,49.40166,1")
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
	public void test_trweo3aatyk3_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "gQo:8.6720,49.419702,8.756,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-12-21")
				.queryParam("timeout", "63")
				.queryParam("groupByKeys", "smoothness,network,name")
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
	public void test_uvjqki1wsswx_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "no")
				.queryParam("groupByKeys", "lanes:backward,turn,maxspeed")
				.queryParam("bcircles", "8.741,49.4076,35|8.7034,49.43368,4|8.732,49.418,4|8.705,49.427,74")
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
	public void test_s4ul938z2at4_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "uA:8.704561,49.403252,8.707,49.404054,8.741008,49.4146,8.703617,49.40875,8.704561,49.403252|wIL:8.704561,49.403252,8.7153,49.4128,8.73907,49.424,8.7485,49.4314,8.704561,49.403252")
				.queryParam("groupByKeys", "network,lanes:forward")
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
	public void test_1jeqju8z9iofo_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=*")
				.queryParam("bboxes", "H:8.6961,49.404,8.732,49.391")
				.queryParam("format", "csv")
				.queryParam("time", "2011-11-29")
				.queryParam("timeout", "50")
				.queryParam("groupByKeys", "turn,ref")
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
	public void test_qxr252z3j9lw_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.714,49.408,8.70110,49.401448,8.72248,49.419,8.704561,49.403252")
				.queryParam("groupByKeys", "lanes:forward,ref")
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
	public void test_sl3d838nagc9_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "JXPXj:8.681,49.406,8.740618,49.384")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2017-10-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"RHRFu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.435],[8.7238,49.419],[8.704,49.410],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tCbAK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7483,49.4276],[8.7074,49.418],[8.707,49.405],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
				.queryParam("groupByKeys", "maxspeed,turn,addr:country")
				.queryParam("bcircles", "8.718,49.40999,14")
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
	public void test_urmud9fe5lk2_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vRGAY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.409],[8.7482,49.433],[8.7000,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "8.70890,49.439,8|8.725785,49.414,44")
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
	public void test_1jylmubayu2xy_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-11-15")
				.queryParam("timeout", "69")
				.queryParam("groupByKeys", "lanes,addr:postcode,destination")
				.queryParam("bcircles", "N:8.7464,49.407964,2")
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
	public void test_s10kc21zd7xd_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("groupByKeys", "foot,bicycle,sidewalk")
				.queryParam("bcircles", "dZ:8.728,49.4378,1|R:8.702451,49.435,6|l:8.712118,49.41135,82")
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
	public void test_1h7lxu4fwnigp_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface!=* and geometry:point")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-09-03")
				.queryParam("timeout", "58")
				.queryParam("groupByKeys", "barrier,tracktype,type")
				.queryParam("bcircles", "jf:8.74951,49.43728,9|JOfQ:8.743,49.4358,9")
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
	public void test_qec5ez0hunnd_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "landuse")
				.queryParam("bcircles", "8.725,49.417,62")
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
	public void test_1k1wpmxm2yd6h_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2009-06-29")
				.queryParam("timeout", "67")
				.queryParam("groupByKeys", "highway,barrier,smoothness")
				.queryParam("bcircles", "8.72096,49.4317,8|8.747,49.4351,167")
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
	public void test_uv9486jhmofp_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.7362,49.432,8.7099,49.429,8.7046,49.425,8.704561,49.403252")
				.queryParam("timeout", "65")
				.queryParam("groupByKeys", "addr:street,lanes:backward,addr:city")
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
	public void test_sl8zw7nvlttj_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "dV:8.6880,49.4021,8.7305,49.384")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-08-08")
				.queryParam("groupByKeys", "lanes,type,addr:country")
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
	public void test_soknqlrguypf_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.676192,49.4050,8.72488,49.381|8.679543,49.401,8.7240,49.391|8.684,49.41852,8.700,49.3882")
				.queryParam("format", "json")
				.queryParam("timeout", "65")
				.queryParam("groupByKeys", "addr:city,lit")
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
	public void test_s0v0s2vd73n5_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.658,49.423,8.725,49.385|8.676,49.428,8.727,49.39001|8.697,49.429989,8.7170,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-09-08")
				.queryParam("bpolys", "8.704561,49.403252,8.7360,49.425,8.7084,49.400,8.73921,49.4122,8.704561,49.403252")
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
	public void test_tofotfq3kbc5_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,dormitory")
				.queryParam("bboxes", "e:8.671,49.411,8.749,49.389")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-09-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.429111],[8.7117,49.416],[8.7342,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "a:8.7261,49.4308,5|TPJ:8.740,49.410,50")
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
	public void test_1h7in1kwae6ut_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,secondary,stop")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-08-17")
				.queryParam("bpolys", "u:8.704561,49.403252,8.733,49.433,8.7082,49.4273,8.730,49.4128,8.704561,49.403252")
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
	public void test_1ib8s6z1u8fg3_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,emergency_access_point,service")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.702,49.4374,2")
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
	public void test_s1jhlzymr67q_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-10-15")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.704059,49.430,59|8.7266,49.413,44")
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
	public void test_1jei81veznwx2_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform")
				.queryParam("filter", "addr:postcode!=* and not type:node")
				.queryParam("bboxes", "bvH:8.676,49.417,8.73356,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "41")
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
	public void test_ubu8a4rrtquw_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,residential,demolished")
				.queryParam("filter", "bicycle=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-11-15")
				.queryParam("bpolys", "AA:8.704561,49.403252,8.708,49.420016,8.702,49.406,8.724,49.416,8.704561,49.403252|pSd:8.704561,49.403252,8.744,49.436,8.748,49.422,8.7027,49.411,8.704561,49.403252|WD:8.704561,49.403252,8.705324,49.411,8.7097,49.419,8.71956,49.418,8.704561,49.403252")
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
	public void test_vb93srbgitlv_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-04-30")
				.queryParam("bcircles", "hmtV:8.74246,49.4250,9|q:8.7172,49.4336,8|iGPEv:8.7210,49.42044,3|ArM:8.73196,49.420,548595579")
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
	public void test_qhhre31xy52x_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,tertiary,house")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "gdtJw:8.70731,49.418784,8")
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
	public void test_s1dvsifqif6r_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,public,construction")
				.queryParam("filter", "destination=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "T:8.709,49.41227,42")
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
	public void test_soq6w8cr4ab8_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,chapel")
				.queryParam("filter", "service=driveway or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-05-22")
				.queryParam("bcircles", "ht:8.72594,49.409,7|xK:8.70302,49.421,9")
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
	public void test_t8cwmq0365id_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* and not geometry:polygon")
				.queryParam("groupByValues", "stop_line,pedestrian")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-09-05")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "N:8.7054,49.4291,9")
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
	public void test_qxw4m4jhdpvd_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.667163,49.404,8.722,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_t84kwzt3uam0_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,ship")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-12-14")
				.queryParam("bpolys", "TGQ:8.704561,49.403252,8.70637,49.423,8.7041,49.427,8.745764,49.430914,8.704561,49.403252|Y:8.704561,49.403252,8.7201,49.409768,8.73839,49.401,8.707089,49.4200,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_1hv5hr8bl895y_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-07-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"IfeCA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.430760],[8.7113,49.401],[8.744,49.4366],[8.704561,49.403252]]]}}]}")
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
	public void test_1hb7pbmf8wwmt_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "university,emergency_access_point")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "nV:8.704561,49.403252,8.735,49.407,8.730133,49.4325,8.704,49.43838,8.704561,49.403252|G:8.704561,49.403252,8.710,49.401328,8.713,49.414,8.725,49.405,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_rl5n5yftzcqh_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,path")
				.queryParam("filter", "landuse=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-10-16")
				.queryParam("bpolys", "n:8.704561,49.403252,8.748,49.433,8.732,49.437,8.7257,49.42656,8.704561,49.403252|Ik:8.704561,49.403252,8.7259,49.4149,8.718,49.4304,8.701,49.433,8.704561,49.403252|BB:8.704561,49.403252,8.7087,49.421,8.702,49.4025,8.7265,49.416,8.704561,49.403252")
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
	public void test_urxhvahy4zzt_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-10-29")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "cY:8.71069,49.428,2")
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
	public void test_qxi9nuvha4ad_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,public")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "A:8.722,49.426,4|t:8.70522,49.401,7")
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
	public void test_1hru9wfwei8fq_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "construction,dormitory,station")
				.queryParam("filter", "smoothness!=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-12-31")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "y:8.7069,49.4071,95|WKx:8.7354,49.413,6|rtN:8.7344,49.4160,1|Zf:8.712615,49.4097,717")
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
	public void test_rl5n5mxj6jw8_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "nL:8.704561,49.403252,8.71716,49.4069,8.725,49.4262,8.729,49.421,8.704561,49.403252|m:8.704561,49.403252,8.725,49.4046,8.736,49.407,8.70760,49.4373,8.704561,49.403252")
				.queryParam("bcircles", "8.71716,49.408,6|8.734,49.408,9|8.700,49.4300,9")
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
	public void test_1k1zkj89o8l6c_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "Gs:8.723,49.4131,3")
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
	public void test_rhb0vp1ijtps_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or geometry:polygon or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "kEo:8.704561,49.403252,8.742,49.434,8.706,49.405,8.711,49.40243,8.704561,49.403252")
				.queryParam("timeout", "67")
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
	public void test_sohbaznk1yr8_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and type:relation or not id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("time", "2015-05-06")
				.queryParam("bpolys", "a:8.704561,49.403252,8.713,49.403,8.70955,49.419727,8.703,49.414,8.704561,49.403252|z:8.704561,49.403252,8.7123,49.426,8.7391,49.424,8.70435,49.41914,8.704561,49.403252")
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
	public void test_u82wejpxkzee_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6592,49.400,8.748,49.382|8.6935,49.4215,8.723,49.396")
				.queryParam("format", "json")
				.queryParam("time", "2012-05-19")
				.queryParam("timeout", "32")
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
	public void test_t844xkf4506r_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-03-17")
				.queryParam("bpolys", "8.704561,49.403252,8.722,49.40418,8.70660,49.416,8.716,49.415,8.704561,49.403252|8.704561,49.403252,8.719,49.413,8.709,49.407,8.702,49.4115,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_1jydaqlns9ws8_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6781,49.41930,8.7134,49.396|8.679,49.422,8.749,49.382|8.6979,49.402,8.72411,49.39464|8.6841,49.403,8.754,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("timeout", "50")
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
	public void test_1jefgnus1a3ox_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-08-26")
				.queryParam("bpolys", "aF:8.704561,49.403252,8.705,49.404,8.703,49.4322,8.739,49.402,8.704561,49.403252|v:8.704561,49.403252,8.7114,49.4033,8.70681,49.436,8.710,49.407,8.704561,49.403252")
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
	public void test_1jy2609mgx8oo_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qk:8.691,49.42649,8.723,49.398|Bb:8.656,49.403,8.734,49.395")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
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
	public void test_qxns1yxv1ovp_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and not geometry:line and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"a\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.437],[8.737,49.4164],[8.716,49.42573],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
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
	public void test_1iaxn5i3vyjc4_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_s4pkq77xfqk7_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:line or not length:( .. 100)")
				.queryParam("bboxes", "POk:8.658,49.401,8.73855,49.39320|V:8.652,49.426,8.725870,49.386")
				.queryParam("timeout", "76")
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
	public void test_1jew1tlzk7xwh_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"RZY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.401],[8.704,49.406128],[8.741,49.42887],[8.704561,49.403252]]]}}]}")
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
	public void test_u8b6yge29cmp_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "8.737,49.42639,7")
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
	public void test_1iuy7da4cwn6p_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.696673,49.4075,8.757,49.3890|8.667,49.4074,8.725322,49.385|8.697,49.402,8.739,49.3981|8.68275,49.406,8.759749,49.391")
				.queryParam("format", "csv")
				.queryParam("time", "2017-11-22")
				.queryParam("timeout", "54")
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
	public void test_1h7o7dcsnyv6t_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-05-28")
				.queryParam("bpolys", "cEXb:8.704561,49.403252,8.713,49.424757,8.7041,49.430,8.727,49.419,8.704561,49.403252")
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
	public void test_u82x6fn2cleu_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "NlaEV:8.695,49.416,8.710,49.387251|oEbC:8.682,49.405,8.7139,49.396|U:8.6816,49.423,8.73659,49.392")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "72")
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
	public void test_t842lhp5kpwy_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("bcircles", "TiuFC:8.739,49.400108,3|hG:8.70665,49.424,8")
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
	public void test_1iun6ab7l95ip_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-06-13")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "8.748,49.4294,8")
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
	public void test_u7u2d8sdtyzn_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-11-09")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "ErEUG:8.722,49.411,9|n:8.7231,49.42213,8|If:8.735,49.4335,5")
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
	public void test_qhsvno2j6vxx_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:way and id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("format", "json")
				.queryParam("time", "2016-01-25")
				.queryParam("bpolys", "D:8.704561,49.403252,8.72245,49.403941,8.71386,49.40789,8.709,49.4100,8.704561,49.403252|N:8.704561,49.403252,8.733,49.429,8.70469,49.4330,8.742909,49.4133,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "40")
				.queryParam("values2", "unclassified")
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
	public void test_t8cep8yu3x2r_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and type:way and not id:(1 .. 9999)")
				.queryParam("bboxes", "8.689,49.4286,8.718,49.387|8.675128,49.407,8.74593,49.397|8.694,49.4157,8.704437,49.3863")
				.queryParam("types2", "line,other")
				.queryParam("filter2", "landuse!=* and geometry:line")
				.queryParam("time", "2009-09-27")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "88")
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
	public void test_qecnqgquwjzm_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* or length:( .. 100)")
				.queryParam("time", "2011-08-27")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "8.73602,49.401,656750879|8.736,49.429,2|8.7486,49.423,45|8.728,49.4382,848")
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
	public void test_1h7towlnu0fg9_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and id:(1 .. 9999)")
				.queryParam("types2", "node,way,relation")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "A:8.7143,49.413,4|wLNmp:8.726,49.4395,93")
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
	public void test_skv5eprxvazm_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("filter2", "foot!=* and not type:way or not length:( .. 100)")
				.queryParam("time", "2014-10-05")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "8.702,49.426351,16|8.727,49.431,65|8.745512,49.402,6|8.7050,49.405,613")
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
	public void test_1h7j4wkpac5kn_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "8.7283,49.4238,66|8.7268,49.405,8")
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
	public void test_qhvlhdz3kunk_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.6848,49.421,8.7534,49.388|mSl:8.68866,49.403,8.723,49.384|M:8.673,49.421,8.707,49.39986|umfYO:8.685,49.429,8.730,49.3892")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "network=* and id:(1 .. 9999)")
				.queryParam("time", "2018-02-13")
				.queryParam("timeout", "73")
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
	public void test_1iynssz89wvnc_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "way,")
				.queryParam("format", "json")
				.queryParam("filter2", "landuse!=* and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "SeDiH:8.73706,49.4051,4")
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
	public void test_qdyaxkoywi0i_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.698184,49.414,8.7282,49.3940|8.679516,49.414,8.743106,49.3951")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "network!=* and id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "77")
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
	public void test_1if0ivw67segk_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "e:8.6923,49.4181,8.745,49.383966|YhL:8.664,49.4106,8.728387,49.381")
				.queryParam("types2", "way,")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "type=* and geometry:polygon or length:( .. 100)")
				.queryParam("time", "2013-03-01")
				.queryParam("keys2", "highway")
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
	public void test_t4yhseodp84m_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or length:( .. 100)")
				.queryParam("bboxes", "8.689518,49.4175,8.723,49.38105")
				.queryParam("format", "geojson")
				.queryParam("filter2", "tracktype!=* and geometry:point or not length:( .. 100)")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "Fh:8.737,49.436,5|ugVii:8.749,49.4384,6|kIybZ:8.7293,49.4332,29")
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
	public void test_1jet9zfnhh8ir_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "v:8.676,49.420,8.74668,49.392|zO:8.6535,49.4275,8.716106,49.393")
				.queryParam("keys", "highway")
				.queryParam("filter2", "tracktype!=* and geometry:point or not length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "29")
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
	public void test_s0x953x7jynl_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736101,49.4284],[8.71591,49.424],[8.7048,49.4270],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"lm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.424],[8.701,49.40476],[8.73250,49.4184],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IHTpM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7165,49.4126],[8.734182,49.404579],[8.7021,49.408718],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "61")
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
	public void test_vb3i891z08qa_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* or geometry:line")
				.queryParam("format", "json")
				.queryParam("time", "2011-08-04")
				.queryParam("bcircles", "yVkjz:8.72419,49.435,91|NxwoA:8.737,49.423,1|rz:8.738289,49.432,8|y:8.7448,49.437391,305")
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
	public void test_s1jyr4sqryuw_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "cqAaQ:8.718,49.412,9|xzR:8.709,49.417,4|qk:8.7356,49.425,48")
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
	public void test_1ieya4o3ewa47_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Ggn:8.679,49.4141,8.74988,49.382|oO:8.679,49.418364,8.7425,49.395")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("values2", "cycleway")
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
	public void test_uvjo5wlmot2w_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "JP:8.6691,49.4264,8.74681,49.395")
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("format", "json")
				.queryParam("filter2", "smoothness!=*")
				.queryParam("keys2", "highway")
				.queryParam("values2", "living_street")
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
	public void test_1iuso79dxdt0w_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.681646,49.4213,8.752,49.38924")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("format", "json")
				.queryParam("filter2", "source:maxspeed=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "58")
				.queryParam("values2", "living_street")
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
	public void test_s0xa8kkmiy43_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69769,49.421322,8.7436,49.393")
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:node or length:( .. 100)")
				.queryParam("time", "2015-08-11")
				.queryParam("keys2", "highway")
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
	public void test_toig7cfrpg6t_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and not area:(1.0 .. 1E6)")
				.queryParam("types2", "node,relation")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "27")
				.queryParam("values2", "primary")
				.queryParam("bcircles", "UFbIU:8.7461,49.436,5|ZgUCP:8.742,49.412,126")
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
	public void test_1jifizprn1ug5_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=*")
				.queryParam("bboxes", "8.69892,49.4153,8.735,49.3976")
				.queryParam("time", "2008-01-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.40445],[8.736,49.435],[8.7367,49.419],[8.704561,49.403252]]]}}]}")
				.queryParam("values2", "residential")
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
	public void test_qy1o5u7fphsy_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "sidewalk=* and type:way")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"tK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7169,49.412],[8.701,49.4132],[8.727,49.4004],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "95")
				.queryParam("values2", "path")
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
	public void test_1jy4y68597hv8_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or id:(1 .. 9999)")
				.queryParam("types2", "relation")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.71698,49.411130,8.731438,49.4080,8.70418,49.41981,8.704561,49.403252|8.704561,49.403252,8.731,49.409,8.70457,49.405,8.745,49.40136,8.704561,49.403252|8.704561,49.403252,8.716,49.43606,8.709,49.4108,8.704,49.425,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "55")
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
	public void test_1ibbk1numaqly_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.66042,49.41820,8.743,49.386|8.661,49.411,8.724,49.3805")
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "bicycle=* and area:(1.0 .. 1E6)")
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
	public void test_vbkofohgijax_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "P:8.65734,49.40391,8.71051,49.382")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("values", "cycleway")
				.queryParam("filter2", "oneway!=* and length:( .. 100)")
				.queryParam("timeout", "60")
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
	public void test_rh51t1wbufky_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.67390,49.4177,8.7237,49.39472")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "66")
				.queryParam("values2", "residential")
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
	public void test_us2yb348eyxw_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "uvmSC:8.656,49.402,8.7552,49.381")
				.queryParam("types2", "line,polygon,other")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "90")
				.queryParam("values2", "crossing")
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
	public void test_skscjbotfofa_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "o:8.653379,49.410,8.729023,49.392|Z:8.696,49.42244,8.725,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "destination!=* and type:relation")
				.queryParam("time", "2013-03-26")
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
	public void test_qxr3oxj38kma_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-06-01")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "B:8.709,49.40749,2")
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
	public void test_rhog8gintrnd_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=*")
				.queryParam("bboxes", "EOZ:8.699,49.410,8.734,49.399|lGSi:8.68253,49.4254,8.737,49.392")
				.queryParam("format", "csv")
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
	public void test_1hr5wz32fx2yg_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "94")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "kKqcO:8.7105,49.418,1619473655")
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
	public void test_t8cwb1p2l92s_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and area:(1.0 .. 1E6)")
				.queryParam("types2", "line,polygon,")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.41792,8.73480,49.42518,8.704,49.404,8.704561,49.403252|8.704561,49.403252,8.7286,49.43579,8.745,49.4227,8.741,49.410,8.704561,49.403252")
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
	public void test_t4f26urnnz39_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("types2", "node,relation")
				.queryParam("time", "2011-08-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.409],[8.742,49.417],[8.738024,49.4064],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.418],[8.703,49.404],[8.728,49.41065],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "72")
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
	public void test_1iuy8xg5xuwdg_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("filter2", "bicycle=* or length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.7244,49.4360,8.703,49.438,8.710210,49.4265,8.704561,49.403252|8.704561,49.403252,8.7495,49.413,8.703,49.4113,8.716518,49.410865,8.704561,49.403252|8.704561,49.403252,8.742,49.435,8.743,49.417,8.744,49.429,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_urrwrc2godb5_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-09-30")
				.queryParam("bpolys", "ki:8.704561,49.403252,8.720,49.4136,8.71932,49.411,8.71153,49.418512,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_1h84sdyicgrxe_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or type:node")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-10-18")
				.queryParam("bpolys", "r:8.704561,49.403252,8.73510,49.418,8.7416,49.41234,8.704568,49.428,8.704561,49.403252|SQPxx:8.704561,49.403252,8.73941,49.430,8.7352,49.408,8.733432,49.402,8.704561,49.403252|uCDH:8.704561,49.403252,8.706503,49.40131,8.7045,49.42743,8.717,49.410609,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_qhvni4l376sx_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-04-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"v\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.433],[8.73347,49.405],[8.734,49.4115],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Yz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7442,49.4193],[8.713,49.42340],[8.74446,49.404],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"K\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.41745],[8.717,49.416033],[8.7044,49.406],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
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
	public void test_tocvvco5bi3m_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and geometry:point and length:( .. 100)")
				.queryParam("types2", "point,line,other")
				.queryParam("time", "2017-06-21")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "8.731,49.437,55|8.733623,49.4115,4|8.72662,49.4152,681034811|8.7279,49.401569,6")
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
	public void test_t4f3d3ny53qs_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2014-02-25")
				.queryParam("bcircles", "yIGvA:8.739,49.413,4")
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
	public void test_t86x5vs0crj6_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "service")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-11-19")
				.queryParam("bpolys", "bWD:8.704561,49.403252,8.739,49.41351,8.708,49.410,8.701739,49.428,8.704561,49.403252|bTdu:8.704561,49.403252,8.703,49.4385,8.716,49.42643,8.712,49.428,8.704561,49.403252|r:8.704561,49.403252,8.74778,49.4299,8.747,49.422508,8.74189,49.40720,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_1h7wzgbxcp2k7_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2012-06-11")
				.queryParam("bpolys", "Nd:8.704561,49.403252,8.7285,49.4318,8.704595,49.40710,8.7207,49.430,8.704561,49.403252|B:8.704561,49.403252,8.708,49.424,8.7001,49.432,8.7426,49.429,8.704561,49.403252")
				.queryParam("bcircles", "aY:8.701459,49.4180,853|QKUDu:8.723,49.435,91|eO:8.747848,49.43681,7")
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
	public void test_qxl1wiscykon_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-06-04")
				.queryParam("bpolys", "L:8.704561,49.403252,8.741,49.430,8.724,49.4293,8.7180,49.40451,8.704561,49.403252|sJO:8.704561,49.403252,8.7002,49.435,8.734,49.4076,8.731730,49.409549,8.704561,49.403252|e:8.704561,49.403252,8.718,49.4002,8.734,49.4286,8.7019,49.414,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_1jed7lc89kj1g_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("timeout", "92")
				.queryParam("bcircles", "Zo:8.744,49.4079,8")
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
	public void test_t4cryipwu43d_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:relation and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-01-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70410,49.439],[8.709,49.4351],[8.7014,49.4105],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "20")
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
	public void test_vevccnhp4fom_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2015-12-19")
				.queryParam("bpolys", "8.704561,49.403252,8.716,49.428,8.7054,49.4189,8.720,49.4060,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_vbsi5cztyi5g_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6727,49.4280,8.702,49.389")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-11-04")
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
	public void test_u82daze3q82u_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6632,49.403,8.758069,49.384|8.681,49.42803,8.702817,49.3952|8.6505,49.408785,8.747,49.386|8.68152,49.428,8.71576,49.3932")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "99")
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
	public void test_sl3x3eaa2mgh_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("time", "2016-04-18")
				.queryParam("bcircles", "UK:8.7218,49.4211,3")
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
	public void test_tolp209tuhwz_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or not length:( .. 100)")
				.queryParam("time", "2008-06-05")
				.queryParam("bcircles", "nb:8.718,49.438941,4")
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
	public void test_qxl32npte2pd_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-05-13")
				.queryParam("bpolys", "o:8.704561,49.403252,8.733,49.434451,8.725,49.406,8.715,49.4246,8.704561,49.403252|lvlGF:8.704561,49.403252,8.736,49.408,8.747069,49.4010,8.7258,49.4073,8.704561,49.403252|BKyya:8.704561,49.403252,8.738,49.41656,8.726,49.400,8.704496,49.417,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_vf96fqvrjnec_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or not type:way")
				.queryParam("bboxes", "8.650,49.4265,8.74598,49.393|8.6691,49.402,8.7087,49.3968|8.696,49.403,8.719265,49.389|8.654,49.401,8.733,49.394")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-05-01")
				.queryParam("bpolys", "LojS:8.704561,49.403252,8.714,49.4187,8.719,49.4161,8.703,49.4272,8.704561,49.403252|K:8.704561,49.403252,8.718,49.414629,8.732,49.4007,8.70944,49.428,8.704561,49.403252")
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
	public void test_1iyqjhkdpqgc1_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "O:8.696,49.4183,8.73719,49.393")
				.queryParam("format", "geojson")
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
	public void test_qhntpun0n7sp_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "S:8.696,49.424,8.715512,49.392|kmTxn:8.6772,49.415,8.7416,49.395|uX:8.657,49.403218,8.7445,49.3817")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "49")
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
	public void test_1iepg3pc78enn_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or type:node or length:( .. 100)")
				.queryParam("bboxes", "8.6575,49.408,8.737,49.3954|8.69636,49.41414,8.720,49.390|8.697,49.408,8.758,49.3979|8.690,49.4193,8.7185,49.385564")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-08-24")
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
	public void test_1k1zhcao72iid_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-11-08")
				.queryParam("bpolys", "IL:8.704561,49.403252,8.738,49.404,8.7007,49.4096,8.70241,49.43994,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_qxoacxas8md5_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.718535,49.419,8.70481,49.4091,8.740,49.42129,8.704561,49.403252|G:8.704561,49.403252,8.743,49.425,8.7289,49.421,8.713,49.413,8.704561,49.403252|Ge:8.704561,49.403252,8.7426,49.40420,8.7424,49.411,8.705,49.435,8.704561,49.403252")
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
	public void test_1jecq2g1jy4x0_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.709,49.404,4|8.74496,49.428,5")
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
	public void test_1hux6fkv45e7l_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70941,49.435],[8.744,49.4080],[8.734051,49.400458],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"CUFxC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.42216],[8.7049,49.433],[8.7037,49.4090],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.405],[8.716,49.4047],[8.735,49.4329],[8.704561,49.403252]]]}}]}")
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
	public void test_qhstpk3avl2b_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "eL:8.685,49.4167,8.7188,49.386|fVCi:8.6600,49.4270,8.722,49.391|cRB:8.680,49.409,8.754,49.3888")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "json")
				.queryParam("time", "2010-01-18")
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
	public void test_s12te8q6ul43_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737,49.4181],[8.70096,49.415],[8.7043,49.426],[8.704561,49.403252]]]}}]}")
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
	public void test_rl2bw7c803eh_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-10-22")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.7161,49.4290,8.700,49.435,8.7169,49.403,8.704561,49.403252")
				.queryParam("bcircles", "FL:8.712,49.414,9")
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
	public void test_trtlnfhq615u_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "q:8.6697,49.4005,8.712,49.386")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "45")
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
	public void test_1iuyqj8vcdooh_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-08-30")
				.queryParam("bpolys", "8.704561,49.403252,8.7070,49.404,8.704566,49.414,8.7273,49.4356,8.704561,49.403252")
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
	public void test_vever7dn7bqv_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("bpolys", "8.704561,49.403252,8.73481,49.429838,8.704,49.439,8.7223,49.422,8.704561,49.403252|8.704561,49.403252,8.747154,49.412,8.706,49.4242,8.734,49.404,8.704561,49.403252")
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
	public void test_trz5793ylwzd_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("time", "2007-10-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XKYPU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.435457],[8.730,49.41709],[8.704860,49.407],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7216,49.413],[8.7428,49.42722],[8.735890,49.4103],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UYN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.414],[8.717214,49.437],[8.7045,49.424],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "51")
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
	public void test_u8aqncrtihbs_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-11-27")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "RaJsI:8.732,49.435,4|HWuuv:8.7068,49.432,4|svsJr:8.71182,49.420,9|IXKn:8.7481,49.423,426")
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
	public void test_t89nb8czpn3q_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=* or not type:node")
				.queryParam("bboxes", "c:8.6857,49.40120,8.719,49.3977")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "20")
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
	public void test_u8053facq33t_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.652,49.4269,8.734,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
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
	public void test_rhaiy8dku69g_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "taK:8.7277,49.4150,92|rX:8.741,49.432105,698|T:8.7452,49.4024,41|q:8.702,49.4020,2")
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
	public void test_r1ctap4rq43a_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "wM:8.6635,49.401740,8.726,49.392|oigCX:8.6524,49.417,8.7264,49.397|Gx:8.66129,49.406,8.7245,49.387")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-03-13")
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
	public void test_1iuvis5wffdbs_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hsFgt:8.684,49.4232,8.70814,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-01-01")
				.queryParam("bpolys", "tk:8.704561,49.403252,8.746578,49.406,8.708,49.4207,8.7095,49.405,8.704561,49.403252|mC:8.704561,49.403252,8.747,49.41615,8.721,49.412,8.7044,49.418,8.704561,49.403252|hBdU:8.704561,49.403252,8.716,49.42759,8.707,49.4107,8.7049,49.40608,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_1iyf0q1pabynm_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.690,49.402009,8.759662,49.390|8.68463,49.409,8.717,49.387|8.6843,49.4004,8.713,49.382|8.673385,49.40232,8.758,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-03-01")
				.queryParam("timeout", "34")
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
	public void test_u805sssu0wmu_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("format", "geojson")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "8.7366,49.4389,5|8.728,49.400,5|8.728837,49.4055,8|8.7280,49.436,711045861051")
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
	public void test_1ib3pej3wszzt_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "tlw:8.698,49.4011,8.712,49.3809|laOX:8.677,49.404,8.752,49.390|F:8.6550,49.4266,8.736,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-04-26")
				.queryParam("timeout", "90")
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
	public void test_t4nf5ay53meq_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "8.704561,49.403252,8.737310,49.4007,8.739,49.439,8.70583,49.4159,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_s4xfr2y097qc_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xZShb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.4204],[8.701290,49.43352],[8.739,49.4243],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737,49.405],[8.7237,49.431],[8.744,49.427],[8.704561,49.403252]]]}}]}")
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
	public void test_to2c9ibwcf91_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* and type:node and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-04-02")
				.queryParam("bpolys", "e:8.704561,49.403252,8.73062,49.4352,8.7035,49.409649,8.74427,49.42441,8.704561,49.403252|rUTK:8.704561,49.403252,8.7305,49.4189,8.726,49.4283,8.7075,49.4292,8.704561,49.403252|NTZiO:8.704561,49.403252,8.737,49.426,8.70460,49.4003,8.70463,49.432,8.704561,49.403252")
				.queryParam("timeout", "73")
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
	public void test_1k1xaohlhpa9k_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.402],[8.7212,49.428],[8.705,49.42707],[8.704561,49.403252]]]}}]}")
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
	public void test_tolpu8fmox83_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "EY:8.715,49.439208,1")
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
	public void test_t8ceb69tbcrq_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2008-04-05")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "Qfy:8.712,49.421,15|k:8.716,49.430,98")
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
	public void test_uvjo5sn8k9bm_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("bboxes", "hAvgb:8.6707,49.429,8.734,49.3865|n:8.6732,49.4067,8.712,49.3918")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "aVyd:8.704561,49.403252,8.702,49.402,8.70462,49.407,8.7448,49.418,8.704561,49.403252|n:8.704561,49.403252,8.73896,49.4254,8.723,49.436,8.702,49.437,8.704561,49.403252|xYm:8.704561,49.403252,8.7469,49.4005,8.704,49.439,8.71665,49.425,8.704561,49.403252")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "XE:8.728,49.420,5")
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
	public void test_rlamwkbrz9de_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-07-05")
				.queryParam("bpolys", "HDL:8.704561,49.403252,8.744,49.40150,8.713,49.41139,8.706,49.4048,8.704561,49.403252|MSD:8.704561,49.403252,8.734,49.414407,8.7022,49.412,8.7040,49.4026,8.704561,49.403252|Pugp:8.704561,49.403252,8.715,49.429,8.726,49.409,8.709,49.414,8.704561,49.403252")
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
	public void test_trww7l4on59h_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and type:relation")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-06-25")
				.queryParam("bpolys", "W:8.704561,49.403252,8.7302,49.407,8.716,49.418390,8.701,49.4281,8.704561,49.403252|c:8.704561,49.403252,8.703146,49.420182,8.705673,49.421,8.7018,49.418,8.704561,49.403252|wT:8.704561,49.403252,8.73828,49.421,8.70057,49.423,8.718,49.425,8.704561,49.403252")
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
	public void test_tnzijiz9edyt_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "mBN:8.721,49.435966,806|vb:8.7321,49.414,3|g:8.74624,49.431,8|Asdze:8.719,49.4290,5")
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
	public void test_1jyg2u3sns9k5_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("time", "2010-10-18")
				.queryParam("bcircles", "8.7430,49.4376,6|8.7114,49.403,25")
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
	public void test_t87epjk9ixcz_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or id:(1 .. 9999)")
				.queryParam("time", "2009-03-04")
				.queryParam("bcircles", "8.710817,49.4085,2")
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
	public void test_qxg0octkojtw_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-04-25")
				.queryParam("bcircles", "8.749633,49.4205,97|8.71265,49.401,4|8.731,49.4357,1")
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
	public void test_skxx6jlkezao_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "vS:8.71582,49.42047,3")
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
	public void test_qe6m8ym7yj3k_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=*")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.7420,49.417,8.730,49.428,8.7236,49.419,8.704561,49.403252")
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
	public void test_to4jawszw8kk_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2009-04-11")
				.queryParam("bcircles", "HP:8.721,49.432,3|UaZ:8.744,49.405,71|lNUcc:8.717,49.43073,8")
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
	public void test_1hbagbgcmdyr5_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:backward!=*")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "zOYrK:8.704561,49.403252,8.708,49.4034,8.72415,49.439,8.704535,49.435,8.704561,49.403252")
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
	public void test_rkwuos910bxd_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or not type:way or id:(1 .. 9999)")
				.queryParam("bboxes", "l:8.659,49.42480,8.7567,49.3833")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-10-24")
				.queryParam("timeout", "76")
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
	public void test_u805hatnoai9_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or type:relation and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "k:8.740,49.435,7|Ug:8.735101,49.432,2")
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
	public void test_1hraxfcpzx9vb_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2014-01-02")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.407,8.716640,49.425,8.718,49.415,8.704561,49.403252|8.704561,49.403252,8.7424,49.401,8.7303,49.432,8.744,49.419,8.704561,49.403252|8.704561,49.403252,8.71522,49.4288,8.719,49.40082,8.7287,49.407,8.704561,49.403252")
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
	public void test_uv8nec1wsmsl_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.4128],[8.7290,49.405885],[8.704465,49.405],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.420],[8.735,49.415],[8.7296,49.41133],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7077,49.4186],[8.709,49.4357],[8.7223,49.436],[8.704561,49.403252]]]}}]}")
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
	public void test_t8cxem9nv1pf_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-09-01")
				.queryParam("bcircles", "ll:8.700026,49.424069,649159249|qIkaU:8.713,49.411,6|nup:8.742,49.411,9")
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
	public void test_soemppit52zn_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "ANRg:8.704561,49.403252,8.743,49.422,8.7048,49.436,8.722,49.422,8.704561,49.403252|is:8.704561,49.403252,8.703,49.416,8.749094,49.422162,8.714,49.400,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_ure0pq3lelb6_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "VvH:8.704561,49.403252,8.735,49.417,8.738,49.413,8.703,49.437516,8.704561,49.403252")
				.queryParam("timeout", "83")
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
	public void test_1iuqfx0vtxiyc_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* and not type:way or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "GG:8.6610,49.407,8.756,49.392")
				.queryParam("time", "2011-12-17")
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
	public void test_vbbuptwtafcp_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and type:relation")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-11-08")
				.queryParam("bcircles", "YKD:8.7345,49.422,651")
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
	public void test_1ib0ghau61vzq_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,dormitory,house")
				.queryParam("filter", "highway!=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "K:8.6547,49.4179,8.706,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "A:8.720628,49.423,8")
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
	public void test_u7ol8icl3cdf_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-04-29")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "Y:8.7411,49.429,3|p:8.704,49.434,23|D:8.705987,49.438182,3|Z:8.740,49.4109,6")
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
	public void test_1k22slxu73776_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* and type:way and not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2013-04-03")
				.queryParam("bpolys", "l:8.704561,49.403252,8.721,49.4311,8.704591,49.411985,8.7278,49.4378,8.704561,49.403252|h:8.704561,49.403252,8.742,49.4012,8.704,49.410,8.703581,49.4298,8.704561,49.403252|O:8.704561,49.403252,8.7216,49.435,8.703,49.407105,8.709,49.423,8.704561,49.403252")
				.queryParam("timeout", "22")
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
	public void test_1jydbg55kmvxw_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-09-25")
				.queryParam("bcircles", "M:8.705,49.433,5")
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
	public void test_qhnajvkxfd4k_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "TPk:8.686,49.417,8.742,49.397|WRJsg:8.692649,49.40462,8.728,49.397|Cy:8.661,49.4196,8.738,49.397|RxMU:8.681,49.415,8.727,49.3926")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-07-14")
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
	public void test_uve4ohthb2ox_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,emergency_access_point,unclassified")
				.queryParam("bboxes", "IqWha:8.661,49.401,8.72579,49.3837|K:8.68690,49.42643,8.750,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2014-04-02")
				.queryParam("timeout", "68")
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
	public void test_1jid9xh44nvi1_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2018-04-10")
				.queryParam("bpolys", "KT:8.704561,49.403252,8.733589,49.4160,8.704562,49.4320,8.70988,49.428,8.704561,49.403252")
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
	public void test_vbcdtiix26nt_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Yr:8.67715,49.419,8.729,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "52")
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
	public void test_1h7ind4tdo301_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,give_way")
				.queryParam("filter", "ref!=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2013-08-02")
				.queryParam("bcircles", "8.740255,49.421103,95|8.719573,49.422,6|8.730,49.422855,3|8.739,49.406,225")
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
	public void test_qeexnccx4u3m_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,steps")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-04-17")
				.queryParam("bpolys", "hiMsV:8.704561,49.403252,8.7434,49.43042,8.713,49.426,8.740,49.410,8.704561,49.403252|D:8.704561,49.403252,8.708,49.406,8.721,49.414,8.707226,49.40730,8.704561,49.403252|EV:8.704561,49.403252,8.723,49.433791,8.7355,49.4195,8.7371,49.406551,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_rhr579ytyyb5_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* and length:( .. 100)")
				.queryParam("bboxes", "8.676137,49.410,8.7236,49.387|8.65673,49.412,8.754,49.392879")
				.queryParam("groupByKey", "building")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-01-04")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "XX:8.7337,49.4126,9")
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
	public void test_1hr83oz5nvnec_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HQ:8.6939,49.42315,8.748,49.3820|C:8.6592,49.404439,8.744,49.3939")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "tfTVo:8.704561,49.403252,8.740,49.438,8.704348,49.4371,8.722,49.437,8.704561,49.403252|WV:8.704561,49.403252,8.70722,49.406,8.7388,49.436,8.700645,49.419,8.704561,49.403252|X:8.704561,49.403252,8.709,49.418,8.730,49.42575,8.703,49.439,8.704561,49.403252")
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
	public void test_rhda0ockgbhs_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.699,49.4285,8.721521,49.3885")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
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
	public void test_1jeyvh1064enq_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,give_way,hospital")
				.queryParam("filter", "turn:lanes!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "sG:8.6549,49.422781,8.746,49.381|Ah:8.6698,49.403,8.7513,49.396|VuwdS:8.661,49.409,8.743,49.382|C:8.659695,49.416,8.7028,49.395")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2009-12-11")
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
	public void test_1jy87vd1xyble_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6800,49.4287,8.749,49.398")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "87")
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
	public void test_u7r9w3cjbsrm_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and geometry:polygon")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "x:8.704561,49.403252,8.740,49.421,8.7288,49.4342,8.703,49.411701,8.704561,49.403252")
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
	public void test_1h84uqf18y43a_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.671,49.401016,8.753075,49.395|8.680,49.422,8.733,49.390707")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-06-19")
				.queryParam("timeout", "97")
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
	public void test_1hr8ocq7lrwvl_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Xx:8.690,49.413,8.732227,49.39017|bFsYt:8.655906,49.401,8.7102,49.394|oPlAx:8.69152,49.40100,8.708,49.398|gUxkd:8.697,49.4162,8.751,49.382588")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-05-06")
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
	public void test_qdyaxl1qc57l_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=* and type:relation and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "8.725749,49.431,3|8.730,49.403,410484699")
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
	public void test_1iukvz8jd52zp_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,emergency_access_point,apartments")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.7167,49.40539,110")
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
	public void test_qdtah3u1jsyu_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,crossing,garage")
				.queryParam("bboxes", "8.657,49.41750,8.720037,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "8.72299,49.408,5")
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
	public void test_1jxzdu6e3ss4k_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-03-11")
				.queryParam("bpolys", "8.704561,49.403252,8.743,49.406,8.72938,49.4141,8.723346,49.4180,8.704561,49.403252|8.704561,49.403252,8.72807,49.420,8.7047,49.410,8.706,49.416,8.704561,49.403252")
				.queryParam("timeout", "100")
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
	public void test_skkia9zm2n93_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "steps,garage")
				.queryParam("bboxes", "8.666,49.4152,8.759,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("timeout", "21")
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
	public void test_s1jyqwyihp2u_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,emergency_access_point")
				.queryParam("bboxes", "LieC:8.6761,49.4100,8.7386,49.382|Ls:8.658140,49.406,8.7519,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
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
	public void test_1iv3qwrvuumgk_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue,tower")
				.queryParam("bboxes", "knCV:8.673184,49.416,8.709787,49.396|z:8.65360,49.427,8.7527,49.3864|Y:8.6954,49.4241,8.730,49.3997|k:8.651,49.411,8.720,49.3831")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-11-03")
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
	public void test_1h7z8ugqal06r_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "YGx:8.730652,49.41459,198")
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
	public void test_1h7leqnpnl0s8_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "YlRJx:8.70011,49.4393,6|OW:8.70733,49.417101,7")
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
	public void test_s12ts4bpfpkg_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel")
				.queryParam("filter", "lit!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-03-09")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.413,8.741,49.403,8.7151,49.405,8.704561,49.403252|8.704561,49.403252,8.706,49.421031,8.7305,49.4082,8.7094,49.438,8.704561,49.403252|8.704561,49.403252,8.717,49.437164,8.704580,49.436,8.738,49.407,8.704561,49.403252")
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
	public void test_1hr8nklndmgki_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street,secondary,station")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-03-31")
				.queryParam("bpolys", "ywg:8.704561,49.403252,8.737,49.428346,8.735,49.43540,8.704,49.407485,8.704561,49.403252")
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
	public void test_skyec29ctfzs_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,service")
				.queryParam("filter", "type=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "c:8.671359,49.4138,8.7126,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
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
	public void test_t4f2l7b1m8v6_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.409098,8.740773,49.4352,8.70402,49.4087,8.704561,49.403252|8.704561,49.403252,8.727399,49.4388,8.723,49.403,8.7371,49.408,8.704561,49.403252")
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
	public void test_uveohlxf8jsp_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=*")
				.queryParam("groupByValues", "residential")
				.queryParam("bboxes", "8.6578,49.429,8.7100,49.396|8.682,49.41555,8.7534,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "8.710,49.404014,6|8.716,49.41160,40")
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
	public void test_1h7fvntr6516d_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,track,commercial")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "P:8.700980,49.434,5")
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
	public void test_1k1zk2axa3z8x_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,footway")
				.queryParam("filter", "sidewalk=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "RUNaD:8.704561,49.403252,8.704,49.421563,8.710,49.4133,8.74506,49.4368,8.704561,49.403252|b:8.704561,49.403252,8.7338,49.436,8.704,49.41852,8.7254,49.430867,8.704561,49.403252")
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
	public void test_1iyfgpoywj142_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,turning_circle")
				.queryParam("bboxes", "aK:8.669749,49.42419,8.734,49.3937|wMWzg:8.6955,49.418,8.7050,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "89")
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
	public void test_t89np9gmr3hh_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2013-01-07")
				.queryParam("bpolys", "cEhin:8.704561,49.403252,8.706,49.4339,8.704,49.417113,8.7046,49.423799,8.704561,49.403252|uHn:8.704561,49.403252,8.711,49.416308,8.722276,49.40682,8.704,49.414947,8.704561,49.403252|xRgS:8.704561,49.403252,8.726,49.43427,8.70418,49.421489,8.744,49.429,8.704561,49.403252")
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
	public void test_trwd1k24ie5y_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,bus_stop")
				.queryParam("bboxes", "8.682,49.408,8.754,49.387")
				.queryParam("groupByKey", "building")
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
	public void test_rhoxdtn7z48h_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,school,station")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2009-07-28")
				.queryParam("bpolys", "qXt:8.704561,49.403252,8.747,49.426647,8.734,49.401,8.7008,49.42781,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1iusqjlvzr31z_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "LTq:8.7326,49.428,7348741542")
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
	public void test_vbf6ft0ysh9h_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,tower,residential")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("time", "2015-01-27")
				.queryParam("bpolys", "nB:8.704561,49.403252,8.713839,49.42821,8.70004,49.421,8.7063,49.417431,8.704561,49.403252")
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
	public void test_1h821eerlzkfn_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6696,49.4053,8.7232,49.3859|8.658,49.4165,8.7535,49.386")
				.queryParam("format", "csv")
				.queryParam("bcircles", "UP:8.7418,49.43164,31|VV:8.737,49.41927,3")
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
	public void test_rhocnm4vse9j_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-10-16")
				.queryParam("bpolys", "8.704561,49.403252,8.709,49.4254,8.74076,49.4255,8.740,49.40710,8.704561,49.403252|8.704561,49.403252,8.7106,49.4389,8.703,49.4143,8.703452,49.43713,8.704561,49.403252")
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
	public void test_1jyg19vr5opk1_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.655,49.426,8.737,49.39971|8.668,49.4263,8.71019,49.3861|8.664,49.419,8.749818,49.397")
				.queryParam("format", "csv")
				.queryParam("time", "2011-05-19")
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
	public void test_tog72apx39lx_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.439],[8.7343,49.4093],[8.705,49.4197],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "79")
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
	public void test_1ies7y5u7axk6_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "bgRNl:8.6930,49.4129,8.720449,49.396|D:8.683,49.402,8.7232,49.3802")
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
	public void test_t4qn7yl2jdwx_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "nnrVd:8.677,49.405,8.7598,49.398")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "28")
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
	public void test_vbele7idvxo0_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and type:node or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.72504,49.413,8.7033,49.434,8.7043,49.400,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_1iuvz2lwk62pj_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* or length:( .. 100)")
				.queryParam("bboxes", "8.699,49.411160,8.7512,49.397|8.665,49.4047,8.710,49.3806|8.65340,49.424,8.728,49.3939|8.663335,49.4165,8.739476,49.387363")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-02-07")
				.queryParam("timeout", "80")
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
	public void test_to7un6neyqua_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* and geometry:line")
				.queryParam("bboxes", "p:8.650,49.417,8.7445,49.3881|r:8.663,49.400892,8.754,49.392")
				.queryParam("time", "2013-04-05")
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
	public void test_urv6uvxa4oj7_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.708359,49.405,8.7461,49.418739,8.7058,49.4145,8.704561,49.403252|8.704561,49.403252,8.704,49.433,8.700530,49.428520,8.705,49.428,8.704561,49.403252|8.704561,49.403252,8.73855,49.427,8.702,49.4171,8.7161,49.413,8.704561,49.403252")
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
	public void test_urhcdhwcw2m0_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* or geometry:point")
				.queryParam("bboxes", "8.675038,49.420,8.756,49.383|8.6670,49.4104,8.75316,49.384")
				.queryParam("keys", "highway")
				.queryParam("time", "2008-11-04")
				.queryParam("bpolys", "qNy:8.704561,49.403252,8.714,49.414,8.7163,49.42860,8.733,49.432,8.704561,49.403252|xY:8.704561,49.403252,8.711,49.420,8.702424,49.4234,8.704292,49.415,8.704561,49.403252|Bo:8.704561,49.403252,8.720,49.416,8.731259,49.40802,8.712,49.425,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_1hrutdjjrf6lu_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2009-01-17")
				.queryParam("bcircles", "eIUNq:8.7308,49.4357,95")
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
	public void test_1jent5rfo3kty_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* or not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "8.72749,49.40195,4|8.700,49.409,8")
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
	public void test_s1jeh9b9ov1t_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Qmjo:8.704561,49.403252,8.7304,49.41871,8.723,49.40880,8.745775,49.42141,8.704561,49.403252|IP:8.704561,49.403252,8.704,49.4375,8.712,49.4315,8.7130,49.430429,8.704561,49.403252|Gf:8.704561,49.403252,8.711,49.4325,8.7048,49.438469,8.720,49.438,8.704561,49.403252")
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
	public void test_1iyq16a5jl8hc_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "zWbQ:8.6710,49.4214,8.701,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "48")
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
	public void test_rhb0y467cxmc_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iGqUM:8.6931,49.406,8.73070,49.398")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_urxefmvgo3zo_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "zp:8.74773,49.401,4|ZL:8.710,49.406,5|C:8.729,49.4007,164|XbS:8.723,49.409,6")
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
	public void test_s12rwwzbyy5d_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6656,49.411,8.7549,49.391695|8.650,49.40373,8.705,49.399|8.693,49.411,8.73003,49.397")
				.queryParam("timeout", "26")
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
	public void test_uvbcwkdgamhx_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and id:(1 .. 9999)")
				.queryParam("bboxes", "oUZmA:8.675,49.420112,8.741,49.382|vJi:8.679,49.42720,8.7202,49.388")
				.queryParam("time", "2017-03-29")
				.queryParam("timeout", "53")
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
	public void test_1hrrlp2jgdhrn_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "kq:8.6580,49.424909,8.706,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("time", "2013-02-23")
				.queryParam("timeout", "39")
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
	public void test_s4man5kf9o4m_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:forward!=* or not geometry:line or length:( .. 100)")
				.queryParam("bboxes", "pO:8.676061,49.409,8.729,49.384270")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-06-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xQgfX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.4166],[8.702,49.4299],[8.70430,49.419],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "oMrBP:8.7492,49.431,7|V:8.7416,49.4080,6441121459|ymcsG:8.747,49.437,2|P:8.73600,49.433630,610834853")
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
	public void test_qxfgbywvy69e_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "AM:8.670,49.421,8.7131,49.386|uwrnm:8.68443,49.416,8.757963,49.3903")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-05-08")
				.queryParam("timeout", "70")
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
	public void test_1iykhjll7r2gm_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=*")
				.queryParam("bboxes", "8.692611,49.410,8.745,49.3923|8.697,49.422,8.725,49.399")
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
	public void test_1jyahq5qfwzlh_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("time", "2011-08-26")
				.queryParam("bpolys", "N:8.704561,49.403252,8.7067,49.43276,8.736570,49.42853,8.7361,49.431,8.704561,49.403252|Pqef:8.704561,49.403252,8.749,49.40623,8.701,49.426729,8.7431,49.422,8.704561,49.403252|qA:8.704561,49.403252,8.720,49.416,8.702896,49.412,8.7085,49.4265,8.704561,49.403252")
				.queryParam("timeout", "93")
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
	public void test_t4yzpx8ujj8w_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2014-06-05")
				.queryParam("bcircles", "8.730,49.430701,2|8.73162,49.404361,81")
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
	public void test_uvenbcojpstv_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2010-05-31")
				.queryParam("bcircles", "8.714,49.4244,9")
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
	public void test_1hblhumwnu0xk_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "L:8.704561,49.403252,8.7205,49.435,8.70459,49.407,8.70461,49.4163,8.704561,49.403252|v:8.704561,49.403252,8.7444,49.427,8.701,49.4023,8.716,49.438,8.704561,49.403252|Ly:8.704561,49.403252,8.7017,49.4334,8.70261,49.4319,8.718,49.420,8.704561,49.403252")
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
	public void test_1h7j5adwke1d2_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "o:8.670518,49.410,8.7178,49.380|vB:8.681,49.429,8.706,49.385|ctC:8.671,49.41867,8.73094,49.390")
				.queryParam("time", "2009-09-28")
				.queryParam("timeout", "94")
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
	public void test_1jefebuefd5x1_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.723079,49.4383,8.727,49.409,8.7052,49.41021,8.704561,49.403252|8.704561,49.403252,8.737434,49.423,8.74213,49.405,8.701,49.4348,8.704561,49.403252")
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
	public void test_rl5logqgaipl_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-10-23")
				.queryParam("bcircles", "uDqOz:8.733108,49.4317,557")
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
	public void test_ubuoyzc0165g_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-10-27")
				.queryParam("bpolys", "l:8.704561,49.403252,8.704,49.436,8.713,49.416,8.701,49.4337,8.704561,49.403252|WkJt:8.704561,49.403252,8.7441,49.4067,8.7083,49.4053,8.719870,49.407,8.704561,49.403252|ug:8.704561,49.403252,8.739,49.40173,8.7043,49.4238,8.7074,49.408,8.704561,49.403252")
				.queryParam("bcircles", "8.721049,49.4344,29|8.742,49.411,5|8.743,49.4146,4|8.7058,49.415,8")
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
	public void test_vf6z0cywu9gj_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "PzD:8.66135,49.421,8.7572,49.389|bbaED:8.683,49.4136,8.740,49.392|x:8.6667,49.413,8.7446,49.39766")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-09-07")
				.queryParam("timeout", "93")
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
	public void test_t8f65czdzynt_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.7117,49.429,3")
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
	public void test_s4rw4yf36fkx_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "ME:8.700,49.4088,74|Is:8.717,49.406627,2")
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
	public void test_u8diqle15lbq_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.697505,49.407,8.7568,49.3847|8.6850,49.420,8.751571,49.382")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "89")
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
	public void test_uv8lipnx3qlh_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"n\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744902,49.416],[8.7071,49.432],[8.709,49.409],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "63")
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
	public void test_urp65rga2gc7_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("timeout", "60")
				.queryParam("bcircles", "t:8.733923,49.423791,5|T:8.7261,49.436,7")
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
	public void test_1jyd9kiazi243_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.652077,49.416,8.719,49.386|8.65123,49.425,8.750318,49.39651|8.657208,49.409,8.7558,49.396|8.6694,49.414,8.7546,49.39646")
				.queryParam("format", "geojson")
				.queryParam("timeout", "28")
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
	public void test_rhaijx1smxip_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "wdoW:8.668949,49.423561,8.705682,49.394")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "84")
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
	public void test_1ibkbnr98p9i9_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-03-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"OwJn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.4246],[8.704,49.4376],[8.7044,49.4047],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "83")
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
	public void test_trwv1i5zvski_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified")
				.queryParam("filter", "name=* or type:node or not length:( .. 100)")
				.queryParam("bboxes", "d:8.692,49.428,8.755,49.384|IAY:8.675,49.421,8.728,49.396|p:8.675,49.413,8.721,49.394|neM:8.676,49.406747,8.722,49.382662")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-02-05")
				.queryParam("bpolys", "K:8.704561,49.403252,8.747,49.4347,8.703,49.428,8.744,49.431,8.704561,49.403252|xrYb:8.704561,49.403252,8.730,49.417835,8.724,49.434,8.7195,49.4035,8.704561,49.403252")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "Jg:8.7435,49.438664,1")
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
	public void test_1ji1nt26cg1ti_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.408,8.725,49.3802|8.688,49.419,8.716,49.392")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"r\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.408],[8.700,49.426251],[8.704,49.4288],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.4158],[8.7326,49.438],[8.701,49.4139],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"dCK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.42191],[8.7041,49.419],[8.70809,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "74")
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
	public void test_t4tf2diyuw69_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,hotel,office")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "kyD:8.71924,49.435,3")
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
	public void test_1iavdb3mx9ahv_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,living_street")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.4366,8.700,49.422,8.705,49.40215,8.704561,49.403252|8.704561,49.403252,8.704,49.436,8.701,49.417,8.7309,49.4165,8.704561,49.403252|8.704561,49.403252,8.706346,49.4092,8.7018,49.438,8.718418,49.43306,8.704561,49.403252")
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
	public void test_1if0it7ugwn5k_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "100")
				.queryParam("bcircles", "8.719,49.424,454252843")
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
	public void test_ts2fowc1nqk8_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-11-02")
				.queryParam("bpolys", "n:8.704561,49.403252,8.703,49.433653,8.7007,49.4107,8.71952,49.40613,8.704561,49.403252|TlEw:8.704561,49.403252,8.738,49.41270,8.709,49.412,8.70459,49.405,8.704561,49.403252|u:8.704561,49.403252,8.727,49.404,8.74950,49.429,8.707,49.40367,8.704561,49.403252")
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
	public void test_sl6845y2nnlf_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,living_street,pedestrian")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "8.705,49.427,7|8.730827,49.414,6|8.717,49.418,2")
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
	public void test_sok32z2kklkp_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "G:8.668,49.409,8.719,49.387|V:8.664,49.41907,8.7453,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2010-10-04")
				.queryParam("timeout", "59")
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
	public void test_sl3xhqvbuaud_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-01-01")
				.queryParam("bcircles", "8.7493,49.422,3")
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
	public void test_qe9dbkit0vol_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,hospital")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2018-04-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.424],[8.727,49.428],[8.70472,49.43394],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.4294],[8.708,49.421],[8.704,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"rWJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.420],[8.730228,49.4238],[8.710,49.4320],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "37")
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
	public void test_1iyhp03b9rdbl_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "Iuye:8.669,49.4273,8.7421,49.391|Pvbod:8.68490,49.4129,8.7578,49.395")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2018-03-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.4360],[8.7203,49.4124],[8.704603,49.42002],[8.704561,49.403252]]]}}]}")
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
	public void test_s4mb0qvt7z37_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=*")
				.queryParam("values", "cycleway")
				.queryParam("timeout", "65")
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
	public void test_sl0m8bkauc6s_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tertiary,dormitory")
				.queryParam("filter", "lit=* or geometry:point")
				.queryParam("bboxes", "8.6507,49.412,8.710,49.391|8.661,49.403,8.754,49.393|8.693,49.411,8.734,49.39142|8.669,49.410,8.725100,49.3976")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2009-11-21")
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
	public void test_qe3v98yxyzaq_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "yes,track")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "ZAVIb:8.704561,49.403252,8.7213,49.406,8.720,49.41476,8.709268,49.4173,8.704561,49.403252|iK:8.704561,49.403252,8.7118,49.4223,8.704,49.435858,8.708076,49.413020,8.704561,49.403252|rAmQL:8.704561,49.403252,8.736,49.416,8.706,49.4304,8.702,49.423,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_qxwm2zns0iet_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.748,49.412,7|8.734,49.43609,7|8.728167,49.425,6|8.73854,49.403,289398560342")
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
	public void test_s1bm9fzseag1_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,service,residential")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "8.736260,49.410,9|8.7456,49.408,4")
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
	public void test_vb94kp922ipl_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,house,office")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-07-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7191,49.402],[8.707,49.401],[8.7177,49.404],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "64")
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
	public void test_r17a29yulsfk_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "59")
				.queryParam("bcircles", "S:8.7313,49.420,1|dCAD:8.71461,49.40318,4|S:8.7325,49.4336,3")
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
	public void test_qdspffkcwk12_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,turning_circle")
				.queryParam("bboxes", "8.692,49.42675,8.70927,49.39616")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-05-28")
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
	public void test_qxi9o4oz50z5_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.65851,49.421,8.700413,49.3852|8.6973,49.410,8.714,49.3962|8.681,49.420,8.740,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
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
	public void test_rhrnlh2g9g10_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6934,49.421,8.726,49.398|8.690654,49.4229,8.752,49.389|8.680,49.403438,8.755,49.394|8.668,49.41558,8.75324,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-09-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bDS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.4353],[8.701,49.438],[8.715,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.417],[8.7048,49.404822],[8.712,49.431935],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
				.queryParam("groupByKeys", "addr:street,source:maxspeed")
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
	public void test_vf3myvgvz4u0_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_qxia2bqv18ag_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "d:8.704561,49.403252,8.735350,49.418,8.7020,49.4006,8.702,49.428788,8.704561,49.403252|qqfI:8.704561,49.403252,8.72585,49.4329,8.732,49.41469,8.7089,49.401,8.704561,49.403252|stPIF:8.704561,49.403252,8.702552,49.424689,8.726,49.40692,8.7045,49.400871,8.704561,49.403252")
				.queryParam("groupByKeys", "bicycle,addr:postcode")
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
	public void test_qxl2angqq7nd_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* and not length:( .. 100)")
				.queryParam("bpolys", "f:8.704561,49.403252,8.7319,49.41833,8.736,49.409406,8.703,49.420,8.704561,49.403252|m:8.704561,49.403252,8.73534,49.402,8.709857,49.418,8.7256,49.420,8.704561,49.403252")
				.queryParam("timeout", "49")
				.queryParam("groupByKeys", "surface,addr:country")
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
	public void test_1ib36b2pl1t29_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "building,addr:country")
				.queryParam("bcircles", "v:8.740,49.4149,381506807|BYtD:8.739,49.4113,1|D:8.724191,49.4215,757488262|D:8.717200,49.4381,7")
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
	public void test_1ib391ai2yhbn_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "xOCcs:8.6573,49.41544,8.71612,49.38682")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "highway,landuse")
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
	public void test_1iv6j3472wzed_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "2011-05-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UQp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7113,49.417],[8.701,49.41911],[8.706,49.4023],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.4020],[8.708,49.439],[8.7002,49.415164],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "lanes:backward,type")
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
	public void test_qe73seiecvn6_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-04-25")
				.queryParam("bpolys", "M:8.704561,49.403252,8.70243,49.436,8.735,49.41241,8.7089,49.43310,8.704561,49.403252|UKcp:8.704561,49.403252,8.7214,49.420069,8.727,49.4072,8.73474,49.416,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:postcode,ref,lanes:backward")
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
	public void test_toalykkxpdtd_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-10-24")
				.queryParam("timeout", "42")
				.queryParam("groupByKeys", "addr:postcode,addr:country,tracktype")
				.queryParam("bcircles", "i:8.72146,49.439,9|z:8.731,49.406,8|LAM:8.7033,49.4022,6907074782|tLs:8.741,49.408,1")
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
	public void test_rl8ddjv72dyx_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.734,49.4049,8.7234,49.408,8.710,49.4188,8.704561,49.403252|8.704561,49.403252,8.731411,49.416,8.7014,49.427,8.718,49.433,8.704561,49.403252")
				.queryParam("timeout", "100")
				.queryParam("groupByKeys", "addr:country,highway")
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
	public void test_1k25ljp3mobqc_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=*")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-07-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"IVPNE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748121,49.410],[8.704,49.420],[8.713,49.404],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "sidewalk,type")
				.queryParam("bcircles", "8.711,49.438953,2|8.7458,49.413,7")
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
	public void test_1iut839o941f8_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* and geometry:polygon")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "j:8.736,49.439641,710|Od:8.724,49.4042,697|rhJHp:8.702,49.41678,8")
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
	public void test_1ien6n7mq12k0_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "CCP:8.704561,49.403252,8.703,49.416486,8.74412,49.4242,8.729,49.400983,8.704561,49.403252")
				.queryParam("timeout", "31")
				.queryParam("groupByKeys", "turn:lanes,bicycle,type")
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
	public void test_1ibc010wvh1lu_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6571,49.404864,8.712,49.3890")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-08-26")
				.queryParam("groupByKeys", "turn:lanes,addr:street")
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
	public void test_urrwu2rmda2g_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-07-22")
				.queryParam("bpolys", "QAb:8.704561,49.403252,8.71765,49.40209,8.747,49.405,8.744773,49.412267,8.704561,49.403252|maJsJ:8.704561,49.403252,8.705214,49.430,8.7434,49.4389,8.7011,49.434,8.704561,49.403252|LzD:8.704561,49.403252,8.719395,49.433,8.70460,49.438,8.736321,49.436168,8.704561,49.403252")
				.queryParam("timeout", "95")
				.queryParam("groupByKeys", "foot,highway,lit")
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
	public void test_to539fvmiq7k_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or geometry:line")
				.queryParam("bboxes", "8.6782,49.4004,8.7573,49.398|8.690,49.427,8.7437,49.392|8.6918,49.412,8.705603,49.381|8.676307,49.409163,8.7208,49.38955")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-11-27")
				.queryParam("timeout", "26")
				.queryParam("groupByKeys", "type,destination,name")
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
	public void test_1iukd9wvcx3ky_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.673,49.417,8.710,49.394|8.697,49.416,8.750,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-06-29")
				.queryParam("groupByKeys", "bicycle,smoothness")
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
	public void test_vbk5c5tly4py_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-05-12")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.415,8.713,49.407,8.707,49.414,8.704561,49.403252|8.704561,49.403252,8.71461,49.428,8.703,49.422,8.704273,49.4009,8.704561,49.403252|8.704561,49.403252,8.710343,49.4286,8.7003,49.4143,8.736924,49.424,8.704561,49.403252")
				.queryParam("groupByKeys", "foot,highway,lanes:forward")
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
	public void test_qe6nteisckf5_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Baabd:8.704561,49.403252,8.734,49.424,8.706346,49.429,8.700,49.425,8.704561,49.403252|Bnh:8.704561,49.403252,8.7018,49.434827,8.7037,49.404,8.702,49.4089,8.704561,49.403252|sP:8.704561,49.403252,8.72033,49.43373,8.736,49.401,8.7082,49.432,8.704561,49.403252")
				.queryParam("timeout", "80")
				.queryParam("groupByKeys", "foot,lanes:forward")
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
	public void test_1iun72kxw5v03_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("groupByKeys", "highway")
				.queryParam("bcircles", "tI:8.72123,49.415,98|nQhKH:8.731375,49.410,33")
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
	public void test_1ji1pofgv9f7d_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,track")
				.queryParam("filter", "sidewalk!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.666,49.41824,8.750,49.3808")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-01-10")
				.queryParam("bpolys", "8.704561,49.403252,8.7202,49.4073,8.710,49.43189,8.729,49.4224,8.704561,49.403252|8.704561,49.403252,8.7393,49.429,8.728506,49.419,8.721,49.4359,8.704561,49.403252|8.704561,49.403252,8.723,49.414,8.735,49.408,8.7455,49.4095,8.704561,49.403252")
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
	public void test_uveovaulyasx_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:relation and id:(1 .. 9999)")
				.queryParam("groupByValues", "track")
				.queryParam("bboxes", "8.6811,49.4209,8.719,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("bpolys", "ff:8.704561,49.403252,8.7247,49.4061,8.717,49.42017,8.704,49.4032,8.704561,49.403252|Q:8.704561,49.403252,8.703,49.435032,8.720,49.402,8.700,49.4345,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_vf97zvb4tf8i_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-01-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qWrIB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.4065],[8.7017,49.406],[8.748,49.432],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "69")
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
	public void test_1hv2pz8k9kl7l_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and type:node")
				.queryParam("bboxes", "YK:8.65219,49.405123,8.731,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2012-03-21")
				.queryParam("timeout", "62")
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
	public void test_rhb0vsx2si8x_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.744435,49.419,76")
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
	public void test_qxi9cqcjfd5u_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BCyqy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.435589],[8.707707,49.4168],[8.736767,49.417],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"YLExV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.432],[8.7218,49.416876],[8.72162,49.4069],[8.704561,49.403252]]]}}]}")
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
	public void test_1k25ljn3prh9x_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,dormitory,office")
				.queryParam("filter", "landuse!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "pim:8.653,49.4257,8.755,49.380184|C:8.662,49.428,8.7326,49.380|Lx:8.6646,49.406,8.745,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-12-05")
				.queryParam("timeout", "84")
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
	public void test_s4rvcu9097hv_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,hotel")
				.queryParam("filter", "type=* or geometry:line and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2016-11-08")
				.queryParam("bcircles", "8.748054,49.43360,5|8.718,49.429781,6")
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
	public void test_vbk8g6tadzck_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ftPTa:8.669,49.4049,8.74785,49.388|Dwe:8.6889,49.414347,8.7031,49.3834")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
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
	public void test_ubjni3kph3jl_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.675,49.400255,8.72095,49.397|8.694,49.4118,8.75607,49.3922")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "66")
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
	public void test_t4ncqdztvi2e_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "84")
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
	public void test_ubop1ti91c8n_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and not type:way and not area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "secondary")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-04-23")
				.queryParam("bpolys", "il:8.704561,49.403252,8.7353,49.423,8.748,49.416276,8.701692,49.406275,8.704561,49.403252|MTMxz:8.704561,49.403252,8.740,49.425,8.709,49.432796,8.7046,49.4092,8.704561,49.403252|ic:8.704561,49.403252,8.712,49.420,8.705,49.4073,8.707,49.4314,8.704561,49.403252")
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
	public void test_1h7tq57qfnckl_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2017-07-12")
				.queryParam("bcircles", "F:8.742,49.42049,6")
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
	public void test_1jy7p8oh8qnoi_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,house")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.41146,8.712,49.40010,8.700,49.4292,8.704561,49.403252|8.704561,49.403252,8.728,49.414,8.71693,49.413,8.7252,49.408,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_s18bupoaahpy_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,traffic_signals,traffic_mirror")
				.queryParam("bboxes", "KMAKp:8.6755,49.420,8.73852,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-04-17")
				.queryParam("timeout", "75")
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
	public void test_1iay5utdyzcxh_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-02-24")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "Z:8.7235,49.406,76|gz:8.70089,49.430,3")
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
	public void test_qhhtetck53qr_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* and geometry:polygon and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6637,49.410,8.746,49.388|8.695,49.427015,8.748,49.3991")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
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
	public void test_1hrgilhccp2sh_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,roof,apartments")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2016-06-24")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "Z:8.725,49.430813,6|l:8.742,49.421,8")
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
	public void test_r1l642l2k76t_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "turning_circle,commercial,pedestrian")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "HH:8.704561,49.403252,8.7155,49.4398,8.700,49.419,8.705512,49.41311,8.704561,49.403252")
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
	public void test_t4q44glv1s9t_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6806,49.4017,8.735,49.382|8.685,49.408129,8.7072,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-09-18")
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
	public void test_1jyouiw8ttzqq_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes=* or geometry:point")
				.queryParam("bboxes", "SKAqS:8.663,49.415955,8.7460,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "xpuU:8.738,49.4314,50")
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
	public void test_r1idxzpr12ye_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XpDk:8.688282,49.4245,8.7204,49.38219|fM:8.6616,49.416,8.7056,49.390")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
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
	public void test_1iepghofh1v7a_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TTGRc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.4084],[8.721,49.410],[8.70492,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "68")
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
	public void test_ure2aaap9qup_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "gzd:8.7422,49.4217,8|scyJS:8.747,49.410452,3|OMfuC:8.7466,49.432,6|lA:8.717851,49.432,57")
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
	public void test_urjkc80spely_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "wf:8.670,49.4232,8.750,49.387|Gl:8.6795,49.41843,8.703,49.39254")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("time", "2009-04-03")
				.queryParam("timeout", "20")
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
	public void test_1k1r8qp20i2xx_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and id:(1 .. 9999)")
				.queryParam("time", "2009-07-25")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "P:8.718,49.423,6|RI:8.739,49.439,4|W:8.700,49.432,24")
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
	public void test_1jeqju6ouvak7_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "heE:8.681,49.4203,8.732,49.395|mMe:8.656670,49.402,8.702963,49.3808|rqQ:8.698,49.42735,8.7165,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
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
	public void test_rhb21it6zsys_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or geometry:point")
				.queryParam("bboxes", "LRlOa:8.662981,49.405257,8.749,49.3824|QlX:8.6648,49.419,8.745,49.392|gw:8.6508,49.4288,8.746383,49.399941|ZwEM:8.67432,49.407,8.703,49.394")
				.queryParam("timeout", "93")
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
	public void test_u7r9fpdghkys_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2013-09-30")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "8.740,49.4196,2")
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
	public void test_to4jpc3zrbxt_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "W:8.7166,49.422727,269342060|xMUm:8.711,49.4264,9|oDIk:8.720,49.432491,4|c:8.731,49.400,957475595")
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
	public void test_1hux6w6pzccpv_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-12-17")
				.queryParam("bpolys", "C:8.704561,49.403252,8.715383,49.429,8.720,49.436,8.702,49.4066,8.704561,49.403252|Jsq:8.704561,49.403252,8.741,49.435,8.745,49.4103,8.70931,49.434,8.704561,49.403252")
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
	public void test_1iespt8cvk0v5_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-10-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"CVr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.427],[8.727,49.417],[8.70964,49.42521],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "68")
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
	public void test_1h7ler3w012k9_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-02-25")
				.queryParam("bpolys", "oo:8.704561,49.403252,8.7416,49.426,8.71543,49.417,8.708078,49.422,8.704561,49.403252|WQ:8.704561,49.403252,8.724,49.430,8.7337,49.4279,8.708,49.423,8.704561,49.403252|dvwxs:8.704561,49.403252,8.7459,49.4261,8.704,49.425697,8.745,49.4356,8.704561,49.403252")
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
	public void test_1h7incwyd67u8_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=*")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.724112,49.433,8.7016,49.435,8.72685,49.402,8.704561,49.403252|8.704561,49.403252,8.703806,49.4002,8.7031,49.428,8.70516,49.410,8.704561,49.403252|8.704561,49.403252,8.7001,49.421,8.7289,49.420,8.70389,49.42287,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_1iemp6oca4spw_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7247,49.43051,8.715,49.411,8.7049,49.405,8.704561,49.403252|8.704561,49.403252,8.724,49.4120,8.70451,49.434,8.702,49.427,8.704561,49.403252")
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
	public void test_vf0xx3u30xtf_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "DD:8.704561,49.403252,8.7339,49.4034,8.7044,49.423,8.7400,49.416,8.704561,49.403252|B:8.704561,49.403252,8.725,49.4055,8.708668,49.435,8.714565,49.4000,8.704561,49.403252")
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
	public void test_1je9us0f53gis_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-11-26")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "e:8.736,49.419,326")
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
	public void test_1iyc5iky760ja_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("bpolys", "HTSNf:8.704561,49.403252,8.727,49.409,8.7045,49.4002,8.704,49.434,8.704561,49.403252")
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
	public void test_s4md1krgej3l_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "fDG:8.6673,49.418,8.7288,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("timeout", "71")
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
	public void test_1h7ly89htzucl_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2013-03-07")
				.queryParam("bcircles", "Z:8.714,49.428,9")
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
	public void test_qy4gbv4kadyp_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "polygon,")
				.queryParam("values", "tertiary")
				.queryParam("time", "2018-03-02")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "85")
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
	public void test_u8e0cpjqo21w_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ILBIc:8.655,49.417,8.726446,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-05-13")
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
	public void test_1ib5zbqx5aulh_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.665,49.418,8.738,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-08-25")
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
	public void test_vey2ya3yytkl_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hh:8.68108,49.404,8.733,49.3952|qz:8.6904,49.406,8.703,49.3936|O:8.659,49.412,8.750,49.3800")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "destination!=* or geometry:line")
				.queryParam("time", "2010-05-25")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
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
	public void test_qxg0lemebgx1_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("filter2", "highway!=* or not length:( .. 100)")
				.queryParam("time", "2011-07-17")
				.queryParam("bpolys", "8.704561,49.403252,8.726,49.424,8.74049,49.4220,8.705,49.432423,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_mirror")
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
	public void test_vf9qs6rfk20g_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("filter2", "foot!=* or not id:(1 .. 9999)")
				.queryParam("time", "2009-04-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.41787],[8.734,49.4336],[8.7413,49.43130],[8.704561,49.403252]]]}}]}")
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
	public void test_soen3smmul9y_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("format", "csv")
				.queryParam("time", "2014-11-01")
				.queryParam("bpolys", "nop:8.704561,49.403252,8.74347,49.417,8.721,49.4137,8.747,49.403,8.704561,49.403252")
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
	public void test_1hrjr22gsi4px_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HAId:8.673,49.4065,8.726,49.3920")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "geojson")
				.queryParam("timeout", "68")
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
	public void test_tony4iuzgwfm_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or geometry:line and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "rtQN:8.727,49.435,4")
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
	public void test_1hv61bifspg86_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "ref=* or type:relation or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "cVfa:8.70942,49.406,879402276")
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
	public void test_tru4rdy5au78_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6716,49.417,8.717016,49.396|8.660,49.423,8.7010,49.385")
				.queryParam("types2", "node,way,relation")
				.queryParam("format", "csv")
				.queryParam("filter2", "tracktype=* and not type:relation and area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.710,49.406,8.700013,49.4181,8.713,49.4207,8.704561,49.403252|8.704561,49.403252,8.708016,49.4318,8.715,49.409,8.704,49.4196,8.704561,49.403252|8.704561,49.403252,8.71235,49.4135,8.737,49.41275,8.749,49.42592,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_qe9f9q1b6pgi_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-07-26")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "Lq:8.746425,49.430,2946567274")
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
	public void test_t841th4zered_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "fvlAK:8.6690,49.427,8.727,49.390768|ileJ:8.65417,49.410,8.718,49.385|mYNnD:8.652,49.419,8.7072,49.389")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_skk0r4cyobhx_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or id:(1 .. 9999)")
				.queryParam("bboxes", "I:8.6861,49.400872,8.731,49.3844|I:8.6563,49.40274,8.7169,49.395|f:8.694,49.4009,8.71170,49.38836|tycF:8.681,49.424,8.717,49.3944")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "addr:housenumber=* and id:(1 .. 9999)")
				.queryParam("time", "2017-09-14")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "58")
				.queryParam("values2", "emergency_access_point")
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
	public void test_sl16ka23oh2c_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and geometry:polygon")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "source:maxspeed!=* or not type:node and not length:( .. 100)")
				.queryParam("time", "2010-01-06")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "bXu:8.725,49.40527,5|iBCtL:8.732,49.423,2|FH:8.7002,49.401,91")
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
	public void test_1h7fuf3rcaoft_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("time", "2014-01-17")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "D:8.732,49.4326,9|gTI:8.739,49.412,432")
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
	public void test_1k1wpkl529aht_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and geometry:polygon or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "58")
				.queryParam("values2", "path")
				.queryParam("bcircles", "8.7120,49.40176,3|8.707941,49.405892,297|8.746,49.403,8|8.716,49.4101,71")
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
	public void test_1jeaffjl6l4xc_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "Ez:8.710653,49.417,9")
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
	public void test_1h84rztgzbr5i_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* and length:( .. 100)")
				.queryParam("types2", "node,relation")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-02-21")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "UwfUv:8.702,49.40407,6")
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
	public void test_1k1wr4r7ba981_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "62")
				.queryParam("values2", "pedestrian")
				.queryParam("bcircles", "8.749,49.423,6|8.7474,49.420,57")
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
	public void test_1h7zrjlsicqqr_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "NPa:8.6632,49.407,8.711,49.384")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,other")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "22")
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
	public void test_1jew1fqsgrvhx_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "CWqOu:8.653,49.406,8.740,49.399|kZT:8.6764,49.412,8.759,49.392|LmrYL:8.698198,49.42907,8.724,49.382|GI:8.6544,49.40380,8.704,49.3824")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "natural=wood and not area:(1.0 .. 1E6)")
				.queryParam("time", "2013-05-20")
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
	public void test_r1l6hzqdbeqr_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.684,49.4270,8.7508,49.385|8.693,49.418791,8.702,49.385|8.68175,49.4160,8.738107,49.386|8.672,49.41615,8.740,49.3803")
				.queryParam("types2", "node,way,relation")
				.queryParam("timeout", "41")
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
	public void test_toigwzhiqov9_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-09-02")
				.queryParam("bpolys", "u:8.704561,49.403252,8.708,49.422007,8.718782,49.415132,8.700845,49.438,8.704561,49.403252|Efi:8.704561,49.403252,8.709,49.426,8.708143,49.438,8.7479,49.4275,8.704561,49.403252|z:8.704561,49.403252,8.7361,49.43453,8.72379,49.423664,8.7329,49.433411,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_1h7z84uxrh5is_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("filter2", "surface=* or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.714,49.431,8.7216,49.40577,8.713,49.438,8.704561,49.403252|8.704561,49.403252,8.717394,49.402,8.7367,49.425,8.74701,49.434,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "44")
				.queryParam("values2", "footway")
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
	public void test_s4v5wse2342r_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or not geometry:point")
				.queryParam("bboxes", "8.6690,49.4113,8.754,49.382|8.685,49.4012,8.759,49.3985")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("filter2", "network=* or not type:node")
				.queryParam("time", "2014-08-03")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "62")
				.queryParam("values2", "steps")
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
	public void test_urrxjo5xz42u_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "node,way,relation")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-07-17")
				.queryParam("bpolys", "f:8.704561,49.403252,8.7361,49.431,8.74811,49.422,8.705,49.405,8.704561,49.403252|YBDbE:8.704561,49.403252,8.722168,49.4247,8.7148,49.4285,8.727,49.424,8.704561,49.403252|BJM:8.704561,49.403252,8.703,49.434,8.7024,49.4284,8.704638,49.411,8.704561,49.403252")
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
	public void test_1hb878nlfry9j_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "VBTma:8.704561,49.403252,8.7384,49.403,8.742,49.401,8.724,49.410,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "47")
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
	public void test_1jetcpl2aim2c_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=* and length:( .. 100)")
				.queryParam("types2", "line,polygon,")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-07-03")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "y:8.741,49.414,4|G:8.7050,49.4097,8|QnUOM:8.700,49.437719,8|jJq:8.733,49.4056,8")
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
	public void test_s4sci70l7crm_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("filter2", "maxspeed!=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("time", "2009-09-18")
				.queryParam("keys2", "highway")
				.queryParam("values2", "platform")
				.queryParam("bcircles", "A:8.747,49.4156,76")
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
	public void test_1iycps88e9roh_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.688,49.42956,8.7546,49.3972|8.692505,49.4261,8.7280,49.393")
				.queryParam("format", "json")
				.queryParam("filter2", "surface!=* or not length:( .. 100)")
				.queryParam("time", "2008-01-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"eZC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.412],[8.704,49.404],[8.704,49.439],[8.704561,49.403252]]]}}]}")
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
	public void test_1hbljt2qaz7zq_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("bcircles", "8.742,49.429,3")
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
	public void test_1jefz1zisxfzl_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6992,49.404,8.719,49.399")
				.queryParam("time", "2017-11-11")
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
	public void test_u87yvhchbi2e_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.657,49.428940,8.7474,49.3951")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,other")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2010-08-04")
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
	public void test_sof3vbu5q4bm_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway or geometry:line and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2015-07-10")
				.queryParam("bpolys", "aLa:8.704561,49.403252,8.7391,49.4179,8.707,49.419,8.700,49.405388,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "41")
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
	public void test_1ies7k2sz77zt_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.65877,49.408,8.738,49.39099")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("time", "2012-07-14")
				.queryParam("timeout", "99")
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
	public void test_trz4f4vg4m5z_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.693020,49.415,8.7417,49.38956")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_1je9xwb9599i9_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.654,49.41812,8.717636,49.384|8.659,49.40296,8.707,49.390|8.688,49.412,8.756,49.392|8.677,49.402,8.756,49.385")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "emergency_access_point")
				.queryParam("timeout", "92")
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
	public void test_vf961tq54pio_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* and id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("filter2", "tracktype=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "70")
				.queryParam("values2", "track")
				.queryParam("bcircles", "e:8.737,49.428,9")
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
	public void test_soppf7ouyt0m_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-01-22")
				.queryParam("bpolys", "DkAdZ:8.704561,49.403252,8.716668,49.423,8.707,49.405,8.70381,49.42502,8.704561,49.403252|x:8.704561,49.403252,8.749,49.404781,8.707000,49.415135,8.704,49.4131,8.704561,49.403252|VZh:8.704561,49.403252,8.704,49.4167,8.713,49.4171,8.739,49.436,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "77")
				.queryParam("values2", "traffic_signals")
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
	public void test_rl02fzjvvqzp_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or geometry:line or area:(1.0 .. 1E6)")
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
	public void test_s4rvd24cui44_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or area:(1.0 .. 1E6)")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "U:8.748,49.4146,6|HgvIu:8.7256,49.411,50|PdsZ:8.7194,49.4209,2|tu:8.743,49.403,540")
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
	public void test_to7e7jb00bw5_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P6M27D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.42514],[8.728,49.4021],[8.701,49.431],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71171,49.4216],[8.746,49.412],[8.70481,49.420],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"gXwgT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.411],[8.708,49.4399],[8.7047,49.4297],[8.704561,49.403252]]]}}]}")
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
	public void test_1hrs2009fl2d1_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hhW:8.693,49.401896,8.73427,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("timeout", "41")
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
	public void test_ubmdn2c978td_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "IV:8.7270,49.432,7|VKs:8.7222,49.418,9|a:8.717,49.4059,135685769326|v:8.7198,49.439,836")
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
	public void test_1ibh21cny4cae_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Y:8.689,49.421,8.705,49.3938|S:8.6714,49.410,8.719,49.395")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "92")
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
	public void test_1ieyaj1d426nr_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "RP:8.657068,49.4255,8.7073,49.381|a:8.693768,49.406,8.7435,49.38495|iv:8.693,49.40050,8.707,49.394|JcDfL:8.697158,49.406,8.712,49.384031")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
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
	public void test_1iyqld8qi555u_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "FXpNK:8.744587,49.400,45")
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
	public void test_qxwmgv8gtlbo_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and type:relation")
				.queryParam("bboxes", "8.696,49.426,8.754864,49.384")
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
	public void test_rhm4fm7811dj_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.662,49.4291,8.72805,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("time", "//P2Y27D")
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
	public void test_s13c3keqyyqs_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "p:8.662,49.41463,8.731,49.398|g:8.6843,49.412,8.7121,49.3818")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("bpolys", "O:8.704561,49.403252,8.707,49.431,8.713,49.4267,8.70333,49.43421,8.704561,49.403252|FbN:8.704561,49.403252,8.714,49.4307,8.70452,49.402,8.709,49.427,8.704561,49.403252")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "I:8.716,49.414,3")
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
	public void test_rl2cacct2tyq_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "8.714812,49.430,50")
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
	public void test_u7zl7wpvdzck_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.710975,49.414,72")
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
	public void test_1hux646h8us6o_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P7M4D")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "8.720689,49.414,87|8.7208,49.410,9|8.7366,49.410761,2|8.726812,49.4394,7330359472")
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
	public void test_u87zkytmndww_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P26D")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "8.709,49.413,6|8.732,49.418,33")
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
	public void test_1h7wjerlm6wrm_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "8.701,49.431,2|8.721,49.408,8|8.738,49.437,768")
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
	public void test_1if11wy1huj3k_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P8M4D")
				.queryParam("bcircles", "Xxwjf:8.74379,49.407,2")
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
	public void test_rhufr9ostcmo_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("time", "//P9D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.43657],[8.7043,49.4213],[8.729,49.4244],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7108,49.424692],[8.7017,49.411],[8.721,49.415746],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.433089],[8.7033,49.41749],[8.704453,49.414],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "59")
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
	public void test_t8427emzt0ds_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and geometry:line or id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y22D")
				.queryParam("bpolys", "8.704561,49.403252,8.71380,49.411,8.704,49.43748,8.717,49.420,8.704561,49.403252|8.704561,49.403252,8.701,49.405533,8.70182,49.413,8.748,49.4254,8.704561,49.403252|8.704561,49.403252,8.722,49.415,8.70440,49.400,8.733056,49.4199,8.704561,49.403252")
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
	public void test_t4vp8i9nkuar_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.7345,49.412,93|8.735,49.410,2")
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
	public void test_tnzjpgcsku9h_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* and not length:( .. 100)")
				.queryParam("bboxes", "BmC:8.678,49.4006,8.75228,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P5M26D")
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
	public void test_vf0wonazab08_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "cws:8.72631,49.416,5")
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
	public void test_1ji7asbkm18a9_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.7173,49.428,8.70474,49.405,8.744,49.400,8.704561,49.403252|8.704561,49.403252,8.732,49.427,8.728,49.4028,8.7094,49.43831,8.704561,49.403252|8.704561,49.403252,8.7138,49.400,8.72166,49.4024,8.707,49.439,8.704561,49.403252")
				.queryParam("timeout", "35")
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
	public void test_1ji1po97khowz_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73367,49.414],[8.708,49.4059],[8.707,49.427],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74894,49.407325],[8.702744,49.400],[8.7424,49.4120],[8.704561,49.403252]]]}}]}")
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
	public void test_1iev0fng7zmg5_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y8M5D")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "MK:8.733595,49.406,8")
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
	public void test_1huzyzt56j776_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "hO:8.709,49.410,73")
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
	public void test_1iuvh81hlwd9w_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "AO:8.704561,49.403252,8.70419,49.40136,8.703193,49.402,8.7048,49.41805,8.704561,49.403252|V:8.704561,49.403252,8.743013,49.438,8.70760,49.418,8.7049,49.430,8.704561,49.403252|Mzm:8.704561,49.403252,8.708,49.431,8.719,49.409,8.704,49.422,8.704561,49.403252")
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
	public void test_1iyc7s8hzt7q9_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.714,49.427,32")
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
	public void test_soq66kz47ry0_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "U:8.6705,49.41217,8.737,49.3943|Jxpxx:8.6897,49.40044,8.7219,49.39173")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y22D")
				.queryParam("timeout", "25")
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
	public void test_1jewkgehy1h6g_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "DsQzG:8.71859,49.416,3|jMY:8.7446,49.433,11")
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
	public void test_1hv2ofc0ihdmh_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("bpolys", "V:8.704561,49.403252,8.731,49.4150,8.748,49.413,8.732,49.41548,8.704561,49.403252")
				.queryParam("bcircles", "VDPaW:8.727,49.4324,98")
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
	public void test_1h85b3fqqdd9h_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Db\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.414520],[8.7034,49.433],[8.730,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "42")
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
	public void test_1jy4yk1efteex_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "//P7M3D")
				.queryParam("bpolys", "8.704561,49.403252,8.7022,49.408,8.705,49.429,8.709,49.4086,8.704561,49.403252|8.704561,49.403252,8.7045,49.432,8.7446,49.4309,8.711,49.436,8.704561,49.403252")
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
	public void test_1h7wj0k6s7qya_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"N\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.411995],[8.702,49.43495],[8.7028,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "63")
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
	public void test_skn9ogjbwq45_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "//P1M19D")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "c:8.7435,49.406325,8")
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
	public void test_1iv73f0r712d1_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:node or not length:( .. 100)")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "Ov:8.703,49.4248,59|KP:8.705,49.429848,6|Dzx:8.73369,49.430,1|YJOcb:8.7329,49.4175,69464884965")
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
	public void test_ure1yk21den5_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.420,8.7029,49.41488,8.747,49.4328,8.704561,49.403252")
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
	public void test_qy4edhmnvmt5_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P5M12D")
				.queryParam("bcircles", "Ky:8.72608,49.412,138|kHEjr:8.73364,49.403,7|PBR:8.708290,49.4378,94|uX:8.7061,49.410,8")
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
	public void test_1ibbzy88cn7zm_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "U:8.69100,49.4177,8.712,49.385|ulGBD:8.686,49.4174,8.743,49.398")
				.queryParam("timeout", "49")
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
	public void test_1h84v6uy8tjdv_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* or type:way")
				.queryParam("format", "json")
				.queryParam("time", "//P3Y5M1D")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "I:8.72903,49.41233,6|i:8.7351,49.410,5")
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
	public void test_qhibnks51kjb_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "rA:8.704561,49.403252,8.703,49.4240,8.70415,49.433,8.7108,49.412802,8.704561,49.403252|XtbdQ:8.704561,49.403252,8.7385,49.404,8.724,49.438,8.736,49.43216,8.704561,49.403252|uZiK:8.704561,49.403252,8.700639,49.411,8.706,49.436,8.704561,49.430,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_tog6qqry0u2f_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "A:8.715,49.436,2")
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
	public void test_trrcl2tnnlgl_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Gi:8.6730,49.407264,8.719,49.384|Fi:8.67036,49.400425,8.737,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_urjn01b1bx2q_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and id:(1 .. 9999)")
				.queryParam("time", "//P2M13D")
				.queryParam("bcircles", "8.717,49.4025,6|8.718,49.411,9|8.707985,49.426,4|8.744298,49.415,9")
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
	public void test_to2bsmolftbm_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("time", "//P3Y11D")
				.queryParam("bcircles", "cPMYk:8.729,49.410,92")
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
	public void test_vf462dtott0z_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LkLc:8.683,49.417,8.745,49.38719|P:8.664,49.40309,8.732,49.39102")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_vbhdyd3akvvn_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* or type:relation and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XfvgX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723,49.433685],[8.7076,49.401],[8.70436,49.423],[8.704561,49.403252]]]}}]}")
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
	public void test_u7ru5qypt9v4_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "S:8.691,49.4085,8.731,49.396")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_us09n7y9dq2f_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* or length:( .. 100)")
				.queryParam("time", "//P10M25D")
				.queryParam("bcircles", "NeR:8.717,49.4235,9")
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
	public void test_1hrgy6xkeo6li_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=*")
				.queryParam("bboxes", "TljGB:8.684,49.4056,8.707,49.397")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1Y11M9D")
				.queryParam("timeout", "91")
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
	public void test_qdvke9b9hq9f_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or not type:node")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"RHGl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72595,49.401],[8.715,49.406588],[8.708,49.412],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "eFpV:8.705,49.413,3|nT:8.725,49.4388,4|acGDI:8.702672,49.410,3|e:8.71625,49.400,52")
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
	public void test_us06ivhpwshc_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "//P6M2D")
				.queryParam("bcircles", "HylR:8.7258,49.4062,3")
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
	public void test_qhvm9se58jtu_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=*")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y4D")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "8.703,49.42709,4")
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
	public void test_toigwplhj8dw_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.7475,49.4131,8.7020,49.438,8.706,49.415,8.704561,49.403252|8.704561,49.403252,8.742,49.420,8.712,49.433,8.706,49.436,8.704561,49.403252|8.704561,49.403252,8.708583,49.435,8.720781,49.4301,8.71955,49.429,8.704561,49.403252")
				.queryParam("timeout", "60")
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
	public void test_1ji4zdqb5eiih_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or length:( .. 100)")
				.queryParam("time", "//P1Y28D")
				.queryParam("bpolys", "BgAw:8.704561,49.403252,8.746,49.402,8.7041,49.43577,8.732,49.42696,8.704561,49.403252|BgfrZ:8.704561,49.403252,8.7027,49.403,8.7265,49.4272,8.702,49.436,8.704561,49.403252|N:8.704561,49.403252,8.7093,49.439,8.74878,49.430,8.7364,49.438,8.704561,49.403252")
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
	public void test_1ji7rmbkl5vsn_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and not id:(1 .. 9999)")
				.queryParam("bboxes", "mhq:8.671,49.427,8.7014,49.382")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
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
	public void test_trqvigqoo2sw_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "OSlLy:8.6858,49.40584,8.719,49.388|a:8.6552,49.420,8.7435,49.384")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y9M21D")
				.queryParam("timeout", "47")
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
	public void test_rh89hitmk9k5_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P9M19D")
				.queryParam("bcircles", "SjqM:8.724,49.40993,2|Bo:8.732,49.41547,3|G:8.707216,49.4204,4")
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
	public void test_1jefzd80x2ek1_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y1M1D")
				.queryParam("bpolys", "ypTld:8.704561,49.403252,8.714,49.404,8.741,49.4237,8.712609,49.425,8.704561,49.403252")
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
	public void test_u7zlltwhwi7k_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.658019,49.404,8.700,49.39627")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("timeout", "30")
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
	public void test_u82xkn161xdl_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,garage,give_way")
				.queryParam("filter", "sidewalk=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.699164,49.4136,8.739,49.3995")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1M27D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NoRLx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.428],[8.74693,49.4275],[8.723,49.407],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "45")
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
	public void test_1jicu0sciwxmb_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name!=* and geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "residential")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P7D")
				.queryParam("bpolys", "B:8.704561,49.403252,8.723,49.418,8.7283,49.405,8.70849,49.4233,8.704561,49.403252|kD:8.704561,49.403252,8.7298,49.432001,8.70738,49.4388,8.70127,49.421,8.704561,49.403252|Ov:8.704561,49.403252,8.731,49.43388,8.705723,49.416,8.703793,49.433516,8.704561,49.403252")
				.queryParam("bcircles", "8.7040,49.438,8")
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
	public void test_1jeaftiq0fpt1_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,garage")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3M16D")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "kh:8.719550,49.4149,8")
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
	public void test_1jiai7ygw9rhd_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,give_way")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "8.7350,49.4041,2")
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
	public void test_urmur2nyya8x_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UM:8.6822,49.416,8.733042,49.382|Me:8.681,49.415,8.735244,49.386|okE:8.6717,49.420,8.709,49.39807|y:8.656089,49.421,8.7041,49.397063")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P3D")
				.queryParam("timeout", "50")
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
	public void test_sobrr9msel46_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,public,secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y2M1D")
				.queryParam("bpolys", "dHo:8.704561,49.403252,8.739,49.4014,8.708,49.433043,8.717,49.421,8.704561,49.403252|t:8.704561,49.403252,8.717,49.436430,8.7172,49.4048,8.7139,49.415,8.704561,49.403252")
				.queryParam("timeout", "80")
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
	public void test_1jy4zc9iium29_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,station")
				.queryParam("filter", "barrier!=* or geometry:polygon")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y2M17D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7360,49.429],[8.74666,49.439],[8.709,49.419],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "79")
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
	public void test_1jicqtnb0g3ty_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "f:8.6720,49.422,8.743,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
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
	public void test_1h7rhseyl4oqa_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,station,dormitory")
				.queryParam("filter", "sidewalk=*")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P3Y6D")
				.queryParam("bpolys", "U:8.704561,49.403252,8.717,49.4324,8.70459,49.4309,8.747,49.4212,8.704561,49.403252|XH:8.704561,49.403252,8.715,49.41914,8.7471,49.43726,8.7081,49.4184,8.704561,49.403252|B:8.704561,49.403252,8.7118,49.409,8.742,49.42267,8.723,49.41476,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_qe1l3fqsleev_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "civic,stop_line,construction")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P7M27D")
				.queryParam("bpolys", "u:8.704561,49.403252,8.74105,49.4085,8.7113,49.406,8.727,49.430,8.704561,49.403252")
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
	public void test_soq6kud0zdra_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,ship,traffic_mirror")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y7M7D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"CwDjd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.432],[8.749708,49.404],[8.704561,49.420],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"bE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73329,49.403],[8.747,49.43818],[8.70709,49.428],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"eY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.431],[8.733,49.409],[8.7177,49.415],[8.704561,49.403252]]]}}]}")
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
	public void test_1iuvgrjlwxaw3_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=*")
				.queryParam("groupByValues", "path")
				.queryParam("bboxes", "8.663,49.4178,8.713,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "E:8.744,49.4006,5")
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
	public void test_qxtcrtxf03ty_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6550,49.419,8.722,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
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
	public void test_ts56aixl7dbo_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "fZYq:8.72303,49.4256,7")
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
	public void test_1h7wzg7zamkbo_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6636,49.418,8.734901,49.392|8.688,49.417,8.756,49.3956")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "99")
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
	public void test_qdvj5hced7q9_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,demolished,tertiary")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bcircles", "cxT:8.7033,49.408757,7|x:8.72363,49.402,59")
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
	public void test_us0q0sdg7dy9_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "8.737,49.403,3|8.716,49.4225,6|8.7336,49.43004,6")
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
	public void test_1hvbkeq63vdk1_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P11M11D")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "8.724,49.406,7")
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
	public void test_1jetar9mp1ieb_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,crossing")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "tWfJ:8.704561,49.403252,8.71090,49.4317,8.7158,49.4048,8.7064,49.401,8.704561,49.403252|zEqqs:8.704561,49.403252,8.7309,49.41486,8.726,49.424,8.7381,49.4053,8.704561,49.403252|G:8.704561,49.403252,8.7071,49.406,8.7015,49.4159,8.720,49.410,8.704561,49.403252")
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
	public void test_qhtcvtg2wrht_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "turning_circle,chapel")
				.queryParam("bboxes", "RG:8.666,49.4281,8.72830,49.397|wpHyb:8.65279,49.418,8.7199,49.3968|lRGJ:8.668,49.411187,8.7410,49.396|h:8.668,49.406,8.724,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P1Y7D")
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
	public void test_to52371s5jy0_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Z:8.681,49.4106,8.75786,49.394|w:8.68064,49.40668,8.70336,49.3855|W:8.6549,49.410780,8.713,49.3989")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "f:8.704561,49.403252,8.735,49.430130,8.70415,49.42609,8.704569,49.4000,8.704561,49.403252|OHI:8.704561,49.403252,8.741,49.405,8.710,49.409,8.708,49.406,8.704561,49.403252|oaKAm:8.704561,49.403252,8.714,49.421,8.720,49.409,8.722,49.407,8.704561,49.403252")
				.queryParam("bcircles", "8.722,49.4070,6|8.743629,49.43189,17")
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
	public void test_r1id5v64rlfc_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "xOUWt:8.67550,49.4163,8.7365,49.386|Bgl:8.6760,49.411,8.72706,49.381|PzJYk:8.6975,49.41606,8.7049,49.392|b:8.699,49.416806,8.701,49.387365")
				.queryParam("format", "geojson")
				.queryParam("timeout", "41")
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
	public void test_1ib37ha07qkbn_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "f:8.6938,49.422189,8.7181,49.3845")
				.queryParam("format", "json")
				.queryParam("time", "//P1M8D")
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
	public void test_1jyjaz2983tq0_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or geometry:line and length:( .. 100)")
				.queryParam("bboxes", "VgepW:8.691,49.402,8.722,49.397147|dnL:8.662487,49.4076,8.74760,49.3967")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3M4D")
				.queryParam("timeout", "90")
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
	public void test_sl6o5u8zs9pu_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or length:( .. 100)")
				.queryParam("bboxes", "IuJ:8.680,49.424,8.720,49.386")
				.queryParam("format", "json")
				.queryParam("time", "//P9M6D")
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
	public void test_1hrm0lcrgp36q_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "z:8.663,49.422,8.709,49.3937|db:8.654,49.427,8.747,49.39263")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "58")
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
	public void test_1huzzdu91nos2_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or geometry:line")
				.queryParam("bpolys", "8.704561,49.403252,8.748,49.408,8.736,49.435,8.700,49.435,8.704561,49.403252|8.704561,49.403252,8.739,49.436955,8.7043,49.415556,8.73272,49.4150,8.704561,49.403252|8.704561,49.403252,8.7050,49.41818,8.7135,49.4188,8.7078,49.402,8.704561,49.403252")
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
	public void test_1jyiuzkx966nr_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "8.736,49.436,5|8.74378,49.409888,83|8.707,49.413232,4")
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
	public void test_1hbiq5frmxj5e_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P12D")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.414,8.712,49.4230,8.7258,49.435,8.704561,49.403252|8.704561,49.403252,8.726902,49.427,8.7047,49.417,8.717813,49.436361,8.704561,49.403252|8.704561,49.403252,8.718,49.413,8.70299,49.41914,8.7042,49.42809,8.704561,49.403252")
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
	public void test_qdvh7p8qd7j5_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P2Y2M20D")
				.queryParam("bpolys", "8.704561,49.403252,8.729,49.4370,8.732,49.439,8.7122,49.40147,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_u7p1j4m94up1_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1Y7D")
				.queryParam("timeout", "77")
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
	public void test_vbq7zhqzggv5_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or not area:(1.0 .. 1E6)")
				.queryParam("time", "//P1Y27D")
				.queryParam("bcircles", "esyAF:8.7105,49.426,9")
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
	public void test_1hrj7yxyl54c8_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "TX:8.6683,49.425,8.715,49.3849|TAOV:8.698,49.4096,8.7290,49.386|Dd:8.663,49.41410,8.716,49.382|DaM:8.68176,49.4069,8.726113,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
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
	public void test_qeew0l78fzn6_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=*")
				.queryParam("format", "json")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "8.747,49.4358,2|8.707,49.42859,5")
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
	public void test_uvbfk71y1b1u_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bcircles", "8.731,49.406,6")
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
	public void test_1jyodu0zymcs8_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.71428,49.424422,64")
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
	public void test_qhhrs4ie6hbr_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.659,49.419,8.74423,49.390|8.652,49.408,8.710740,49.3971|8.659,49.4074,8.723,49.3881")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("timeout", "75")
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
	public void test_tonxq3l3k6cw_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "V:8.677,49.407,8.744,49.385|Sfdvw:8.681774,49.412446,8.742,49.380|RN:8.660,49.4266,8.722,49.381|sL:8.6658,49.4216,8.7039,49.38705")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "28")
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
	public void test_1h7oou1yr8j07_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "J:8.704561,49.403252,8.740,49.426,8.713,49.400,8.702,49.438,8.704561,49.403252")
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
	public void test_rkzlais10abb_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and type:relation and not id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("time", "//P2Y2M28D")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "8.711,49.4338,9|8.735,49.407,63|8.727,49.43220,3|8.719,49.418,1")
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
	public void test_1je9x4fca4w2s_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or length:( .. 100)")
				.queryParam("bboxes", "z:8.678,49.408,8.756,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "GoU:8.7323,49.400,799328731")
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
	public void test_1iavf8zbnvvow_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and not type:relation or id:(1 .. 9999)")
				.queryParam("bboxes", "nA:8.694,49.4213,8.722344,49.386")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "48")
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
	public void test_s4unzfcarh2o_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or geometry:line")
				.queryParam("bboxes", "8.6533,49.419,8.748,49.391")
				.queryParam("time", "//P1Y10D")
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
	public void test_qecnt1gr2b74_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:way or length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.728,49.4206,8.701,49.431,8.717,49.419170,8.704561,49.403252|8.704561,49.403252,8.7002,49.4132,8.70038,49.403,8.738,49.407238,8.704561,49.403252|8.704561,49.403252,8.729,49.430,8.729,49.402,8.709988,49.415464,8.704561,49.403252")
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
	public void test_1jyd9hzk4aq0p_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "MNJ:8.704561,49.403252,8.7335,49.4342,8.722,49.434901,8.701,49.438,8.704561,49.403252")
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
	public void test_1iun549ggk5dl_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("bcircles", "8.7145,49.4092,6")
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
	public void test_s4mu6zv20t2x_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or not id:(1 .. 9999)")
				.queryParam("time", "//P11M17D")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "8.72865,49.4050,7|8.7076,49.434,9")
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
	public void test_rh7qeacjkk84_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "//P10M18D")
				.queryParam("bpolys", "ea:8.704561,49.403252,8.70775,49.4397,8.708,49.41813,8.708,49.43480,8.704561,49.403252|SQD:8.704561,49.403252,8.726,49.400,8.70465,49.402,8.749,49.414,8.704561,49.403252|F:8.704561,49.403252,8.7229,49.421634,8.7070,49.437,8.704,49.419,8.704561,49.403252")
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
	public void test_t4ndwx597ntw_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "8.7125,49.428,3")
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
	public void test_rhgmd8qzxfmu_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y1M27D")
				.queryParam("bpolys", "8.704561,49.403252,8.74262,49.401041,8.741,49.438,8.704,49.420,8.704561,49.403252|8.704561,49.403252,8.720052,49.430,8.704536,49.41345,8.7086,49.4386,8.704561,49.403252|8.704561,49.403252,8.72459,49.434,8.736,49.433153,8.748,49.439,8.704561,49.403252")
				.queryParam("timeout", "76")
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
	public void test_t8fq0zhxbs6b_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y2M2D")
				.queryParam("bpolys", "bmVc:8.704561,49.403252,8.7003,49.437947,8.7047,49.404859,8.7206,49.414,8.704561,49.403252|AUkp:8.704561,49.403252,8.7007,49.414,8.739,49.43943,8.705,49.4379,8.704561,49.403252|cslu:8.704561,49.403252,8.737,49.41144,8.7042,49.408,8.713,49.427,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_sl90a4t4kfoj_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("bpolys", "IPy:8.704561,49.403252,8.746,49.411,8.7376,49.4373,8.70453,49.4282,8.704561,49.403252")
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
	public void test_1h7x08ds350s8_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "p:8.7148,49.413,40|fp:8.701,49.42632,41|MTlrq:8.740,49.403,10")
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
	public void test_1jifk5v26dyzp_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "//P1M7D")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "S:8.726,49.414,2|I:8.702,49.405,4|pM:8.728,49.42478,8")
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
	public void test_uv95e9vqi6au_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "ILi:8.704561,49.403252,8.713,49.411,8.703339,49.40232,8.704,49.433,8.704561,49.403252|S:8.704561,49.403252,8.713,49.4341,8.70438,49.434,8.749,49.404,8.704561,49.403252|LRA:8.704561,49.403252,8.709391,49.409,8.744,49.435,8.744,49.407,8.704561,49.403252")
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
	public void test_1hrmjoqsvy6uv_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "//P6M26D")
				.queryParam("bpolys", "8.704561,49.403252,8.74015,49.412,8.748,49.435,8.704,49.408,8.704561,49.403252|8.704561,49.403252,8.737,49.439,8.703,49.4239,8.748,49.419,8.704561,49.403252|8.704561,49.403252,8.7155,49.434625,8.713015,49.4190,8.70456,49.4281,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_1k229wh0abaeb_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "N:8.671828,49.4231,8.7144,49.3882")
				.queryParam("showMetadata", "yes")
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
	public void test_u8aqks2j7ltj_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* and type:node and not area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y9M2D")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.719231,49.428,7")
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
	public void test_vf6xu41secs5_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "y:8.657,49.403682,8.7203,49.386|q:8.6851,49.427760,8.7525,49.3812")
				.queryParam("timeout", "32")
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
	public void test_qhnt98szdmb9_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("bpolys", "ta:8.704561,49.403252,8.7100,49.4143,8.7030,49.4162,8.707,49.423,8.704561,49.403252|Z:8.704561,49.403252,8.7251,49.401,8.731208,49.42427,8.743258,49.424,8.704561,49.403252|TlIn:8.704561,49.403252,8.7166,49.4339,8.723,49.415,8.710,49.436,8.704561,49.403252")
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
	public void test_1iukefqb5ne40_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P11M4D")
				.queryParam("timeout", "47")
				.queryParam("groupByKeys", "foot,addr:country")
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
	public void test_vb41pil323xg_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P14D")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "8.733698,49.417,88|8.7480,49.4172,9")
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
	public void test_sl8x5xz2lmpe_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* or type:way and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "GKT:8.704561,49.403252,8.747,49.429970,8.719,49.400,8.70442,49.4316,8.704561,49.403252|dUY:8.704561,49.403252,8.748,49.435,8.723,49.402,8.739,49.432,8.704561,49.403252")
				.queryParam("timeout", "81")
				.queryParam("groupByKeys", "lit,lanes:backward,sidewalk")
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
	public void test_1hre7iiqrjlfb_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650648,49.416690,8.721395,49.386|8.682,49.411,8.7044,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("time", "//P5M3D")
				.queryParam("groupByKeys", "smoothness,sidewalk,barrier")
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
	public void test_1hrj8fbwty050_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6977,49.404,8.7551,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "89")
				.queryParam("groupByKeys", "maxspeed,building")
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
	public void test_qe1k8qfnrewp_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("groupByKeys", "surface,sidewalk")
				.queryParam("bcircles", "m:8.7047,49.427,5|lEvc:8.703,49.4099,8|avI:8.74344,49.423,6|Zh:8.733,49.413,934633767")
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
	public void test_r1a4970b3n8m_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("bpolys", "IAJ:8.704561,49.403252,8.71413,49.43802,8.70475,49.416,8.72478,49.404,8.704561,49.403252|i:8.704561,49.403252,8.713,49.413,8.736,49.428153,8.70468,49.4355,8.704561,49.403252|Wc:8.704561,49.403252,8.736,49.43070,8.74956,49.4358,8.70990,49.417,8.704561,49.403252")
				.queryParam("groupByKeys", "destination")
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
	public void test_1iexrtdu55aoy_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or geometry:polygon")
				.queryParam("bboxes", "f:8.671,49.407,8.708,49.3905|tRF:8.6991,49.4087,8.7204,49.3950")
				.queryParam("timeout", "44")
				.queryParam("groupByKeys", "addr:postcode,sidewalk")
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
	public void test_1iv6m6vdb9f1i_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Vj:8.6670,49.403,8.7434,49.390")
				.queryParam("keys", "highway")
				.queryParam("timeout", "66")
				.queryParam("groupByKeys", "addr:country,smoothness")
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
	public void test_1k1zkj0co17p4_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "//P28D")
				.queryParam("timeout", "30")
				.queryParam("groupByKeys", "foot,addr:street,smoothness")
				.queryParam("bcircles", "8.709,49.4225,4")
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
	public void test_rkwr910yq910_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "//P2Y2M10D")
				.queryParam("timeout", "48")
				.queryParam("groupByKeys", "addr:housenumber,lanes:backward,lanes")
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
	public void test_1jy7py5zg2xye_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=*")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("timeout", "60")
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
	public void test_1jyitib41t9o3_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("time", "//P2M20D")
				.queryParam("bpolys", "8.704561,49.403252,8.74225,49.4259,8.71165,49.431,8.704,49.42983,8.704561,49.403252|8.704561,49.403252,8.727,49.407,8.719,49.421,8.707,49.423921,8.704561,49.403252")
				.queryParam("groupByKeys", "network,type,lanes:forward")
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
	public void test_ubry1mh27mls_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("time", "//P7M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.707917,49.42540,8.708,49.40687,8.7053,49.410,8.704561,49.403252")
				.queryParam("timeout", "44")
				.queryParam("groupByKeys", "smoothness,turn,network")
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
	public void test_toa4t1v3r60h_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "//P2M24D")
				.queryParam("bpolys", "TLHeu:8.704561,49.403252,8.735,49.4088,8.7194,49.438,8.707,49.4381,8.704561,49.403252|DaZ:8.704561,49.403252,8.735,49.429504,8.702,49.431,8.70724,49.418061,8.704561,49.403252")
				.queryParam("groupByKeys", "source:maxspeed,destination,addr:housenumber")
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
	public void test_qy4f2z5f1id2_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or area:(1.0 .. 1E6)")
				.queryParam("time", "//P3Y9D")
				.queryParam("groupByKeys", "lanes,foot,turn:lanes")
				.queryParam("bcircles", "8.739,49.4182,7|8.747,49.424,6")
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
	public void test_vbng4xlgoroy_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or not type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "8.6682,49.426,8.701122,49.386|8.691,49.422074,8.748849,49.397")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "83")
				.queryParam("groupByKeys", "building,type")
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
	public void test_1ib35x5kadf1f_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P10M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.731667,49.4330,8.745,49.400,8.71823,49.436,8.704561,49.403252|8.704561,49.403252,8.726,49.4018,8.704526,49.405,8.728,49.438,8.704561,49.403252|8.704561,49.403252,8.72991,49.4110,8.703,49.412,8.724,49.401,8.704561,49.403252")
				.queryParam("timeout", "77")
				.queryParam("groupByKeys", "smoothness,landuse")
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
	public void test_vbbvi41x1qur_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* or area:(1.0 .. 1E6)")
				.queryParam("time", "//P3Y2D")
				.queryParam("bpolys", "SN:8.704561,49.403252,8.7142,49.4028,8.7233,49.41186,8.719,49.4297,8.704561,49.403252|mx:8.704561,49.403252,8.723,49.421,8.74364,49.408,8.7312,49.402,8.704561,49.403252|JlkYy:8.704561,49.403252,8.736,49.436,8.708,49.412,8.7290,49.4381,8.704561,49.403252")
				.queryParam("groupByKeys", "lit,addr:postcode,addr:city")
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
	public void test_qxirzqr1nrqr_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "mbnHm:8.6701,49.414464,8.711536,49.3850|p:8.65230,49.4074,8.705,49.392")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "75")
				.queryParam("groupByKeys", "bicycle,foot")
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
	public void test_ts57j6yxygj4_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6812,49.417,8.7449,49.3860|8.6545,49.4006,8.719,49.38359|8.653387,49.402,8.7429,49.394|8.655,49.4141,8.740,49.3908")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "//P2Y1D")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "8.733,49.4342,714135295450|8.719,49.4099,9|8.732,49.4319,8|8.71740,49.41623,7")
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
	public void test_1jetsouw86zqb_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and not length:( .. 100)")
				.queryParam("bboxes", "BXvGQ:8.693,49.404,8.702,49.39528|j:8.654,49.4211,8.7423,49.388|qWKra:8.650,49.418,8.725,49.386")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("time", "//P3D")
				.queryParam("bpolys", "yU:8.704561,49.403252,8.738,49.4363,8.706,49.435820,8.749,49.4251,8.704561,49.403252")
				.queryParam("timeout", "99")
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
	public void test_r17u0jjd9d11_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "turning_circle,bus_stop")
				.queryParam("filter", "turn=* or geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"r\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.403],[8.70456,49.4007],[8.748,49.417],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.40775],[8.7045,49.4386],[8.707,49.408],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"n\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.423],[8.749,49.437],[8.729793,49.432],[8.704561,49.403252]]]}}]}")
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
	public void test_qxi86jeccwmp_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,pedestrian")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3M6D")
				.queryParam("bcircles", "VorVr:8.705967,49.400,3|sB:8.7043,49.4052,9")
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
	public void test_sof3sp46d2cz_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "elevator,primary")
				.queryParam("bboxes", "ZaU:8.660,49.4237,8.743,49.381|Lb:8.66430,49.410399,8.700,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y12D")
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
	public void test_1jyiuzkx9hf07_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,footway")
				.queryParam("filter", "building!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "bw:8.687,49.423,8.7495,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "//P1M1D")
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
	public void test_1ib37xtuo6smc_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* and not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "8.740,49.4230,91")
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
	public void test_vbeo2033chut_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,hospital")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "V:8.740,49.423,178675627")
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
	public void test_1jid9x77n11rl_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("bcircles", "PdBHB:8.7401,49.438,4|WoaCb:8.748,49.4032,66")
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
	public void test_1hv38ou3f2rlk_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,demolished,crossing")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P3Y22D")
				.queryParam("bcircles", "fwzdD:8.7282,49.4005,4|BLXR:8.7045,49.436595,1")
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
	public void test_vf0y8ace4bhv_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "station")
				.queryParam("bboxes", "q:8.694037,49.425,8.7431,49.397|ea:8.696,49.4160,8.7237,49.387|zc:8.668,49.419,8.735,49.399|YOQ:8.693801,49.423021,8.705,49.3866")
				.queryParam("groupByKey", "building")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("bpolys", "eGQZ:8.704561,49.403252,8.735,49.4020,8.71869,49.4232,8.71651,49.414,8.704561,49.403252|RhXcW:8.704561,49.403252,8.7241,49.410,8.737,49.42575,8.717795,49.410370,8.704561,49.403252")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "N:8.717,49.403,9")
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
	public void test_qdq0dxhuei45_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,construction,give_way")
				.queryParam("bboxes", "8.650,49.40426,8.72626,49.394|8.674,49.4242,8.755,49.387364")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "j:8.727,49.433648,5|nD:8.731068,49.4274,3")
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
	public void test_1jefeeaunhfsm_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,yes,residential")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "lTRdf:8.704561,49.403252,8.741271,49.4361,8.7425,49.417,8.747,49.4309,8.704561,49.403252")
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
	public void test_s12s8hly94j5_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3M16D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ik\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713676,49.410],[8.703057,49.4314],[8.7015,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qPW\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.4018],[8.7186,49.420682],[8.7121,49.401650],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731869,49.4249],[8.70485,49.417136],[8.7039,49.423],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "83")
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
	public void test_rhitkc1zt8ac_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("bcircles", "JVMkv:8.7112,49.402,1|DaLrr:8.744455,49.403,6|mL:8.714,49.424,73|qcj:8.737488,49.418,278779930285")
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
	public void test_1hbgiyobzfwvq_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6865,49.402,8.753537,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("time", "//P15D")
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
	public void test_1ibhliq7kfgvn_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "street_lamp,chapel")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7416,49.439],[8.713,49.410],[8.71990,49.413],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IAU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.437211],[8.7093,49.419],[8.7314,49.4331],[8.704561,49.403252]]]}}]}")
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
	public void test_uv8o93c2azw2_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship")
				.queryParam("bboxes", "8.663,49.416,8.722,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_vbsh1qf1poaa_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,track")
				.queryParam("filter", "network!=* and length:( .. 100)")
				.queryParam("bboxes", "N:8.650,49.412,8.739010,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
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
	public void test_qeexkpnhk8c8_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.7421,49.433,1|8.714,49.404,512|8.7437,49.433,6")
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
	public void test_1ji4j303f8u2g_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1M4D")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "8.700,49.403,4|8.70075,49.436,1|8.747,49.4015,6|8.717,49.427260,23")
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
	public void test_s0xt0i89fui8_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "K:8.660,49.419,8.705,49.3980")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "80")
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
	public void test_1ib0gv9l6dkc7_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or type:relation or not length:( .. 100)")
				.queryParam("bboxes", "ceXH:8.67513,49.4203,8.728729,49.392|hpuYH:8.662589,49.416,8.711,49.397")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y4M12D")
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
	public void test_r1g4vf81t6jn_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.695,49.414,8.731,49.3841")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1Y3M2D")
				.queryParam("timeout", "25")
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
	public void test_vbhe9lkmpagi_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ui:8.677,49.416881,8.722,49.382")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "92")
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
	public void test_us08h4masth3_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "//P3M20D")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "pToZI:8.728,49.418,85")
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
	public void test_1iv1jsocf6g4z_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y6M5D")
				.queryParam("bcircles", "8.716,49.417,6")
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
	public void test_s4ruyj9ps485_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.67902,49.402,8.7327,49.397|8.671,49.408,8.741,49.397|8.6660,49.406,8.70807,49.381")
				.queryParam("showMetadata", "yes")
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
	public void test_r17tk7jvpo3b_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Dm:8.665,49.421,8.7474,49.3979")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
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
	public void test_1iynavxpvf9yp_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P9M10D")
				.queryParam("bcircles", "M:8.7159,49.40001,1")
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
	public void test_1iuspg5o61ap0_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and length:( .. 100)")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P8M13D")
				.queryParam("bpolys", "be:8.704561,49.403252,8.7248,49.402,8.727,49.414,8.7473,49.404,8.704561,49.403252|H:8.704561,49.403252,8.740,49.424,8.700,49.439456,8.70494,49.42393,8.704561,49.403252|Kq:8.704561,49.403252,8.717,49.418,8.704504,49.418,8.708,49.415,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_u8dfmnzxd10h_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"GByt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.424285],[8.7102,49.431],[8.701,49.422],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Guoki\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70020,49.413],[8.7242,49.41613],[8.720,49.401679],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "65")
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
	public void test_r1a48x4twt2x_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bcircles", "L:8.709028,49.4176,8")
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
	public void test_1hrmiijhzexis_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "NsLRT:8.713,49.429573,4")
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
	public void test_trz6ua48u5o2_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "yB:8.682,49.424705,8.7037,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("time", "//P5M26D")
				.queryParam("timeout", "94")
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
	public void test_1jeip768d1d81_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y23D")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "s:8.701,49.429,71")
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
	public void test_qhnutl6ez3nc_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* or not id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "sGv:8.704561,49.403252,8.7220,49.412,8.7064,49.411280,8.730,49.403454,8.704561,49.403252")
				.queryParam("timeout", "27")
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
	public void test_urhbnwhsutlw_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or geometry:point and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.671,49.404,8.726359,49.3901|8.652,49.4249,8.713,49.385")
				.queryParam("time", "//P3Y2M1D")
				.queryParam("timeout", "71")
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
	public void test_tol8onf3y3xh_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* or id:(1 .. 9999)")
				.queryParam("time", "//P3Y7M1D")
				.queryParam("bpolys", "J:8.704561,49.403252,8.741,49.400,8.747,49.425,8.7046,49.419177,8.704561,49.403252")
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
	public void test_to539acoj1wk_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P7M14D")
				.queryParam("bcircles", "8.74718,49.413,14|8.729,49.426,452|8.7158,49.43422,9|8.71707,49.439437,350")
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
