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
public class RESTest_1_per_op {

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
	public void test_t4ndis1uj5me_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-10-24")
				.queryParam("bpolys", "hTRa:8.704561,49.403252,8.719,49.4197,8.709,49.41384,8.7231,49.400,8.704561,49.403252|wdv:8.704561,49.403252,8.73178,49.412,8.726641,49.423799,8.716,49.412,8.704561,49.403252|aIfGD:8.704561,49.403252,8.712,49.427,8.707,49.423355,8.721,49.422,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1h7ldnb1ql0kz_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "AqPi:8.71291,49.4221,2")
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
	public void test_u8b84bvw0qid_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "Z:8.708196,49.433584,6|jd:8.744289,49.437,6|g:8.729,49.4061,4")
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
	public void test_1hrotgusdelgw_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("time", "2008-11-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.4096],[8.730,49.4110],[8.702,49.43697],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "53")
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
	public void test_uvgyenh2txt0_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "EN:8.704561,49.403252,8.728,49.4042,8.7055,49.415,8.743,49.4040,8.704561,49.403252")
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
	public void test_qxyvlslnhaat_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and geometry:polygon and length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-12-29")
				.queryParam("bpolys", "Jicp:8.704561,49.403252,8.7468,49.421,8.7044,49.439794,8.724,49.42007,8.704561,49.403252|UGsL:8.704561,49.403252,8.72933,49.406,8.736,49.423,8.716,49.4180,8.704561,49.403252|ybgyk:8.704561,49.403252,8.71207,49.412,8.711,49.415,8.748,49.401,8.704561,49.403252")
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
	public void test_rhlmfsegkvok_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.6535,49.407,8.759,49.388|gQI:8.685,49.402,8.749,49.383|VAL:8.664,49.427,8.7519,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("time", "2009-10-15")
				.queryParam("timeout", "43")
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
	public void test_vf98s52jnfj9_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "bus_stop,church")
				.queryParam("bboxes", "fE:8.677,49.4057,8.731,49.388|a:8.6953,49.428869,8.750,49.3981|YT:8.659369,49.414,8.7573,49.3918|HfNXq:8.6959,49.423757,8.703,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_1ieviqzaljk1e_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,platform,hotel")
				.queryParam("filter", "name=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-10-28")
				.queryParam("bpolys", "a:8.704561,49.403252,8.704,49.4370,8.701,49.4203,8.725,49.41817,8.704561,49.403252|vc:8.704561,49.403252,8.700862,49.4301,8.70414,49.4119,8.7049,49.436,8.704561,49.403252|IR:8.704561,49.403252,8.718,49.41659,8.705,49.4291,8.70459,49.402,8.704561,49.403252")
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
	public void test_qhql3x9lpun9_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2017-03-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"AJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7301,49.422],[8.704,49.418],[8.700,49.423],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"leJO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.434],[8.71244,49.425279],[8.707624,49.416178],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Gmnwr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7106,49.426],[8.708539,49.4338],[8.709,49.41405],[8.704561,49.403252]]]}}]}")
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
	public void test_1huzzrpfl04e1_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "U:8.691333,49.409,8.757,49.3858|pgg:8.650,49.406,8.7406,49.388|iR:8.6561,49.405,8.70141,49.3802")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "51")
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
	public void test_1h84sukczm4oi_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or type:way and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-06-08")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "8.72786,49.404558,6|8.718,49.43768,17")
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
	public void test_ubj35uvv8aih_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("time", "2011-03-08")
				.queryParam("bpolys", "8.704561,49.403252,8.7073,49.404322,8.721,49.40058,8.732,49.400,8.704561,49.403252|8.704561,49.403252,8.7337,49.411,8.703,49.4169,8.715,49.418,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_sl9h3tc85rae_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-05-30")
				.queryParam("bcircles", "c:8.742,49.4277,2|igrci:8.7316,49.4364,3")
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
	public void test_toohahykd1et_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("bboxes", "8.656,49.41764,8.70638,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-05-17")
				.queryParam("timeout", "73")
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
	public void test_qdq0rqpmw9r8_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "elevator")
				.queryParam("filter", "barrier=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-01-10")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "8.726,49.4373,148235235|8.727,49.42234,2")
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
	public void test_qxtcg1ofk50i_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "qyWmb:8.6885,49.404,8.70476,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "27")
				.queryParam("groupByKeys", "source:maxspeed,addr:postcode")
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
	public void test_1ji7r5lrxjcrq_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "BgA:8.6719,49.425,8.738,49.384")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "addr:postcode,lit,lanes:forward")
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
	public void test_1k25l8b1cu8gz_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "nr:8.704561,49.403252,8.705,49.417,8.718865,49.4221,8.70448,49.428,8.704561,49.403252|j:8.704561,49.403252,8.72345,49.41322,8.7030,49.400,8.703,49.407,8.704561,49.403252|wIMcP:8.704561,49.403252,8.707,49.427,8.705,49.4137,8.70601,49.429,8.704561,49.403252")
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
	public void test_1k22bgl2w6a7l_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Z:8.6752,49.404,8.74123,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1jecpqw3mtfle_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "wc:8.708,49.436,6")
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
	public void test_skxvp3tjwnjn_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-07-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7011,49.432],[8.709,49.4084],[8.719,49.4196],[8.704561,49.403252]]]}}]}")
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
	public void test_1if0ljj6n5tur_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:forward!=*")
				.queryParam("bboxes", "mfxBk:8.69656,49.413,8.757,49.387")
				.queryParam("types2", "line,")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-07-01")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "53")
				.queryParam("values2", "street_lamp")
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
	public void test_1iberqbxoum2d_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* and length:( .. 100)")
				.queryParam("types2", "relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "mvv:8.7048,49.400,60")
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
	public void test_uvbwbkpf3vw6_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or area:(1.0 .. 1E6)")
				.queryParam("types2", "node,")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "turn!=* and geometry:point or id:(1 .. 9999)")
				.queryParam("time", "2012-12-22")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "ugdtL:8.720,49.431,833546681")
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
	public void test_s100iyno82ev_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "E:8.659,49.4215,8.710,49.384")
				.queryParam("format", "csv")
				.queryParam("timeout", "33")
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
	public void test_qdta30em0w9w_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "xAP:8.7221,49.435,1")
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
	public void test_1ibkc1ybcr0om_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or geometry:line or length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "LElWx:8.704561,49.403252,8.744,49.417,8.705,49.404,8.7195,49.432,8.704561,49.403252|EnBk:8.704561,49.403252,8.714,49.433,8.701,49.405,8.714596,49.418,8.704561,49.403252|p:8.704561,49.403252,8.731,49.428608,8.704759,49.406,8.706,49.435,8.704561,49.403252")
				.queryParam("timeout", "50")
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
	public void test_1ib99cpz4dnp2_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-09-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qua\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.428935],[8.709003,49.4250],[8.7047,49.40883],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"QL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723,49.416],[8.748,49.423],[8.749,49.405],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7067,49.43168],[8.721,49.403],[8.7170,49.429],[8.704561,49.403252]]]}}]}")
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
	public void test_to7d16gben90_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bpolys", "NUM:8.704561,49.403252,8.742,49.4212,8.700,49.409,8.70019,49.41546,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_ublujtvrmgjc_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-04-16")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "8.741,49.43142,41")
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
	public void test_1jy88q5y554dh_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-11-14")
				.queryParam("bcircles", "zmJ:8.71725,49.408,1|KRH:8.742,49.4038,7|FQ:8.7299,49.415,9")
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
	public void test_1jewm3hgz62pe_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-07-09")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "iH:8.724042,49.41740,6")
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
	public void test_socauoc2po34_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,public")
				.queryParam("bboxes", "8.666988,49.420203,8.738,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("time", "2013-02-06")
				.queryParam("timeout", "96")
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
	public void test_u7zmpcu1lk53_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or geometry:point or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"uTa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.716,49.4181],[8.747,49.421],[8.710365,49.405],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.4301],[8.708,49.42053],[8.743,49.400723],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"b\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7171,49.400],[8.718,49.40446],[8.7057,49.421],[8.704561,49.403252]]]}}]}")
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
	public void test_1iepi1yszqi46_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-05-16")
				.queryParam("bpolys", "8.704561,49.403252,8.725,49.41231,8.707,49.438,8.7312,49.402,8.704561,49.403252|8.704561,49.403252,8.717057,49.403,8.704591,49.424,8.705,49.4040,8.704561,49.403252")
				.queryParam("timeout", "36")
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
	public void test_ts1xrhc33zg4_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-02-21")
				.queryParam("bcircles", "HuAT:8.71017,49.4080,2")
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
	public void test_1h7z8gf9afrjo_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71060,49.429334],[8.744,49.4307],[8.7048,49.407],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"K\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715788,49.40598],[8.700,49.417],[8.717,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"HI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718340,49.429],[8.711,49.425],[8.717,49.426],[8.704561,49.403252]]]}}]}")
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
	public void test_1k25229z2oshj_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway and geometry:line")
				.queryParam("bboxes", "8.676,49.412,8.738,49.398")
				.queryParam("time", "2018-01-13")
				.queryParam("timeout", "83")
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
	public void test_1ib8r15lhiypk_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* and not geometry:polygon")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Fb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.401],[8.70456,49.434],[8.7325,49.4308],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7083,49.416],[8.732,49.436],[8.70421,49.4007],[8.704561,49.403252]]]}}]}")
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
	public void test_rh51ce0phq2c_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "crossing,church")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "sXOjI:8.703,49.425210,2|yacHa:8.709,49.41886,5")
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
	public void test_tnzjn1xb4xm8_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Z:8.678,49.40657,8.748,49.390|K:8.668,49.426937,8.745,49.3973")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2007-12-15")
				.queryParam("timeout", "52")
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
	public void test_ubome8g2kmr8_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nGfaa:8.672,49.425,8.710974,49.383|l:8.667,49.4006,8.739,49.386|b:8.6712,49.4260,8.700,49.398")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-05-31")
				.queryParam("groupByKeys", "turn:lanes,ref")
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
	public void test_1hr84hbloqau9_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "e:8.695,49.420,8.758,49.386|p:8.652,49.4167,8.745625,49.3805")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "destination,ref")
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
	public void test_qe9x71foq9mg_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "cycleway,stop_line")
				.queryParam("bboxes", "jsr:8.67938,49.427,8.7189,49.381|I:8.650,49.423,8.709,49.394|a:8.661,49.4029,8.703,49.387|iDBa:8.6736,49.401,8.7358,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_sl0n2ul4cf8z_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,civic,pedestrian")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-02-28")
				.queryParam("bcircles", "8.738,49.419,920|8.7324,49.43491,65")
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
	public void test_s18c8kuviucy_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2009-06-02")
				.queryParam("timeout", "58")
				.queryParam("bcircles", "B:8.7122,49.4202,9|WeAWG:8.72206,49.405,5")
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
	public void test_1je9us8ot74u0_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "2016-05-05")
				.queryParam("bpolys", "DRMw:8.704561,49.403252,8.7470,49.435,8.704488,49.434,8.70450,49.420,8.704561,49.403252|BBaQ:8.704561,49.403252,8.742,49.432995,8.745,49.433,8.722,49.4239,8.704561,49.403252|p:8.704561,49.403252,8.741,49.4301,8.740228,49.426271,8.725672,49.420,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_1iv11hg5qelgz_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and not geometry:line")
				.queryParam("bboxes", "8.684,49.418,8.7550,49.388")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
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
	public void test_vf1eac0nkcwz_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:line")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "bicycle=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Va\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71351,49.436],[8.70047,49.429326],[8.705,49.41079],[8.704561,49.403252]]]}}]}")
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
	public void test_qdybe8i32jao_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "K:8.674,49.418,8.75950,49.3935")
				.queryParam("keys", "highway")
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
	public void test_toa40znuc2ls_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zMC:8.6574,49.419,8.726,49.385|l:8.684,49.404265,8.712,49.3823|D:8.6846,49.4268,8.7276,49.3904|OW:8.65126,49.417,8.7376,49.389294")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "highway!=*")
				.queryParam("time", "2011-04-14")
				.queryParam("timeout", "86")
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
	public void test_1hbd83dsdrgab_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "E:8.6737,49.4135,8.708094,49.395")
				.queryParam("keys", "highway")
				.queryParam("timeout", "43")
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
	public void test_qdy9dac03pdf_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("time", "2015-03-01")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "xbE:8.714,49.42323,1")
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
	public void test_1ien6br997rxv_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XYOCP:8.68943,49.406,8.705,49.3944")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
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
	public void test_t4w6rkoa0roy_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Ns:8.698,49.4085,8.72603,49.387|cKIi:8.682,49.424632,8.727062,49.394")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-05-29")
				.queryParam("timeout", "65")
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
	public void test_to2bf3no0vg6_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "r:8.685645,49.421,8.7404,49.389|t:8.667455,49.429,8.759,49.395")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "31")
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
	public void test_t8f83k39vski_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-01-20")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "8.7364,49.433,1")
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
	public void test_qxw31sl9gzso_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-04-17")
				.queryParam("bcircles", "WF:8.703,49.4079,85")
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
	public void test_tolp4knskjeh_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ICjH:8.6969,49.4159,8.7599,49.399|yB:8.671,49.423,8.723,49.3993")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "55")
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
	public void test_1jxzxemgif3g1_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("time", "2015-02-17")
				.queryParam("bpolys", "iFwHy:8.704561,49.403252,8.718,49.425843,8.7044,49.4194,8.7004,49.4262,8.704561,49.403252")
				.queryParam("timeout", "100")
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
	public void test_skq3govlx6wl_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp,house,hotel")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-01-15")
				.queryParam("bpolys", "IYu:8.704561,49.403252,8.7156,49.4384,8.703,49.431,8.704,49.435,8.704561,49.403252|stVs:8.704561,49.403252,8.740741,49.418258,8.743,49.430,8.734,49.419,8.704561,49.403252|Mb:8.704561,49.403252,8.7164,49.42216,8.70092,49.416,8.701,49.43716,8.704561,49.403252")
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
	public void test_urmvjeqnvtd1_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or type:node or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-09-07")
				.queryParam("bpolys", "D:8.704561,49.403252,8.712,49.407,8.733,49.43038,8.702,49.40254,8.704561,49.403252|iBu:8.704561,49.403252,8.724,49.415,8.733,49.4165,8.721,49.404594,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_1hrj6sghfgo4y_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("bpolys", "I:8.704561,49.403252,8.70588,49.439,8.740135,49.41201,8.700,49.428,8.704561,49.403252|bWn:8.704561,49.403252,8.7140,49.402506,8.70488,49.432,8.7338,49.422543,8.704561,49.403252|ptr:8.704561,49.403252,8.716958,49.40353,8.709421,49.4142,8.7048,49.429,8.704561,49.403252")
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
	public void test_1h7x0y5hnfrl2_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "Mw:8.722,49.4101,9585886661|MKbiU:8.7326,49.426,6|uJu:8.716,49.433,4")
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
	public void test_sksbd03166w5_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "xM:8.660,49.42917,8.74903,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "39")
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
	public void test_1h84sgiwd7lf8_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bpolys", "xV:8.704561,49.403252,8.735,49.414,8.708,49.4297,8.7035,49.4196,8.704561,49.403252|TnS:8.704561,49.403252,8.7492,49.4001,8.706493,49.42894,8.709,49.4014,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_1iuy87t3qn0a9_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.722312,49.408,8.7375,49.416,8.703221,49.437,8.704561,49.403252|8.704561,49.403252,8.73011,49.401,8.702,49.42297,8.741,49.4161,8.704561,49.403252")
				.queryParam("timeout", "83")
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
	public void test_qxntzqorpylg_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6865,49.414178,8.737,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("timeout", "55")
				.queryParam("groupByKeys", "addr:city,building,type")
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
	public void test_r1l4jpvpip2a_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-01-07")
				.queryParam("groupByKeys", "source:maxspeed,addr:housenumber")
				.queryParam("bcircles", "8.70681,49.438,785")
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
	public void test_uv8nusd09k6e_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,church")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "lnYnh:8.704561,49.403252,8.727,49.4370,8.7356,49.427,8.73351,49.420,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_qxtv380x1opy_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "My:8.6711,49.428,8.727,49.392|Xe:8.6577,49.4203,8.758,49.399")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-01-20")
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
	public void test_urme29qxyrea_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-03-07")
				.queryParam("bcircles", "W:8.7418,49.403,5|ZDm:8.71690,49.422,1")
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
	public void test_rl8f0hb0inhe_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or geometry:line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.714980,49.43550,3")
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
	public void test_1hrm0l8gyun93_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=*")
				.queryParam("bboxes", "vhViO:8.6784,49.41149,8.7215,49.394087|b:8.671,49.409,8.713,49.380")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref=* or id:(1 .. 9999)")
				.queryParam("time", "2017-02-07")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_u8apvisvqsdv_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and type:node and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "yUiGs:8.691,49.4181,8.7026,49.386|RuO:8.688819,49.404,8.731589,49.3928|N:8.6739,49.423,8.71904,49.3904|NGZvp:8.696513,49.410730,8.741671,49.396")
				.queryParam("filter2", "oneway=* or geometry:line or length:( .. 100)")
				.queryParam("time", "2011-02-28")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "46")
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
	public void test_vey62owouczc_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("filter2", "destination!=* and geometry:polygon")
				.queryParam("time", "2007-11-17")
				.queryParam("bpolys", "8.704561,49.403252,8.730,49.420,8.744,49.409,8.722,49.43385,8.704561,49.403252|8.704561,49.403252,8.7087,49.40559,8.700,49.41033,8.7096,49.4154,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_1hroqcic1utdj_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("time", "2008-07-12")
				.queryParam("bpolys", "8.704561,49.403252,8.724,49.4036,8.725,49.4199,8.7435,49.4332,8.704561,49.403252|8.704561,49.403252,8.72695,49.4040,8.7308,49.412,8.711,49.426,8.704561,49.403252|8.704561,49.403252,8.725,49.410,8.701295,49.431646,8.7208,49.409837,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "49")
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
	public void test_1hvbiu8by456e_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Ym:8.6745,49.427,8.741,49.395|mDzf:8.6916,49.416,8.709,49.397")
				.queryParam("time", "2010-07-25")
				.queryParam("timeout", "72")
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
	public void test_u82g3vhad4xg_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "bRuJa:8.65330,49.428,8.717521,49.384|tRkQE:8.6743,49.412,8.739,49.3808")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("timeout", "86")
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
	public void test_s4v3w9n6cu9k_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "lBny:8.7222,49.414,4|ylXHQ:8.74542,49.424,4")
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
	public void test_ureji3have5f_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or type:way or id:(1 .. 9999)")
				.queryParam("bboxes", "iA:8.665,49.406,8.74324,49.388")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-10-20")
				.queryParam("timeout", "37")
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
	public void test_1huzyldu4puub_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-04-19")
				.queryParam("bpolys", "8.704561,49.403252,8.722,49.41750,8.7454,49.412619,8.7489,49.426,8.704561,49.403252")
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
	public void test_rhoelnpvfghd_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=*")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.72783,49.40954,8.702,49.423494,8.722,49.408,8.704561,49.403252|8.704561,49.403252,8.749,49.428,8.7047,49.4169,8.709,49.4063,8.704561,49.403252|8.704561,49.403252,8.7031,49.436,8.704596,49.41849,8.742,49.402,8.704561,49.403252")
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
	public void test_1iuy9e0080xtf_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Q:8.67149,49.405,8.7337,49.3970")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_rhak3zhj68gx_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* and geometry:polygon or id:(1 .. 9999)")
				.queryParam("bboxes", "8.682,49.40756,8.725,49.398|8.6520,49.424,8.758,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
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
	public void test_rhg3cf3bhp9s_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("time", "2013-03-10")
				.queryParam("bpolys", "B:8.704561,49.403252,8.718326,49.414,8.722,49.439,8.723,49.405071,8.704561,49.403252|b:8.704561,49.403252,8.725,49.414,8.704,49.416,8.7162,49.4381,8.704561,49.403252|tYg:8.704561,49.403252,8.74576,49.418,8.700,49.4202,8.701,49.433,8.704561,49.403252")
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
	public void test_qhq5250y70ol_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "jt:8.6555,49.414,8.7132,49.388|Y:8.652,49.414,8.751084,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-03-05")
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
	public void test_sksa4mardik5_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SB:8.675,49.403,8.754,49.380")
				.queryParam("time", "2009-12-19")
				.queryParam("timeout", "82")
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
	public void test_1h7u7oi1qfl84_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "XXxY:8.730582,49.4019,6")
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
	public void test_1hrjrwwypdmxx_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-08-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FInZR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.4015],[8.709,49.431],[8.704,49.43599],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_1iv3tbouxwjtt_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vlkIC:8.690402,49.40893,8.73893,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-01-29")
				.queryParam("timeout", "21")
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
	public void test_qe73h40p4g8g_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-05-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"eQY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701490,49.431],[8.736128,49.428],[8.7164,49.4147],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IulBS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7049,49.4112],[8.708,49.408],[8.72747,49.41355],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"w\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7463,49.4043],[8.707,49.4042],[8.705,49.412],[8.704561,49.403252]]]}}]}")
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
	public void test_urjl4e64lap1_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,hotel,dormitory")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-12-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"sSl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.42849],[8.71204,49.407],[8.705,49.4094],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"hZGdW\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74641,49.439],[8.700,49.4316],[8.705,49.403096],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"aAksI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.416754],[8.7040,49.423],[8.70458,49.41975],[8.704561,49.403252]]]}}]}")
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
	public void test_1je9wcasprz3a_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.664,49.4014,8.710,49.383")
				.queryParam("keys", "highway")
				.queryParam("timeout", "60")
				.queryParam("groupByKeys", "lanes:backward,bicycle")
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
	public void test_1jym3wtv3eyjn_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* or type:node")
				.queryParam("bboxes", "b:8.6618,49.4051,8.736,49.383")
				.queryParam("format", "geojson")
				.queryParam("timeout", "55")
				.queryParam("groupByKeys", "lit,oneway,addr:street")
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
	public void test_qhvnwb9jz3vl_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,residential,apartments")
				.queryParam("bboxes", "T:8.658,49.409,8.7467,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "99")
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
	public void test_1jefebzy77e45_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-12-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"jT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.43714],[8.744,49.437],[8.7261,49.4029],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "88")
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
	public void test_1k250w8ltijau_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("timeout", "63")
				.queryParam("bcircles", "Q:8.7270,49.42119,7|Sd:8.7402,49.403,7|Auxio:8.7276,49.431,1")
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
	public void test_1iv12pwom6ng2_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-03-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Zv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.418316],[8.744,49.407387],[8.7040,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "46")
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
	public void test_s15k0b533eid_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("filter2", "addr:housenumber!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2016-09-09")
				.queryParam("bpolys", "8.704561,49.403252,8.724,49.4176,8.714,49.42420,8.7323,49.4357,8.704561,49.403252|8.704561,49.403252,8.7049,49.4253,8.7217,49.4039,8.70785,49.42552,8.704561,49.403252|8.704561,49.403252,8.718,49.415,8.7245,49.428,8.744,49.429,8.704561,49.403252")
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
	public void test_1ib9a4rvipqno_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "other")
				.queryParam("format", "json")
				.queryParam("time", "2015-01-07")
				.queryParam("bpolys", "r:8.704561,49.403252,8.7252,49.407,8.74438,49.400,8.701,49.415,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "20")
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
	public void test_u7um973q20jd_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("filter2", "oneway=* or type:way or id:(1 .. 9999)")
				.queryParam("time", "2015-11-10")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "secondary_link")
				.queryParam("bcircles", "8.712,49.42165,19573234690|8.719,49.430,9")
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
	public void test_s10jk06p0voi_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-02-01")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "sy:8.7115,49.409,6|AK:8.7373,49.438295,70")
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
	public void test_rkzjqm9aah5y_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "Li:8.7252,49.438,972139796")
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
	public void test_1hrmj7z0vgsvm_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=*")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1Y8D")
				.queryParam("bcircles", "QTrOL:8.702,49.4036,111")
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
	public void test_1h7qz58lts186_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "JWA:8.7365,49.408,53|yz:8.726,49.4255,3")
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
	public void test_1ji7829e43qk4_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and geometry:line or not id:(1 .. 9999)")
				.queryParam("bboxes", "WA:8.6831,49.417,8.7016,49.398|LqqtC:8.677,49.400728,8.7348,49.389")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P6M16D")
				.queryParam("timeout", "76")
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
	public void test_sl0lwvltkq44_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.696,49.40177,8.707,49.39583|8.69241,49.424,8.73865,49.385")
				.queryParam("format", "csv")
				.queryParam("time", "//P2M7D")
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
	public void test_1iyn8jp1fgl0j_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "//P1M22D")
				.queryParam("bpolys", "w:8.704561,49.403252,8.73250,49.422107,8.704,49.420,8.714,49.418,8.704561,49.403252|DNi:8.704561,49.403252,8.734,49.412415,8.709,49.414,8.7097,49.4142,8.704561,49.403252")
				.queryParam("timeout", "36")
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
	public void test_trrdfrsckc39_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.7446,49.431,7")
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
	public void test_1je9v63ib1hep_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "steps,roof")
				.queryParam("filter", "maxspeed=* and geometry:point and not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "rHa:8.703224,49.4224,9")
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
	public void test_1iuvyoodwee5y_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "//P3Y7D")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "oxxhE:8.70247,49.418,23")
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
	public void test_1jicrm1dcqdrq_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.701,49.4127,8.7073,49.42284,8.7059,49.430,8.704561,49.403252")
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
	public void test_1jefylfp4x0md_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "//P11D")
				.queryParam("bcircles", "H:8.719945,49.4063,88")
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
	public void test_1jezd0ih8h2r5_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.696,49.41493,8.728,49.389|8.650,49.414,8.7180,49.385|8.69567,49.413,8.759,49.3993|8.683268,49.405,8.713975,49.387")
				.queryParam("showMetadata", "no")
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
	public void test_qe73er7ramox_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "BrZSo:8.6627,49.422,8.749,49.38773|NAX:8.676,49.428,8.724,49.398|hwZ:8.665627,49.4267,8.700,49.383|QuCdV:8.66208,49.42070,8.72023,49.39843")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2M27D")
				.queryParam("timeout", "61")
				.queryParam("groupByKeys", "addr:country,addr:city")
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
	public void test_1iykk9zmorj36_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "bpO:8.6927,49.403,8.753,49.384")
				.queryParam("keys", "highway")
				.queryParam("time", "//P3M16D")
				.queryParam("timeout", "89")
				.queryParam("groupByKeys", "addr:housenumber,lanes")
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
	public void test_1h7z8fzhbexpx_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,roof,commercial")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.712963,49.417907,369")
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
	public void test_1hvb0zpwkyulg_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "T:8.673301,49.409,8.7320,49.3868|EoGQd:8.681,49.415,8.73361,49.385|Jrq:8.6613,49.407,8.7489,49.388|j:8.673,49.418,8.750,49.3903")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "41")
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
	public void test_vb6csvfdrdd1_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P9M23D")
				.queryParam("bcircles", "pZT:8.71756,49.432,9|S:8.71790,49.4291,54")
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
	public void test_1hrpbe7tch25z_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or type:way or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("bpolys", "hE:8.704561,49.403252,8.7493,49.434649,8.749960,49.43915,8.7410,49.422,8.704561,49.403252")
				.queryParam("timeout", "25")
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
