
import org.evomaster.client.java.controller.SutHandler;
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
public class RESTest_10_per_op {

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
	public void test_1jy7ricegfbxx_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "way,relation")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "69")
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
	public void test_1iynt9qo4exd1_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* and length:( .. 100)")
				.queryParam("bboxes", "8.677,49.4100,8.753,49.38024")
				.queryParam("format", "csv")
				.queryParam("timeout", "26")
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
	public void test_t81ai16tlvsh_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "point,polygon,")
				.queryParam("bboxes", "8.678,49.426,8.704,49.381|8.6776,49.428,8.720,49.3844")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-10-20")
				.queryParam("timeout", "73")
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
	public void test_qxyuttz2u4is_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "point,line,polygon,")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2014-03-10")
				.queryParam("bcircles", "fkere:8.7468,49.416,4")
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
	public void test_s0ujmro45s2t_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "node,")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-01-10")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.713,49.404,9")
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
	public void test_t8cfh97o9krp_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "g:8.704561,49.403252,8.704,49.428,8.7004,49.433,8.70787,49.420,8.704561,49.403252|O:8.704561,49.403252,8.748,49.409,8.70452,49.4226,8.73174,49.420,8.704561,49.403252|tl:8.704561,49.403252,8.728480,49.4149,8.723,49.40529,8.74546,49.416,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_vf9966ji71wm_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-10-11")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.718,49.4309,9|8.711,49.4057,42|8.740,49.409459,8")
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
	public void test_1hrgfepnoy4vs_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* and geometry:point or id:(1 .. 9999)")
				.queryParam("time", "2007-12-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FpJa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7245,49.415],[8.704,49.426402],[8.748,49.439],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"r\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.40713],[8.7043,49.416],[8.7225,49.41202],[8.704561,49.403252]]]}}]}")
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
	public void test_t81c29yenj36_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.4389],[8.713,49.41029],[8.701,49.4314],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "24")
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
	public void test_r1dc06e7kks4_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zg:8.6981,49.40278,8.7475,49.388|t:8.680,49.4257,8.711,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2009-11-03")
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
	public void test_1jidbvozhb1h1_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("bcircles", "iwSyu:8.748917,49.41333,2|txCH:8.7333,49.4028,2|d:8.713,49.43075,2|MOXB:8.70946,49.4290,52")
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
	public void test_1h7imnleer7zs_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city=* and not geometry:polygon or length:( .. 100)")
				.queryParam("time", "2008-07-29")
				.queryParam("bcircles", "8.723843,49.439,622|8.7394,49.405505,2")
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
	public void test_urjmaji23tk1_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:country!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.672,49.4271,8.72900,49.398660")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "86")
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
	public void test_u7ol8esybihw_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-10-09")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.434,8.704911,49.403,8.721,49.423,8.704561,49.403252|8.704561,49.403252,8.739,49.400,8.7235,49.433,8.701,49.431600,8.704561,49.403252|8.704561,49.403252,8.718,49.4332,8.72158,49.41751,8.7048,49.437442,8.704561,49.403252")
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
	public void test_1hravv3zqvm0h_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-01-08")
				.queryParam("bcircles", "8.7095,49.4259,1|8.704,49.400858,8|8.7063,49.42569,3")
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
	public void test_1hbiqgyitwr4x_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "2014-09-27")
				.queryParam("bcircles", "8.720,49.407,42")
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
	public void test_1hvb0is7t1po5_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:country=* or type:node and length:( .. 100)")
				.queryParam("bboxes", "8.698,49.427,8.751,49.389")
				.queryParam("timeout", "54")
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
	public void test_u87w2srldisk_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "CrYTn:8.668832,49.404,8.758,49.388|L:8.652,49.42867,8.751,49.3981|ebQ:8.654,49.419160,8.704,49.380|w:8.685,49.41030,8.7222,49.395008")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-06-21")
				.queryParam("timeout", "74")
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
	public void test_1jelilxg74jtw_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "aGBxf:8.660749,49.41117,8.732,49.3805|wV:8.692,49.424,8.7039,49.3828")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "49")
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
	public void test_t8a60vv6nd4p_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.7062,49.4277,5|8.702917,49.404,712|8.729,49.407124,4")
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
	public void test_vb3js9k5x9o7_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.738,49.431,8.742,49.410,8.728,49.432,8.704561,49.403252|8.704561,49.403252,8.716,49.4005,8.710,49.439,8.719,49.425,8.704561,49.403252")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "h:8.733,49.409,8")
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
	public void test_qhtdnpqtgtvc_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"VJvM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7205,49.419],[8.706,49.406],[8.7310,49.404],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7377,49.415529],[8.706,49.407241],[8.7337,49.4391],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72824,49.425],[8.70828,49.429],[8.705,49.408],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "26")
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
	public void test_s4p4tij3cks7_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "QB:8.687,49.413581,8.758865,49.3859|lH:8.670,49.401,8.754,49.382288|KTaCD:8.6857,49.425,8.716,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("timeout", "70")
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
	public void test_1iyhqxz120306_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "2008-10-04")
				.queryParam("bpolys", "8.704561,49.403252,8.7189,49.424,8.7045,49.4258,8.701,49.408,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_1ibjsy9o4v9sy_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway or geometry:point or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-09-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"oSP\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.402],[8.7029,49.429],[8.70747,49.413],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"XghU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709577,49.418],[8.7299,49.408],[8.70537,49.4012],[8.704561,49.403252]]]}}]}")
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
	public void test_s4xeievlhx7n_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-05-04")
				.queryParam("bpolys", "wwCSG:8.704561,49.403252,8.710,49.420,8.702,49.4243,8.729,49.42179,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_1ibbj9n804qwp_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "2008-08-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7141,49.422],[8.731,49.409973],[8.7398,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "56")
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
	public void test_1h7u8e14le544_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or geometry:polygon and not area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-04-20")
				.queryParam("bpolys", "dlQyK:8.704561,49.403252,8.7247,49.405,8.706,49.434,8.703,49.403,8.704561,49.403252|YHeWK:8.704561,49.403252,8.722,49.41656,8.7046,49.42322,8.709,49.429,8.704561,49.403252|MD:8.704561,49.403252,8.71048,49.420,8.7047,49.42736,8.7300,49.43371,8.704561,49.403252")
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
	public void test_ubryr7wpxovl_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and not type:relation or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "asQVD:8.677,49.405,8.753980,49.398")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-06-09")
				.queryParam("timeout", "40")
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
	public void test_veverf97u8mv_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2017-10-03")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "i:8.743332,49.413,8|e:8.7139,49.406,4")
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
	public void test_vbpovrim28mr_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.40946,8.718,49.431,8.746,49.4366,8.704561,49.403252")
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
	public void test_r1iw9jt27690_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and geometry:line")
				.queryParam("bcircles", "8.731,49.430,7")
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
	public void test_1iupydn225kyt_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-09-17")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "D:8.7426,49.426,4")
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
	public void test_ts4qp6asca5g_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-01-22")
				.queryParam("bpolys", "8.704561,49.403252,8.74424,49.414,8.700,49.401715,8.74475,49.415,8.704561,49.403252")
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
	public void test_rh89y890lpo4_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Y:8.6861,49.4210,8.727,49.399")
				.queryParam("format", "csv")
				.queryParam("timeout", "25")
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
	public void test_1iepi4ngod99z_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-02-13")
				.queryParam("bcircles", "DZ:8.7034,49.407,4")
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
	public void test_1ji4z2dvr8hnq_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Im\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719110,49.4343],[8.734,49.407],[8.7007,49.40268],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.4222],[8.714,49.405],[8.7037,49.413],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"hjUyF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.418],[8.701,49.408],[8.702,49.429],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "36")
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
	public void test_trqtkd5bspyd_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("time", "2008-10-24")
				.queryParam("bpolys", "RhHH:8.704561,49.403252,8.70552,49.424,8.70456,49.420,8.70456,49.4282,8.704561,49.403252|L:8.704561,49.403252,8.741,49.4338,8.736,49.4154,8.748,49.4338,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_vf6h0989uq7t_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-11-09")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "ZcqBj:8.70392,49.4273,5")
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
	public void test_rh7quq9j0in8_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "o:8.694,49.423208,8.726,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-12-23")
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
	public void test_vevvws1umn8y_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and not type:relation or not area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "8.7020,49.42806,87")
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
	public void test_qdybe8gz5so6_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6726,49.4040,8.747,49.390|8.671,49.42648,8.7511,49.396|8.656,49.415,8.7297,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2010-10-26")
				.queryParam("timeout", "69")
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
	public void test_urmctfrlxagl_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:way and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-05-21")
				.queryParam("bpolys", "8.704561,49.403252,8.727044,49.439,8.7043,49.423,8.705,49.40655,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_ubgck2crwwtz_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "A:8.704561,49.403252,8.734,49.417,8.742,49.418,8.70441,49.40316,8.704561,49.403252|P:8.704561,49.403252,8.714,49.407,8.747179,49.410,8.70239,49.413,8.704561,49.403252|F:8.704561,49.403252,8.746,49.4119,8.7006,49.413,8.706,49.431765,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_qxyxk6124dh2_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "O:8.661785,49.4176,8.715,49.387")
				.queryParam("showMetadata", "true")
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
	public void test_1hux5q5qdghmb_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-04-12")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "RDmRE:8.715575,49.437,8|ce:8.715,49.400,1|uEWpg:8.704,49.403,3")
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
	public void test_s0xbevspmw6b_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "gb:8.704561,49.403252,8.741,49.42873,8.734,49.437,8.708534,49.434,8.704561,49.403252|Wyi:8.704561,49.403252,8.744,49.414,8.702,49.426,8.73036,49.4143,8.704561,49.403252")
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
	public void test_s1b6ny5r8md0_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6808,49.409,8.71326,49.391|8.690931,49.40098,8.739,49.384|8.671,49.4196,8.7594,49.399|8.668,49.4099,8.7032,49.3907")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "json")
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
	public void test_vbheqbcts7dx_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* and not length:( .. 100)")
				.queryParam("time", "2012-12-18")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "8.7298,49.4326,5|8.719,49.40322,2|8.73933,49.421,1")
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
	public void test_uvbfya5o3xpg_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ajQTN:8.69163,49.4111,8.7227,49.3918")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "89")
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
	public void test_1hbaxuk06yng7_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "speed_camera")
				.queryParam("bpolys", "OR:8.704561,49.403252,8.722,49.427,8.737,49.421604,8.748,49.421,8.704561,49.403252|NKFu:8.704561,49.403252,8.7457,49.401,8.70225,49.406,8.7200,49.429720,8.704561,49.403252|a:8.704561,49.403252,8.712,49.4342,8.747071,49.411967,8.70809,49.428,8.704561,49.403252")
				.queryParam("bcircles", "eQ:8.715306,49.424478,1")
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
	public void test_to53nd34xzkz_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "d:8.749,49.418,4|yCJ:8.7317,49.424,26")
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
	public void test_vbhftq0jx35i_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "IoXGR:8.704561,49.403252,8.7457,49.43021,8.702,49.434,8.715,49.428,8.704561,49.403252|kIx:8.704561,49.403252,8.722,49.439,8.705,49.410,8.71010,49.4245,8.704561,49.403252|i:8.704561,49.403252,8.723586,49.434835,8.70469,49.43985,8.736,49.4251,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_u7ojobz8y2jl_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-10-04")
				.queryParam("bcircles", "8.706,49.414,65")
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
	public void test_qxkzvkmjvdyc_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and type:relation or length:( .. 100)")
				.queryParam("bboxes", "Dx:8.689,49.4262,8.717,49.385|V:8.6599,49.405566,8.718,49.382|C:8.65204,49.4231,8.75710,49.388|I:8.6970,49.419,8.7378,49.3967")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "36")
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
	public void test_1k1ui4jwpm63l_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and type:relation or area:(1.0 .. 1E6)")
				.queryParam("time", "2011-07-26")
				.queryParam("bcircles", "V:8.7485,49.412,8")
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
	public void test_t4nd4eqpjui9_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* and area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.420,8.747,49.4369,8.704,49.40841,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_1iyl1i0qa831e_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Wt:8.674,49.424,8.741,49.394|a:8.6609,49.4096,8.705,49.383")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-03-11")
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
	public void test_u8b6y8hxx3jq_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "c:8.69873,49.4149,8.733,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-06-22")
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
	public void test_1jeqhf7q8bpdi_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2009-11-28")
				.queryParam("bcircles", "c:8.744,49.404763,8")
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
	public void test_1iauvrfvg3nsm_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SU:8.662,49.4235,8.7439,49.3828")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.738,49.40193,8.7049,49.414,8.7120,49.404,8.704561,49.403252|8.704561,49.403252,8.7482,49.426,8.7392,49.438,8.714086,49.423159,8.704561,49.403252|8.704561,49.403252,8.7211,49.402050,8.707,49.433,8.734031,49.439227,8.704561,49.403252")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "zTbS:8.743490,49.4112,67|R:8.715,49.4264,7")
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
	public void test_uve4aknwx5r6_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:point and id:(1 .. 9999)")
				.queryParam("bboxes", "Yt:8.692,49.4063,8.720712,49.390")
				.queryParam("format", "json")
				.queryParam("time", "2012-12-22")
				.queryParam("bpolys", "8.704561,49.403252,8.732,49.421,8.7306,49.422,8.738784,49.4045,8.704561,49.403252")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "BTa:8.71462,49.414,6|clfC:8.713,49.40531,817439706")
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
	public void test_tru3yvm3l1di_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.651,49.426,8.714951,49.396|8.693795,49.401,8.747602,49.383|8.672,49.42321,8.7352,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "70")
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
	public void test_ubp5vthny4vl_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "8.749,49.4065,8|8.73649,49.436,762|8.7086,49.426,7|8.737,49.4204,4")
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
	public void test_uve5dxnsx2sh_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:country!=* and geometry:line and id:(1 .. 9999)")
				.queryParam("bboxes", "q:8.6719,49.401,8.757,49.39275|zHQuw:8.682,49.42776,8.718551,49.3931|GB:8.694,49.403,8.7590,49.38003")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "51")
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
	public void test_sl3dagfowbqe_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "synagogue")
				.queryParam("filter", "barrier=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-04-09")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "ezGPN:8.72851,49.41010,6|Xg:8.74990,49.43363,3|ohxhq:8.71251,49.4076,909260904")
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
	public void test_t8cxh1gdx83c_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,university")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-11-24")
				.queryParam("bcircles", "r:8.722,49.4024,30|ZG:8.7232,49.437,7|M:8.740,49.411,5|rASka:8.7170,49.4047,6")
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
	public void test_1hbgiymcwf0x2_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,traffic_signals")
				.queryParam("bboxes", "cfGQW:8.6830,49.4258,8.715,49.3815|wJ:8.673,49.400092,8.7412,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-10-20")
				.queryParam("timeout", "26")
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
	public void test_qdys5kiikv35_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "O:8.704561,49.403252,8.705,49.4092,8.732,49.429,8.702,49.417,8.704561,49.403252")
				.queryParam("timeout", "98")
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
	public void test_to7u6exmp2k2_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "public,bus_stop")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("bcircles", "ape:8.742,49.4040,16|t:8.714084,49.424993,927|yaKA:8.709,49.412,9|i:8.7035,49.4014,953421980")
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
	public void test_rhjdu1mnfju9_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.737,49.4390,8.748,49.4329,8.708946,49.4367,8.704561,49.403252|8.704561,49.403252,8.744,49.411,8.7002,49.4007,8.714,49.4217,8.704561,49.403252")
				.queryParam("bcircles", "zen:8.747,49.437,76|g:8.71656,49.426,23")
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
	public void test_ubmdnc7yrw4h_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.689,49.427,8.721,49.380")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "no:8.724,49.4068,2")
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
	public void test_rhdulitrsgfm_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed!=* or type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "p:8.662,49.406,8.716,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "25")
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
	public void test_u8dfp0vn5cv5_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,hospital,dormitory")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"mH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.4045],[8.702,49.402],[8.70457,49.401],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yGMLl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.423501],[8.70876,49.406],[8.73884,49.438],[8.704561,49.403252]]]}}]}")
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
	public void test_1h85bxyeyrdk2_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop,demolished")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2015-07-20")
				.queryParam("bpolys", "AyI:8.704561,49.403252,8.724387,49.4088,8.705,49.4053,8.704972,49.4198,8.704561,49.403252|ZB:8.704561,49.403252,8.718240,49.4100,8.730014,49.4338,8.738,49.40950,8.704561,49.403252|TH:8.704561,49.403252,8.719,49.428,8.71599,49.42981,8.724,49.413,8.704561,49.403252")
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
	public void test_1k251qlb43zg1_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pEJsy:8.6507,49.408,8.720,49.3991")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-05-08")
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
	public void test_1jeo9j0f5ji9e_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "8.7042,49.401,2")
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
	public void test_s4p23imq41th_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,apartments")
				.queryParam("filter", "oneway!=* or not type:way")
				.queryParam("bboxes", "8.695,49.410,8.713,49.387|8.650,49.4240,8.758,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2017-10-15")
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
	public void test_1jy506ui3bub4_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Nb:8.6599,49.41322,8.744,49.38728")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2013-08-10")
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
	public void test_1jefga7gsj3g2_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,steps,residential")
				.queryParam("bboxes", "J:8.6604,49.4272,8.724,49.395")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
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
	public void test_t4z06d5sfko3_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop_line,cycleway")
				.queryParam("filter", "turn!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"eG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70365,49.406],[8.721648,49.429],[8.732595,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_sohcgyzsgxno_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or not length:( .. 100)")
				.queryParam("bboxes", "sB:8.69688,49.401,8.715720,49.388|FpebH:8.6688,49.41395,8.750,49.397")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-03-17")
				.queryParam("bpolys", "xXbRE:8.704561,49.403252,8.73020,49.4215,8.733,49.436,8.716,49.40734,8.704561,49.403252|gA:8.704561,49.403252,8.748,49.405685,8.736,49.406033,8.722,49.42667,8.704561,49.403252")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "lK:8.709,49.402,2|f:8.7315,49.410289,57|V:8.72593,49.419,74|L:8.7050,49.415,182549528868")
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
	public void test_qe9dn2t4pvlg_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,residential")
				.queryParam("filter", "destination=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "EpZj:8.704561,49.403252,8.711,49.4187,8.704750,49.4069,8.722,49.420,8.704561,49.403252")
				.queryParam("timeout", "27")
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
	public void test_us2yde0cygrp_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "public,station,school")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-04-02")
				.queryParam("bcircles", "I:8.722,49.423,6")
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
	public void test_1jifjuip011rk_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle,dormitory,apartments")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("bcircles", "zE:8.729,49.4074,75")
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
	public void test_sknaufwg7l2d_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-03")
				.queryParam("bpolys", "iEk:8.704561,49.403252,8.703,49.433,8.740,49.431,8.7050,49.436,8.704561,49.403252|MJ:8.704561,49.403252,8.746896,49.417,8.70462,49.411,8.706344,49.401916,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_t81cu5wbh3dx_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and not geometry:line or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2007-12-19")
				.queryParam("bpolys", "Ulj:8.704561,49.403252,8.701,49.43105,8.713752,49.408932,8.7134,49.429,8.704561,49.403252")
				.queryParam("timeout", "94")
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
	public void test_t86vjifrkpq0_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,chapel,give_way")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.7315,49.4352,8.739,49.4072,8.706,49.423205,8.704561,49.403252|8.704561,49.403252,8.735,49.40591,8.7480,49.430,8.702,49.4231,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_s4mc79zki4ae_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "psUA:8.663081,49.401,8.741,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-11-14")
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
	public void test_1ib37h81yspis_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.685,49.409,8.7324,49.386|P:8.693,49.411,8.735808,49.384|MTNj:8.696,49.42540,8.712215,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-03-21")
				.queryParam("timeout", "76")
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
	public void test_ubry1ou8ms0z_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "oW:8.6923,49.405,8.746,49.3803|XJT:8.661981,49.4242,8.741,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2013-08-16")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "Fjcgl:8.71821,49.421,5027913424")
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
	public void test_vbbtxvmruss1_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "speed_camera")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-03-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"cr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.421],[8.70423,49.413],[8.7141,49.404],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"nsZI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72738,49.422849],[8.707,49.4047],[8.700,49.413446],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "SnOBU:8.703,49.438,3")
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
	public void test_1hrmitzv7iyxt_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link,traffic_signals,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-08-25")
				.queryParam("bpolys", "a:8.704561,49.403252,8.700,49.411,8.7088,49.40475,8.741,49.413,8.704561,49.403252")
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
	public void test_t4yy89z6oj02_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "N:8.6948,49.409,8.723,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2018-01-10")
				.queryParam("timeout", "97")
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
	public void test_vbhxrcw2p7c5_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.7170,49.4399,8.717,49.4355,8.7045,49.437490,8.704561,49.403252|8.704561,49.403252,8.703163,49.4381,8.729,49.424,8.704560,49.432,8.704561,49.403252|8.704561,49.403252,8.746,49.436,8.701,49.43457,8.736,49.4060,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_1iukcw20qypmc_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "cycleway,primary")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("bpolys", "XtWD:8.704561,49.403252,8.700,49.4158,8.735,49.414,8.720,49.4215,8.704561,49.403252|hMWn:8.704561,49.403252,8.725,49.434,8.717,49.43338,8.712,49.435312,8.704561,49.403252|MbhcJ:8.704561,49.403252,8.7155,49.4293,8.7037,49.427668,8.73765,49.42124,8.704561,49.403252")
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
	public void test_qhswtpdsrbs1_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-07-27")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.4305,8.715,49.438537,8.735749,49.403383,8.704561,49.403252|8.704561,49.403252,8.711433,49.420217,8.716,49.40401,8.722,49.429,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_qxiawt516ezl_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,stop")
				.queryParam("filter", "ref=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "eOB:8.68034,49.40944,8.728,49.382|DVJ:8.65881,49.411,8.70013,49.38462")
				.queryParam("groupByKey", "highway")
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
	public void test_sl652bwqtqup_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,cycleway")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2014-11-23")
				.queryParam("bcircles", "8.721,49.432,2|8.712,49.410,8")
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
	public void test_rhll9t1aeddh_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.730,49.400337,6|8.746,49.424,5")
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
	public void test_1k1uhclm2deg5_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or geometry:line or id:(1 .. 9999)")
				.queryParam("bboxes", "bmLw:8.697,49.402,8.70569,49.389|m:8.651,49.4034,8.7425,49.389|nu:8.666438,49.418,8.747,49.390")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "8.743,49.432301,1")
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
	public void test_u7u1zdl1zw4i_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-02-17")
				.queryParam("bpolys", "8.704561,49.403252,8.7046,49.4197,8.733,49.4233,8.710,49.439,8.704561,49.403252")
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
	public void test_t4nvg533l7av_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "yHZTI:8.65024,49.4092,8.758,49.397|q:8.650,49.410788,8.725,49.3894")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-04-15")
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
	public void test_rhty7y4jyvz7_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "FFe:8.704561,49.403252,8.72441,49.4075,8.704778,49.4181,8.7066,49.4330,8.704561,49.403252|B:8.704561,49.403252,8.720,49.43070,8.7468,49.4052,8.722,49.41901,8.704561,49.403252|ja:8.704561,49.403252,8.7056,49.422,8.706,49.40073,8.7385,49.400,8.704561,49.403252")
				.queryParam("timeout", "47")
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
	public void test_s4mtqbns6l2o_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-06-12")
				.queryParam("bcircles", "KLMCA:8.721872,49.416,59")
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
	public void test_to7tspnmfjoj_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2008-08-11")
				.queryParam("bpolys", "8.704561,49.403252,8.73687,49.429,8.700926,49.435,8.719,49.4295,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_vbk7ltplyzqa_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-07-31")
				.queryParam("bcircles", "i:8.744,49.403,439603064|U:8.74467,49.4376,3|YO:8.70773,49.419,1")
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
	public void test_veyn85lhqcf9_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.732705,49.4197,8.7270,49.4346,8.702141,49.408,8.704561,49.403252|8.704561,49.403252,8.724,49.423,8.7042,49.430,8.72593,49.4398,8.704561,49.403252|8.704561,49.403252,8.707547,49.4249,8.719,49.400446,8.7494,49.4312,8.704561,49.403252")
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
	public void test_qdvig3frspit_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and not type:relation or not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2011-12-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"AlZGi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.407],[8.706,49.42490],[8.719,49.4344],[8.704561,49.403252]]]}}]}")
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
	public void test_t8f5b3t9l4yu_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-12-29")
				.queryParam("bpolys", "orP:8.704561,49.403252,8.741,49.4055,8.7492,49.419,8.7324,49.4067,8.704561,49.403252|XeaiA:8.704561,49.403252,8.70382,49.433,8.718,49.42042,8.72306,49.4025,8.704561,49.403252|P:8.704561,49.403252,8.71192,49.4172,8.708,49.407,8.7309,49.418,8.704561,49.403252")
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
	public void test_rlb73pl0iwc9_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "give_way")
				.queryParam("time", "2011-10-04")
				.queryParam("bpolys", "S:8.704561,49.403252,8.748,49.4294,8.704,49.426,8.742,49.433,8.704561,49.403252")
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
	public void test_qxtee7l9mxye_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "YhpJ:8.652253,49.407,8.7462,49.397")
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
	public void test_1h82266satnxg_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "w:8.749842,49.4282,5|N:8.7406,49.429,2")
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
	public void test_tofm0qu2bmt4_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.7157,49.40340,8.720132,49.410,8.734,49.405,8.704561,49.403252|8.704561,49.403252,8.744,49.4260,8.707,49.426,8.7041,49.418,8.704561,49.403252|8.704561,49.403252,8.7245,49.429,8.729,49.405,8.701,49.431598,8.704561,49.403252")
				.queryParam("timeout", "93")
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
	public void test_t8427enlglkk_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "fLYkF:8.6621,49.40581,8.75618,49.393|hYVId:8.6791,49.41954,8.70813,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("time", "2017-08-16")
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
	public void test_t4nbydeu1qux_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6866,49.419,8.744,49.3913|8.6842,49.4133,8.721,49.387")
				.queryParam("time", "2016-05-26")
				.queryParam("timeout", "58")
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
	public void test_s0xsjyap8yna_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-03-03")
				.queryParam("bpolys", "8.704561,49.403252,8.747038,49.402128,8.7014,49.413,8.704017,49.418,8.704561,49.403252|8.704561,49.403252,8.74929,49.435,8.71567,49.402605,8.70410,49.433,8.704561,49.403252|8.704561,49.403252,8.71042,49.439,8.7045,49.424,8.709,49.40827,8.704561,49.403252")
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
	public void test_t84kwxhvdool_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "R:8.6869,49.4107,8.723,49.3954")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
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
	public void test_ubonhqon9e0i_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "2007-12-31")
				.queryParam("bpolys", "skH:8.704561,49.403252,8.706902,49.4259,8.741,49.4174,8.744,49.409880,8.704561,49.403252|F:8.704561,49.403252,8.706,49.4260,8.704961,49.429,8.701,49.407,8.704561,49.403252|WaV:8.704561,49.403252,8.711,49.400,8.7318,49.4229,8.7037,49.423,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_ure0en6cz7eb_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("bcircles", "G:8.713,49.417,7|D:8.7475,49.42817,2|muFdB:8.73038,49.432,1")
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
	public void test_1hrpb04oqmtko_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-05-23")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.437],[8.72043,49.422],[8.724,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7297,49.434],[8.702,49.439],[8.746,49.410720],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yZY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.4348],[8.700,49.415],[8.746769,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "8.728,49.4285,651")
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
	public void test_qxl09vlcfqe9_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "nq:8.744,49.425,6")
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
	public void test_s4p2vkuvhjqx_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or geometry:polygon and id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "h:8.704561,49.403252,8.735,49.405,8.704561,49.400,8.7431,49.41709,8.704561,49.403252|qDhD:8.704561,49.403252,8.711,49.43567,8.700,49.420,8.70459,49.411,8.704561,49.403252")
				.queryParam("timeout", "36")
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
	public void test_1ies91ogblq3p_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "aWd:8.704561,49.403252,8.728,49.433,8.704096,49.405,8.705,49.426,8.704561,49.403252|Zhi:8.704561,49.403252,8.7198,49.40511,8.7042,49.416,8.7312,49.40092,8.704561,49.403252|B:8.704561,49.403252,8.7180,49.410,8.7319,49.413,8.7091,49.428,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_1h7zr5gqhc2eu_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-02")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "MZec:8.724230,49.413,5")
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
	public void test_ubj40e7sbtx3_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Y:8.6851,49.4001,8.706339,49.394|r:8.67717,49.405,8.7150,49.386")
				.queryParam("timeout", "31")
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
	public void test_uv95bxdvxcts_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or not type:way")
				.queryParam("format", "csv")
				.queryParam("time", "2011-09-30")
				.queryParam("bpolys", "JinDp:8.704561,49.403252,8.749,49.415,8.7045,49.40374,8.7045,49.439,8.704561,49.403252|h:8.704561,49.403252,8.700,49.415,8.70539,49.43641,8.71496,49.409,8.704561,49.403252|rWAM:8.704561,49.403252,8.7355,49.411,8.749,49.435419,8.704896,49.429,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_1h7tqun91yyba_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.4235,8.716718,49.415627,8.70042,49.42059,8.704561,49.403252")
				.queryParam("timeout", "45")
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
	public void test_trwcndefv7tw_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "rc:8.697,49.40258,8.754257,49.397")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-09-22")
				.queryParam("timeout", "34")
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
	public void test_rhlmtk1bljdu_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-02-09")
				.queryParam("bcircles", "lHPJg:8.725989,49.4139,6")
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
	public void test_sl3g0o6umpmd_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("bcircles", "sKvI:8.722,49.423,4")
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
	public void test_rhufd8kk4bav_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "n:8.68360,49.4298,8.729,49.3881")
				.queryParam("keys", "highway")
				.queryParam("time", "2013-10-23")
				.queryParam("timeout", "23")
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
	public void test_qxobx5ohrrkx_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and not geometry:point or length:( .. 100)")
				.queryParam("bboxes", "x:8.698,49.41611,8.715,49.381|Jc:8.695,49.406,8.7379,49.387")
				.queryParam("time", "2014-10-31")
				.queryParam("timeout", "48")
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
	public void test_qdt9b059op4p_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-12-18")
				.queryParam("bcircles", "xSfer:8.715191,49.4308,218|zRUQr:8.713772,49.412,91")
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
	public void test_qe73eov4uo2s_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "R:8.668162,49.413,8.719,49.39825")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-11-02")
				.queryParam("timeout", "57")
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
	public void test_vbhf1xnvxi01_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2017-12-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"pU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7491,49.420492],[8.709,49.401],[8.7063,49.4351],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_1jyajcndsf86s_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.678,49.409,8.70500,49.38076|8.65017,49.40897,8.7330,49.387266|8.661,49.428,8.704,49.394|8.656972,49.424,8.731,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_rhtxrltczepc_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "8.704561,49.403252,8.74502,49.416913,8.734,49.405,8.704,49.40174,8.704561,49.403252|8.704561,49.403252,8.73039,49.403,8.725087,49.4101,8.714,49.429,8.704561,49.403252|8.704561,49.403252,8.732,49.427598,8.738,49.409301,8.73495,49.432,8.704561,49.403252")
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
	public void test_1jyis9b7odlpx_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "z:8.72176,49.42866,74")
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
	public void test_qe11ly9pmyjp_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and type:node")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-11-22")
				.queryParam("bpolys", "Xvouh:8.704561,49.403252,8.71678,49.4172,8.700,49.409522,8.713,49.410,8.704561,49.403252|N:8.704561,49.403252,8.708,49.431,8.707516,49.408,8.7097,49.4039,8.704561,49.403252|W:8.704561,49.403252,8.73647,49.402,8.7080,49.4330,8.733,49.40082,8.704561,49.403252")
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
	public void test_1iev0i7tl4w1e_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "xMMxy:8.6824,49.414,8.715,49.3984|JgX:8.692,49.421619,8.701,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-01-12")
				.queryParam("bpolys", "vZij:8.704561,49.403252,8.728,49.4302,8.700574,49.4163,8.7348,49.415,8.704561,49.403252|xS:8.704561,49.403252,8.729,49.422,8.728,49.4034,8.741,49.425590,8.704561,49.403252")
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
	public void test_sl0lio77wrap_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-02-19")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "8.7056,49.422419,97|8.7220,49.42059,2|8.70293,49.42119,4|8.7317,49.435,41")
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
	public void test_1je9xwjj6s6cz_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "bus_stop,service")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "8.718,49.415,308")
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
	public void test_1iepz9wagvlgi_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "zf:8.734,49.421,371313349|IKsit:8.73969,49.431,2")
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
	public void test_vbsje2z21ik3_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Vq:8.704561,49.403252,8.749,49.405,8.720,49.400,8.7006,49.404,8.704561,49.403252|ht:8.704561,49.403252,8.704,49.40734,8.7311,49.4266,8.7025,49.430,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_ubrevlfly735_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,emergency_access_point")
				.queryParam("bboxes", "mJPkf:8.6748,49.402,8.746,49.3975|iA:8.6712,49.401,8.735,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2015-09-10")
				.queryParam("timeout", "93")
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
	public void test_1iukcht0zjubd_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-03-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"VRtFT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.414],[8.711,49.4342],[8.748,49.413426],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "61")
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
	public void test_tog53xb0omd5_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "d:8.704561,49.403252,8.728199,49.4012,8.70853,49.4218,8.709,49.4154,8.704561,49.403252")
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
	public void test_1k1r60lmac86b_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-09-13")
				.queryParam("bpolys", "u:8.704561,49.403252,8.711310,49.4190,8.7150,49.425,8.7448,49.430935,8.704561,49.403252|qtTYm:8.704561,49.403252,8.739,49.43947,8.737,49.427,8.749,49.402,8.704561,49.403252|bo:8.704561,49.403252,8.743,49.414034,8.7025,49.422,8.7173,49.406,8.704561,49.403252")
				.queryParam("timeout", "35")
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
	public void test_s15mewk7g5dc_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes,traffic_mirror,path")
				.queryParam("filter", "type!=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2012-02-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ggdJk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744853,49.407],[8.705,49.42059],[8.7088,49.4270],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ackcn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.420],[8.7408,49.42149],[8.74604,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "96")
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
	public void test_1ji27ag38hwma_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-09-21")
				.queryParam("bpolys", "xCM:8.704561,49.403252,8.730,49.4198,8.70258,49.4123,8.71063,49.438,8.704561,49.403252|oRPO:8.704561,49.403252,8.706,49.433,8.704,49.4277,8.730,49.433,8.704561,49.403252|JN:8.704561,49.403252,8.747981,49.4002,8.726,49.407966,8.745449,49.401216,8.704561,49.403252")
				.queryParam("bcircles", "8.7220,49.429,180")
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
	public void test_vbem3kn7xso6_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,chapel")
				.queryParam("bboxes", "m:8.673,49.421,8.723,49.390")
				.queryParam("bcircles", "uWo:8.703,49.404,95|v:8.7055,49.4368,70|SZN:8.722400,49.414725,3")
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
	public void test_1iv9d6v8k4b4z_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,ship,secondary_link")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-04-08")
				.queryParam("bpolys", "M:8.704561,49.403252,8.7121,49.419,8.708317,49.412,8.718,49.431,8.704561,49.403252")
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
	public void test_qdys5m3o6nna_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.681,49.400,8.735,49.382|8.6925,49.41514,8.73132,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2017-05-15")
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
	public void test_t8a6eyl4ucme_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("time", "2010-09-22")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "8.705,49.414629,1")
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
	public void test_qdw0atq3sm06_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.739,49.435,5")
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
	public void test_qe117yqmpb1z_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path,secondary_link")
				.queryParam("bboxes", "zCO:8.6762,49.4217,8.72662,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-08-11")
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
	public void test_rhtzbq72lgl0_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-03-19")
				.queryParam("bpolys", "8.704561,49.403252,8.738193,49.437,8.7108,49.42302,8.708,49.415,8.704561,49.403252|8.704561,49.403252,8.701,49.404,8.716417,49.4256,8.7043,49.4180,8.704561,49.403252|8.704561,49.403252,8.716863,49.412,8.702,49.41887,8.706,49.42533,8.704561,49.403252")
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
	public void test_t4vog8hldrad_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,residential,tower")
				.queryParam("filter", "network=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.685625,49.423,8.735,49.3998")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
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
	public void test_t8a5mmvzda9g_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-09-09")
				.queryParam("bpolys", "e:8.704561,49.403252,8.7341,49.426,8.746,49.431,8.742,49.40663,8.704561,49.403252")
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
	public void test_1jetb5mxa77sp_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-04-19")
				.queryParam("timeout", "86")
				.queryParam("groupByKeys", "surface")
				.queryParam("bcircles", "n:8.72000,49.406,4|Tosms:8.731,49.416,53")
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
	public void test_us0q338gy2qs_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-08-09")
				.queryParam("bcircles", "8.717,49.402,4|8.724,49.436,10")
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
	public void test_tonyyzvc76n9_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("groupByKeys", "destination,addr:country")
				.queryParam("bcircles", "8.728,49.402,76|8.714,49.421,25|8.728,49.4319,5")
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
	public void test_rkws139mbq78_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=*")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.421,8.70988,49.4076,8.712766,49.41393,8.704561,49.403252|8.704561,49.403252,8.720,49.438591,8.7050,49.423,8.7481,49.42990,8.704561,49.403252|8.704561,49.403252,8.7493,49.40591,8.7042,49.414,8.703,49.427,8.704561,49.403252")
				.queryParam("groupByKeys", "lanes:forward,building")
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
	public void test_vf6xu03eb77d_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ZQ:8.656,49.423476,8.712,49.387|A:8.694,49.40754,8.7043,49.3939|oDATq:8.65696,49.410,8.753,49.394")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-10-19")
				.queryParam("timeout", "81")
				.queryParam("groupByKeys", "surface,building")
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
	public void test_1jeip7efl44z7_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "57")
				.queryParam("groupByKeys", "type,network,oneway")
				.queryParam("bcircles", "n:8.739,49.407,42|De:8.730,49.401,6|j:8.724182,49.410573,8")
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
	public void test_toamcbvkwoj7_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-10-31")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.4263,8.719,49.40536,8.701,49.400,8.704561,49.403252|8.704561,49.403252,8.747,49.4055,8.736,49.4079,8.706114,49.435,8.704561,49.403252")
				.queryParam("groupByKeys", "name,landuse,addr:street")
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
	public void test_trtk65nokpbm_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "xr:8.687103,49.405,8.713,49.39753|hTkZw:8.657,49.418,8.745,49.394")
				.queryParam("keys", "highway")
				.queryParam("timeout", "100")
				.queryParam("groupByKeys", "foot,ref")
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
	public void test_1iukx84h4hnat_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "M:8.675,49.400333,8.753,49.385")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-10-11")
				.queryParam("groupByKeys", "surface,turn,lanes:backward")
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
	public void test_1ib8rt287a8mo_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "r:8.651,49.413,8.7174,49.391")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "source:maxspeed,lanes")
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
	public void test_1h7zasgdtm88l_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-11-19")
				.queryParam("timeout", "45")
				.queryParam("groupByKeys", "source:maxspeed,lit,turn")
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
	public void test_1iykh5qr5pdf4_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=*")
				.queryParam("bboxes", "8.6636,49.409359,8.7264,49.39183|8.696,49.4038,8.7090,49.381|8.6553,49.42775,8.7578,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("time", "2011-05-31")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "8.702282,49.4364,3|8.746,49.400,1")
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
	public void test_vf96trmcueee_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "VZR:8.6616,49.41449,8.7311,49.3942")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "surface")
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
	public void test_1jefebohlxiyh_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.686,49.428,8.745,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "maxspeed,smoothness")
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
	public void test_vb3j2s28osir_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Q:8.661,49.425,8.7245,49.38243|bPFo:8.655714,49.410,8.729,49.387")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-03-22")
				.queryParam("timeout", "48")
				.queryParam("groupByKeys", "foot,building")
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
	public void test_urrwfvqe4jzn_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "w:8.653,49.421,8.722,49.386")
				.queryParam("groupByKeys", "destination,lit,highway")
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
	public void test_urjlu3kqkf8y_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "K:8.698,49.417480,8.729,49.388|k:8.658,49.4195,8.733,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2013-10-02")
				.queryParam("timeout", "69")
				.queryParam("groupByKeys", "addr:postcode,addr:street")
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
	public void test_qhtett33sl0m_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-05-26")
				.queryParam("groupByKeys", "highway,maxspeed")
				.queryParam("bcircles", "8.7027,49.430,4")
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
	public void test_1if11ww253wag_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "d:8.673,49.419,8.7590,49.393668")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-08-24")
				.queryParam("timeout", "98")
				.queryParam("groupByKeys", "lanes:forward,turn:lanes")
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
	public void test_qdpxq6ve54xl_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6825,49.427,8.705,49.399")
				.queryParam("format", "json")
				.queryParam("time", "2013-03-10")
				.queryParam("groupByKeys", "landuse")
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
	public void test_qhq2eailsu2g_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-01-03")
				.queryParam("bpolys", "ypDaF:8.704561,49.403252,8.743,49.4040,8.705,49.4340,8.711,49.419,8.704561,49.403252|r:8.704561,49.403252,8.711,49.427,8.705120,49.42196,8.704179,49.4192,8.704561,49.403252|iqOJc:8.704561,49.403252,8.741,49.43663,8.7084,49.4275,8.7133,49.4382,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_vf0wobfmtuna_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "100")
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
	public void test_1ji4hwx5k6des_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "crossing,station")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-11-30")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.71080,49.407,7|8.732,49.42926,760")
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
	public void test_1iv11xs63u5gx_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "bdTPT:8.678,49.406,8.701,49.3815")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2016-11-30")
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
	public void test_s15ly2trmicl_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,primary")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Bh:8.704561,49.403252,8.741862,49.416,8.728,49.41545,8.747,49.438,8.704561,49.403252|RU:8.704561,49.403252,8.743,49.421,8.734841,49.43297,8.7293,49.416,8.704561,49.403252")
				.queryParam("timeout", "67")
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
	public void test_rhtzpdjp8rxh_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,office,hut")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FWP\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.41663],[8.70892,49.416],[8.7036,49.408],[8.704561,49.403252]]]}}]}")
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
	public void test_1jy276ihzb12w_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.729,49.4338,5|8.709,49.416,2")
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
	public void test_r1cw12u2tzdw_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "public,civic,stop_line")
				.queryParam("bboxes", "Ip:8.692,49.420722,8.7427,49.393|Os:8.653,49.4023,8.715,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("timeout", "96")
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
	public void test_r1l5ect5bu5d_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "steps,yes")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "eOuA:8.705,49.41360,83|t:8.714,49.415,582")
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
	public void test_1hb7o5b6c1h7o_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage")
				.queryParam("bboxes", "8.665,49.4087,8.757801,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("timeout", "37")
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
	public void test_qdq0e1e8udrk_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-12-10")
				.queryParam("timeout", "54")
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
	public void test_s18brz2ejxgw_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.688,49.404,8.757424,49.397|8.683,49.41015,8.73938,49.388")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "8.72888,49.4120,8")
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
	public void test_s1b38cvbxi5s_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "bus_stop,service,secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-12-24")
				.queryParam("bpolys", "Jc:8.704561,49.403252,8.713089,49.430,8.70890,49.430,8.701,49.43034,8.704561,49.403252|J:8.704561,49.403252,8.706,49.4003,8.738,49.412,8.7041,49.412,8.704561,49.403252|ZxPQH:8.704561,49.403252,8.735234,49.4076,8.7045,49.423933,8.70290,49.423,8.704561,49.403252")
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
	public void test_1hrbekjlb9lyb_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("bpolys", "Wv:8.704561,49.403252,8.714,49.424,8.707,49.432,8.7310,49.413,8.704561,49.403252|X:8.704561,49.403252,8.71887,49.43173,8.71536,49.4310,8.711,49.425,8.704561,49.403252|zsCZV:8.704561,49.403252,8.737057,49.4188,8.7063,49.4172,8.727,49.435,8.704561,49.403252")
				.queryParam("timeout", "98")
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
	public void test_ubj5vx1j6rmt_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,service")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-06-03")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "8.749,49.41075,7|8.703,49.418,4|8.7295,49.438,6|8.727,49.41336,728895638698")
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
	public void test_1iykj3y9z6eea_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7006,49.420,8.704,49.418,8.701,49.4251,8.704561,49.403252|8.704561,49.403252,8.72456,49.438,8.710797,49.4054,8.704576,49.42200,8.704561,49.403252|8.704561,49.403252,8.71385,49.407,8.707457,49.4077,8.7037,49.4394,8.704561,49.403252")
				.queryParam("timeout", "22")
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
	public void test_1iemqo60s34o1_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-12-06")
				.queryParam("bpolys", "bYNL:8.704561,49.403252,8.74263,49.411,8.7045,49.4009,8.700,49.40507,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_1iuspu6efgqwh_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,emergency_access_point")
				.queryParam("bboxes", "jXP:8.668,49.422,8.73179,49.3874|ePVGb:8.692,49.4258,8.7294,49.3843|N:8.6528,49.418,8.752,49.3818")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-03-05")
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
	public void test_r1l7a5vzajp5_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "NQC:8.664155,49.422,8.702,49.383|J:8.655,49.409,8.706375,49.398")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("time", "2014-12-08")
				.queryParam("timeout", "73")
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
	public void test_urp6m9cl0bxi_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "bus_stop,ship")
				.queryParam("bboxes", "sBsm:8.664,49.41053,8.71405,49.382|Qe:8.680,49.408,8.702,49.387|k:8.6811,49.41913,8.757,49.3924|t:8.682,49.413,8.737,49.380625")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
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
	public void test_to4kjx3ixxdj_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and id:(1 .. 9999)")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2008-12-13")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "8.742,49.429,2|8.700,49.4356,99|8.727,49.410,87|8.744,49.4262,682901132")
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
	public void test_1ibesw7s0b9eq_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-06-25")
				.queryParam("bcircles", "8.7038,49.4338,16|8.709031,49.41324,421")
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
	public void test_1jeyuoydlalo1_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-10-21")
				.queryParam("bpolys", "P:8.704561,49.403252,8.7320,49.4059,8.70263,49.4167,8.704,49.4248,8.704561,49.403252")
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
	public void test_1h7ftmvxsqqes_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("time", "2011-03-15")
				.queryParam("bpolys", "nxV:8.704561,49.403252,8.717,49.4240,8.704,49.429918,8.714,49.403,8.704561,49.403252|ISl:8.704561,49.403252,8.717,49.4272,8.708,49.4363,8.707,49.4017,8.704561,49.403252|gSyA:8.704561,49.403252,8.711,49.435860,8.703,49.4344,8.7447,49.415,8.704561,49.403252")
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
	public void test_1h7qyd6dg79km_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("bcircles", "E:8.74500,49.4372,5")
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
	public void test_trtkhpx7i2ph_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "2015-05-08")
				.queryParam("bpolys", "8.704561,49.403252,8.7073,49.4088,8.727,49.4320,8.737,49.416,8.704561,49.403252|8.704561,49.403252,8.716,49.4027,8.70356,49.40576,8.700,49.414,8.704561,49.403252|8.704561,49.403252,8.708177,49.430,8.70666,49.419,8.710,49.4278,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_qhq33jpx7z1v_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2016-01-25")
				.queryParam("bpolys", "S:8.704561,49.403252,8.726653,49.433546,8.70398,49.43911,8.703,49.438,8.704561,49.403252|EWri:8.704561,49.403252,8.741114,49.4240,8.7226,49.43007,8.702,49.405,8.704561,49.403252")
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
	public void test_rkzm2qxs4y0k_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "WKfYL:8.69887,49.412,8.755,49.393")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-12-17")
				.queryParam("timeout", "92")
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
	public void test_1ieyawy4tfuch_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2007-12-04")
				.queryParam("bpolys", "Nz:8.704561,49.403252,8.740,49.414,8.7369,49.435,8.704515,49.438,8.704561,49.403252|n:8.704561,49.403252,8.70208,49.432,8.707,49.411,8.715,49.406,8.704561,49.403252")
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
	public void test_r1cu2tasi434_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or type:way and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.735,49.428,7|8.7468,49.404,2|8.7279,49.4272,8|8.7201,49.42489,2170652473")
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
	public void test_s4umcs628x81_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* or type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "erVht:8.6817,49.405,8.7373,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7136,49.40863],[8.734,49.40328],[8.70458,49.414],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "46")
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
	public void test_to7dez9om04z_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "n:8.656,49.409,8.742653,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("timeout", "33")
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
	public void test_s10l3uf7lv8m_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* or type:node")
				.queryParam("bcircles", "t:8.7374,49.419,8")
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
	public void test_qhl1vggaz0iq_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-07-19")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "T:8.728727,49.430,194")
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
	public void test_qhqlf1u7nk8l_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6816,49.404,8.744,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-06-15")
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
	public void test_u87znn5nk6lh_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2014-05-14")
				.queryParam("bpolys", "8.704561,49.403252,8.73935,49.426,8.70297,49.408,8.729,49.435,8.704561,49.403252|8.704561,49.403252,8.708,49.40417,8.70427,49.433,8.73284,49.432231,8.704561,49.403252|8.704561,49.403252,8.7151,49.406508,8.732,49.430,8.744,49.4043,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_vbbwnxv7v390_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-09-07")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "8.709,49.427,105084449|8.704,49.412851,23|8.748,49.425,41")
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
	public void test_1h7lgp3h2rjnc_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=*")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-09-29")
				.queryParam("bcircles", "lXQrZ:8.716088,49.4020,9")
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
	public void test_1ji4ip2yqdv7b_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* or geometry:point or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-04-03")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "yuxvn:8.720619,49.405213,5|rJwnc:8.7325,49.405,7")
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
	public void test_u7u1nx7biipe_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and not area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bpolys", "OVFDi:8.704561,49.403252,8.741,49.425990,8.746443,49.411,8.71683,49.40555,8.704561,49.403252")
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
	public void test_soccsjojugxh_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "AKT:8.6530,49.4168,8.722,49.387|wqGV:8.671,49.415,8.708,49.380")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "JX:8.704561,49.403252,8.7129,49.4303,8.715,49.4035,8.708,49.421,8.704561,49.403252|lJ:8.704561,49.403252,8.706,49.409,8.7069,49.4320,8.7189,49.4135,8.704561,49.403252|bcXLX:8.704561,49.403252,8.7024,49.434778,8.719,49.414,8.706901,49.435,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "LTtx:8.733,49.40501,6|c:8.74318,49.43373,5")
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
	public void test_qe9cux146kpu_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=*")
				.queryParam("bboxes", "Em:8.654225,49.405,8.735,49.394")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-07-02")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "81")
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
	public void test_1iyeyryi32otx_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "sHwr:8.693,49.419033,8.738,49.395")
				.queryParam("types2", "line,polygon,other")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "addr:postcode=* and geometry:polygon or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "82")
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
	public void test_1jicu0udtjb5f_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("filter2", "landuse!=* or type:way and length:( .. 100)")
				.queryParam("bcircles", "8.745,49.435259,2")
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
	public void test_vbsijcgbal9y_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,")
				.queryParam("format", "json")
				.queryParam("filter2", "maxspeed=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "25")
				.queryParam("values2", "living_street")
				.queryParam("bcircles", "8.736,49.409,6|8.701,49.42710,7")
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
	public void test_1iay52p7nzdd0_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("format", "json")
				.queryParam("time", "2013-02-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Sp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7461,49.4327],[8.7042,49.436870],[8.708,49.4008],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "21")
				.queryParam("values2", "footway")
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
	public void test_qdss5tak4pk3_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("filter2", "addr:street=* and id:(1 .. 9999)")
				.queryParam("bcircles", "8.733,49.416,8|8.7365,49.424206,9")
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
	public void test_qdspw3g0z22h_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "foot=* and not type:relation")
				.queryParam("time", "2010-03-02")
				.queryParam("keys2", "highway")
				.queryParam("values2", "cycleway")
				.queryParam("bcircles", "sk:8.7003,49.436,18")
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
	public void test_vf1dw8znl2rc_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("filter2", "maxspeed!=* and length:( .. 100)")
				.queryParam("time", "2009-08-17")
				.queryParam("bpolys", "M:8.704561,49.403252,8.730,49.414,8.7098,49.408,8.702,49.422829,8.704561,49.403252|lBVRJ:8.704561,49.403252,8.7236,49.428,8.700883,49.420,8.747,49.401,8.704561,49.403252|Hr:8.704561,49.403252,8.723,49.43729,8.7043,49.407,8.704594,49.40812,8.704561,49.403252")
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
	public void test_1ib99qaxyrhv9_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "tAJg:8.704561,49.403252,8.747,49.4138,8.715,49.4357,8.736,49.417415,8.704561,49.403252|Qiqup:8.704561,49.403252,8.746,49.400,8.7368,49.434,8.735,49.430574,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_s4p1bcj21sms_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.705,49.433,8.703,49.4110,8.729,49.41509,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "living_street")
				.queryParam("bcircles", "8.701,49.420,3|8.7409,49.420,60")
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
	public void test_1jed61br8jupk_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("time", "2016-06-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TjHeJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713,49.4376],[8.7034,49.4305],[8.723,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.435],[8.748,49.407],[8.741,49.402771],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"iv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.429824],[8.704635,49.4122],[8.7045,49.403],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
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
	public void test_u8dg0r3p8854_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "service=driveway or type:relation or id:(1 .. 9999)")
				.queryParam("time", "2017-08-05")
				.queryParam("bpolys", "jor:8.704561,49.403252,8.729,49.409,8.73869,49.4141,8.729,49.41970,8.704561,49.403252|bPU:8.704561,49.403252,8.702,49.433,8.722,49.413,8.734,49.427,8.704561,49.403252|I:8.704561,49.403252,8.72604,49.40503,8.7347,49.406,8.7297,49.414083,8.704561,49.403252")
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
	public void test_uvk78xirgbw5_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "name!=* or not type:way")
				.queryParam("time", "2008-11-29")
				.queryParam("bpolys", "8.704561,49.403252,8.722142,49.407,8.70654,49.401,8.7068,49.4248,8.704561,49.403252|8.704561,49.403252,8.7137,49.435904,8.7069,49.436,8.725,49.4326,8.704561,49.403252|8.704561,49.403252,8.7440,49.422,8.7032,49.4287,8.718,49.410,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_vey5ofw1v2uv_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "maxspeed=* and not length:( .. 100)")
				.queryParam("time", "2012-08-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"DYqeY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7146,49.4189],[8.712082,49.4261],[8.701,49.4343],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "living_street")
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
	public void test_1h7ilvj5zfsqg_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("filter2", "oneway=* and not area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.740,49.4184,5")
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
	public void test_1jy4zq2q160yq_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "cycleway")
				.queryParam("time", "2014-03-12")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
				.queryParam("bcircles", "SGg:8.727,49.42553,6|j:8.7296,49.402,1")
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
	public void test_vbheqbc7rz39_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wXh:8.678,49.403,8.75183,49.393")
				.queryParam("keys", "highway")
				.queryParam("time", "2011-07-18")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "37")
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
	public void test_s4ru97obzexu_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("format", "json")
				.queryParam("time", "2007-12-22")
				.queryParam("bcircles", "RK:8.743,49.432,4")
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
	public void test_1iyq0b90gjo82_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* or not id:(1 .. 9999)")
				.queryParam("types2", "node,relation")
				.queryParam("time", "2014-03-12")
				.queryParam("bpolys", "LvSdk:8.704561,49.403252,8.7141,49.407756,8.701,49.4384,8.7069,49.422,8.704561,49.403252|lEQ:8.704561,49.403252,8.748,49.406,8.70916,49.42074,8.7371,49.42250,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "96")
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
	public void test_qxtdjm9t5pv4_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "R:8.69547,49.41080,8.7543,49.396")
				.queryParam("format", "json")
				.queryParam("filter2", "network!=* or not length:( .. 100)")
				.queryParam("values2", "platform")
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
	public void test_vbprm77sfo84_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and geometry:point and id:(1 .. 9999)")
				.queryParam("types2", "point,line,other")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "addr:housenumber=* and id:(1 .. 9999)")
				.queryParam("time", "2008-10-25")
				.queryParam("bpolys", "ncU:8.704561,49.403252,8.7010,49.4095,8.7095,49.42299,8.7107,49.4158,8.704561,49.403252|ER:8.704561,49.403252,8.73732,49.431,8.7133,49.400,8.714,49.424,8.704561,49.403252")
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
	public void test_1h7ooubhr3a05_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=* and type:node and length:( .. 100)")
				.queryParam("types2", "other")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "service=driveway or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "XlCjM:8.7007,49.404,7|M:8.723,49.40633,7|SujxS:8.709,49.413,9|DzZf:8.743042,49.430,2")
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
	public void test_1h7x05yyqc7za_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "building!=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("bpolys", "TJztI:8.704561,49.403252,8.7167,49.424,8.708,49.40491,8.725,49.41500,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "47")
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
	public void test_u87yer6go181_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "2009-09-20")
				.queryParam("bpolys", "DBZjW:8.704561,49.403252,8.716,49.417,8.739,49.4373,8.709,49.417,8.704561,49.403252")
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
	public void test_1huzzu49ruhiu_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "R:8.69547,49.41080,8.7543,49.396")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
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
	public void test_us31hsf5oi7o_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and not id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("filter2", "bicycle=* and geometry:point")
				.queryParam("bpolys", "jw:8.704561,49.403252,8.720836,49.411,8.720,49.433,8.70269,49.415,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_r1a1uhmizg3c_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("filter2", "ref=* or length:( .. 100)")
				.queryParam("bpolys", "fWeKp:8.704561,49.403252,8.7367,49.439,8.70520,49.410,8.726,49.426,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_1iykhy0jefcdf_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("time", "2015-08-10")
				.queryParam("bpolys", "Td:8.704561,49.403252,8.731,49.402,8.728,49.40905,8.702280,49.409,8.704561,49.403252|vtcB:8.704561,49.403252,8.704,49.405,8.710,49.413,8.716364,49.429,8.704561,49.403252|dRw:8.704561,49.403252,8.72093,49.4042,8.70992,49.428462,8.73325,49.439405,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "74")
				.queryParam("values2", "stop_line")
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
	public void test_1iyq1k5dj3o86_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* and type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "Ff:8.693,49.4230,8.73169,49.387")
				.queryParam("types2", "point,polygon,")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "ref!=* and id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "100")
				.queryParam("values2", "traffic_signals")
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
	public void test_1jig260pyfvp4_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=*")
				.queryParam("bboxes", "vCE:8.6784,49.405,8.741,49.38264")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("time", "2011-08-07")
				.queryParam("values2", "path")
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
	public void test_1hv8adz0177ee_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and type:relation or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("filter2", "maxspeed!=* or geometry:line")
				.queryParam("bcircles", "8.7371,49.40288,4")
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
	public void test_qe75cmi8h839_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and type:way or not length:( .. 100)")
				.queryParam("bboxes", "8.656,49.421,8.7576,49.385|8.691,49.4039,8.755,49.396")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-12-27")
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
	public void test_qdvh7l9uaiwn_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:country=* or geometry:line")
				.queryParam("types2", "line,other")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-09-08")
				.queryParam("keys2", "highway")
				.queryParam("values2", "turning_circle")
				.queryParam("bcircles", "C:8.726,49.4395,14|sROmz:8.70435,49.4038,2|BZ:8.7452,49.438,2|E:8.7364,49.4226,13")
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
	public void test_ubrg1gtu0oyt_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "platform")
				.queryParam("bcircles", "8.74430,49.405,4|8.711,49.416933,18|8.722,49.418,24|8.7160,49.42780,45286846267")
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
	public void test_1ibjs6n9o1yr7_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* or length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "network=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2017-07-23")
				.queryParam("bpolys", "8.704561,49.403252,8.723,49.43753,8.7362,49.412,8.7044,49.4114,8.704561,49.403252")
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
	public void test_1ibbjl9wdp4yr_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or length:( .. 100)")
				.queryParam("bboxes", "zllaZ:8.655,49.402,8.751,49.3805")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
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
	public void test_u7wszgzvros2_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "node,")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "network=* and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "8.707,49.426,1")
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
	public void test_vbkp55mwgbaw_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.727,49.421,7")
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
	public void test_s4sciayf72ur_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "n:8.689,49.402,8.735,49.390")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("format", "json")
				.queryParam("time", "2009-09-23")
				.queryParam("timeout", "60")
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
	public void test_s4p18hwnzmg4_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-02-09")
				.queryParam("bpolys", "nk:8.704561,49.403252,8.723,49.4136,8.731052,49.4392,8.716,49.41520,8.704561,49.403252|l:8.704561,49.403252,8.71570,49.43993,8.70226,49.418,8.740633,49.4204,8.704561,49.403252|EBP:8.704561,49.403252,8.731,49.43808,8.707,49.431,8.705,49.426,8.704561,49.403252")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "IhU:8.736,49.402,1")
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
	public void test_1iepfbrdjm15v_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and not area:(1.0 .. 1E6)")
				.queryParam("time", "2010-12-31")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "8.719,49.411,23|8.71998,49.4193,6")
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
	public void test_vf3q2ugsxnj5_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2011-04-07")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "n:8.7277,49.435,5|tE:8.710,49.4260,909|xLc:8.7000,49.4331,9172636656")
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
	public void test_ubgdc6x6cs3b_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "L:8.680,49.429,8.7006,49.399|VlbMN:8.686748,49.409,8.7296,49.388|q:8.6647,49.4165,8.70037,49.3989|CI:8.6532,49.40256,8.723,49.38751")
				.queryParam("format", "json")
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
	public void test_1iuvfl6eguan7_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "WKFPL:8.682188,49.428,8.757745,49.396")
				.queryParam("time", "2012-11-18")
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
	public void test_sok32r6g38kz_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "STXm:8.650,49.4296,8.7523,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "2016-07-17")
				.queryParam("timeout", "34")
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
	public void test_to7uke0w7aee_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "r:8.657225,49.419,8.7291,49.382")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-08-14")
				.queryParam("timeout", "90")
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
	public void test_1huzy7eq2ufjr_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.664,49.408708,8.7475,49.396")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-04-24")
				.queryParam("timeout", "62")
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
	public void test_qdpytr0pvnsj_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("time", "2014-05-12")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "eGt:8.744,49.414,1|i:8.743797,49.420,3")
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
	public void test_toddes6gjqk5_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn!=* and geometry:line")
				.queryParam("bboxes", "d:8.682,49.41632,8.728,49.390")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "22")
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
	public void test_vey5aomi6r09_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=*")
				.queryParam("bboxes", "sf:8.672,49.407,8.746,49.392|V:8.691361,49.423,8.709,49.39358")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "N:8.7248,49.407,6")
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
	public void test_r1dce3vy4l7p_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* and length:( .. 100)")
				.queryParam("time", "2017-08-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7370,49.401],[8.731,49.4255],[8.704566,49.400],[8.704561,49.403252]]]}}]}")
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
	public void test_r17ch1p9hf78_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XL:8.686,49.400,8.7015,49.382063|DN:8.685,49.4138,8.71559,49.3973|feKX:8.668,49.428,8.722,49.3963")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("time", "2008-02-27")
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
	public void test_qxw4jfviy6ur_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.689,49.419,8.72081,49.3833|8.673,49.4122,8.7562,49.383|8.69039,49.403688,8.731,49.391")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-07-02")
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
	public void test_1jei8if9rgvhf_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-05-31")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "MJH:8.74649,49.435,9|luFCW:8.7370,49.418,9")
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
	public void test_1jiai880q8x83_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.656,49.428,8.730,49.3808|8.689,49.418,8.713,49.381|8.69540,49.419,8.75971,49.3986|8.696065,49.41359,8.72713,49.39862")
				.queryParam("time", "2015-09-10")
				.queryParam("timeout", "52")
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
	public void test_qe11525ros4j_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("bpolys", "ow:8.704561,49.403252,8.703,49.431,8.739,49.407,8.7144,49.439923,8.704561,49.403252")
				.queryParam("timeout", "100")
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
	public void test_1iepig0945rhf_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cN:8.69235,49.4191,8.727,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
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
	public void test_rl7x0liy6z3p_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-12-09")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "8.710,49.428,2")
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
	public void test_rh8ank6m3t4m_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("time", "2017-06-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.423565],[8.719401,49.419],[8.704,49.416],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IrWE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.417698],[8.749,49.4258],[8.7097,49.421],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "49")
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
	public void test_s4xxlxjzvwiq_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or not length:( .. 100)")
				.queryParam("bboxes", "8.65609,49.402,8.70886,49.390")
				.queryParam("time", "2017-12-31")
				.queryParam("bcircles", "Gq:8.737,49.435,7")
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
	public void test_trww7r225yrb_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("bcircles", "z:8.725,49.4213,9|g:8.731,49.40293,3|CN:8.741264,49.403,4")
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
	public void test_s164c61jmtet_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.7353,49.416,53|8.722,49.409,11|8.7146,49.437,1|8.735,49.43852,2")
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
	public void test_s4m9h1v3laur_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=*")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "Kmsou:8.7201,49.422,3")
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
	public void test_1ibeskp2qwbw0_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "prnsQ:8.70312,49.414,7")
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
	public void test_rl53obffvkgz_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and type:relation")
				.queryParam("bboxes", "8.669,49.410,8.7329,49.3971|8.6613,49.411,8.715,49.3814|8.671,49.4182,8.75950,49.383|8.687,49.420461,8.712,49.390")
				.queryParam("format", "csv")
				.queryParam("time", "2009-03-09")
				.queryParam("timeout", "57")
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
	public void test_1jeffvwiu1ht2_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6825,49.40903,8.750,49.391|8.6941,49.4021,8.712,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
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
	public void test_vb6unq0l3nzs_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "O:8.711,49.438,469")
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
	public void test_1hr877b34eiqs_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:node and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-04-15")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "8.7212,49.4243,1")
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
	public void test_rh51cjzsti60_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "osfle:8.704561,49.403252,8.70159,49.438,8.71351,49.419,8.721,49.422,8.704561,49.403252|KqOZX:8.704561,49.403252,8.748883,49.4226,8.7038,49.400,8.717,49.434,8.704561,49.403252|tn:8.704561,49.403252,8.7394,49.424,8.71629,49.407,8.747,49.408,8.704561,49.403252")
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
	public void test_urp65ni634gx_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "b:8.653321,49.404,8.7246,49.387")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "jU:8.704561,49.403252,8.7448,49.437,8.737,49.421,8.7027,49.427514,8.704561,49.403252|w:8.704561,49.403252,8.749,49.4013,8.705,49.417,8.7402,49.422,8.704561,49.403252")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "Cq:8.725759,49.4298,82")
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
	public void test_tonxex0ugj1g_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.71952,49.410,318")
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
	public void test_1k1r8r19qpo3b_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7291,49.401,8.704,49.410,8.73376,49.4204,8.704561,49.403252")
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
	public void test_t4f3ctsio2es_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* or not length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "fx:8.704561,49.403252,8.7369,49.4211,8.74562,49.435,8.730031,49.4345,8.704561,49.403252|P:8.704561,49.403252,8.720,49.419,8.701,49.430,8.7092,49.43815,8.704561,49.403252")
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
	public void test_u7xdn1up0mk9_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.676,49.426,8.70506,49.394|8.696774,49.429,8.700,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2008-05-07")
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
	public void test_qe75cus8lk50_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2015-01-19")
				.queryParam("bpolys", "r:8.704561,49.403252,8.736,49.432,8.704056,49.4138,8.738,49.418,8.704561,49.403252")
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
	public void test_1jet9z9pu00gz_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-01-23")
				.queryParam("bcircles", "zdEFO:8.742,49.4233,427|ddkMa:8.7104,49.42293,575733855")
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
	public void test_ubp71x701yd3_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "o:8.697,49.4159,8.752,49.395|MRNap:8.655,49.414881,8.70538,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
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
	public void test_rhg4twhrz8s0_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("bpolys", "Ja:8.704561,49.403252,8.733142,49.42141,8.7076,49.433,8.736,49.424,8.704561,49.403252|nqVq:8.704561,49.403252,8.7273,49.401,8.7061,49.41662,8.704,49.413,8.704561,49.403252|lST:8.704561,49.403252,8.744,49.432,8.721,49.4344,8.706,49.419,8.704561,49.403252")
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
	public void test_t4qoe67ky2pi_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.654,49.41069,8.747,49.396|8.694,49.401,8.730,49.3940")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("timeout", "45")
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
	public void test_s18vc5jf7ome_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk!=* and id:(1 .. 9999)")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "83")
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
	public void test_sonecca52o1e_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "dYXwz:8.698,49.421213,8.74813,49.397")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-03-05")
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
	public void test_s1gpg12r2nug_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-04-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711144,49.423],[8.718,49.438],[8.700,49.423],[8.704561,49.403252]]]}}]}")
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
	public void test_u7rujs429xkg_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("timeout", "71")
				.queryParam("bcircles", "fD:8.701,49.4310,86")
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
	public void test_r1lnbq8ryzxd_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "edO:8.693,49.41487,8.7287,49.393|vnt:8.67769,49.418,8.751,49.38988|w:8.6974,49.429,8.73035,49.387|F:8.6793,49.411191,8.70267,49.389")
				.queryParam("time", "2010-02-14")
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
	public void test_sohdpmopn5tk_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SBlaL:8.693,49.4240,8.703,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "geojson")
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
	public void test_1jeqi75n6dsv8_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "k:8.741,49.430,7")
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
	public void test_qxljd5ntjgvq_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and not geometry:line")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "hNhC:8.741,49.4118,5")
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
	public void test_t4w75va91c9x_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or not type:way")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.420],[8.700,49.42892],[8.70309,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700184,49.43002],[8.728,49.423],[8.709436,49.410],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "94")
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
	public void test_qe75cus0em9h_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-27")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.424,8.713,49.427,8.7106,49.43477,8.704561,49.403252")
				.queryParam("timeout", "94")
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
	public void test_qdybbpq3zlf9_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-12-17")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "8.723,49.4191,9|8.7167,49.40266,37")
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
	public void test_1hrjrizs2ob4y_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2014-03-01")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.40866,8.705,49.410,8.713,49.4142,8.704561,49.403252|8.704561,49.403252,8.729,49.412468,8.74985,49.420408,8.71391,49.424,8.704561,49.403252")
				.queryParam("timeout", "98")
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
	public void test_qhiay39xwjzl_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-20")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "Kznr:8.700,49.409,3")
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
	public void test_1h7ftpgcbhbok_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=* and not length:( .. 100)")
				.queryParam("time", "2013-09-14")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "Q:8.72372,49.4120,3|uPyW:8.707,49.417,1")
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
	public void test_qhtdl51it1rk_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2013-06-22")
				.queryParam("bpolys", "Rq:8.704561,49.403252,8.722,49.4090,8.700788,49.4168,8.7473,49.421,8.704561,49.403252|U:8.704561,49.403252,8.728,49.412,8.704579,49.418960,8.722,49.407,8.704561,49.403252|x:8.704561,49.403252,8.70216,49.416870,8.7017,49.404,8.70455,49.4124,8.704561,49.403252")
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
	public void test_1jia1dxs8grhw_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "58")
				.queryParam("bcircles", "8.736,49.401,1")
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
	public void test_1k2017rb1d0tf_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ZH:8.681,49.408953,8.7270,49.3839")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-04-23")
				.queryParam("timeout", "50")
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
	public void test_s1633jl0hzs1_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "gF:8.704561,49.403252,8.7166,49.427,8.716,49.401026,8.737,49.4289,8.704561,49.403252|T:8.704561,49.403252,8.714241,49.40857,8.712459,49.405,8.743,49.425017,8.704561,49.403252")
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
	public void test_1hrriyt6kzsj8_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "eUmRT:8.693,49.415389,8.707751,49.38025|naH:8.6766,49.422,8.711,49.393813")
				.queryParam("format", "json")
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
	public void test_r17subx2vsrn_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or length:( .. 100)")
				.queryParam("bboxes", "q:8.655,49.4008,8.742,49.3938")
				.queryParam("showMetadata", "yes")
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
	public void test_to52erdaubfn_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,service,steps")
				.queryParam("bboxes", "TmCVk:8.686,49.415,8.746,49.3800|NmQZU:8.694,49.4112,8.722,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "8.701,49.411,7|8.749880,49.430,7")
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
	public void test_urrv7bkjxp43_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-02-15")
				.queryParam("bcircles", "BEB:8.7213,49.4371,3")
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
	public void test_s4v3vzrgs86e_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,residential,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "BxmY:8.7137,49.4144,8|V:8.725,49.400,53")
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
	public void test_qhhsmp4jt06r_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "commercial,office")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2013-05-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JWh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7093,49.4306],[8.743,49.431],[8.718,49.431],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"vi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.716,49.433],[8.7391,49.421839],[8.7073,49.41763],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "31")
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
	public void test_1h7lgay22e2wm_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bcircles", "W:8.747,49.407,9")
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
	public void test_vf98untgrlgj_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.680,49.427,8.7168,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
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
	public void test_1jei79nm9yre9_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,cycleway,construction")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-07-28")
				.queryParam("bpolys", "8.704561,49.403252,8.714,49.4108,8.73235,49.433,8.710,49.422,8.704561,49.403252")
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
	public void test_uruoluzj80tz_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.743,49.405,8.704596,49.414,8.712,49.421,8.704561,49.403252")
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
	public void test_1jym3iyc22a7l_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp,hut,residential")
				.queryParam("filter", "sidewalk!=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "x:8.704561,49.403252,8.7484,49.41311,8.7032,49.4071,8.747,49.420,8.704561,49.403252|ZS:8.704561,49.403252,8.72192,49.425,8.713,49.410,8.709205,49.421,8.704561,49.403252|aJ:8.704561,49.403252,8.7245,49.406173,8.706188,49.427285,8.703689,49.438726,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_skpjwyv97tiu_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gqwtz:8.672,49.4014,8.7151,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2009-10-17")
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
	public void test_r1a1uhl2z0og_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "xu:8.686386,49.417,8.746,49.380|uxT:8.6923,49.407,8.72558,49.393426|FL:8.6587,49.4252,8.742,49.39352")
				.queryParam("groupByKey", "building")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("time", "2012-01-30")
				.queryParam("bpolys", "YxCb:8.704561,49.403252,8.733,49.434,8.715211,49.414032,8.703,49.419,8.704561,49.403252")
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
	public void test_1ien6q0mbyo1e_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-10-17")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.431146,8.749,49.403,8.7044,49.4361,8.704561,49.403252|8.704561,49.403252,8.70832,49.437,8.704,49.432,8.747398,49.430,8.704561,49.403252")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "d:8.7069,49.438,90")
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
	public void test_vb925vw3t06w_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.438],[8.70108,49.4024],[8.7404,49.42677],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "59")
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
	public void test_1iv1k6nw8dohc_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "G:8.650,49.4018,8.7177,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-02-03")
				.queryParam("timeout", "31")
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
	public void test_rhlmtnko7w3c_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2008-07-06")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.406,8.729,49.405,8.726,49.425,8.704561,49.403252")
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
	public void test_urejhvyhuiih_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* and not id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.405989],[8.706713,49.4278],[8.703,49.4279],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "33")
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
	public void test_1jy4x02whjj36_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,garage,primary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-06-29")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "8.7376,49.406,4")
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
	public void test_ubj5w10rbgit_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,demolished")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-11-24")
				.queryParam("bcircles", "NH:8.714,49.421481,81")
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
	public void test_t87dup3igp5y_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hotel,hospital")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.739,49.4296,5")
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
	public void test_1h7lwqte7m1ww_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,give_way,unclassified")
				.queryParam("bboxes", "JG:8.683,49.424346,8.720,49.391|H:8.662,49.407,8.712,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "false")
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
	public void test_ts2faraeazp0_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,platform,traffic_signals")
				.queryParam("bboxes", "VEK:8.677,49.4155,8.702,49.3948|IwB:8.697,49.429,8.75536,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-10-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Di\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.408],[8.704560,49.402],[8.739,49.4099],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "76")
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
	public void test_1jyirk5k7m0c3_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-03-19")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "jSY:8.7099,49.43272,24|fU:8.733,49.4261,4|A:8.7214,49.4266,42|oJOZ:8.737,49.433,3")
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
	public void test_qdvjxhketwf8_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "footway,apartments")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.7060,49.439,8|8.713,49.4344,8|8.746,49.42686,5|8.715,49.439750,745995199")
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
	public void test_rhug2zwt2hpv_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-02-16")
				.queryParam("timeout", "100")
				.queryParam("bcircles", "D:8.710,49.414,8|Pk:8.725,49.4079,9|O:8.743,49.4121,60")
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
	public void test_u7u4066j9w6r_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,secondary_link,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-05-21")
				.queryParam("bcircles", "ihs:8.717,49.429989,90|WKX:8.746545,49.40130,4|RxgYS:8.734,49.423768,2")
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
	public void test_1iesrfnbm4dwj_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* or type:relation")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "qHtfJ:8.7246,49.421,2|kK:8.718,49.4398,3|tC:8.703,49.405,5")
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
	public void test_1iukci0jafsj7_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "o:8.692,49.42451,8.7269,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-05-07")
				.queryParam("timeout", "26")
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
	public void test_1hr5cp9hs748k_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "IUVe:8.704561,49.403252,8.722,49.4371,8.700,49.433,8.708610,49.407221,8.704561,49.403252")
				.queryParam("timeout", "96")
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
	public void test_sl8zkpbwaib9_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* and not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-10-17")
				.queryParam("bpolys", "IZocj:8.704561,49.403252,8.71709,49.423,8.726989,49.4388,8.7097,49.42171,8.704561,49.403252|Gx:8.704561,49.403252,8.7394,49.410,8.709913,49.411,8.70869,49.4224,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_skmu2qgecy1x_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,steps,hospital")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7316,49.405],[8.700,49.423],[8.711502,49.413],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"nT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72513,49.404],[8.703,49.415],[8.720,49.407],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "40")
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
	public void test_qeffwfn26a1v_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.690,49.417,8.754,49.391|8.682,49.419064,8.701,49.392|8.674,49.40764,8.7196,49.39558")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-05-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720804,49.430729],[8.7472,49.41077],[8.73320,49.43890],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"RtS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729377,49.4056],[8.704,49.40672],[8.704,49.43429],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.419],[8.705,49.4178],[8.704,49.421],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "skxi:8.7482,49.42190,3|D:8.733,49.41593,3|dd:8.711,49.416,7")
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
	public void test_1iyns1atxs2eo_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "bus_stop")
				.queryParam("bboxes", "8.679942,49.40254,8.757,49.390")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "w:8.704561,49.403252,8.732,49.424,8.70470,49.417,8.719,49.4005,8.704561,49.403252|Dxfu:8.704561,49.403252,8.731,49.409,8.706,49.407,8.704,49.436,8.704561,49.403252|O:8.704561,49.403252,8.7188,49.418,8.7145,49.412,8.749,49.4077,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_t4l3qlqm9yk7_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6633,49.41243,8.71833,49.399|8.6942,49.417595,8.7407,49.380|8.672,49.417,8.74443,49.3967|8.69055,49.4236,8.7260,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-05-02")
				.queryParam("timeout", "63")
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
	public void test_1iv3s5rsicnjt_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* and geometry:point or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2008-03-18")
				.queryParam("bpolys", "R:8.704561,49.403252,8.738,49.4095,8.7334,49.4299,8.7049,49.410709,8.704561,49.403252|b:8.704561,49.403252,8.710,49.426,8.71608,49.41173,8.727,49.4266,8.704561,49.403252|mBSec:8.704561,49.403252,8.72760,49.411,8.744,49.422,8.70901,49.437,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_sok5hiizlqnq_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path")
				.queryParam("bboxes", "D:8.684,49.425935,8.7205,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2007-11-23")
				.queryParam("timeout", "21")
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
	public void test_1hvb04uowyv6u_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "I:8.6832,49.413318,8.7055,49.39222|z:8.68259,49.405,8.726,49.3863|EovBp:8.6651,49.423765,8.753,49.393|DAG:8.67921,49.402,8.7034,49.385749")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-04-27")
				.queryParam("timeout", "54")
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
	public void test_1h7fu0r5hxfeb_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("time", "2014-07-04")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "y:8.745,49.429,75")
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
	public void test_t4kkkiof8t2w_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,primary,give_way")
				.queryParam("bboxes", "Uv:8.69183,49.405,8.756,49.380|oaAff:8.674,49.427,8.7009,49.399|H:8.6703,49.413,8.726810,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "89")
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
	public void test_1iyq1y24wl6b4_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.67948,49.405,8.731,49.3985")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2009-05-15")
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
	public void test_1hbdqh34od2ea_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "azytf:8.676,49.425,8.743,49.389|o:8.673,49.428189,8.707447,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2009-05-17")
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
	public void test_1jei79lnszjg8_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.664,49.4299,8.7054,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "Q:8.728,49.42187,1")
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
	public void test_1iepfpmkx333a_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wW:8.69923,49.4092,8.725,49.3977")
				.queryParam("showMetadata", "yes")
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
	public void test_1jefebmiks1f7_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("time", "2008-05-17")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "YSdOH:8.7418,49.435,6|VXAIP:8.704,49.402,5|kF:8.700,49.427,6|C:8.706,49.406,58")
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
	public void test_uvbe06xodqnt_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "A:8.695,49.402,8.739230,49.3990")
				.queryParam("format", "csv")
				.queryParam("time", "2010-10-02")
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
	public void test_us07b1m5wils_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "vL:8.692,49.408,8.707,49.399")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
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
	public void test_1k1zhevs6z7ee_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "lDv:8.704561,49.403252,8.748352,49.416,8.70282,49.40156,8.749,49.406,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_1jyb0fb2pcb3m_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("time", "2008-05-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72407,49.4162],[8.705,49.42476],[8.708,49.424],[8.704561,49.403252]]]}}]}")
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
	public void test_1k25krv4374h1_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.698,49.4003,8.713,49.388")
				.queryParam("format", "csv")
				.queryParam("timeout", "82")
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
	public void test_u856bl94z6lt_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "uZ:8.67490,49.4197,8.7476,49.398")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-10-26")
				.queryParam("timeout", "67")
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
	public void test_1jed6t9ytua0n_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("bcircles", "8.730,49.4207,2544040215|8.746519,49.401,4")
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
	public void test_s4se25kkwkz4_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gj:8.698,49.4076,8.74852,49.3823")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.724,49.421,8.705,49.429,8.743,49.414,8.704561,49.403252|8.704561,49.403252,8.7188,49.400,8.733,49.416,8.7235,49.412,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_vbbx1wz9b2gk_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Inq:8.666,49.414339,8.728,49.3823|oe:8.677,49.418,8.7303,49.387")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_1ji4j0nmetbug_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-07-26")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "H:8.732,49.4055,7")
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
	public void test_1jenpndjsb2hx_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* and type:relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-01-25")
				.queryParam("bcircles", "T:8.742,49.4007,6")
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
	public void test_s4p2t24sc5kp_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-07-26")
				.queryParam("bcircles", "awTA:8.749,49.431,7")
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
	public void test_us3h2suejjoi_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-04-05")
				.queryParam("bcircles", "8.707,49.4218,2")
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
	public void test_vf6e9zj8zxpg_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and not type:node")
				.queryParam("time", "2012-12-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ou\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7270,49.421],[8.7062,49.4320],[8.704,49.437],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_1jett5eeku8va_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "byyF:8.652,49.422,8.713,49.38667|MUm:8.6576,49.417,8.7098,49.381|a:8.654530,49.413,8.704,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("time", "2014-02-17")
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
	public void test_1h7j4i6570ztt_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wTl:8.655,49.424,8.70413,49.39609")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-11-11")
				.queryParam("timeout", "81")
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
	public void test_1k1uh9ykxh7w3_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and length:( .. 100)")
				.queryParam("bboxes", "hZRwT:8.6737,49.401,8.711,49.3924")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-09-15")
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
	public void test_1h84s2m2ocu2f_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "BW:8.6523,49.406,8.7210,49.3912")
				.queryParam("values", "path")
				.queryParam("showMetadata", "false")
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
	public void test_t4ibkoujn7zk_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.696,49.4260,8.702,49.382|8.694,49.413489,8.738,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-04-19")
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
	public void test_1hbit77ulcc4i_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nAE:8.671,49.4131,8.7110,49.380")
				.queryParam("format", "json")
				.queryParam("timeout", "22")
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
	public void test_tocvszsrfupf_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "ZT:8.7183,49.4005,20")
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
	public void test_r1l4mcm2jdir_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "j:8.6538,49.4162,8.7157,49.386")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "47")
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
	public void test_ts4od5k4iyjn_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Gl:8.68059,49.4278,8.715,49.393|l:8.652,49.409,8.748,49.3968|Ol:8.693,49.4204,8.713,49.397746|W:8.674246,49.409707,8.741712,49.38040")
				.queryParam("timeout", "45")
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
	public void test_1jenr7o92i6hx_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "offCJ:8.727,49.406,24|lq:8.713,49.403551,6|nU:8.715,49.4226,8")
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
	public void test_1hru9w7yy288k_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "ol:8.658,49.402,8.73360,49.3930")
				.queryParam("showMetadata", "yes")
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
	public void test_s15m0vguiqeq_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "2016-05-14")
				.queryParam("bpolys", "yPCZU:8.704561,49.403252,8.711,49.4032,8.731,49.4318,8.701,49.4388,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_urk31tjonyox_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-03-27")
				.queryParam("bpolys", "M:8.704561,49.403252,8.739,49.4399,8.7063,49.410,8.737181,49.425662,8.704561,49.403252|jZ:8.704561,49.403252,8.722,49.4028,8.7035,49.421,8.737,49.402,8.704561,49.403252|q:8.704561,49.403252,8.7337,49.40627,8.703,49.42038,8.7068,49.428506,8.704561,49.403252")
				.queryParam("timeout", "23")
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
	public void test_s4rvr18cuiia_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
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
	public void test_r1iw9nc6wd9x_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bcircles", "vJaH:8.729,49.439,231")
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
	public void test_1jy4xulw5auyd_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "bq:8.673,49.4076,8.715316,49.383")
				.queryParam("format", "csv")
				.queryParam("time", "2018-01-25")
				.queryParam("timeout", "34")
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
	public void test_vb6bk9c9y3qd_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "mH:8.7355,49.431165,6")
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
	public void test_u855gybn0rw3_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "jP:8.704561,49.403252,8.715,49.426,8.7026,49.4131,8.7027,49.409,8.704561,49.403252|h:8.704561,49.403252,8.726,49.4090,8.70147,49.4095,8.7003,49.430661,8.704561,49.403252")
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
	public void test_to4k5tnb9e0l_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "eCb:8.65363,49.423,8.751,49.399")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-04-28")
				.queryParam("timeout", "54")
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
	public void test_skv531g4ym3q_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7070,49.4126,8.70258,49.424,8.7045,49.410,8.704561,49.403252|8.704561,49.403252,8.729,49.4071,8.70455,49.420,8.746959,49.415,8.704561,49.403252|8.704561,49.403252,8.748,49.41745,8.705,49.411,8.742,49.4259,8.704561,49.403252")
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
	public void test_sl8zkpd9vsqf_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or type:way or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-05-22")
				.queryParam("bpolys", "8.704561,49.403252,8.720308,49.433,8.7013,49.433,8.7272,49.419,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_qdy8zdjgyk4i_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"OE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71815,49.424546],[8.73811,49.40537],[8.7299,49.42994],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Cj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.4136],[8.7093,49.424320],[8.7079,49.404675],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ROGdJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.43941],[8.72955,49.436],[8.749,49.4014],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_1hb87pdd2yhbs_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("bboxes", "8.665616,49.40770,8.742,49.393|8.675645,49.4020,8.7456,49.384")
				.queryParam("time", "2017-12-25")
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
	public void test_us3hejgw1mqs_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tower,path")
				.queryParam("filter", "barrier!=* or type:node")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_t4q5afmfyb03_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=*")
				.queryParam("bboxes", "8.6643,49.4289,8.751,49.3829|8.652,49.424616,8.712,49.385|8.66067,49.4036,8.73626,49.3925")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-11-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"n\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73769,49.405],[8.7405,49.434],[8.7441,49.42141],[8.704561,49.403252]]]}}]}")
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
	public void test_u7ojzua2mcl1_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("time", "2016-01-01")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "8.73985,49.4338,3|8.7348,49.432,4")
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
	public void test_rhrodfc7mcs8_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("time", "2017-09-26")
				.queryParam("bpolys", "cbHu:8.704561,49.403252,8.7454,49.4194,8.71162,49.418,8.736,49.40188,8.704561,49.403252|Y:8.704561,49.403252,8.7372,49.402,8.7043,49.4099,8.701,49.4040,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_1jeip9qxhbx2o_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "steps")
				.queryParam("bboxes", "e:8.687,49.420,8.753,49.382|d:8.695,49.4006,8.7038,49.391|Q:8.673,49.4197,8.74301,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "60")
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
	public void test_skst7ss7mzc2_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,bus_stop")
				.queryParam("filter", "bicycle=*")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-04-15")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "jZ:8.748,49.422180,7")
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
	public void test_1jy25m28xdvtw_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "public,hotel")
				.queryParam("filter", "lit!=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2012-02-25")
				.queryParam("bcircles", "ogl:8.7323,49.426,6|C:8.7008,49.400518,5|cH:8.715,49.428,6")
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
	public void test_s4p1beumggmo_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-06-21")
				.queryParam("bpolys", "8.704561,49.403252,8.7264,49.429,8.7004,49.4041,8.741,49.425,8.704561,49.403252|8.704561,49.403252,8.7088,49.435,8.74505,49.4322,8.7496,49.437,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_t4w8c2vzelwl_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zZo:8.659,49.4283,8.7464,49.399")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_vbcelqn9xvlf_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,emergency_access_point,tertiary")
				.queryParam("filter", "sidewalk!=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("bcircles", "p:8.714118,49.416,63")
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
	public void test_1ibeto7nt84kz_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "YqBi:8.704561,49.403252,8.725,49.433,8.7347,49.410,8.705,49.4205,8.704561,49.403252")
				.queryParam("bcircles", "Z:8.730,49.412,499|Ghv:8.703,49.4107,57")
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
	public void test_1hv0hb8wiboz4_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or not area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "stop_line")
				.queryParam("bboxes", "b:8.6506,49.4200,8.7222,49.390")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "xR:8.704561,49.403252,8.701,49.407,8.709,49.423702,8.7098,49.435,8.704561,49.403252")
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
	public void test_urgu1vwi7k8i_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,residential,footway")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Uf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70512,49.431],[8.742,49.41011],[8.727,49.434],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "46")
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
	public void test_rl7xshgczltl_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,turning_circle,platform")
				.queryParam("bboxes", "NY:8.670,49.42566,8.750250,49.397|AQ:8.695357,49.404,8.70313,49.399|LPh:8.694,49.4154,8.71871,49.3876|B:8.65617,49.41238,8.759,49.38422")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("time", "2013-06-08")
				.queryParam("timeout", "66")
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
	public void test_u7xdpkyldwdz_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,dormitory")
				.queryParam("filter", "tracktype=* and length:( .. 100)")
				.queryParam("bboxes", "gWYd:8.676,49.428522,8.723,49.395|n:8.6572,49.403,8.723,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2008-07-20")
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
	public void test_s0xrrs53ly78_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,bus_stop,synagogue")
				.queryParam("bboxes", "8.668,49.422,8.747,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
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
	public void test_1iuyrn1cmcpq0_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,tertiary,public")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-06-18")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "lvn:8.748,49.434299,2")
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
	public void test_1hre6c55zw485_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("bcircles", "Cq:8.739,49.40390,8")
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
	public void test_1hb7ojcar4n5d_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,platform,service")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-08-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YvnB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.4352],[8.7054,49.400468],[8.727,49.43708],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "87")
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
	public void test_1hrbftb7x2uyb_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-06-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HMFES\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704668,49.432473],[8.734,49.43255],[8.723,49.401],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"hgl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.415],[8.7052,49.435],[8.7415,49.4007],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"xgEv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.4164],[8.701,49.421],[8.703032,49.4065],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "48")
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
	public void test_1ji4fwasrufz8_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKeys", "destination,type,lanes:forward")
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
	public void test_1iyqjvhj07kv9_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "u:8.6721,49.406274,8.700,49.388|Z:8.674,49.421,8.7134,49.396|muwRc:8.691,49.415805,8.75976,49.386")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.719464,49.41352,8.7412,49.418,8.724,49.433,8.704561,49.403252")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "w:8.719,49.409,5|JWXr:8.7015,49.401,1")
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
	public void test_1k1r76yg320df_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.7384,49.401,8.7013,49.437,8.726,49.412,8.704561,49.403252|8.704561,49.403252,8.739,49.417,8.703,49.404,8.7073,49.434,8.704561,49.403252|8.704561,49.403252,8.7423,49.404284,8.73360,49.422,8.741,49.402,8.704561,49.403252")
				.queryParam("timeout", "90")
				.queryParam("groupByKeys", "surface,lit")
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
	public void test_1h7o7am48nj1x_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-10-04")
				.queryParam("groupByKeys", "addr:postcode,lanes,destination")
				.queryParam("bcircles", "R:8.736729,49.4140,5")
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
	public void test_rl7x0jk5bl9e_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "W:8.6603,49.409,8.719,49.394|r:8.68550,49.421,8.74036,49.381|Xvt:8.687,49.426,8.7173,49.3871|kZ:8.6691,49.407508,8.7234,49.386522")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-04-05")
				.queryParam("timeout", "41")
				.queryParam("groupByKeys", "turn,addr:country,lanes")
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
	public void test_1jyiulxmw2lv4_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and type:way and length:( .. 100)")
				.queryParam("bboxes", "8.66317,49.418,8.722,49.387")
				.queryParam("timeout", "60")
				.queryParam("groupByKeys", "name,building,turn:lanes")
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
	public void test_1jyiv2hi8748h_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-09-08")
				.queryParam("timeout", "55")
				.queryParam("groupByKeys", "foot,lanes,addr:street")
				.queryParam("bcircles", "8.73821,49.433,3")
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
	public void test_1hb7pbgg7xpgy_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.655,49.400211,8.705,49.3916|8.674,49.409,8.734,49.3972")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "oneway,landuse,bicycle")
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
	public void test_s1b4py5ep1kh_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "landuse,addr:city")
				.queryParam("bcircles", "p:8.73100,49.408773,1")
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
	public void test_1jyjaz4810ncj_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2010-10-04")
				.queryParam("bpolys", "y:8.704561,49.403252,8.743,49.433,8.740,49.412,8.731,49.418749,8.704561,49.403252|mQ:8.704561,49.403252,8.715,49.404,8.701,49.404,8.72761,49.433,8.704561,49.403252|lf:8.704561,49.403252,8.702,49.4281,8.700,49.431,8.733,49.413,8.704561,49.403252")
				.queryParam("timeout", "76")
				.queryParam("groupByKeys", "addr:country,addr:street")
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
	public void test_vb3lc63evara_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "VlkZD:8.704561,49.403252,8.727,49.4000,8.7031,49.407838,8.713,49.402748,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:city,addr:country,addr:street")
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
	public void test_qxlkjmsjpt9f_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:country=* or geometry:line and area:(1.0 .. 1E6)")
				.queryParam("values", "traffic_mirror")
				.queryParam("timeout", "71")
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
	public void test_s12tusm2t7c5_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-09-28")
				.queryParam("bpolys", "8.704561,49.403252,8.70221,49.4260,8.704,49.4205,8.711,49.436,8.704561,49.403252|8.704561,49.403252,8.706097,49.401,8.70213,49.4259,8.701,49.41341,8.704561,49.403252")
				.queryParam("groupByKeys", "network,lanes:backward")
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
	public void test_s4rw7d9u09ip_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2009-11-16")
				.queryParam("timeout", "48")
				.queryParam("groupByKeys", "landuse,ref,turn:lanes")
				.queryParam("bcircles", "8.7135,49.40148,1|8.7305,49.41345,47|8.7472,49.427048,3")
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
	public void test_qe1l3lb4dph3_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-06-15")
				.queryParam("bpolys", "Ts:8.704561,49.403252,8.71281,49.426,8.7358,49.40782,8.701,49.43699,8.704561,49.403252|FhTCR:8.704561,49.403252,8.7297,49.43115,8.744,49.416,8.7084,49.4164,8.704561,49.403252|M:8.704561,49.403252,8.7471,49.427,8.714,49.4251,8.74705,49.42611,8.704561,49.403252")
				.queryParam("groupByKeys", "source:maxspeed")
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
	public void test_vbf4vsxatvfq_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2018-04-24")
				.queryParam("groupByKeys", "bicycle,lanes,smoothness")
				.queryParam("bcircles", "8.711,49.432,8|8.729,49.432,3|8.7066,49.413,95")
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
	public void test_t4hvj6g9zlmc_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cXrOD:8.694,49.404,8.71986,49.387|J:8.662,49.417114,8.7539,49.384|KDLh:8.6618,49.4153,8.75623,49.389|CrKqx:8.65210,49.429,8.731,49.383358")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-12-04")
				.queryParam("groupByKeys", "foot,addr:street,addr:housenumber")
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
	public void test_1ibc1kzrolyr4_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-12-29")
				.queryParam("groupByKeys", "foot,barrier,turn:lanes")
				.queryParam("bcircles", "8.700,49.4358,42|8.70087,49.41857,67")
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
	public void test_rhtze5fgnigp_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("bpolys", "JUw:8.704561,49.403252,8.723,49.4040,8.737431,49.426605,8.72212,49.405,8.704561,49.403252|TChUE:8.704561,49.403252,8.720918,49.43275,8.704561,49.404,8.704561,49.422896,8.704561,49.403252|c:8.704561,49.403252,8.721,49.4306,8.704,49.4041,8.7059,49.410,8.704561,49.403252")
				.queryParam("groupByKeys", "smoothness,building")
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
	public void test_to2bvfndumgo_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "tracktype,addr:postcode")
				.queryParam("bcircles", "Xogm:8.711,49.43973,5")
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
	public void test_1hv5hrabejwoj_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("timeout", "98")
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
	public void test_1hre6c9hnvak7_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* or type:way and not area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("timeout", "71")
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
	public void test_uvbegupwpsu0_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or type:node and not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "OngpJ:8.720,49.425115,28|QonTC:8.743,49.415,6")
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
	public void test_1hrmiwolcb3g4_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,house")
				.queryParam("filter", "foot=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-08-16")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.4241,8.71659,49.4331,8.741,49.4291,8.704561,49.403252|8.704561,49.403252,8.736182,49.406,8.704,49.419,8.70720,49.436148,8.704561,49.403252")
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
	public void test_uvbxhk1rcrw1_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "lV:8.739,49.426,3")
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
	public void test_qhndcmg7slyx_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,yes")
				.queryParam("bboxes", "nn:8.699,49.4081,8.734,49.390|wSl:8.690155,49.40805,8.718084,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "yes")
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
	public void test_s4xx84bnorhv_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,secondary,house")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-10-04")
				.queryParam("bcircles", "8.7015,49.435347,3")
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
	public void test_u7raobgdxtno_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Whc:8.694,49.428,8.7065,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-03-30")
				.queryParam("timeout", "57")
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
	public void test_1jyg1nmn7dy5z_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp")
				.queryParam("filter", "source:maxspeed=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "z:8.658942,49.4150,8.708,49.393|U:8.666,49.422069,8.7353,49.3905|Di:8.690171,49.4272,8.71010,49.38931|Esmpl:8.685,49.4047,8.7523,49.39394")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "46")
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
	public void test_qy1m55wemyib_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* or length:( .. 100)")
				.queryParam("bboxes", "UJJs:8.671903,49.41377,8.7001,49.3847")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2009-06-13")
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
	public void test_rhowwvlepank_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,steps")
				.queryParam("bboxes", "8.66726,49.4187,8.731559,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "q:8.704561,49.403252,8.728,49.403,8.717,49.401,8.704,49.431,8.704561,49.403252|D:8.704561,49.403252,8.7171,49.415,8.739,49.4111,8.7320,49.412,8.704561,49.403252|g:8.704561,49.403252,8.72360,49.4374,8.702,49.42852,8.7021,49.438046,8.704561,49.403252")
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
	public void test_qdpxq6u04cwz_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-09-16")
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
	public void test_vbmx400ib228_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,elevator")
				.queryParam("bboxes", "fI:8.692,49.4193,8.7494,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-05-13")
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
	public void test_t89ovkorjh9t_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "chapel")
				.queryParam("bboxes", "8.686518,49.4298,8.704,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
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
	public void test_vbhxr1129df9_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.673227,49.404,8.7348,49.395|8.6692,49.4165,8.737,49.3935")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_s1eevwt38fg5_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,school,unclassified")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bcircles", "8.720,49.4005,3")
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
	public void test_1jifk8c7u0egm_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-05-26")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "TMRGK:8.702,49.42944,13|ry:8.72778,49.439,4")
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
	public void test_s10398djbrck_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-11-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"OGlk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7267,49.431],[8.704782,49.421855],[8.742,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.424],[8.707396,49.42660],[8.708,49.418],[8.704561,49.403252]]]}}]}")
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
	public void test_skjzkotfxahw_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "crossing,emergency_access_point")
				.queryParam("filter", "highway!=* and not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Plmmp:8.704561,49.403252,8.714,49.429,8.704367,49.418,8.7045,49.4221,8.704561,49.403252|qmDv:8.704561,49.403252,8.713,49.429,8.7029,49.4185,8.703,49.432,8.704561,49.403252|wv:8.704561,49.403252,8.712,49.434,8.748,49.401,8.700,49.402,8.704561,49.403252")
				.queryParam("timeout", "93")
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
	public void test_1iepg3jea8gv8_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6857,49.426,8.704,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "84")
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
	public void test_sohcgymiyo1g_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* or type:relation and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "55")
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
	public void test_veyn7zo2j67p_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "b:8.662,49.400,8.757,49.390|BaVGS:8.65848,49.4108,8.722,49.3934|Fi:8.672,49.413,8.7154,49.3892|x:8.6993,49.4181,8.754496,49.384386")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-04-27")
				.queryParam("timeout", "45")
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
	public void test_qdyu0t3w8xnl_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "CLq:8.719593,49.435,3")
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
	public void test_qhvnteo3dso6_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("time", "2015-11-29")
				.queryParam("bpolys", "svRUh:8.704561,49.403252,8.701000,49.431,8.70751,49.433,8.70456,49.4033,8.704561,49.403252|lQ:8.704561,49.403252,8.7008,49.4167,8.704,49.41438,8.708,49.42755,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_1jig3pxnuwqpl_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vHQl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728739,49.438614],[8.731,49.41691],[8.7455,49.4160],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "65")
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
	public void test_ure1vtejqa7m_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-03-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"m\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7370,49.4018],[8.722052,49.418],[8.7021,49.4104],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.419],[8.726371,49.4167],[8.70417,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"hX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.419],[8.719,49.400],[8.70107,49.43089],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "36")
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
	public void test_1hrs1ojxd0zmt_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.7482,49.4212,8.7073,49.42280,8.703848,49.428,8.704561,49.403252|8.704561,49.403252,8.70645,49.4142,8.73522,49.431,8.7040,49.412,8.704561,49.403252|8.704561,49.403252,8.739,49.436,8.7474,49.43056,8.7154,49.433,8.704561,49.403252")
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
	public void test_1hbfzgt2r4ns3_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-09-23")
				.queryParam("bcircles", "Z:8.729,49.404,5")
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
	public void test_to7vqtkx1um1_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2010-12-24")
				.queryParam("bcircles", "8.748,49.429,110|8.7224,49.411728,5")
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
	public void test_1ibkcwix20yt3_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.74160,49.415,872")
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
	public void test_vevuntsapv01_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or geometry:line")
				.queryParam("bboxes", "OUQar:8.679,49.402,8.7385,49.3958")
				.queryParam("bpolys", "vX:8.704561,49.403252,8.716,49.426,8.74556,49.424272,8.726,49.4241,8.704561,49.403252|BE:8.704561,49.403252,8.718,49.427,8.727433,49.434,8.722674,49.425613,8.704561,49.403252|mfpW:8.704561,49.403252,8.710182,49.427,8.743109,49.4048,8.721,49.4144,8.704561,49.403252")
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
	public void test_r1l4y2vgx84j_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "R:8.6950,49.4181,8.72917,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-05-22")
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
	public void test_rhaiy813ez4y_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pMHLL:8.677,49.411,8.74816,49.3907")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
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
	public void test_rhdt44pi52r4_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or id:(1 .. 9999)")
				.queryParam("bboxes", "nV:8.685,49.401,8.722,49.380693|CTYTb:8.668,49.413,8.743150,49.3910|h:8.67444,49.4241,8.718,49.389|cqoWb:8.691050,49.4127,8.724,49.3979")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_qdvho3kao0tu_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.404,8.719760,49.4375,8.701,49.4030,8.704561,49.403252|8.704561,49.403252,8.749191,49.406,8.704560,49.409,8.741,49.4009,8.704561,49.403252")
				.queryParam("timeout", "26")
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
	public void test_u8aqneqmjrz6_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "m:8.652,49.4075,8.7344,49.389|jx:8.6896,49.427,8.719,49.387|w:8.667,49.409,8.729418,49.3842|W:8.6885,49.4077,8.756883,49.3841")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-11-14")
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
	public void test_rl2v2o8owa49_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "j:8.6522,49.402,8.758,49.3949")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "81")
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
	public void test_t4htkli0ise0_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-08-27")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.71742,49.4318,35")
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
	public void test_1jeli55crgtb6_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-10-10")
				.queryParam("bpolys", "uHjyx:8.704561,49.403252,8.735,49.416744,8.7146,49.421,8.7084,49.4348,8.704561,49.403252|gXzmi:8.704561,49.403252,8.727391,49.409,8.735924,49.4148,8.7001,49.42649,8.704561,49.403252|hvYHE:8.704561,49.403252,8.706,49.4392,8.7042,49.4241,8.7393,49.425,8.704561,49.403252")
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
	public void test_t8fpygpyha9g_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-10-03")
				.queryParam("bpolys", "O:8.704561,49.403252,8.704250,49.4217,8.7418,49.422,8.704558,49.4288,8.704561,49.403252|bS:8.704561,49.403252,8.700,49.416,8.72371,49.4250,8.70191,49.41452,8.704561,49.403252|MbF:8.704561,49.403252,8.728019,49.401,8.7215,49.4382,8.704,49.439,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_vf3p83kooajo_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or geometry:line or length:( .. 100)")
				.queryParam("bboxes", "hg:8.657,49.4165,8.745,49.390")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-03-07")
				.queryParam("bpolys", "8.704561,49.403252,8.732,49.411,8.7101,49.412,8.707,49.416,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "Y:8.72071,49.42366,1")
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
	public void test_1iyeydv37j96f_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* and geometry:point")
				.queryParam("bboxes", "AYVkS:8.662,49.42679,8.738,49.392|CkXuB:8.65459,49.420,8.7070,49.386")
				.queryParam("types2", "relation")
				.queryParam("filter2", "tracktype!=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "94")
				.queryParam("values2", "crossing")
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
	public void test_1jyajqm4qzyhu_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "qk:8.692,49.4179,8.71089,49.3974")
				.queryParam("format", "geojson")
				.queryParam("filter2", "oneway=* and geometry:polygon and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_1k22b227zmm3m_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,polygon,other")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-05-29")
				.queryParam("bpolys", "8.704561,49.403252,8.714344,49.431,8.70422,49.437,8.701,49.4186,8.704561,49.403252|8.704561,49.403252,8.7477,49.4338,8.701,49.422662,8.704,49.415,8.704561,49.403252|8.704561,49.403252,8.715,49.402,8.720,49.435,8.70140,49.42470,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_rhiv4gheztww_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "way,relation")
				.queryParam("format", "csv")
				.queryParam("filter2", "building!=* and geometry:polygon and not area:(1.0 .. 1E6)")
				.queryParam("time", "2015-07-27")
				.queryParam("bpolys", "8.704561,49.403252,8.744,49.416,8.70328,49.43313,8.701,49.434,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "70")
				.queryParam("values2", "footway")
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
	public void test_rh7tl5ldxz5l_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("filter2", "barrier=*")
				.queryParam("time", "2012-06-16")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "93")
				.queryParam("values2", "elevator")
				.queryParam("bcircles", "8.7293,49.4184,7")
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
	public void test_1ib375vy9rigp_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,line,polygon,")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-09-13")
				.queryParam("bpolys", "Vlu:8.704561,49.403252,8.708,49.420,8.7458,49.400,8.7050,49.418574,8.704561,49.403252")
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
	public void test_trrcz9u3vzub_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7160,49.439518],[8.7046,49.409],[8.7097,49.4118],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"JgPLR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7398,49.410],[8.702928,49.403],[8.703,49.437],[8.704561,49.403252]]]}}]}")
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
	public void test_1hbfzjlog1085_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "OIBPw:8.669075,49.4239,8.70781,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-01-02")
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
	public void test_rhajc1lmywjb_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6998,49.4145,8.726,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2014-05-14")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_1ji4imcab2aub_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-09-25")
				.queryParam("timeout", "23")
				.queryParam("values2", "elevator")
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
	public void test_qe4c0y4egh2e_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,line,polygon,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref=* or not geometry:line")
				.queryParam("time", "2014-10-28")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary_link")
				.queryParam("bcircles", "osO:8.7418,49.430,4|JkUGe:8.705,49.427,7|W:8.7327,49.423,15")
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
	public void test_u8difevzvwwx_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("filter2", "addr:postcode=* and type:way and id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.40591],[8.7032,49.403],[8.708,49.4348],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ilhah\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7168,49.402],[8.7317,49.421],[8.703,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"A\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.418],[8.712,49.419],[8.700,49.4046],[8.704561,49.403252]]]}}]}")
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
	public void test_1h84uc3pr2tkh_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and geometry:line or not length:( .. 100)")
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "destination=* and type:relation or length:( .. 100)")
				.queryParam("time", "2016-02-27")
				.queryParam("bpolys", "ob:8.704561,49.403252,8.739,49.431277,8.704289,49.4355,8.74603,49.4181,8.704561,49.403252|gJ:8.704561,49.403252,8.74680,49.426763,8.7049,49.434,8.734,49.430,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "50")
				.queryParam("values2", "traffic_mirror")
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
	public void test_trtn7u46il2w_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "emg:8.6539,49.422,8.724669,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-11-06")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "52")
				.queryParam("values2", "tertiary")
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
	public void test_s1jgtrtheb00_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and length:( .. 100)")
				.queryParam("bboxes", "c:8.670505,49.4100,8.726,49.385")
				.queryParam("types2", "node,way,")
				.queryParam("filter2", "ref!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2014-01-14")
				.queryParam("timeout", "80")
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
	public void test_skv5h4kz1941_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* and type:node and length:( .. 100)")
				.queryParam("bboxes", "lG:8.673,49.4264,8.7014,49.396|qXE:8.6962,49.4146,8.7318,49.399")
				.queryParam("format", "geojson")
				.queryParam("filter2", "lanes=* or length:( .. 100)")
				.queryParam("time", "2013-04-19")
				.queryParam("timeout", "70")
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
	public void test_urel2a9wmzhy_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter2", "name!=* and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.746,49.42087,43|8.712,49.40268,5|8.747,49.41576,4|8.735935,49.421483,569")
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
	public void test_1h7o85cn12urb_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "J:8.6551,49.4137,8.737936,49.3822")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-07-25")
				.queryParam("keys2", "highway")
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
	public void test_1jyaja0n5fghh_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "rGpqZ:8.6506,49.4101,8.748,49.3822|gw:8.676,49.422,8.733724,49.3914")
				.queryParam("format", "csv")
				.queryParam("filter2", "landuse=* or id:(1 .. 9999)")
				.queryParam("time", "2008-08-01")
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
	public void test_1hv88daq5zvw1_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XQX:8.655,49.40712,8.71916,49.384|OisBO:8.695010,49.41509,8.73465,49.386")
				.queryParam("values", "path")
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
	public void test_1iykzv427n882_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("filter2", "ref=* or geometry:line")
				.queryParam("bpolys", "txS:8.704561,49.403252,8.718,49.42579,8.717,49.4130,8.7123,49.40697,8.704561,49.403252|c:8.704561,49.403252,8.7216,49.4057,8.729,49.4046,8.707,49.434,8.704561,49.403252|ydx:8.704561,49.403252,8.742794,49.43049,8.706,49.416419,8.736,49.424,8.704561,49.403252")
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
	public void test_1iusozpcgv4fn_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("filter2", "maxspeed!=* and type:node and area:(1.0 .. 1E6)")
				.queryParam("time", "2010-06-05")
				.queryParam("bpolys", "WNI:8.704561,49.403252,8.738,49.43424,8.70245,49.439,8.709,49.417,8.704561,49.403252|iyrCb:8.704561,49.403252,8.711,49.418468,8.745,49.406,8.715,49.433,8.704561,49.403252|loDTP:8.704561,49.403252,8.745,49.4386,8.731,49.434,8.7080,49.410,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "service")
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
	public void test_qy25p65a1i5x_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("filter2", "lit=* and geometry:point and length:( .. 100)")
				.queryParam("time", "2010-07-11")
				.queryParam("bpolys", "tMSF:8.704561,49.403252,8.744,49.4072,8.7137,49.4115,8.743597,49.4391,8.704561,49.403252|T:8.704561,49.403252,8.718,49.432,8.7104,49.4291,8.708518,49.422,8.704561,49.403252")
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
	public void test_t4teofyz2btw_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.7291,49.404,3|8.717,49.42417,56|8.748,49.4163,1|8.7384,49.4116,6")
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
	public void test_1iun67mhmzvi1_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.687701,49.4235,8.749993,49.3875|8.663,49.406,8.7497,49.386")
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("filter2", "maxspeed!=* or geometry:polygon or not area:(1.0 .. 1E6)")
				.queryParam("time", "2015-09-10")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "47")
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
	public void test_vbhy52icb59f_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-03-24")
				.queryParam("keys2", "highway")
				.queryParam("values2", "elevator")
				.queryParam("bcircles", "s:8.7014,49.413,98")
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
	public void test_1hr84hf6pg306_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=* and geometry:line and id:(1 .. 9999)")
				.queryParam("types2", "line,polygon,other")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.716,49.40110,8|8.734,49.4276,7|8.746,49.43952,4")
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
	public void test_1iyhqmeo5fwhe_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "C:8.662,49.425,8.7518,49.3846|e:8.67045,49.4013,8.711,49.3906")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "79")
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
	public void test_skpjihm0262f_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.674,49.4203,8.705150,49.383|8.689,49.413,8.711,49.390")
				.queryParam("time", "2015-10-03")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_1iv1jevi67xv9_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "bicycle=* or type:relation and id:(1 .. 9999)")
				.queryParam("time", "2016-12-12")
				.queryParam("values2", "speed_camera")
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
	public void test_t4f10t24x4yr_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pk:8.651,49.42091,8.700,49.3811")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-03-26")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "98")
				.queryParam("values2", "stop")
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
	public void test_vbmzrsyaumus_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "jN:8.6923,49.4222,8.716648,49.3941|wUjD:8.6675,49.403,8.741257,49.398|uds:8.662,49.40310,8.722,49.388|X:8.665,49.415882,8.75088,49.3903")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "landuse!=*")
				.queryParam("time", "2011-06-21")
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
	public void test_1iupx7fq9jy2e_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or geometry:line")
				.queryParam("bboxes", "q:8.685296,49.410,8.746011,49.385")
				.queryParam("timeout", "39")
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
	public void test_t4klqif5484y_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or type:node and id:(1 .. 9999)")
				.queryParam("types2", "way,")
				.queryParam("filter2", "service=driveway or id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_mirror")
				.queryParam("bcircles", "F:8.716,49.411,9")
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
	public void test_urej3ygpq1bq_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "gWWu:8.704561,49.403252,8.733,49.409263,8.7247,49.412,8.7071,49.402271,8.704561,49.403252")
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
	public void test_1ib8r3qavmdyu_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "H:8.6856,49.416,8.708,49.395837|L:8.6539,49.42263,8.732902,49.39435|E:8.671,49.410,8.753,49.399")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "landuse=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2012-12-12")
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
	public void test_1ibeskpfueaeu_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or geometry:line")
				.queryParam("bboxes", "8.689,49.401601,8.745,49.3938|8.685,49.429,8.753,49.382|8.66625,49.400,8.7070,49.396")
				.queryParam("types2", "point,other")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot!=* and id:(1 .. 9999)")
				.queryParam("time", "2009-02-27")
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
	public void test_1iyia1fcdv41i_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "fPneb:8.659,49.406,8.73842,49.386|A:8.6837,49.40966,8.732,49.3956|UW:8.659,49.423902,8.717,49.3890|L:8.66165,49.416022,8.7296,49.38994")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "track")
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
	public void test_rl2cd11vqcs5_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("format", "csv")
				.queryParam("time", "2010-10-30")
				.queryParam("bpolys", "MDFd:8.704561,49.403252,8.709,49.432984,8.707,49.405,8.749686,49.431,8.704561,49.403252|C:8.704561,49.403252,8.729490,49.40822,8.730484,49.4249,8.745,49.423537,8.704561,49.403252|Um:8.704561,49.403252,8.745,49.425,8.704,49.412,8.712147,49.43152,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_vey4ikflm7vq_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "80")
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
	public void test_skpif98mxlye_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-02-18")
				.queryParam("bpolys", "8.704561,49.403252,8.734829,49.4127,8.705868,49.417594,8.72625,49.431,8.704561,49.403252")
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
	public void test_rhiwlu96omye_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city!=* or geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.674,49.4287,8.749278,49.393")
				.queryParam("format", "json")
				.queryParam("timeout", "55")
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
	public void test_1jetbzxoxo9iv_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.710,49.412,8.70034,49.433,8.7026,49.425,8.704561,49.403252")
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
	public void test_1k1r8fixaz7zt_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:backward!=* and type:node")
				.queryParam("bboxes", "v:8.6966,49.418,8.753,49.384")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_1iaxmu1rrk6k6_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line and id:(1 .. 9999)")
				.queryParam("bboxes", "8.693,49.404,8.708,49.395|8.656535,49.400,8.747,49.396")
				.queryParam("format", "csv")
				.queryParam("timeout", "98")
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
	public void test_rl8em6byb48h_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "s:8.6947,49.415,8.752689,49.393|bTwoH:8.692,49.415,8.758,49.393|crgVM:8.6791,49.400,8.73986,49.381")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1iyc6mbflwllv_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or type:relation and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"v\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70368,49.412],[8.731,49.415],[8.7096,49.4262],[8.704561,49.403252]]]}}]}")
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
	public void test_skv2a5ee0w8n_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.730,49.430,8.703,49.42204,8.703,49.4175,8.704561,49.403252")
				.queryParam("timeout", "60")
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
	public void test_1jygj7ar3x8bm_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or type:node and id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "SZzS:8.722,49.43264,91")
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
	public void test_1ib3q6tk2gldc_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or id:(1 .. 9999)")
				.queryParam("bboxes", "OizuY:8.676349,49.4210,8.700,49.39034")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-04-20")
				.queryParam("timeout", "31")
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
	public void test_1hblk9eoyobao_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.686,49.402,8.7584,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-04-27")
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
	public void test_1hv5js6v9u7g0_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-03-16")
				.queryParam("bcircles", "dHMnl:8.708,49.41487,17")
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
	public void test_sohuec11m1bn_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and geometry:point")
				.queryParam("bboxes", "ca:8.6767,49.409,8.707354,49.392")
				.queryParam("format", "csv")
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
	public void test_qdsruda524vn_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2016-02-10")
				.queryParam("bcircles", "g:8.7239,49.430,1|AjyLz:8.701,49.436720,193")
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
	public void test_1hrj8ffhcl750_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "YBGMO:8.704561,49.403252,8.742,49.42220,8.743,49.434164,8.7477,49.420,8.704561,49.403252|TBc:8.704561,49.403252,8.717,49.41435,8.704,49.417,8.7023,49.434,8.704561,49.403252|kCcr:8.704561,49.403252,8.72131,49.4271,8.703,49.427599,8.704,49.406,8.704561,49.403252")
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
	public void test_t8cdx2ts6ijp_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber!=* or geometry:line and length:( .. 100)")
				.queryParam("time", "2010-11-25")
				.queryParam("bpolys", "n:8.704561,49.403252,8.7366,49.4145,8.703,49.436,8.70477,49.4149,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_s4xeiaxh91df_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "G:8.73716,49.425,7")
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
	public void test_1k1r7yssy5cv6_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "wIU:8.704561,49.403252,8.71966,49.419,8.701,49.40632,8.740,49.418189,8.704561,49.403252|GkeZZ:8.704561,49.403252,8.734,49.434649,8.701,49.421,8.7084,49.408,8.704561,49.403252|pC:8.704561,49.403252,8.728197,49.400,8.70458,49.428,8.70221,49.432,8.704561,49.403252")
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
	public void test_1hrbfqcnyrw4m_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6650,49.428,8.708,49.385")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_1ies73qtpu7u8_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "WJQ:8.65157,49.423,8.756,49.3923|y:8.6942,49.419,8.723,49.382|Mfx:8.664,49.4083,8.711,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-02-14")
				.queryParam("bpolys", "8.704561,49.403252,8.748,49.4090,8.711,49.405,8.721383,49.414,8.704561,49.403252")
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
	public void test_t4vqv3h37pro_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-07-08")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "aWAkt:8.74421,49.414333,8")
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
	public void test_vb3iosxcuucy_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-12-31")
				.queryParam("bcircles", "iBJs:8.739,49.4317,3|VU:8.74607,49.433,1")
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
	public void test_t4vqv5gg2jxd_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-12-05")
				.queryParam("bpolys", "8.704561,49.403252,8.743,49.402,8.720,49.42687,8.725,49.418,8.704561,49.403252|8.704561,49.403252,8.724,49.4114,8.73577,49.4108,8.701,49.4306,8.704561,49.403252")
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
	public void test_sl67eiwxbos3_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "FM:8.672461,49.405154,8.74233,49.390|aJc:8.6536,49.402,8.752,49.386|D:8.667952,49.414,8.743,49.396|ch:8.660,49.424,8.754,49.383")
				.queryParam("keys", "highway")
				.queryParam("timeout", "77")
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
	public void test_s1ji2fu0c01f_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "S:8.655588,49.4138,8.757,49.390|VrY:8.6695,49.424,8.750,49.394|vlWlN:8.688,49.419622,8.75240,49.3924")
				.queryParam("time", "2014-02-13")
				.queryParam("timeout", "62")
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
	public void test_1h7whubadvi3q_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or not type:node")
				.queryParam("format", "csv")
				.queryParam("bcircles", "oyKZS:8.735,49.426204,3|HQ:8.731,49.431,9")
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
	public void test_1jyoc79tpswmo_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.668,49.429,8.723,49.397752|8.696,49.4188,8.705,49.386|8.69363,49.4208,8.703,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("time", "2008-05-27")
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
	public void test_t4l4u6bhhxlv_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.742,49.431,8.700,49.4073,8.73712,49.41045,8.704561,49.403252")
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
	public void test_1h7wi8i0arrxs_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-10-29")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "mMSWO:8.746431,49.408,6")
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
	public void test_1h7toicnis7qu_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* and type:way and length:( .. 100)")
				.queryParam("bboxes", "fdJD:8.6625,49.424,8.753487,49.386|FW:8.69499,49.408,8.736,49.38224|a:8.689,49.4109,8.7362,49.39995")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "X:8.748,49.4085,4")
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
	public void test_to1srsz8zgx1_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "W:8.704561,49.403252,8.743,49.417,8.703,49.4147,8.721,49.407,8.704561,49.403252|gI:8.704561,49.403252,8.717541,49.4248,8.723,49.433,8.700,49.434,8.704561,49.403252|zgC:8.704561,49.403252,8.7287,49.411,8.7061,49.430,8.739,49.407,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_qdt8ztlkhpib_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6535,49.4205,8.7137,49.3859|8.66107,49.4215,8.7412,49.396|8.678290,49.421,8.729,49.381")
				.queryParam("format", "json")
				.queryParam("time", "2016-03-06")
				.queryParam("timeout", "73")
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
	public void test_1hv8b331ggieq_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-12-24")
				.queryParam("bpolys", "8.704561,49.403252,8.7049,49.40104,8.7203,49.4200,8.734,49.4058,8.704561,49.403252|8.704561,49.403252,8.7272,49.4284,8.732892,49.409,8.7378,49.41003,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_t4f3d5l323p0_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "lcayn:8.739,49.408,2")
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
	public void test_qxtavx8qb3ok_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2008-01-02")
				.queryParam("bcircles", "g:8.731,49.40324,2")
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
	public void test_urxzerz0f4mr_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6760,49.406,8.709,49.397")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-10-08")
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
	public void test_rhje5i0xz7ea_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.687,49.425,8.715,49.3879|8.676,49.40905,8.7379,49.386198")
				.queryParam("format", "csv")
				.queryParam("time", "2009-07-30")
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
	public void test_1ibhl2gjn4kth_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-08-12")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "8.705,49.41973,7|8.741,49.410281,772|8.743,49.43994,24|8.7395,49.4379,36")
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
	public void test_qhsw1wnjeek5_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "j:8.704561,49.403252,8.7062,49.4392,8.7472,49.4269,8.700,49.425,8.704561,49.403252|Ouqm:8.704561,49.403252,8.7298,49.4120,8.701,49.4368,8.742,49.4159,8.704561,49.403252|n:8.704561,49.403252,8.71459,49.416,8.737,49.412327,8.706,49.40541,8.704561,49.403252")
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
	public void test_1iyl1hutsz86t_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "AG:8.6870,49.4197,8.7388,49.382|F:8.68182,49.403,8.7150,49.381959|EyrX:8.674,49.4256,8.746,49.380|VwWrQ:8.698,49.4236,8.7504,49.395")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "dBLaK:8.704561,49.403252,8.742,49.425423,8.73461,49.423,8.729,49.429,8.704561,49.403252")
				.queryParam("timeout", "45")
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
	public void test_sl3eumttc8di_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and type:way and not area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bpolys", "s:8.704561,49.403252,8.700,49.438,8.749835,49.435434,8.732,49.436598,8.704561,49.403252|QK:8.704561,49.403252,8.7341,49.412,8.704,49.42363,8.709,49.411,8.704561,49.403252|uMd:8.704561,49.403252,8.7155,49.43376,8.74512,49.4273,8.72731,49.427,8.704561,49.403252")
				.queryParam("timeout", "71")
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
	public void test_1hv0g4voikgh1_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2017-07-02")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "eb:8.707,49.435887,83|bM:8.728,49.411,12|m:8.7011,49.408,5")
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
	public void test_qhnc45wk5d9h_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and length:( .. 100)")
				.queryParam("bboxes", "t:8.6663,49.4144,8.755,49.385")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-10-12")
				.queryParam("timeout", "44")
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
	public void test_1k1wqt3azwsvm_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "2013-10-31")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "wBu:8.742,49.410,9|x:8.747,49.43053,3")
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
	public void test_ursep4w573vp_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.684777,49.4240,8.7373,49.391|8.6794,49.423,8.7396,49.38452")
				.queryParam("format", "json")
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
	public void test_s0uhasxlhph1_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "mealI:8.6900,49.4293,8.759,49.397226")
				.queryParam("timeout", "92")
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
	public void test_qe9vkbw9psgx_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.712084,49.401,8.711,49.421,8.735,49.424,8.704561,49.403252|8.704561,49.403252,8.717,49.4266,8.720988,49.4297,8.7346,49.42868,8.704561,49.403252|8.704561,49.403252,8.72126,49.401,8.708869,49.4384,8.70512,49.4020,8.704561,49.403252")
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
	public void test_s0ujpagp7rqx_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-09-10")
				.queryParam("bcircles", "pev:8.7465,49.404353,4")
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
	public void test_urk3tveslovt_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.405,8.746,49.432,8.725,49.41360,8.704561,49.403252")
				.queryParam("timeout", "82")
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
	public void test_vbhgahqy850m_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=* or not length:( .. 100)")
				.queryParam("bboxes", "oNttk:8.6786,49.419968,8.732,49.387")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
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
	public void test_rhaims1i08xe_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("bcircles", "JfGS:8.73459,49.424368,29")
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
	public void test_ubgdc8k1po37_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "2018-03-18")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "gdjpf:8.737,49.427,45|o:8.737,49.40536,83")
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
	public void test_qxfztttn05rk_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "sAzwg:8.745,49.4019,4")
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
	public void test_toigwzfuu8tx_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2010-12-02")
				.queryParam("bpolys", "8.704561,49.403252,8.733623,49.4121,8.704,49.409778,8.708,49.434982,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_sl15bpy7dnj8_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2017-04-09")
				.queryParam("bpolys", "8.704561,49.403252,8.73456,49.4260,8.700400,49.405,8.744584,49.400,8.704561,49.403252")
				.queryParam("timeout", "67")
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
	public void test_skmrcl0t5e7k_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "bd:8.704561,49.403252,8.70900,49.406,8.701765,49.436,8.700828,49.43793,8.704561,49.403252|eAkXU:8.704561,49.403252,8.721984,49.431,8.742,49.417,8.70812,49.421,8.704561,49.403252|B:8.704561,49.403252,8.730,49.42254,8.7368,49.42193,8.721,49.428,8.704561,49.403252")
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
	public void test_vbkocrjs59o2_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.705,49.41928,8.7096,49.431658,8.704547,49.4329,8.704561,49.403252")
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
	public void test_1iuqgp5ga04dx_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.662004,49.400,8.723,49.3865")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-12-06")
				.queryParam("timeout", "33")
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
	public void test_1ib0gy67h77sn_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "TQ:8.6771,49.414,8.733,49.391|v:8.694351,49.424,8.750,49.397|I:8.65944,49.4168,8.722750,49.3928")
				.queryParam("time", "2018-05-02")
				.queryParam("timeout", "88")
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
	public void test_1jyjc5dtwewqg_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,residential")
				.queryParam("bboxes", "WGX:8.678,49.412375,8.73837,49.399|vUE:8.6509,49.402014,8.742332,49.3953|DivJa:8.679,49.418,8.7269,49.397|v:8.659,49.4165,8.749,49.3842")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.747,49.4088,5|8.719,49.405,8|8.721,49.42857,27")
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
	public void test_1h7zauz50n6eo_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and id:(1 .. 9999)")
				.queryParam("groupByValues", "station,synagogue,primary_link")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bcircles", "8.7315,49.405,5|8.7403,49.43894,5")
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
	public void test_vbelpnvsnxgx_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,residential")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.708,49.430,3|8.705,49.4088,76|8.74820,49.438,7")
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
	public void test_1hrayzirutq9k_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,elevator,commercial")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YWwa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.437],[8.725,49.4118],[8.71389,49.40303],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"sAxOw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72263,49.403],[8.7117,49.401],[8.701,49.434],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "37")
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
	public void test_1iemo0d3vfodv_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp,traffic_mirror")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.733,49.4219,361974366")
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
	public void test_1jew1rd26m63l_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,street_lamp,platform")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-08-25")
				.queryParam("bcircles", "8.7349,49.4033,985")
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
	public void test_1hux4y5i4r60h_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,platform,pedestrian")
				.queryParam("bboxes", "t:8.6800,49.400,8.748,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-09-12")
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
	public void test_skmu30c3tliv_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "ipYF:8.7477,49.414,3")
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
	public void test_qec4n4ax5pib_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,turning_circle")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "DlZw:8.703,49.414190,83")
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
	public void test_uvbfkdcavigg_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,cycleway")
				.queryParam("filter", "natural=wood or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "fhyED:8.7409,49.414,8")
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
	public void test_1hbj8uyzjv7ee_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path,synagogue")
				.queryParam("filter", "addr:postcode!=* or geometry:line")
				.queryParam("bboxes", "8.6645,49.428235,8.7111,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-01-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.426],[8.737,49.42025],[8.713,49.4372],[8.704561,49.403252]]]}}]}")
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
	public void test_1jicsureivx2q_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.655,49.425653,8.74560,49.380")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-08-10")
				.queryParam("bpolys", "8.704561,49.403252,8.713,49.407,8.70967,49.42878,8.743,49.405,8.704561,49.403252")
				.queryParam("timeout", "22")
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
	public void test_skyeppmll6cj_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2015-12-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zgvf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7062,49.402],[8.704,49.40920],[8.7397,49.403818],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"eZq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.401],[8.726,49.40008],[8.74492,49.4381],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.416678],[8.700,49.4194],[8.722,49.4059],[8.704561,49.403252]]]}}]}")
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
	public void test_qxg0a5rquiwp_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,footway")
				.queryParam("bboxes", "8.663,49.409796,8.73016,49.395|8.694,49.423,8.7176,49.38352|8.678531,49.404,8.718,49.393|8.662034,49.422,8.71129,49.3804")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
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
	public void test_1h85as2wumbmp_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway and not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-01-09")
				.queryParam("bcircles", "8.7251,49.4163,9")
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
	public void test_ubgdq43l4oxl_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or type:node or not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.7140,49.43457,8.70495,49.43786,8.739,49.410,8.704561,49.403252|8.704561,49.403252,8.729145,49.417,8.703,49.411554,8.7149,49.4235,8.704561,49.403252")
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
	public void test_rl2b4kvtgx81_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-03-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"aFDFI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.426766],[8.704770,49.435279],[8.7431,49.434591],[8.704561,49.403252]]]}}]}")
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
	public void test_1hruujsehjpyr_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,construction,chapel")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-01-14")
				.queryParam("bcircles", "8.731,49.421286,9")
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
	public void test_1iyfgbptgpnoz_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,tertiary")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"uo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.4093],[8.7438,49.435],[8.744,49.40849],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"oZoH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.424],[8.704080,49.4194],[8.71242,49.41412],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.430],[8.708,49.401934],[8.7048,49.41574],[8.704561,49.403252]]]}}]}")
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
	public void test_1iev1obietrue_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Zt:8.6817,49.427,8.7577,49.3875")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-04-01")
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
	public void test_1iun5fvqyn4ts_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or not type:node")
				.queryParam("bboxes", "q:8.656,49.40456,8.722,49.3889|t:8.6653,49.419,8.7272,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("time", "2011-04-21")
				.queryParam("bpolys", "SY:8.704561,49.403252,8.718504,49.437,8.70371,49.4220,8.7039,49.430,8.704561,49.403252|G:8.704561,49.403252,8.721,49.436076,8.744634,49.418,8.700,49.430,8.704561,49.403252|n:8.704561,49.403252,8.7399,49.415,8.735,49.4103,8.704,49.4399,8.704561,49.403252")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "l:8.715622,49.427,8")
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
	public void test_ureklalzywrp_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and type:relation or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "kv:8.677,49.428,8.749,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.7248,49.4007,8.735,49.431,8.7091,49.4309,8.704561,49.403252")
				.queryParam("bcircles", "oPP:8.741269,49.40716,3")
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
	public void test_r1csikyozwpu_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "uqbav:8.704561,49.403252,8.701,49.424,8.723,49.4044,8.704,49.432,8.704561,49.403252")
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
	public void test_1iv4ah5jgu2wm_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes,residential,tower")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-03-04")
				.queryParam("bcircles", "8.741,49.4006,5|8.7349,49.431,2")
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
	public void test_1h7za03ycx9h3_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,tower")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("time", "2014-05-26")
				.queryParam("bcircles", "lo:8.733,49.414,6|IXikb:8.7368,49.414,4|sSXSH:8.730,49.411,8|ehTkv:8.71034,49.403,881832377620")
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
	public void test_s18bs2ysounq_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-03-09")
				.queryParam("bpolys", "IcV:8.704561,49.403252,8.70860,49.4349,8.706,49.410422,8.70298,49.4383,8.704561,49.403252|RxeG:8.704561,49.403252,8.727,49.427,8.7047,49.43806,8.725,49.4382,8.704561,49.403252|bYT:8.704561,49.403252,8.7112,49.430,8.749786,49.4024,8.708,49.422341,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_qhnc6esrtnaq_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "w:8.718,49.4136,6|lX:8.70555,49.4157,4|dRJ:8.7444,49.41570,25|ic:8.7265,49.417395,6")
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
	public void test_skxuiyj21vmt_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,hut,hospital")
				.queryParam("filter", "destination=* or not type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "uL:8.6822,49.4228,8.7537,49.3836")
				.queryParam("groupByKey", "building")
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
	public void test_u7r9frcrlgth_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,elevator,hospital")
				.queryParam("filter", "addr:country!=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-09-23")
				.queryParam("bpolys", "YxlqX:8.704561,49.403252,8.7293,49.4333,8.7041,49.415,8.70451,49.41012,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_1jei6y97aj0wy_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.685,49.410025,8.713,49.380|8.659241,49.409,8.7292,49.38038|8.675,49.4171,8.722,49.3848")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-04-11")
				.queryParam("timeout", "23")
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
	public void test_1jyllo23usiuc_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,living_street,bus_stop")
				.queryParam("filter", "source:maxspeed=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.661,49.416,8.718,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-10-25")
				.queryParam("bpolys", "Q:8.704561,49.403252,8.746,49.41444,8.7049,49.439,8.704,49.4200,8.704561,49.403252|yp:8.704561,49.403252,8.736,49.43163,8.704029,49.420392,8.70498,49.409744,8.704561,49.403252")
				.queryParam("timeout", "41")
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
	public void test_qxtcrqc4ewkk_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "BFEm:8.717460,49.4164,2")
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
	public void test_qdqh5h12xph0_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hotel,apartments")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "2007-10-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TvskX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.416],[8.7343,49.401],[8.723,49.432],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"py\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.400],[8.719,49.434],[8.702,49.4381],[8.704561,49.403252]]]}}]}")
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
	public void test_ubgbsa0m6ng1_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,footway")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "V:8.7091,49.403,94|NcZcv:8.701,49.434,7")
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
	public void test_rkzldde6vprk_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,traffic_mirror,path")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "2008-07-27")
				.queryParam("bcircles", "yK:8.739817,49.4229,1|eXkgw:8.7147,49.418,772")
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
	public void test_rhb2tqkqsbw5_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "zO:8.719,49.430,14")
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
	public void test_uve7epwstso2_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-11-17")
				.queryParam("bcircles", "D:8.7422,49.4205,49|J:8.7139,49.427,7")
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
	public void test_qxw4lyzzllx4_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,traffic_signals")
				.queryParam("bboxes", "OHKL:8.6926,49.41564,8.73090,49.395|A:8.664,49.425,8.723765,49.38073")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "61")
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
	public void test_1h7tq4zw96szb_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-12-29")
				.queryParam("bpolys", "ZT:8.704561,49.403252,8.707,49.4324,8.715988,49.411,8.746,49.420,8.704561,49.403252")
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
	public void test_toihb2kyoc4h_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73232,49.430],[8.73489,49.4382],[8.708,49.4045],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ta\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.4011],[8.712,49.433],[8.702,49.4162],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"P\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.407],[8.704561,49.41213],[8.7245,49.4077],[8.704561,49.403252]]]}}]}")
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
	public void test_ts56aenbfodw_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2013-11-04")
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
	public void test_tonzr80jcmr8_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.666,49.4186,8.708,49.390|8.672,49.425,8.755,49.384|8.667,49.424794,8.702,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-03-30")
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
	public void test_1hrgfvbic0y0p_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-03-12")
				.queryParam("bpolys", "LNJSl:8.704561,49.403252,8.7264,49.438755,8.705,49.41987,8.7055,49.4253,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_rhofris5y1iu_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-03-12")
				.queryParam("bpolys", "LNJSl:8.704561,49.403252,8.7264,49.438755,8.705,49.41987,8.7055,49.4253,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_qhkie4jqbdyb_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2014-09-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"VwPRa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.410964],[8.7042,49.401],[8.701,49.439],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"v\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.4044],[8.704,49.4225],[8.741770,49.416],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"r\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.404796],[8.705,49.43856],[8.717,49.4023],[8.704561,49.403252]]]}}]}")
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
	public void test_rhlogd4n8y7q_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "CW:8.704561,49.403252,8.701,49.409,8.737751,49.4316,8.70456,49.4284,8.704561,49.403252|g:8.704561,49.403252,8.713,49.421,8.7474,49.433,8.742,49.4017,8.704561,49.403252")
				.queryParam("timeout", "47")
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
	public void test_1ib98yowbjcyp_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "8.738,49.404806,92")
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
	public void test_s4muii71hisl_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6632,49.422,8.70093,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2017-06-28")
				.queryParam("timeout", "75")
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
	public void test_sobslszrm7hf_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.742,49.4154,8.701,49.439,8.7045,49.401,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_1hrgy4ipxlrg4_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6749,49.405,8.705,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-01-08")
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
	public void test_1jent5rh21tnm_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "primary")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "DHN:8.7462,49.432,1")
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
	public void test_1jicrm6wsvh2v_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "M:8.699,49.404,8.7536,49.397")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "92")
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
	public void test_qe9dn8qg3eph_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* and geometry:point and length:( .. 100)")
				.queryParam("bboxes", "jwc:8.6568,49.402,8.701120,49.399984|rvTgw:8.6652,49.422,8.7554,49.38398")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-03-17")
				.queryParam("timeout", "82")
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
	public void test_1h82k68iaelwm_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2017-09-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"uTn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4172],[8.704319,49.423],[8.7243,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7381,49.420],[8.736762,49.408798],[8.70456,49.431],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"v\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.4291],[8.749,49.424028],[8.7304,49.430],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "21")
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
	public void test_1hv5httgf6a1w_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "JQpae:8.66938,49.4191,8.719766,49.3983|Yo:8.69271,49.407,8.723,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "2010-08-12")
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
	public void test_tol92stmj0vp_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.68731,49.4103,8.7398,49.3834")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "81")
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
	public void test_1h7wzdmvqvomd_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-08-18")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "Azrde:8.732,49.4230,5")
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
	public void test_uvgy0ehnihps_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.739,49.4177,4|8.704,49.401,92")
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
	public void test_s18ewbv9cmyc_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "ZQ:8.704561,49.403252,8.723472,49.41980,8.708,49.41167,8.706,49.4267,8.704561,49.403252")
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
	public void test_1jew3pf19xl4n_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or not area:(1.0 .. 1E6)")
				.queryParam("bcircles", "pQlGf:8.739,49.430115,1")
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
	public void test_t49j1dq56d6e_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or type:node or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2011-12-29")
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
	public void test_1ien6ndizd1de_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "mdguO:8.709,49.400,1|F:8.724430,49.416,8")
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
	public void test_qxiatwko73ac_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2015-06-09")
				.queryParam("bpolys", "ETQdc:8.704561,49.403252,8.724,49.43251,8.714,49.412,8.703,49.422827,8.704561,49.403252|iu:8.704561,49.403252,8.724,49.4382,8.7276,49.425,8.7042,49.42235,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1hv5hre96pbom_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "hsbNR:8.704561,49.403252,8.715728,49.422,8.735,49.400,8.703,49.432,8.704561,49.403252|JO:8.704561,49.403252,8.739,49.4388,8.726,49.4229,8.7079,49.40936,8.704561,49.403252")
				.queryParam("timeout", "79")
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
	public void test_u8b8igx1fdx2_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or id:(1 .. 9999)")
				.queryParam("bboxes", "Q:8.686,49.4061,8.75975,49.397|wvZU:8.6928,49.4214,8.754,49.390")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "45")
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
	public void test_1k1wqqmivwpx3_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("bpolys", "hj:8.704561,49.403252,8.727,49.432437,8.734928,49.431,8.7039,49.439,8.704561,49.403252|CeNp:8.704561,49.403252,8.742,49.42799,8.704,49.4034,8.741,49.432,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_1hux7o9auj1b7_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-06-25")
				.queryParam("bpolys", "8.704561,49.403252,8.742,49.4285,8.713516,49.403,8.7043,49.409,8.704561,49.403252")
				.queryParam("timeout", "95")
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
	public void test_to1rxfyaph6g_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.4315,8.726,49.434,8.733,49.42381,8.704561,49.403252")
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
	public void test_1hv88frglzjud_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-04-10")
				.queryParam("bpolys", "lSB:8.704561,49.403252,8.7382,49.4167,8.709,49.4387,8.729926,49.430,8.704561,49.403252|Hot:8.704561,49.403252,8.7471,49.406,8.71887,49.40611,8.706,49.4343,8.704561,49.403252|hdjCI:8.704561,49.403252,8.718,49.419157,8.7444,49.419,8.7043,49.401,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_1jicrojrefbcl_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2017-05-14")
				.queryParam("bpolys", "8.704561,49.403252,8.7477,49.413146,8.742881,49.433985,8.73263,49.430,8.704561,49.403252")
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
	public void test_urv62rq7a0xg_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_1jict65fcr1b6_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-09-03")
				.queryParam("bcircles", "8.717,49.426292,4|8.72036,49.432,8|8.7232,49.4052,3|8.711,49.4321,771400082119")
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
	public void test_ts1vszzg9fsp_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"hA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7447,49.4030],[8.7309,49.424],[8.71365,49.427],[8.704561,49.403252]]]}}]}")
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
	public void test_1ji1oyzn7ekvm_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "gJ:8.704561,49.403252,8.749,49.403,8.722,49.421,8.7041,49.4039,8.704561,49.403252|JOZ:8.704561,49.403252,8.716,49.417491,8.749,49.4312,8.711,49.4121,8.704561,49.403252|zAD:8.704561,49.403252,8.74759,49.4276,8.7337,49.419861,8.7071,49.41470,8.704561,49.403252")
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
	public void test_ts1yjd99wv8z_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "j:8.6570,49.424,8.7485,49.382|b:8.689,49.425,8.734,49.382")
				.queryParam("format", "json")
				.queryParam("time", "2011-05-02")
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
	public void test_1hv8s8jd854j6_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "oaHeQ:8.703,49.43925,4")
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
	public void test_rkwudg7s2vqw_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "CXUTu:8.73507,49.431747,58")
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
	public void test_qhnu441h52r6_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-04-22")
				.queryParam("bcircles", "Lh:8.7145,49.4187,5")
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
	public void test_soknch4h2n1z_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=* or type:relation and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "2017-05-08")
				.queryParam("bcircles", "uQ:8.738,49.412704,57|rUSdN:8.727,49.40908,2")
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
	public void test_1h7zt3q6q3p6g_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("bpolys", "iKqJI:8.704561,49.403252,8.700845,49.4169,8.7099,49.419,8.7041,49.4190,8.704561,49.403252|kus:8.704561,49.403252,8.724,49.41236,8.7181,49.40334,8.704,49.414,8.704561,49.403252|eFbP:8.704561,49.403252,8.702,49.412,8.706,49.409,8.736,49.422612,8.704561,49.403252")
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
	public void test_1jensu95gcqci_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,synagogue")
				.queryParam("filter", "bicycle!=* or geometry:polygon")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.71434,49.417,2|8.7433,49.407,738")
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
	public void test_1h7z8imkq5vef_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,yes,traffic_mirror")
				.queryParam("bboxes", "UKmR:8.699,49.405,8.743,49.390|xzWDk:8.6996,49.410,8.720,49.394")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-10-31")
				.queryParam("bcircles", "tHu:8.727,49.429,5")
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
	public void test_sksawgm6hb20_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,footway,traffic_mirror")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2014-12-22")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "BmDO:8.706,49.40623,3")
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
	public void test_1jxzeoxadzwvp_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,emergency_access_point,tower")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2013-11-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.40177],[8.704,49.433],[8.729312,49.402],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73766,49.413],[8.705,49.422],[8.7096,49.404],[8.704561,49.403252]]]}}]}")
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
	public void test_rh89vpif9po8_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-09-13")
				.queryParam("bcircles", "AsF:8.745,49.4033,1")
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
	public void test_1ib6gsm1jo7jm_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "crossing,garage,roof")
				.queryParam("bboxes", "PSI:8.697489,49.403,8.701,49.385")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-07-16")
				.queryParam("timeout", "30")
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
	public void test_1jeo9wzjr5ovr_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,station,primary")
				.queryParam("bboxes", "d:8.662,49.4078,8.743,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-08-17")
				.queryParam("timeout", "33")
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
	public void test_qe11xilgty79_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,ship,elevator")
				.queryParam("filter", "lit=* or type:node or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-05-02")
				.queryParam("bpolys", "BCf:8.704561,49.403252,8.702,49.418,8.71580,49.41217,8.704867,49.400,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_sobrtmgccbow_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "synagogue,traffic_signals,residential")
				.queryParam("filter", "network!=* or type:relation")
				.queryParam("bboxes", "v:8.687,49.4000,8.743185,49.382|YIrjd:8.668,49.427508,8.74991,49.396|fURod:8.665,49.4067,8.705,49.390949|ClV:8.66598,49.4054,8.709,49.3846")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-05-27")
				.queryParam("timeout", "23")
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
	public void test_1jxzxbu6ffv3o_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-08-28")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "Z:8.73563,49.429,5")
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
	public void test_trqvfqfeevza_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes,garage,path")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "79")
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
	public void test_1jecmjsnk6fz6_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6830,49.40045,8.714,49.385")
				.queryParam("format", "geojson")
				.queryParam("timeout", "90")
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
	public void test_vbbwcndglmjn_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-05-30")
				.queryParam("bcircles", "C:8.7494,49.4398,7|WI:8.716,49.409,29")
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
	public void test_tonykut38hur_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "Jq:8.7165,49.432,43|knD:8.7143,49.424,216")
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
	public void test_1jei6yauy6bfp_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "YN:8.704561,49.403252,8.74549,49.40515,8.729,49.409,8.7275,49.403,8.704561,49.403252|ahu:8.704561,49.403252,8.732,49.417,8.710,49.4330,8.7041,49.418,8.704561,49.403252")
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
	public void test_vf1e7rahgeas_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "8.729,49.414689,3|8.734,49.4098,2")
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
	public void test_qxns1h5r18wz_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "b:8.704561,49.403252,8.728,49.43776,8.706,49.439,8.70456,49.423913,8.704561,49.403252|NNN:8.704561,49.403252,8.718,49.429191,8.704,49.42169,8.7118,49.439560,8.704561,49.403252|U:8.704561,49.403252,8.742893,49.4302,8.701131,49.419,8.701912,49.4279,8.704561,49.403252")
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
	public void test_t8f8199x2m2a_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-08-10")
				.queryParam("bcircles", "8.735668,49.425,4")
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
	public void test_urmeuji2kyet_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "university,chapel")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-08-14")
				.queryParam("bpolys", "rSRGi:8.704561,49.403252,8.7391,49.401,8.719,49.436,8.708,49.404902,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_skk0fhot6pgk_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2010-11-03")
				.queryParam("bpolys", "EgH:8.704561,49.403252,8.70150,49.401,8.72690,49.412,8.709,49.402,8.704561,49.403252")
				.queryParam("timeout", "27")
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
	public void test_skscxesvdiyh_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or geometry:line and length:( .. 100)")
				.queryParam("bboxes", "TJd:8.695,49.4012,8.711,49.381|hMAqF:8.693,49.4298,8.709,49.3991|f:8.657,49.404,8.714578,49.393")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "f:8.704561,49.403252,8.709,49.435,8.7066,49.412018,8.735204,49.433,8.704561,49.403252")
				.queryParam("groupByKeys", "maxspeed,tracktype")
				.queryParam("bcircles", "kWcnA:8.737738,49.4362,8")
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
	public void test_1k1zjohqdkcwx_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gy:8.6955,49.4063,8.733,49.38791|dfxAO:8.6863,49.427,8.733,49.387|QdWI:8.694,49.42940,8.75782,49.3853")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-05-11")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "HM:8.718225,49.415773,9|d:8.7203,49.432,8")
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
	public void test_s0v0e7ce3vj6_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or geometry:line and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "2017-08-24")
				.queryParam("groupByKeys", "addr:city,network")
				.queryParam("bcircles", "GJF:8.74175,49.438,9|ijWL:8.7107,49.4166,7|a:8.74296,49.407,60")
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
	public void test_1iv1jehch5yy9_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("timeout", "40")
				.queryParam("groupByKeys", "addr:housenumber,lit,lanes:backward")
				.queryParam("bcircles", "8.7242,49.424,6")
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
	public void test_1hbisvhof50kx_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2016-05-09")
				.queryParam("bpolys", "f:8.704561,49.403252,8.7459,49.4377,8.704,49.4167,8.7040,49.437676,8.704561,49.403252")
				.queryParam("timeout", "94")
				.queryParam("groupByKeys", "foot,name")
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
	public void test_qdpzlnbybdx2_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2010-07-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"sbQun\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.423],[8.735,49.407816],[8.7049,49.436],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"gWh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7006,49.4354],[8.720,49.4162],[8.721,49.43327],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715776,49.42063],[8.7041,49.430],[8.72409,49.43746],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "network,type,foot")
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
	public void test_ubgbdz0pgxfb_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or type:relation")
				.queryParam("bboxes", "U:8.665,49.412,8.750951,49.38887|I:8.6685,49.411,8.715,49.3856|Bt:8.669,49.4098,8.700,49.397")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-03-16")
				.queryParam("groupByKeys", "lanes:backward,type")
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
	public void test_1hbdr6ygd63qb_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.650,49.406,8.740,49.381|U:8.696,49.422,8.717279,49.3939")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("time", "2018-01-12")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "landuse,barrier")
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
	public void test_s1dx9ocjp1kh_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "GQP:8.6871,49.4059,8.7476,49.3830")
				.queryParam("keys", "highway")
				.queryParam("groupByKeys", "addr:postcode,barrier")
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
	public void test_1iv6l0xwgcawk_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line")
				.queryParam("bboxes", "fk:8.691,49.423,8.7109,49.381")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-06-15")
				.queryParam("timeout", "100")
				.queryParam("groupByKeys", "turn,tracktype")
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
	public void test_1jxzfempa020o_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or id:(1 .. 9999)")
				.queryParam("bboxes", "z:8.679,49.426,8.702,49.383|HK:8.656426,49.4138,8.757,49.380|wLG:8.6767,49.4220,8.711,49.386245|c:8.669,49.42167,8.721368,49.385231")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-03-10")
				.queryParam("groupByKeys", "foot,bicycle,lanes")
				.queryParam("bcircles", "8.706,49.42267,1")
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
	public void test_u8ao8npp01np_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"nkFyF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.400],[8.7079,49.400987],[8.704128,49.41475],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"w\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7247,49.41695],[8.731,49.4198],[8.70420,49.42905],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"NYsm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.4351],[8.7298,49.427],[8.7076,49.401],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "8.7231,49.40031,1|8.740,49.4250,6")
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
	public void test_1jy87k6litk6e_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "o:8.6868,49.422,8.743,49.396")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-05-08")
				.queryParam("groupByKeys", "lanes:forward,addr:street,destination")
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
	public void test_1jezcp8015mb6_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.698,49.409,8.737,49.392|8.6596,49.411697,8.738,49.3873|8.657330,49.425,8.717,49.385")
				.queryParam("format", "csv")
				.queryParam("time", "2008-10-06")
				.queryParam("groupByKeys", "turn,lanes:forward")
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
	public void test_r1ibzo93ixr5_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "lpLQn:8.704561,49.403252,8.732,49.4015,8.71772,49.407458,8.70466,49.411,8.704561,49.403252|veqb:8.704561,49.403252,8.74889,49.419,8.737,49.4027,8.709269,49.43252,8.704561,49.403252|hiClF:8.704561,49.403252,8.733,49.426,8.7211,49.404,8.706,49.43331,8.704561,49.403252")
				.queryParam("groupByKeys", "tracktype,bicycle,source:maxspeed")
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
	public void test_1hb878tvad8bm_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.4133],[8.7045,49.424],[8.704,49.434],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "90")
				.queryParam("groupByKeys", "destination,turn:lanes,source:maxspeed")
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
	public void test_rhdt1nvyd9v9_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-02-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Wdc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7102,49.429],[8.726,49.437],[8.703,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "bicycle,addr:postcode,lit")
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
	public void test_urgshnuq1kxc_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ZOYf:8.685,49.40675,8.7132,49.3955")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "27")
				.queryParam("groupByKeys", "building,network,foot")
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
	public void test_1h7whgdr9sz07_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yaYu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7132,49.416],[8.715,49.426],[8.704,49.407],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "turn,lanes:forward,lit")
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
	public void test_s1gp2298yu61_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wOKEK:8.695,49.4038,8.756,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-02-01")
				.queryParam("timeout", "92")
				.queryParam("groupByKeys", "lanes:backward,lit,addr:city")
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
	public void test_1hrghtoy0nozb_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,church,synagogue")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2017-02-19")
				.queryParam("bpolys", "8.704561,49.403252,8.728,49.429751,8.717,49.433,8.707,49.4328,8.704561,49.403252|8.704561,49.403252,8.7252,49.422,8.70021,49.413,8.7451,49.424,8.704561,49.403252")
				.queryParam("bcircles", "8.725,49.405992,2|8.7290,49.42619,1")
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
	public void test_1hr8nkg45ztx4_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "synagogue,public,secondary_link")
				.queryParam("bboxes", "G:8.653,49.402299,8.752,49.3824|H:8.673,49.4053,8.755,49.396")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-03-17")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "nKMjQ:8.71010,49.43037,6")
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
	public void test_r1a496zzbg4h_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,living_street")
				.queryParam("bboxes", "DeUCB:8.678278,49.4205,8.708974,49.385|a:8.673,49.411404,8.7037,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2008-02-10")
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
	public void test_s50p2mhlafjk_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "footway,primary,church")
				.queryParam("filter", "highway!=* and type:node")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"J\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739695,49.400],[8.7321,49.439],[8.700,49.4193],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "62")
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
	public void test_1iyhp2k5xg5dl_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,crossing")
				.queryParam("bboxes", "VsW:8.675,49.415853,8.7576,49.383|Cq:8.6802,49.412,8.710,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-12-14")
				.queryParam("timeout", "48")
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
	public void test_1hbisey4iqa1x_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-03-06")
				.queryParam("bcircles", "OwhOM:8.71732,49.43632,5|MTD:8.718,49.429897,7")
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
	public void test_1k229yttu92zl_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and type:node or length:( .. 100)")
				.queryParam("bboxes", "8.695,49.426,8.727,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_t86tnlsinynn_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EuN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.423],[8.70579,49.4030],[8.7039,49.417],[8.704561,49.403252]]]}}]}")
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
	public void test_uv8linpo77zn_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp,track")
				.queryParam("filter", "destination=* or geometry:line and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2015-12-04")
				.queryParam("bcircles", "dpD:8.746682,49.4072,26|HGw:8.7283,49.4240,4")
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
	public void test_1ib0y0umsumnm_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,path,dormitory")
				.queryParam("bboxes", "Ok:8.6529,49.4134,8.75444,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-10-21")
				.queryParam("timeout", "52")
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
	public void test_1jetatsc69ge0_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,crossing,residential")
				.queryParam("bboxes", "fG:8.6721,49.4069,8.751,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-10-08")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Seo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4177],[8.7028,49.42717],[8.7083,49.413069],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wuEg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.40541],[8.7081,49.400309],[8.7041,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ek\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.4297],[8.705,49.43791],[8.707,49.430546],[8.704561,49.403252]]]}}]}")
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
	public void test_u82exok7eek5_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "steps,synagogue")
				.queryParam("bboxes", "lpLtZ:8.6718,49.422,8.7461,49.386|Buq:8.682637,49.405,8.7403,49.399|jTp:8.663,49.402,8.731,49.381|bYahf:8.690,49.417,8.719,49.382")
				.queryParam("values", "platform")
				.queryParam("time", "2017-08-07")
				.queryParam("timeout", "23")
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
	public void test_vbmx3u3gnk9t_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-02-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Yyl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72440,49.4272],[8.709,49.4317],[8.72097,49.40478],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"kA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7096,49.42531],[8.700,49.427],[8.7045,49.4391],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"DIs\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7248,49.424],[8.70296,49.403],[8.700466,49.41025],[8.704561,49.403252]]]}}]}")
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
	public void test_qe1l0oo9kvhe_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,tower")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2016-05-28")
				.queryParam("bcircles", "8.747,49.401,20")
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
	public void test_1k1uiu5bjheev_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or type:node or length:( .. 100)")
				.queryParam("bboxes", "ycfN:8.666,49.42175,8.712168,49.399")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
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
	public void test_ublumaonu34y_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,give_way")
				.queryParam("groupByKey", "building")
				.queryParam("bcircles", "Kav:8.718,49.4010,4|b:8.742,49.427,5|gawMg:8.7393,49.423,2|QCw:8.720,49.42962,555469144856")
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
	public void test_vf0v6y1yf3n5_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7492,49.40738,8.708602,49.4373,8.7110,49.408,8.704561,49.403252|8.704561,49.403252,8.738,49.410,8.7241,49.43804,8.704368,49.414647,8.704561,49.403252")
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
	public void test_s0xrdwz5q3ox_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pU:8.655,49.4239,8.7350,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-05-01")
				.queryParam("timeout", "26")
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
	public void test_1hr5f1q1um88p_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6671,49.4255,8.711751,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-03-04")
				.queryParam("timeout", "91")
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
	public void test_1ji9z4pnngbj9_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_mirror,university,crossing")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-01-24")
				.queryParam("bpolys", "8.704561,49.403252,8.743858,49.425,8.72712,49.435171,8.7037,49.422,8.704561,49.403252")
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
	public void test_r1icdp1ctt29_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and geometry:line")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "K:8.704561,49.403252,8.72643,49.425,8.7049,49.431176,8.7047,49.401,8.704561,49.403252|uM:8.704561,49.403252,8.70950,49.4086,8.70425,49.43353,8.702,49.4057,8.704561,49.403252|KG:8.704561,49.403252,8.730,49.404,8.7040,49.401,8.703,49.438,8.704561,49.403252")
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
	public void test_qhsxaf7m68tz_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.659,49.400,8.745085,49.385|8.6939,49.424,8.739,49.394486|8.657,49.415,8.7542,49.38867")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-10-31")
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
	public void test_qdsqaaf1azqe_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.43096,8.717,49.4148,8.701,49.427,8.704561,49.403252")
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
	public void test_s50p2iiz2uy9_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or length:( .. 100)")
				.queryParam("bpolys", "msgeb:8.704561,49.403252,8.728,49.430,8.734,49.404459,8.709,49.427,8.704561,49.403252|a:8.704561,49.403252,8.736292,49.4356,8.723,49.437,8.74556,49.439165,8.704561,49.403252|W:8.704561,49.403252,8.7363,49.438,8.743,49.40808,8.707,49.408,8.704561,49.403252")
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
	public void test_1iyq13hkd1zxv_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Vu:8.68783,49.414,8.756,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
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
	public void test_1h7lwcq9nj0hh_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-04-11")
				.queryParam("bcircles", "8.74337,49.4149,18")
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
	public void test_rkwr9ayaafz7_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "P:8.704561,49.403252,8.7106,49.4016,8.7045,49.40707,8.7203,49.40046,8.704561,49.403252")
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
	public void test_s4ruko22fof6_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-01-04")
				.queryParam("bcircles", "8.703,49.40597,68")
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
	public void test_1iyc5u98w19vc_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gw:8.6844,49.404959,8.745,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2009-12-29")
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
	public void test_rh4y836e262h_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "FZ:8.68475,49.427,8.706,49.384|kkXwB:8.6576,49.427883,8.7276,49.384|TK:8.657,49.406,8.756,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-08-20")
				.queryParam("timeout", "40")
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
	public void test_uvbf8smejaed_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* or type:node")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.73256,49.409,8.7068,49.429,8.737,49.401560,8.704561,49.403252|8.704561,49.403252,8.748,49.407567,8.712,49.425,8.719,49.4205,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_qxnr9qts319s_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or type:node")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-07-31")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "MpEU:8.723,49.403324,9")
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
	public void test_s18w1grrklrt_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.685,49.409,8.720,49.38379")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
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
	public void test_t8cwmqcaquyc_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "eJmk:8.733,49.4375,1|blBfn:8.740,49.429,55|R:8.717,49.4195,55")
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
	public void test_1hv2pz6keagxk_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2015-06-16")
				.queryParam("bpolys", "F:8.704561,49.403252,8.71644,49.41228,8.701,49.438,8.708,49.416,8.704561,49.403252|Og:8.704561,49.403252,8.729,49.403326,8.7035,49.413,8.747,49.414541,8.704561,49.403252|icRMd:8.704561,49.403252,8.7170,49.408,8.704,49.413,8.728,49.424,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_qe6kdnbrx99u_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.738,49.416,80")
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
	public void test_ts1wzeslzzvn_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway and area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"QQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717249,49.425],[8.7277,49.413],[8.7154,49.4006],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "73")
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
	public void test_urrybqd9p1ep_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YaJgv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7139,49.415],[8.7283,49.416],[8.741,49.4356],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710028,49.43960],[8.7049,49.4332],[8.729,49.41766],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"nWLV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7482,49.400],[8.747,49.416880],[8.73646,49.4183],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "35")
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
	public void test_rhdtfh5qgmyb_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* or type:way or length:( .. 100)")
				.queryParam("bboxes", "SFYo:8.67601,49.413,8.734,49.391")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_1jy88q1z73xo6_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6768,49.42420,8.7581,49.395")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
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
	public void test_1iuqf56kqd7i0_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "qkgaW:8.6624,49.4145,8.700048,49.38726|eSHx:8.655107,49.4133,8.709,49.381")
				.queryParam("types2", "node,relation")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-07-25")
				.queryParam("bpolys", "8.704561,49.403252,8.711,49.437,8.737,49.430,8.733231,49.401,8.704561,49.403252|8.704561,49.403252,8.7242,49.42593,8.7040,49.433,8.736,49.4273,8.704561,49.403252|8.704561,49.403252,8.70086,49.400,8.706,49.4155,8.700,49.411,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary")
				.queryParam("bcircles", "CxdI:8.715,49.417,1|Dc:8.736,49.415,17")
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
	public void test_qxljtxg44euq_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.672,49.406,8.75211,49.39240|8.666,49.404,8.71053,49.389")
				.queryParam("types2", "node,relation")
				.queryParam("format", "csv")
				.queryParam("filter2", "turn!=* or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "turning_circle")
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
	public void test_t4q3stzlw8qa_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "other")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-01-19")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.4191,8.7066,49.4020,8.7058,49.436962,8.704561,49.403252|8.704561,49.403252,8.707,49.400,8.70596,49.4398,8.740,49.410,8.704561,49.403252|8.704561,49.403252,8.74173,49.416,8.731660,49.4393,8.748,49.426,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
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
	public void test_rl54j1xcchus_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("filter2", "foot=* and geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "footway")
				.queryParam("bcircles", "dLww:8.701,49.436903,6")
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
	public void test_1iun7gm2mxant_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.733,49.420,8|8.747,49.41798,7|8.719134,49.4126,3")
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
	public void test_u7xd8x57akae_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "l:8.656,49.412,8.723,49.3931")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
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
	public void test_1iauuzj8a8hfd_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("values", "street_lamp")
				.queryParam("filter2", "maxspeed=* or geometry:polygon or not id:(1 .. 9999)")
				.queryParam("time", "2010-09-05")
				.queryParam("bpolys", "EXtfq:8.704561,49.403252,8.7242,49.43600,8.714,49.429,8.734,49.408,8.704561,49.403252|WVQhi:8.704561,49.403252,8.70507,49.4184,8.727184,49.4179,8.74331,49.408,8.704561,49.403252|U:8.704561,49.403252,8.7466,49.4324,8.703,49.41162,8.73698,49.4201,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "52")
				.queryParam("values2", "crossing")
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
	public void test_1ien7fdt5pf06_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "yhNxX:8.684810,49.416367,8.732,49.389")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("filter2", "lanes:forward!=*")
				.queryParam("time", "2015-05-27")
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
	public void test_r17ch9kjvt4l_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys2", "highway")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "fo:8.7407,49.406,65|Vp:8.700,49.416,98|NDuuA:8.706,49.404,8|I:8.747,49.4116,364487645458")
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
	public void test_rhr4td60r3uh_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "EkU:8.69314,49.428,8.7080,49.394")
				.queryParam("types2", "point,polygon,")
				.queryParam("filter2", "bicycle!=* and geometry:point")
				.queryParam("time", "2008-01-25")
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
	public void test_1ibh3imugwe3m_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "T:8.6551,49.4125,8.708220,49.38686")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("filter2", "destination!=* or length:( .. 100)")
				.queryParam("time", "2009-11-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bFYwk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.426],[8.7073,49.423],[8.73778,49.431],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
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
	public void test_ubp71padhz6r_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:way or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.7320,49.4107,33")
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
	public void test_vf3mhvs8r0ol_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.697,49.4054,8.71975,49.394|8.6631,49.411,8.74615,49.393|8.670,49.423,8.749743,49.398")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("values2", "path")
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
	public void test_t8f7bo6qjbza_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("filter2", "foot=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2008-12-02")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "E:8.72446,49.430,46|llX:8.71841,49.40563,5|Jb:8.739220,49.4025,75|jTXyx:8.706792,49.413,2")
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
	public void test_t4l4u0rdo6ra_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("filter2", "foot=*")
				.queryParam("time", "2016-03-24")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "29")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "qbO:8.74431,49.42037,785")
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
	public void test_rhoeaawtps9x_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("filter2", "addr:postcode=* or length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.428,8.735,49.419,8.706118,49.4159,8.704561,49.403252|8.704561,49.403252,8.7446,49.433654,8.704,49.40178,8.7044,49.4146,8.704561,49.403252|8.704561,49.403252,8.7057,49.416,8.7170,49.4149,8.743574,49.41191,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_sok673yyy3qd_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.666812,49.414,8.717,49.3925")
				.queryParam("types2", "way,")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-11-17")
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
	public void test_1jy7p5tuunyur_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* and id:(1 .. 9999)")
				.queryParam("bboxes", "e:8.6727,49.4146,8.707,49.3873|r:8.665,49.403,8.716,49.399")
				.queryParam("format", "json")
				.queryParam("filter2", "barrier!=* and not id:(1 .. 9999)")
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
	public void test_trz5lifdba03_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "oneway!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2008-04-16")
				.queryParam("bpolys", "8.704561,49.403252,8.73046,49.4051,8.7003,49.4025,8.704338,49.4017,8.704561,49.403252|8.704561,49.403252,8.7187,49.41255,8.729,49.405,8.73917,49.438,8.704561,49.403252|8.704561,49.403252,8.714,49.43096,8.7273,49.402,8.734,49.402,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "cycleway")
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
	public void test_qhtcvj8pr96f_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "V:8.675,49.42798,8.729,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "2014-03-01")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "47")
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
	public void test_vbmz21ls12k3_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-09-10")
				.queryParam("keys2", "highway")
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
	public void test_vbmyzscp4lyu_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or length:( .. 100)")
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref!=* and id:(1 .. 9999)")
				.queryParam("time", "2015-10-13")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "22")
				.queryParam("values2", "cycleway")
				.queryParam("bcircles", "8.719,49.423064,2|8.725,49.414,7")
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
	public void test_1h82je0b7d92p_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and not geometry:line and not area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary")
				.queryParam("bcircles", "8.745,49.422,3")
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
	public void test_qe3uvfe2a7u9_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "WClD:8.65983,49.4079,8.7401,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "surface!=*")
				.queryParam("time", "2015-10-29")
				.queryParam("timeout", "98")
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
	public void test_1hbjaevi92hbp_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,polygon,")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "wqDS:8.733,49.43067,75|dne:8.7085,49.423957,35")
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
	public void test_1hrorl0h73rjo_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Mv:8.673,49.418208,8.7224,49.397|boAbK:8.65895,49.402534,8.701205,49.387|DDYKm:8.6740,49.426,8.733,49.39796|m:8.6913,49.408,8.7521,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "building!=* or id:(1 .. 9999)")
				.queryParam("time", "2008-02-26")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_vf6h01dtcaxx_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Yqd:8.679,49.404,8.744,49.385")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "surface=* and not id:(1 .. 9999)")
				.queryParam("time", "2018-03-21")
				.queryParam("keys2", "highway")
				.queryParam("values2", "tertiary")
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
	public void test_1h7o5tdvmq69h_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("format", "csv")
				.queryParam("filter2", "maxspeed!=* and geometry:point")
				.queryParam("bcircles", "ByZJz:8.729,49.4319,69|ksB:8.714,49.4254,3|y:8.73574,49.439,9")
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
	public void test_vbt0555puhip_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "aK:8.704561,49.403252,8.7413,49.427,8.700561,49.4389,8.737,49.429,8.704561,49.403252|ayti:8.704561,49.403252,8.748917,49.426,8.7202,49.419,8.7108,49.4217,8.704561,49.403252|ZtX:8.704561,49.403252,8.735,49.42239,8.739530,49.41994,8.704561,49.434,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop_line")
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
	public void test_tooh7qyrgyua_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,other")
				.queryParam("format", "csv")
				.queryParam("filter2", "landuse=* and id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "71")
				.queryParam("values2", "cycleway")
				.queryParam("bcircles", "Y:8.7183,49.4364,7|y:8.724,49.4042,5|ug:8.747712,49.400,2")
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
	public void test_us0p88ec5v8h_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
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
	public void test_t4z03sgq8tpg_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.745,49.4358,771459690")
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
	public void test_qhsu64d0ipgj_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or type:way")
				.queryParam("types2", "polygon,")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "highway=* or not area:(1.0 .. 1E6)")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "tt:8.745868,49.4122,80")
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
	public void test_1iusrbg9b6p86_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "fMPuU:8.692,49.411,8.70613,49.3880|de:8.671,49.407163,8.7028,49.39122|R:8.690,49.402,8.733,49.390")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "stop")
				.queryParam("time", "2018-01-24")
				.queryParam("timeout", "78")
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
	public void test_1iyezybchc56g_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.694742,49.4030,8.72168,49.387|UXgfc:8.67964,49.417289,8.741,49.38824")
				.queryParam("keys", "highway")
				.queryParam("keys2", "highway")
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
	public void test_rhgl790c39t2_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("filter2", "foot=* and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "73")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "p:8.721,49.4247,94|q:8.724706,49.423348,9|qpV:8.723,49.4151,2")
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
	public void test_1jefh1sadc3ef_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.666879,49.4260,8.734290,49.389|8.684,49.426,8.736,49.392")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "source:maxspeed!=* or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
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
	public void test_rl52kyctbgbp_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "59")
				.queryParam("values2", "service")
				.queryParam("bcircles", "8.730,49.406,7")
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
	public void test_vbhy5hwxne49_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "u:8.704561,49.403252,8.7289,49.4213,8.732301,49.4296,8.703,49.4269,8.704561,49.403252|J:8.704561,49.403252,8.716,49.4103,8.746,49.403,8.739,49.418,8.704561,49.403252|Y:8.704561,49.403252,8.713,49.435,8.704069,49.413,8.7060,49.40476,8.704561,49.403252")
				.queryParam("timeout", "54")
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
	public void test_1hv60gpk799v9_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "node,way,")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "32")
				.queryParam("values2", "turning_circle")
				.queryParam("bcircles", "yK:8.702,49.430,8")
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
	public void test_t4klffvs1gs5_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and geometry:polygon and length:( .. 100)")
				.queryParam("values", "cycleway")
				.queryParam("bpolys", "l:8.704561,49.403252,8.7097,49.4059,8.70060,49.404,8.7427,49.42815,8.704561,49.403252")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "CKA:8.7207,49.4171,69|i:8.7110,49.43896,88|WD:8.744,49.4043,5")
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
	public void test_qhq4a4ttq7hg_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "b:8.704561,49.403252,8.713,49.430,8.711,49.4376,8.7016,49.404,8.704561,49.403252|eP:8.704561,49.403252,8.705,49.403052,8.740,49.4369,8.709,49.4146,8.704561,49.403252|RFX:8.704561,49.403252,8.736,49.411,8.70458,49.4196,8.70403,49.4022,8.704561,49.403252")
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
	public void test_1hbisvjznx35d_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* and length:( .. 100)")
				.queryParam("bboxes", "8.695,49.414,8.717,49.3927|8.6997,49.428,8.709,49.386|8.6598,49.407,8.7352,49.398")
				.queryParam("timeout", "61")
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
	public void test_1jefebogjrqld_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("bcircles", "SNa:8.7478,49.422,8|c:8.732,49.4083,6")
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
	public void test_vf0wa8dkppb5_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.415,8.712,49.40042,8.73419,49.408,8.704561,49.403252|8.704561,49.403252,8.746,49.414,8.7410,49.429,8.707,49.4122,8.704561,49.403252")
				.queryParam("timeout", "95")
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
	public void test_soppckn62a0o_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.655155,49.42935,8.702,49.38156|8.685,49.417,8.7015,49.39883|8.671,49.416097,8.705,49.3833|8.681,49.4133,8.739089,49.3996")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("time", "2008-05-13")
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
	public void test_vf1f01t2vbqs_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-11-13")
				.queryParam("bpolys", "dB:8.704561,49.403252,8.726,49.40772,8.720479,49.428,8.70215,49.429,8.704561,49.403252|bYjV:8.704561,49.403252,8.729361,49.4216,8.74682,49.40597,8.730,49.417,8.704561,49.403252")
				.queryParam("timeout", "99")
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
	public void test_rl2cofh51qgj_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nN:8.6501,49.429,8.732,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2011-05-30")
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
	public void test_skscuxnxtqas_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "NO:8.704561,49.403252,8.741,49.434,8.7024,49.439,8.71951,49.4358,8.704561,49.403252")
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
	public void test_1hblib6tntiyc_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.741119,49.407,68")
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
	public void test_rh89hmrz0mk8_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:forward!=* and length:( .. 100)")
				.queryParam("bboxes", "8.6934,49.4298,8.711,49.396|8.66857,49.425,8.740,49.38102|8.6712,49.423,8.736,49.399|8.668,49.415617,8.700190,49.39460")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"uoZi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.424],[8.700,49.419],[8.73237,49.430],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ai\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.4342],[8.705,49.42449],[8.703,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7310,49.400134],[8.73510,49.43139],[8.717513,49.4361],[8.704561,49.403252]]]}}]}")
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
	public void test_uvbee5p8k603_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or geometry:line or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "O:8.703,49.4171,6")
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
	public void test_vbemhm501wz5_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.676415,49.402304,8.729,49.3952")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-10-02")
				.queryParam("timeout", "47")
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
	public void test_r17aum19v6sw_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-11-30")
				.queryParam("bcircles", "eLKe:8.710,49.426,89")
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
	public void test_1h7lgrntxmb09_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "teaTC:8.704561,49.403252,8.730,49.4125,8.7454,49.427,8.7166,49.4198,8.704561,49.403252")
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
	public void test_qe13hf4pfcki_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-07-05")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "UURQg:8.706,49.43854,8")
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
	public void test_sl909wyzps1g_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "UEj:8.704561,49.403252,8.724654,49.4071,8.7024,49.434,8.739498,49.4298,8.704561,49.403252")
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
	public void test_trqv4c1gxmpk_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-09-26")
				.queryParam("bpolys", "BO:8.704561,49.403252,8.744,49.406,8.707863,49.4362,8.7355,49.431,8.704561,49.403252|bBJ:8.704561,49.403252,8.738,49.432,8.705661,49.413,8.704867,49.4117,8.704561,49.403252|QPI:8.704561,49.403252,8.732,49.412,8.704,49.427,8.701084,49.412,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_t8f7pizwwokm_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or geometry:polygon or id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "yfjv:8.704561,49.403252,8.7144,49.408,8.703,49.4394,8.711133,49.4257,8.704561,49.403252|DNy:8.704561,49.403252,8.711,49.418,8.707,49.404,8.7024,49.409,8.704561,49.403252")
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
	public void test_1jyg03mhtl0te_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Cy:8.651024,49.420823,8.701067,49.3982|mfM:8.685339,49.419,8.703,49.38620|E:8.692,49.403,8.755,49.39451")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("timeout", "27")
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
	public void test_to2b0wmc7u5f_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6676,49.404,8.73804,49.386")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-10-02")
				.queryParam("bpolys", "8.704561,49.403252,8.709,49.4384,8.702161,49.4202,8.7010,49.4039,8.704561,49.403252")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "8.723859,49.4182,1")
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
	public void test_1ib5ygzn9kj1e_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and geometry:point and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.4384,8.718,49.429,8.7295,49.4322,8.704561,49.403252|8.704561,49.403252,8.7377,49.4120,8.704561,49.419,8.72507,49.402,8.704561,49.403252|8.704561,49.403252,8.72498,49.41587,8.702863,49.432,8.7369,49.43624,8.704561,49.403252")
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
	public void test_u7wtd4cuocom_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=*")
				.queryParam("bpolys", "C:8.704561,49.403252,8.738249,49.416,8.700,49.437,8.7003,49.41401,8.704561,49.403252")
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
	public void test_skmsiw9hwnqo_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-04-22")
				.queryParam("bpolys", "ZWs:8.704561,49.403252,8.7208,49.420,8.744,49.424,8.704925,49.405,8.704561,49.403252|hZYN:8.704561,49.403252,8.702,49.4134,8.7001,49.406,8.704563,49.413,8.704561,49.403252")
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
	public void test_u87ysy76ticy_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("time", "2012-05-10")
				.queryParam("bcircles", "8.740907,49.4162,8|8.74555,49.40131,2")
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
	public void test_1hvb0ivshy62a_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "cjNJs:8.708934,49.404,6|XWVda:8.73245,49.400,2|PhlAE:8.739,49.427,3")
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
	public void test_1h84uq6tiybzr_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-06-24")
				.queryParam("bcircles", "8.7090,49.402,2|8.70789,49.4290,3|8.72555,49.431,3012206365")
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
	public void test_1jyovaql2zw4j_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-04-27")
				.queryParam("bcircles", "m:8.711,49.41866,7|YEeZY:8.7256,49.4176,8")
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
	public void test_tnzkhgmz48yp_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("time", "2011-02-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726279,49.4002],[8.74000,49.435235],[8.746,49.4223],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "45")
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
	public void test_ure0bokqt8bp_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* or not geometry:line or id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-03-15")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.4176,8.721,49.4202,8.705,49.4312,8.704561,49.403252")
				.queryParam("timeout", "100")
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
	public void test_tony6x9naomo_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gzfz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7040,49.427],[8.704561,49.40343],[8.7014,49.4356],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"XNXfE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7080,49.40194],[8.729,49.4370],[8.737,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"iF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.434],[8.7070,49.4343],[8.723,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "RTg:8.7128,49.417336,2")
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
	public void test_sohc35gegzso_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "f:8.7004,49.434,6|O:8.7343,49.406277,4")
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
	public void test_1iuyrbde50qjm_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "VSPEL:8.679,49.415512,8.727,49.393|x:8.652485,49.4212,8.7376,49.398|Y:8.697,49.4033,8.718194,49.3990")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "91")
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
	public void test_1iuvyr92euvqr_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-11-10")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "8.7057,49.436800,5")
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
	public void test_1iv9tmsi2v48j_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bcircles", "8.7456,49.4232,6|8.738,49.4021,5|8.740,49.403313,7|8.7213,49.438,393")
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
	public void test_u85oylavvko1_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6653,49.405,8.7581,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
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
	public void test_qeexnedw2zw1_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "yysoI:8.69666,49.411,8.749,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
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
	public void test_1jy26eaeoi9mc_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.692,49.4159,8.741,49.38342")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "41")
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
	public void test_rhog86znwi1u_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and geometry:line or not id:(1 .. 9999)")
				.queryParam("bboxes", "GU:8.674,49.420,8.707166,49.3861|j:8.69111,49.413999,8.7058,49.396|F:8.688535,49.4114,8.737,49.381")
				.queryParam("time", "2008-06-27")
				.queryParam("timeout", "51")
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
	public void test_uve5rwgp9co6_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "u:8.7470,49.4110,7|Qoxd:8.7246,49.437,1|hSuDT:8.729,49.43979,37|QmHNy:8.7323,49.412883,91")
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
	public void test_sl9hfjms0rp5_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "rf:8.66900,49.4060,8.734,49.397|U:8.69705,49.416,8.739713,49.3892|svh:8.6511,49.41776,8.733,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "8.744205,49.400,7|8.725,49.4377,2|8.7363,49.41976,8")
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
	public void test_1hrayz996u0dg_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2009-11-21")
				.queryParam("bcircles", "8.7073,49.432,5|8.700,49.406,5|8.718,49.429597,7")
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
	public void test_qxzdui1z44s6_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.680294,49.421,8.754,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "yes")
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
	public void test_uvbvx9piv8z6_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.433571,8.732,49.430,8.708,49.406457,8.704561,49.403252|8.704561,49.403252,8.7488,49.42653,8.705,49.410,8.704420,49.414,8.704561,49.403252|8.704561,49.403252,8.7452,49.437,8.7223,49.426,8.70396,49.4161,8.704561,49.403252")
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
	public void test_1h7wzrzsifg39_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or length:( .. 100)")
				.queryParam("time", "2007-11-27")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "tJ:8.738,49.4086,6")
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
	public void test_trrddiw2y2xx_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* and type:relation and length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-05-05")
				.queryParam("bpolys", "8.704561,49.403252,8.741,49.4345,8.7006,49.436,8.7093,49.4393,8.704561,49.403252|8.704561,49.403252,8.7477,49.407,8.708,49.412649,8.706,49.416,8.704561,49.403252|8.704561,49.403252,8.704,49.413407,8.7383,49.425,8.745,49.4229,8.704561,49.403252")
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
	public void test_vbpqu4zqm0di_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("bboxes", "bKLT:8.6956,49.423368,8.728962,49.3980|UKwbv:8.695,49.42574,8.74346,49.3993")
				.queryParam("showMetadata", "yes")
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
	public void test_s4mukyzzf7ef_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2007-12-30")
				.queryParam("bpolys", "y:8.704561,49.403252,8.710464,49.4091,8.7011,49.432691,8.704,49.413,8.704561,49.403252|mJ:8.704561,49.403252,8.730753,49.407788,8.7011,49.4118,8.703113,49.4080,8.704561,49.403252")
				.queryParam("timeout", "62")
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
	public void test_1jy7oule0vqyb_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "n:8.6965,49.423816,8.722,49.39971")
				.queryParam("showMetadata", "yes")
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
	public void test_1ib0e55sgnmlw_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.672,49.403,8.719,49.3937|8.678,49.418274,8.75136,49.381")
				.queryParam("time", "2011-11-04")
				.queryParam("timeout", "91")
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
	public void test_to53962gttgh_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "XQ:8.7443,49.439135,4|hrpBw:8.728,49.409,8|XDjjT:8.726,49.422922,8|CmNWv:8.709,49.406,407436209")
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
	public void test_qxqkzknr6bsh_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "hv:8.696,49.429,8.750,49.399|lO:8.690,49.400,8.7348,49.388|Fg:8.650,49.42719,8.756,49.382614|xxj:8.693,49.4155,8.730027,49.3810")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-02-07")
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
	public void test_1iyq0bddi8odh_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.696,49.401,8.718,49.3833|8.6785,49.420,8.715,49.399|8.6859,49.4060,8.719,49.389|8.6921,49.407,8.7323,49.395")
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
	public void test_uvbfy66to7kx_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "RtRHM:8.6924,49.4226,8.716,49.398")
				.queryParam("time", "2014-02-25")
				.queryParam("timeout", "56")
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
	public void test_tofmv9t626hw_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-05-30")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"C\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.400],[8.704382,49.422],[8.704,49.404],[8.704561,49.403252]]]}}]}")
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
	public void test_1ib37hhx490kx_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "d:8.703,49.41182,2")
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
	public void test_to4khhvi9p45_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"F\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7010,49.404],[8.7065,49.400],[8.7079,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"zASMg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700568,49.4390],[8.733,49.424],[8.712,49.40049],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"iDY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.417],[8.7497,49.4312],[8.7016,49.416689],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "90")
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
	public void test_1hbfz35fsp6b8_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-08-12")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "aLFN:8.732,49.4132,7")
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
	public void test_1k1uiu8xe0chg_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "8.7156,49.4190,2|8.716,49.411,7|8.7406,49.415,7|8.7276,49.4087,690")
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
	public void test_1jyd9vx30eyjl_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.662,49.402,8.72036,49.395|8.684938,49.411,8.753,49.387|8.6533,49.4002,8.7577,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2014-03-28")
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
	public void test_to4jdpsnxppg_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path,cycleway,public")
				.queryParam("bboxes", "oMEmv:8.651,49.403,8.708,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "GTb:8.7336,49.4008,3")
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
	public void test_t4l5au53rpsy_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* or type:way")
				.queryParam("bboxes", "pt:8.673,49.414682,8.7396,49.397|Z:8.692,49.401,8.705,49.3955|fC:8.672779,49.426,8.706003,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-03-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"AlMIt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.436],[8.74358,49.4253],[8.748,49.417],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.411594],[8.7082,49.435],[8.7033,49.400],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Zb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70112,49.423],[8.71133,49.4120],[8.7205,49.430],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "I:8.742,49.4060,3")
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
	public void test_1jed77izx8w9y_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "XdL:8.704561,49.403252,8.71322,49.4054,8.70390,49.406,8.71632,49.4122,8.704561,49.403252|O:8.704561,49.403252,8.716,49.4352,8.71959,49.43651,8.70344,49.410,8.704561,49.403252")
				.queryParam("timeout", "73")
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
	public void test_1hr5d32qokq44_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "8.7497,49.435,6")
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
	public void test_1hr5enmyas3fl_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,secondary,secondary_link")
				.queryParam("filter", "source:maxspeed=* or type:way and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.726,49.434631,8.704511,49.423,8.734,49.4317,8.704561,49.403252|8.704561,49.403252,8.7448,49.4076,8.734,49.401,8.73743,49.4386,8.704561,49.403252")
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
	public void test_us0pp2hvc4ti_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "q:8.7029,49.4302,5")
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
	public void test_1hrj9iu40ivz7_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,secondary_link")
				.queryParam("groupByKey", "building")
				.queryParam("bcircles", "8.708,49.437,7")
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
	public void test_skyebwq4vk1f_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,residential")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("timeout", "53")
				.queryParam("bcircles", "S:8.7307,49.427,57|hLgkY:8.7003,49.431,5")
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
	public void test_vbnhp7km5gma_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,primary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("bpolys", "FoD:8.704561,49.403252,8.717,49.4388,8.7049,49.427,8.701813,49.4313,8.704561,49.403252|VL:8.704561,49.403252,8.709096,49.4074,8.707,49.40752,8.709,49.401,8.704561,49.403252|Z:8.704561,49.403252,8.704,49.437169,8.7106,49.410,8.706,49.431,8.704561,49.403252")
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
	public void test_trwdtcdgm88k_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or type:relation and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-09-01")
				.queryParam("bcircles", "LOIc:8.743,49.411,6|ksnt:8.73845,49.429,6|eUKKL:8.7177,49.41291,7")
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
	public void test_us3i6btu59v4_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,traffic_signals")
				.queryParam("filter", "ref!=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2018-02-04")
				.queryParam("bcircles", "K:8.7457,49.414,1|wqpfk:8.7386,49.4191,416|JEP:8.7141,49.424,72|sQXs:8.715,49.4067,892")
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
	public void test_vbbuc2onr1o5_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes,office")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-12-03")
				.queryParam("bcircles", "kwvBQ:8.708,49.401,4|fR:8.717587,49.418,800456389")
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
	public void test_1k22caukpwztw_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("time", "2008-03-12")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7079,49.411730],[8.7045,49.4186],[8.70411,49.400],[8.704561,49.403252]]]}}]}")
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
	public void test_vbt18xmzmss2_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,stop,construction")
				.queryParam("bboxes", "T:8.680,49.402,8.75173,49.383|zUOVV:8.665,49.409,8.7353,49.398")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
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
	public void test_soq7oamgykae_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "BJNjB:8.674,49.4182,8.705,49.3851")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-11-25")
				.queryParam("timeout", "60")
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
	public void test_vey4kxblgz1d_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,tertiary")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.72768,49.434854,6|8.710008,49.434,1|8.70054,49.41210,711|8.711,49.4121,8678292873")
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
	public void test_1h7zspyxglxrp_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "aa:8.7102,49.424,72|ThPI:8.743,49.408,6")
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
	public void test_1ibbjyt9kn96d_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"LX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7496,49.401],[8.70128,49.43307],[8.7305,49.427],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"NQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.413],[8.708,49.4390],[8.7055,49.417920],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Cp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7130,49.402],[8.741,49.4283],[8.70457,49.401],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "76")
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
	public void test_1ji1qgnn6h7ap_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle,construction")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-06-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7374,49.414],[8.70722,49.408],[8.7068,49.431],[8.704561,49.403252]]]}}]}")
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
	public void test_veynohyj1yk8_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("time", "2017-04-09")
				.queryParam("bpolys", "8.704561,49.403252,8.74130,49.41636,8.70438,49.438,8.703,49.420107,8.704561,49.403252|8.704561,49.403252,8.721592,49.4078,8.743,49.423,8.737,49.419,8.704561,49.403252|8.704561,49.403252,8.7444,49.413,8.723,49.426,8.731,49.420094,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_1iv4a0i2ube5i_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or geometry:polygon")
				.queryParam("groupByKey", "building")
				.queryParam("values", "footway")
				.queryParam("bcircles", "BAmJS:8.7128,49.438,6")
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
	public void test_t4a24i9genvm_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,dormitory")
				.queryParam("bboxes", "8.666,49.427678,8.739514,49.39178|8.68602,49.403,8.7067,49.380|8.6681,49.40796,8.7198,49.3854")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "a:8.704561,49.403252,8.722,49.419,8.7049,49.400884,8.704,49.412,8.704561,49.403252|XmQVn:8.704561,49.403252,8.722203,49.4284,8.71180,49.4247,8.7098,49.4262,8.704561,49.403252")
				.queryParam("timeout", "83")
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
	public void test_skscgux7e06a_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,secondary")
				.queryParam("bboxes", "8.655,49.424721,8.7109,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "38")
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
	public void test_vbpplktcf48k_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "synagogue,roof,ship")
				.queryParam("filter", "bicycle!=* and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-09-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7188,49.405],[8.702,49.409002],[8.701,49.438],[8.704561,49.403252]]]}}]}")
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
	public void test_skmswrezj1i9_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.670858,49.421,8.743,49.384|8.650,49.422,8.709331,49.393|8.67577,49.420,8.701,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2012-01-08")
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
	public void test_t8cdx4t34k6v_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2017-03-31")
				.queryParam("bcircles", "LZ:8.7107,49.4180,15")
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
	public void test_sl3g0nu2zjac_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,path,turning_circle")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-08-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"P\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7393,49.43919],[8.737,49.418],[8.726,49.423882],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UVbfc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70596,49.406],[8.704992,49.4174],[8.720,49.424],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"msMbi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72901,49.424],[8.7323,49.4291],[8.7066,49.423],[8.704561,49.403252]]]}}]}")
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
	public void test_qdssxzsvhc1h_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "l:8.6674,49.421,8.728,49.3820")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("timeout", "46")
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
	public void test_1jyllo03y18om_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,hotel")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-12-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"a\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7349,49.405],[8.70119,49.433042],[8.704560,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7328,49.42592],[8.705004,49.4174],[8.713,49.4168],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "60")
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
	public void test_t49ko1ari69k_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,chapel")
				.queryParam("filter", "ref!=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.6853,49.4033,8.7597,49.394|8.6950,49.417798,8.729,49.384")
				.queryParam("groupByKey", "building")
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
	public void test_1jeqk5szoht2e_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "uk:8.662,49.424,8.723,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-02-19")
				.queryParam("bpolys", "uyzxp:8.704561,49.403252,8.743,49.400064,8.731,49.42229,8.7040,49.435702,8.704561,49.403252")
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
	public void test_1hbaybdrgr2gn_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-10-21")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "SlzWK:8.715,49.4188,4")
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
	public void test_urp5dp98gjsp_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ubs\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.422],[8.746,49.409],[8.705,49.4307],[8.704561,49.403252]]]}}]}")
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
	public void test_rhg2hrs01un9_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2010-04-27")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.745,49.4272,943742458")
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
	public void test_1k1zkx3fw2u04_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2010-08-11")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"tc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.439],[8.70204,49.42274],[8.707,49.42349],[8.704561,49.403252]]]}}]}")
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
	public void test_sohe3tqrxzjk_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes!=* and type:relation")
				.queryParam("bboxes", "yqUD:8.678,49.422,8.716,49.3939|MkEiA:8.68940,49.41271,8.74313,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2016-10-15")
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
	public void test_skmrtibtc0o5_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "t:8.740,49.4065,5")
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
	public void test_sl6pnbwvvzu8_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary,cycleway,track")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2009-11-23")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "iwi:8.709,49.42953,7")
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
	public void test_1k1wrwc0wboe1_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_mirror,residential,emergency_access_point")
				.queryParam("bboxes", "hU:8.6845,49.421,8.754,49.3979")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
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
	public void test_1k1zikwt0qfjq_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("bcircles", "TE:8.706,49.422,87|JU:8.7403,49.42885,8|O:8.71400,49.421,76")
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
	public void test_1iykkcg2n4vg1_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or type:relation and not length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2012-11-14")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "o:8.726,49.40742,2|Ja:8.712,49.4320,65|UZm:8.733,49.41312,8")
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
	public void test_t8cxegdg4x9e_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"unCfS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.4225],[8.714,49.409],[8.712,49.418153],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.429],[8.700160,49.40912],[8.747,49.4393],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"R\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720912,49.4208],[8.7419,49.406],[8.7028,49.420],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
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
	public void test_1hrbfctbntlbq_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-03-03")
				.queryParam("bpolys", "8.704561,49.403252,8.744,49.401,8.73812,49.412,8.729,49.4210,8.704561,49.403252|8.704561,49.403252,8.744,49.426,8.715,49.429296,8.731,49.401,8.704561,49.403252|8.704561,49.403252,8.724,49.435,8.720,49.4252,8.733,49.41246,8.704561,49.403252")
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
	public void test_1jeco48xo7ygj_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2009-12-05")
				.queryParam("bcircles", "T:8.719,49.425391,2")
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
	public void test_urjn04xrp2li_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2007-11-05")
				.queryParam("bpolys", "MFo:8.704561,49.403252,8.729,49.428,8.701,49.4103,8.7040,49.413,8.704561,49.403252|qhcKO:8.704561,49.403252,8.743996,49.40080,8.716,49.4309,8.7047,49.431,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_qxkzkc5q2xiw_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and type:relation or area:(1.0 .. 1E6)")
				.queryParam("time", "2014-07-01")
				.queryParam("bcircles", "xe:8.707,49.43086,6|l:8.733,49.43043,2|z:8.727,49.430,4|M:8.7451,49.434,761184391")
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
	public void test_1hblhj8i6qfxy_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* and not type:node and id:(1 .. 9999)")
				.queryParam("time", "2016-03-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"oSfDt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.426],[8.7216,49.4223],[8.730,49.40862],[8.704561,49.403252]]]}}]}")
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
	public void test_1ibh2fe4w7583_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("bboxes", "B:8.681,49.4009,8.758,49.398|xaRb:8.683,49.401936,8.753320,49.388")
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
	public void test_toiglh594a5h_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("time", "2015-10-09")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.427,8.74214,49.42595,8.732,49.4031,8.704561,49.403252")
				.queryParam("timeout", "60")
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
	public void test_1hrjqadq94zzo_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("bcircles", "x:8.728153,49.4234,6|BYD:8.711,49.4101,8362180038")
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
	public void test_rhda0med9e0m_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or type:way")
				.queryParam("bboxes", "wZpFv:8.681,49.418,8.710,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "U:8.725,49.417,70|QL:8.74774,49.4018,6")
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
	public void test_1ib5xasekuc6r_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.736465,49.4370,8.7224,49.4133,8.7174,49.4126,8.704561,49.403252|8.704561,49.403252,8.7200,49.4152,8.706,49.402,8.71742,49.426269,8.704561,49.403252")
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
	public void test_rhlnm209wg9y_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2013-05-09")
				.queryParam("bcircles", "8.739,49.402,2|8.724,49.4389,8|8.735,49.4108,9|8.7024,49.43526,53")
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
	public void test_qxwmgwv0mypi_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2014-09-11")
				.queryParam("bcircles", "tA:8.705,49.424,4|Da:8.705,49.40532,4")
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
	public void test_t84m5c0u7rcg_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-05-02")
				.queryParam("bpolys", "8.704561,49.403252,8.7029,49.429,8.704,49.413,8.738410,49.430,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_1hv88qw044qqq_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.66390,49.40434,8.734,49.392")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-07-22")
				.queryParam("timeout", "98")
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
	public void test_1jy7rkx36vs6e_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* and not id:(1 .. 9999)")
				.queryParam("time", "2018-05-08")
				.queryParam("bcircles", "vty:8.717,49.414,132409052")
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
	public void test_1jelhr28fm69d_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2013-09-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Xgey\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73306,49.400],[8.712073,49.438],[8.7384,49.42866],[8.704561,49.403252]]]}}]}")
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
	public void test_1hblhujch06d3_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-10-05")
				.queryParam("bpolys", "8.704561,49.403252,8.7227,49.423,8.710736,49.416,8.70610,49.401243,8.704561,49.403252|8.704561,49.403252,8.746557,49.416,8.701,49.409,8.7017,49.42191,8.704561,49.403252|8.704561,49.403252,8.724689,49.42134,8.7016,49.41447,8.7045,49.433,8.704561,49.403252")
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
	public void test_u8b7stj4kwmq_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "2011-02-17")
				.queryParam("bpolys", "UXXju:8.704561,49.403252,8.743,49.43751,8.7036,49.425,8.74923,49.422,8.704561,49.403252|wYqgl:8.704561,49.403252,8.73522,49.403,8.704163,49.4242,8.704,49.40012,8.704561,49.403252|OkUW:8.704561,49.403252,8.745482,49.40461,8.709976,49.4167,8.724,49.401,8.704561,49.403252")
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
	public void test_1je9v8kn6q628_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "platform")
				.queryParam("bpolys", "pA:8.704561,49.403252,8.712,49.403,8.7490,49.407,8.704,49.425,8.704561,49.403252")
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
	public void test_s1gmprcdvpsy_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "2017-03-25")
				.queryParam("bcircles", "mAq:8.7464,49.410,6")
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
	public void test_1hrben89jmtrl_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=*")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "8.72774,49.401,9")
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
	public void test_vf45o73s7cc4_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("bpolys", "PEGEl:8.704561,49.403252,8.7214,49.4017,8.704,49.4225,8.705,49.425,8.704561,49.403252")
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
	public void test_u8diqwwc0x86_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2018-01-15")
				.queryParam("bcircles", "cc:8.718135,49.415,567")
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
	public void test_1hv60uwk1rbxs_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.675,49.424115,8.737978,49.381")
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
	public void test_t4yi67k0aqet_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("bpolys", "B:8.704561,49.403252,8.722953,49.4173,8.704356,49.425,8.708,49.4065,8.704561,49.403252|rl:8.704561,49.403252,8.743,49.403,8.7007,49.42355,8.712,49.4350,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_u88fmuzi8jmq_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "F:8.65228,49.4281,8.745,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
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
	public void test_skkiacbwxelt_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2008-06-07")
				.queryParam("bcircles", "wg:8.74845,49.422,5|Vk:8.746,49.4092,40|c:8.749,49.402,95|D:8.725913,49.438,9")
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
	public void test_1hvbjp54tqgrm_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* and type:relation or area:(1.0 .. 1E6)")
				.queryParam("time", "2007-11-25")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "B:8.7437,49.4024,5|ZqHF:8.700,49.406,909|kFr:8.7464,49.4313,9|qihDs:8.7387,49.41031,822")
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
	public void test_rhgmg79lz3ok_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-11-21")
				.queryParam("timeout", "70")
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
	public void test_1ji77cjyo5tgi_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-12-18")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.421901,8.7459,49.420,8.700,49.4374,8.704561,49.403252|8.704561,49.403252,8.74124,49.422,8.713,49.40105,8.7450,49.410,8.704561,49.403252")
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
	public void test_1jy26uw93gxnm_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-06-23")
				.queryParam("bcircles", "8.7153,49.4096,3|8.703,49.40463,5")
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
	public void test_t4ibypxcojlg_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "W:8.6707,49.41507,8.704,49.385|L:8.693,49.4078,8.701,49.3945")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-04-03")
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
	public void test_s18cxuu89ug4_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Gq:8.704561,49.403252,8.727382,49.4161,8.715,49.420,8.705626,49.436,8.704561,49.403252")
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
	public void test_1jetbm4sr97hu_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2013-09-24")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.413346,8.719279,49.430,8.704568,49.420,8.704561,49.403252|8.704561,49.403252,8.745005,49.434,8.740755,49.41858,8.7493,49.4377,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_urk47sxentbq_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-11-06")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "OPZTn:8.724,49.4122,6")
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
	public void test_1if12ara2n7zp_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.745116,49.4218,647|8.743,49.425,101")
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
	public void test_urrwu6ous75i_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and not id:(1 .. 9999)")
				.queryParam("bboxes", "z:8.657078,49.406,8.709,49.383|azAUi:8.66864,49.4152,8.70019,49.396")
				.queryParam("format", "csv")
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
	public void test_r1a46o9g2793_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city=* and not geometry:line and id:(1 .. 9999)")
				.queryParam("bboxes", "8.691,49.400,8.721411,49.382|8.6749,49.417,8.706,49.395|8.65496,49.41657,8.7113,49.390")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "62")
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
	public void test_qxtavvav6qg1_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "c:8.737,49.4335,7")
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
	public void test_uv6crvdg76lt_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=*")
				.queryParam("groupByValues", "secondary")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "s:8.7265,49.433,4|B:8.745,49.431042,39")
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
	public void test_1iyexohi05bvm_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "synagogue,residential")
				.queryParam("bboxes", "snYgz:8.66854,49.419,8.739,49.399|Nb:8.684,49.418,8.72545,49.386|XkQgw:8.6507,49.428,8.726,49.3901|zO:8.674,49.4157,8.711,49.388069")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "51")
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
	public void test_r17a54w22zw9_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,elevator,hut")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2017-07-15")
				.queryParam("bcircles", "8.7376,49.42830,9")
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
	public void test_1jyjbd1f7tbuf_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Cxl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700081,49.426],[8.7048,49.403],[8.704,49.4191],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"GIqmY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72156,49.414],[8.7018,49.419],[8.7202,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yHdl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7039,49.4048],[8.701395,49.42181],[8.7009,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "48")
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
	public void test_sl6q1owp5yr4_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,construction,living_street")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-03-21")
				.queryParam("bpolys", "J:8.704561,49.403252,8.725,49.417,8.704904,49.430,8.705,49.4116,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_1hre7l70kqvjq_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.673,49.404,8.70120,49.397708")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "81")
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
	public void test_1k2519zhb4egh_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or geometry:polygon or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-09-24")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "8.7377,49.409,1")
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
	public void test_1iepyvzhxucz6_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,yes,living_street")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-02-17")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "oD:8.742,49.411,6|DLoLN:8.74482,49.414,8|DLFdT:8.745,49.4131,78")
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
	public void test_1iukeu7kwzk1d_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link,commercial")
				.queryParam("filter", "ref=* and not length:( .. 100)")
				.queryParam("bboxes", "q:8.688,49.4256,8.739,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-09-14")
				.queryParam("timeout", "44")
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
	public void test_vbsiluvaw7jr_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Y:8.67835,49.416,8.733,49.3921")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-08-25")
				.queryParam("bpolys", "y:8.704561,49.403252,8.7026,49.40738,8.729787,49.433,8.7047,49.416809,8.704561,49.403252")
				.queryParam("bcircles", "MWhLW:8.732,49.429917,7")
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
	public void test_1h7io7m91f03c_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or id:(1 .. 9999)")
				.queryParam("time", "2015-12-17")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.745,49.418,24")
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
	public void test_1jy7oule2piye_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.4059,8.702,49.406,8.7041,49.426,8.704561,49.403252|8.704561,49.403252,8.731839,49.435333,8.736,49.415,8.72259,49.414,8.704561,49.403252|8.704561,49.403252,8.747,49.415,8.73662,49.41374,8.726,49.413,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_soponf0l7ghf_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* or type:way")
				.queryParam("bboxes", "8.672,49.410,8.703,49.383")
				.queryParam("groupByKey", "building")
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
	public void test_s13bbu1nokdv_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.689,49.4151,8.75315,49.393682")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
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
	public void test_vbhenuwl8iuc_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-06-27")
				.queryParam("bpolys", "8.704561,49.403252,8.715,49.408,8.736,49.426,8.7044,49.4110,8.704561,49.403252|8.704561,49.403252,8.707,49.401,8.728819,49.4307,8.734,49.412,8.704561,49.403252|8.704561,49.403252,8.7251,49.432396,8.706,49.421480,8.7017,49.4090,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_to52ex9aeur5_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,living_street,bus_stop")
				.queryParam("filter", "ref!=* or length:( .. 100)")
				.queryParam("bboxes", "8.684,49.400,8.758,49.394|8.6508,49.408,8.722,49.396|8.6508,49.401,8.7028,49.3932|8.65679,49.417,8.7496,49.3824")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-09-05")
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
	public void test_1ji1ol0v365o5_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.7270,49.4033,60")
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
	public void test_qec6nopqhpb6_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("bpolys", "Odn:8.704561,49.403252,8.71140,49.414,8.700,49.4252,8.704,49.4396,8.704561,49.403252|P:8.704561,49.403252,8.748346,49.412,8.704,49.4305,8.70454,49.43606,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_s4mu4grfbxgx_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2012-07-21")
				.queryParam("bcircles", "qhj:8.71576,49.422,2")
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
	public void test_1k1wrwlvq5642_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.699,49.4202,8.707,49.393|8.683,49.422,8.7437,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "RRekm:8.704561,49.403252,8.723733,49.432,8.7052,49.4299,8.744,49.412,8.704561,49.403252|e:8.704561,49.403252,8.7286,49.4295,8.70511,49.4376,8.736,49.414,8.704561,49.403252|Gw:8.704561,49.403252,8.731,49.4116,8.704538,49.403,8.740,49.439,8.704561,49.403252")
				.queryParam("timeout", "91")
				.queryParam("groupByKeys", "network,building")
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
	public void test_1jyds7eurllx1_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* and id:(1 .. 9999)")
				.queryParam("bboxes", "V:8.679579,49.421727,8.719,49.398")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "VF:8.704561,49.403252,8.7446,49.4137,8.70451,49.415,8.7040,49.419,8.704561,49.403252")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "jdCFF:8.713,49.436,4|KjphF:8.722768,49.424,59")
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
	public void test_r1g3pfgtyfs6_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "maxspeed,foot,turn")
				.queryParam("bcircles", "8.7264,49.413,54")
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
	public void test_t8f5b3trnpyx_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.650,49.40886,8.749,49.3804")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-06-25")
				.queryParam("timeout", "37")
				.queryParam("groupByKeys", "tracktype,name")
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
	public void test_rkzkwjoj6uk1_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2011-05-27")
				.queryParam("bpolys", "EV:8.704561,49.403252,8.7358,49.41893,8.704936,49.430,8.739632,49.40811,8.704561,49.403252|gKfk:8.704561,49.403252,8.7236,49.422,8.727,49.406,8.7017,49.4314,8.704561,49.403252|eA:8.704561,49.403252,8.7368,49.407,8.703,49.435,8.721,49.423,8.704561,49.403252")
				.queryParam("timeout", "91")
				.queryParam("groupByKeys", "maxspeed,turn,lanes:forward")
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
	public void test_1hv88r7w8rdpw_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or not type:way and not length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-06-24")
				.queryParam("groupByKeys", "building,lit,highway")
				.queryParam("bcircles", "8.74592,49.414,76|8.711,49.439,9")
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
	public void test_to4ln7rke8v5_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("timeout", "56")
				.queryParam("groupByKeys", "bicycle,turn,smoothness")
				.queryParam("bcircles", "pU:8.705,49.438,14|qaR:8.736464,49.419,9")
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
	public void test_1h7lx2e29qsky_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "37")
				.queryParam("groupByKeys", "smoothness,surface")
				.queryParam("bcircles", "uhu:8.702,49.41458,914")
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
	public void test_tnz0jp4k82lz_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or geometry:line and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7476,49.41294],[8.7025,49.4084],[8.721,49.40206],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "75")
				.queryParam("groupByKeys", "ref,lanes,addr:country")
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
	public void test_ts4qp49ayn92_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-04-25")
				.queryParam("bpolys", "K:8.704561,49.403252,8.710,49.432477,8.732,49.414802,8.704,49.437,8.704561,49.403252|ROX:8.704561,49.403252,8.7267,49.4139,8.713,49.425,8.702,49.4075,8.704561,49.403252|jsNYB:8.704561,49.403252,8.729,49.4127,8.7073,49.429,8.700,49.410301,8.704561,49.403252")
				.queryParam("groupByKeys", "oneway,destination")
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
	public void test_rl8ejt5n1dgj_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.68561,49.41736,8.755,49.397|8.6852,49.402,8.754,49.397")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-12-07")
				.queryParam("bpolys", "wF:8.704561,49.403252,8.7224,49.421,8.704729,49.428662,8.7086,49.425851,8.704561,49.403252|o:8.704561,49.403252,8.7181,49.408,8.709,49.4273,8.730,49.43017,8.704561,49.403252|sYc:8.704561,49.403252,8.7350,49.428,8.701753,49.4379,8.7100,49.416022,8.704561,49.403252")
				.queryParam("groupByKeys", "name,network,smoothness")
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
	public void test_1iukfm5umei41_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "DSJ:8.6807,49.409,8.75272,49.398|SZ:8.677428,49.40574,8.7446,49.38710")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-09-30")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "yxo:8.720,49.4196,9|RVfC:8.742191,49.427,77|WAFV:8.740,49.421,7")
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
	public void test_t4svwa4e8qxt_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-11-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xOK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.41284],[8.730,49.429],[8.710,49.411360],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BCR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72078,49.414],[8.7183,49.411],[8.746389,49.4313],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "sidewalk,name,barrier")
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
	public void test_1iavf94tpwwh1_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "68")
				.queryParam("groupByKeys", "highway,addr:street,network")
				.queryParam("bcircles", "UuzaK:8.709,49.41562,2")
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
	public void test_1ib0ysujdwab8_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city=* or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-04-02")
				.queryParam("groupByKeys", "addr:city,oneway")
				.queryParam("bcircles", "8.724945,49.4276,2|8.71816,49.4071,3")
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
	public void test_1jew3b9lxp3xz_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "addr:country,addr:street,building")
				.queryParam("bcircles", "8.7152,49.4393,3|8.71189,49.404,3|8.728,49.430,77|8.726,49.42901,8")
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
	public void test_sof499c83qzl_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2013-09-01")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NYNhx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7404,49.4176],[8.70602,49.415],[8.7032,49.432146],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4385],[8.71865,49.402042],[8.748,49.422],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "88")
				.queryParam("groupByKeys", "addr:country,oneway,tracktype")
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
	public void test_r17b8jjk6983_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2013-11-23")
				.queryParam("bpolys", "of:8.704561,49.403252,8.71850,49.4201,8.737,49.41225,8.7272,49.426,8.704561,49.403252")
				.queryParam("groupByKeys", "building,barrier,addr:country")
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
	public void test_vf98gqp8f2gp_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "30")
				.queryParam("groupByKeys", "lanes,sidewalk")
				.queryParam("bcircles", "o:8.707,49.432,7")
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
	public void test_sl9fxxyk4y7n_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "92")
				.queryParam("groupByKeys", "foot,lanes:forward,destination")
				.queryParam("bcircles", "8.72401,49.4311,56")
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
	public void test_1iukvnq6bo8jd_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,garage")
				.queryParam("filter", "turn!=*")
				.queryParam("bboxes", "fd:8.691905,49.4076,8.728,49.387|jmW:8.6910,49.418,8.700,49.38506")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-02-12")
				.queryParam("bpolys", "d:8.704561,49.403252,8.7041,49.401,8.700,49.405,8.703,49.403,8.704561,49.403252|k:8.704561,49.403252,8.735,49.434,8.706897,49.420,8.7366,49.417,8.704561,49.403252|f:8.704561,49.403252,8.71151,49.416,8.702,49.41762,8.70306,49.4234,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_1k2017pci89r9_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=*")
				.queryParam("groupByValues", "living_street")
				.queryParam("bpolys", "J:8.704561,49.403252,8.740,49.4230,8.705,49.423,8.70483,49.43034,8.704561,49.403252")
				.queryParam("timeout", "49")
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
	public void test_qy4fv3ozp3xy_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,secondary_link,tower")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "i:8.73929,49.420796,16|nPsYN:8.7098,49.416361,8")
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
	public void test_s100wzdpsbap_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "sJvD:8.7059,49.429,9|pMV:8.708,49.42256,159664957")
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
	public void test_qxtv5kxgrf3k_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.682,49.413,8.742,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "20")
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
	public void test_1jydb1s5j2wqe_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,cycleway,garage")
				.queryParam("filter", "turn=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "peMG:8.743,49.420,61")
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
	public void test_s12rwngnqsdz_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "O:8.650,49.4140,8.7449,49.380|fy:8.66896,49.4039,8.72882,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-11-27")
				.queryParam("timeout", "59")
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
	public void test_1k1u1b0xnma91_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-09-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"A\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.418],[8.742,49.400],[8.703,49.423],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "66")
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
	public void test_s13axl1wi2ch_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link,traffic_mirror")
				.queryParam("bboxes", "8.6865,49.429546,8.708,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-08-24")
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
	public void test_vbbuc0p0zeib_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "E:8.6878,49.404,8.751,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
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
	public void test_vf1ezrxno3fo_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,crossing")
				.queryParam("filter", "addr:housenumber!=* and not type:relation or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "eC:8.674,49.4113,8.709168,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.732900,49.402,9|8.725994,49.428,6")
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
	public void test_1jeyvvfijecf8_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.735333,49.4374,8.704,49.41974,8.7435,49.413183,8.704561,49.403252|8.704561,49.403252,8.739,49.4345,8.703,49.40390,8.704,49.415,8.704561,49.403252|8.704561,49.403252,8.715,49.417,8.710,49.436,8.712,49.41798,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_1jygit1dj7w38_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,stop_line,elevator")
				.queryParam("bboxes", "8.683,49.428,8.7452,49.392|8.668,49.424,8.70213,49.38208|8.671,49.42859,8.745,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2012-10-18")
				.queryParam("timeout", "39")
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
	public void test_tocv0pctrpsy_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "y:8.7166,49.419,307")
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
	public void test_uvjqw2dzkpbq_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Dt:8.651,49.4132,8.7362,49.3916|jPTEe:8.659,49.409,8.759153,49.396|bFv:8.678,49.403012,8.759,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-05-16")
				.queryParam("timeout", "80")
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
	public void test_tol95fjc4ns3_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,footway")
				.queryParam("filter", "addr:country=* and type:relation and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "tQg:8.736,49.408,8")
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
	public void test_uvbfyie9z19w_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "rxpAO:8.723,49.404,7")
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
	public void test_qhq3vmascztw_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "university")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.734,49.404,67")
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
	public void test_uve7sung0qb5_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school")
				.queryParam("filter", "name!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "lxFVg:8.6695,49.415,8.706,49.38211")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2008-05-09")
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
	public void test_1jyg1ceiktso1_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,roof,church")
				.queryParam("bboxes", "tAJQj:8.669,49.405,8.749,49.390|S:8.67559,49.4254,8.744,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "47")
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
	public void test_trz6rro7b7ef_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.695,49.4241,8.718,49.3829")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2014-09-10")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "8.743,49.439,8|8.738,49.417,4|8.71052,49.435,7")
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
	public void test_ublwkbwajasj_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or geometry:line and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-09-08")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "NWvos:8.7001,49.43083,57")
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
	public void test_1hbdq0gxbcv35_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("bcircles", "8.7278,49.433,1")
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
	public void test_qxiqt5n73i2d_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* and geometry:polygon and not id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-06-07")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "zicCE:8.706,49.435,9")
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
	public void test_qe9e100vj67k_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "w:8.650042,49.427,8.7293,49.383|Pdera:8.666,49.427,8.756,49.399|O:8.690,49.4256,8.717,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-11-16")
				.queryParam("timeout", "77")
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
	public void test_u88fk6afp99w_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "d:8.748,49.437360,6|UL:8.7122,49.413,32|xSujY:8.7201,49.4059,90|p:8.727509,49.41500,4")
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
	public void test_qhna5ky0qlwi_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and geometry:line and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "aq:8.704561,49.403252,8.733,49.42535,8.713,49.425,8.70450,49.414,8.704561,49.403252")
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
	public void test_1ies9icm97juh_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "O:8.68696,49.426,8.742,49.3980|YX:8.683,49.412,8.744,49.386|i:8.650,49.413,8.709,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "22")
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
	public void test_1jy24u6aetnj5_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* and not type:relation and length:( .. 100)")
				.queryParam("bboxes", "R:8.693,49.400,8.745864,49.392")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-12-06")
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
	public void test_1h7u8rwpucajq_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and geometry:line and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-07-31")
				.queryParam("bcircles", "nDMbt:8.703,49.405,4|QQZc:8.7051,49.438,7")
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
	public void test_sondy3cbkyg5_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Qp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733552,49.43488],[8.726,49.437],[8.70774,49.415],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "To:8.717859,49.427,56")
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
	public void test_1iuy7tvyzwvug_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* or geometry:line or id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BsIT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.405],[8.73210,49.433],[8.71025,49.4121],[8.704561,49.403252]]]}}]}")
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
	public void test_s0v1mnum4ier_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "RrTlg:8.694,49.418269,8.758947,49.3919")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-05-03")
				.queryParam("timeout", "57")
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
	public void test_vbhd3ueqeo8m_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and geometry:line and area:(1.0 .. 1E6)")
				.queryParam("time", "2017-05-01")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "pj:8.702,49.429,3")
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
	public void test_rhdt1e08tk6a_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or type:relation or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2015-02-20")
				.queryParam("bpolys", "LOA:8.704561,49.403252,8.707,49.408,8.704,49.418,8.704,49.4388,8.704561,49.403252|yx:8.704561,49.403252,8.741788,49.405,8.734,49.421,8.73711,49.433,8.704561,49.403252")
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
	public void test_u7xdpcpplpgz_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "kgwCq:8.681,49.4072,8.729586,49.382|sZEd:8.6667,49.421,8.7319,49.384731|uaku:8.674,49.424,8.757,49.399")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_u8dgsfitf04j_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-03-07")
				.queryParam("bpolys", "XO:8.704561,49.403252,8.74043,49.421,8.720,49.436,8.701,49.410,8.704561,49.403252|n:8.704561,49.403252,8.7040,49.400,8.73208,49.4025,8.7047,49.41267,8.704561,49.403252")
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
	public void test_1iukwfvzrtoit_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2010-04-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"W\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7065,49.4095],[8.704659,49.438],[8.7088,49.4013],[8.704561,49.403252]]]}}]}")
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
	public void test_1hbdr6mlwoy7s_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6500,49.411,8.749,49.3820")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
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
	public void test_tocvt3qtmjja_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or id:(1 .. 9999)")
				.queryParam("time", "2017-06-13")
				.queryParam("bcircles", "Krs:8.715,49.427,8|p:8.722,49.410922,423|Bq:8.72731,49.437,42|cu:8.701,49.403,427444481208")
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
	public void test_rhivg4qo1obp_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or geometry:line and area:(1.0 .. 1E6)")
				.queryParam("types2", "point,other")
				.queryParam("filter2", "lanes=* and length:( .. 100)")
				.queryParam("timeout", "48")
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
	public void test_r17a2i60rqsj_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "lit=* and type:way")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.7190,49.409,41")
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
	public void test_1k22bwxf74f1s_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2007-12-06")
				.queryParam("bpolys", "wx:8.704561,49.403252,8.732902,49.4340,8.701,49.43465,8.700376,49.408,8.704561,49.403252|Ft:8.704561,49.403252,8.714,49.432,8.7045,49.433241,8.72136,49.4389,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "28")
				.queryParam("values2", "give_way")
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
	public void test_1iempvuc86ush_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and not id:(1 .. 9999)")
				.queryParam("filter2", "tracktype=* or type:node and not id:(1 .. 9999)")
				.queryParam("time", "2012-10-23")
				.queryParam("keys2", "highway")
				.queryParam("values2", "emergency_access_point")
				.queryParam("bcircles", "y:8.7125,49.416404,5")
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
	public void test_1jia0m9pk6eli_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and geometry:line and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "r:8.690,49.4176,8.725,49.391|TV:8.65367,49.412,8.733,49.395|EluN:8.661,49.409,8.706768,49.398")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "destination=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("timeout", "51")
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
	public void test_trwvr188wwv7_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or not type:node")
				.queryParam("types2", "other")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7448,49.4222],[8.720,49.428],[8.7169,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "35")
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
	public void test_sl3dajzbk604_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("filter2", "building!=* or not area:(1.0 .. 1E6)")
				.queryParam("time", "2015-06-02")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "54")
				.queryParam("values2", "bus_stop")
				.queryParam("bcircles", "8.746,49.4353,4|8.744208,49.402741,285|8.7030,49.436,40")
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
	public void test_s103n1mfpcu0_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "Fcq:8.713,49.425,7|pV:8.745,49.43589,2|JMf:8.7257,49.401,5|BlH:8.7373,49.41762,4409406310")
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
	public void test_rl7u9vmyui5d_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("bcircles", "8.702,49.40476,5")
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
	public void test_trzodi19deua_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "VHwYY:8.6621,49.42127,8.737906,49.383|oj:8.6570,49.411,8.731501,49.388|c:8.684,49.41152,8.7267,49.3967|RQ:8.696,49.4102,8.73471,49.38451")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "destination!=* and geometry:point")
				.queryParam("time", "2010-11-05")
				.queryParam("timeout", "100")
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
	public void test_1hrmhqp7zqfxw_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6658,49.4249,8.7104,49.393|8.6936,49.428,8.74728,49.3887")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "building=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "l:8.704561,49.403252,8.712,49.401596,8.700,49.411,8.701,49.40117,8.704561,49.403252|Wgy:8.704561,49.403252,8.730,49.424157,8.712,49.4107,8.711,49.406,8.704561,49.403252|Ezj:8.704561,49.403252,8.733,49.430,8.704560,49.435,8.7044,49.4344,8.704561,49.403252")
				.queryParam("timeout", "70")
				.queryParam("values2", "living_street")
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
	public void test_1jeiqr2qi3jvp_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "geojson")
				.queryParam("time", "2018-02-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"GR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.432],[8.726,49.4194],[8.713,49.429379],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"vHTmd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70189,49.407043],[8.704,49.432586],[8.730702,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"WWPvj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.409397],[8.713179,49.4297],[8.7043,49.416],[8.704561,49.403252]]]}}]}")
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
	public void test_vf3q0jxzjhid_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "YJ:8.6653,49.42850,8.746,49.383")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-02-20")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary_link")
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
	public void test_1hr5w6nctvejp_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or length:( .. 100)")
				.queryParam("bboxes", "Fx:8.691,49.410,8.7225,49.395")
				.queryParam("types2", "point,line,")
				.queryParam("time", "2015-10-01")
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
	public void test_rkxbwy1bvmg1_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "destination=* and not geometry:point or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "eEgA:8.7034,49.416,60|q:8.700,49.437,8|Uya:8.720340,49.401,7|IxsHD:8.723,49.430,603")
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
	public void test_1hr5crw8pjd4j_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "V:8.668,49.4258,8.700,49.392")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "maxspeed!=* or not area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_1hrmifz4ufhi9_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "ZRbn:8.704561,49.403252,8.713,49.410,8.701021,49.426,8.70661,49.42682,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_soem93csbx9s_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-10-13")
				.queryParam("bpolys", "K:8.704561,49.403252,8.702,49.4246,8.704,49.400,8.7435,49.428,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "89")
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
	public void test_1jylkflw4jujl_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* or type:way and not length:( .. 100)")
				.queryParam("bboxes", "h:8.681,49.425,8.75909,49.3957|Vr:8.65595,49.421,8.752289,49.385|K:8.694953,49.414,8.707,49.3922")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary_link")
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
	public void test_1k1tykdrcg8ro_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:line and not length:( .. 100)")
				.queryParam("types2", "way,relation")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-26")
				.queryParam("bpolys", "h:8.704561,49.403252,8.723,49.41438,8.701,49.407,8.7079,49.400118,8.704561,49.403252|rNXc:8.704561,49.403252,8.718,49.400,8.704561,49.4060,8.7048,49.41507,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "82")
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
	public void test_t843rb74b6na_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,relation")
				.queryParam("values", "give_way")
				.queryParam("filter2", "service=driveway and length:( .. 100)")
				.queryParam("bpolys", "8.704561,49.403252,8.7370,49.409,8.7487,49.427,8.744,49.436,8.704561,49.403252")
				.queryParam("timeout", "34")
				.queryParam("values2", "crossing")
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
	public void test_trwcq5zwmiwh_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "R:8.687,49.417,8.72560,49.388|SGcN:8.670,49.4259,8.748,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and length:( .. 100)")
				.queryParam("time", "2015-05-08")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "86")
				.queryParam("values2", "elevator")
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
	public void test_qxyv52swcb4x_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cy:8.6955,49.4032,8.71708,49.3961")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
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
	public void test_1hr86htnncjzo_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "ref=* or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "footway")
				.queryParam("bcircles", "s:8.725,49.417,638|yjTi:8.7281,49.436184,5")
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
	public void test_r1a14yibvtbo_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "tracktype!=*")
				.queryParam("bcircles", "nz:8.713,49.4034,5|zr:8.7138,49.4004,7|j:8.738,49.4146,6|aDgtB:8.747483,49.41296,8")
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
	public void test_tocw6opg1kxc_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-08-26")
				.queryParam("bpolys", "NH:8.704561,49.403252,8.7060,49.4285,8.705,49.41760,8.704,49.421243,8.704561,49.403252|INCFd:8.704561,49.403252,8.743,49.418327,8.745,49.40617,8.747,49.420793,8.704561,49.403252|UfMMU:8.704561,49.403252,8.7077,49.41128,8.703,49.416,8.718,49.430148,8.704561,49.403252")
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
	public void test_uboocboy12yc_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and geometry:point")
				.queryParam("bboxes", "j:8.6887,49.423412,8.714,49.39791")
				.queryParam("time", "2013-07-20")
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
	public void test_u88fy9d3mdyp_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.678,49.41424,8.745,49.390")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,relation")
				.queryParam("values", "primary")
				.queryParam("time", "2017-08-23")
				.queryParam("timeout", "91")
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
	public void test_t4q44oi9keur_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "foot!=* or geometry:point or area:(1.0 .. 1E6)")
				.queryParam("time", "2011-12-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.716,49.400866],[8.700,49.42085],[8.72621,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Re\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.407772],[8.706,49.4194],[8.707,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "21")
				.queryParam("values2", "footway")
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
	public void test_u7wtdk3znktx_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-07-27")
				.queryParam("bpolys", "mYpNi:8.704561,49.403252,8.736,49.4160,8.720,49.438,8.7376,49.439153,8.704561,49.403252|DJ:8.704561,49.403252,8.7124,49.404,8.730,49.405,8.7047,49.426946,8.704561,49.403252|Sbz:8.704561,49.403252,8.7079,49.428,8.706,49.4259,8.70656,49.436,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_vb42k7j6cdwh_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-06-10")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "29")
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
	public void test_s4p2127x9j5e_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or geometry:line")
				.queryParam("types2", "line,other")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "ref!=* and not id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.711,49.4116,5|8.716,49.4086,1")
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
	public void test_1h81zwmul3mm1_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "2016-05-07")
				.queryParam("bpolys", "B:8.704561,49.403252,8.728,49.406,8.7217,49.4278,8.701,49.42854,8.704561,49.403252|ZWq:8.704561,49.403252,8.738,49.418,8.7048,49.417,8.7113,49.439,8.704561,49.403252|VsCi:8.704561,49.403252,8.741,49.4082,8.7040,49.43237,8.7013,49.425569,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_1iemo0fg7rjg7_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
				.queryParam("values2", "elevator")
				.queryParam("bcircles", "8.7036,49.4367,840")
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
	public void test_ubgck2phg8jb_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or not type:relation or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "d:8.698,49.419,8.724,49.3909|aMefB:8.697,49.4227,8.713,49.394")
				.queryParam("format", "json")
				.queryParam("filter2", "natural=wood or type:relation and id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "32")
				.queryParam("values2", "street_lamp")
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
	public void test_1jyou79kepx0i_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "hA:8.6842,49.408,8.728,49.386|v:8.682,49.414,8.7280,49.3886")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "55")
				.queryParam("values2", "give_way")
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
	public void test_1iave5q7dp2d0_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "csv")
				.queryParam("filter2", "destination!=* and not type:way or not id:(1 .. 9999)")
				.queryParam("time", "2017-08-29")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "8.709,49.424,21|8.744,49.42129,8|8.70086,49.427,4")
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
	public void test_rl2byxyxmn37_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "NBq:8.656,49.4055,8.73761,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
				.queryParam("values2", "street_lamp")
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
	public void test_ts57gu5o8i1u_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or type:relation")
				.queryParam("bboxes", "YG:8.671298,49.401,8.7131,49.390")
				.queryParam("filter2", "ref=*")
				.queryParam("time", "2013-05-07")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "74")
				.queryParam("values2", "emergency_access_point")
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
	public void test_urpmx53rdohe_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "cx:8.704561,49.403252,8.7282,49.410,8.71568,49.4281,8.708,49.42762,8.704561,49.403252|qLl:8.704561,49.403252,8.736,49.419,8.7243,49.402,8.727478,49.420680,8.704561,49.403252|HVsa:8.704561,49.403252,8.7161,49.406401,8.708,49.43054,8.7264,49.4031,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_1hrpbdwbb9t85_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* and geometry:line")
				.queryParam("bboxes", "8.68440,49.4014,8.712348,49.3961")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.716,49.40233,8.7325,49.402,8.74826,49.425,8.704561,49.403252")
				.queryParam("bcircles", "QiWJf:8.712,49.422,40|eOtZG:8.714,49.409,51|eZcfO:8.7100,49.4399,6|kW:8.711,49.412,93")
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
	public void test_1k1zkgpu4md7m_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6868,49.42929,8.7243,49.3944")
				.queryParam("format", "geojson")
				.queryParam("time", "//P9M8D")
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
	public void test_s4rwis0gv0hf_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "tNdNE:8.678897,49.4127,8.7552,49.3824|p:8.673,49.425,8.7509,49.381")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "41")
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
	public void test_1iut7osr955py_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.695,49.405,8.71818,49.3974")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y24D")
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
	public void test_1ji1qgbspup9h_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.695,49.424,8.729,49.398|8.669,49.413558,8.736,49.380")
				.queryParam("keys", "highway")
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
	public void test_uvgwrq39361t_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=* or not length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P11M4D")
				.queryParam("bpolys", "8.704561,49.403252,8.7190,49.408,8.72221,49.409951,8.7461,49.4342,8.704561,49.403252|8.704561,49.403252,8.736,49.404,8.735,49.428,8.700,49.422,8.704561,49.403252")
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
	public void test_qhhrgltx3uci_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "E:8.7294,49.405,5|Fjz:8.743,49.410,5|SF:8.714,49.437272,54|o:8.7087,49.401,18")
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
	public void test_1huzxhx9bd6qu_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "R:8.6937,49.414024,8.70037,49.397")
				.queryParam("timeout", "76")
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
	public void test_ubmf9ze71y61_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "MiRIv:8.6699,49.429,8.72556,49.396")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y11M13D")
				.queryParam("timeout", "42")
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
	public void test_1hraxtdtmm2ig_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.693989,49.425078,8.705,49.392|8.6767,49.40551,8.7302,49.389|8.698,49.419412,8.713,49.380")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P2Y16D")
				.queryParam("timeout", "91")
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
	public void test_rlb6pqg4rh42_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.72282,49.42193,8.723,49.4389,8.70133,49.438,8.704561,49.403252")
				.queryParam("bcircles", "AXdeF:8.711,49.436,16|pVpXQ:8.733060,49.432,7|Qncv:8.716,49.407,8380969705|Np:8.734894,49.400,699410964")
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
	public void test_1iuy7r10apfle_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "sQ:8.674,49.41778,8.727,49.390|q:8.687,49.40297,8.705,49.391")
				.queryParam("time", "//P3M13D")
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
	public void test_t4yhs6epifz6_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "8.719,49.417,64|8.747,49.401,69|8.7428,49.4000,83")
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
	public void test_1iynbnrzx281l_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1Y6M17D")
				.queryParam("bcircles", "ye:8.7333,49.409,9")
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
	public void test_1huxpzp1y9x6g_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("time", "//P1M22D")
				.queryParam("bpolys", "V:8.704561,49.403252,8.724186,49.41170,8.704546,49.408,8.716,49.4346,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_1hrghtfhmhj5i_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "//P3Y5M20D")
				.queryParam("bpolys", "xNmof:8.704561,49.403252,8.710,49.405,8.734,49.427,8.736,49.429080,8.704561,49.403252|iXdlB:8.704561,49.403252,8.701,49.421,8.711,49.415,8.736,49.402740,8.704561,49.403252|dD:8.704561,49.403252,8.742,49.41839,8.70978,49.4173,8.7251,49.421,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_1h7wgacgsbn06_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "e:8.691,49.41449,8.740012,49.398|Qypg:8.6688,49.415708,8.722047,49.383")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P9M22D")
				.queryParam("timeout", "79")
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
	public void test_1ibe9hb1bt2eb_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.656220,49.414,8.728,49.391")
				.queryParam("keys", "highway")
				.queryParam("time", "//P3Y1M27D")
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
	public void test_1ibea6y1x79kh_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bYyB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743877,49.425],[8.721,49.4154],[8.707,49.408],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"GR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.420],[8.70425,49.41160],[8.701,49.406549],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73425,49.406714],[8.72046,49.403275],[8.7109,49.425],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "85")
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
	public void test_s1jycw7d6ek1_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y3D")
				.queryParam("bpolys", "K:8.704561,49.403252,8.738,49.428,8.734,49.427,8.746,49.41259,8.704561,49.403252|v:8.704561,49.403252,8.722,49.402,8.748,49.4250,8.704,49.419049,8.704561,49.403252|TnOz:8.704561,49.403252,8.723,49.43455,8.730,49.4086,8.706,49.413,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_1ibc1l5auq2qr_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.678,49.411,8.7379,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "csv")
				.queryParam("time", "//P8M9D")
				.queryParam("timeout", "54")
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
	public void test_1iun7e1auirfo_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y2M28D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"nwQJw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7048,49.417814],[8.730,49.427],[8.727,49.426],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"dzpR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73653,49.4035],[8.700,49.411],[8.727,49.422],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.411],[8.743772,49.411],[8.7121,49.43354],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "72")
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
	public void test_1iemn8avjhxkl_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "IUZpM:8.68591,49.400,8.703,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "80")
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
	public void test_r1lo1dn8slsx_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Ft:8.665722,49.4036,8.706,49.396|F:8.689885,49.420,8.7545,49.382|kG:8.67605,49.417,8.705,49.3905")
				.queryParam("showMetadata", "no")
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
	public void test_1ibh37hxblik8_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.7338,49.433,8.746,49.419,8.741960,49.4130,8.704561,49.403252|H:8.704561,49.403252,8.724,49.411,8.7019,49.41775,8.707,49.432582,8.704561,49.403252|Y:8.704561,49.403252,8.738329,49.41717,8.701556,49.413,8.749,49.435,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_sof495e7lh0i_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P24D")
				.queryParam("bpolys", "zGJv:8.704561,49.403252,8.730,49.4347,8.714,49.432,8.744,49.43397,8.704561,49.403252|GXDVx:8.704561,49.403252,8.721958,49.411168,8.730,49.40842,8.728724,49.4326,8.704561,49.403252|ZOD:8.704561,49.403252,8.703509,49.417,8.7134,49.4224,8.7049,49.426,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_u8aql1xmyzar_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P4M11D")
				.queryParam("bpolys", "8.704561,49.403252,8.7358,49.406629,8.7423,49.40042,8.706,49.4376,8.704561,49.403252|8.704561,49.403252,8.744,49.418265,8.7010,49.4025,8.716,49.407,8.704561,49.403252|8.704561,49.403252,8.715,49.423,8.703268,49.429,8.700,49.426,8.704561,49.403252")
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
	public void test_toa38pl1x2rc_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "8.703,49.439,309")
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
	public void test_vbbx4rkx8cbn_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("timeout", "54")
				.queryParam("bcircles", "8.748,49.41436,9")
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
	public void test_r1akxtzgkv1z_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and geometry:line")
				.queryParam("bboxes", "T:8.69552,49.419,8.721,49.388")
				.queryParam("format", "csv")
				.queryParam("time", "//P6M17D")
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
	public void test_vf4789lu4nz5_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* or not geometry:point or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "sUPF:8.68477,49.4255,8.733,49.3884|WdG:8.683665,49.410,8.7430,49.3851")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y3D")
				.queryParam("timeout", "84")
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
	public void test_u85o6b8xa0yp_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vs:8.69951,49.425,8.7295,49.3830")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("timeout", "82")
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
	public void test_1hb7nrc2k401c_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "//P3M14D")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "z:8.73559,49.421,80")
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
	public void test_t4yf4hfiwmeb_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y2M4D")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "arEwf:8.705,49.406,6")
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
	public void test_toddsrai46r6_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=*")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y10D")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "8.7129,49.40490,2")
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
	public void test_ts572l4iyo9v_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y1D")
				.queryParam("bpolys", "eMzCC:8.704561,49.403252,8.7207,49.438,8.7047,49.4090,8.7044,49.408,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_s4sdoe9bq6ur_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "mkcl:8.6615,49.424,8.733,49.3972|B:8.67303,49.427,8.734604,49.399")
				.queryParam("keys", "highway")
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
	public void test_qhkksk3srak5_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "mu:8.6953,49.4220,8.729,49.399")
				.queryParam("format", "json")
				.queryParam("time", "//P11D")
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
	public void test_qe1l0ulwusz6_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or geometry:point")
				.queryParam("bboxes", "K:8.6586,49.418,8.751552,49.392|h:8.6914,49.423,8.7270,49.380")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P4D")
				.queryParam("timeout", "49")
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
	public void test_rhm4tr9p2rtx_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "PDLw:8.685,49.4051,8.738513,49.397|R:8.676,49.424,8.754,49.393|h:8.6975,49.4228,8.751,49.3822|V:8.6664,49.400,8.757942,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
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
	public void test_qy4eat01g3e8_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and not type:relation and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "dKyo:8.743094,49.406,3")
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
	public void test_1jekztz4vqa92_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.73741,49.4106,17")
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
	public void test_rh4zeerw0ks7_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "R:8.74179,49.429518,3")
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
	public void test_vbmxw09mj4o6_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "//P10M5D")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "CFd:8.7382,49.424,9")
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
	public void test_qxtcdp87i246_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* and type:way")
				.queryParam("format", "csv")
				.queryParam("bpolys", "qh:8.704561,49.403252,8.743,49.426,8.72159,49.433,8.701,49.4097,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_1ibkbqnu5p4j9_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "YS:8.7100,49.4386,27")
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
	public void test_trwc9i7cgl6c_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "m:8.713,49.41925,40")
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
	public void test_vbcd14455vlg_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.65277,49.417,8.737949,49.398|8.6659,49.402510,8.741,49.3867|8.698,49.42744,8.743,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_1iv9ty4xithyt_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2M15D")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "PrN:8.7128,49.426,1|r:8.7150,49.4080,9|b:8.713,49.439,8")
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
	public void test_rlamgablhank_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cE:8.68746,49.4023,8.719,49.389|O:8.686,49.411,8.752,49.3993|t:8.685,49.40323,8.756972,49.381|w:8.66879,49.410,8.7335,49.380807")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "49")
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
	public void test_vbmzg4oo4wfr_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or not type:node or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "f:8.704561,49.403252,8.74445,49.413249,8.7045,49.4253,8.7010,49.4015,8.704561,49.403252")
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
	public void test_vbppzgf53td0_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3M19D")
				.queryParam("bcircles", "u:8.72447,49.4323,1")
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
	public void test_t843fwerkeat_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* or type:way and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "qQNum:8.691,49.400,8.73210,49.391")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
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
	public void test_1hv5g749rhi5y_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "S:8.661,49.424,8.748,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("time", "//P3M28D")
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
	public void test_1jeyuavaxdirb_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "8.7230,49.411,64")
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
	public void test_r1lnbu6293du_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "r:8.686,49.402481,8.72552,49.382|pE:8.687,49.4298,8.735,49.3821|fNh:8.659934,49.420,8.746040,49.390|W:8.664,49.4297,8.720,49.385932")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("timeout", "70")
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
	public void test_1jiai5hoscj8j_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=*")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P9M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.74658,49.401805,8.710,49.4166,8.7000,49.434,8.704561,49.403252|8.704561,49.403252,8.709985,49.4195,8.722,49.409,8.702,49.402861,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_u8aopd4sw8rm_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line")
				.queryParam("bpolys", "JnCSv:8.704561,49.403252,8.7303,49.436219,8.704,49.439,8.743,49.4032,8.704561,49.403252|RUzxE:8.704561,49.403252,8.703,49.427006,8.7017,49.439,8.7046,49.425,8.704561,49.403252|cVFV:8.704561,49.403252,8.745,49.407236,8.719,49.416,8.702,49.428,8.704561,49.403252")
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
	public void test_soen13xioabc_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "8.70247,49.409,1")
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
	public void test_1ib0ghcsdcshg_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* and not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P10M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.70632,49.435,8.727,49.404,8.70467,49.40359,8.704561,49.403252|8.704561,49.403252,8.748,49.4099,8.7327,49.425,8.705,49.4109,8.704561,49.403252|8.704561,49.403252,8.7175,49.412,8.70443,49.405012,8.743,49.420813,8.704561,49.403252")
				.queryParam("timeout", "41")
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
	public void test_u856prxvvrjr_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "87")
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
	public void test_1hbaed0kti52t_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "TKVl:8.704561,49.403252,8.710,49.421,8.748,49.414,8.730,49.414,8.704561,49.403252|beYqB:8.704561,49.403252,8.741,49.420,8.7002,49.410,8.701463,49.403,8.704561,49.403252|EyExR:8.704561,49.403252,8.726058,49.434,8.70899,49.427,8.732,49.422395,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_1ibbh8p19mxyd_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.737231,49.438,8.709,49.43935,8.739,49.408,8.704561,49.403252|8.704561,49.403252,8.73369,49.422,8.719,49.418,8.706,49.42560,8.704561,49.403252|8.704561,49.403252,8.70597,49.439,8.7055,49.4231,8.722,49.41504,8.704561,49.403252")
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
	public void test_sl6o3bhklqhy_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.7460,49.4078,17")
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
	public void test_qy4f37dh79rm_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("time", "//P4M5D")
				.queryParam("bcircles", "8.711457,49.424,1")
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
	public void test_1iycppvd8kv1v_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic")
				.queryParam("filter", "ref=*")
				.queryParam("bboxes", "bs:8.654,49.4095,8.734,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y5M1D")
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
	public void test_ubombffy7qr4_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,speed_camera")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "//P7M5D")
				.queryParam("bpolys", "Hv:8.704561,49.403252,8.709,49.411,8.7161,49.421,8.708158,49.424,8.704561,49.403252")
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
	public void test_sok4n5t6f5mc_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,hotel")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "g:8.7184,49.4385,45")
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
	public void test_u7raa6f77hv4_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,steps")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P5M6D")
				.queryParam("bpolys", "Ao:8.704561,49.403252,8.721,49.418,8.7027,49.431,8.7052,49.416,8.704561,49.403252|s:8.704561,49.403252,8.709,49.436,8.7046,49.4389,8.706,49.42670,8.704561,49.403252")
				.queryParam("timeout", "73")
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
	public void test_u7rtdiuokn6r_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.663,49.40391,8.720,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P8M2D")
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
	public void test_qe133jxw8g9w_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,chapel")
				.queryParam("filter", "network=* or type:relation")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.42459,8.706,49.4166,8.7388,49.42778,8.704561,49.403252|8.704561,49.403252,8.7211,49.412664,8.7052,49.438,8.7473,49.4297,8.704561,49.403252|8.704561,49.403252,8.736,49.4132,8.728,49.412,8.708,49.427,8.704561,49.403252")
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
	public void test_s0xre6t5q4ir_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("time", "//P11D")
				.queryParam("bpolys", "yaI:8.704561,49.403252,8.71422,49.410,8.704661,49.405,8.703,49.4280,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_1jyfzprb0359e_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "//P2Y2M15D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wWuPM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.431],[8.719,49.4019],[8.730,49.406],[8.704561,49.403252]]]}}]}")
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
	public void test_s102so69r7si_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P1M7D")
				.queryParam("bcircles", "RZx:8.7285,49.41428,5")
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
	public void test_1hvbium3q8rxi_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop_line,track,pedestrian")
				.queryParam("bboxes", "8.689,49.41872,8.7258,49.380|8.679,49.419,8.749,49.392|8.6935,49.402,8.7055,49.3914|8.654,49.412278,8.714,49.396209")
				.queryParam("groupByKey", "building")
				.queryParam("time", "//P2M11D")
				.queryParam("timeout", "58")
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
	public void test_1hbm2ic1qntiw_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* and geometry:polygon")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "u:8.707,49.416,5")
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
	public void test_rhr5zq05ezi0_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pJwyX:8.65159,49.4283,8.751779,49.3891")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y11D")
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
	public void test_r1alebvhkkkx_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6523,49.42985,8.742,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
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
	public void test_1ji1okwx10m75_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "jD:8.681770,49.418,8.722,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_1if0itdrlvtbm_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,speed_camera")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.71811,49.42095,8.706,49.434,8.719,49.4073,8.704561,49.403252")
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
	public void test_1ievi1m43v3ue_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P7M9D")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.435,8.704,49.435,8.704572,49.415,8.704561,49.403252|8.704561,49.403252,8.736,49.409404,8.700,49.409,8.701,49.4076,8.704561,49.403252")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "Qm:8.749,49.41662,7|lVgs:8.7493,49.435,3|k:8.7231,49.4119,9|ULxeA:8.733,49.423,195067934833")
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
	public void test_to2api86jk2u_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "PN:8.722,49.422111,843075561")
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
	public void test_1h7qxl5qtw84x_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P6M4D")
				.queryParam("bpolys", "o:8.704561,49.403252,8.7050,49.400,8.719457,49.4079,8.7020,49.407,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_qefgr2ybw1up_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or area:(1.0 .. 1E6)")
				.queryParam("time", "//P3Y1M8D")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.4302,8.727,49.43243,8.72629,49.42162,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_to4k5xyn7wx1_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "ye:8.728,49.432,71|Trx:8.7290,49.40808,3|xOA:8.707,49.406,21|hJKk:8.731251,49.43138,512")
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
	public void test_sohwcf9laii9_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.65623,49.400,8.75247,49.384|XHTuA:8.688,49.421127,8.726,49.3941|g:8.66261,49.406,8.722,49.3821")
				.queryParam("keys", "highway")
				.queryParam("time", "//P3Y2M8D")
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
	public void test_1k252wmppinnb_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* or type:way")
				.queryParam("time", "//P8D")
				.queryParam("bcircles", "q:8.730093,49.4303,35|XSy:8.749020,49.420,8|Pg:8.705,49.4101,2|vj:8.7217,49.407,4")
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
	public void test_qefgo4e3tw83_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P8M9D")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "OtZVX:8.7155,49.424,8|s:8.740,49.428,7")
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
	public void test_vbbv6m11731v_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed!=* and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P1Y10M1D")
				.queryParam("bpolys", "ew:8.704561,49.403252,8.7207,49.423,8.704561,49.4102,8.7376,49.4011,8.704561,49.403252|sITe:8.704561,49.403252,8.730504,49.416,8.744059,49.43167,8.706,49.410,8.704561,49.403252|x:8.704561,49.403252,8.720,49.4392,8.70476,49.434,8.7408,49.436,8.704561,49.403252")
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
	public void test_t81blfv5gunk_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1M9D")
				.queryParam("bpolys", "qPPSa:8.704561,49.403252,8.7209,49.424,8.735869,49.439,8.7321,49.415,8.704561,49.403252|kayzk:8.704561,49.403252,8.703,49.429,8.704,49.420,8.744,49.4337,8.704561,49.403252|I:8.704561,49.403252,8.708,49.407919,8.70191,49.417,8.7163,49.425,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_qxobjicyrazp_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "YD:8.682,49.402,8.741,49.390")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "ZbirN:8.717,49.410,36|psEPL:8.748,49.405,4")
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
	public void test_to7vcs4aewxd_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and type:node")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y2M13D")
				.queryParam("bpolys", "rU:8.704561,49.403252,8.7224,49.4124,8.722,49.4205,8.730212,49.428,8.704561,49.403252|uQNAB:8.704561,49.403252,8.72799,49.400,8.7156,49.425,8.709,49.408285,8.704561,49.403252|bE:8.704561,49.403252,8.733,49.411,8.7009,49.411,8.718,49.4198,8.704561,49.403252")
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
	public void test_s4p1bcj3vtpx_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "//P9M16D")
				.queryParam("bcircles", "jT:8.70537,49.40517,7")
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
	public void test_r1a121wtciub_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "V:8.675369,49.420053,8.7051,49.387")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P7M11D")
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
	public void test_1k22aqxmrri2b_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "wG:8.7029,49.421,80|wPNA:8.702111,49.413,730")
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
	public void test_1iun49f0fsxmh_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6910,49.412,8.7031,49.393|8.6880,49.406798,8.758,49.399|8.65993,49.421,8.757,49.3805")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "88")
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
	public void test_1iukcyejfa4iq_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("time", "//P1M7D")
				.queryParam("bpolys", "Hlu:8.704561,49.403252,8.706,49.426,8.7384,49.42333,8.731,49.403,8.704561,49.403252")
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
	public void test_u8dfp6qqnjue_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P6M5D")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "H:8.722,49.439,1")
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
	public void test_1iun6aaty0fu9_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=*")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "mXE:8.704561,49.403252,8.74057,49.407674,8.7348,49.425,8.700,49.414,8.704561,49.403252|NNw:8.704561,49.403252,8.746,49.401,8.713,49.425,8.749,49.4091,8.704561,49.403252|LI:8.704561,49.403252,8.7005,49.41857,8.703,49.402,8.733,49.4323,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_1hbazhd3sud6g_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nir:8.6973,49.425664,8.748863,49.3864|G:8.691,49.413,8.743,49.3938|F:8.676,49.41077,8.7136,49.380|LcoTo:8.669,49.4156,8.759,49.385304")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
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
	public void test_1jyod1x5bdqur_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and id:(1 .. 9999)")
				.queryParam("bboxes", "CbcS:8.658,49.411,8.701,49.380")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2M1D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ifmQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.404],[8.719,49.432],[8.724,49.439],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"MT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7023,49.405],[8.707,49.416],[8.738,49.433],[8.704561,49.403252]]]}}]}")
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
	public void test_qxfiod3huuli_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "x:8.7212,49.439074,2")
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
	public void test_s1b6a0ngtdmb_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "dQ:8.746,49.4398,65|IZEFP:8.712,49.428313,67|Fn:8.707,49.4312,1")
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
	public void test_vb6b628zsqcj_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y8M1D")
				.queryParam("bcircles", "yJ:8.7150,49.411,3|ch:8.7050,49.426,4")
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
	public void test_t4yh2uw1p4q8_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1Y2M8D")
				.queryParam("bpolys", "O:8.704561,49.403252,8.701,49.40694,8.7234,49.423,8.7088,49.438957,8.704561,49.403252|aV:8.704561,49.403252,8.729,49.4337,8.728,49.4284,8.744435,49.4304,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_qe3siywtno6s_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y3M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.715,49.4006,8.700,49.408,8.748,49.433,8.704561,49.403252|8.704561,49.403252,8.74400,49.434,8.70447,49.41488,8.7043,49.4255,8.704561,49.403252|8.704561,49.403252,8.732,49.413,8.741,49.401,8.7458,49.410,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_1jei7a13k78dy_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P5M18D")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "l:8.7356,49.439,65|qhA:8.743,49.431216,4|Ub:8.730,49.436861,7|wk:8.717187,49.402,8")
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
	public void test_qe1kpk6dkmd4_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "mHHi:8.704561,49.403252,8.727166,49.412,8.7159,49.436907,8.724,49.405480,8.704561,49.403252|G:8.704561,49.403252,8.726,49.410196,8.70190,49.424,8.704591,49.40111,8.704561,49.403252")
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
	public void test_toiyg7g6vxa0_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6765,49.400,8.706,49.398")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "21")
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
	public void test_vbhf1zmmuxpu_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("bcircles", "k:8.7195,49.421,1|rK:8.72853,49.4395,4|Aje:8.711,49.404,5|c:8.7257,49.407,21")
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
	public void test_toiy4r24hw11_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.684384,49.409784,8.706,49.399|8.66208,49.424,8.727,49.386|8.696,49.427687,8.7269,49.385|8.6944,49.410,8.752,49.387663")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y1M7D")
				.queryParam("bcircles", "z:8.7241,49.4131,743|M:8.704,49.432,39")
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
	public void test_socb8r2j7ejo_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P6M12D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"DEeE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7354,49.4353],[8.704,49.4051],[8.70396,49.435],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Epu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740107,49.4111],[8.7242,49.413],[8.706,49.414],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "74")
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
	public void test_s507gbzuhfmt_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74816,49.411],[8.708,49.439],[8.7124,49.422],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "38")
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
	public void test_1jew2zr961ph5_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y14D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"OMd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.411],[8.706432,49.40621],[8.706,49.408],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "48")
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
	public void test_socaxcmrpgdy_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and type:node and not id:(1 .. 9999)")
				.queryParam("bboxes", "8.679,49.4050,8.749,49.3859")
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
	public void test_1ib98n2846kvm_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P6M7D")
				.queryParam("bcircles", "K:8.721,49.422,9")
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
	public void test_rhg3a5tom2qq_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P10D")
				.queryParam("bcircles", "aO:8.7376,49.404,7")
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
	public void test_s1b69wpcsmsj_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or not geometry:polygon")
				.queryParam("bboxes", "8.699737,49.411,8.742,49.382|8.690,49.414858,8.732,49.3962|8.698,49.407,8.754,49.3826")
				.queryParam("format", "json")
				.queryParam("time", "//P26D")
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
	public void test_r1akxxx6xy75_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P1M3D")
				.queryParam("bpolys", "S:8.704561,49.403252,8.734,49.412,8.747,49.437647,8.720,49.4184,8.704561,49.403252|en:8.704561,49.403252,8.718,49.4032,8.710,49.427,8.710,49.438,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_rhr4i0c8xyrd_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SBJjv:8.685,49.417,8.726,49.399|fv:8.699,49.421,8.738791,49.3841|CW:8.697,49.409,8.756397,49.391|Am:8.65325,49.40452,8.738,49.399902")
				.queryParam("timeout", "31")
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
	public void test_sl3dlshjkf94_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.4149,8.710395,49.402,8.7374,49.406,8.704561,49.403252|8.704561,49.403252,8.7367,49.421,8.71565,49.405,8.728,49.43546,8.704561,49.403252|8.704561,49.403252,8.73172,49.411,8.70121,49.402,8.701,49.408,8.704561,49.403252")
				.queryParam("timeout", "98")
				.queryParam("groupByKeys", "lanes:forward,building,oneway")
				.queryParam("bcircles", "E:8.73459,49.40106,6")
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
	public void test_1iun5tpce9pib_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* or geometry:polygon or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.688,49.405,8.70150,49.389|8.6720,49.4172,8.75542,49.381|8.655572,49.4249,8.729,49.39827|8.652,49.41676,8.710607,49.381742")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P6M1D")
				.queryParam("bpolys", "8.704561,49.403252,8.717,49.419,8.72914,49.434821,8.706,49.418,8.704561,49.403252")
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
	public void test_1jettgx3txxsx_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "YGN:8.6825,49.423,8.755,49.391")
				.queryParam("groupByKeys", "barrier,addr:city,smoothness")
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
	public void test_qec7ft9ms6cw_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or geometry:line")
				.queryParam("bboxes", "vxJZP:8.693,49.414,8.718,49.393")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y4D")
				.queryParam("groupByKeys", "foot,landuse")
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
	public void test_t4nvu9s925v5_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "bF:8.662074,49.426789,8.718622,49.3843|FjjTJ:8.690,49.408,8.72389,49.393|bOIS:8.69756,49.405099,8.7110,49.38970|F:8.691,49.414,8.708,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("timeout", "87")
				.queryParam("groupByKeys", "name,source:maxspeed,lit")
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
	public void test_sl64zr4uljqv_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway and type:node and not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "type")
				.queryParam("bcircles", "Lsvxu:8.704,49.401,3")
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
	public void test_skq30304pzjm_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "hv:8.704561,49.403252,8.707,49.41300,8.724,49.421,8.7094,49.4158,8.704561,49.403252")
				.queryParam("groupByKeys", "lit,surface,barrier")
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
	public void test_s1jyfmg932hu_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6796,49.4003,8.706,49.380")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2M7D")
				.queryParam("groupByKeys", "addr:city,ref")
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
	public void test_rlanataz935d_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=*")
				.queryParam("bboxes", "8.67084,49.423,8.721,49.397|8.660,49.403,8.736,49.388|8.684,49.421,8.742,49.386")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "lit,landuse")
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
	public void test_1huzzu68jbl2b_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y2M1D")
				.queryParam("groupByKeys", "addr:country,addr:housenumber")
				.queryParam("bcircles", "oI:8.7410,49.4293,7|Dew:8.720,49.409,3")
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
	public void test_skkjuonyh83d_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "CWu:8.658098,49.41018,8.724,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y7M4D")
				.queryParam("timeout", "64")
				.queryParam("groupByKeys", "lanes,destination,barrier")
				.queryParam("bcircles", "hi:8.7020,49.4080,1")
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
	public void test_1h7z8wv6k16wm_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3M28D")
				.queryParam("timeout", "29")
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
	public void test_u8dj4s17nb6s_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P12D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zeA\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713,49.410],[8.716,49.438],[8.735,49.4007],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"R\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737,49.420],[8.709960,49.42343],[8.70488,49.437],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Wk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.42021],[8.703,49.4056],[8.700,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "22")
				.queryParam("groupByKeys", "highway,building,turn")
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
	public void test_qhnbsg17iqg5_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "q:8.678545,49.4046,8.7016,49.383")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1M15D")
				.queryParam("timeout", "39")
				.queryParam("groupByKeys", "landuse,network")
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
	public void test_1ib990zf2ocx1_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=*")
				.queryParam("bboxes", "8.6983,49.413,8.750,49.386")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y5M4D")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "tracktype,type")
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
	public void test_1hv005gb0ry2a_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and geometry:polygon and id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Nc:8.704561,49.403252,8.705636,49.430800,8.704560,49.416,8.7022,49.426,8.704561,49.403252|l:8.704561,49.403252,8.701,49.425,8.700,49.421,8.712,49.439,8.704561,49.403252|mA:8.704561,49.403252,8.727,49.432065,8.708799,49.41491,8.70142,49.417,8.704561,49.403252")
				.queryParam("groupByKeys", "turn:lanes,lanes,name")
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
	public void test_1jy7oujt4x6b4_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "//P4M6D")
				.queryParam("bpolys", "r:8.704561,49.403252,8.722,49.424672,8.70206,49.414443,8.703726,49.4156,8.704561,49.403252|Nmrl:8.704561,49.403252,8.73451,49.4354,8.705,49.4263,8.746,49.420549,8.704561,49.403252")
				.queryParam("timeout", "49")
				.queryParam("groupByKeys", "lanes")
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
	public void test_us2yauu8hnxe_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "//P2Y2D")
				.queryParam("timeout", "94")
				.queryParam("groupByKeys", "network,addr:housenumber")
				.queryParam("bcircles", "KXipk:8.745,49.434741,47")
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
	public void test_u7u3mank6omv_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "//P4M4D")
				.queryParam("bpolys", "8.704561,49.403252,8.745368,49.41776,8.704,49.418,8.749,49.401,8.704561,49.403252")
				.queryParam("groupByKeys", "oneway,lit,addr:housenumber")
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
	public void test_uvenpjpjoze9_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.4348,8.712,49.4261,8.705,49.414,8.704561,49.403252|8.704561,49.403252,8.712,49.404,8.71461,49.420,8.717,49.402083,8.704561,49.403252")
				.queryParam("groupByKeys", "name,tracktype,addr:postcode")
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
	public void test_t87dgjp1rh2x_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link,track,give_way")
				.queryParam("filter", "destination=* or type:node")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P8D")
				.queryParam("bpolys", "pUN:8.704561,49.403252,8.7276,49.42886,8.707927,49.4265,8.718,49.4083,8.704561,49.403252|VsOza:8.704561,49.403252,8.700928,49.402813,8.72184,49.4351,8.7041,49.4087,8.704561,49.403252")
				.queryParam("bcircles", "8.714717,49.4061,17")
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
	public void test_urpnrmjddnxg_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or not type:relation and length:( .. 100)")
				.queryParam("groupByValues", "tower")
				.queryParam("bboxes", "KXdn:8.6930,49.409429,8.709,49.397075|DVpqJ:8.676080,49.40654,8.71273,49.398")
				.queryParam("keys", "highway")
				.queryParam("bcircles", "A:8.736,49.413583,5")
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
	public void test_u7ukaxkznnfl_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"sS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723,49.4071],[8.708,49.417],[8.701,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"WcpSD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706111,49.403152],[8.709,49.4247],[8.724,49.4105],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"oPGlq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71125,49.426],[8.71964,49.41291],[8.7005,49.423],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "33")
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
	public void test_trtmfk1kmfs2_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,cycleway,traffic_signals")
				.queryParam("bboxes", "L:8.683,49.402,8.74719,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
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
	public void test_uvenplp4si1u_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Iczqs:8.6609,49.427,8.701344,49.389")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
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
	public void test_1hrbgif95up88_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,synagogue")
				.queryParam("filter", "ref=* or geometry:point or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y26D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.42663],[8.701159,49.434],[8.72069,49.43090],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "77")
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
	public void test_qxwm5gh05owy_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "HN:8.657,49.411,8.74560,49.381490|C:8.692815,49.421141,8.701,49.384")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P9M19D")
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
	public void test_t4knaog7t450_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,secondary")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "iF:8.71958,49.409,3|C:8.73015,49.433,26|l:8.7062,49.402,6|Zv:8.7354,49.432,433228750")
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
	public void test_s1ee3qova0qb_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.73649,49.438,4|8.729,49.4186,7")
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
	public void test_uv8lubyfce3m_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,hospital")
				.queryParam("filter", "bicycle=* and type:way")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "t:8.734071,49.4033,6|Iw:8.70741,49.400,71")
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
	public void test_vb3je4igxie9_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,ship,commercial")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and geometry:point or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "residential")
				.queryParam("bpolys", "tvkRZ:8.704561,49.403252,8.705,49.402,8.704518,49.410075,8.7040,49.410,8.704561,49.403252|QKTMu:8.704561,49.403252,8.71001,49.432,8.708,49.40684,8.709,49.418,8.704561,49.403252")
				.queryParam("bcircles", "RdZ:8.746718,49.403,66|L:8.74026,49.422489,679")
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
	public void test_vb6ty6jkxe7n_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("bpolys", "XqE:8.704561,49.403252,8.732,49.403,8.70471,49.432,8.743760,49.417,8.704561,49.403252|Y:8.704561,49.403252,8.714,49.421,8.740,49.4148,8.7420,49.413676,8.704561,49.403252|w:8.704561,49.403252,8.735848,49.405125,8.7024,49.401,8.734,49.405,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_1ies8q81r3w4h_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "//P7M23D")
				.queryParam("bpolys", "8.704561,49.403252,8.719,49.41011,8.709614,49.4234,8.720,49.4067,8.704561,49.403252|8.704561,49.403252,8.708584,49.407721,8.70458,49.43995,8.719,49.4159,8.704561,49.403252")
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
	public void test_qeevmvy2c8yp_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,tertiary")
				.queryParam("filter", "oneway=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1M12D")
				.queryParam("bpolys", "d:8.704561,49.403252,8.73603,49.419,8.70443,49.41294,8.703,49.428,8.704561,49.403252")
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
	public void test_ursf2y49d4ki_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle,hotel,service")
				.queryParam("filter", "lit=* or geometry:point or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y2M9D")
				.queryParam("bpolys", "zLVMw:8.704561,49.403252,8.720,49.413,8.70390,49.436,8.738,49.4011,8.704561,49.403252|z:8.704561,49.403252,8.70610,49.423809,8.704,49.4297,8.704,49.408,8.704561,49.403252")
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
	public void test_t4cb7amdxd83_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "S:8.704561,49.403252,8.7273,49.411,8.7033,49.412,8.7063,49.4293,8.704561,49.403252")
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
	public void test_vf3ncqzws4l2_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,garage,elevator")
				.queryParam("bboxes", "u:8.69276,49.424,8.709398,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P24D")
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
	public void test_sksv65uwnygh_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or length:( .. 100)")
				.queryParam("bboxes", "LNQBC:8.692554,49.400,8.719,49.398|e:8.665,49.422,8.7339,49.387|e:8.670,49.4075,8.753,49.390|w:8.662,49.4065,8.757,49.3990")
				.queryParam("groupByKey", "building")
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
	public void test_ts4pzspt2aue_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "W:8.704561,49.403252,8.719513,49.437,8.7042,49.430040,8.7401,49.4082,8.704561,49.403252|C:8.704561,49.403252,8.72736,49.439,8.718,49.424,8.704,49.41523,8.704561,49.403252|I:8.704561,49.403252,8.720,49.408,8.71735,49.434,8.7380,49.419,8.704561,49.403252")
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
	public void test_1hrot2o4ep17o_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1M23D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ps\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7241,49.43283],[8.70343,49.422860],[8.711,49.421],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"GeJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7467,49.406973],[8.7045,49.414],[8.7467,49.435],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BaAfI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70801,49.434],[8.70971,49.435],[8.724,49.4331],[8.704561,49.403252]]]}}]}")
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
	public void test_1hruc88ptvjg7_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.696,49.4027,8.725,49.381|LrZ:8.6725,49.418,8.7355,49.39492")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y1M1D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"WAGi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7440,49.4200],[8.7208,49.404],[8.7137,49.438],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "s:8.719,49.416,1")
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
	public void test_us3iynwtm2bc_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Emk:8.655397,49.425128,8.716095,49.397|Ma:8.6890,49.428002,8.721,49.389|KgLH:8.697,49.406,8.7240,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("timeout", "88")
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
	public void test_1jig2vcbakfg7_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "8.736,49.4092,239|8.710,49.429,92")
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
	public void test_us2zxnyq3crn_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.669365,49.40220,8.751,49.3834")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3M27D")
				.queryParam("timeout", "32")
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
	public void test_qdy9rhdaay41_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("time", "//P5M9D")
				.queryParam("bpolys", "8.704561,49.403252,8.7288,49.421,8.7037,49.4250,8.7383,49.429,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_1jyiv2diq8ggx_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ovsSS:8.65087,49.4142,8.7461,49.392|MsSlY:8.684,49.403,8.715,49.3824|m:8.680,49.417,8.729,49.390|e:8.672515,49.4006,8.7502,49.397")
				.queryParam("keys", "highway")
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
	public void test_to1srwzh8w1h_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and not type:relation or length:( .. 100)")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "YAE:8.706954,49.41032,8|mya:8.703,49.416465,5")
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
	public void test_s4p3nh6fs9is_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or type:node or length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P10M5D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wQlPi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741667,49.4182],[8.7041,49.42425],[8.701,49.4146],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "59")
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
	public void test_1iykgrhdj1u0m_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "qtpv:8.6626,49.419,8.7133,49.3843|SUkoR:8.69180,49.429576,8.7532,49.3944|W:8.695827,49.4204,8.746,49.3835")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P10M2D")
				.queryParam("timeout", "38")
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
	public void test_tocv3fz9g2lw_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:way")
				.queryParam("bboxes", "8.6547,49.424,8.7180,49.3918")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "70")
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
	public void test_u7u2fxslmud3_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* or geometry:line or not length:( .. 100)")
				.queryParam("bboxes", "YeK:8.694,49.424299,8.709,49.3834")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "nps:8.704561,49.403252,8.713,49.436,8.70256,49.40581,8.74993,49.439,8.704561,49.403252|AaoIc:8.704561,49.403252,8.7260,49.421,8.72369,49.4201,8.7094,49.414,8.704561,49.403252|b:8.704561,49.403252,8.704,49.429,8.7418,49.437,8.741624,49.413859,8.704561,49.403252")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "z:8.722928,49.416,15|Vo:8.7349,49.422286,1")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iexqbs7szyox_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.656,49.4088,8.738,49.383|8.683,49.424,8.7072,49.3872")
				.queryParam("format", "csv")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s5054l6slylf_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("time", "//P5M22D")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.72961,49.400,8.706,49.4281,8.743,49.4127,8.704561,49.403252|Vfnav:8.704561,49.403252,8.700,49.4187,8.7046,49.405,8.706,49.41433,8.704561,49.403252|EGrSe:8.704561,49.403252,8.7146,49.406,8.704,49.409,8.7319,49.438410,8.704561,49.403252")
				.queryParam("timeout", "59")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib601054sorl_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P7M11D")
				.queryParam("bpolys", "HgyNB:8.704561,49.403252,8.746,49.416,8.747,49.438064,8.7494,49.4026,8.704561,49.403252")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv95br394ggy_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "j:8.704561,49.403252,8.714,49.412,8.749,49.42548,8.70348,49.40293,8.704561,49.403252")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1je9wc58dx5io_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or type:relation and id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "x:8.720,49.4043,7|AE:8.709,49.400,44")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyg2fwr3oj1h_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "BAo:8.696,49.429,8.746,49.3802|IXP:8.654,49.408,8.739,49.3857")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y21D")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf96win651lt_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("bpolys", "mvxgV:8.704561,49.403252,8.738182,49.407,8.701,49.4102,8.705,49.411,8.704561,49.403252|PuaED:8.704561,49.403252,8.741,49.424,8.70446,49.41415,8.70895,49.4295,8.704561,49.403252|zDM:8.704561,49.403252,8.72289,49.435,8.706381,49.4350,8.724019,49.41297,8.704561,49.403252")
				.queryParam("timeout", "98")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s0v0rwmm80fm_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "VxPZ:8.749,49.413,1")
			.when()
				.post("/users/count/groupBy/type");

			response.then().log().all();
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl52kueh2map_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* or not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.410,8.7282,49.435086,8.7024,49.42067,8.704561,49.403252|8.704561,49.403252,8.702838,49.41197,8.7098,49.4129,8.7471,49.4031,8.704561,49.403252")
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
