package old;

import io.restassured.config.JsonConfig;
import io.restassured.path.json.config.JsonPathConfig;
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
public class OhsomeTest_1h7qzxah5wp5t {

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
	public void test_1h7lxg98he2cl_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "point,line,polygon,")
				.queryParam("bboxes", "8.653518,49.4080,8.747,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("timeout", "58")
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
	public void test_qhtdzfo1x0md_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "a:8.693,49.415,8.74055,49.391|h:8.6780,49.4138,8.7067,49.385|TW:8.6697,49.425,8.707,49.3823|Ec:8.693570,49.4064,8.7341,49.393267")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "json")
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
	public void test_r1csud4yckmc_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and type:relation")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "hBA:8.704561,49.403252,8.71156,49.411,8.721,49.4116,8.717145,49.426,8.704561,49.403252|vKa:8.704561,49.403252,8.745,49.404823,8.720,49.406,8.709,49.4302,8.704561,49.403252|V:8.704561,49.403252,8.706,49.4033,8.704649,49.401,8.73291,49.40341,8.704561,49.403252")
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
	public void test_skv2aj85pwf7_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bcircles", "m:8.72185,49.42129,97|pl:8.718,49.401,2|NvI:8.7297,49.401,1|WVANJ:8.7174,49.4139,3")
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
	public void test_t4c9plekv1v9_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or not geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Bt:8.6752,49.401,8.709,49.390")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "35")
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
	public void test_1hv5g9ome6nol_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.736,49.435,9|8.7114,49.4052,5|8.738,49.4373,3")
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
	public void test_1h85bhcizf8f9_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.666,49.4041,8.710,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_1k1u0iuqw49wz_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,hospital")
				.queryParam("bboxes", "s:8.6785,49.418,8.733,49.396|XDN:8.6568,49.410,8.7317,49.387576")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("timeout", "81")
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
	public void test_1hrggz602nnfp_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,public,give_way")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-07-27")
				.queryParam("bpolys", "l:8.704561,49.403252,8.707,49.433,8.711,49.435,8.7048,49.410,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_us0pmhq14z79_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "VV:8.6720,49.4040,8.737,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("timeout", "59")
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
	public void test_s4unzd11y982_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"w\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7397,49.413],[8.704723,49.4097],[8.704,49.419],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.417],[8.712356,49.439],[8.703,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"s\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7396,49.4191],[8.705,49.414],[8.708,49.416],[8.704561,49.403252]]]}}]}")
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
	public void test_urxefn8i3mly_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "q:8.717,49.4242,3|B:8.7493,49.421,488|seDkv:8.7475,49.419031,471|HDAC:8.722,49.4177,1")
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
	public void test_urxyb3fkpf7a_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and not length:( .. 100)")
				.queryParam("bboxes", "8.69053,49.4276,8.758,49.383|8.658468,49.40027,8.729865,49.382|8.699803,49.418917,8.723,49.3900")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_vbmy7kldnj21_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:polygon or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "ita:8.720,49.4169,4|G:8.71773,49.433,6|EJ:8.701,49.439527,15")
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
	public void test_1k1zjd5axbx9s_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary,stop,track")
				.queryParam("filter", "bicycle!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-08-27")
				.queryParam("bcircles", "tZm:8.739,49.430,6|Wl:8.708003,49.4373,1")
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
	public void test_s18ekpjtpmih_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("time", "2011-03-12")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "lDSaF:8.720047,49.433,7|KD:8.7188,49.4189,11")
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
	public void test_us0q0scvwodd_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "xnb:8.666,49.4053,8.717,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("time", "2011-08-04")
				.queryParam("timeout", "64")
				.queryParam("groupByKeys", "bicycle")
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
	public void test_1k1r76h24qqsz_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.682,49.411,8.734,49.395|8.68317,49.4289,8.731,49.3978|8.6796,49.42653,8.759985,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("groupByKeys", "tracktype,name")
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
	public void test_1jyd7xlaper03_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ntoif:8.6612,49.40549,8.746,49.394|Rzd:8.670,49.406,8.745372,49.3967")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "false")
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
	public void test_1hbm24ajmcaxy_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "g:8.66327,49.418,8.740565,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
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
	public void test_1hr86f5b412cx_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-01-17")
				.queryParam("bpolys", "MPWtf:8.704561,49.403252,8.711,49.435,8.704,49.401,8.741,49.400,8.704561,49.403252|Dwmzv:8.704561,49.403252,8.7367,49.4046,8.705,49.41411,8.734,49.4121,8.704561,49.403252|y:8.704561,49.403252,8.711,49.429741,8.700,49.420,8.704,49.408,8.704561,49.403252")
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
	public void test_urjlwahz3s6c_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "ngQ:8.704561,49.403252,8.739,49.426050,8.7144,49.404,8.736257,49.41991,8.704561,49.403252|YV:8.704561,49.403252,8.744,49.437,8.7292,49.401,8.740,49.4143,8.704561,49.403252|W:8.704561,49.403252,8.710,49.430,8.70794,49.432,8.7394,49.403127,8.704561,49.403252")
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
	public void test_s4v528yuua7r_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-05-18")
				.queryParam("bpolys", "atggK:8.704561,49.403252,8.714,49.421,8.70052,49.404,8.74328,49.431,8.704561,49.403252|SsDb:8.704561,49.403252,8.73383,49.431,8.7043,49.437292,8.703,49.415539,8.704561,49.403252|L:8.704561,49.403252,8.714,49.42356,8.728,49.402,8.703,49.413,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "pedestrian")
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
	public void test_r1a3e884g8km_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and not length:( .. 100)")
				.queryParam("types2", "point,")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-08-01")
				.queryParam("bpolys", "8.704561,49.403252,8.7008,49.41005,8.7144,49.401,8.700064,49.4001,8.704561,49.403252|8.704561,49.403252,8.746414,49.416,8.70921,49.4277,8.707,49.404,8.704561,49.403252|8.704561,49.403252,8.7409,49.428,8.704,49.4028,8.7046,49.4329,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_1ib3ommsao0o3_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "highway=* or length:( .. 100)")
				.queryParam("time", "2007-12-14")
				.queryParam("keys2", "highway")
				.queryParam("values2", "turning_circle")
				.queryParam("bcircles", "w:8.7058,49.4378,2|JkWkh:8.747,49.401,9|ZlZ:8.7077,49.413,2")
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
	public void test_t4nv1s5i40o3_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "csv")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "8.711,49.407,1|8.716,49.436,8|8.739026,49.418,8|8.7332,49.417,992159596443")
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
	public void test_1k251qp9ej1v6_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "BBzXz:8.660,49.419,8.745354,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "36")
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
	public void test_vbt0556tyh4o_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2013-06-30")
				.queryParam("bpolys", "8.704561,49.403252,8.7027,49.4134,8.704822,49.4188,8.720,49.4103,8.704561,49.403252|8.704561,49.403252,8.7379,49.427363,8.700,49.4185,8.722,49.402,8.704561,49.403252|8.704561,49.403252,8.707663,49.42739,8.706,49.438017,8.712,49.4047,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_1hr861c39uctd_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2017-11-27")
				.queryParam("bcircles", "O:8.742177,49.424875,28")
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
	public void test_1h7wj0kk21941_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* or geometry:line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"n\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737471,49.4371],[8.737,49.42365],[8.701,49.427],[8.704561,49.403252]]]}}]}")
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
	public void test_1jew0z98lav5c_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.682,49.412,8.708,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "73")
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
	public void test_1jer1rlnf465y_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.4159,8.704,49.4069,8.719,49.403,8.704561,49.403252|8.704561,49.403252,8.731875,49.40864,8.7092,49.418669,8.70453,49.41064,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_qxyw017hjlmb_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,house")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.7306,49.40136,5")
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
	public void test_1h7wi8hyok28x_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.711,49.415,1")
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
	public void test_urmegcf4olrn_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-06-19")
				.queryParam("bpolys", "o:8.704561,49.403252,8.74754,49.4014,8.7015,49.414,8.7342,49.4062,8.704561,49.403252|Kithp:8.704561,49.403252,8.741,49.410808,8.7041,49.439,8.7048,49.428,8.704561,49.403252|lt:8.704561,49.403252,8.705,49.4251,8.734,49.4319,8.706,49.4066,8.704561,49.403252")
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
	public void test_u8dhkxvdiofm_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes=*")
				.queryParam("bboxes", "8.675400,49.417744,8.7305,49.381|8.6688,49.425,8.7308,49.392754|8.695,49.4076,8.7132,49.383|8.672653,49.424,8.71876,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-06-22")
				.queryParam("timeout", "67")
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
	public void test_1iyeye8vb90s4_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("time", "2013-11-07")
				.queryParam("bpolys", "FSWEI:8.704561,49.403252,8.736,49.420,8.724,49.412,8.703975,49.435,8.704561,49.403252|YtFOe:8.704561,49.403252,8.720417,49.42262,8.707,49.4098,8.703,49.4248,8.704561,49.403252|b:8.704561,49.403252,8.719525,49.417,8.732,49.4306,8.7264,49.411156,8.704561,49.403252")
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
	public void test_ubrek70uwew6_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* and type:way or id:(1 .. 9999)")
				.queryParam("bboxes", "jMEHT:8.65749,49.4029,8.739,49.383")
				.queryParam("format", "geojson")
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
	public void test_1iv6m9k0zug6a_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn!=* or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("time", "2017-09-18")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "KaBQT:8.701,49.4362,2")
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
	public void test_s0xtc2w9rzub_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "PeIiu:8.704561,49.403252,8.743,49.4364,8.744192,49.419,8.702329,49.41101,8.704561,49.403252|kK:8.704561,49.403252,8.74608,49.42641,8.704,49.424,8.702913,49.4270,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_uvjqyb9x7prp_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "chapel,station")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.429,8.702,49.4074,8.7220,49.4305,8.704561,49.403252")
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
	public void test_urpm4r1isvn9_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XGxtV:8.691,49.4282,8.758052,49.384|R:8.6710,49.422,8.7501,49.3920")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
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
	public void test_urme2dnufvi0_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and type:node and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "38")
				.queryParam("groupByKeys", "destination,highway,smoothness")
				.queryParam("bcircles", "8.722,49.431,7")
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
	public void test_1jei8wko9z0op_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "network,bicycle")
				.queryParam("bcircles", "iJF:8.7263,49.4357,6|gAN:8.732,49.403,3")
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
	public void test_r1ddi0a5zc51_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,speed_camera,roof")
				.queryParam("bboxes", "jOqkj:8.6583,49.41876,8.7435,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("timeout", "21")
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
	public void test_t4qoe9sbr2uw_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2013-10-17")
				.queryParam("bpolys", "8.704561,49.403252,8.7337,49.4036,8.70459,49.428,8.7483,49.422,8.704561,49.403252")
				.queryParam("timeout", "95")
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
	public void test_1ies7hegwdmib_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and not id:(1 .. 9999)")
				.queryParam("time", "2010-05-26")
				.queryParam("bpolys", "dVFMS:8.704561,49.403252,8.7207,49.420,8.709,49.4177,8.70429,49.4237,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_1huxpiz91076p_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or type:node and length:( .. 100)")
				.queryParam("time", "2016-07-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EQJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7314,49.405],[8.7041,49.408],[8.73292,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "58")
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
	public void test_tony46o3984i_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Xlhpi:8.704561,49.403252,8.736,49.428,8.701,49.4362,8.716199,49.416856,8.704561,49.403252|z:8.704561,49.403252,8.705258,49.423,8.701,49.418,8.7018,49.40789,8.704561,49.403252|r:8.704561,49.403252,8.706,49.402,8.744,49.403,8.71243,49.423,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "83")
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
	public void test_1jetsoswf0pk4_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-12-03")
				.queryParam("keys2", "highway")
				.queryParam("values2", "platform")
				.queryParam("bcircles", "q:8.716,49.4141,74")
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
	public void test_urp6jsyua5v8_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "xF:8.704561,49.403252,8.74079,49.41574,8.704,49.4222,8.708033,49.41048,8.704561,49.403252|N:8.704561,49.403252,8.74074,49.42922,8.7053,49.405,8.7081,49.41016,8.704561,49.403252|tBCiJ:8.704561,49.403252,8.705,49.420,8.739,49.4265,8.7077,49.437,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_1k1r6hd21il42_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Om:8.674,49.414,8.721,49.39416|N:8.66694,49.422,8.7170,49.3956|sslNQ:8.688,49.429689,8.705,49.387|f:8.657,49.415473,8.708,49.3945")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-07-27")
				.queryParam("keys2", "highway")
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
	public void test_rl8fegfmblf9_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "HQ:8.652,49.411,8.72126,49.395|NlLqv:8.652143,49.4247,8.71767,49.391")
				.queryParam("time", "2008-01-07")
				.queryParam("timeout", "38")
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
	public void test_1ieybavob7o10_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-09-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"uG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74084,49.42457],[8.743,49.434],[8.708,49.41612],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "25")
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
	public void test_1iusqjtuae7oi_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.709,49.427,58|8.7379,49.414,6|8.726710,49.426,191")
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
	public void test_r1l50a4oo1fa_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.664,49.400,8.707,49.390|8.699,49.4081,8.734,49.385|8.697,49.42587,8.722,49.381")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-06-05")
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
	public void test_1hrgywkxr86sl_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wMvr:8.676,49.420,8.754,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "20")
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
	public void test_rl54g9c7f2nt_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("time", "2017-09-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ihO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707967,49.43678],[8.720,49.419],[8.7345,49.421],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"FX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.429],[8.744,49.4379],[8.7049,49.4172],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"e\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.405372],[8.737,49.415],[8.70331,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "86")
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
	public void test_urmdlvdzxaap_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.693,49.413973,8.702,49.386|8.670233,49.414972,8.756,49.38825")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "65")
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
	public void test_rhdttm73v700_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FmCKR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7232,49.408065],[8.70494,49.42111],[8.7030,49.4140],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743063,49.431400],[8.709,49.4070],[8.713,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.438],[8.714,49.429],[8.723,49.434],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7lwa7wm43tw_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2008-08-11")
				.queryParam("bpolys", "J:8.704561,49.403252,8.7278,49.4010,8.7084,49.419,8.701,49.4358,8.704561,49.403252|fDH:8.704561,49.403252,8.723,49.423,8.7253,49.4389,8.7199,49.41692,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_s12vex21usdw_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,public,emergency_access_point")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-03-25")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "Tbh:8.73660,49.408,4")
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
	public void test_to7uyr0vq1is_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2016-04-05")
				.queryParam("bcircles", "j:8.74607,49.430,53")
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
	public void test_1hrlz121oo09u_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.657212,49.400892,8.751,49.3962|8.65981,49.4161,8.7500,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "67")
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
	public void test_qec6718birsk_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2009-11-25")
				.queryParam("bpolys", "pJMXO:8.704561,49.403252,8.73961,49.43574,8.748,49.43211,8.718,49.400,8.704561,49.403252|QNcs:8.704561,49.403252,8.721,49.408,8.72543,49.400,8.746,49.435,8.704561,49.403252|ysx:8.704561,49.403252,8.725,49.422,8.743385,49.412,8.704,49.425,8.704561,49.403252")
				.queryParam("timeout", "98")
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
	public void test_qe9dnaqmzkva_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "rffts:8.695,49.416,8.740,49.389|Z:8.675,49.42984,8.74451,49.391|zAW:8.670,49.411548,8.723,49.382")
				.queryParam("time", "2016-05-14")
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
	public void test_t86vjcxdofvq_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,construction,stop")
				.queryParam("bboxes", "8.6509,49.400,8.722114,49.3951")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
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
	public void test_rh8anxl4n2as_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and type:node or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2012-11-13")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "8.730707,49.400,3|8.723,49.432,3")
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
	public void test_u88fykugwkdv_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-12-13")
				.queryParam("timeout", "94")
				.queryParam("groupByKeys", "lanes:backward,turn")
				.queryParam("bcircles", "OHB:8.72955,49.417991,814")
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
	public void test_ts4p5a3iimnn_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-02-22")
				.queryParam("groupByKeys", "turn:lanes,addr:street,type")
				.queryParam("bcircles", "M:8.712,49.424016,745")
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
	public void test_r1ln9deg76ue_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,chapel,footway")
				.queryParam("filter", "type=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2008-12-24")
				.queryParam("bpolys", "8.704561,49.403252,8.73112,49.41370,8.743,49.4217,8.736,49.41278,8.704561,49.403252")
				.queryParam("timeout", "86")
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
	public void test_1ib6ifb7licl2_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,service")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "Wn:8.726,49.4186,984947555")
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
	public void test_1jifkk43vjad5_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6576,49.4200,8.7030,49.390|8.668,49.405,8.729,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-10-31")
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
	public void test_s4p2evgliyb4_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-06-21")
				.queryParam("bcircles", "SQO:8.72450,49.420,7|kg:8.737,49.408626,7")
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
	public void test_1hblkz1qo3q5z_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or geometry:line or length:( .. 100)")
				.queryParam("bboxes", "VuLQ:8.672,49.4121,8.75326,49.384")
				.queryParam("types2", "relation")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-05-09")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary")
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
	public void test_1huzyzt4wifz8_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "landuse=* or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.711,49.4181,4")
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
	public void test_sl3gc66t11rt_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-12-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723,49.4322],[8.7204,49.4226],[8.738,49.412],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
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
	public void test_r17ch1o3hpwi_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or not type:relation and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "S:8.6623,49.4075,8.741,49.391|Z:8.688,49.4051,8.7460,49.391|EsYvI:8.6703,49.4059,8.759,49.391")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("format", "geojson")
				.queryParam("filter2", "name!=* and geometry:line and id:(1 .. 9999)")
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
	public void test_1iusre4ypcks8_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn!=* and type:relation")
				.queryParam("bboxes", "kkp:8.6532,49.406,8.706,49.380")
				.queryParam("timeout", "80")
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
	public void test_vbpofby5pbn9_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and not geometry:point")
				.queryParam("format", "json")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "zJk:8.718,49.4275,8")
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
	public void test_1k22so6qshwma_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "fIcT:8.65594,49.403,8.726,49.3864")
				.queryParam("timeout", "62")
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
	public void test_1hrgiiumv7mue_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vW:8.692950,49.4101,8.710,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("time", "2014-04-18")
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
	public void test_uvgwrofju2ia_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zDyNd:8.656,49.429,8.701,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("time", "2013-02-22")
				.queryParam("timeout", "82")
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
	public void test_t4tfe3etre46_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-10-14")
				.queryParam("bpolys", "qR:8.704561,49.403252,8.7015,49.430,8.704254,49.413,8.701,49.4153,8.704561,49.403252|D:8.704561,49.403252,8.712,49.401893,8.702,49.41247,8.705,49.436929,8.704561,49.403252|Vayod:8.704561,49.403252,8.748,49.415,8.708,49.4052,8.70201,49.422,8.704561,49.403252")
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
	public void test_vf0wolb2an21_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,civic")
				.queryParam("bboxes", "8.65431,49.418685,8.75003,49.388|8.6657,49.401,8.728,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
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
	public void test_t4q4l41m4t2u_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "footway,stop_line,steps")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "Ip:8.733,49.418,529604075|U:8.7305,49.404,98")
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
	public void test_ursearxhpj5g_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "cycleway,church,traffic_mirror")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-09-05")
				.queryParam("bpolys", "8.704561,49.403252,8.717,49.4298,8.70133,49.422,8.7047,49.4372,8.704561,49.403252|8.704561,49.403252,8.71039,49.402,8.740,49.4354,8.709,49.41829,8.704561,49.403252|8.704561,49.403252,8.739,49.430,8.70930,49.419,8.707,49.437,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_1jew3e0miojld_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.738244,49.4105,5|8.733,49.4040,1")
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
	public void test_to7bxligpdnl_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or geometry:line or not area:(1.0 .. 1E6)")
				.queryParam("bcircles", "lWwBJ:8.701,49.41955,493553224|at:8.749202,49.430,631")
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
	public void test_1jer0ixyjwfuh_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "I:8.695,49.4040,8.750,49.381|jC:8.6697,49.4294,8.7064,49.383|t:8.659,49.418,8.749,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "42")
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
	public void test_1hvbkspob1vlk_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "gHm:8.6581,49.418612,8.700,49.39764|vKi:8.6623,49.423,8.721,49.392")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-09-28")
				.queryParam("timeout", "26")
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
	public void test_vbngljgxtflj_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "jgZ:8.704561,49.403252,8.730,49.404653,8.701,49.408,8.7385,49.400,8.704561,49.403252|g:8.704561,49.403252,8.7185,49.4207,8.7047,49.43995,8.73000,49.432931,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_rlb5xcdit4ro_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-06-13")
				.queryParam("bpolys", "B:8.704561,49.403252,8.719,49.404,8.72100,49.413,8.712,49.40951,8.704561,49.403252")
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
	public void test_1jetcpneb6rtx_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,elevator")
				.queryParam("filter", "surface=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-10-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.427],[8.722650,49.43861],[8.704,49.4357],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"MV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7016,49.411],[8.702113,49.432911],[8.7040,49.4023],[8.704561,49.403252]]]}}]}")
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
	public void test_1hbg0btusxp2v_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and geometry:line")
				.queryParam("bboxes", "XzeBK:8.69737,49.4207,8.7253,49.391|iRA:8.697,49.41559,8.71081,49.399|JXfXn:8.6578,49.415,8.7305,49.383")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-02-10")
				.queryParam("timeout", "52")
				.queryParam("groupByKeys", "oneway,turn,landuse")
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
	public void test_r1ivjwd9gd2s_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or geometry:line and not length:( .. 100)")
				.queryParam("time", "2010-04-25")
				.queryParam("timeout", "65")
				.queryParam("groupByKeys", "addr:city")
				.queryParam("bcircles", "8.721242,49.431,1|8.7125,49.416,8")
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
	public void test_1iycps6mokuap_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("time", "2016-07-01")
				.queryParam("bcircles", "8.714,49.408,5")
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
	public void test_ublvpoyw81f9_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "kcyLL:8.704561,49.403252,8.7363,49.403466,8.7057,49.405,8.7048,49.437,8.704561,49.403252|D:8.704561,49.403252,8.71522,49.434,8.703,49.4326,8.704844,49.415,8.704561,49.403252|OIQWL:8.704561,49.403252,8.7464,49.414,8.707,49.41084,8.735,49.4171,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_qe73ed046542_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Yn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7077,49.4069],[8.713,49.404389],[8.742,49.401],[8.704561,49.403252]]]}}]}")
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
	public void test_rkwurczfjghh_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "uPhKU:8.657559,49.417,8.713,49.398|LPVp:8.662,49.413,8.742,49.399|y:8.68004,49.400,8.701402,49.3872|u:8.669,49.419,8.731602,49.38230")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "true")
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
	public void test_sohbp2qg8ldj_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "g:8.69842,49.406521,8.724218,49.391")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("timeout", "28")
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
	public void test_1jxzd4raowca9_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-08-15")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "57")
				.queryParam("values2", "speed_camera")
				.queryParam("bcircles", "8.715,49.4015,5|8.713,49.430,4")
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
	public void test_1ibeanhyx87l2_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "oneway=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("time", "2010-07-02")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "mSLxh:8.70416,49.4216,5")
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
	public void test_qhw4nlba8f1y_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line or id:(1 .. 9999)")
				.queryParam("types2", "line,polygon,")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"INI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.4082],[8.738,49.416],[8.704,49.400],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qld\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71240,49.4079],[8.703,49.412],[8.7350,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"LaO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.419],[8.704,49.402],[8.738751,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
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
	public void test_1h7fvldbvaxbl_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.7117,49.402318,8.708,49.4284,8.702821,49.435295,8.704561,49.403252|8.704561,49.403252,8.707060,49.4375,8.7106,49.409,8.7150,49.413,8.704561,49.403252")
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
	public void test_t4a1qj2crnzm_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "ij:8.726406,49.42738,7")
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
	public void test_uvgzhu86laut_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.655,49.415,8.726027,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "28")
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
	public void test_1iv1298i6jwad_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pl:8.6673,49.416,8.73537,49.398|OxlbI:8.69269,49.418,8.758,49.3906")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-03-16")
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
	public void test_u7oii6mv3tpy_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nYnO:8.68000,49.4221,8.7490,49.398|NfBbH:8.6863,49.418,8.7147,49.398|K:8.672,49.4045,8.742,49.384|QiK:8.6820,49.4010,8.73813,49.3853")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("timeout", "28")
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
	public void test_1hv2qg4aw6gqa_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and not geometry:polygon and not length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.715933,49.411,92")
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
	public void test_sl3yc4apuwxk_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,emergency_access_point")
				.queryParam("filter", "network!=* or type:node")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2012-02-25")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.4223,8.704606,49.410,8.701623,49.420,8.704561,49.403252")
				.queryParam("timeout", "76")
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
	public void test_1h7lgrhyu2g4z_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-11-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UZoFi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706938,49.414],[8.742,49.416],[8.706,49.4188],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"bKW\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.426],[8.7037,49.4268],[8.711,49.4383],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Qp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7347,49.42847],[8.700656,49.4301],[8.734,49.400],[8.704561,49.403252]]]}}]}")
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
	public void test_t89mjc35aptf_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-02-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HcpRV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7497,49.414],[8.708,49.425],[8.70459,49.427],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "21")
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
	public void test_sl8y0jaizj1v_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or geometry:line or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-09-18")
				.queryParam("bcircles", "A:8.7086,49.439,1|XL:8.741,49.433,9")
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
	public void test_s4unwiee61x1_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "Kt:8.739238,49.421840,78")
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
	public void test_1k1u1de5b1lix_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* and id:(1 .. 9999)")
				.queryParam("bboxes", "l:8.6509,49.417,8.748,49.38148")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-10-13")
				.queryParam("timeout", "68")
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
	public void test_qxtvuwtydohf_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.692,49.4032,8.730,49.387|8.685,49.411,8.74076,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "addr:postcode,lanes")
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
	public void test_to4l9iiq4egn_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=* or type:node or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "turn:lanes,addr:street,type")
				.queryParam("bcircles", "HwRMP:8.718,49.4280,1|io:8.722536,49.4304,6")
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
	public void test_r1g59vqe27om_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,tower")
				.queryParam("bboxes", "rSjN:8.667,49.406,8.71361,49.3888|I:8.675,49.418678,8.70460,49.397301|oUuO:8.6553,49.423,8.7179,49.390|IP:8.6798,49.41205,8.73841,49.380213")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-03-19")
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
	public void test_1jidbhphk5s2s_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "U:8.704561,49.403252,8.7041,49.405,8.737114,49.4170,8.74657,49.427,8.704561,49.403252")
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
	public void test_t4nf2s6zxu1y_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2011-03-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7016,49.404],[8.703,49.438],[8.70464,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "69")
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
	public void test_r1ix19sjq984_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Wc:8.6807,49.4184,8.728,49.381|Couu:8.697,49.4298,8.70247,49.3854|FQJVL:8.670,49.407047,8.73338,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-08-19")
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
