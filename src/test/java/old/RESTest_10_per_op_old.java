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
public class RESTest_10_per_op_old {

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
	public void test_urmeufi4fbky_area() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "point,line,polygon,other")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Xh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.424],[8.70625,49.409],[8.7055,49.42024],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"KTsEN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7200,49.406],[8.742,49.433210],[8.706,49.438],[8.704561,49.403252]]]}}]}")
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
	public void test_1k22bu6qtiusm_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "point,polygon,")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
				.queryParam("time", "2013-12-29")
				.queryParam("bpolys", "ipjK:8.704561,49.403252,8.74782,49.40984,8.705,49.43418,8.72205,49.416,8.704561,49.403252|ygyvh:8.704561,49.403252,8.717,49.414,8.70425,49.433,8.747913,49.410,8.704561,49.403252|paAwp:8.704561,49.403252,8.713635,49.429160,8.7048,49.41227,8.721,49.410,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_1hravxit5oawp_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "line,other")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.407],[8.707,49.4075],[8.717,49.42671],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "39")
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
	public void test_1jiaijcka52lg_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"e\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.423],[8.72200,49.405],[8.7438,49.4302],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "89")
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
	public void test_ubgvq5e1f5f9_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "node,relation")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-08-16")
				.queryParam("bcircles", "gt:8.703925,49.410,1")
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
	public void test_t4kkkqjzopk4_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "oo:8.685,49.4159,8.7211,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "95")
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
	public void test_1jeqi7dwmk3zs_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "polygon,other")
				.queryParam("bboxes", "w:8.678539,49.41391,8.728,49.3956")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "50")
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
	public void test_skna2dowlvmq_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and not type:way or length:( .. 100)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Lg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72214,49.401123],[8.708,49.435775],[8.727,49.424],[8.704561,49.403252]]]}}]}")
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
	public void test_1huzwnkiwm3as_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "way,relation")
				.queryParam("bboxes", "y:8.6568,49.403,8.728,49.385")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-01-07")
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
	public void test_rl7v4qv8ro0x_area() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types", "point,line,polygon,")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-08-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"X\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7096,49.4070],[8.7008,49.435440],[8.7187,49.4275],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "49")
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
	public void test_skpj794ztyk1_area1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "oX:8.6907,49.426376,8.758,49.392|M:8.672,49.422,8.7327,49.394|zxSqr:8.692,49.41213,8.7126,49.3847|P:8.653849,49.400380,8.7154,49.3858")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "n:8.704561,49.403252,8.7322,49.435,8.70507,49.408,8.742,49.41846,8.704561,49.403252|C:8.704561,49.403252,8.7151,49.4287,8.701531,49.4016,8.705,49.402,8.704561,49.403252|DT:8.704561,49.403252,8.7318,49.427,8.741,49.4134,8.705238,49.4171,8.704561,49.403252")
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
	public void test_urekzp6etv02_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:backward!=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "dXLr:8.704561,49.403252,8.745,49.405,8.707,49.432,8.747,49.4163,8.704561,49.403252")
				.queryParam("timeout", "82")
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
	public void test_1hbg08v9ovqd4_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-09-29")
				.queryParam("bpolys", "jb:8.704561,49.403252,8.719,49.421,8.738,49.4310,8.7266,49.421,8.704561,49.403252|Z:8.704561,49.403252,8.711,49.435,8.7256,49.427746,8.7399,49.412,8.704561,49.403252|It:8.704561,49.403252,8.737578,49.405,8.735,49.410,8.726,49.421,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_1iuy9bjlxcqba_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=*")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-10-23")
				.queryParam("bpolys", "Uv:8.704561,49.403252,8.704,49.403,8.7465,49.42993,8.744,49.4353,8.704561,49.403252|zhcPe:8.704561,49.403252,8.70048,49.43940,8.7423,49.409,8.7493,49.411,8.704561,49.403252|M:8.704561,49.403252,8.705,49.4286,8.743,49.424086,8.727355,49.4204,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_1iupydjfxadyq_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=*")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "8.718,49.4339,7")
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
	public void test_qxljd7okf3vo_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6818,49.404,8.7392,49.387")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-12-23")
				.queryParam("timeout", "95")
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
	public void test_1h7o8jg3ig0v5_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and type:relation and not length:( .. 100)")
				.queryParam("bpolys", "t:8.704561,49.403252,8.741,49.408,8.714,49.41796,8.734145,49.432,8.704561,49.403252")
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
	public void test_1jeaf1q0wqzw4_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or geometry:point or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"MS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7068,49.41193],[8.7191,49.430],[8.705,49.425412],[8.704561,49.403252]]]}}]}")
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
	public void test_toiekv4yli60_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "X:8.713,49.404494,97")
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
	public void test_1jeip78ihxcgx_area1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and length:( .. 100)")
				.queryParam("time", "2009-06-18")
				.queryParam("bcircles", "MBH:8.7286,49.434076,7")
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
	public void test_sl0lwtleh25z_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:forward!=*")
				.queryParam("bboxes", "8.684,49.4002,8.734492,49.397|8.6734,49.403,8.7082,49.3903")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "II:8.704561,49.403252,8.748,49.406,8.7140,49.419,8.703,49.4204,8.704561,49.403252")
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
	public void test_1iuy9pcgecv8z_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.729,49.408,5")
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
	public void test_sobtpjfskpd0_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("time", "2015-02-18")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "JVVBU:8.7204,49.407,7")
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
	public void test_1hb7pdx97qkae_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or length:( .. 100)")
				.queryParam("bboxes", "uOf:8.682,49.408751,8.757,49.3862")
				.queryParam("time", "2012-08-14")
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
	public void test_rl5mrrfnvuwo_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and geometry:polygon and length:( .. 100)")
				.queryParam("bboxes", "8.654,49.41744,8.7005,49.3858")
				.queryParam("format", "csv")
				.queryParam("time", "2016-07-29")
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
	public void test_1if11zeug0oj6_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.717987,49.43588,8.726880,49.4101,8.725,49.403,8.704561,49.403252|8.704561,49.403252,8.707,49.43465,8.7138,49.42545,8.706989,49.40519,8.704561,49.403252")
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
	public void test_t4ctiiuolpv6_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.650619,49.409081,8.756,49.38963")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_s4mc6tv2fecj_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-08-06")
				.queryParam("bcircles", "PowpS:8.727,49.415,6|WF:8.72909,49.432,7")
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
	public void test_vbszra00fhid_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"J\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725490,49.4232],[8.7463,49.4293],[8.71830,49.402],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IAPDv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.428],[8.717,49.410],[8.7030,49.414382],[8.704561,49.403252]]]}}]}")
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
	public void test_vf475ohsbfxi_areaDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-11-05")
				.queryParam("bcircles", "J:8.7474,49.40607,354")
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
	public void test_rkwrklq0yau9_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or not area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-08-15")
				.queryParam("bpolys", "8.704561,49.403252,8.71413,49.4282,8.7023,49.420,8.7094,49.435,8.704561,49.403252")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "JY:8.707,49.400,6|c:8.748,49.408,173|H:8.718,49.4391,3")
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
	public void test_vbele7i2aiia_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "pf:8.704561,49.403252,8.718,49.420,8.7279,49.400,8.700,49.425,8.704561,49.403252")
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
	public void test_u7wux75chwz6_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2008-06-10")
				.queryParam("bcircles", "JvE:8.74638,49.429,5")
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
	public void test_urk3tzawwnxv_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.675,49.400982,8.722,49.3842|8.660,49.421,8.7363,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
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
	public void test_vbhg7l57bz8w_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "iNRl:8.696,49.41302,8.7169,49.398")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-11-10")
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
	public void test_qxfzfl6ndsv8_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.687,49.426,8.745873,49.3907|uu:8.6563,49.410,8.741,49.385")
				.queryParam("time", "2011-08-04")
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
	public void test_1iyq2nfplkbw6_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk!=* or geometry:line or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "jk:8.699,49.42467,8.738,49.38954")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-05-31")
				.queryParam("timeout", "95")
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
	public void test_urmc1v9yb2uu_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Vr:8.6937,49.412,8.713,49.3893")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-27")
				.queryParam("timeout", "98")
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
	public void test_skv2al7f54rq_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "dKykL:8.6584,49.4146,8.739,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-05-26")
				.queryParam("timeout", "43")
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
	public void test_qxiro6s05qgl_areaDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-03-03")
				.queryParam("bpolys", "s:8.704561,49.403252,8.735,49.432,8.746,49.4207,8.746,49.435890,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_qe9x4maoakab_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bpolys", "BtO:8.704561,49.403252,8.700,49.419,8.719834,49.417,8.722784,49.4221,8.704561,49.403252|s:8.704561,49.403252,8.723,49.401517,8.700,49.436,8.702,49.4355,8.704561,49.403252|iBj:8.704561,49.403252,8.747805,49.4305,8.7166,49.415,8.747,49.428,8.704561,49.403252")
				.queryParam("bcircles", "ad:8.748,49.4210,2|YS:8.736,49.40013,966821075|TDdKO:8.701,49.4144,85")
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
	public void test_qec66yvwyss7_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "yy:8.673,49.4079,8.740666,49.389")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "64")
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
	public void test_urrxjmkshs9w_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:point")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7252,49.42353,8.7064,49.422,8.705,49.4170,8.704561,49.403252")
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
	public void test_1k1rp49jf71wh_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and length:( .. 100)")
				.queryParam("bboxes", "8.683,49.426,8.7182,49.395")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "76")
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
	public void test_sksc2nvdh7ax_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("timeout", "64")
				.queryParam("bcircles", "cN:8.710,49.4380,9|DTw:8.7259,49.408,9")
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
	public void test_1h82kk9mizfj5_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "WOX:8.704561,49.403252,8.705,49.4080,8.706,49.427,8.737,49.413,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_1jew1qxbtveih_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("time", "2011-04-18")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "wkJ:8.7330,49.439,733")
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
	public void test_tnzj8yuf3dya_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.652,49.40744,8.717,49.385|8.664,49.410801,8.741,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-09-11")
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
	public void test_vey3qmjplohh_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=*")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.732156,49.417,8")
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
	public void test_urv6gow9u8mw_areaDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.694,49.407,8.704410,49.39236|8.658,49.42706,8.736,49.382|8.691,49.4184,8.75391,49.393|8.6667,49.405509,8.7314,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
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
	public void test_1iuvhjjtji5ba_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and type:relation or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "eH:8.704561,49.403252,8.735,49.4155,8.70409,49.4252,8.7106,49.41105,8.704561,49.403252")
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
	public void test_rhdbia12mzxf_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2010-08-25")
				.queryParam("bcircles", "SGn:8.721,49.430,7|ylZ:8.745871,49.427,5")
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
	public void test_qhnuf686fyoy_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "f:8.6932,49.4189,8.716464,49.399|UBuz:8.689,49.4114,8.7462,49.395|sVhoC:8.679,49.4230,8.7351,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("time", "2015-08-22")
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
	public void test_1hbafzzmefzhg_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.69484,49.423,8.705433,49.393|8.671,49.4214,8.7060,49.392")
				.queryParam("format", "csv")
				.queryParam("time", "2011-06-02")
				.queryParam("timeout", "64")
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
	public void test_t4ndwgzd3ofa_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-02")
				.queryParam("bpolys", "Tj:8.704561,49.403252,8.735,49.41324,8.703,49.430728,8.73976,49.407,8.704561,49.403252|kd:8.704561,49.403252,8.735,49.438,8.704,49.41462,8.733,49.408,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_t4a1t65xrko6_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-10-11")
				.queryParam("bpolys", "8.704561,49.403252,8.7248,49.43495,8.729,49.429,8.74647,49.420,8.704561,49.403252")
				.queryParam("timeout", "96")
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
	public void test_vbng53ia8mlf_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("bcircles", "NRet:8.726,49.43292,5119911564|Cu:8.745,49.438,2|dhtu:8.700,49.416,4|Zf:8.712,49.4286,1")
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
	public void test_vbppl7ejyjxd_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and type:way and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-07-10")
				.queryParam("bpolys", "P:8.704561,49.403252,8.711,49.4098,8.7381,49.403,8.749,49.409,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_vbbtxzm853jm_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-12-31")
				.queryParam("bpolys", "cS:8.704561,49.403252,8.749,49.417,8.74702,49.400,8.701,49.420,8.704561,49.403252")
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
	public void test_1k253mgdrbsq8_areaDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"PIxjp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.414],[8.7129,49.409926],[8.715,49.4010],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_r17a54wc3zn7_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,cycleway,service")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-11-22")
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
	public void test_u82x6fmucn5k_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=*")
				.queryParam("bboxes", "LjQG:8.6977,49.417,8.70617,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-09-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"B\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7452,49.40194],[8.7003,49.41098],[8.709706,49.41686],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Rv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707,49.41563],[8.704545,49.4207],[8.726646,49.431],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"nPL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.40488],[8.705,49.410],[8.704446,49.42435],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "RS:8.7294,49.437,9")
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
	public void test_1k22cb429zqy8_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "QW:8.65480,49.40601,8.7399,49.394|yncET:8.657,49.4037,8.7213,49.381|hH:8.672,49.419,8.71236,49.398|F:8.65886,49.4132,8.714170,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
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
	public void test_1jyjakra7goyq_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,path")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("time", "2011-10-27")
				.queryParam("bpolys", "rUP:8.704561,49.403252,8.724,49.411,8.70455,49.431,8.715,49.424,8.704561,49.403252")
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
	public void test_rhaki2lb3dk6_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "crossing,chapel")
				.queryParam("filter", "destination=* and type:way")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-01-05")
				.queryParam("bpolys", "JVc:8.704561,49.403252,8.72373,49.403696,8.70310,49.4102,8.7001,49.4303,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_sknawqtqneci_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,yes,residential")
				.queryParam("bboxes", "AvLTt:8.668,49.418,8.7158,49.387|aH:8.698,49.4146,8.736,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "29")
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
	public void test_u7wtda9wbuwn_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-07-14")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "LNfSR:8.7318,49.4040,35")
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
	public void test_1iusntm1sfxb6_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,apartments")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-05-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"hOU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.419352],[8.706,49.410328],[8.708,49.415],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"EVv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7319,49.4110],[8.705,49.436391],[8.720,49.4039],[8.704561,49.403252]]]}}]}")
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
	public void test_s0ui542sp1et_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,hotel,office")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-01-27")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "vASN:8.727,49.4311,3")
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
	public void test_1iyex7xmm93ch_areaDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,emergency_access_point")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.7300,49.408,8.749,49.413,8.748,49.4048,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_t81cdc5a0zms_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,footway,secondary_link")
				.queryParam("filter", "source:maxspeed!=* and not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "lQbY:8.710,49.423045,1|l:8.737144,49.4235,7|wq:8.7028,49.418,5")
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
	public void test_uvjnu4d5nujl_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"WSFze\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.406],[8.7042,49.403],[8.708,49.4158],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "R:8.7026,49.423,29")
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
	public void test_1hrp9wgjwtm40_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "h:8.69518,49.416,8.7408,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "54")
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
	public void test_1hrdp9myp1ied_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,living_street,tertiary")
				.queryParam("bboxes", "8.6597,49.402,8.722,49.388|8.685,49.4091,8.719,49.380|8.660,49.414,8.751,49.392|8.6684,49.407,8.753,49.3876")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("timeout", "47")
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
	public void test_u7ojzsbn652v_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,garage")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2012-05-01")
				.queryParam("bcircles", "gmxpb:8.724,49.433,935|Cn:8.704,49.436,5|tua:8.723,49.42679,5|GRFFY:8.707,49.430,5211674164")
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
	public void test_ts1xrixskhnl_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.735,49.4247,7")
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
	public void test_t4cat9x6bxgz_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,unclassified")
				.queryParam("bboxes", "DJYhX:8.695,49.4090,8.735,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "30")
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
	public void test_1jenro5tpvrdy_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,house,tower")
				.queryParam("filter", "network!=* or type:node or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "A:8.679504,49.426,8.7225,49.389|g:8.662,49.407,8.725885,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2016-09-17")
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
	public void test_t4ctit3zp7qc_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop_line,primary")
				.queryParam("filter", "oneway!=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-05-15")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "a:8.705,49.406769,5")
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
	public void test_1ibjuikf2ys6r_areaDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,residential,roof")
				.queryParam("bboxes", "8.6570,49.40202,8.741,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-10-24")
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
	public void test_uv95ec6ozeie_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "chapel,unclassified")
				.queryParam("filter", "oneway!=* or not geometry:line")
				.queryParam("bboxes", "TxFxP:8.668,49.404380,8.754,49.385|vdjla:8.670,49.4173,8.751,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-04-24")
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
	public void test_1ib99qj8aqur8_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "commercial,turning_circle,chapel")
				.queryParam("values", "give_way")
				.queryParam("time", "2012-01-24")
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
	public void test_1iun5tqz7t279_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-06-22")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "8.749,49.423,1")
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
	public void test_rl2vrvucyre9_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.695,49.40534,8.7396,49.384|8.6889,49.40109,8.750563,49.3932")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_qe3vc18pd168_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,service")
				.queryParam("bboxes", "Ka:8.659518,49.400967,8.703,49.3946|DyWyh:8.65889,49.42789,8.703280,49.39136")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
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
	public void test_vbbx2agtkrj7_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-04-11")
				.queryParam("bpolys", "b:8.704561,49.403252,8.72607,49.401,8.708,49.43242,8.722,49.4065,8.704561,49.403252|ahKX:8.704561,49.403252,8.73009,49.4031,8.741984,49.4141,8.708,49.422,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_tnzkhizbreci_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,house,demolished")
				.queryParam("bboxes", "E:8.6693,49.409647,8.759,49.391|xdw:8.690,49.405,8.7358,49.3971|taucd:8.673214,49.407,8.720,49.3801")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2016-09-10")
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
	public void test_rl2caceiyn93_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,tertiary,traffic_mirror")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2007-12-10")
				.queryParam("bcircles", "QJ:8.72828,49.405,17")
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
	public void test_ts4qpcjj4c3d_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "university,secondary_link,speed_camera")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-12-28")
				.queryParam("bpolys", "P:8.704561,49.403252,8.747,49.4273,8.723,49.402532,8.718416,49.415,8.704561,49.403252|i:8.704561,49.403252,8.726,49.4146,8.734,49.422,8.7048,49.438,8.704561,49.403252|KU:8.704561,49.403252,8.712,49.405,8.7010,49.404,8.7080,49.428,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_t4idghkc850l_areaDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.671,49.409,8.7067,49.3843")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "41")
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
	public void test_u7u17foa88j4_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,path")
				.queryParam("filter", "smoothness=* or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2012-05-21")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.730,49.4209,2|8.7219,49.403,9|8.742242,49.42282,4|8.726475,49.406488,709751407")
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
	public void test_ts1yx8gle2if_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-12-27")
				.queryParam("timeout", "50")
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
	public void test_skvldpcktxyw_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,track")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-07-25")
				.queryParam("bpolys", "8.704561,49.403252,8.704961,49.404,8.74387,49.421,8.701495,49.4287,8.704561,49.403252|8.704561,49.403252,8.746,49.404,8.7076,49.426,8.713,49.422230,8.704561,49.403252")
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
	public void test_1hbit70cc8q41_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SJu:8.652,49.4167,8.728,49.3945")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-10-25")
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
	public void test_ubu8luogf7sg_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2009-10-10")
				.queryParam("bcircles", "WmA:8.743,49.4142,9|CFctP:8.7113,49.435,5|bxIp:8.704,49.409,66|O:8.737,49.408968,3")
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
	public void test_qxywpgqns4s5_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,platform,turning_circle")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "bE:8.70147,49.426,9|q:8.7306,49.4045,842|uoYDk:8.742,49.4236,1|Er:8.7330,49.437,870107710")
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
	public void test_veym1uep0j06_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,living_street")
				.queryParam("filter", "maxspeed=* or geometry:point")
				.queryParam("bboxes", "h:8.6628,49.404646,8.717,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-04-08")
				.queryParam("timeout", "41")
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
	public void test_qxw4jq2tzsyt_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,give_way,university")
				.queryParam("filter", "maxspeed=* and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-12-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Jx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.436],[8.703,49.413],[8.7322,49.405],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.425],[8.7055,49.412],[8.728,49.4281],[8.704561,49.403252]]]}}]}")
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
	public void test_1hv8rjbt863j7_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.670,49.419,8.758,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "67")
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
	public void test_r1iv3i1dlsms_areaDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,primary,tower")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("bcircles", "H:8.725,49.4184,27")
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
	public void test_qeez4ugob776_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2015-02-05")
				.queryParam("bpolys", "X:8.704561,49.403252,8.715227,49.401,8.749,49.4079,8.7072,49.4378,8.704561,49.403252|uR:8.704561,49.403252,8.734311,49.420437,8.701,49.4125,8.70442,49.4109,8.704561,49.403252|A:8.704561,49.403252,8.706,49.438,8.7434,49.4152,8.714,49.403,8.704561,49.403252")
				.queryParam("bcircles", "o:8.736,49.439,505734864")
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
	public void test_uv6bzkwgt0tf_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-07-19")
				.queryParam("bcircles", "8.735240,49.4151,5")
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
	public void test_t89oh7s1v3nd_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "l:8.704561,49.403252,8.727,49.410,8.7473,49.4309,8.702,49.423,8.704561,49.403252")
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
	public void test_qy4ykcnvlnht_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.690,49.417,8.742,49.39743")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-03-26")
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
	public void test_s4p3nngkiibb_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("time", "2014-04-02")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.724,49.402,8.701180,49.430,8.7076,49.435,8.704561,49.403252|nZGi:8.704561,49.403252,8.714,49.4255,8.706837,49.436,8.7183,49.407135,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_s18ewa9jnpki_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Eq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72559,49.415],[8.710,49.4099],[8.7256,49.410],[8.704561,49.403252]]]}}]}")
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
	public void test_qhhtsstvj1wj_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "O:8.6844,49.402144,8.73047,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-11-08")
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
	public void test_vbhgajqrgokm_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("time", "2011-03-17")
				.queryParam("bcircles", "V:8.74920,49.418,5")
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
	public void test_rh8a9knuv142_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("bpolys", "ZsU:8.704561,49.403252,8.717,49.430,8.704,49.404,8.70416,49.40762,8.704561,49.403252|U:8.704561,49.403252,8.7277,49.4073,8.7001,49.406874,8.717,49.4290,8.704561,49.403252|Uw:8.704561,49.403252,8.727,49.415597,8.708,49.413,8.704546,49.438,8.704561,49.403252")
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
	public void test_1hrawpkzle6gl_areaDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "O:8.6880,49.429,8.73798,49.3966")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
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
	public void test_1iuyqgkj1h1rq_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ruS:8.698050,49.428,8.703,49.395")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-08-06")
				.queryParam("bpolys", "8.704561,49.403252,8.7293,49.409,8.722,49.432,8.704575,49.435,8.704561,49.403252|8.704561,49.403252,8.741,49.404,8.7442,49.43886,8.720,49.43713,8.704561,49.403252|8.704561,49.403252,8.7224,49.408758,8.7432,49.420,8.74578,49.430,8.704561,49.403252")
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
	public void test_u7u2dqjnp4jd_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=*")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.7206,49.4119,6")
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
	public void test_us064yb9isdt_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "G:8.696444,49.4258,8.708,49.383")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-10-01")
				.queryParam("timeout", "37")
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
	public void test_1if12d9nw7rjn_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"oYj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7408,49.4068],[8.738,49.427],[8.707857,49.43135],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.439],[8.720426,49.43218],[8.707,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"mm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.400],[8.7033,49.433631],[8.73267,49.432329],[8.704561,49.403252]]]}}]}")
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
	public void test_1iunnr9xsd36q_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.655,49.414,8.7558,49.390|tQx:8.651,49.409182,8.745,49.393")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "45")
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
	public void test_1iuso79q4rq06_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2011-03-04")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "HV:8.708266,49.415,7")
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
	public void test_1k1tykt5nvwvo_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-04-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"koHas\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.401],[8.70338,49.406],[8.746,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"re\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7439,49.4122],[8.7075,49.435],[8.706907,49.43292],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wnJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70427,49.4125],[8.7365,49.420],[8.72354,49.410946],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_vf46g9bvxv09_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or id:(1 .. 9999)")
				.queryParam("bboxes", "R:8.6595,49.418171,8.719,49.393")
				.queryParam("format", "csv")
				.queryParam("time", "2012-07-09")
				.queryParam("timeout", "22")
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
	public void test_vben9vxciyxw_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.674,49.406,8.723,49.390|8.695,49.41276,8.744,49.393")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "76")
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
	public void test_uv8nek0h59gx_areaDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.724,49.401,3|8.741,49.423,99506751600")
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
	public void test_rhgla1lqunvp_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.683824,49.4230,8.73222,49.382")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2010-07-17")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "YVewJ:8.7057,49.404,4|w:8.701,49.432980,92")
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
	public void test_skpl2xvkbi9f_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and not area:(1.0 .. 1E6)")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "dh:8.7429,49.413095,55")
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
	public void test_1hraxhpjzznmt_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and type:way or length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.427,8.737,49.4284,8.717,49.420,8.704561,49.403252|8.704561,49.403252,8.73657,49.435,8.704577,49.410981,8.709,49.437,8.704561,49.403252|8.704561,49.403252,8.711,49.407,8.7096,49.4274,8.702,49.415,8.704561,49.403252")
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
	public void test_ubrfc5ndl2d1_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=*")
				.queryParam("bboxes", "8.699,49.416,8.705,49.383|8.666343,49.412,8.7208,49.3922|8.682,49.401,8.7205,49.384")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "48")
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
	public void test_1jydao4w9w08p_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "paN:8.692,49.415,8.70872,49.3961|z:8.6514,49.423,8.726,49.398|Q:8.6990,49.4204,8.7519,49.398|Txp:8.6601,49.4006,8.7443,49.387115")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-05-05")
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
	public void test_ubrwvj5vox9e_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "n:8.671,49.4134,8.741,49.393")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "24")
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
	public void test_1iuspg5a0newh_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "N:8.682999,49.40228,8.712,49.387|FDuo:8.697,49.406,8.739,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
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
	public void test_vf1f2e8pjnle_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or geometry:line and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.713,49.40906,142")
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
	public void test_1h7zsshovn3ue_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.702351,49.4112,6")
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
	public void test_s0uj8wuw8hgk_areaGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-07-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xvIH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71759,49.41282],[8.7065,49.4291],[8.7448,49.42497],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"b\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7367,49.4389],[8.7396,49.4302],[8.704,49.4234],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74070,49.426],[8.715,49.413],[8.716610,49.427],[8.704561,49.403252]]]}}]}")
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
	public void test_qxzff1vpz3vp_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6578,49.4047,8.709,49.396")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "json")
				.queryParam("time", "2017-05-23")
				.queryParam("bpolys", "CO:8.704561,49.403252,8.7160,49.425,8.72780,49.43241,8.701020,49.401,8.704561,49.403252|F:8.704561,49.403252,8.721,49.417,8.723922,49.4251,8.7222,49.408,8.704561,49.403252")
				.queryParam("bcircles", "YV:8.707,49.420,3|O:8.727,49.40886,6|A:8.720,49.4258,7")
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
	public void test_1jxzy43xlxicy_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:country!=* or type:relation and length:( .. 100)")
				.queryParam("bboxes", "8.674,49.403,8.74653,49.3802|8.674177,49.407,8.720272,49.3824")
				.queryParam("format", "csv")
				.queryParam("time", "2016-07-04")
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
	public void test_s1jzlpt1sdpg_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "kC:8.671,49.414817,8.722342,49.380|l:8.6906,49.4081,8.742,49.389|CvHpE:8.6659,49.4042,8.7576,49.396")
				.queryParam("format", "json")
				.queryParam("time", "2008-04-11")
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
	public void test_uv5vmk79dbvq_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.679,49.423,8.7133,49.393|8.6707,49.4009,8.7154,49.387")
				.queryParam("format", "json")
				.queryParam("time", "2010-03-12")
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
	public void test_ubjni5k0nayc_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-08-15")
				.queryParam("bpolys", "K:8.704561,49.403252,8.706,49.408,8.747,49.435,8.707257,49.406,8.704561,49.403252")
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
	public void test_1ji4fyvju6mw4_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gK:8.666,49.407,8.700,49.389")
				.queryParam("timeout", "93")
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
	public void test_skpiqded3vw1_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "LWZ:8.69713,49.4033,8.702,49.3902|g:8.67863,49.413394,8.744,49.3928")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("timeout", "65")
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
	public void test_r1ic2gied6qr_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bcircles", "Dv:8.724,49.416,3|x:8.733546,49.400235,87")
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
	public void test_urxfjfby1s2q_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "P:8.680,49.403,8.708,49.384|dxMXX:8.6657,49.424,8.719808,49.399|uzi:8.681,49.420,8.7044,49.381|Isi:8.6894,49.40896,8.713,49.393")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-12-13")
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
	public void test_ubjmno5aep15_areaGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=*")
				.queryParam("bpolys", "8.704561,49.403252,8.72433,49.4226,8.7278,49.422,8.707,49.421808,8.704561,49.403252|8.704561,49.403252,8.720649,49.4053,8.732,49.4287,8.7045,49.426,8.704561,49.403252|8.704561,49.403252,8.732,49.40971,8.7045,49.4269,8.736,49.419959,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_1jyds9vltfxid_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,give_way")
				.queryParam("filter", "destination!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6610,49.41516,8.749,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.733,49.414,8.725,49.4180,8.7020,49.40221,8.704561,49.403252|8.704561,49.403252,8.709,49.400,8.714,49.41232,8.70452,49.4206,8.704561,49.403252")
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
	public void test_1iepz7608o76r_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary,university")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-03-02")
				.queryParam("bcircles", "DA:8.722,49.405,4")
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
	public void test_uv95e7w73lf9_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "PmfPU:8.674,49.401,8.704,49.383|D:8.654102,49.4119,8.731,49.385")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
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
	public void test_t4nera81mu04_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,cycleway,pedestrian")
				.queryParam("bboxes", "g:8.69059,49.4260,8.71230,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-04-21")
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
	public void test_1iykipp9zq62a_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,give_way")
				.queryParam("filter", "landuse!=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("bpolys", "hGJ:8.704561,49.403252,8.7014,49.4099,8.7395,49.413921,8.740,49.4307,8.704561,49.403252|jPTVb:8.704561,49.403252,8.736,49.421080,8.7060,49.4232,8.700,49.405,8.704561,49.403252|JR:8.704561,49.403252,8.7116,49.430,8.7048,49.4051,8.747932,49.43068,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_s4rvd0i1ayjq_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and type:way and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "X:8.726,49.43254,4|Sn:8.712320,49.439,2")
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
	public void test_urhbzcv7rbqq_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,school")
				.queryParam("bboxes", "QQ:8.673,49.421001,8.746,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "yes")
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
	public void test_1iyfhhr7lx3s6_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,yes,university")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-10-01")
				.queryParam("bcircles", "8.7070,49.417,369882279")
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
	public void test_skq3e0if6wkl_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.697,49.419,8.727606,49.39812")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2017-12-21")
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
	public void test_rhm553px9ug5_areaGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.7144,49.429,8.717,49.434,8.703,49.40741,8.704561,49.403252|8.704561,49.403252,8.722,49.401686,8.7450,49.403,8.7452,49.431,8.704561,49.403252|8.704561,49.403252,8.744,49.420686,8.7476,49.424,8.703190,49.413,8.704561,49.403252")
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
	public void test_ubjljy15f2gh_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,crossing,emergency_access_point")
				.queryParam("filter", "addr:housenumber!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "8.704561,49.403252,8.7389,49.4297,8.725,49.4329,8.7287,49.41957,8.704561,49.403252|8.704561,49.403252,8.719,49.408308,8.70489,49.432,8.704899,49.421,8.704561,49.403252")
				.queryParam("bcircles", "apXme:8.7475,49.408,1|T:8.747131,49.4225,9")
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
	public void test_1jy24u5yt3lth_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=*")
				.queryParam("groupByValues", "tertiary")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-03-16")
				.queryParam("bpolys", "a:8.704561,49.403252,8.742,49.416,8.7047,49.416,8.7352,49.41566,8.704561,49.403252|PlfU:8.704561,49.403252,8.709,49.4302,8.704569,49.411,8.734,49.4186,8.704561,49.403252")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "u:8.707,49.40059,98")
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
	public void test_1iyl1hyqffcq9_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,church")
				.queryParam("filter", "foot=* and type:relation or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.726,49.4281,4")
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
	public void test_1ien6pwn7ruwg_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("bpolys", "8.704561,49.403252,8.707929,49.427,8.704,49.421,8.727,49.40716,8.704561,49.403252|8.704561,49.403252,8.7368,49.412,8.716,49.436,8.7090,49.409,8.704561,49.403252|8.704561,49.403252,8.7111,49.402,8.739,49.427,8.702,49.433313,8.704561,49.403252")
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
	public void test_uvgyej7d401d_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,school,secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-03-21")
				.queryParam("bcircles", "Tip:8.727,49.419,7|DNWPf:8.7138,49.4164,5")
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
	public void test_1hr5enna86ofo_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.678,49.416,8.716,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-12-10")
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
	public void test_u82cjami1ysm_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.698360,49.413,8.724,49.39223")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2012-04-20")
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
	public void test_1k1r7yx3zw603_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and geometry:polygon")
				.queryParam("bboxes", "c:8.666,49.410,8.728029,49.391|Am:8.6623,49.4132,8.713409,49.390|CTUt:8.657,49.4279,8.72859,49.381|d:8.6738,49.40200,8.748,49.380019")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "84")
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
	public void test_t84m2qy696xy_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-07-12")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.403,8.715,49.409,8.749,49.413,8.704561,49.403252")
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
	public void test_sl66k5tawlkk_areaGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,civic")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2008-09-09")
				.queryParam("bpolys", "fd:8.704561,49.403252,8.7414,49.4260,8.7043,49.431,8.702123,49.430,8.704561,49.403252|e:8.704561,49.403252,8.721,49.422,8.710,49.405,8.705,49.411,8.704561,49.403252|oI:8.704561,49.403252,8.7118,49.404,8.7290,49.43295,8.729,49.4137,8.704561,49.403252")
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
	public void test_trzop2ezuofr_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=*")
				.queryParam("bboxes", "Tfemt:8.651,49.405237,8.7599,49.394|lsb:8.6968,49.429,8.738,49.38024|FYcn:8.658,49.408,8.753,49.394|aNctM:8.6925,49.416,8.755,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71749,49.43524],[8.7138,49.4163],[8.70458,49.41320],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"hw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7399,49.418],[8.7122,49.4317],[8.701461,49.4022],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "88")
				.queryParam("groupByKeys", "sidewalk,source:maxspeed,tracktype")
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
	public void test_tonyijm6ndd2_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and geometry:polygon")
				.queryParam("format", "geojson")
				.queryParam("timeout", "34")
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
	public void test_skplja8386cx_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=*")
				.queryParam("bboxes", "Qnhxu:8.6560,49.405,8.749,49.398|ojfk:8.69179,49.4108,8.7454,49.382|yF:8.689,49.416,8.7320,49.39206")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-02-20")
				.queryParam("timeout", "41")
				.queryParam("groupByKeys", "network,lanes:backward")
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
	public void test_u7ww3cfw1cv8_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.721732,49.42543,8.73979,49.417,8.732297,49.40376,8.704561,49.403252|8.704561,49.403252,8.715,49.40793,8.7084,49.425,8.71679,49.43587,8.704561,49.403252")
				.queryParam("groupByKeys", "foot,source:maxspeed,turn")
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
	public void test_ubme3y2dnz1s_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* and type:way or not length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "JCs:8.704561,49.403252,8.7119,49.432,8.704,49.4227,8.7045,49.421,8.704561,49.403252|R:8.704561,49.403252,8.716,49.419,8.7085,49.430856,8.74379,49.43519,8.704561,49.403252")
				.queryParam("groupByKeys", "name,addr:country")
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
	public void test_1hb86xj11sth3_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-09-23")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7058,49.421],[8.7061,49.420],[8.7045,49.414],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "33")
				.queryParam("groupByKeys", "addr:postcode,name,highway")
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
	public void test_rhdt3wrzv4mq_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ywABV:8.69725,49.410940,8.749,49.386")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-05-13")
				.queryParam("timeout", "88")
				.queryParam("groupByKeys", "network,oneway")
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
	public void test_rkzkwdro1em0_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gbghI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7209,49.421],[8.722014,49.41665],[8.713,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "53")
				.queryParam("groupByKeys", "oneway,surface")
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
	public void test_qdq0e1dql16e_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2014-03-13")
				.queryParam("bpolys", "8.704561,49.403252,8.732,49.416,8.70647,49.4199,8.700577,49.425527,8.704561,49.403252|8.704561,49.403252,8.70371,49.408,8.718,49.412003,8.7154,49.433294,8.704561,49.403252")
				.queryParam("timeout", "60")
				.queryParam("groupByKeys", "landuse,barrier")
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
	public void test_1h7zspwy3fvas_areaGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2013-11-07")
				.queryParam("bpolys", "kSypF:8.704561,49.403252,8.71112,49.4371,8.731,49.428,8.70478,49.424,8.704561,49.403252|TIuYg:8.704561,49.403252,8.705629,49.419,8.723,49.43921,8.732,49.4220,8.704561,49.403252|B:8.704561,49.403252,8.7029,49.435,8.704,49.408,8.745151,49.4065,8.704561,49.403252")
				.queryParam("groupByKeys", "name,addr:postcode,oneway")
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
	public void test_skv4azaj4fuh_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or not type:way and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.65363,49.421,8.7006,49.399|8.654225,49.41758,8.745,49.385")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-11-02")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.4219,8.723,49.41505,8.7041,49.4244,8.704561,49.403252|8.704561,49.403252,8.73629,49.4169,8.7052,49.422731,8.704948,49.426,8.704561,49.403252|8.704561,49.403252,8.72910,49.4099,8.746,49.417,8.729,49.437,8.704561,49.403252")
				.queryParam("timeout", "86")
				.queryParam("groupByKeys", "turn,building,addr:street")
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
	public void test_qy4ep5y6nzok_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "jGJYv:8.6931,49.4241,8.751,49.38568")
				.queryParam("values", "give_way")
				.queryParam("time", "2017-11-20")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "HV:8.706,49.407,7")
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
	public void test_qhq4qkpnla9c_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "lanes:forward,oneway")
				.queryParam("bcircles", "sJr:8.724,49.40260,1557983996|fAB:8.732651,49.4191,75")
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
	public void test_vb42vnwmrw39_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:line")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-06-20")
				.queryParam("groupByKeys", "surface,barrier")
				.queryParam("bcircles", "h:8.737,49.431,6")
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
	public void test_s1jh7oygfltk_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("time", "2011-12-09")
				.queryParam("bpolys", "8.704561,49.403252,8.73235,49.415,8.7091,49.40979,8.71601,49.4102,8.704561,49.403252|8.704561,49.403252,8.736,49.427,8.739,49.40067,8.703,49.401,8.704561,49.403252|8.704561,49.403252,8.72343,49.40452,8.70403,49.40354,8.7078,49.4266,8.704561,49.403252")
				.queryParam("timeout", "75")
				.queryParam("groupByKeys", "addr:housenumber,surface")
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
	public void test_1jicsggfqczzk_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or length:( .. 100)")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.735,49.429,8.7035,49.435,8.7173,49.4094,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:country,surface")
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
	public void test_uvjq3qcc6pfa_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "30")
				.queryParam("groupByKeys", "turn:lanes,addr:postcode,type")
				.queryParam("bcircles", "Cu:8.7032,49.413,8")
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
	public void test_to2bepvi9s2p_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.689,49.410,8.7367,49.396|8.686,49.4268,8.7342,49.399")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-03-05")
				.queryParam("groupByKeys", "maxspeed,lanes:backward,ref")
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
	public void test_qxoar8mu32ap_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "KtfIE:8.704561,49.403252,8.740,49.429,8.700,49.438,8.7002,49.4314,8.704561,49.403252|A:8.704561,49.403252,8.732220,49.437,8.7400,49.40144,8.704,49.415776,8.704561,49.403252")
				.queryParam("timeout", "91")
				.queryParam("groupByKeys", "addr:city,turn:lanes,network")
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
	public void test_veymwdrq2h5y_areaGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Cu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72241,49.401313],[8.715,49.427],[8.729,49.432],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72099,49.412],[8.7044,49.4127],[8.700,49.42727],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IyYrb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.439],[8.702,49.40382],[8.703,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "oneway,type,addr:city")
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
	public void test_1jew3b5pb8ze8_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and type:node")
				.queryParam("bboxes", "8.667,49.411,8.746,49.384")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "S:8.741,49.40373,20")
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
	public void test_urxed4galaut_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "residential")
				.queryParam("time", "2008-12-05")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706,49.42511],[8.730550,49.431],[8.704,49.432786],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "aE:8.711,49.4249,3")
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
	public void test_1iexr19n8kjlg_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-02-03")
				.queryParam("bcircles", "8.72022,49.426,506")
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
	public void test_1hrj9zjw47n1h_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,hotel")
				.queryParam("filter", "addr:city=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-04-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7282,49.400],[8.702,49.4307],[8.746,49.4008],[8.704561,49.403252]]]}}]}")
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
	public void test_vbhgogww28o6_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.713,49.43015,8.7296,49.425,8.706,49.4064,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_qdt9pb2y3n79_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tower,give_way")
				.queryParam("filter", "foot!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-01-01")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "O:8.7070,49.408,44")
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
	public void test_1h821e2mbrrcl_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,street_lamp,school")
				.queryParam("filter", "surface!=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "gcGw:8.704561,49.403252,8.7024,49.426719,8.742,49.403,8.733,49.4158,8.704561,49.403252")
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
	public void test_s0ui2hct6mut_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.684734,49.4224,8.737,49.382|8.69705,49.415,8.711,49.3880|8.6996,49.415,8.742,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "24")
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
	public void test_1ji4ylnre51t2_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,station")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("time", "2013-03-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ko\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.418314],[8.7402,49.433],[8.702,49.420786],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "79")
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
	public void test_rhda0isgmuzp_areaGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,garage,synagogue")
				.queryParam("filter", "destination=*")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-04-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"a\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7180,49.4388],[8.70114,49.40661],[8.722,49.416],[8.704561,49.403252]]]}}]}")
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
	public void test_1jeaf48r62a1w_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2012-06-26")
				.queryParam("bpolys", "Eb:8.704561,49.403252,8.7329,49.401,8.7401,49.402,8.70456,49.4011,8.704561,49.403252|b:8.704561,49.403252,8.7494,49.41058,8.7471,49.404,8.7225,49.429,8.704561,49.403252|v:8.704561,49.403252,8.722700,49.405,8.727,49.417,8.7431,49.405,8.704561,49.403252")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "FZCQa:8.724,49.410,1")
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
	public void test_1hv39joxtkqia_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2009-07-05")
				.queryParam("bcircles", "Y:8.720,49.437,8")
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
	public void test_1h7lgdp438lro_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hotel,traffic_mirror")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bpolys", "np:8.704561,49.403252,8.7005,49.412976,8.707,49.41327,8.7094,49.41252,8.704561,49.403252|HMj:8.704561,49.403252,8.704,49.4070,8.70212,49.433,8.7045,49.432,8.704561,49.403252")
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
	public void test_trwv1m4vyou1_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,pedestrian")
				.queryParam("filter", "building=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.690,49.421,8.716,49.382")
				.queryParam("groupByKey", "highway")
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
	public void test_urrwg1zovrcj_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,unclassified,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2009-02-27")
				.queryParam("bpolys", "8.704561,49.403252,8.7325,49.430884,8.7372,49.43543,8.728,49.40894,8.704561,49.403252|8.704561,49.403252,8.700880,49.4324,8.704,49.4061,8.705,49.432,8.704561,49.403252|8.704561,49.403252,8.7106,49.422,8.70162,49.433,8.703,49.411,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_1ib99f2hio1ti_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gHjBb:8.67160,49.407,8.7253,49.3846|a:8.65465,49.4231,8.742,49.39218|p:8.6826,49.427,8.759,49.3984|o:8.6661,49.4194,8.7519,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "80")
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
	public void test_1ji4imcnyb9t1_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-11-18")
				.queryParam("bpolys", "f:8.704561,49.403252,8.710,49.414149,8.733486,49.437,8.700,49.4032,8.704561,49.403252")
				.queryParam("timeout", "27")
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
	public void test_trqty8bl1ch1_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,public,living_street")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "zwmrP:8.741,49.426,65")
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
	public void test_1iyns12x9a4ag_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path,footway,traffic_signals")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "oj:8.704561,49.403252,8.733457,49.4318,8.740,49.4051,8.745,49.405,8.704561,49.403252")
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
	public void test_trrdfvofatro_areaGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,emergency_access_point,crossing")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-09-27")
				.queryParam("bcircles", "8.711,49.43504,464")
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
	public void test_qdyb01hytboi_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("bboxes", "8.664591,49.4151,8.7473,49.3834")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-03-18")
				.queryParam("bpolys", "8.704561,49.403252,8.714,49.427,8.70871,49.4309,8.70457,49.434,8.704561,49.403252|8.704561,49.403252,8.744,49.438,8.707,49.408,8.736,49.400,8.704561,49.403252|8.704561,49.403252,8.7200,49.42711,8.70459,49.434,8.704442,49.4121,8.704561,49.403252")
				.queryParam("bcircles", "8.709,49.422,6")
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
	public void test_s1jg42ffms12_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=*")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "c:8.704561,49.403252,8.728,49.413,8.70289,49.4136,8.747,49.436739,8.704561,49.403252|fkQ:8.704561,49.403252,8.745,49.4271,8.724758,49.403,8.718,49.438,8.704561,49.403252|ag:8.704561,49.403252,8.734,49.4023,8.749,49.43032,8.7400,49.4191,8.704561,49.403252")
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
	public void test_s0uk3dkqx8aa_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2017-07-03")
				.queryParam("bcircles", "8.731,49.414,111|8.711722,49.4152,543840647|8.740,49.437,6")
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
	public void test_urumkyfo669d_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XHj:8.675,49.412,8.758,49.3931")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-09-19")
				.queryParam("timeout", "55")
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
	public void test_1hrp9g475k3lj_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
				.queryParam("time", "2017-03-27")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "GrAM:8.7141,49.4201,98")
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
	public void test_1jeky9r2jfhpf_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.73823,49.417,6|8.710,49.422,5")
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
	public void test_1jy4xe1z58ilv_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "8.702471,49.4138,8")
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
	public void test_1jidababx1pa0_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "H:8.688,49.42139,8.751,49.398")
				.queryParam("showMetadata", "yes")
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
	public void test_sl665svhi1k3_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "x:8.650,49.42065,8.755,49.387")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-09-06")
				.queryParam("timeout", "41")
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
	public void test_1ji7rxm1a2at3_areaGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "NPLiv:8.725,49.4326,8")
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
	public void test_vb3l0xmcpzjq_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "NZ:8.66220,49.402,8.743,49.384")
				.queryParam("values", "living_street")
				.queryParam("bpolys", "h:8.704561,49.403252,8.74304,49.420,8.737,49.4139,8.74069,49.405,8.704561,49.403252")
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
	public void test_1ib0elvyfjdix_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Z:8.667,49.411,8.7410,49.38343|nMfLc:8.671,49.408,8.709,49.3801")
				.queryParam("format", "json")
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
	public void test_u7raa8f2d3qo_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "pP:8.678,49.4155,8.737923,49.383|jBgt:8.681,49.41631,8.703,49.380")
				.queryParam("format", "json")
				.queryParam("time", "2013-01-08")
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
	public void test_t4hshgekhoab_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-01-04")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "otZb:8.720,49.420,32")
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
	public void test_1iyi9nea3377a_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or type:node")
				.queryParam("time", "2008-01-03")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "pyKDE:8.716,49.403,6")
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
	public void test_1iukfzus5ajhx_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2011-05-27")
				.queryParam("bcircles", "fG:8.743,49.429,4|mvQz:8.70188,49.4361,9")
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
	public void test_u8dithmgnioy_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=*")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-01-30")
				.queryParam("bcircles", "KGSJL:8.7039,49.412,33")
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
	public void test_1h7fwd3psaaly_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bwHr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.405269],[8.7031,49.43050],[8.725,49.429],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"PVx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.41350],[8.739,49.40711],[8.744,49.400106],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7326,49.42451],[8.7389,49.416],[8.720,49.4012],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "53")
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
	public void test_vevw862gkm76_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* and geometry:point and length:( .. 100)")
				.queryParam("time", "2017-08-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"dukDE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.401168],[8.709601,49.426],[8.704817,49.4006],[8.704561,49.403252]]]}}]}")
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
	public void test_t86vxlxgkaqr_areaGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or not geometry:line")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.71167,49.404571,8.705,49.416,8.741,49.4344,8.704561,49.403252")
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
	public void test_rhdulgvuedyv_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.70775,49.4040,8.744,49.406,8.700,49.423349,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
				.queryParam("bcircles", "r:8.709,49.4214,7|O:8.7129,49.4064,4")
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
	public void test_t4hv4xti4svl_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=* or not length:( .. 100)")
				.queryParam("bboxes", "bJdU:8.68493,49.427,8.700533,49.3801|YAcb:8.696,49.40126,8.754,49.3977|n:8.689,49.4225,8.701,49.3821|eMli:8.663,49.405,8.7210,49.380917")
				.queryParam("types2", "line,polygon,")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-11-19")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "74")
				.queryParam("values2", "primary_link")
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
	public void test_toifcphji983_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* or geometry:point")
				.queryParam("bboxes", "P:8.651,49.410909,8.723,49.399|m:8.664916,49.426,8.758,49.385|dqo:8.69312,49.424,8.710276,49.387")
				.queryParam("format", "geojson")
				.queryParam("timeout", "93")
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
	public void test_vbnhax095u7q_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "mVjk:8.676,49.416,8.722,49.383")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "93")
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
	public void test_trz6rpdisp5w_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6669,49.410,8.7082,49.381|8.689,49.421854,8.7573,49.3832")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "secondary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-09-09")
				.queryParam("timeout", "42")
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
	public void test_1ji77o6n3h5q1_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or type:relation and length:( .. 100)")
				.queryParam("types2", "node,way,")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* or id:(1 .. 9999)")
				.queryParam("time", "2010-03-08")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary_link")
				.queryParam("bcircles", "L:8.715,49.435,46")
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
	public void test_t4q5abodrlnq_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-05-09")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UUC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7202,49.413],[8.7006,49.439211],[8.7093,49.433],[8.704561,49.403252]]]}}]}")
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
	public void test_1jiajpvm1ixk6_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.671,49.422,8.7304,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "lanes:backward=* and geometry:line and not length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "69")
				.queryParam("values2", "emergency_access_point")
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
	public void test_u7u3jjz6l6wj_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("types2", "other")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-06-17")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "T:8.708,49.4118,6|YRXgz:8.721,49.4042,9029590417|obus:8.713,49.4137,4")
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
	public void test_r17bms57r5tk_areaRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* or length:( .. 100)")
				.queryParam("bboxes", "8.655,49.420,8.731803,49.395|8.693,49.4039,8.740,49.39762|8.656,49.419,8.7240,49.391|8.680,49.405491,8.701,49.395626")
				.queryParam("types2", "point,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
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
	public void test_ublw3o1twns6_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "oneway!=* or not type:node or not area:(1.0 .. 1E6)")
				.queryParam("time", "2011-09-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"SGPao\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7209,49.4201],[8.70693,49.437638],[8.7045,49.40155],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "22")
				.queryParam("values2", "give_way")
				.queryParam("bcircles", "kQ:8.735,49.424820,40|Q:8.708,49.43907,9|HsudJ:8.7114,49.414,4|kmJE:8.72208,49.412,7")
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
	public void test_r1l6466p5zjn_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,other")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "bkwfr:8.7340,49.43182,92|zY:8.72429,49.404,3")
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
	public void test_s4xfahf0qq1v_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.677,49.409,8.718,49.386")
				.queryParam("types2", "node,")
				.queryParam("filter2", "smoothness=* or geometry:polygon or id:(1 .. 9999)")
				.queryParam("time", "2009-09-12")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
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
	public void test_vf46rx8z3f52_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-01-10")
				.queryParam("bpolys", "8.704561,49.403252,8.731,49.4022,8.723,49.418,8.702,49.423,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "39")
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
	public void test_1h7gd71q4itkg_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,line,other")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-05-01")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
				.queryParam("bcircles", "8.735364,49.4019,998")
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
	public void test_qxyud46dc6sm_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "YAZ:8.652579,49.408,8.734,49.3968|lY:8.6824,49.407,8.753,49.391")
				.queryParam("types2", "other")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "46")
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
	public void test_rhdt1e1mulgx_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.69491,49.427,8.758,49.389")
				.queryParam("format", "csv")
				.queryParam("filter2", "ref!=* and type:relation and not id:(1 .. 9999)")
				.queryParam("timeout", "20")
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
	public void test_1ibjuwvedha2b_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.688681,49.42381,8.720,49.386")
				.queryParam("types2", "point,polygon,")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-10-15")
				.queryParam("timeout", "82")
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
	public void test_qdvkbqk47q05_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "X:8.663439,49.406,8.746,49.389|F:8.675,49.423,8.726,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
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
	public void test_1hv5g7bsahlbs_areaRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway and area:(1.0 .. 1E6)")
				.queryParam("types2", "line,other")
				.queryParam("bpolys", "wfHU:8.704561,49.403252,8.746130,49.4323,8.702,49.434,8.7044,49.435,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_s1jzlnv4qv5c_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:point and id:(1 .. 9999)")
				.queryParam("bboxes", "c:8.6932,49.4115,8.754,49.385|Lk:8.6867,49.416831,8.7410,49.381|G:8.655,49.403,8.73636,49.392553|WSFrY:8.681,49.400,8.7153,49.388823")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("time", "2017-05-22")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "63")
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
	public void test_1h7zrm8tddagh_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "maxspeed!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2013-06-30")
				.queryParam("bpolys", "MA:8.704561,49.403252,8.73746,49.425752,8.705007,49.4365,8.72902,49.408,8.704561,49.403252|y:8.704561,49.403252,8.706,49.401,8.72986,49.430,8.70464,49.4088,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_rl2uoh572erc_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or length:( .. 100)")
				.queryParam("types2", "relation")
				.queryParam("time", "2011-02-26")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.719,49.404,9|8.72914,49.4044,9|8.708,49.411215,4")
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
	public void test_s4mbhmlw4gu0_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=*")
				.queryParam("types2", "point,line,other")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot!=* or type:node or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "23")
				.queryParam("values2", "secondary_link")
				.queryParam("bcircles", "8.73663,49.413034,86")
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
	public void test_urpmj4ejoaif_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "WYX:8.704561,49.403252,8.733,49.4345,8.700,49.43280,8.733,49.427,8.704561,49.403252|Fr:8.704561,49.403252,8.718,49.406,8.702,49.421,8.7154,49.426,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "66")
				.queryParam("values2", "cycleway")
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
	public void test_1hblhgu2p4oq8_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7241,49.424],[8.740612,49.429226],[8.734,49.423],[8.704561,49.403252]]]}}]}")
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
	public void test_t4q4wig1mqsx_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* or id:(1 .. 9999)")
				.queryParam("types2", "way,relation")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "bicycle!=* and id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"r\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.4216],[8.71075,49.418],[8.7068,49.438],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "71")
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
	public void test_s4ru99pav0hl_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2011-08-31")
				.queryParam("bpolys", "n:8.704561,49.403252,8.730,49.409,8.749,49.404723,8.7164,49.4005,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary_link")
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
	public void test_1hrjpw8nrxovs_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "turn:lanes=* and geometry:point or not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "eMNud:8.704561,49.403252,8.721,49.413,8.711,49.432,8.704479,49.423,8.704561,49.403252")
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
	public void test_1h7rhe00efbqq_areaRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and not id:(1 .. 9999)")
				.queryParam("types2", "node,relation")
				.queryParam("bpolys", "nxJsP:8.704561,49.403252,8.725,49.43293,8.737,49.430,8.746620,49.40466,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary")
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
	public void test_u7u4eawkz510_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or not length:( .. 100)")
				.queryParam("bboxes", "Gij:8.693373,49.419679,8.757,49.380|ffEzv:8.69671,49.4249,8.756403,49.394")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "lit=* or id:(1 .. 9999)")
				.queryParam("time", "2018-04-15")
				.queryParam("bpolys", "Upi:8.704561,49.403252,8.743,49.428,8.7149,49.43829,8.74676,49.434,8.704561,49.403252|B:8.704561,49.403252,8.73133,49.4171,8.706,49.406,8.7187,49.410,8.704561,49.403252")
				.queryParam("timeout", "54")
				.queryParam("values2", "primary_link")
				.queryParam("bcircles", "8.709,49.431539,4")
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
	public void test_1je9xw3qntm41_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.40399,8.706473,49.43466,8.70515,49.4073,8.704561,49.403252")
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
	public void test_qe3w1mnb4die_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* and id:(1 .. 9999)")
				.queryParam("bboxes", "Q:8.676,49.420,8.711,49.399")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "type=* and type:node")
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
	public void test_1iv1jssoku88m_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:way or length:( .. 100)")
				.queryParam("time", "2017-12-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FzcyD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.424004],[8.703,49.420],[8.709,49.4028],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "84")
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
	public void test_1iv6jjgkpz0og_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("filter2", "addr:city=* and type:relation and not id:(1 .. 9999)")
				.queryParam("time", "2017-09-06")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "crossing")
				.queryParam("bcircles", "hx:8.732,49.412,5|Ly:8.7444,49.405,78")
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
	public void test_to4mfntzsoja_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("filter2", "addr:street!=* or type:way or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "33")
				.queryParam("values2", "street_lamp")
				.queryParam("bcircles", "8.720403,49.402,59")
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
	public void test_1h7lfzhpzsl68_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "TX:8.677,49.401,8.758255,49.382|T:8.664,49.402,8.749,49.3913|X:8.65758,49.404601,8.730,49.397|niULF:8.667209,49.4157,8.746,49.394084")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
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
	public void test_qe3tp0kmokds_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "hm:8.699574,49.40846,8.71215,49.3833")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "highway=* or id:(1 .. 9999)")
				.queryParam("time", "2012-12-22")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "37")
				.queryParam("values2", "track")
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
	public void test_soem9bkmapnl_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("filter2", "lanes!=* or type:node or length:( .. 100)")
				.queryParam("bpolys", "G:8.704561,49.403252,8.7327,49.434,8.7041,49.4077,8.707,49.4203,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "53")
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
	public void test_1iuvzgoksvjoj_areaRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "c:8.690,49.40232,8.7593,49.397")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "source:maxspeed=* and not length:( .. 100)")
				.queryParam("time", "2010-07-05")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "25")
				.queryParam("values2", "footway")
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
	public void test_1jy24wr16pobm_count() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or not type:node or not id:(1 .. 9999)")
				.queryParam("bboxes", "f:8.659,49.407,8.713,49.3979")
				.queryParam("format", "json")
				.queryParam("time", "2012-03-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"B\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.4339],[8.716,49.404],[8.7139,49.4276],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fEgiF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.413],[8.7021,49.423],[8.704561,49.403261],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7006,49.4065],[8.713543,49.418],[8.7026,49.4284],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7ftmzivc6k5_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-02-26")
				.queryParam("bpolys", "DkfS:8.704561,49.403252,8.73411,49.428,8.71289,49.4302,8.70609,49.4144,8.704561,49.403252|E:8.704561,49.403252,8.737,49.402,8.7045,49.419,8.7336,49.40748,8.704561,49.403252|B:8.704561,49.403252,8.741,49.413543,8.747,49.418725,8.7467,49.426742,8.704561,49.403252")
				.queryParam("timeout", "71")
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
	public void test_t4kkkf4sbdpv_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "oDM:8.68655,49.407,8.716523,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-02-22")
				.queryParam("timeout", "92")
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
	public void test_vbmwn88jnzad_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* and geometry:line")
				.queryParam("bboxes", "Tq:8.694,49.417,8.748,49.399")
				.queryParam("format", "csv")
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
	public void test_qxr2iw6m1gl2_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"sttJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.426],[8.719,49.416],[8.704594,49.4103],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_1iv6lvsrqmjqb_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2013-10-27")
				.queryParam("bcircles", "8.710,49.40355,9|8.704,49.4309,75")
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
	public void test_qxqldralkugg_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-03-12")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "8.7116,49.410,118|8.7111,49.40399,55|8.744,49.42510,4|8.725,49.411,940")
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
	public void test_skkict4aygde_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.408,8.730,49.4306,8.7003,49.432906,8.704561,49.403252|8.704561,49.403252,8.7151,49.427288,8.709,49.416,8.727334,49.4329,8.704561,49.403252|8.704561,49.403252,8.703,49.4027,8.70456,49.4216,8.700072,49.420,8.704561,49.403252")
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
	public void test_rhr6g5xgvw4h_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.74567,49.433,8.7008,49.4095,8.734,49.43926,8.704561,49.403252|8.704561,49.403252,8.749,49.425,8.706,49.431,8.706,49.406,8.704561,49.403252")
				.queryParam("timeout", "81")
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
	public void test_1ji79m9tt0gu0_count() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "58")
				.queryParam("bcircles", "k:8.72955,49.408370,1|Xt:8.738,49.400,205")
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
	public void test_vevvfxzhhile_count1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("time", "2009-04-29")
				.queryParam("bpolys", "8.704561,49.403252,8.708588,49.4232,8.704,49.429,8.7205,49.412,8.704561,49.403252|8.704561,49.403252,8.740651,49.401,8.709,49.427,8.704,49.400,8.704561,49.403252|8.704561,49.403252,8.719407,49.42945,8.7084,49.432506,8.7343,49.425708,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_vb3jv07nx0s6_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and type:way or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "n:8.71607,49.423,3")
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
	public void test_rkxaa4xe6kvq_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wmiDs:8.6684,49.402,8.705,49.3974")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("time", "2016-10-13")
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
	public void test_1jeadvqo2ekhe_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-08-09")
				.queryParam("bcircles", "o:8.747,49.405716,73|C:8.711,49.409585,1")
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
	public void test_1ibesi8nei1k3_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* and not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "8.7343,49.40442,4")
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
	public void test_1iukg08jz3sc3_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=*")
				.queryParam("bboxes", "8.6965,49.4132,8.755,49.396")
				.queryParam("format", "json")
				.queryParam("timeout", "89")
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
	public void test_t4kmwrb915d2_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.746219,49.425,8.704566,49.4363,8.720434,49.4273,8.704561,49.403252|8.704561,49.403252,8.746,49.43341,8.705,49.4211,8.73039,49.423,8.704561,49.403252|8.704561,49.403252,8.732,49.423,8.712069,49.426946,8.7431,49.439,8.704561,49.403252")
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
	public void test_u7wujfifzvhx_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "z:8.734,49.4045,37")
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
	public void test_qdvha61odq3n_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("bpolys", "SLai:8.704561,49.403252,8.721,49.4117,8.704702,49.40727,8.70449,49.405,8.704561,49.403252|PbtAo:8.704561,49.403252,8.711,49.4338,8.7132,49.416499,8.704,49.4205,8.704561,49.403252|DDFq:8.704561,49.403252,8.7453,49.411,8.737,49.412066,8.744,49.4118,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_ure34uwwrxo6_count1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "N:8.659,49.41321,8.724,49.38629|GneUF:8.6812,49.426,8.700,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "53")
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
	public void test_1jewkgqc4ekit_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* and id:(1 .. 9999)")
				.queryParam("bboxes", "e:8.65842,49.413597,8.70004,49.380|dqk:8.69477,49.422,8.717959,49.393|UmY:8.686,49.414658,8.708025,49.394")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-06-10")
				.queryParam("bpolys", "lx:8.704561,49.403252,8.705,49.4141,8.74668,49.4345,8.725,49.402,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_u7ww3kc0dd0w_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "T:8.7357,49.425,4")
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
	public void test_vbemk8h7u2ph_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and geometry:polygon and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "rC:8.7407,49.40599,5|dU:8.71002,49.423,1|jWg:8.744,49.415523,1|q:8.70512,49.425,581")
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
	public void test_1jyouzbry5qno_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "a:8.6956,49.418,8.73328,49.38663")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("timeout", "20")
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
	public void test_1hrjadl0mung2_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "m:8.694,49.4231,8.7413,49.390")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-01-13")
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
	public void test_1iun6ltjhbmg4_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "g:8.699,49.428,8.7555,49.384|o:8.656,49.4130,8.718,49.391|N:8.697,49.41388,8.716,49.386")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-09-08")
				.queryParam("timeout", "92")
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
	public void test_rhugjdwpvink_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "QCe:8.72388,49.43597,10")
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
	public void test_1iepfps4ysq42_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "vKqTS:8.701,49.404,4")
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
	public void test_t8cfxrieqm2a_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2010-02-06")
				.queryParam("bcircles", "IBsym:8.713,49.422,2|W:8.738,49.420797,239|ubmTa:8.7067,49.4314,39|R:8.7457,49.438,17890110682")
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
	public void test_t4kkkgrbwbax_countDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* and length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-01-06")
				.queryParam("bcircles", "8.7446,49.42041,28|8.7045,49.4278,3|8.707,49.423,5|8.704252,49.401835,88")
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
	public void test_qe9c36anqzar_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and geometry:point or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"tb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71964,49.4199],[8.745,49.40273],[8.718,49.401],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "40")
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
	public void test_qxwlrfcl154j_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.68321,49.41831,8.711094,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "41")
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
	public void test_s18brvg9zz8x_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-06-24")
				.queryParam("bcircles", "8.710,49.430,97|8.7161,49.428,224")
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
	public void test_rl52ie0kh8bq_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or not geometry:line and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2017-08-11")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "XwDdm:8.72845,49.43506,7|w:8.7329,49.4016,6|l:8.7329,49.40409,364422284|N:8.716,49.431633,243235470")
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
	public void test_u8dypyem8pyd_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "ygJ:8.676,49.405,8.7284,49.389|GW:8.663,49.412,8.711,49.397")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-10-08")
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
	public void test_t81tx1wo60kl_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "kR:8.704561,49.403252,8.738,49.409635,8.7081,49.418,8.70391,49.4316,8.704561,49.403252|bgA:8.704561,49.403252,8.737,49.421956,8.717,49.4076,8.736,49.420,8.704561,49.403252")
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
	public void test_s1efo11ly5gy_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "RT:8.659,49.41990,8.7095,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("timeout", "66")
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
	public void test_vevv20rcyxcy_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("time", "2009-11-23")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "suEIa:8.7253,49.4032,47|CHKS:8.7196,49.4262,9")
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
	public void test_tnz23rytrqsm_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.4264,8.743,49.4373,8.704,49.409865,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_t4yyxtg3bi9k_countDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or geometry:line")
				.queryParam("bboxes", "8.699,49.4272,8.745960,49.392")
				.queryParam("showMetadata", "true")
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
	public void test_sl3get8jnmep_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* or area:(1.0 .. 1E6)")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.7264,49.401,7")
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
	public void test_1iauuzt3y39dg_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "iH:8.676,49.408,8.748,49.380|DzhMA:8.655,49.405,8.719,49.382")
				.queryParam("keys", "highway")
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
	public void test_s1b5w1itekad_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("time", "2012-06-12")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "pkqg:8.72829,49.407123,81")
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
	public void test_1jy5hnrm95n4y_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-06-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Chpp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746228,49.407],[8.724,49.437],[8.70723,49.421],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"F\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736881,49.4277],[8.74161,49.4030],[8.7311,49.4021],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "46")
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
	public void test_t4swomjay7ug_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-04")
				.queryParam("bcircles", "Fs:8.707639,49.432,7")
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
	public void test_s0ujb7cx3w3d_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SpZR:8.695723,49.400,8.75925,49.3910")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("timeout", "58")
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
	public void test_1hrgza4aq2ng3_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "wUmpA:8.704561,49.403252,8.742,49.4281,8.737,49.41859,8.703,49.433,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_s4unijaubkmx_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or not id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "P:8.706,49.4056,7|UvI:8.70552,49.433,8|IziNG:8.71941,49.415,6|hl:8.7412,49.407,285595884615")
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
	public void test_1hr5f3wx3g10y_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* or geometry:polygon and id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-11-28")
				.queryParam("bcircles", "8.721556,49.4271,9")
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
	public void test_1jy7os4ye0shk_countDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.6901,49.4049,8.717,49.3957")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("time", "2014-08-14")
				.queryParam("timeout", "77")
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
	public void test_urmd7y8f84s2_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "N:8.656,49.428,8.73259,49.395028")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-08-16")
				.queryParam("bpolys", "8.704561,49.403252,8.725,49.43323,8.722,49.425639,8.704392,49.4056,8.704561,49.403252")
				.queryParam("bcircles", "8.737,49.40875,5")
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
	public void test_1hbdq0eyso1ut_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "w:8.689,49.404,8.749,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("time", "2016-07-15")
				.queryParam("timeout", "55")
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
	public void test_sok5vjoc8xgm_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* and length:( .. 100)")
				.queryParam("bboxes", "Wl:8.69302,49.4239,8.740656,49.389|WnZPE:8.677,49.4054,8.73156,49.391")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-03-05")
				.queryParam("timeout", "74")
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
	public void test_to7un0qvu6ht_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:line or not id:(1 .. 9999)")
				.queryParam("bboxes", "Ec:8.675,49.40572,8.75845,49.391")
				.queryParam("showMetadata", "false")
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
	public void test_t4syp8v7isds_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gpp:8.664097,49.42687,8.7579,49.392")
				.queryParam("format", "csv")
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
	public void test_rhje58644cx0_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-25")
				.queryParam("bpolys", "Nuamq:8.704561,49.403252,8.70307,49.431390,8.7251,49.428064,8.733,49.414,8.704561,49.403252|F:8.704561,49.403252,8.7265,49.4283,8.718,49.424,8.709,49.436,8.704561,49.403252")
				.queryParam("timeout", "76")
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
	public void test_toien80g6v5e_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2018-01-12")
				.queryParam("bcircles", "wyssl:8.718,49.429148,8")
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
	public void test_r17aiw4tfcdg_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "cJPHZ:8.704561,49.403252,8.7169,49.435,8.715,49.403930,8.741,49.416,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_vevviqjubar9_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.692,49.412,8.7552,49.381|8.68624,49.425,8.7112,49.38660|8.690,49.41250,8.732338,49.3841|8.6756,49.429,8.751,49.3957")
				.queryParam("format", "geojson")
				.queryParam("timeout", "27")
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
	public void test_1jxzy3qgnh9ie_countDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "YibRG:8.655,49.423,8.7123,49.398|s:8.676,49.4180,8.733,49.386156|tMl:8.6823,49.4048,8.706,49.3951")
				.queryParam("format", "csv")
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
	public void test_ts1w7guhua0m_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,demolished")
				.queryParam("filter", "addr:street!=* or geometry:line")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("bpolys", "r:8.704561,49.403252,8.71513,49.416,8.7049,49.438,8.702954,49.402,8.704561,49.403252")
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
	public void test_s13bs9mq4gu1_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2009-03-19")
				.queryParam("bpolys", "8.704561,49.403252,8.74737,49.43325,8.7335,49.400749,8.708,49.418,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_ubrehas57dr9_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "8.729,49.414,9")
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
	public void test_1k1r79f8935mc_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes")
				.queryParam("filter", "addr:housenumber=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-10-11")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"aMuy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7312,49.4011],[8.707124,49.437764],[8.71706,49.43784],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "35")
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
	public void test_rhb2i4b2oca9_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hotel,primary")
				.queryParam("bboxes", "QC:8.6696,49.4239,8.733956,49.390|txzaK:8.6887,49.427,8.718,49.3830|F:8.694,49.41673,8.709547,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-03-01")
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
	public void test_qhkkc8hmsbav_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle,commercial,civic")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-03-08")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "t:8.708,49.436,20")
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
	public void test_qecncc278dic_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:line")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2008-03-01")
				.queryParam("bpolys", "qE:8.704561,49.403252,8.706219,49.417,8.707,49.4105,8.742,49.407,8.704561,49.403252|CGxP:8.704561,49.403252,8.721,49.412,8.701,49.417,8.730,49.4153,8.704561,49.403252|a:8.704561,49.403252,8.7083,49.427,8.748,49.435209,8.704,49.401346,8.704561,49.403252")
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
	public void test_1ibh16jswkkf6_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* and geometry:point or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-01-03")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "iU:8.74443,49.4026,4|N:8.7127,49.403,4|VWEY:8.712,49.432,7|vU:8.707,49.4056,6")
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
	public void test_ublumabo8m5x_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tertiary")
				.queryParam("bboxes", "jG:8.6523,49.42438,8.7486,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
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
	public void test_r1iwbym5bd5t_countDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,residential")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2012-09-27")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "8.703,49.432,596")
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
	public void test_urxfznbfm2pj_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2007-12-02")
				.queryParam("bpolys", "b:8.704561,49.403252,8.744,49.424,8.746,49.403,8.7272,49.42852,8.704561,49.403252")
				.queryParam("bcircles", "8.721,49.439,47|8.73009,49.4204,7")
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
	public void test_uve7q7y8n3vn_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "living_street,tower,synagogue")
				.queryParam("bboxes", "8.6778,49.415754,8.702,49.395")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "xr:8.704561,49.403252,8.7235,49.418732,8.7220,49.405,8.701,49.438,8.704561,49.403252")
				.queryParam("timeout", "100")
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
	public void test_t4yze3f5njn6_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,tower")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-06-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"GW\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.4054],[8.7164,49.415],[8.73419,49.4078],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "95")
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
	public void test_vbhenn1mrgvp_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,steps")
				.queryParam("bboxes", "u:8.698,49.402,8.720,49.388")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "61")
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
	public void test_1jxzdj1wztkrn_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.740089,49.418,30")
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
	public void test_rhow7keg4gtx_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,synagogue")
				.queryParam("filter", "surface!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-03-20")
				.queryParam("bpolys", "h:8.704561,49.403252,8.736,49.438,8.730,49.4034,8.738,49.414,8.704561,49.403252|C:8.704561,49.403252,8.724,49.437,8.7045,49.4199,8.709863,49.429,8.704561,49.403252")
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
	public void test_u88h4e9zx3cm_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "YfVh:8.661,49.407,8.7440,49.391|kBSy:8.65035,49.4074,8.7294,49.38778")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2015-04-02")
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
	public void test_urjltxmj9vmt_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,pedestrian")
				.queryParam("bboxes", "Q:8.654710,49.405,8.749826,49.3879")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2011-08-02")
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
	public void test_trz5l88aice0_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.652198,49.407,8.731400,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-01-15")
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
	public void test_tnyzu1qxoggz_countDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,church")
				.queryParam("bboxes", "q:8.650,49.4278,8.7513,49.396|xuYwM:8.653,49.419,8.702,49.385|xXKb:8.6833,49.4196,8.732,49.395|ziv:8.6555,49.416,8.7549,49.38426")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-09-02")
				.queryParam("timeout", "44")
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
	public void test_1k1wqcmzkgldi_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "yNN:8.677,49.41756,8.7375,49.381|JC:8.688667,49.402,8.750,49.3832|X:8.690,49.413,8.709,49.381|ok:8.697,49.404,8.7594,49.39958")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "c:8.728147,49.408,8|N:8.7294,49.422,7|vMj:8.71376,49.406319,483|Q:8.709078,49.420,29")
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
	public void test_tol6coz6x0s3_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and length:( .. 100)")
				.queryParam("groupByValues", "station,primary,stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-10")
				.queryParam("bpolys", "8.704561,49.403252,8.727,49.42334,8.708480,49.422322,8.701214,49.426,8.704561,49.403252|8.704561,49.403252,8.74149,49.400,8.70270,49.4325,8.730,49.435,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_1ib0h9h01wnl0_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "bus_stop,platform")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "CSS:8.704561,49.403252,8.740931,49.4177,8.704931,49.43220,8.72690,49.403,8.704561,49.403252|EKdL:8.704561,49.403252,8.703,49.401,8.7188,49.4199,8.701,49.415,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_vf0woffovxwi_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop,yes,pedestrian")
				.queryParam("bboxes", "i:8.65205,49.4101,8.702222,49.387")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-07-08")
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
	public void test_1jecmk4514nqu_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,demolished,station")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "2011-05-09")
				.queryParam("bpolys", "8.704561,49.403252,8.7059,49.415262,8.747,49.439,8.720,49.423,8.704561,49.403252|8.704561,49.403252,8.7499,49.421,8.720,49.422,8.706,49.414,8.704561,49.403252|8.704561,49.403252,8.7241,49.424,8.7493,49.4308,8.708,49.403,8.704561,49.403252")
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
	public void test_qdvkecxfvol2_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.7244,49.42566,6|8.743,49.433,2")
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
	public void test_rh4zgz4z0m5u_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "chapel,university")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-07-01")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "ZuycY:8.7485,49.403,6")
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
	public void test_t4nwm81qmsme_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "kNex:8.749,49.425,9")
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
	public void test_uv95bj7ejn8l_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential")
				.queryParam("bboxes", "8.694,49.414895,8.7274,49.387434")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "27")
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
	public void test_uv95btepmerd_countDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,track,commercial")
				.queryParam("bboxes", "8.663,49.406,8.716,49.391")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-09-25")
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
	public void test_1iev040suu2bd_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and geometry:polygon and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-04-23")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"R\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744,49.4039],[8.746,49.4016],[8.71275,49.4380],[8.704561,49.403252]]]}}]}")
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
	public void test_1hbd8388a6dko_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* or area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "primary")
				.queryParam("bboxes", "8.675,49.402,8.74472,49.387")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "s:8.704561,49.403252,8.7191,49.4125,8.723,49.439,8.704,49.4316,8.704561,49.403252|MD:8.704561,49.403252,8.72550,49.438,8.739551,49.422,8.707,49.4391,8.704561,49.403252|I:8.704561,49.403252,8.744,49.4285,8.716,49.433,8.70230,49.42916,8.704561,49.403252")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "I:8.736,49.42498,6")
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
	public void test_qe149f1cdt2a_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "p:8.704561,49.403252,8.705,49.413,8.7446,49.4162,8.704561,49.423,8.704561,49.403252|fheLT:8.704561,49.403252,8.743,49.4394,8.704646,49.40970,8.700,49.414,8.704561,49.403252|AX:8.704561,49.403252,8.706,49.418618,8.704666,49.4165,8.746,49.407,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_1iycq3uvfiwrm_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,roof")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "U:8.704561,49.403252,8.744,49.431,8.705,49.4188,8.703,49.4298,8.704561,49.403252")
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
	public void test_1k25jzgpbajw2_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path,ship,chapel")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-08-23")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70114,49.406],[8.743,49.43939],[8.704570,49.427],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_ubluxr247xid_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,dormitory,tertiary")
				.queryParam("filter", "destination=* or geometry:point and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "J:8.665907,49.42016,8.7058,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-05-05")
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
	public void test_u7znvnol0vg3_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "crossing")
				.queryParam("bboxes", "8.6726,49.4083,8.745,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("time", "2015-05-06")
				.queryParam("timeout", "74")
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
	public void test_s10jxt162ofk_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,chapel")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-01-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"og\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724314,49.42344],[8.732,49.424],[8.70778,49.40639],[8.704561,49.403252]]]}}]}")
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
	public void test_rhaki2l16bms_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "chapel,school,elevator")
				.queryParam("filter", "bicycle=* and geometry:polygon")
				.queryParam("bboxes", "P:8.657963,49.40881,8.7245,49.381|zma:8.668,49.4133,8.74633,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-11-02")
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
	public void test_1hrh0513juwrl_countDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or not type:way or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-09-14")
				.queryParam("bpolys", "8.704561,49.403252,8.7229,49.4269,8.722,49.423,8.704,49.438,8.704561,49.403252")
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
	public void test_1hrgf0sio9kj4_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-06-01")
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
	public void test_s10jjryl9so6_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "QK:8.704561,49.403252,8.715,49.405989,8.74062,49.4142,8.7205,49.419,8.704561,49.403252|py:8.704561,49.403252,8.7283,49.412338,8.706,49.435,8.73815,49.408989,8.704561,49.403252|Dlx:8.704561,49.403252,8.722466,49.4318,8.7037,49.436,8.731,49.410,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_1iev0fhjcxid1_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-07-16")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "SQO:8.742,49.435,5|Vjd:8.705,49.4184,4")
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
	public void test_1ji1poj1nyzao_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-02-06")
				.queryParam("bpolys", "8.704561,49.403252,8.7063,49.4323,8.702,49.417,8.7071,49.418,8.704561,49.403252")
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
	public void test_rlamij9j1453_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and type:relation")
				.queryParam("bboxes", "n:8.66925,49.42824,8.753,49.387")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-08-25")
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
	public void test_1jy4wooujkf21_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "2011-09-02")
				.queryParam("bpolys", "S:8.704561,49.403252,8.715809,49.4043,8.7000,49.422,8.713146,49.431,8.704561,49.403252|a:8.704561,49.403252,8.7164,49.419616,8.704243,49.4103,8.701,49.4159,8.704561,49.403252|J:8.704561,49.403252,8.707,49.411,8.70645,49.4018,8.73187,49.4087,8.704561,49.403252")
				.queryParam("timeout", "55")
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
	public void test_r1l50dotm546_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.43737,8.7040,49.4084,8.708,49.409,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_tol5mv9zlb8w_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* and type:way or length:( .. 100)")
				.queryParam("bboxes", "OXvam:8.695,49.42353,8.715,49.3934")
				.queryParam("time", "2008-01-10")
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
	public void test_u82db122z5nq_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2009-03-20")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "8.700557,49.4334,6|8.737,49.43571,6|8.744,49.40530,2")
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
	public void test_1ji78wyal54xd_countDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("time", "2008-11-26")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "8.731,49.422,8")
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
	public void test_t4q448c58hth_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* or type:relation")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-09-04")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "8.7340,49.425,83")
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
	public void test_skq1u7kipqut_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.691824,49.408,8.75632,49.383|8.6576,49.406,8.738,49.3926")
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
	public void test_qe12pckofupi_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "t:8.65949,49.424,8.7215,49.380")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-12-29")
				.queryParam("timeout", "72")
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
	public void test_sl0oki8vkl0h_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("bpolys", "lJ:8.704561,49.403252,8.7186,49.4299,8.70453,49.420,8.704012,49.410,8.704561,49.403252")
				.queryParam("timeout", "91")
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
	public void test_s4xe4lz4w8kl_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "jrL:8.666,49.428,8.757,49.399|i:8.6744,49.4290,8.7495,49.394|JJ:8.6632,49.40817,8.717,49.3816")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-07-04")
				.queryParam("timeout", "36")
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
	public void test_u7rd0gjhmywm_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-03-14")
				.queryParam("bcircles", "Smgm:8.7048,49.4295,2")
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
	public void test_u7rbub8fudyq_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "8.714,49.407,30|8.729,49.424,45")
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
	public void test_u7oii8o26fjq_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or length:( .. 100)")
				.queryParam("bpolys", "SX:8.704561,49.403252,8.740,49.4350,8.748,49.417,8.725499,49.4191,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_1jyjc4zopcjsm_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "hV:8.683,49.423,8.74842,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2016-10-10")
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
	public void test_rlb580tsnwa8_countDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and not type:relation")
				.queryParam("bboxes", "pYU:8.682802,49.409,8.7564,49.3805|LH:8.657,49.4206,8.739,49.381")
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
	public void test_sof3sp3ue3p5_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XMch:8.674,49.421,8.7570,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.708,49.434,7")
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
	public void test_qe73er6bivxv_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and geometry:polygon")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-04-17")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "D:8.712,49.406,794|cIEW:8.734145,49.419,5")
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
	public void test_t4a1cnxzc379_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2012-07-10")
				.queryParam("timeout", "34")
				.queryParam("bcircles", "L:8.7207,49.431,5")
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
	public void test_qhnbc5p3i8tt_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2010-08-13")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "j:8.721,49.4380,2")
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
	public void test_s4mtt4a4tgs9_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "pHI:8.722,49.436,7|zo:8.709,49.418,629")
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
	public void test_1hr84v6gkimoy_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* and geometry:point")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.718,49.42250,6|8.7097,49.406,7")
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
	public void test_rl5lzn756fjp_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748,49.403],[8.7473,49.42643],[8.7237,49.4195],[8.704561,49.403252]]]}}]}")
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
	public void test_tolpft6ird5v_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-11-06")
				.queryParam("bcircles", "Kjv:8.7017,49.423035,2|CBz:8.7002,49.41223,9|UBlH:8.709,49.43029,2|CIYNl:8.7168,49.4219,591004309331")
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
	public void test_s10jjqbjgn6t_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"R\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7084,49.425],[8.707,49.4283],[8.738,49.417338],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"is\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.719,49.4118],[8.7358,49.408],[8.704323,49.413],[8.704561,49.403252]]]}}]}")
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
	public void test_1hv60ur0bo1gk_countGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "76")
				.queryParam("bcircles", "j:8.7399,49.433,23|QzX:8.73920,49.411,8|sMC:8.70999,49.4095,3|k:8.736,49.40067,18")
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
	public void test_qxqmjl540l68_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("bpolys", "GfXSb:8.704561,49.403252,8.734,49.4332,8.704565,49.417,8.74074,49.40433,8.704561,49.403252|h:8.704561,49.403252,8.7176,49.4217,8.7323,49.400,8.7341,49.409811,8.704561,49.403252|Zv:8.704561,49.403252,8.709016,49.438,8.7377,49.4189,8.745877,49.4276,8.704561,49.403252")
				.queryParam("bcircles", "8.7325,49.415280,1|8.744,49.4298,8")
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
	public void test_ublvpt8u3ale_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.69846,49.419,8.7467,49.384")
				.queryParam("showMetadata", "yes")
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
	public void test_1hux5c2n3ne41_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("time", "2007-12-30")
				.queryParam("bpolys", "d:8.704561,49.403252,8.72287,49.424,8.730,49.410,8.7047,49.424,8.704561,49.403252|OV:8.704561,49.403252,8.732,49.404,8.7090,49.41891,8.7235,49.4073,8.704561,49.403252")
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
	public void test_vb95cxqqmn8w_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.748,49.435,7")
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
	public void test_rl8fbxc7vb6s_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-12-21")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "L:8.708,49.418,5|a:8.720,49.438,8")
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
	public void test_s505i4hrjcq9_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "EwEh:8.6714,49.406,8.739,49.391|kYkPw:8.6735,49.42421,8.7095,49.394")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-06-11")
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
	public void test_qy4x086uguas_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "SLYiL:8.732,49.407,296429387")
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
	public void test_qe9dppjeafz6_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("time", "2010-07-04")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "8.7465,49.405,54|8.710,49.420,63")
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
	public void test_r1l4xwxlhyr9_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-09-29")
				.queryParam("bcircles", "Lu:8.729,49.40452,6")
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
	public void test_skpjwl1ffgoh_countGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-12-27")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7313,49.421],[8.717,49.4122],[8.70129,49.42395],[8.704561,49.403252]]]}}]}")
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
	public void test_t8cdlexaeypi_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,dormitory,apartments")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "27")
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
	public void test_1h7x1bsfd2yjq_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tower")
				.queryParam("bboxes", "RJNsP:8.65313,49.4234,8.7026,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("bcircles", "Y:8.7007,49.426,8")
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
	public void test_1jelizy6qjvi0_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,synagogue,pedestrian")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "40")
				.queryParam("bcircles", "ajCi:8.7276,49.430,4")
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
	public void test_vbbuc4zmb2ar_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk!=* and geometry:polygon")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "Ir:8.720229,49.432683,33|sA:8.7207,49.436,66|OY:8.737685,49.405,2|RSI:8.708,49.435,36")
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
	public void test_qe1lhkec1obl_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and type:relation and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-10-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"DACPG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72449,49.420],[8.704625,49.43690],[8.74558,49.4341],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "21")
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
	public void test_skjzz3rqgbox_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "DN:8.704561,49.403252,8.718,49.4062,8.72266,49.4353,8.708,49.407,8.704561,49.403252|DzkSR:8.704561,49.403252,8.712,49.4324,8.7048,49.43082,8.7327,49.42298,8.704561,49.403252|Ecy:8.704561,49.403252,8.74250,49.4291,8.726,49.426,8.710,49.429,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_vb6as52va0qd_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "vLqNB:8.706,49.415,9|ULNIu:8.7245,49.422794,64")
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
	public void test_ubjm9h5wg9ip_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,steps,house")
				.queryParam("filter", "highway=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2015-12-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"O\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.41722],[8.747,49.4016],[8.715184,49.417],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ljjh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744679,49.4164],[8.725230,49.439],[8.741,49.415],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7iox1rvwfg1_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "Ir:8.720229,49.432683,33|sA:8.7207,49.436,66|OY:8.737685,49.405,2|RSI:8.708,49.435,36")
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
	public void test_us30n1jdilia_countGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "S:8.704561,49.403252,8.7062,49.411,8.72505,49.410,8.732,49.43612,8.704561,49.403252|Cw:8.704561,49.403252,8.726,49.4085,8.706,49.409,8.7042,49.420966,8.704561,49.403252|w:8.704561,49.403252,8.735,49.419,8.742,49.42799,8.704,49.40724,8.704561,49.403252")
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
	public void test_s10kpt92qur7_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,track")
				.queryParam("filter", "oneway!=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.663,49.418,8.7220,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "XjV:8.747,49.424,1")
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
	public void test_1ibbjl5ybi6up_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* or not length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.719,49.409,8.7242,49.437,8.701,49.4235,8.704561,49.403252|8.704561,49.403252,8.7019,49.431774,8.7237,49.4019,8.706,49.437,8.704561,49.403252|8.704561,49.403252,8.707,49.413766,8.7024,49.43208,8.729492,49.409,8.704561,49.403252")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "8.721,49.4233,2")
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
	public void test_1iv6jxfp3h16a_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Z:8.656,49.410876,8.724,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
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
	public void test_1jxzgko1zczed_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "wOTg:8.729184,49.438,4")
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
	public void test_uvbcwk1ih3xu_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "OqFFI:8.683,49.421,8.701,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
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
	public void test_rhm4r0zgv4v7_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-09-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7308,49.4037],[8.7023,49.426],[8.714,49.429],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"rcWrI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7357,49.40851],[8.72559,49.4315],[8.702,49.416],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Jdnm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7113,49.41751],[8.714,49.428211],[8.735475,49.430],[8.704561,49.403252]]]}}]}")
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
	public void test_t4ico5tkfc54_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-10-24")
				.queryParam("bpolys", "ppbLk:8.704561,49.403252,8.72833,49.421,8.740,49.404,8.7041,49.4176,8.704561,49.403252")
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
	public void test_urxxj55hhgs4_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-01-17")
				.queryParam("bpolys", "8.704561,49.403252,8.73221,49.41259,8.7037,49.416,8.7120,49.411,8.704561,49.403252|8.704561,49.403252,8.735,49.419,8.719,49.436916,8.705646,49.431615,8.704561,49.403252")
				.queryParam("timeout", "80")
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
	public void test_u87yexh73a05_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2017-04-17")
				.queryParam("bcircles", "QZz:8.730,49.425,7")
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
	public void test_rhroovpq4bqe_countGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.746834,49.408,8|8.743089,49.40703,5|8.7160,49.411,4|8.705379,49.421,59")
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
	public void test_rh4zgzimareg_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2017-01-25")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "addr:postcode,maxspeed,bicycle")
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
	public void test_1huzwno4j4ta0_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or geometry:line or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("timeout", "99")
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
	public void test_rl2u7vbxp4qd_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* or geometry:line or id:(1 .. 9999)")
				.queryParam("timeout", "62")
				.queryParam("groupByKeys", "highway,addr:postcode,smoothness")
				.queryParam("bcircles", "K:8.7449,49.428,107|mMtVp:8.7068,49.4345,152")
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
	public void test_s10kq1jog8kh_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nNX:8.693716,49.427247,8.719,49.3947")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "49")
				.queryParam("groupByKeys", "bicycle,addr:city")
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
	public void test_1hre6q8lzhx0h_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-01-28")
				.queryParam("groupByKeys", "sidewalk,maxspeed,lanes:forward")
				.queryParam("bcircles", "qrd:8.7466,49.422,65")
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
	public void test_vbn05rpbaa0i_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "C:8.704561,49.403252,8.723,49.425,8.717107,49.434,8.7038,49.404,8.704561,49.403252|Fo:8.704561,49.403252,8.744,49.433599,8.748157,49.425,8.70453,49.420,8.704561,49.403252|AeBiR:8.704561,49.403252,8.73253,49.426,8.70710,49.436,8.7344,49.431795,8.704561,49.403252")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "lanes:backward,building")
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
	public void test_1jel0ltt42vs1_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and type:relation or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.673,49.416452,8.701,49.394")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-10-19")
				.queryParam("groupByKeys", "lit,name,addr:street")
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
	public void test_vbccq1iigk0z_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Hs:8.65123,49.4280,8.700,49.3927")
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "type,addr:country,network")
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
	public void test_t4l4ivu8bzg1_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6946,49.417,8.750,49.392")
				.queryParam("time", "2015-06-26")
				.queryParam("groupByKeys", "landuse,addr:country,turn")
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
	public void test_vb3kkjo24qb6_countGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood")
				.queryParam("format", "csv")
				.queryParam("time", "2015-10-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"XnD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7115,49.415717],[8.724,49.432],[8.704515,49.4314],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"TE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.405798],[8.704,49.436],[8.729344,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"KLpLh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.40490],[8.70457,49.433369],[8.726,49.414],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "32")
				.queryParam("groupByKeys", "building,turn:lanes,type")
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
	public void test_1h822y12dpjz7_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or not id:(1 .. 9999)")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-08-12")
				.queryParam("bpolys", "m:8.704561,49.403252,8.733,49.405,8.700,49.4318,8.7419,49.432368,8.704561,49.403252|tmA:8.704561,49.403252,8.725,49.41937,8.704,49.430,8.74374,49.431,8.704561,49.403252")
				.queryParam("groupByKeys", "turn:lanes")
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
	public void test_skmrckn7rv51_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=*")
				.queryParam("bboxes", "8.664,49.41586,8.703,49.382|8.650226,49.419,8.7004,49.389")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "WG:8.7387,49.400,5|I:8.704,49.415,32")
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
	public void test_1iepig5thw19f_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2012-11-25")
				.queryParam("bpolys", "Znm:8.704561,49.403252,8.72253,49.400,8.7419,49.42763,8.704837,49.412,8.704561,49.403252|jRM:8.704561,49.403252,8.719514,49.43652,8.735,49.417,8.70424,49.41707,8.704561,49.403252|l:8.704561,49.403252,8.741,49.42558,8.701,49.412,8.716872,49.426,8.704561,49.403252")
				.queryParam("timeout", "55")
				.queryParam("groupByKeys", "turn:lanes,lanes,addr:postcode")
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
	public void test_1jig2xz124awk_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "R:8.671,49.414,8.725,49.3863|s:8.6707,49.427,8.73782,49.3986|tM:8.66338,49.422,8.702,49.390|aMflK:8.6530,49.41769,8.737,49.398036")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "lanes,addr:street,addr:country")
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
	public void test_s1dvsitdk50h_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "highway,lit,lanes")
				.queryParam("bcircles", "8.739392,49.42677,1|8.745,49.4285,4|8.71204,49.428,6|8.720,49.425,54")
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
	public void test_1k1rpwdovvvqe_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "z:8.6711,49.416,8.741,49.3892|J:8.683,49.415,8.706579,49.380|yE:8.681,49.413960,8.7270,49.389|O:8.693,49.424777,8.722961,49.3951")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-05-11")
				.queryParam("groupByKeys", "addr:street,maxspeed")
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
	public void test_qdsrs21st9wk_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UExGy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74501,49.4031],[8.72690,49.439],[8.7244,49.421101],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "landuse,addr:housenumber,addr:city")
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
	public void test_qxntab5l85dk_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "J:8.664,49.418,8.753,49.394")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-03-30")
				.queryParam("groupByKeys", "sidewalk,lanes:backward,turn")
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
	public void test_urjlg0h0dbu8_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.666,49.425,8.732,49.388|8.657,49.415,8.709,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "70")
				.queryParam("groupByKeys", "addr:street,source:maxspeed,name")
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
	public void test_uv5v8h41gt2u_countGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=* or type:relation and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-02-06")
				.queryParam("bpolys", "GOr:8.704561,49.403252,8.747,49.4127,8.743,49.420463,8.703952,49.407,8.704561,49.403252|S:8.704561,49.403252,8.7308,49.437,8.70457,49.403323,8.72018,49.4391,8.704561,49.403252|a:8.704561,49.403252,8.737,49.437,8.711,49.403,8.703,49.427,8.704561,49.403252")
				.queryParam("groupByKeys", "tracktype,network")
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
	public void test_1iv1ip3snq2b5_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=*")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "sJ:8.726094,49.400408,9")
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
	public void test_1hbah3glyytrs_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
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
	public void test_1h84srvpb840x_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,primary_link")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:node or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bpolys", "dp:8.704561,49.403252,8.706,49.417,8.720,49.415,8.7046,49.413,8.704561,49.403252|x:8.704561,49.403252,8.705,49.400,8.700,49.4103,8.740422,49.4383,8.704561,49.403252|Keksb:8.704561,49.403252,8.739,49.426300,8.722443,49.4225,8.7065,49.414,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_1hvbj891dunvn_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "university,emergency_access_point,primary_link")
				.queryParam("filter", "addr:postcode=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "tn:8.748,49.428,3|vtq:8.711062,49.4367,73|S:8.712,49.401,6")
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
	public void test_uvgxxxai1wkx_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "W:8.704561,49.403252,8.723883,49.426,8.734,49.438,8.743,49.40542,8.704561,49.403252")
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
	public void test_trtnaggmjdx5_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,service,synagogue")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"kVzZu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.405],[8.744,49.42967],[8.70674,49.439],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"qD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.734,49.419],[8.703,49.416],[8.7125,49.4252],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"iAB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7086,49.415],[8.726,49.4266],[8.709,49.4202],[8.704561,49.403252]]]}}]}")
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
	public void test_qxg07f6ew3ty_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.74124,49.422719,8.700873,49.415,8.710,49.420,8.704561,49.403252|8.704561,49.403252,8.72689,49.431,8.705,49.405,8.745,49.437,8.704561,49.403252|8.704561,49.403252,8.73496,49.417322,8.7070,49.432,8.7372,49.422274,8.704561,49.403252")
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
	public void test_1hux7lugznn74_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,stop")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-10-04")
				.queryParam("bpolys", "Lal:8.704561,49.403252,8.728,49.4185,8.70986,49.4318,8.725,49.437,8.704561,49.403252")
				.queryParam("timeout", "67")
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
	public void test_vey4z8mx5rhi_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "QLg:8.6759,49.427,8.70993,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-12-13")
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
	public void test_vbsim0ti8ehu_countGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.654,49.413,8.723,49.397")
				.queryParam("groupByKey", "highway")
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
	public void test_rhdbkquamk39_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes,speed_camera")
				.queryParam("bboxes", "n:8.6979,49.413,8.7040,49.392")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "KOw:8.704561,49.403252,8.741,49.4059,8.704,49.43174,8.7049,49.430,8.704561,49.403252|O:8.704561,49.403252,8.711,49.431,8.707,49.426,8.709,49.4027,8.704561,49.403252")
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
	public void test_qy4yn5n7qoh0_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=*")
				.queryParam("groupByValues", "living_street,crossing,unclassified")
				.queryParam("bboxes", "8.683560,49.425571,8.728,49.382")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("time", "2017-12-21")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "f:8.7002,49.420,5")
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
	public void test_1ib0xb8vxpquw_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,hotel,bus_stop")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-06-11")
				.queryParam("bcircles", "vj:8.7273,49.420,6")
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
	public void test_qy25mnqce4ip_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "civic,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Q:8.704561,49.403252,8.707,49.425124,8.70461,49.400,8.739,49.433092,8.704561,49.403252|x:8.704561,49.403252,8.7249,49.4381,8.734100,49.410,8.746,49.434,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_skkjgjmvhh7p_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.658,49.416231,8.7196,49.39076|8.687250,49.416,8.7530,49.390|8.688,49.419,8.7308,49.38548")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "62")
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
	public void test_r1a1u7rdgks8_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "synagogue,pedestrian,hospital")
				.queryParam("filter", "tracktype=* and length:( .. 100)")
				.queryParam("bboxes", "mml:8.672121,49.422,8.7480,49.39077|kRWOy:8.66359,49.424,8.7169,49.3861")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-07-13")
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
	public void test_1jy26sfgdqgkh_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* or geometry:line or not id:(1 .. 9999)")
				.queryParam("bboxes", "eWe:8.65119,49.425108,8.74048,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
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
	public void test_1ievjlu4ryq7p_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "commercial,dormitory,pedestrian")
				.queryParam("bboxes", "8.681761,49.407902,8.759,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_tol7zc6rdut3_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "BFM:8.660,49.424,8.7312,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2013-10-06")
				.queryParam("timeout", "66")
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
	public void test_ure00gha9vzr_countGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,service")
				.queryParam("bboxes", "Mu:8.677,49.40054,8.710,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("timeout", "48")
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
	public void test_1jezd0evbxcmo_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.4284],[8.7008,49.4093],[8.726376,49.4230],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"gzX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.417],[8.72970,49.401],[8.701,49.4386],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"lG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.411],[8.7045,49.400509],[8.7016,49.413],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "8.7236,49.4099,930")
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
	public void test_1hv618vqvbf4z_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "qXo:8.699,49.408,8.704,49.388836|V:8.694,49.416,8.7116,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
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
	public void test_ubop1lmqhe0l_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-11-17")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "R:8.7272,49.42328,6")
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
	public void test_qhq4qkrvlz6t_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "I:8.656,49.4015,8.7220,49.3967|L:8.689,49.400343,8.709,49.383|MGilI:8.679004,49.421,8.740206,49.381|J:8.6926,49.427676,8.742,49.3931")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
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
	public void test_1h7rhe3lz4bax_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2010-03-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zUzoM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749121,49.428],[8.705,49.403],[8.7029,49.409064],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "30")
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
	public void test_1ib0gy84untk1_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "IP:8.684,49.429,8.703,49.388796|d:8.696,49.4050,8.721,49.3941|Tg:8.671,49.423,8.726,49.386|rx:8.676,49.4221,8.7402,49.390636")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_vf97ajd9f1vc_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.69971,49.414,8.74587,49.3999")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-05")
				.queryParam("timeout", "83")
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
	public void test_1k1wqqmhroier_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"gGZYd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.40971],[8.706,49.4381],[8.749672,49.405],[8.704561,49.403252]]]}}]}")
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
	public void test_r1l4miw5rzuc_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and not length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "8.703,49.409818,47|8.738236,49.41798,42|8.71553,49.4058,1|8.745,49.439,8")
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
	public void test_trrczc84cqb7_countGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "ionv:8.65238,49.401,8.71546,49.394")
				.queryParam("format", "csv")
				.queryParam("timeout", "26")
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
	public void test_ubgcmn2y6gj8_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "QHQQN:8.655,49.412,8.749,49.386")
				.queryParam("keys", "highway")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "NC:8.714,49.422,780|kHj:8.70027,49.4238,8")
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
	public void test_1hruaa8p7p99y_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "g:8.7275,49.4357,8")
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
	public void test_ts1vf0ht61wz_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2008-01-31")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "8.74501,49.404447,1|8.745,49.413,5")
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
	public void test_1ibc1w890p6qu_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2018-01-04")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "zsThF:8.7394,49.4056,9")
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
	public void test_to4jdpsxugyr_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway and geometry:polygon")
				.queryParam("bboxes", "8.6941,49.405,8.737,49.385|8.680,49.40692,8.759,49.392")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-05-17")
				.queryParam("timeout", "87")
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
	public void test_sl3eukiunyup_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn!=*")
				.queryParam("bboxes", "XPHjE:8.694923,49.4145,8.715,49.398")
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
	public void test_ure29w582nvn_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "MK:8.6913,49.422,8.7443,49.39682")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-07-24")
				.queryParam("timeout", "29")
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
	public void test_urgs6d1xc75f_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and not type:way or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-21")
				.queryParam("bcircles", "NG:8.712,49.413,49|KY:8.735375,49.418310,89|u:8.720,49.4249,3|rZ:8.720,49.43936,867")
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
	public void test_u7okrqlwspwx_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("bpolys", "BLY:8.704561,49.403252,8.70695,49.4259,8.70212,49.400924,8.748,49.4389,8.704561,49.403252")
				.queryParam("timeout", "35")
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
	public void test_rhb2tmmekmrc_countGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "t:8.652,49.418,8.70664,49.398")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_s4msmzcmth7o_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway or type:relation and id:(1 .. 9999)")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "ref!=* or geometry:line")
				.queryParam("time", "2017-07-24")
				.queryParam("timeout", "92")
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
	public void test_1hruu5z81ia7k_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-01-29")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "yxD:8.7223,49.413,64")
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
	public void test_rhtyxhl6ou9j_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "N:8.713,49.405,80|mBJXb:8.73212,49.4196,7")
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
	public void test_s0ugiqr5x7xh_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber!=* and geometry:line and length:( .. 100)")
				.queryParam("types2", "point,line,")
				.queryParam("format", "csv")
				.queryParam("filter2", "barrier!=*")
				.queryParam("bpolys", "8.704561,49.403252,8.7179,49.4331,8.7371,49.400,8.703,49.430,8.704561,49.403252")
				.queryParam("keys2", "highway")
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
	public void test_1ji79m7wdzxie_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "b:8.684,49.4247,8.707,49.381|ehq:8.6738,49.404,8.709,49.398|v:8.679,49.413050,8.733,49.3907")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "ref=* and id:(1 .. 9999)")
				.queryParam("time", "2010-08-24")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "46")
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
	public void test_1hrben2c4mo8g_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "node,")
				.queryParam("format", "csv")
				.queryParam("time", "2009-06-09")
				.queryParam("bpolys", "NYqwK:8.704561,49.403252,8.736,49.42854,8.744853,49.421,8.70450,49.41675,8.704561,49.403252")
				.queryParam("timeout", "74")
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
	public void test_1iyf0synj1y5t_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "turn:lanes!=* and geometry:line or length:( .. 100)")
				.queryParam("time", "2013-06-17")
				.queryParam("bcircles", "USxHI:8.734,49.417,251")
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
	public void test_qy4yytjrb4gx_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("filter2", "tracktype!=* and type:way and length:( .. 100)")
				.queryParam("time", "2017-09-08")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "41")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "M:8.7367,49.4286,1|aVR:8.7377,49.4247,7")
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
	public void test_trrbf3u34f3a_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("filter2", "lit=* or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "Nykoq:8.746,49.414,73|Nz:8.726155,49.409,3")
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
	public void test_sl15pwzhcfuh_countRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "addr:housenumber!=*")
				.queryParam("bpolys", "8.704561,49.403252,8.733,49.422,8.704,49.402,8.7394,49.412,8.704561,49.403252|8.704561,49.403252,8.7017,49.439613,8.729,49.4358,8.7045,49.41163,8.704561,49.403252|8.704561,49.403252,8.7086,49.422,8.723408,49.4057,8.71328,49.435785,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "77")
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
	public void test_r17t66fwrjg1_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
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
	public void test_u88f6izyvzoi_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-08-19")
				.queryParam("bpolys", "e:8.704561,49.403252,8.717,49.4104,8.702,49.4074,8.723,49.4358,8.704561,49.403252|DfXM:8.704561,49.403252,8.735718,49.411,8.74116,49.419,8.715,49.4306,8.704561,49.403252|HJwjd:8.704561,49.403252,8.7264,49.4252,8.703,49.410,8.745,49.4169,8.704561,49.403252")
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
	public void test_u8diqsxdyv6u_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Sewd:8.6842,49.4056,8.7106,49.397")
				.queryParam("keys", "highway")
				.queryParam("types2", "way,relation")
				.queryParam("values", "secondary")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "43")
				.queryParam("values2", "bus_stop")
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
	public void test_vf6hecpx6542_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("bpolys", "vAU:8.704561,49.403252,8.74781,49.42779,8.70550,49.435,8.719,49.403,8.704561,49.403252")
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
	public void test_t8f4wmkagpx1_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("filter2", "maxspeed!=* and area:(1.0 .. 1E6)")
				.queryParam("bpolys", "wNy:8.704561,49.403252,8.7131,49.413,8.7049,49.4205,8.700452,49.418,8.704561,49.403252|n:8.704561,49.403252,8.7493,49.409,8.720,49.4185,8.705,49.427,8.704561,49.403252|wmUea:8.704561,49.403252,8.749491,49.404,8.727079,49.41222,8.7059,49.439,8.704561,49.403252")
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
	public void test_1h7z82e5zew4w_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and type:way")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("format", "json")
				.queryParam("filter2", "sidewalk!=*")
				.queryParam("time", "2008-05-19")
				.queryParam("bpolys", "zmrf:8.704561,49.403252,8.702162,49.425,8.704425,49.408,8.720,49.433,8.704561,49.403252|px:8.704561,49.403252,8.738,49.4399,8.721389,49.424,8.704533,49.43686,8.704561,49.403252|IXqHB:8.704561,49.403252,8.732,49.408,8.709310,49.4213,8.721,49.415,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "61")
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
	public void test_1ibbjktq9bm0g_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and id:(1 .. 9999)")
				.queryParam("types2", "relation")
				.queryParam("filter2", "natural=wood and length:( .. 100)")
				.queryParam("time", "2015-09-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"jZIQy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.4338],[8.739,49.407],[8.73951,49.421413],[8.704561,49.403252]]]}}]}")
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
	public void test_t4w6g3ya4e3n_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "MD:8.6536,49.426119,8.70792,49.39188|hKyP:8.6554,49.4201,8.759,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("time", "2010-01-21")
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
	public void test_rh89y6n2u8mr_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and geometry:line and id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "Tu:8.719,49.43352,4")
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
	public void test_sopn0ntsg95w_countRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "lit=* and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "primary")
				.queryParam("bcircles", "RXm:8.713,49.434,1")
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
	public void test_s1jevs70pmch_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("filter2", "addr:postcode!=* or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "INap:8.704561,49.403252,8.7312,49.4196,8.734,49.4161,8.7048,49.437,8.704561,49.403252|OV:8.704561,49.403252,8.727,49.4192,8.702,49.43910,8.739548,49.415,8.704561,49.403252")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "pINh:8.725,49.425,5|uRe:8.7222,49.411,370|j:8.703,49.434,7")
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
	public void test_1hrudebp2te8y_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "mwBtH:8.747,49.4041,7|zg:8.7204,49.4167,15")
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
	public void test_t4c9973kjygp_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,relation")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "natural=wood or id:(1 .. 9999)")
				.queryParam("time", "2017-03-21")
				.queryParam("bpolys", "tj:8.704561,49.403252,8.700,49.410,8.7076,49.4032,8.71915,49.40479,8.704561,49.403252|Php:8.704561,49.403252,8.7106,49.422,8.70751,49.432,8.7435,49.439,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop_line")
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
	public void test_1hrj94p3dm3j7_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.679,49.4006,8.754,49.391|8.69151,49.405,8.7048,49.394|8.677,49.4090,8.720491,49.391")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-10-19")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_1ievjizh6875g_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2014-06-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iuLo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.405],[8.729,49.421],[8.706859,49.4363],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "96")
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
	public void test_vf46rz7gatys_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("filter2", "addr:housenumber!=*")
				.queryParam("time", "2014-04-07")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "95")
				.queryParam("values2", "street_lamp")
				.queryParam("bcircles", "8.743,49.409,55|8.735577,49.439,5889750764|8.701290,49.4180,1|8.7244,49.421,23975930114")
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
	public void test_ubp5hqe6anvn_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("filter2", "network!=* or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "t:8.7393,49.406,9|q:8.7102,49.4018,29")
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
	public void test_r17au87q3bxy_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,")
				.queryParam("values", "speed_camera")
				.queryParam("time", "2012-12-12")
				.queryParam("bpolys", "8.704561,49.403252,8.7241,49.412,8.702,49.410062,8.7471,49.405,8.704561,49.403252|8.704561,49.403252,8.727,49.419,8.73089,49.43595,8.70456,49.431479,8.704561,49.403252|8.704561,49.403252,8.7168,49.435,8.722,49.43124,8.7040,49.42550,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "56")
				.queryParam("values2", "turning_circle")
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
	public void test_1hv89x9kbklly_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cFst:8.666,49.41672,8.708,49.3932")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("format", "json")
				.queryParam("filter2", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and length:( .. 100)")
				.queryParam("time", "2012-10-31")
				.queryParam("keys2", "highway")
				.queryParam("values2", "turning_circle")
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
	public void test_1h7ldypfu5et1_countRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* or geometry:point or id:(1 .. 9999)")
				.queryParam("bboxes", "phFpi:8.670,49.41856,8.750,49.3988|h:8.661124,49.42817,8.7461,49.380|Rx:8.684,49.42139,8.7307,49.386")
				.queryParam("format", "csv")
				.queryParam("filter2", "addr:street!=* and id:(1 .. 9999)")
				.queryParam("time", "2007-12-25")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "turning_circle")
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
	public void test_r1dcbmro41nq_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SF:8.671,49.406,8.7539,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-01-29")
				.queryParam("bpolys", "PwCvg:8.704561,49.403252,8.742,49.402,8.7048,49.4205,8.701254,49.434,8.704561,49.403252|bU:8.704561,49.403252,8.7495,49.43109,8.702,49.427,8.702,49.418407,8.704561,49.403252")
				.queryParam("timeout", "74")
				.queryParam("values2", "primary_link")
				.queryParam("bcircles", "s:8.74947,49.431,78|STjZ:8.735529,49.428,9")
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
	public void test_vbf5710fjmsx_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("filter2", "ref!=* or not geometry:polygon or not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.713,49.4015,8.727030,49.415,8.704,49.4110,8.704561,49.403252|8.704561,49.403252,8.709,49.421,8.748,49.427,8.724,49.4184,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "footway")
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
	public void test_qdss61jfuywn_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and length:( .. 100)")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "csv")
				.queryParam("filter2", "network=* or geometry:line")
				.queryParam("time", "2008-04-22")
				.queryParam("bpolys", "8.704561,49.403252,8.7233,49.410581,8.7043,49.42451,8.709,49.4331,8.704561,49.403252|8.704561,49.403252,8.731,49.427,8.701,49.42308,8.7048,49.417,8.704561,49.403252|8.704561,49.403252,8.733,49.4127,8.7044,49.43348,8.700,49.4260,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "95")
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
	public void test_ubrdpggzyogx_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-08-15")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "primary")
				.queryParam("bcircles", "W:8.721,49.409,5600537596|ZpCG:8.721,49.43773,2|GuSF:8.745,49.405,5")
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
	public void test_sl3d7te1s50m_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-02-06")
				.queryParam("bcircles", "8.7154,49.40836,6")
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
	public void test_1hbgh2v9poin6_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* and geometry:line")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "destination=*")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "PJsJ:8.7253,49.4046,6")
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
	public void test_1hv5zornfde0h_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "FaI:8.708,49.43332,42|SjA:8.727,49.426,6")
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
	public void test_socb8v0n70iq_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,")
				.queryParam("format", "json")
				.queryParam("filter2", "smoothness!=* or id:(1 .. 9999)")
				.queryParam("time", "2015-01-18")
				.queryParam("bcircles", "8.720,49.4260,572159496|8.740,49.42934,77|8.730045,49.43346,32")
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
	public void test_urk3d7x9urfm_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "PCD:8.696,49.414075,8.7269,49.398|w:8.672,49.410765,8.747,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-11-28")
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
	public void test_1jyg2fn9jbx46_countRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "line,")
				.queryParam("filter2", "highway=* or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "48")
				.queryParam("values2", "pedestrian")
				.queryParam("bcircles", "8.71728,49.437,6")
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
	public void test_rl021yf36c11_length() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* and length:( .. 100)")
				.queryParam("bboxes", "E:8.6912,49.415,8.700,49.399|rU:8.6595,49.4106,8.7466,49.390|Un:8.680,49.411,8.7100,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("bpolys", "QzAye:8.704561,49.403252,8.706,49.429,8.702,49.431,8.703,49.4014,8.704561,49.403252|K:8.704561,49.403252,8.718,49.418,8.705,49.402927,8.743,49.409,8.704561,49.403252|EB:8.704561,49.403252,8.733,49.401,8.73383,49.4061,8.70423,49.428324,8.704561,49.403252")
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
	public void test_1jiaijkfalrok_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-09-15")
				.queryParam("bcircles", "Kv:8.72436,49.420,6")
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
	public void test_qe4cvf4r2ss2_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and type:way and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "mrVDD:8.7429,49.406,9|Zq:8.702218,49.407,9|SQ:8.72190,49.422904,9")
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
	public void test_s12ts9wbleex_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "8.735,49.409231,2")
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
	public void test_1jy27k5t8fub5_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "fKGNx:8.704561,49.403252,8.7106,49.409,8.701,49.424209,8.712,49.439,8.704561,49.403252|N:8.704561,49.403252,8.732,49.4186,8.705870,49.409,8.71705,49.439,8.704561,49.403252|g:8.704561,49.403252,8.7270,49.416567,8.704,49.406,8.72304,49.4309,8.704561,49.403252")
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
	public void test_s10jy39vd0f6_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.67788,49.40978,8.708,49.398|8.669,49.427481,8.707,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "32")
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
	public void test_1iaxlz59pp25v_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-05-19")
				.queryParam("bpolys", "O:8.704561,49.403252,8.7245,49.433,8.705,49.4275,8.718,49.41563,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1jeqhvtlzk5yx_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"EEqz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7213,49.406],[8.7407,49.4255],[8.731,49.429],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.4213],[8.70650,49.406],[8.704571,49.4000],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"WIaz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.427161],[8.7117,49.43302],[8.70919,49.425],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "99")
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
	public void test_uvjnu4rsyhd0_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-12-20")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "Zrr:8.7084,49.409,3|KTAG:8.725,49.40673,91")
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
	public void test_tru36tqr5ysm_length() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "KaDCt:8.704561,49.403252,8.710,49.4275,8.735,49.4277,8.706,49.4092,8.704561,49.403252")
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
	public void test_1ji4j09h9nzvq_length1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* and type:way and length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("time", "2013-05-29")
				.queryParam("bpolys", "8.704561,49.403252,8.718,49.404,8.72844,49.402,8.7020,49.42371,8.704561,49.403252|8.704561,49.403252,8.700,49.424,8.747,49.436,8.707,49.414,8.704561,49.403252|8.704561,49.403252,8.723,49.40551,8.70508,49.403,8.704560,49.4174,8.704561,49.403252")
				.queryParam("bcircles", "8.7343,49.406,79|8.701,49.426674,84")
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
	public void test_1jy88nfo5b7zo_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.69410,49.421,8.705304,49.399")
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
	public void test_vb6bmm4xpjz5_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-04-30")
				.queryParam("bcircles", "Feh:8.747,49.41469,8|JdPE:8.733,49.4152,67|UGHX:8.7047,49.4067,65|uNxMT:8.7451,49.412,1")
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
	public void test_1iepifq0x8sit_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-04-01")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"DK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.433],[8.706,49.415],[8.704,49.4048],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7473,49.406],[8.7038,49.417905],[8.7357,49.4316],[8.704561,49.403252]]]}}]}")
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
	public void test_s4v5g09tzepl_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Uu:8.704561,49.403252,8.71727,49.429,8.724,49.407,8.710,49.427,8.704561,49.403252|J:8.704561,49.403252,8.732,49.40858,8.7424,49.4344,8.747,49.420,8.704561,49.403252")
				.queryParam("timeout", "44")
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
	public void test_sl16hxa7z8me_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("time", "2014-07-05")
				.queryParam("bpolys", "8.704561,49.403252,8.748,49.404,8.702,49.428,8.7076,49.409612,8.704561,49.403252|8.704561,49.403252,8.723,49.4188,8.70611,49.4384,8.7073,49.414,8.704561,49.403252")
				.queryParam("timeout", "41")
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
	public void test_1iemqcjrmb228_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "Feh:8.747,49.41469,8|JdPE:8.733,49.4152,67|UGHX:8.7047,49.4067,65|uNxMT:8.7451,49.412,1")
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
	public void test_vbk77wjh98wx_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "M:8.704561,49.403252,8.707,49.432,8.704560,49.402231,8.704573,49.4399,8.704561,49.403252")
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
	public void test_t4tg5ntzfdbr_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or not length:( .. 100)")
				.queryParam("bboxes", "8.6648,49.421,8.728,49.389|8.684,49.417,8.7167,49.3873")
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
	public void test_uve5e1apvm8x_length1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-09-19")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "D:8.737,49.424,3")
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
	public void test_t4syp8hno19g_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "mHqeo:8.6863,49.408,8.7194,49.396|MCSZ:8.6888,49.4214,8.706,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-06-29")
				.queryParam("bcircles", "8.73882,49.400,4")
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
	public void test_qeexkq11a90w_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "KC:8.704561,49.403252,8.745,49.414,8.738236,49.4193,8.711116,49.427,8.704561,49.403252|vc:8.704561,49.403252,8.70829,49.41551,8.7042,49.43308,8.71386,49.426049,8.704561,49.403252|COkZT:8.704561,49.403252,8.7072,49.420,8.722,49.4305,8.724,49.401,8.704561,49.403252")
				.queryParam("timeout", "91")
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
	public void test_qhl2nepqfrxu_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Ju:8.673375,49.411,8.7539,49.384|w:8.683,49.41623,8.720,49.3897|hi:8.65404,49.409,8.75616,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
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
	public void test_1h7ly8952irll_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:forward!=* and not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "8.7490,49.434,73")
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
	public void test_1hravgv09kilu_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("bboxes", "MhE:8.6803,49.40532,8.736,49.397|mLS:8.699402,49.425608,8.7286,49.381|d:8.6715,49.418,8.708,49.385|pl:8.679,49.415,8.7116,49.398352")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-09-25")
				.queryParam("timeout", "31")
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
	public void test_1h7j5o75ozrqq_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "99")
				.queryParam("bcircles", "ACHj:8.725520,49.430205,51")
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
	public void test_1iv73ckbkg5yp_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "IIA:8.680,49.42864,8.703352,49.389538|EF:8.67863,49.4058,8.709,49.3846|bZQX:8.696,49.404,8.717,49.38595|vtZ:8.665,49.424,8.758,49.396480")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "csv")
				.queryParam("timeout", "94")
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
	public void test_qy25p8h0zxph_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:city!=* or geometry:line")
				.queryParam("bboxes", "v:8.6696,49.414,8.717,49.3919")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-03-23")
				.queryParam("timeout", "95")
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
	public void test_t8cwp0tzwspx_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Yn:8.704561,49.403252,8.72123,49.406,8.74729,49.436082,8.702,49.402,8.704561,49.403252")
				.queryParam("timeout", "71")
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
	public void test_1iyc6m16swl0m_lengthDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and length:( .. 100)")
				.queryParam("bboxes", "8.6934,49.426,8.70796,49.386")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-11-03")
				.queryParam("timeout", "96")
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
	public void test_1iukvlb0773g0_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.65648,49.425,8.75404,49.398")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.7306,49.422,8.707,49.410,8.7104,49.427,8.704561,49.403252")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "mSI:8.73801,49.42595,61")
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
	public void test_qdq18ocinpeu_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-05-02")
				.queryParam("bcircles", "8.7016,49.426,9")
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
	public void test_s1gq8398iu79_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.415844,8.705,49.432,8.736385,49.428,8.704561,49.403252")
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
	public void test_1jyahbp6hps8n_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.736863,49.423,4")
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
	public void test_urme29dkk94l_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=* and not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.719415,49.405,7")
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
	public void test_s4uln2fkph0j_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-04-13")
				.queryParam("bpolys", "ScOxl:8.704561,49.403252,8.7115,49.42116,8.704,49.405,8.725,49.425,8.704561,49.403252|htsjn:8.704561,49.403252,8.7183,49.407403,8.7019,49.400,8.7044,49.420,8.704561,49.403252|uRBT:8.704561,49.403252,8.743,49.411,8.719,49.408,8.71498,49.4033,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_s1h7tu0dyzj6_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "lZP:8.6928,49.426,8.7517,49.392|fs:8.695,49.419629,8.7061,49.388")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-08-16")
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
	public void test_s1gpty6fj1v4_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-02-16")
				.queryParam("bcircles", "8.742,49.43328,47")
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
	public void test_qeex72qm87qq_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7352,49.406,8.7496,49.41767,8.702407,49.430,8.704561,49.403252|8.704561,49.403252,8.741,49.405,8.70396,49.41797,8.703399,49.431,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_t81cu1yje62f_lengthDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Ch:8.683,49.42941,8.726,49.389|Yy:8.673509,49.401,8.720,49.3891")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-11-15")
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
	public void test_1iynshqdc91t0_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.6514,49.418,8.72900,49.3928|m:8.6772,49.40724,8.725,49.3927")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-05-08")
				.queryParam("bpolys", "W:8.704561,49.403252,8.702836,49.43570,8.71704,49.434,8.703,49.421,8.704561,49.403252|uzC:8.704561,49.403252,8.7337,49.412860,8.709,49.42853,8.7046,49.413,8.704561,49.403252|BI:8.704561,49.403252,8.7347,49.439,8.703150,49.432,8.740,49.437,8.704561,49.403252")
				.queryParam("timeout", "73")
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
	public void test_1hv897o4lv5mg_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2013-10-14")
				.queryParam("bcircles", "8.7201,49.40859,5|8.71013,49.4368,9|8.732,49.406,2")
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
	public void test_1jyg1c87m65a1_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"udOwp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.436],[8.70495,49.4208],[8.705,49.420],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"FwRsH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740005,49.437],[8.704,49.437],[8.708559,49.421],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"K\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.439],[8.71192,49.43652],[8.72860,49.4210],[8.704561,49.403252]]]}}]}")
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
	public void test_1ibeb1b6r917m_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ZEngU:8.669588,49.40780,8.73362,49.392")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-02-20")
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
	public void test_rhdti857rj8y_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* and type:relation")
				.queryParam("time", "2015-11-11")
				.queryParam("bpolys", "qE:8.704561,49.403252,8.740,49.42963,8.7487,49.4004,8.7183,49.416,8.704561,49.403252|as:8.704561,49.403252,8.714,49.412,8.748,49.409987,8.731,49.432,8.704561,49.403252|dV:8.704561,49.403252,8.7239,49.4333,8.732,49.4273,8.708,49.4064,8.704561,49.403252")
				.queryParam("timeout", "33")
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
	public void test_1jy4ymyce5zxt_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=*")
				.queryParam("bboxes", "c:8.686068,49.417,8.732,49.399|B:8.661,49.406,8.714,49.39906")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-12-09")
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
	public void test_uv8moukrlug4_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-10")
				.queryParam("bpolys", "tUhbC:8.704561,49.403252,8.722,49.403,8.72425,49.4129,8.73020,49.4379,8.704561,49.403252|XU:8.704561,49.403252,8.7491,49.411230,8.7132,49.426,8.709,49.403,8.704561,49.403252|z:8.704561,49.403252,8.749,49.4337,8.722,49.4031,8.743,49.406,8.704561,49.403252")
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
	public void test_1hbgj18q6ba5y_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "wW:8.704561,49.403252,8.7493,49.429734,8.719,49.4316,8.7373,49.420,8.704561,49.403252|tq:8.704561,49.403252,8.74883,49.40492,8.7006,49.426,8.702,49.427,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_t89m57dvro6q_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and not geometry:polygon")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "nrFd:8.71465,49.40732,5|G:8.729,49.4336,8|e:8.722,49.41285,981")
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
	public void test_1h82jbhkm12li_lengthDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "hV:8.734,49.430376,8|hrHS:8.740,49.439,9|r:8.716,49.407,4|C:8.7446,49.427,958")
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
	public void test_rhdbypy2bnli_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "E:8.6735,49.415,8.739,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.7246,49.4051,5|8.741747,49.421,6")
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
	public void test_rhivwmz8d6wg_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-06-08")
				.queryParam("bcircles", "dnewA:8.744,49.411,3|wodl:8.724,49.437,5|vYMFs:8.708118,49.435,8")
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
	public void test_1iexr40oxs7kz_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vB:8.6911,49.414,8.717,49.3809")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "false")
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
	public void test_rhr4i2pdg9is_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* or type:node and length:( .. 100)")
				.queryParam("bboxes", "8.653,49.428,8.7291,49.381|8.671,49.41999,8.7209,49.385|8.6613,49.413183,8.7011,49.382")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_1k1ziz26xdnat_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.708,49.43664,8.702,49.407,8.702873,49.434,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_1if0kdlrg4myh_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Vi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735,49.412547],[8.731,49.4105],[8.719,49.4145],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"zpcew\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74307,49.41488],[8.740104,49.402853],[8.7097,49.433513],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ck\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.412386],[8.7057,49.4032],[8.737,49.422],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "92")
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
	public void test_1iv4byv57a2pf_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vezQ:8.6990,49.40387,8.7380,49.38711|g:8.6652,49.4156,8.716,49.389|UthI:8.660,49.426,8.737,49.3923")
				.queryParam("format", "csv")
				.queryParam("time", "2014-02-27")
				.queryParam("timeout", "85")
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
	public void test_1k1zkj89w8saa_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7042,49.425],[8.70971,49.416],[8.738580,49.4130],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "46")
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
	public void test_qhqmlkxx2ss4_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-03-09")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.700,49.426,107")
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
	public void test_1hbit9j41hoog_lengthDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or geometry:line")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.730,49.425349,1")
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
	public void test_u7wv03d80xnl_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,tower,demolished")
				.queryParam("bboxes", "GJ:8.683,49.424,8.741,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "platform")
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
	public void test_qxfzi3xudmb5_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-09-02")
				.queryParam("bpolys", "8.704561,49.403252,8.729207,49.429245,8.712,49.41918,8.738,49.43050,8.704561,49.403252")
				.queryParam("bcircles", "8.714,49.41504,96|8.709822,49.4139,7|8.748576,49.4132,6")
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
	public void test_qhvntojimfkz_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7498,49.433,8.7088,49.416,8.704,49.421409,8.704561,49.403252|8.704561,49.403252,8.710,49.423,8.740,49.415351,8.704560,49.435,8.704561,49.403252")
				.queryParam("timeout", "41")
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
	public void test_vbeo1ql97b6p_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,service,residential")
				.queryParam("bboxes", "o:8.675298,49.428,8.7204,49.3830")
				.queryParam("groupByKey", "building")
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
	public void test_rhoe7cs5c37c_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "json")
				.queryParam("bpolys", "GsV:8.704561,49.403252,8.715,49.430,8.738,49.418,8.714,49.40987,8.704561,49.403252|x:8.704561,49.403252,8.7469,49.408,8.721,49.4032,8.70425,49.40321,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_1h7towjp2t4q9_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,service")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("time", "2012-02-10")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.4230,8.701,49.439,8.701649,49.4312,8.704561,49.403252|8.704561,49.403252,8.7428,49.416432,8.702,49.431768,8.706,49.406,8.704561,49.403252|8.704561,49.403252,8.7489,49.407,8.700,49.412,8.745,49.4283,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_1ibeswbpsgoj9_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn=* and geometry:point and not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "grokD:8.708,49.403,28|eP:8.749,49.428,63")
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
	public void test_qdybphbyosvp_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-09-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yGFh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.4365],[8.702,49.40104],[8.7373,49.425],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "84")
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
	public void test_1jict8o7dttup_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,pedestrian")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "ML:8.704561,49.403252,8.712,49.4033,8.7436,49.410,8.70379,49.418,8.704561,49.403252|WKlPW:8.704561,49.403252,8.72776,49.410,8.7453,49.422,8.702,49.4313,8.704561,49.403252|kXRhw:8.704561,49.403252,8.700,49.439,8.704317,49.4044,8.745,49.430,8.704561,49.403252")
				.queryParam("timeout", "67")
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
	public void test_1ien87lw4sin5_lengthDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-01-24")
				.queryParam("bcircles", "D:8.714,49.419142,6")
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
	public void test_vf6xdfwgohtc_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary,give_way")
				.queryParam("filter", "barrier!=*")
				.queryParam("bboxes", "ZdQ:8.6560,49.403,8.746,49.3851")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-12-14")
				.queryParam("bpolys", "v:8.704561,49.403252,8.713,49.408,8.705,49.4006,8.7305,49.417,8.704561,49.403252|xjdAd:8.704561,49.403252,8.7377,49.4361,8.704508,49.406,8.709,49.426,8.704561,49.403252")
				.queryParam("bcircles", "uXdDn:8.723,49.4153,63|unv:8.738,49.41124,2|Hk:8.745,49.420,66")
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
	public void test_qhq20ez0mc81_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=*")
				.queryParam("bboxes", "G:8.654577,49.4213,8.710782,49.39075|e:8.6842,49.4241,8.703678,49.3846")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-05-16")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.40955,8.707905,49.407,8.702760,49.434,8.704561,49.403252|8.704561,49.403252,8.7162,49.43868,8.700,49.426,8.702725,49.4329,8.704561,49.403252|8.704561,49.403252,8.7098,49.432,8.7343,49.427,8.708842,49.418,8.704561,49.403252")
				.queryParam("bcircles", "V:8.749911,49.40332,52")
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
	public void test_tnz23dtwntiu_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,emergency_access_point,residential")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-04-20")
				.queryParam("bcircles", "pD:8.7465,49.425,7")
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
	public void test_qe3trwt3th7m_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,cycleway,hotel")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.718,49.4156,8.7045,49.4098,8.729,49.420,8.704561,49.403252")
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
	public void test_s4ma8sa4de0n_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("time", "2013-02-19")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "p:8.733,49.4049,8|gUSti:8.7059,49.404640,4")
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
	public void test_1iykzvhh056ig_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=*")
				.queryParam("bboxes", "M:8.650,49.417311,8.7139,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2011-12-20")
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
	public void test_skpluqljp3jl_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle,secondary,hotel")
				.queryParam("filter", "name!=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "lG:8.7330,49.434,204")
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
	public void test_1hr5d5xbqm14o_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "e:8.65414,49.4062,8.7536,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "59")
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
	public void test_ure0ej74u7u9_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "ezlb:8.746,49.420,3")
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
	public void test_to7bjsa2le0j_lengthDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.700127,49.4399,8.7034,49.403446,8.714649,49.4347,8.704561,49.403252")
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
	public void test_qy1o35kb7uwp_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "apartments,traffic_mirror")
				.queryParam("filter", "destination=* or geometry:line")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-07-18")
				.queryParam("bpolys", "Mg:8.704561,49.403252,8.715,49.421,8.72238,49.419,8.704610,49.42841,8.704561,49.403252|t:8.704561,49.403252,8.7395,49.418,8.7051,49.407,8.7049,49.42726,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_1ib6h6sp6mywm_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes!=* and id:(1 .. 9999)")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("time", "2008-11-15")
				.queryParam("bpolys", "Gijjt:8.704561,49.403252,8.739,49.436,8.7036,49.413996,8.749,49.415,8.704561,49.403252|oecDO:8.704561,49.403252,8.734,49.419498,8.7047,49.4323,8.7018,49.400,8.704561,49.403252|JXmLe:8.704561,49.403252,8.741,49.404363,8.71889,49.415,8.704156,49.422,8.704561,49.403252")
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
	public void test_1jyjaz0b2pqp0_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,platform")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-12-10")
				.queryParam("bpolys", "8.704561,49.403252,8.704,49.435521,8.704574,49.4352,8.7491,49.404,8.704561,49.403252|8.704561,49.403252,8.74304,49.409,8.70817,49.439,8.7046,49.412,8.704561,49.403252")
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
	public void test_1iyhr0jse8soj_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,elevator,demolished")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-07-18")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "8.737,49.4230,1")
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
	public void test_sok6l33uthkp_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "university,living_street")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "s:8.704561,49.403252,8.706,49.4033,8.707,49.4120,8.7046,49.4007,8.704561,49.403252|w:8.704561,49.403252,8.73062,49.429,8.717034,49.43452,8.7049,49.4118,8.704561,49.403252")
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
	public void test_1if0it3jordww_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("time", "2016-09-15")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "uR:8.729,49.404,46")
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
	public void test_tocw9nlvonjo_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals")
				.queryParam("bboxes", "E:8.683,49.4016,8.7262,49.388|CV:8.694659,49.40123,8.713491,49.38721")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
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
	public void test_1iykic1mrgz7c_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "f:8.692,49.428183,8.702,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_vbhxtvo3njvl_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,stop_line")
				.queryParam("filter", "turn:lanes=* and geometry:point and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.73631,49.405,8.7030,49.431,8.721989,49.4072,8.704561,49.403252")
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
	public void test_1hrrii3efl8om_lengthDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_mirror,hut")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-02-14")
				.queryParam("bpolys", "F:8.704561,49.403252,8.747,49.409146,8.70357,49.425,8.7014,49.432005,8.704561,49.403252|mQiXH:8.704561,49.403252,8.720,49.411,8.7044,49.437,8.70459,49.4348,8.704561,49.403252")
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
	public void test_rl2duks8ojfp_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,service")
				.queryParam("bboxes", "8.6909,49.416,8.73141,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "28")
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
	public void test_1jenqw5w9592t_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary")
				.queryParam("bboxes", "E:8.695,49.417,8.70212,49.397")
				.queryParam("time", "2013-06-25")
				.queryParam("bpolys", "8.704561,49.403252,8.70789,49.4154,8.704815,49.42244,8.725,49.417,8.704561,49.403252|8.704561,49.403252,8.7224,49.4397,8.7204,49.435,8.730,49.4284,8.704561,49.403252|8.704561,49.403252,8.741,49.436,8.703,49.40985,8.741,49.428695,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_t4cb7b0177ld_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.726,49.42187,1|8.709,49.410381,75")
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
	public void test_rhofdrkippwk_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or geometry:line or not id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-05-25")
				.queryParam("bcircles", "8.730,49.420,4|8.7286,49.43295,3")
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
	public void test_t87e8jvcf5fd_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.691,49.413094,8.720,49.397|8.651,49.426,8.707,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
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
	public void test_s4v3ygkcsuns_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "R:8.7431,49.425,4")
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
	public void test_urmeg8i667g3_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes=* and type:relation")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "8.711,49.424443,2|8.7056,49.419,5")
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
	public void test_1h7o4yuxekxgm_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "emergency_access_point,bus_stop")
				.queryParam("bboxes", "8.6666,49.4076,8.7374,49.381|8.651707,49.4208,8.73309,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
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
	public void test_sksugksgjlnp_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,construction")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "48")
				.queryParam("bcircles", "smypl:8.7268,49.4356,6")
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
	public void test_qxw4xbfvwjfq_lengthDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "Eu:8.725,49.409,3|e:8.736,49.4120,58")
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
	public void test_t4yi6df3vfq9_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.7151,49.4125,8.7041,49.4056,8.701,49.4053,8.704561,49.403252|8.704561,49.403252,8.7047,49.4208,8.7045,49.434,8.712,49.403,8.704561,49.403252|8.704561,49.403252,8.742,49.410741,8.706298,49.433,8.7256,49.41786,8.704561,49.403252")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "LSF:8.72233,49.405,5")
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
	public void test_qdqip9zl5j6p_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"IQgnY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.706368,49.40000],[8.7335,49.405],[8.728,49.41506],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yNa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74540,49.409],[8.731465,49.410],[8.727,49.429],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "54")
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
	public void test_qhnv7inx8ggy_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* and length:( .. 100)")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "8.7452,49.4068,5|8.710,49.421,44|8.712,49.4270,3|8.707499,49.43444,77")
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
	public void test_1jxzfgzvtbe45_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-06-01")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.413],[8.714419,49.41979],[8.722822,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"vCoQk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7121,49.41000],[8.721,49.4174],[8.7043,49.420],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7051,49.4116],[8.7087,49.411],[8.7098,49.410],[8.704561,49.403252]]]}}]}")
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
	public void test_1k1zjr61iv22c_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-11-28")
				.queryParam("bpolys", "zzQa:8.704561,49.403252,8.7275,49.4303,8.728,49.425,8.709,49.43724,8.704561,49.403252")
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
	public void test_1hvbk0t1lhvzl_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Wm:8.6500,49.401,8.72866,49.388|R:8.671,49.413,8.71244,49.388|rAIF:8.67438,49.420,8.7314,49.399")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_1iuvi05a1dv03_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* and type:relation or not length:( .. 100)")
				.queryParam("bboxes", "BGMb:8.665163,49.414850,8.74812,49.3896")
				.queryParam("time", "2012-05-07")
				.queryParam("timeout", "63")
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
	public void test_vbprxa48md0k_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or not geometry:line and not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "NAD:8.704561,49.403252,8.72967,49.42957,8.7202,49.434,8.700,49.42817,8.704561,49.403252|IX:8.704561,49.403252,8.727,49.409,8.7116,49.4170,8.7010,49.4232,8.704561,49.403252|WymV:8.704561,49.403252,8.7021,49.410,8.704,49.422,8.70471,49.406,8.704561,49.403252")
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
	public void test_rl53ahsnsf3a_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2012-09-25")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "D:8.727,49.4006,1|ZdZJk:8.700,49.4390,6|ChPg:8.716,49.408,8")
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
	public void test_qeevmsd19tnq_lengthDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed!=*")
				.queryParam("time", "2009-05-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zuT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.400874],[8.702,49.418921],[8.7384,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"kL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7361,49.4263],[8.723,49.43589],[8.704502,49.4294],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"EZf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71391,49.429],[8.722,49.41638],[8.718,49.4249],[8.704561,49.403252]]]}}]}")
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
	public void test_qe6kaz0kz1vd_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("keys", "highway")
				.queryParam("timeout", "93")
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
	public void test_1hbli8uc1jome_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ldj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.4040],[8.747,49.40959],[8.704,49.4331],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"wNf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.408],[8.7457,49.426],[8.701,49.41881],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7090,49.41088],[8.72517,49.42825],[8.704,49.4030],[8.704561,49.403252]]]}}]}")
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
	public void test_ubon64eliofm_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-05-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"t\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71934,49.402067],[8.704329,49.4360],[8.7043,49.403835],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"VKxIl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722,49.433],[8.745,49.429],[8.746,49.42982],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Xj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702184,49.420],[8.715,49.430],[8.718158,49.411],[8.704561,49.403252]]]}}]}")
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
	public void test_trwv1htjzm0o_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-02-20")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "sYDD:8.704,49.407,758")
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
	public void test_u7oitpdgia0l_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-04-27")
				.queryParam("bpolys", "8.704561,49.403252,8.717,49.42303,8.704,49.40760,8.729,49.4374,8.704561,49.403252|8.704561,49.403252,8.711,49.420221,8.738,49.424,8.708,49.43989,8.704561,49.403252")
				.queryParam("timeout", "23")
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
	public void test_u8anuu5yv8s5_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* and type:node and length:( .. 100)")
				.queryParam("bboxes", "kf:8.664147,49.4017,8.73383,49.3942|ICF:8.654,49.42934,8.717,49.399")
				.queryParam("format", "geojson")
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
	public void test_rl558pdiv5tk_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.672881,49.419,8.75447,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "46")
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
	public void test_1iyn904zb7wvt_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("bboxes", "DR:8.658671,49.426,8.728,49.383|M:8.6650,49.406149,8.755,49.3828")
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
	public void test_t8a5b44i8wfp_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "CRM:8.6882,49.4262,8.727,49.387")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-02-21")
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
	public void test_1jyb0f94i7ar4_lengthDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.675437,49.417,8.735,49.3917")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-05-03")
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
	public void test_qdy91ubt6pti_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=*")
				.queryParam("bboxes", "vUtT:8.689,49.41532,8.734,49.382|XyGuk:8.688875,49.4169,8.7186,49.380|IYwW:8.668,49.404207,8.729489,49.386")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "W:8.704561,49.403252,8.70226,49.439,8.712,49.400,8.7490,49.427,8.704561,49.403252|U:8.704561,49.403252,8.7153,49.4240,8.706,49.4221,8.70470,49.419,8.704561,49.403252|rxfma:8.704561,49.403252,8.7494,49.439,8.748,49.41111,8.7239,49.424,8.704561,49.403252")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "8.702,49.408,399|8.746,49.431,3|8.749675,49.413,64|8.701,49.41968,2")
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
	public void test_1hbm0mx5g1y02_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-12-10")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "dzD:8.73881,49.42683,41")
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
	public void test_vey5acsjmtrl_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "gZcg:8.730,49.4217,7|Db:8.7058,49.4283,16532550663")
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
	public void test_t4nwm2i0l5bq_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* or not id:(1 .. 9999)")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "8.7447,49.4360,4|8.747389,49.405,37")
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
	public void test_qdw1vdxzynoj_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "DO:8.684,49.400,8.72040,49.387|QI:8.688,49.414,8.700,49.383|S:8.67331,49.429,8.746,49.39657|S:8.689,49.429,8.759,49.3862")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "89")
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
	public void test_u88gsxxd8fn9_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2017-09-23")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "APahO:8.726574,49.4003,8")
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
	public void test_qeeyqz9v35up_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* or not area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "n:8.746391,49.426,8")
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
	public void test_1iv9axawf50mb_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or not geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.427,8.742,49.425,8.706,49.41539,8.704561,49.403252|8.704561,49.403252,8.7054,49.42027,8.7042,49.400313,8.733,49.429,8.704561,49.403252|8.704561,49.403252,8.709,49.406,8.7048,49.439,8.736,49.4368,8.704561,49.403252")
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
	public void test_1jyoejod1l1km_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=*")
				.queryParam("bpolys", "j:8.704561,49.403252,8.700,49.4236,8.703,49.412410,8.746054,49.418,8.704561,49.403252|i:8.704561,49.403252,8.735,49.408,8.731548,49.4023,8.705416,49.4128,8.704561,49.403252|oZ:8.704561,49.403252,8.714,49.423,8.7244,49.417,8.704,49.427332,8.704561,49.403252")
				.queryParam("timeout", "58")
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
	public void test_skyec2ns8axx_lengthGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "20")
				.queryParam("bcircles", "ShsZk:8.736,49.4169,2")
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
	public void test_1ib6hkfzvn8f6_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6867,49.428,8.7501,49.392|8.66240,49.4283,8.757,49.399")
				.queryParam("values", "secondary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-12-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7119,49.427],[8.704,49.421],[8.7074,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"D\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74915,49.421671],[8.748,49.404367],[8.7437,49.4311],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720044,49.4119],[8.71467,49.414888],[8.716,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "48")
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
	public void test_uvgxk23qi9f8_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "lg:8.707,49.4024,8|F:8.746,49.4272,3")
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
	public void test_1ji50jz5tw2ew_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.7444,49.41030,58|8.723,49.4370,54")
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
	public void test_s4p3kshbjfc3_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Ny:8.673,49.420,8.7355,49.3967")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
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
	public void test_qhtd9kpy23c3_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.7357,49.427885,8.7057,49.404,8.704,49.4367,8.704561,49.403252|8.704561,49.403252,8.7437,49.409,8.700,49.4359,8.737,49.4104,8.704561,49.403252|8.704561,49.403252,8.71666,49.428,8.715029,49.430853,8.7050,49.422,8.704561,49.403252")
				.queryParam("timeout", "54")
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
	public void test_skvm8emnaxx2_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7042,49.414],[8.705,49.4001],[8.740640,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717,49.408],[8.729,49.4221],[8.7481,49.422985],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "50")
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
	public void test_1hbah5yzqsfn4_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.664,49.41240,8.733,49.392|8.6902,49.4223,8.7379,49.381|8.660375,49.40596,8.71922,49.392")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "80")
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
	public void test_t4yimxa5tmwh_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes!=* or geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("time", "2009-06-30")
				.queryParam("bpolys", "X:8.704561,49.403252,8.7394,49.43548,8.7317,49.4073,8.738861,49.4393,8.704561,49.403252|DO:8.704561,49.403252,8.7490,49.421040,8.706,49.420557,8.7104,49.4021,8.704561,49.403252|yuesm:8.704561,49.403252,8.747,49.405,8.703580,49.408,8.726,49.408149,8.704561,49.403252")
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
	public void test_1iuviposdvmsw_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "yX:8.7478,49.431854,2|BIq:8.711,49.422,1")
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
	public void test_1iykka18efay8_lengthGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* and type:way and length:( .. 100)")
				.queryParam("time", "2014-06-04")
				.queryParam("bpolys", "G:8.704561,49.403252,8.736,49.43367,8.7225,49.417481,8.70459,49.4223,8.704561,49.403252")
				.queryParam("timeout", "36")
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
	public void test_rkxaobkt3pyu_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,give_way")
				.queryParam("filter", "ref!=* and not geometry:point")
				.queryParam("bboxes", "lQQ:8.6686,49.422,8.730,49.3972|rEv:8.6775,49.409,8.7223,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-08-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7215,49.433],[8.710,49.4095],[8.716,49.41363],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"XPcm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710242,49.41393],[8.702,49.40668],[8.704,49.42166],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "A:8.709,49.4254,6")
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
	public void test_vevvg7snalva_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2018-01-28")
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
	public void test_1iv3tpmcq7ry1_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2011-04-17")
				.queryParam("bpolys", "ZySKo:8.704561,49.403252,8.717,49.424,8.727,49.412,8.747,49.432,8.704561,49.403252|W:8.704561,49.403252,8.736,49.418,8.70413,49.423,8.7246,49.4071,8.704561,49.403252|uIF:8.704561,49.403252,8.7116,49.4083,8.7495,49.40338,8.703,49.431,8.704561,49.403252")
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
	public void test_qhibq5ib9qw3_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,street_lamp,service")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-01-18")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.705,49.427228,4")
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
	public void test_qdpzaitkgb3p_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "rxli:8.704561,49.403252,8.744020,49.421,8.7387,49.401,8.7392,49.400,8.704561,49.403252|o:8.704561,49.403252,8.714,49.4292,8.704221,49.415,8.703,49.43469,8.704561,49.403252|efggO:8.704561,49.403252,8.725,49.401883,8.7045,49.403,8.704,49.4332,8.704561,49.403252")
				.queryParam("timeout", "81")
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
	public void test_uvbcg05odx6a_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "public,footway,street_lamp")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "O:8.738,49.4029,60")
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
	public void test_1jia0al2xmz3r_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "OF:8.6834,49.427,8.737942,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-12-07")
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
	public void test_1iuysenqizs4y_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2013-01-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7266,49.414],[8.70427,49.418],[8.703,49.405868],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"S\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.415],[8.72455,49.4052],[8.70925,49.404],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "21")
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
	public void test_uvk7934iwew3_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-08-22")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.4389,8.737,49.4236,8.701,49.4106,8.704561,49.403252")
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
	public void test_1ibkcg3cjn034_lengthGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office,dormitory,bus_stop")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-11-17")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "k:8.713042,49.430,60|C:8.712,49.412,436")
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
	public void test_ubmf7adh9t9i_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "8.74925,49.43643,5")
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
	public void test_rhiuq9g31o4h_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=*")
				.queryParam("bboxes", "8.650,49.424848,8.7164,49.385")
				.queryParam("values", "living_street")
				.queryParam("bcircles", "Yg:8.74897,49.4335,6")
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
	public void test_1hbiqgq8a7968_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-08-19")
				.queryParam("bpolys", "8.704561,49.403252,8.716407,49.4347,8.709,49.437,8.704529,49.415992,8.704561,49.403252")
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
	public void test_t4yf1yoxp4kj_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-10-12")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "vWd:8.701,49.401,6|dmgf:8.7452,49.4046,5|DIwMt:8.7395,49.415,9|i:8.707,49.432399,7")
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
	public void test_1hrs2drjaxg6r_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,service")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-05-03")
				.queryParam("bcircles", "i:8.734,49.415,8|Emvf:8.72340,49.4001,1|HmCh:8.71502,49.432,5")
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
	public void test_rhr4i0byyctg_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,crossing,station")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-08-31")
				.queryParam("timeout", "65")
				.queryParam("bcircles", "8.724,49.415,90|8.741,49.4146,5|8.737,49.404,8")
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
	public void test_sksailfb9nqa_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"g\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7183,49.423],[8.7000,49.401],[8.747,49.401],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"X\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.4231],[8.70451,49.428],[8.70419,49.419],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"KQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7105,49.431],[8.70574,49.410],[8.7398,49.424715],[8.704561,49.403252]]]}}]}")
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
	public void test_1jyg0hvhsygc8_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,pedestrian,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("bcircles", "8.71487,49.409,8")
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
	public void test_qxfhi66oooxf_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary_link,demolished,station")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "s:8.704561,49.403252,8.729,49.43978,8.714,49.417,8.748754,49.4313,8.704561,49.403252|RLsZS:8.704561,49.403252,8.7149,49.423,8.704,49.415,8.7366,49.410,8.704561,49.403252|uQN:8.704561,49.403252,8.734,49.412,8.7136,49.407,8.7129,49.403,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_1jyitfqcte6gh_lengthGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-09-05")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "Ri:8.722,49.4292,4")
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
	public void test_1jenpnnefzz1z_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("groupByKeys", "foot,surface")
				.queryParam("bcircles", "8.70605,49.4351,82")
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
	public void test_sobu5vftwt46_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=*")
				.queryParam("time", "2014-03-09")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "zEq:8.7197,49.405646,3")
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
	public void test_uvenp9u43q5t_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("time", "2015-12-01")
				.queryParam("timeout", "63")
				.queryParam("groupByKeys", "landuse,source:maxspeed,turn")
				.queryParam("bcircles", "8.7358,49.423,6")
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
	public void test_1iun7dvff5lyc_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-08-27")
				.queryParam("bpolys", "8.704561,49.403252,8.7457,49.401,8.71800,49.422,8.718,49.430580,8.704561,49.403252")
				.queryParam("groupByKeys", "smoothness")
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
	public void test_1jeyvxya0iu76_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-04-13")
				.queryParam("bpolys", "V:8.704561,49.403252,8.7457,49.404,8.74552,49.41572,8.737,49.4105,8.704561,49.403252|G:8.704561,49.403252,8.735,49.4136,8.7040,49.40521,8.71789,49.4093,8.704561,49.403252")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "addr:postcode,network")
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
	public void test_1k1wpkgvcthdk_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-08-03")
				.queryParam("bpolys", "8.704561,49.403252,8.73637,49.408,8.732,49.4373,8.730065,49.408947,8.704561,49.403252|8.704561,49.403252,8.7488,49.4297,8.726,49.431,8.745,49.431,8.704561,49.403252|8.704561,49.403252,8.729688,49.42899,8.702,49.4193,8.7051,49.421850,8.704561,49.403252")
				.queryParam("timeout", "79")
				.queryParam("groupByKeys", "destination,tracktype,lanes:backward")
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
	public void test_s1gonoyfkp4k_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2012-05-25")
				.queryParam("groupByKeys", "lanes:forward,turn,addr:street")
				.queryParam("bcircles", "8.73266,49.41867,4")
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
	public void test_vbt1b8hsahpx_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-07-11")
				.queryParam("groupByKeys", "sidewalk,landuse")
				.queryParam("bcircles", "f:8.717,49.4148,2")
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
	public void test_r17s2fl8mvjk_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cRK:8.675506,49.424,8.700159,49.384|lMmu:8.6577,49.404,8.738,49.3912|o:8.677,49.41853,8.7510,49.3934|W:8.6932,49.40606,8.754,49.393644")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-09-20")
				.queryParam("timeout", "75")
				.queryParam("groupByKeys", "lit,name")
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
	public void test_vey62sv12be9_lengthGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-11-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"A\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7420,49.439],[8.706300,49.40626],[8.700496,49.4188],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"GU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7485,49.400847],[8.708,49.40605],[8.72203,49.4283],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "building,network,bicycle")
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
	public void test_1hbishkhgjbcj_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or type:way or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Ql:8.666,49.40141,8.702,49.3932")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("time", "2010-07-16")
				.queryParam("bpolys", "qLjXd:8.704561,49.403252,8.712,49.438,8.7496,49.404,8.718,49.414,8.704561,49.403252|x:8.704561,49.403252,8.702,49.424,8.7253,49.4205,8.710,49.419,8.704561,49.403252")
				.queryParam("groupByKeys", "lanes:forward,type")
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
	public void test_1iycppxqovckm_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* and geometry:polygon and id:(1 .. 9999)")
				.queryParam("bboxes", "KFXz:8.69293,49.4177,8.711,49.385|vNGW:8.654,49.40230,8.725,49.385|F:8.69951,49.4013,8.7430,49.399|kGNc:8.6670,49.42183,8.703,49.392")
				.queryParam("format", "json")
				.queryParam("time", "2014-06-04")
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
	public void test_qdvho56m4i0p_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6571,49.424951,8.7408,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("time", "2015-08-18")
				.queryParam("timeout", "67")
				.queryParam("groupByKeys", "oneway,tracktype")
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
	public void test_1ji1r8jklb8me_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4356],[8.701,49.426105],[8.702,49.426],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7046,49.414],[8.721096,49.43096],[8.733,49.430],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "99")
				.queryParam("groupByKeys", "building,sidewalk,addr:postcode")
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
	public void test_trwwwypdw6d2_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("groupByKeys", "turn:lanes,sidewalk")
				.queryParam("bcircles", "hEx:8.7104,49.425,4|yW:8.725,49.42661,8|a:8.746,49.42879,8")
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
	public void test_1jifj2euaztwz_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6827,49.402,8.71801,49.397")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "31")
				.queryParam("groupByKeys", "lanes:forward,sidewalk")
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
	public void test_1iberq4ffvr5g_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "88")
				.queryParam("groupByKeys", "lit,sidewalk,lanes")
				.queryParam("bcircles", "8.717,49.414862,30")
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
	public void test_rkzlasosntq0_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "VwfjX:8.657,49.41113,8.7154,49.382|g:8.664,49.412,8.705,49.3857|ln:8.6966,49.410,8.733,49.380|uyODH:8.6836,49.4158,8.759,49.3805")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("time", "2010-11-28")
				.queryParam("timeout", "77")
				.queryParam("groupByKeys", "destination,oneway,smoothness")
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
	public void test_soelh70o290z_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NQx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7411,49.4094],[8.718,49.416],[8.705,49.423258],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "94")
				.queryParam("groupByKeys", "surface,network")
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
	public void test_rhowx7fli33t_lengthGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2010-12-15")
				.queryParam("timeout", "78")
				.queryParam("groupByKeys", "lanes,tracktype,lanes:forward")
				.queryParam("bcircles", "Pvy:8.729,49.404,1")
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
	public void test_1h7lfwp36s9ip_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,pedestrian,platform")
				.queryParam("filter", "maxspeed!=* and geometry:point or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.739,49.405,8.703,49.404,8.70486,49.438,8.704561,49.403252|8.704561,49.403252,8.704,49.425,8.711,49.411,8.7180,49.413319,8.704561,49.403252")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "DqbS:8.73912,49.4301,92")
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
	public void test_1hv2otjfc85dj_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("time", "2015-10-29")
				.queryParam("bpolys", "SP:8.704561,49.403252,8.705170,49.412,8.7095,49.411,8.704560,49.419,8.704561,49.403252|DD:8.704561,49.403252,8.702,49.431,8.7192,49.4067,8.703,49.4203,8.704561,49.403252|S:8.704561,49.403252,8.7075,49.434,8.743,49.418,8.747,49.4332,8.704561,49.403252")
				.queryParam("bcircles", "Wk:8.742,49.417,7")
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
	public void test_vbk7ochl8xm8_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "speed_camera,service,primary")
				.queryParam("bboxes", "8.6741,49.423613,8.756719,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("time", "2015-04-22")
				.queryParam("timeout", "89")
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
	public void test_qxtvxn4eo3e9_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-10-22")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "Ju:8.7296,49.41038,4")
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
	public void test_1jetcpj2dioo3_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-09-18")
				.queryParam("bpolys", "8.704561,49.403252,8.7050,49.430835,8.7309,49.4300,8.732,49.4248,8.704561,49.403252|8.704561,49.403252,8.705725,49.437,8.7044,49.40968,8.7072,49.417,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_sl3dop1kvi9g_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "chapel,street_lamp,ship")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2018-04-23")
				.queryParam("bpolys", "8.704561,49.403252,8.731,49.40022,8.736,49.402,8.720,49.430,8.704561,49.403252|8.704561,49.403252,8.7182,49.402,8.719,49.417,8.7012,49.415923,8.704561,49.403252|8.704561,49.403252,8.7376,49.424,8.7047,49.4042,8.70455,49.43161,8.704561,49.403252")
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
	public void test_t84kwpy89ut3_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "y:8.6928,49.426271,8.7532,49.381|GzE:8.698025,49.402,8.723,49.396")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "73")
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
	public void test_urjmogz8dyk1_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,office,construction")
				.queryParam("bboxes", "r:8.666,49.412008,8.71182,49.3885|ThVIP:8.6792,49.415,8.7219,49.3998")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-07-24")
				.queryParam("timeout", "56")
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
	public void test_s4p2hfuaajar_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-04-24")
				.queryParam("bcircles", "F:8.7271,49.433,8|r:8.705,49.431,1")
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
	public void test_1iyfic49cj5np_lengthGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("time", "2016-04-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"FOZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.422],[8.7005,49.416],[8.707,49.4278],[8.704561,49.403252]]]}}]}")
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
	public void test_us2yozwrf1v5_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.421,8.7076,49.421,8.744,49.424,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_ubjm9d7c2ywp_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop_line,station,dormitory")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-02-21")
				.queryParam("timeout", "78")
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
	public void test_t4sx4yiqpkki_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,stop,house")
				.queryParam("filter", "addr:housenumber=* or geometry:line")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "MWXe:8.704561,49.403252,8.711,49.424,8.7256,49.422,8.718416,49.414850,8.704561,49.403252")
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
	public void test_vbq8dgv1g4ti_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.69859,49.4224,8.72224,49.383|8.6568,49.404,8.757,49.399")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-05-02")
				.queryParam("timeout", "81")
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
	public void test_tol92mim07xt_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,secondary")
				.queryParam("filter", "network!=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2012-05-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"y\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7368,49.4365],[8.732,49.428],[8.7043,49.4030],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71220,49.421],[8.700,49.403],[8.702,49.406],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "82")
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
	public void test_t4l3coyl9fld_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-10-27")
				.queryParam("bpolys", "jESG:8.704561,49.403252,8.7040,49.418,8.704796,49.414,8.7084,49.417,8.704561,49.403252|cmZOB:8.704561,49.403252,8.73038,49.414557,8.723,49.413,8.7037,49.4056,8.704561,49.403252|qEyGM:8.704561,49.403252,8.7125,49.426,8.727,49.426385,8.7041,49.4355,8.704561,49.403252")
				.queryParam("timeout", "32")
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
	public void test_1hbaeftlbfupi_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-12-10")
				.queryParam("bcircles", "L:8.70954,49.42015,1")
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
	public void test_vb43c9qhvbjp_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "construction,synagogue")
				.queryParam("filter", "addr:postcode!=* and geometry:point and length:( .. 100)")
				.queryParam("bboxes", "f:8.682,49.413,8.702,49.38641|k:8.653,49.421585,8.7295,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-02-12")
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
	public void test_qdvjxjiu4pya_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "8.700,49.409,3")
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
	public void test_t81t53n6lohd_lengthGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Mdc:8.69221,49.4073,8.741,49.389|TY:8.678,49.4283,8.746391,49.3907")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-07-22")
				.queryParam("timeout", "74")
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
	public void test_skydy35awbp4_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:line or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.679,49.415,8.727071,49.385")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2008-08-05")
				.queryParam("bpolys", "EfwNV:8.704561,49.403252,8.7333,49.4370,8.745,49.40753,8.704,49.438384,8.704561,49.403252|i:8.704561,49.403252,8.706445,49.404,8.7071,49.4216,8.7081,49.403,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_1iyf0enbgtpwl_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.681,49.405,8.728968,49.395|u:8.6539,49.4235,8.723673,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2015-07-15")
				.queryParam("timeout", "94")
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
	public void test_t49jf7axe3ax_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.402,8.7175,49.43862,8.7090,49.403682,8.704561,49.403252|8.704561,49.403252,8.7377,49.41063,8.705,49.439,8.708,49.43668,8.704561,49.403252")
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
	public void test_1jiflc4aq7k2r_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-05-02")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "Iytwz:8.7466,49.423,46")
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
	public void test_s1dxqg2nw86a_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-10-15")
				.queryParam("bpolys", "8.704561,49.403252,8.738,49.418,8.738,49.4235,8.719943,49.437,8.704561,49.403252|8.704561,49.403252,8.727,49.401,8.716,49.438,8.703,49.439,8.704561,49.403252|8.704561,49.403252,8.7291,49.428970,8.721040,49.43447,8.703,49.428572,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_qxyvly6jedeq_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "QPSN:8.692,49.4093,8.739,49.393")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-07-19")
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
	public void test_s1b36010359i_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-05-02")
				.queryParam("bpolys", "8.704561,49.403252,8.703,49.4017,8.707,49.425,8.722,49.402,8.704561,49.403252|8.704561,49.403252,8.732,49.418,8.707391,49.432,8.7020,49.4204,8.704561,49.403252|8.704561,49.403252,8.72481,49.401,8.73453,49.426,8.704577,49.408,8.704561,49.403252")
				.queryParam("timeout", "25")
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
	public void test_vbpohuc7qo2q_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.7002,49.4358,3|8.70311,49.421,69|8.70875,49.407,9|8.749,49.41708,7")
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
	public void test_t89mx3bujpt2_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-05-09")
				.queryParam("bcircles", "z:8.702,49.4242,6|f:8.708841,49.4346,72|Y:8.738671,49.420,148714025")
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
	public void test_u8b7sxsw5qgn_lengthGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zWDPC:8.683988,49.4140,8.729481,49.380|LF:8.69775,49.4039,8.757903,49.3819|P:8.65194,49.4063,8.753,49.384501")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
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
	public void test_s164c5nmeijn_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "ZedMF:8.6635,49.4193,8.70993,49.393|ija:8.681,49.42512,8.711,49.395|Sw:8.6723,49.425,8.716,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "Pje:8.704561,49.403252,8.732,49.405,8.727895,49.4298,8.723,49.4327,8.704561,49.403252|G:8.704561,49.403252,8.72234,49.424308,8.704,49.4376,8.700,49.400599,8.704561,49.403252|CEwTg:8.704561,49.403252,8.716085,49.409,8.700,49.432,8.728,49.4381,8.704561,49.403252")
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
	public void test_ubgdelc3yu5z_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "k:8.6582,49.425,8.712,49.397|wBK:8.67002,49.419,8.7503,49.39108|sB:8.661,49.423,8.735,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "62")
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
	public void test_1jeffyn51envp_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.7394,49.41756,8.700,49.405,8.7067,49.4291,8.704561,49.403252")
				.queryParam("timeout", "71")
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
	public void test_sl0oylomwtvc_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "a:8.7177,49.413,7|e:8.7051,49.4243,627")
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
	public void test_rhaijz2fxbvo_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "UDQN:8.672,49.41066,8.7528,49.393")
				.queryParam("keys", "highway")
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
	public void test_r1ifi26d7sxj_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=*")
				.queryParam("bboxes", "8.6510,49.415,8.710748,49.3889")
				.queryParam("timeout", "85")
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
	public void test_ubooa0sjgkzb_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-03-15")
				.queryParam("bcircles", "nDQg:8.740,49.41386,9|w:8.732,49.421,2|ltNwO:8.70711,49.421,6|u:8.707,49.414,228075298")
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
	public void test_1iuvipiui60yq_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and length:( .. 100)")
				.queryParam("time", "2018-01-09")
				.queryParam("bpolys", "SXIxI:8.704561,49.403252,8.706,49.400,8.74343,49.429,8.7370,49.4350,8.704561,49.403252|o:8.704561,49.403252,8.724,49.438,8.733,49.43713,8.714,49.42919,8.704561,49.403252|ryg:8.704561,49.403252,8.7267,49.4245,8.701,49.400448,8.704560,49.406809,8.704561,49.403252")
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
	public void test_u805st6xqer7_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.688940,49.406498,8.707,49.39540")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_s0xt0ogq1jjp_lengthGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:backward=*")
				.queryParam("format", "geojson")
				.queryParam("time", "2018-02-03")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "Zp:8.7404,49.4091,8")
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
	public void test_urgsw0t5ep9f_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=* or length:( .. 100)")
				.queryParam("bboxes", "u:8.658,49.421,8.711200,49.395")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "turn:lanes=*")
				.queryParam("time", "2018-02-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ve\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.401],[8.7248,49.429],[8.710,49.4294],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "footway")
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
	public void test_1hrmig531u8h0_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "zFY:8.704561,49.403252,8.734,49.414,8.738,49.410,8.734,49.40962,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "pedestrian")
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
	public void test_qxnue5lcdgdy_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "HiVwJ:8.667,49.413,8.73389,49.381")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-03-28")
				.queryParam("keys2", "highway")
				.queryParam("values2", "service")
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
	public void test_1k1tykt6tpph2_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "line,polygon,other")
				.queryParam("filter2", "surface!=* or length:( .. 100)")
				.queryParam("time", "2007-12-27")
				.queryParam("bcircles", "uFU:8.704,49.439059,88")
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
	public void test_vbsg7doypdtk_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=*")
				.queryParam("types2", "node,relation")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-07-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JtJKT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7377,49.416],[8.713,49.415],[8.74551,49.41232],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "83")
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
	public void test_u8apf2jyf5fd_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "SBlxT:8.704561,49.403252,8.708,49.432,8.7041,49.4206,8.741,49.41656,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "40")
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
	public void test_r1fmk70mv29i_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode!=* or type:node")
				.queryParam("bboxes", "8.657,49.418,8.719479,49.39396|8.6900,49.41835,8.707,49.38883|8.6966,49.412952,8.7055,49.390|8.680,49.406,8.717,49.3935")
				.queryParam("format", "json")
				.queryParam("filter2", "barrier!=* or geometry:point and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_1h7j64wx0ibtt_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "B:8.704561,49.403252,8.71922,49.409,8.7419,49.417,8.735,49.4373,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "65")
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
	public void test_urupb85szc4z_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "lanes!=* or id:(1 .. 9999)")
				.queryParam("time", "2010-06-30")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "J:8.7071,49.426,4")
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
	public void test_rh7qurwmugkj_lengthRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Jm:8.66292,49.406017,8.713,49.397")
				.queryParam("types2", "point,polygon,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "surface=* and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "81")
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
	public void test_1iyq347tv9dnp_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.683,49.409,8.71109,49.384")
				.queryParam("types2", "point,")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-01-12")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "98")
				.queryParam("values2", "service")
				.queryParam("bcircles", "VK:8.705,49.420,8")
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
	public void test_t4ctl9ho6g6c_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-05-05")
				.queryParam("bpolys", "zHYnM:8.704561,49.403252,8.741,49.430581,8.7475,49.438,8.700499,49.429,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "73")
				.queryParam("values2", "track")
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
	public void test_1if0jldlyzsjc_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "mniNa:8.74128,49.4348,2")
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
	public void test_qy4xer373rxt_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.68151,49.424,8.75652,49.3936")
				.queryParam("types2", "point,line,")
				.queryParam("filter2", "name=* and type:way")
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
	public void test_to7bh5mav8z7_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and type:node or area:(1.0 .. 1E6)")
				.queryParam("time", "2012-09-18")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "x:8.729,49.415,9|xjB:8.735,49.42698,8|nVF:8.744,49.40494,8|MR:8.702,49.42199,861593368")
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
	public void test_ure0seeih5ww_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "landuse=* and type:relation")
				.queryParam("time", "2015-02-13")
				.queryParam("bcircles", "zo:8.732,49.429,50|AY:8.721,49.425,33|BE:8.729587,49.411,9|Sr:8.732161,49.402,703")
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
	public void test_u857tei2d2d1_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "kB:8.6823,49.419,8.754,49.386|X:8.6742,49.407,8.725,49.3890")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "91")
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
	public void test_1jecq20ngpfec_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.653854,49.4163,8.700868,49.396")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-08-22")
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
	public void test_rhaimk4bgu9g_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "v:8.6947,49.415,8.728,49.3880|yc:8.6878,49.412,8.732325,49.389")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("filter2", "ref!=*")
				.queryParam("time", "2010-09-18")
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
	public void test_sl0o91w92fy0_lengthRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("values2", "speed_camera")
				.queryParam("bcircles", "dN:8.708881,49.426,936")
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
	public void test_urgtqhh8ox14_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "qMG:8.704561,49.403252,8.719718,49.416501,8.705,49.4058,8.742336,49.4043,8.704561,49.403252|q:8.704561,49.403252,8.737,49.421000,8.708,49.4191,8.7384,49.435,8.704561,49.403252")
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
	public void test_u7zl524hg95u_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and not area:(1.0 .. 1E6)")
				.queryParam("types2", "point,other")
				.queryParam("filter2", "service=driveway or id:(1 .. 9999)")
				.queryParam("time", "2010-05-28")
				.queryParam("bpolys", "8.704561,49.403252,8.703980,49.40847,8.742,49.4284,8.7318,49.421,8.704561,49.403252|8.704561,49.403252,8.744,49.438,8.700,49.41631,8.7051,49.43084,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "75")
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
	public void test_r1cv6ea1az50_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-04-08")
				.queryParam("keys2", "highway")
				.queryParam("values2", "living_street")
				.queryParam("bcircles", "kN:8.740,49.402,21|Q:8.724379,49.42525,16|O:8.737,49.411654,3")
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
	public void test_1hv38dfd45un6_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Osrq:8.655982,49.417,8.7018,49.3989")
				.queryParam("types2", "node,way,relation")
				.queryParam("format", "json")
				.queryParam("filter2", "foot!=* and type:way")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "76")
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
	public void test_u8aqks1ng6yb_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.68155,49.426,8.7519,49.38557|8.668269,49.427,8.742,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("filter2", "tracktype!=* or not id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "27")
				.queryParam("values2", "cycleway")
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
	public void test_qhhrs6hfc7qs_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6664,49.42053,8.725,49.397")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "foot=* and type:node and length:( .. 100)")
				.queryParam("time", "2012-07-30")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "60")
				.queryParam("values2", "secondary_link")
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
	public void test_t4svw273vw4m_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("values", "platform")
				.queryParam("filter2", "tracktype=*")
				.queryParam("time", "2017-01-12")
				.queryParam("bpolys", "8.704561,49.403252,8.7301,49.406,8.704,49.40166,8.746,49.423,8.704561,49.403252")
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
	public void test_urjkc62del2w_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and geometry:point")
				.queryParam("bboxes", "8.671,49.4237,8.751,49.395")
				.queryParam("types2", "polygon,")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "sidewalk=* or geometry:line")
				.queryParam("time", "2010-08-19")
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
	public void test_1hr84judfnvar_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or type:way")
				.queryParam("bboxes", "ALCfb:8.678,49.418,8.7255,49.389|S:8.685,49.41046,8.737,49.392")
				.queryParam("types2", "point,polygon,other")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
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
	public void test_1iaxnxie2ewde_lengthRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-02-11")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "93")
				.queryParam("values2", "path")
				.queryParam("bcircles", "X:8.7474,49.419216,8")
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
	public void test_veymfnzipoa9_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6715,49.429,8.717556,49.398")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "primary")
				.queryParam("filter2", "name!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2015-10-05")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.743,49.402,8")
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
	public void test_ubj2gjn8o7qt_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "XL:8.66348,49.422,8.737203,49.382|yQSE:8.66144,49.404713,8.7147,49.392|U:8.691,49.414,8.70903,49.380")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* and type:relation and area:(1.0 .. 1E6)")
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
	public void test_vb9l9m27fbcm_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ot:8.65615,49.406,8.758,49.384")
				.queryParam("types2", "point,polygon,")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "maxspeed=* and area:(1.0 .. 1E6)")
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
	public void test_qhqmze4xbvhs_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.702,49.431,8.743,49.4221,8.703,49.402,8.704561,49.403252|8.704561,49.403252,8.74681,49.421,8.708,49.4383,8.7166,49.4315,8.704561,49.403252")
				.queryParam("timeout", "84")
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
	public void test_s50oakmatlpy_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("filter2", "addr:housenumber!=*")
				.queryParam("time", "2016-11-30")
				.queryParam("bpolys", "8.704561,49.403252,8.738564,49.424,8.732,49.4208,8.727,49.415,8.704561,49.403252|8.704561,49.403252,8.722,49.413,8.700,49.427,8.734,49.41824,8.704561,49.403252|8.704561,49.403252,8.723,49.4203,8.72442,49.421,8.7047,49.427,8.704561,49.403252")
				.queryParam("timeout", "98")
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
	public void test_1jew3rrhof52c_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("filter2", "maxspeed!=* and type:way")
				.queryParam("bpolys", "sZOwo:8.704561,49.403252,8.744,49.40986,8.709167,49.425143,8.730,49.438029,8.704561,49.403252|YN:8.704561,49.403252,8.710,49.424,8.718060,49.403,8.706,49.4392,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "91")
				.queryParam("values2", "stop_line")
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
	public void test_qhkkbwo004z4_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and id:(1 .. 9999)")
				.queryParam("types2", "node,")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "95")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "8.7348,49.4231,153|8.72197,49.4004,5|8.714,49.404,2|8.717,49.403,1563440633")
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
	public void test_1iv129cg6qyxt_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* and type:node")
				.queryParam("types2", "other")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "building=* and geometry:point or id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"MD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739138,49.41937],[8.707,49.414],[8.703,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tUbU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7373,49.421],[8.744,49.4187],[8.70470,49.4122],[8.704561,49.403252]]]}}]}")
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
	public void test_vf6yjr3rmk4i_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "TKf:8.704561,49.403252,8.706,49.4224,8.702,49.4272,8.718620,49.427,8.704561,49.403252|uowQO:8.704561,49.403252,8.7276,49.413819,8.70450,49.406,8.7052,49.427,8.704561,49.403252|uSJ:8.704561,49.403252,8.725,49.419,8.70451,49.4033,8.730,49.428,8.704561,49.403252")
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
	public void test_rhjdu1nt54yq_lengthRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=* or id:(1 .. 9999)")
				.queryParam("types2", "relation")
				.queryParam("format", "json")
				.queryParam("filter2", "type!=* or length:( .. 100)")
				.queryParam("time", "2009-08-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Vongs\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705,49.43004],[8.713,49.422454],[8.7008,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fKryF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7343,49.431],[8.724109,49.431846],[8.701626,49.4096],[8.704561,49.403252]]]}}]}")
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
	public void test_urmedjv1wylw_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6702,49.426,8.755,49.384")
				.queryParam("values", "give_way")
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
	public void test_uv95q024peg3_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-11-28")
				.queryParam("bpolys", "zebRP:8.704561,49.403252,8.704,49.438,8.7212,49.41733,8.70727,49.432,8.704561,49.403252|yeo:8.704561,49.403252,8.726,49.421700,8.742520,49.4111,8.704,49.405,8.704561,49.403252")
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
	public void test_vevwap7r3qy8_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6645,49.407,8.757153,49.382178|8.6911,49.407,8.7566,49.3854")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "40")
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
	public void test_qy1pc1v248q9_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and type:node")
				.queryParam("format", "json")
				.queryParam("bcircles", "c:8.71341,49.423634,9")
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
	public void test_1jetb7xer7nmt_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "dWb:8.743,49.43645,1|mL:8.7146,49.4369,19")
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
	public void test_1h85ap6qd5agl_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=*")
				.queryParam("format", "csv")
				.queryParam("time", "2015-01-30")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.423,8.702,49.42604,8.7177,49.432,8.704561,49.403252")
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
	public void test_t4f29hfpett2_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.423,8.702,49.42604,8.7177,49.432,8.704561,49.403252")
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
	public void test_rhg2w34vxn3n_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("time", "2013-01-31")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "XyRVu:8.7425,49.439,35|FRNBP:8.716,49.42772,3")
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
	public void test_soel3btuiotu_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.682175,49.409,8.757448,49.3918|8.65499,49.4137,8.752,49.393")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-03-27")
				.queryParam("timeout", "100")
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
	public void test_1iv6l0s07027q_perimeter() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "E:8.737,49.435,186|oxcTB:8.70934,49.42935,3|BG:8.728917,49.400417,2")
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
	public void test_t8a4xayxqnvn_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.685,49.416,8.70606,49.3813")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "t:8.7263,49.4390,7")
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
	public void test_qdspi877n6n9_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "A:8.668,49.402050,8.703665,49.381")
				.queryParam("showMetadata", "yes")
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
	public void test_1iun5g03gbjuh_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-11-11")
				.queryParam("bpolys", "rwrwz:8.704561,49.403252,8.7317,49.414,8.700,49.42431,8.700,49.4164,8.704561,49.403252|P:8.704561,49.403252,8.749241,49.434,8.7044,49.419,8.7039,49.43290,8.704561,49.403252|YLoGv:8.704561,49.403252,8.745,49.401,8.702,49.429174,8.709,49.426,8.704561,49.403252")
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
	public void test_t4f2ni6kkx89_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes!=* and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "uHicK:8.743,49.417,3|y:8.721,49.4045,76")
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
	public void test_uvjqkkdxnp0l_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "jUPAX:8.660,49.403577,8.748,49.39749|y:8.688,49.4021,8.734,49.388|wlQTG:8.674,49.4264,8.726,49.396")
				.queryParam("timeout", "77")
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
	public void test_rhjdfszzbvw4_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-09-07")
				.queryParam("bcircles", "Puccn:8.701,49.405,75")
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
	public void test_ublxck196sky_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "b:8.6682,49.426,8.749,49.383|PAZYQ:8.694136,49.405,8.729278,49.384|hQ:8.672,49.4152,8.713,49.396")
				.queryParam("showMetadata", "true")
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
	public void test_1jyfzpfgri7nd_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.7476,49.42917,8.727,49.433,8.7022,49.436,8.704561,49.403252|8.704561,49.403252,8.712,49.4084,8.7045,49.4243,8.737,49.4208,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_1hb7ndf81a6nt_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=*")
				.queryParam("format", "csv")
				.queryParam("bpolys", "S:8.704561,49.403252,8.711,49.427,8.725,49.4302,8.7463,49.43380,8.704561,49.403252|nTyX:8.704561,49.403252,8.73217,49.424,8.705,49.43692,8.708,49.421,8.704561,49.403252")
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
	public void test_u88fmun8qste_perimeter1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "FdJ:8.65242,49.404,8.724,49.3840|VrjWv:8.6756,49.416055,8.722,49.3837|Oh:8.666,49.4049,8.718357,49.3800")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
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
	public void test_sok3gmbbm9fd_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "tertiary")
				.queryParam("bpolys", "8.704561,49.403252,8.748,49.436792,8.7097,49.414,8.726,49.4363,8.704561,49.403252|8.704561,49.403252,8.7470,49.409527,8.731,49.413,8.70492,49.412596,8.704561,49.403252")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "pD:8.735,49.416,32")
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
	public void test_to7vqnmztzjn_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and type:node")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-10-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"K\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72079,49.401],[8.7259,49.420],[8.7418,49.4017],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"IoeaS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.413],[8.736,49.412],[8.7011,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"l\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.721,49.4348],[8.704,49.422],[8.7472,49.438],[8.704561,49.403252]]]}}]}")
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
	public void test_1k1ziw78k1iec_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or type:node")
				.queryParam("time", "2014-01-09")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.73161,49.424,3|8.720,49.4394,50")
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
	public void test_1hv0hroudzx9y_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or geometry:line")
				.queryParam("bboxes", "UgZmd:8.693,49.416,8.74072,49.380")
				.queryParam("time", "2012-09-26")
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
	public void test_qdsrugu023w9_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "8.741,49.422064,380")
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
	public void test_u7ru2wbzospx_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or type:node and not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.7090,49.434,8|8.713,49.4002,6|8.725,49.408,7|8.738,49.400,562")
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
	public void test_1jy5hqg93h6wn_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-05-28")
				.queryParam("bpolys", "F:8.704561,49.403252,8.7197,49.404276,8.7245,49.400,8.704572,49.408,8.704561,49.403252")
				.queryParam("timeout", "22")
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
	public void test_vf46uef0ik3b_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=*")
				.queryParam("bboxes", "CJ:8.662,49.41593,8.730288,49.3865")
				.queryParam("timeout", "84")
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
	public void test_qxzf0tac7mn7_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.7106,49.410,8.70590,49.418,8.705,49.402,8.704561,49.403252|8.704561,49.403252,8.728,49.4177,8.743,49.412,8.733,49.436,8.704561,49.403252")
				.queryParam("timeout", "37")
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
	public void test_1if12oq1wrtiv_perimeterDensity() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.701,49.4283,5|8.706,49.437,2")
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
	public void test_s4ukv648otid_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn!=* and type:node and length:( .. 100)")
				.queryParam("bboxes", "8.676,49.405053,8.750,49.394|8.6994,49.417,8.736027,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-12-03")
				.queryParam("bpolys", "T:8.704561,49.403252,8.7293,49.42067,8.744861,49.421,8.7052,49.4326,8.704561,49.403252|vv:8.704561,49.403252,8.7033,49.40817,8.7389,49.426809,8.706,49.4068,8.704561,49.403252")
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
	public void test_1hrpaomq2o0tw_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.660596,49.41541,8.754,49.3963")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "33")
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
	public void test_toogwkfwlelu_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "8.722,49.424,145|8.713,49.4125,95|8.738,49.4359,964256686")
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
	public void test_1hrub4tpwafs4_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.656,49.400744,8.715,49.381")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-12-03")
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
	public void test_1iun7dxeg72uo_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.654756,49.425261,8.711514,49.387|8.6839,49.407,8.7463,49.393")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "56")
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
	public void test_qhnuw1zb85ro_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway or length:( .. 100)")
				.queryParam("bboxes", "ZO:8.685,49.423,8.752,49.388|NVgm:8.651,49.4195,8.738,49.399")
				.queryParam("format", "csv")
				.queryParam("time", "2010-01-08")
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
	public void test_tru54yx01c2r_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-05-24")
				.queryParam("bpolys", "8.704561,49.403252,8.734,49.411,8.72589,49.40335,8.7040,49.418950,8.704561,49.403252")
				.queryParam("timeout", "26")
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
	public void test_ursfv4novgip_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.666,49.402,8.71816,49.394")
				.queryParam("keys", "highway")
				.queryParam("time", "2008-04-17")
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
	public void test_toa4fb0rtgdt_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-03-05")
				.queryParam("bcircles", "x:8.72504,49.423,153314195|RoMnz:8.73344,49.4188,96")
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
	public void test_1h7tpd1xn4vhe_perimeterDensity1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vU:8.6712,49.422,8.748,49.391|yvsNt:8.690,49.4163,8.745,49.391|PLtY:8.660,49.409791,8.71528,49.390")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-07-21")
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
	public void test_r1cusd5uls8g_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=* or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-10-20")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71064,49.4123],[8.709844,49.427620],[8.738,49.419908],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "JZcu:8.746,49.4229,6")
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
	public void test_sksdpcoffzom_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or type:way or not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-04-01")
				.queryParam("bpolys", "g:8.704561,49.403252,8.744,49.4152,8.704560,49.43888,8.70456,49.426,8.704561,49.403252|zR:8.704561,49.403252,8.740,49.4235,8.7386,49.4253,8.704837,49.423569,8.704561,49.403252|SsT:8.704561,49.403252,8.705812,49.424,8.737,49.408,8.729,49.427124,8.704561,49.403252")
				.queryParam("timeout", "70")
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
	public void test_uvhgbsmfpsmq_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and type:relation and length:( .. 100)")
				.queryParam("bboxes", "sO:8.66138,49.4142,8.722,49.381")
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
	public void test_skn9qpgp7a77_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bcircles", "eUl:8.725,49.406,9")
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
	public void test_rhrnivyeo4s0_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier=* and geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.651,49.41254,8.73749,49.384|8.652,49.4021,8.759,49.3899")
				.queryParam("showMetadata", "true")
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
	public void test_qxwnn2i1lbom_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and type:node")
				.queryParam("bboxes", "mMq:8.6563,49.411,8.749,49.386|O:8.6563,49.4166,8.706,49.3974")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-07-14")
				.queryParam("timeout", "40")
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
	public void test_qdvkecwa3ak8_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2014-11-08")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "N:8.712,49.421,9|oOSGi:8.727,49.41306,78|d:8.749,49.435,1|f:8.737832,49.423,93")
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
	public void test_qxl302z2wvuc_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7331,49.4305,8.702,49.4112,8.704561,49.405259,8.704561,49.403252|8.704561,49.403252,8.7027,49.407,8.704183,49.42187,8.70450,49.417,8.704561,49.403252|8.704561,49.403252,8.7158,49.42014,8.716,49.423,8.724,49.424309,8.704561,49.403252")
				.queryParam("timeout", "22")
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
	public void test_t49hv8g5q33r_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "zCrut:8.704561,49.403252,8.71168,49.4139,8.70607,49.42910,8.748,49.43536,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_vb6untz79una_perimeterDensityGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("bpolys", "8.704561,49.403252,8.7258,49.42703,8.71099,49.418,8.704561,49.408,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_1ibeaklqrin38_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "B:8.680,49.41230,8.7133,49.383")
				.queryParam("time", "2015-09-09")
				.queryParam("timeout", "94")
				.queryParam("bcircles", "LjdqB:8.724,49.405,4|RP:8.70781,49.410,266574617")
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
	public void test_1jeadvsm7sdpg_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2007-11-05")
				.queryParam("bpolys", "hw:8.704561,49.403252,8.706836,49.42089,8.707967,49.4335,8.739,49.4353,8.704561,49.403252|ptMM:8.704561,49.403252,8.715779,49.434,8.70074,49.425573,8.70746,49.4014,8.704561,49.403252|b:8.704561,49.403252,8.702087,49.439,8.704,49.426,8.701049,49.4079,8.704561,49.403252")
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
	public void test_1jyob14wjpnap_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-06-05")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.402],[8.7161,49.4300],[8.704,49.402],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"PP\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71969,49.4182],[8.700,49.435],[8.700,49.4329],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.427],[8.708,49.413],[8.738,49.409],[8.704561,49.403252]]]}}]}")
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
	public void test_1je9wcark2nhi_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "LE:8.687874,49.408,8.739,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
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
	public void test_r1cvk54n2w6d_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "c:8.704561,49.403252,8.741,49.4385,8.746116,49.408606,8.708,49.428,8.704561,49.403252|jC:8.704561,49.403252,8.711,49.430,8.714,49.408,8.7119,49.411,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_1jyahpxvfm6gl_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface!=* or geometry:line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.4058,8.70434,49.4215,8.709,49.427,8.704561,49.403252")
				.queryParam("timeout", "93")
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
	public void test_1hroqf13suz52_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("bpolys", "pwiOj:8.704561,49.403252,8.728,49.42137,8.713,49.435,8.733,49.423860,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_1iv1jerk42mnt_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "P:8.74642,49.420,5|FO:8.739,49.439,5|uxPeE:8.7170,49.420,6|nHr:8.712,49.424,50")
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
	public void test_1h82kkbwvztpx_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("time", "2014-02-09")
				.queryParam("bpolys", "FdmFk:8.704561,49.403252,8.73500,49.436,8.728,49.40955,8.745177,49.40668,8.704561,49.403252|Da:8.704561,49.403252,8.707,49.412,8.704904,49.430,8.705,49.4338,8.704561,49.403252|yIq:8.704561,49.403252,8.73263,49.41077,8.706,49.41133,8.70829,49.424,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_qy1o5sle2zc1_perimeterDensityGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("time", "2014-11-03")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "Ed:8.712,49.409,6")
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
	public void test_r1ieq5jfdruf_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,house,apartments")
				.queryParam("filter", "lit!=* and not type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "oQwz:8.686,49.420,8.7139,49.399|OgvLO:8.693,49.422,8.728,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-11-23")
				.queryParam("bpolys", "8.704561,49.403252,8.730,49.405,8.704561,49.403,8.70903,49.4398,8.704561,49.403252")
				.queryParam("timeout", "39")
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
	public void test_1hre6c76f7ygl_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.67876,49.418,8.7049,49.3855|8.6848,49.413,8.7557,49.383")
				.queryParam("format", "csv")
				.queryParam("timeout", "63")
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
	public void test_1jy7p8kkcc27t_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hut,pedestrian")
				.queryParam("filter", "highway!=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-11-16")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "8.7222,49.4232,5|8.700,49.433623,83|8.7447,49.405,3|8.72550,49.422,23")
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
	public void test_to539ebcm0de_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,residential,hut")
				.queryParam("filter", "destination!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.692,49.425242,8.7150,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
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
	public void test_1iv9csu438im0_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hotel,civic")
				.queryParam("bboxes", "8.6607,49.421,8.7449,49.3922")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "51")
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
	public void test_t86ud97hsnqt_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,elevator")
				.queryParam("filter", "highway!=* and type:node and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-10-31")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"IWJBX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7377,49.40981],[8.7033,49.4373],[8.70914,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"kHb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.410992],[8.7095,49.436],[8.7092,49.4206],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7034,49.437],[8.722,49.4228],[8.702646,49.4115],[8.704561,49.403252]]]}}]}")
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
	public void test_qec5sq9t51eq_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "T:8.683,49.407923,8.729921,49.384")
				.queryParam("groupByKey", "highway")
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
	public void test_skxx92d7mlie_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hospital,elevator")
				.queryParam("bboxes", "flXOR:8.6998,49.407,8.7593,49.384|gViAR:8.69046,49.406,8.714,49.385|uw:8.659,49.4190,8.752,49.394|dTI:8.667,49.401,8.726,49.38292")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-05-22")
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
	public void test_rl040bv3t7c5_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "pedestrian,cycleway,demolished")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "Z:8.728013,49.429,8")
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
	public void test_rhr6rqklccx1_perimeterDensityGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-04-16")
				.queryParam("bpolys", "w:8.704561,49.403252,8.742,49.408482,8.746,49.431,8.741,49.4291,8.704561,49.403252|d:8.704561,49.403252,8.7122,49.41107,8.730,49.42030,8.716258,49.425,8.704561,49.403252")
				.queryParam("timeout", "87")
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
	public void test_sl6o3no6rx2w_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "crossing")
				.queryParam("time", "2013-02-22")
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
	public void test_trwwwuqtj52c_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-01-24")
				.queryParam("bpolys", "G:8.704561,49.403252,8.733,49.4246,8.704583,49.421,8.727,49.438,8.704561,49.403252|G:8.704561,49.403252,8.73095,49.433361,8.702,49.434219,8.715,49.409644,8.704561,49.403252|v:8.704561,49.403252,8.702,49.4386,8.709,49.4017,8.7003,49.424,8.704561,49.403252")
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
	public void test_qdq0uja1n67s_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=* and type:relation")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2010-01-29")
				.queryParam("bcircles", "T:8.7003,49.434,5|vWm:8.723,49.421,2|XZM:8.71537,49.432,5|aC:8.728,49.4151,1")
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
	public void test_s1bn1ac1pago_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,turning_circle,residential")
				.queryParam("bboxes", "8.6647,49.417,8.7187,49.3903")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-08-06")
				.queryParam("timeout", "24")
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
	public void test_t89mzwbqs6lf_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp,residential")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-02-07")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "zI:8.713,49.439,74")
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
	public void test_t49j1fowdd0y_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* and type:node and not id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-02-01")
				.queryParam("bcircles", "8.719,49.428,7")
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
	public void test_vb3j0hjff1o3_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* and not type:way")
				.queryParam("bboxes", "Zwg:8.659054,49.4217,8.738038,49.383|q:8.650,49.4066,8.72329,49.39064")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2014-08-02")
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
	public void test_1jet99w68va79_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "C:8.704561,49.403252,8.7399,49.438,8.722,49.43605,8.749,49.427,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_1jew1tu7w3h2u_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_mirror,office")
				.queryParam("filter", "foot=* and type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6952,49.411,8.7206,49.385|8.651,49.428786,8.7450,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2012-11-03")
				.queryParam("timeout", "71")
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
	public void test_u7rswyxogwft_perimeterDensityGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,synagogue")
				.queryParam("filter", "addr:city=* or geometry:point")
				.queryParam("bboxes", "bN:8.692,49.424,8.738702,49.392|iN:8.668,49.414934,8.7397,49.3845")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2017-10-30")
				.queryParam("timeout", "36")
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
	public void test_1ji4j322qhulx_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "d:8.704561,49.403252,8.701,49.408,8.73081,49.414,8.704,49.432500,8.704561,49.403252")
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
	public void test_u7ojlnmzofuc_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=*")
				.queryParam("bboxes", "Z:8.656,49.4189,8.755,49.39499|SW:8.671,49.42798,8.743,49.386547")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("bpolys", "nYlVT:8.704561,49.403252,8.7034,49.405,8.704586,49.4382,8.741,49.428,8.704561,49.403252|s:8.704561,49.403252,8.734,49.439079,8.706,49.436,8.741,49.4315,8.704561,49.403252|H:8.704561,49.403252,8.744949,49.4008,8.734,49.421,8.716,49.4262,8.704561,49.403252")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "lv:8.713,49.410,2|eVf:8.7307,49.40004,56")
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
	public void test_uv9484w41c1k_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or type:way or not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2011-09-18")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "8.7276,49.415,1|8.7006,49.43391,9")
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
	public void test_vbhf4gequq0n_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "footway")
				.queryParam("bboxes", "zsl:8.6908,49.427975,8.713,49.381|S:8.654454,49.424,8.732,49.38051")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("time", "2007-12-24")
				.queryParam("timeout", "55")
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
	public void test_vb6ccdu88lyx_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-03-16")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "Eze:8.734,49.413,2")
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
	public void test_s4unz72mp4dg_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "mMSh:8.7016,49.435549,64|a:8.731,49.4091,2")
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
	public void test_uvendt4fy6nm_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.721,49.42281,78")
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
	public void test_rhrp5nguu1ir_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "secondary,synagogue,crossing")
				.queryParam("bboxes", "YT:8.673162,49.424845,8.70246,49.397|Wpj:8.68777,49.406,8.733607,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "30")
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
	public void test_1k1xa8015yb8i_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "living_street,unclassified")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "2007-12-27")
				.queryParam("timeout", "53")
				.queryParam("bcircles", "OU:8.7097,49.417,8|BE:8.740630,49.4330,4|ouMKh:8.730437,49.40909,2")
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
	public void test_1iyhozlkla99h_perimeterDensityGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "unclassified,tertiary")
				.queryParam("filter", "addr:city=* or geometry:line and length:( .. 100)")
				.queryParam("bboxes", "8.67110,49.414,8.721,49.397|8.674,49.40509,8.74269,49.389|8.6879,49.4033,8.7113,49.380")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-02-21")
				.queryParam("timeout", "62")
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
	public void test_s1jfncocf4ts_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "t:8.730,49.42687,8|Zs:8.7046,49.43300,2")
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
	public void test_1hr5dv7a2odpf_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "surface=*")
				.queryParam("bboxes", "8.696,49.402,8.748,49.3809")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "t:8.704561,49.403252,8.72387,49.4280,8.749878,49.438,8.701,49.430,8.704561,49.403252|dZ:8.704561,49.403252,8.71961,49.405282,8.71123,49.41017,8.704585,49.405,8.704561,49.403252|o:8.704561,49.403252,8.731331,49.4153,8.74259,49.437,8.7045,49.434,8.704561,49.403252")
				.queryParam("bcircles", "vLe:8.715,49.419,7")
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
	public void test_1jyllzuo9hvlg_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "residential,garage")
				.queryParam("bboxes", "aJfW:8.652834,49.423,8.711,49.393|zc:8.658,49.407,8.713,49.395")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "27")
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
	public void test_1jeaffnjgxoah_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("time", "2007-11-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"m\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7432,49.41903],[8.7269,49.4032],[8.7204,49.4353],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"P\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70263,49.416],[8.721,49.415],[8.707,49.436],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_1k1uiuawp8i1t_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,residential,tower")
				.queryParam("bboxes", "J:8.660,49.4265,8.7395,49.383|OKH:8.69597,49.4033,8.730,49.3851|k:8.667722,49.4284,8.736,49.381|kNn:8.65000,49.4130,8.7319,49.3863")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
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
	public void test_1jyljnbtsoyg5_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "house,crossing")
				.queryParam("bboxes", "X:8.676,49.4168,8.74026,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-06-05")
				.queryParam("timeout", "72")
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
	public void test_rhdbw7596vxx_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "djn:8.704561,49.403252,8.72747,49.42478,8.718,49.4290,8.746106,49.40402,8.704561,49.403252")
				.queryParam("timeout", "81")
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
	public void test_qhkjjycspkxe_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "T:8.65587,49.407,8.710,49.393|I:8.653,49.424467,8.75988,49.381|RCFed:8.6733,49.420,8.7223,49.3839|f:8.66178,49.429,8.711,49.398063")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-10-05")
				.queryParam("timeout", "64")
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
	public void test_rl8ejp7km8fm_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,living_street,track")
				.queryParam("bboxes", "X:8.6915,49.408,8.7512,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
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
	public void test_1ib37jqslufqr_perimeterDensityGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-02-06")
				.queryParam("bcircles", "8.7216,49.4282,73|8.723,49.425,69")
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
	public void test_u8b7q2tx360l_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.6746,49.422464,8.7123,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-07-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YZf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7340,49.401],[8.70073,49.419558],[8.7070,49.41115],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "tPMfy:8.749582,49.4313,86")
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
	public void test_to4jpa5kj12o_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.6833,49.4142,8.71314,49.38946")
				.queryParam("format", "geojson")
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
	public void test_1k2540d5s83zn_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-11-01")
				.queryParam("bpolys", "OCLD:8.704561,49.403252,8.728,49.427,8.7085,49.4109,8.741,49.424,8.704561,49.403252|X:8.704561,49.403252,8.735,49.426,8.70411,49.4248,8.736,49.431,8.704561,49.403252")
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
	public void test_1hroridecelb7_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* and type:node and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.657653,49.40632,8.713207,49.391")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-05-19")
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
	public void test_vf96wiagj4tz_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("time", "2015-07-18")
				.queryParam("bpolys", "ygWhG:8.704561,49.403252,8.720,49.4079,8.7029,49.414289,8.7046,49.400,8.704561,49.403252|HWqPT:8.704561,49.403252,8.7128,49.409,8.704,49.415,8.704,49.428209,8.704561,49.403252|V:8.704561,49.403252,8.7235,49.4020,8.743,49.40175,8.7323,49.405,8.704561,49.403252")
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
	public void test_qe9vyddq3dcx_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-09-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727,49.4004],[8.727,49.410],[8.7166,49.426],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "28")
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
	public void test_r1flgqedvjg0_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* or geometry:line")
				.queryParam("format", "json")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "e:8.70591,49.433,10")
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
	public void test_vbbubn9ekjfn_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"lrN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70441,49.413],[8.70084,49.4331],[8.713,49.40551],[8.704561,49.403252]]]}}]}")
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
	public void test_vbelsakfzub5_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "eHgY:8.6930,49.40228,8.721,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("time", "2013-10-23")
				.queryParam("timeout", "64")
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
	public void test_sopokkdtj2gg_perimeterDensityGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "p:8.651,49.418,8.7287,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-03-06")
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
	public void test_trz41dmyugdf_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and geometry:line or not length:( .. 100)")
				.queryParam("bboxes", "8.678,49.401,8.743,49.380")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-04-28")
				.queryParam("bcircles", "8.708,49.4206,763")
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
	public void test_rhiw850kppv6_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* and geometry:line")
				.queryParam("time", "2014-07-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"pQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.713,49.4105],[8.733,49.418],[8.7125,49.4289],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7392,49.4245],[8.74375,49.40666],[8.7044,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tXZQJ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7431,49.415],[8.714257,49.427816],[8.7176,49.4043],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "30")
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
	public void test_r1iw9dvf2m3p_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-10-02")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "DIu:8.709,49.424,9|UOz:8.7051,49.42895,4")
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
	public void test_skk14t9ncugm_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.710,49.401178,8.740,49.4370,8.71309,49.421734,8.704561,49.403252|8.704561,49.403252,8.7082,49.439400,8.707070,49.418,8.7167,49.4037,8.704561,49.403252|8.704561,49.403252,8.74841,49.409874,8.739,49.403,8.70611,49.43140,8.704561,49.403252")
				.queryParam("timeout", "47")
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
	public void test_1iupw451pq1ye_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"duPeH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.424],[8.7049,49.436940],[8.700,49.438],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"MN\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740532,49.415],[8.731,49.412],[8.7243,49.42661],[8.704561,49.403252]]]}}]}")
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
	public void test_sl3wpsy3suur_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:line or id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"s\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.705038,49.4195],[8.723,49.4231],[8.717,49.400],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"HWP\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.42114],[8.736,49.410],[8.7048,49.414],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"bXZIL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74054,49.430],[8.7024,49.427],[8.702085,49.431],[8.704561,49.403252]]]}}]}")
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
	public void test_rlaogwo3l0f8_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("time", "2009-12-10")
				.queryParam("bcircles", "8.7418,49.4367,3|8.733,49.434,4")
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
	public void test_ubgaojwsz0hg_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "tP:8.68442,49.4054,8.738,49.385|f:8.6819,49.415,8.73436,49.3983")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-07-19")
				.queryParam("timeout", "41")
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
	public void test_1hrlymyzcdqut_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"srs\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7345,49.4200],[8.746,49.426],[8.710052,49.4122],[8.704561,49.403252]]]}}]}")
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
	public void test_ure2qo8c81m8_perimeterDensityGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "V:8.69477,49.4132,8.740,49.3919|vq:8.6563,49.41138,8.758549,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("time", "2011-02-03")
				.queryParam("timeout", "95")
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
	public void test_rh7tikszre5h_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6969,49.417,8.749,49.387|8.690075,49.42963,8.710816,49.397|8.66555,49.410,8.700,49.392")
				.queryParam("time", "2017-10-15")
				.queryParam("bpolys", "LRrPV:8.704561,49.403252,8.73019,49.4259,8.7031,49.427,8.7086,49.429,8.704561,49.403252|cWnbj:8.704561,49.403252,8.728,49.407,8.715,49.437,8.732,49.425,8.704561,49.403252|Lc:8.704561,49.403252,8.72051,49.408,8.7016,49.407,8.70962,49.4250,8.704561,49.403252")
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
	public void test_1jyobfdwv2c0x_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.675,49.424687,8.705,49.39972")
				.queryParam("format", "geojson")
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
	public void test_1hux4vcue6tlv_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "sILtP:8.669,49.419,8.701,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-08-12")
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
	public void test_t4yhdzctb19x_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.740,49.414882,69|8.7090,49.420,7")
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
	public void test_1h7lxwwpe0t2w_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street=*")
				.queryParam("bboxes", "8.675,49.4105,8.738,49.385995|8.698,49.404576,8.7107,49.387|8.657,49.404,8.742,49.3941")
				.queryParam("format", "json")
				.queryParam("time", "2012-09-22")
				.queryParam("timeout", "61")
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
	public void test_qdspffykab75_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "OS:8.675,49.4280,8.745,49.38047|tC:8.67035,49.421279,8.72888,49.398|ynE:8.671,49.424,8.755,49.382")
				.queryParam("keys", "highway")
				.queryParam("time", "2012-07-25")
				.queryParam("timeout", "65")
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
	public void test_1jy7pjuztl7i0_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-09-03")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"RM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.405],[8.725,49.4168],[8.735,49.4363],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"XEEbc\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.4137],[8.74585,49.415],[8.7276,49.42247],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72972,49.429],[8.701,49.41717],[8.709,49.434],[8.704561,49.403252]]]}}]}")
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
	public void test_sohcxmh98qib_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2009-01-04")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "VphYA:8.731,49.409,2")
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
	public void test_1iv6kbocleeli_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "q:8.6770,49.4261,8.719,49.396|wmAc:8.663,49.4105,8.722499,49.393|cH:8.6966,49.425438,8.751,49.387")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-04-28")
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
	public void test_qdqhjk4cqu5y_perimeterGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "cR:8.657,49.4242,8.738,49.3973|t:8.682,49.408,8.715,49.395|bUmEV:8.67718,49.407,8.710,49.3932|l:8.677,49.428,8.715122,49.383")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-05-04")
				.queryParam("timeout", "30")
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
	public void test_urv65efcqlgy_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or area:(1.0 .. 1E6)")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "2010-11-30")
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
	public void test_uv5vm8qo7wol_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes=* and length:( .. 100)")
				.queryParam("bboxes", "8.686,49.426,8.755,49.3886")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-06-05")
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
	public void test_vbq8ayi3eji1_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and type:node or length:( .. 100)")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"reLtb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.4076],[8.7048,49.406],[8.745,49.417],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"SYhWe\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.411],[8.70434,49.4081],[8.7380,49.4291],[8.704561,49.403252]]]}}]}")
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
	public void test_urjknigc6dt1_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "wPEG:8.68657,49.405,8.7375,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
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
	public void test_1jyg21lsx1c1i_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-12-26")
				.queryParam("bpolys", "YeayS:8.704561,49.403252,8.715,49.436,8.7260,49.407,8.703,49.4105,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_u82cisvgfhv5_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-07-05")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "dy:8.741,49.431,9|D:8.736,49.427,2|n:8.702,49.418822,77|vX:8.718,49.438,440539708")
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
	public void test_u7u2dklgij52_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "j:8.704561,49.403252,8.728,49.41245,8.70257,49.4135,8.7119,49.405,8.704561,49.403252|iHvlW:8.704561,49.403252,8.7205,49.4179,8.7000,49.425,8.707,49.4143,8.704561,49.403252|eIwDn:8.704561,49.403252,8.7090,49.40180,8.702,49.4339,8.704,49.416,8.704561,49.403252")
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
	public void test_1ibh0vbageq1v_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JlHLT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7121,49.4244],[8.706,49.4188],[8.704,49.4067],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"znz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.41648],[8.7225,49.434608],[8.703,49.4029],[8.704561,49.403252]]]}}]}")
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
	public void test_1jei81vcromra_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-01-08")
				.queryParam("bpolys", "8.704561,49.403252,8.724,49.4205,8.703947,49.406296,8.704839,49.41319,8.704561,49.403252")
				.queryParam("timeout", "23")
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
	public void test_u82dpc0vf2aq_perimeterGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-07-06")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "e:8.74746,49.416,7")
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
	public void test_u7u2g1cqmmut_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tower,apartments")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "87")
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
	public void test_rhakywbss5sx_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "primary_link,track")
				.queryParam("bboxes", "tMJki:8.6784,49.427597,8.745,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-02-19")
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
	public void test_1jet9zfnjazqd_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop_line,traffic_mirror")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "json")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "8.741,49.433,1|8.731,49.40564,5105307033|8.7042,49.422,7")
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
	public void test_u82drkwl3rcm_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Yh:8.674,49.403,8.715099,49.3928")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-10-26")
				.queryParam("timeout", "68")
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
	public void test_1jefy7ekmflmg_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "hotel,platform")
				.queryParam("bboxes", "RHRpa:8.6864,49.41757,8.73453,49.3859|l:8.654,49.40962,8.733,49.3897")
				.queryParam("groupByKey", "highway")
				.queryParam("timeout", "47")
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
	public void test_t4kk6hk06sf8_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,secondary_link,elevator")
				.queryParam("bboxes", "8.661,49.4265,8.7272,49.383|8.685,49.4267,8.7252,49.3881|8.6585,49.4065,8.7219,49.3884|8.66357,49.41874,8.704408,49.381")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
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
	public void test_uve6mnbfi7n9_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.652044,49.418,8.7286,49.386|8.678,49.40929,8.720,49.393|8.686,49.4259,8.732,49.3942")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("timeout", "58")
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
	public void test_1iv9chbfg6pfd_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "traffic_signals,synagogue")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "j:8.704561,49.403252,8.722,49.4307,8.706,49.4021,8.706,49.426,8.704561,49.403252")
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
	public void test_1jefh2a1fcwva_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ytlN:8.684902,49.42073,8.7409,49.397|ZKAg:8.6942,49.408,8.7060,49.393|Rvi:8.685,49.409,8.75884,49.385|JEYdL:8.697,49.4182,8.711,49.3866")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("timeout", "82")
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
	public void test_1jyg03m6q5gs5_perimeterGroupByBoundaryGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,office,university")
				.queryParam("bboxes", "q:8.676,49.4004,8.751,49.399|HBc:8.674,49.40972,8.7301,49.391|ctSi:8.6744,49.422,8.748,49.393|u:8.667,49.4035,8.70561,49.38251")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-08-03")
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
	public void test_urgtqdws5c8m_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-05-10")
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
	public void test_s10kptna5s9t_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* and not length:( .. 100)")
				.queryParam("groupByValues", "unclassified")
				.queryParam("bboxes", "X:8.653,49.4070,8.71080,49.3873")
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
	public void test_skplv4ddnpyo_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6762,49.406745,8.7385,49.38097")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "67")
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
	public void test_rkzjeyd0wnky_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle")
				.queryParam("bboxes", "L:8.685,49.403062,8.75119,49.3845|pJr:8.6785,49.423097,8.712652,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-04-13")
				.queryParam("timeout", "56")
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
	public void test_1jyllldg6e6w6_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-05-10")
				.queryParam("bcircles", "l:8.71823,49.408,826")
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
	public void test_urrwfxpn8ab9_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot=* or geometry:line or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fzKaB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70119,49.410],[8.70317,49.410823],[8.700,49.4064],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"oABv\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737,49.42715],[8.70450,49.426],[8.70481,49.41646],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"i\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.4001],[8.705108,49.431483],[8.719370,49.414976],[8.704561,49.403252]]]}}]}")
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
	public void test_sok67207xmpk_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,primary")
				.queryParam("filter", "destination!=* or not geometry:polygon")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "91")
				.queryParam("bcircles", "8.72361,49.410446,372")
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
	public void test_vey651qepw86_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "yes,office,university")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "Vs:8.74407,49.4274,655|pOBaY:8.713,49.40028,2|d:8.729,49.424,8|ZsfrB:8.705,49.425,539883082816")
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
	public void test_1iykieggef8f6_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,garage")
				.queryParam("bboxes", "Cj:8.695,49.4209,8.742,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
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
	public void test_u8dictrydnc2_perimeterGroupByBoundaryGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,garage")
				.queryParam("bboxes", "Cj:8.695,49.4209,8.742,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
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
	public void test_r1fnetxsvckm_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "smoothness,ref")
				.queryParam("bcircles", "8.7072,49.401,8")
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
	public void test_1iuvi05p0ur77_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.689,49.4163,8.746,49.389")
				.queryParam("values", "tertiary")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"C\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7189,49.425329],[8.7020,49.40886],[8.722,49.40127],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"HOa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7276,49.4277],[8.700,49.4396],[8.716,49.4113],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "90")
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
	public void test_r1a46k9puv6t_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-12-25")
				.queryParam("bpolys", "YCkwM:8.704561,49.403252,8.731,49.4333,8.7081,49.401,8.7179,49.43927,8.704561,49.403252")
				.queryParam("groupByKeys", "name,tracktype")
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
	public void test_urmc1j44b1wm_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-10-28")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "foot,network,oneway")
				.queryParam("bcircles", "O:8.725,49.432,4|dbj:8.71326,49.431,80|PiVVW:8.738186,49.438,341")
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
	public void test_urxy8wic8vn6_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or not type:way or not length:( .. 100)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "EcF:8.704561,49.403252,8.7288,49.41231,8.711,49.407458,8.7252,49.4309,8.704561,49.403252")
				.queryParam("groupByKeys", "name,surface,bicycle")
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
	public void test_t4sx2bfnw7cl_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("time", "2015-08-01")
				.queryParam("groupByKeys", "foot,building,name")
				.queryParam("bcircles", "au:8.721,49.429,3|N:8.720021,49.426577,309")
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
	public void test_rhiw7v38xd81_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "JGB:8.66021,49.415236,8.740,49.381|vqUDD:8.67626,49.41311,8.735814,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-07-23")
				.queryParam("groupByKeys", "landuse,addr:city,surface")
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
	public void test_s1020pv4ftr9_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "lanes:forward,addr:postcode")
				.queryParam("bcircles", "8.712,49.4194,156|8.7205,49.408,6|8.70480,49.412610,43|8.727,49.425,67")
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
	public void test_1h84rm3v9wjtw_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "HYs:8.653,49.415628,8.7525,49.380|ZZu:8.685,49.4200,8.7422,49.386")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-01-30")
				.queryParam("groupByKeys", "barrier,landuse,lit")
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
	public void test_1hv5zak89ufl2_perimeterGroupByKey() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* and id:(1 .. 9999)")
				.queryParam("bpolys", "8.704561,49.403252,8.702,49.431404,8.709,49.419,8.733128,49.427,8.704561,49.403252|8.704561,49.403252,8.7104,49.4309,8.743948,49.430,8.733,49.4345,8.704561,49.403252")
				.queryParam("groupByKeys", "network,type")
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
	public void test_s1bnfhqddp9z_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and not length:( .. 100)")
				.queryParam("bboxes", "p:8.691,49.426,8.717,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("bpolys", "vbjxp:8.704561,49.403252,8.7197,49.431,8.734,49.42527,8.73225,49.413419,8.704561,49.403252|FTkhA:8.704561,49.403252,8.73707,49.407795,8.703,49.436,8.745463,49.420,8.704561,49.403252|E:8.704561,49.403252,8.720,49.4151,8.7085,49.438,8.71817,49.41204,8.704561,49.403252")
				.queryParam("groupByKeys", "landuse,highway")
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
	public void test_1jyda9nzigjmq_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=*")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "55")
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
	public void test_1iemosjnckz1i_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or type:way or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "2012-09-21")
				.queryParam("timeout", "99")
				.queryParam("groupByKeys", "surface,maxspeed,lit")
				.queryParam("bcircles", "8.732,49.420,9")
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
	public void test_tolpijrw5ruc_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "yvQyx:8.6910,49.41198,8.731573,49.3840|pBpmS:8.6938,49.4035,8.725,49.38300|FI:8.689,49.428,8.710,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-03-08")
				.queryParam("timeout", "83")
				.queryParam("groupByKeys", "lanes,destination")
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
	public void test_t4nd4uw9qwxk_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("time", "2016-08-23")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ur\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7310,49.424],[8.708779,49.4346],[8.705,49.433],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "76")
				.queryParam("groupByKeys", "barrier,oneway,lit")
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
	public void test_tofp4q6euu04_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=* and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-09-18")
				.queryParam("bpolys", "C:8.704561,49.403252,8.700,49.413,8.749241,49.42003,8.70410,49.43332,8.704561,49.403252|d:8.704561,49.403252,8.734,49.410,8.7403,49.4006,8.72019,49.4226,8.704561,49.403252|nYpwb:8.704561,49.403252,8.713,49.413069,8.707,49.421,8.7347,49.42091,8.704561,49.403252")
				.queryParam("timeout", "52")
				.queryParam("groupByKeys", "addr:city,lanes:backward")
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
	public void test_toddsra04d2o_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"bSw\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.412969],[8.744,49.409],[8.707,49.4189],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Fd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7323,49.4054],[8.7151,49.415],[8.7337,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"J\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714263,49.404805],[8.7209,49.41950],[8.722,49.428751],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "smoothness,highway,addr:country")
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
	public void test_to7dhpwy7q5t_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.683,49.411,8.7249,49.383")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "87")
				.queryParam("groupByKeys", "sidewalk,addr:street")
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
	public void test_1ieuzncz8ft4k_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* and type:node or not length:( .. 100)")
				.queryParam("bboxes", "T:8.670,49.421386,8.71734,49.381|cAgA:8.6696,49.409337,8.747,49.392")
				.queryParam("format", "json")
				.queryParam("time", "2015-03-23")
				.queryParam("groupByKeys", "ref,source:maxspeed,addr:country")
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
	public void test_to2amlai55it_perimeterGroupByKey1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("timeout", "50")
				.queryParam("groupByKeys", "addr:country,addr:housenumber,lanes:forward")
				.queryParam("bcircles", "aRqqx:8.7310,49.4304,5")
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
	public void test_s1bm9hyvm6w2_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "no")
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
	public void test_us31fc0n5xyt_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "office")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("time", "2017-11-17")
				.queryParam("bcircles", "dlUSu:8.729,49.4204,90|Mowcb:8.716,49.40612,3|Wqoz:8.721,49.4094,8|e:8.74706,49.414,2")
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
	public void test_rhm4qwq33ak9_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-02-23")
				.queryParam("bpolys", "8.704561,49.403252,8.7070,49.403,8.7228,49.43929,8.702,49.424,8.704561,49.403252|8.704561,49.403252,8.748,49.414,8.702,49.412,8.70515,49.4055,8.704561,49.403252|8.704561,49.403252,8.74804,49.426,8.7334,49.41115,8.717436,49.4240,8.704561,49.403252")
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
	public void test_urmbnicqpyd4_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("time", "2009-11-26")
				.queryParam("bpolys", "8.704561,49.403252,8.74587,49.439,8.748,49.429393,8.749,49.43060,8.704561,49.403252|8.704561,49.403252,8.7429,49.4320,8.7083,49.427,8.70189,49.417,8.704561,49.403252|8.704561,49.403252,8.749,49.4237,8.7041,49.422,8.707,49.435,8.704561,49.403252")
				.queryParam("timeout", "38")
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
	public void test_rhdcqm86spiw_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or not geometry:line and not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2008-03-27")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "8.7015,49.4291,2")
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
	public void test_s1dw3ldaggmq_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "street_lamp,give_way,church")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-02-09")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "GeaJ:8.740,49.414947,5")
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
	public void test_rkziy8666pgh_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.652,49.405,8.737,49.3832")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
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
	public void test_vbhece7t6h4n_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "OoCy:8.704561,49.403252,8.706160,49.402,8.72834,49.4272,8.73051,49.4216,8.704561,49.403252|KGx:8.704561,49.403252,8.709,49.420587,8.7177,49.4284,8.70459,49.436,8.704561,49.403252|VI:8.704561,49.403252,8.736195,49.419,8.703063,49.4109,8.719,49.413218,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_vf96g4bc0rhv_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform,primary")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.719,49.40779,7")
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
	public void test_sopnv6ve1z6r_perimeterGroupByTag() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ABTDX:8.67492,49.4010,8.708,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-10-10")
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
	public void test_1iv1k9e6qgyg2_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "demolished,living_street,civic")
				.queryParam("filter", "ref=* and id:(1 .. 9999)")
				.queryParam("bboxes", "PY:8.699,49.4284,8.759,49.3867")
				.queryParam("groupByKey", "building")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"r\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.42042],[8.701154,49.404],[8.7265,49.403],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ax\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.419],[8.704,49.431],[8.749125,49.411049],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"gi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.744847,49.4363],[8.7004,49.4009],[8.7076,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "N:8.70488,49.405,50")
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
	public void test_qdvhlci3b6sx_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-05-19")
				.queryParam("bcircles", "k:8.7235,49.4007,69|iQUC:8.746,49.418,96")
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
	public void test_ubgvq7fak5rt_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"iEdBR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731503,49.425],[8.7190,49.436],[8.74993,49.4351],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "70")
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
	public void test_tnz05oe8pwzd_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6667,49.40065,8.726199,49.399|8.65082,49.406319,8.722,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-03-18")
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
	public void test_1jer1dmwf16jm_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "service,office,cycleway")
				.queryParam("bboxes", "XJmx:8.6501,49.424961,8.723,49.3844")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "json")
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
	public void test_u7xdbdxbhx6e_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,street_lamp")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-07-06")
				.queryParam("bcircles", "8.731,49.434,6")
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
	public void test_rl7woqymih5x_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("time", "2015-02-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7075,49.433],[8.70461,49.413],[8.7230,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"p\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.717721,49.400],[8.712989,49.4055],[8.702,49.4390],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UhdY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7263,49.425],[8.704561,49.403],[8.73996,49.434],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "33")
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
	public void test_t4a1tdqgemgk_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,house")
				.queryParam("filter", "highway=* or not geometry:line or length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2015-11-06")
				.queryParam("bcircles", "8.7492,49.415161,77")
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
	public void test_rh89hoqhs86b_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk!=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-11-08")
				.queryParam("bcircles", "8.7077,49.409,6")
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
	public void test_ts572j6lvjvo_perimeterGroupByTag1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("time", "2017-05-09")
				.queryParam("bpolys", "svWGy:8.704561,49.403252,8.7356,49.411,8.70511,49.401663,8.70705,49.4014,8.704561,49.403252|tN:8.704561,49.403252,8.734,49.400,8.7040,49.43653,8.725,49.426,8.704561,49.403252|pdk:8.704561,49.403252,8.740,49.402,8.7016,49.419866,8.7046,49.417,8.704561,49.403252")
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
	public void test_qecokvtc5so2_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:forward=*")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"egKPo\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.433],[8.745,49.41825],[8.706556,49.4089],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7ged7dxg2ev_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type!=* or geometry:line and not id:(1 .. 9999)")
				.queryParam("bboxes", "o:8.67197,49.4134,8.706,49.381")
				.queryParam("showMetadata", "no")
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
	public void test_qhhu4aurhnhx_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "Gx:8.663,49.416,8.7163,49.38483|sJS:8.658,49.420,8.755407,49.393|a:8.69628,49.4105,8.733,49.391|nQBAa:8.659,49.4142,8.700,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "69")
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
	public void test_sonfifn1adrs_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "J:8.695,49.409,8.73483,49.389")
				.queryParam("showMetadata", "true")
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
	public void test_1iyi8xx616h4n_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.697,49.409,8.706,49.3950")
				.queryParam("showMetadata", "false")
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
	public void test_1huzwq2yecmk2_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or geometry:line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "ciT:8.704561,49.403252,8.7480,49.4263,8.744,49.438,8.704994,49.404,8.704561,49.403252|XGPE:8.704561,49.403252,8.741,49.408,8.740,49.406,8.70439,49.424,8.704561,49.403252|hR:8.704561,49.403252,8.73486,49.409,8.70209,49.439,8.72215,49.416,8.704561,49.403252")
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
	public void test_u8aqkw0bd1dc_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "gA:8.692,49.410,8.712,49.3814|DT:8.6513,49.40297,8.7268,49.383|CO:8.6638,49.408,8.7358,49.397")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("timeout", "37")
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
	public void test_t84mxo4dgpcx_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or not id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "Jph:8.704561,49.403252,8.7468,49.404,8.730,49.403,8.743443,49.42250,8.704561,49.403252|fET:8.704561,49.403252,8.700,49.4342,8.707,49.4092,8.704545,49.4356,8.704561,49.403252|a:8.704561,49.403252,8.722,49.40437,8.708,49.41120,8.7417,49.4031,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_vbsjbgng0xuq_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "tSIj:8.671,49.4152,8.714,49.3840|j:8.670,49.41507,8.7453,49.385|ciivM:8.674,49.41070,8.712761,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-02-04")
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
	public void test_to4izsa9t8hl_perimeterGroupByType() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "service=driveway or type:way or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-12-25")
				.queryParam("bcircles", "i:8.737462,49.4339,8343503600|oS:8.74544,49.425,1|AvyRh:8.732,49.40299,4|Pwq:8.716,49.406,961603377378")
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
	public void test_qxzf0le9r2hu_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle=* or not type:node or not length:( .. 100)")
				.queryParam("bboxes", "g:8.6986,49.406954,8.7449,49.3981")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-07-31")
				.queryParam("bpolys", "F:8.704561,49.403252,8.72680,49.4257,8.710,49.420769,8.706,49.4171,8.704561,49.403252|Dq:8.704561,49.403252,8.706,49.421,8.704097,49.414,8.7033,49.411,8.704561,49.403252|E:8.704561,49.403252,8.72630,49.417,8.7019,49.421,8.748,49.4193,8.704561,49.403252")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "v:8.739,49.4006,4")
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
	public void test_1ib0ghcgfn6sw_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-05-23")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "eDlq:8.70602,49.430,7")
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
	public void test_rhm41pgb3dcz_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"cPH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737282,49.408],[8.707,49.41164],[8.74514,49.439],[8.704561,49.403252]]]}}]}")
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
	public void test_1iyeys4ey5bg4_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.410],[8.7297,49.4326],[8.740,49.403024],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"SI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7384,49.408],[8.706,49.427],[8.7014,49.4112],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "87")
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
	public void test_skye0hxtt643_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "LP:8.682,49.429,8.730,49.3957")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "json")
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
	public void test_somw0yj841nm_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "2016-05-24")
				.queryParam("bpolys", "le:8.704561,49.403252,8.7109,49.407,8.744,49.426842,8.704564,49.429,8.704561,49.403252")
				.queryParam("timeout", "43")
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
	public void test_1hbfxzl7qmwja_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-04-07")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "S:8.704,49.432,58|TMJSU:8.7411,49.4216,868|JJcZ:8.71377,49.42406,3")
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
	public void test_urruvzjkztps_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73211,49.434],[8.7172,49.431],[8.70470,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749,49.4234],[8.728,49.4374],[8.73353,49.425],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "26")
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
	public void test_s504ew4o1pvb_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "fvRRF:8.704561,49.403252,8.721,49.406664,8.7278,49.438,8.722,49.4130,8.704561,49.403252")
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
	public void test_r1alq06ggtib_perimeterGroupByType1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "SM:8.704561,49.403252,8.74286,49.4364,8.70468,49.413,8.719,49.4243,8.704561,49.403252")
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
	public void test_rhajc5kb3acy_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "dePM:8.6874,49.428986,8.7226,49.394")
				.queryParam("types2", "line,")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-09-29")
				.queryParam("bpolys", "h:8.704561,49.403252,8.70630,49.413,8.7382,49.406139,8.744,49.41825,8.704561,49.403252")
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
	public void test_1hbjacgqvtu92_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-11-16")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "8.734195,49.434,7")
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
	public void test_1hrm0zdka4z1d_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "platform")
				.queryParam("format", "json")
				.queryParam("bpolys", "txyof:8.704561,49.403252,8.7129,49.407,8.706,49.4194,8.702,49.4319,8.704561,49.403252|aAhpn:8.704561,49.403252,8.7243,49.439,8.720069,49.4375,8.7144,49.4006,8.704561,49.403252|eVhhx:8.704561,49.403252,8.72964,49.4234,8.7041,49.413,8.7049,49.4249,8.704561,49.403252")
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
	public void test_r1ajryjkki0n_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "json")
				.queryParam("filter2", "destination!=* and type:node")
				.queryParam("time", "2012-09-27")
				.queryParam("bpolys", "NMhE:8.704561,49.403252,8.744,49.420,8.707,49.433,8.743169,49.4276,8.704561,49.403252")
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
	public void test_rhrpjgcfn6ub_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:line")
				.queryParam("types2", "way,")
				.queryParam("filter2", "oneway!=* and geometry:line or length:( .. 100)")
				.queryParam("time", "2012-02-16")
				.queryParam("bpolys", "8.704561,49.403252,8.701,49.42936,8.713496,49.437,8.702,49.4228,8.704561,49.403252|8.704561,49.403252,8.7074,49.4235,8.70132,49.419611,8.7048,49.406,8.704561,49.403252|8.704561,49.403252,8.716,49.4000,8.739,49.428997,8.7402,49.4362,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "crossing")
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
	public void test_vevw7yk5mzp2_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=*")
				.queryParam("bboxes", "8.657,49.402784,8.711,49.390|8.690,49.414,8.754,49.381")
				.queryParam("format", "geojson")
				.queryParam("filter2", "ref!=* and type:relation and not area:(1.0 .. 1E6)")
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
	public void test_1h7in1ixj5ile_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "smoothness=* and geometry:line and length:( .. 100)")
				.queryParam("time", "2009-12-22")
				.queryParam("keys2", "highway")
				.queryParam("values2", "secondary")
				.queryParam("bcircles", "8.7031,49.422241,92|8.7487,49.420,4")
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
	public void test_1iavdowg0i6gn_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "H:8.6532,49.409,8.737593,49.388")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
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
	public void test_qhiavudpyfs3_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes:forward=* or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-08")
				.queryParam("bpolys", "8.704561,49.403252,8.739008,49.421427,8.734,49.40434,8.7276,49.405,8.704561,49.403252|8.704561,49.403252,8.7419,49.4344,8.719,49.409,8.704,49.405137,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_r17a29y0od2u_perimeterRatio() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("values", "service")
				.queryParam("filter2", "barrier=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2016-02-05")
				.queryParam("bpolys", "dq:8.704561,49.403252,8.700801,49.410,8.73737,49.416192,8.704664,49.4300,8.704561,49.403252|kXe:8.704561,49.403252,8.723,49.4196,8.749,49.4249,8.7049,49.4182,8.704561,49.403252|WhOJx:8.704561,49.403252,8.745404,49.401,8.725,49.4363,8.71050,49.434,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "26")
				.queryParam("values2", "pedestrian")
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
	public void test_1iemoc1qht6pl_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* and geometry:point or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-03-10")
				.queryParam("values2", "primary")
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
	public void test_rlb5lzye5vtt_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=* and geometry:point and id:(1 .. 9999)")
				.queryParam("types2", "line,polygon,other")
				.queryParam("filter2", "tracktype!=* and not area:(1.0 .. 1E6)")
				.queryParam("time", "2008-04-05")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "wrsv:8.7088,49.4231,7|x:8.7198,49.420,3|gfY:8.701,49.4378,7")
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
	public void test_ursfuqt329ur_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("time", "2017-05-17")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "Zwv:8.700,49.400,61")
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
	public void test_t81b7oyttesy_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "X:8.67166,49.407,8.705,49.3871|A:8.673,49.419,8.746,49.381|lXbrH:8.666985,49.422,8.704,49.3933")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-01-22")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
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
	public void test_1h821e2jrucs6_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "highway!=* and not type:node")
				.queryParam("time", "2016-11-06")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "27")
				.queryParam("bcircles", "8.728,49.406,2|8.719,49.40916,9")
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
	public void test_qhsuvnt50eoy_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("time", "2010-09-02")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.71417,49.427,33")
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
	public void test_us0r98ie8v1z_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "e:8.704561,49.403252,8.739514,49.431,8.709,49.420,8.704827,49.4029,8.704561,49.403252|O:8.704561,49.403252,8.701,49.4258,8.715,49.417,8.705089,49.414565,8.704561,49.403252")
				.queryParam("timeout", "36")
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
	public void test_1jydr1bhd65ib_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.68327,49.4034,8.701,49.382")
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,")
				.queryParam("filter2", "ref!=* and geometry:point and length:( .. 100)")
				.queryParam("time", "2008-05-16")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "41")
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
	public void test_1jei97wql5anp_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "way,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.713,49.406054,8.7072,49.4261,8.747,49.408,8.704561,49.403252|8.704561,49.403252,8.742,49.4330,8.7207,49.42254,8.702,49.417714,8.704561,49.403252|8.704561,49.403252,8.72368,49.433,8.701,49.422,8.722,49.429,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "36")
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
	public void test_skscxai1sktd_perimeterRatio1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "jPg:8.715,49.422634,20")
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
	public void test_1hbgh0ax4s08g_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "FPcl:8.693,49.4126,8.727,49.38218|DQFZJ:8.6983,49.4125,8.747,49.383|qIrMc:8.669158,49.409421,8.701,49.3875")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("format", "json")
				.queryParam("filter2", "turn:lanes!=* and id:(1 .. 9999)")
				.queryParam("time", "2014-01-04")
				.queryParam("bpolys", "MiqJ:8.704561,49.403252,8.707,49.427,8.744378,49.436,8.704386,49.4389,8.704561,49.403252|mvX:8.704561,49.403252,8.7421,49.412,8.73056,49.4263,8.742,49.426,8.704561,49.403252|S:8.704561,49.403252,8.730298,49.431,8.701,49.4081,8.722,49.42456,8.704561,49.403252")
				.queryParam("timeout", "28")
				.queryParam("values2", "stop_line")
				.queryParam("bcircles", "8.740,49.4347,7")
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
	public void test_s1ef9zwcurfq_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "nmZB:8.697,49.402,8.715,49.3947|JdG:8.676,49.412,8.756,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-07-17")
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
	public void test_ubj3k1x5b1pf_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("filter2", "maxspeed!=* and not geometry:line")
				.queryParam("bpolys", "NF:8.704561,49.403252,8.71316,49.424,8.70450,49.4282,8.7418,49.416,8.704561,49.403252|u:8.704561,49.403252,8.736,49.429448,8.703,49.425,8.72049,49.429,8.704561,49.403252|z:8.704561,49.403252,8.711,49.411,8.726664,49.430,8.7057,49.423,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_1jeqhvz4vpug3_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or geometry:line and length:( .. 100)")
				.queryParam("bpolys", "i:8.704561,49.403252,8.746,49.4390,8.744,49.431,8.708,49.4291,8.704561,49.403252|f:8.704561,49.403252,8.7209,49.415,8.70489,49.419,8.707,49.408,8.704561,49.403252|S:8.704561,49.403252,8.706,49.4350,8.704,49.400,8.748,49.427123,8.704561,49.403252")
				.queryParam("timeout", "52")
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
	public void test_rh893hdaawc7_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood or type:node or length:( .. 100)")
				.queryParam("types2", "polygon,other")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.71389,49.406,8.7131,49.423,8.717871,49.430957,8.704561,49.403252|8.704561,49.403252,8.724,49.432,8.748272,49.409,8.747,49.408,8.704561,49.403252|8.704561,49.403252,8.742,49.4026,8.732,49.43349,8.7012,49.4081,8.704561,49.403252")
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
	public void test_1iynt6zzp0j8k_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zeMMX:8.6882,49.417,8.708,49.397")
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
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
	public void test_1ibes43k1anaa_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and geometry:point or length:( .. 100)")
				.queryParam("bboxes", "fhrx:8.654,49.4073,8.705,49.393")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "34")
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
	public void test_1ji7ashgvc27r_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6672,49.408900,8.730,49.3930")
				.queryParam("types2", "node,relation")
				.queryParam("format", "json")
				.queryParam("time", "2009-12-16")
				.queryParam("timeout", "31")
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
	public void test_ubrehm9ahu7t_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "luA:8.697,49.408,8.716,49.38455")
				.queryParam("keys", "highway")
				.queryParam("filter2", "building=* and area:(1.0 .. 1E6)")
				.queryParam("time", "2014-07-03")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "72")
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
	public void test_s4uoantwu9td_perimeterRatioGroupByBoundary() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "SSCsg:8.663,49.41706,8.7227,49.387|faQOo:8.689480,49.423,8.7303,49.399|ZqV:8.694,49.403974,8.724,49.384")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("keys2", "highway")
				.queryParam("values2", "give_way")
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
	public void test_t4ner9vc7pdl_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("types2", "point,other")
				.queryParam("bpolys", "nPMX:8.704561,49.403252,8.718,49.41138,8.7040,49.4028,8.7290,49.41085,8.704561,49.403252|loa:8.704561,49.403252,8.715347,49.4182,8.703245,49.4055,8.706,49.404,8.704561,49.403252|lx:8.704561,49.403252,8.71516,49.432,8.736,49.413,8.72013,49.4282,8.704561,49.403252")
				.queryParam("values2", "give_way")
				.queryParam("bcircles", "qLFl:8.741,49.408,70")
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
	public void test_1huxodbq1lagp_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* and length:( .. 100)")
				.queryParam("bboxes", "xD:8.697032,49.409387,8.7050,49.38129")
				.queryParam("types2", "other")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* or geometry:point and length:( .. 100)")
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
	public void test_ure2nzkpghfd_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6894,49.405,8.74766,49.390|8.693290,49.415,8.730,49.3856|8.67723,49.408,8.75131,49.392|8.6902,49.4297,8.73245,49.39545")
				.queryParam("types2", "point,line,other")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-06-27")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "35")
				.queryParam("values2", "primary")
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
	public void test_u88gq97z3peu_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and length:( .. 100)")
				.queryParam("bboxes", "8.680,49.420,8.74333,49.3895")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-02-06")
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
	public void test_u7u3jo9eg8jb_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "type=*")
				.queryParam("bboxes", "8.681,49.42022,8.7330,49.387|8.68046,49.421232,8.736,49.399")
				.queryParam("types2", "line,other")
				.queryParam("showMetadata", "no")
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
	public void test_rhg4g96j2lo1_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse!=* or id:(1 .. 9999)")
				.queryParam("types2", "other")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
				.queryParam("values2", "elevator")
				.queryParam("bcircles", "LcvgA:8.720,49.415211,7|W:8.706,49.4007,7")
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
	public void test_vf98e5xzsf1t_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,other")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("filter2", "ref=* and geometry:line or id:(1 .. 9999)")
				.queryParam("time", "2016-06-13")
				.queryParam("bcircles", "or:8.731,49.4032,1")
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
	public void test_1h7z9ayaxykol_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("filter2", "building!=* or type:node and length:( .. 100)")
				.queryParam("time", "2009-08-25")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "95")
				.queryParam("values2", "platform")
				.queryParam("bcircles", "E:8.717,49.4311,2")
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
	public void test_1jettjjhdsd9v_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lanes!=* or not type:relation or id:(1 .. 9999)")
				.queryParam("types2", "polygon,other")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "oneway=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2015-10-20")
				.queryParam("bpolys", "Uys:8.704561,49.403252,8.749,49.418,8.70493,49.404,8.71381,49.402,8.704561,49.403252|X:8.704561,49.403252,8.724,49.4136,8.70680,49.406,8.722,49.408,8.704561,49.403252|A:8.704561,49.403252,8.731,49.4144,8.7243,49.40237,8.706,49.4008,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "54")
				.queryParam("values2", "cycleway")
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
	public void test_s12sov8v86k8_perimeterRatioGroupByBoundary1() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* or type:relation and id:(1 .. 9999)")
				.queryParam("bboxes", "8.699760,49.427,8.726,49.3961|8.696798,49.4250,8.70292,49.38697|8.656,49.411,8.746202,49.392|8.688,49.403445,8.7241,49.386412")
				.queryParam("types2", "point,line,")
				.queryParam("format", "geojson")
				.queryParam("filter2", "bicycle!=* and geometry:polygon and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("values2", "primary")
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
	public void test_qhibnwz503ll_count2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6837,49.4080,8.728,49.387")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y1M15D")
				.queryParam("bpolys", "8.704561,49.403252,8.748,49.4336,8.70504,49.423,8.700,49.437,8.704561,49.403252|8.704561,49.403252,8.746046,49.415,8.73961,49.4053,8.701,49.4043,8.704561,49.403252")
				.queryParam("timeout", "22")
				.queryParam("bcircles", "M:8.74333,49.4329,60")
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
	public void test_1jy7rw01kz2no_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "O:8.6709,49.413,8.704,49.3834|Gf:8.689,49.411,8.726,49.3944|X:8.6672,49.42713,8.716,49.395|XPXgD:8.682,49.4001,8.747,49.39124")
				.queryParam("time", "//P2Y3M14D")
				.queryParam("timeout", "37")
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
	public void test_1jyodreat1anp_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y10M22D")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "ZA:8.7203,49.403,2")
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
	public void test_1huxod3tcylh4_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "PEPJ:8.694,49.409754,8.74923,49.39424|NRUU:8.663418,49.4033,8.746,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y10M11D")
				.queryParam("timeout", "54")
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
	public void test_1jei6vu2a9u7r_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "OJ:8.7309,49.420,6|D:8.7400,49.405890,70")
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
	public void test_vf0x2cwl4ks3_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination!=* or not type:way or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "BUu:8.704561,49.403252,8.7441,49.402,8.7002,49.411,8.704,49.439,8.704561,49.403252|Fb:8.704561,49.403252,8.7277,49.429,8.730,49.420,8.723649,49.42399,8.704561,49.403252|v:8.704561,49.403252,8.717,49.405,8.719,49.425389,8.730122,49.4093,8.704561,49.403252")
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
	public void test_1jygkravdrtk1_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "source:maxspeed!=*")
				.queryParam("time", "//P1Y7M4D")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "msk:8.72302,49.417,52")
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
	public void test_t844m5mhqdrq_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y9M13D")
				.queryParam("bcircles", "cPNm:8.706903,49.424,5")
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
	public void test_s18vnljk4s4k_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway=* and geometry:line and id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "J:8.70062,49.41742,61|J:8.744,49.407,1|gR:8.712,49.408,2|l:8.7439,49.434,63")
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
	public void test_sl3y9rgbwoyq_count2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P3Y5M13D")
				.queryParam("bpolys", "UuMt:8.704561,49.403252,8.708,49.4344,8.70459,49.412,8.70723,49.412006,8.704561,49.403252|Z:8.704561,49.403252,8.70416,49.410,8.733,49.438,8.708214,49.4308,8.704561,49.403252|U:8.704561,49.403252,8.72880,49.4330,8.7429,49.43157,8.718,49.4375,8.704561,49.403252")
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
	public void test_1hbisey5amlph_count3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype=* or length:( .. 100)")
				.queryParam("bboxes", "8.674737,49.4189,8.7260,49.386")
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y1M8D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.412],[8.736,49.4281],[8.7113,49.432],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"jvSi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7283,49.4313],[8.7136,49.409034],[8.7045,49.412],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ywR\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70082,49.419],[8.710,49.431],[8.7320,49.438],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7j5ao5jl4xj_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness!=* or not type:relation")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7419,49.40912,8.70958,49.4336,8.70448,49.436,8.704561,49.403252|8.704561,49.403252,8.7442,49.4124,8.701,49.408,8.703,49.404,8.704561,49.403252|8.704561,49.403252,8.74383,49.401,8.7019,49.4265,8.703,49.415,8.704561,49.403252")
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
	public void test_trwf2aat21d0_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and geometry:polygon")
				.queryParam("time", "//P3Y7M12D")
				.queryParam("bpolys", "BD:8.704561,49.403252,8.731,49.4231,8.7007,49.4109,8.739,49.4110,8.704561,49.403252|zLV:8.704561,49.403252,8.715,49.4119,8.733,49.423,8.7049,49.410,8.704561,49.403252|uDu:8.704561,49.403252,8.7200,49.4361,8.734,49.41729,8.7040,49.4042,8.704561,49.403252")
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
	public void test_r17sdvyzaf6t_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.431,8.7096,49.431,8.743,49.4157,8.704561,49.403252|8.704561,49.403252,8.745,49.413,8.706,49.422300,8.700,49.408,8.704561,49.403252")
				.queryParam("timeout", "80")
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
	public void test_s10l46lnmm3q_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "wMUEy:8.741015,49.411261,3")
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
	public void test_t49hxtijq89y_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "J:8.698,49.421,8.738,49.384|Qp:8.668238,49.4096,8.7533,49.39733|NOC:8.661885,49.404,8.711089,49.38763")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("time", "//P2Y8M7D")
				.queryParam("timeout", "21")
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
	public void test_rh7qe7zylqnm_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building=* or type:way")
				.queryParam("time", "//P3Y7M20D")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.74833,49.42675,2")
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
	public void test_t4fkwhjzsaxt_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y6M9D")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "Jg:8.7128,49.402,7|n:8.7380,49.407,8|UtNmB:8.7383,49.428,409|ilA:8.737220,49.419,61915077004")
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
	public void test_to4jdvc447jo_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y11M7D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"khLdG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.709,49.405294],[8.727,49.439067],[8.7396,49.428647],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "25")
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
	public void test_t87e8puxq8tt_count3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "qQs:8.7424,49.429,6")
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
	public void test_qxg0o99e4bw9_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=* and id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P1Y10M22D")
				.queryParam("bcircles", "8.71837,49.4092,6")
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
	public void test_vf3oixyc0oqf_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ZB:8.682,49.420,8.756,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y3M7D")
				.queryParam("timeout", "27")
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
	public void test_urrvo1en9euc_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "MK:8.6890,49.4178,8.728,49.383")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_tol7l74ac5rp_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "8.7196,49.415,759|8.7188,49.4177,3")
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
	public void test_t4htna6j02lx_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "landuse=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6921,49.4266,8.719,49.389|8.68517,49.415,8.742,49.396|8.692902,49.41801,8.7576,49.3992")
				.queryParam("showMetadata", "true")
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
	public void test_qe149ddn63c3_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6645,49.413,8.754,49.387|8.657,49.401,8.736691,49.394|8.668,49.412,8.704484,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("time", "//P2Y4M9D")
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
	public void test_t4q4wqcrs7xv_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bpolys", "hS:8.704561,49.403252,8.735,49.423,8.702,49.43999,8.715730,49.426,8.704561,49.403252|u:8.704561,49.403252,8.723,49.40112,8.704,49.43399,8.74622,49.402,8.704561,49.403252|q:8.704561,49.403252,8.7228,49.410043,8.7296,49.41650,8.700,49.4013,8.704561,49.403252")
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
	public void test_1h7zrmeddg5rr_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* or not id:(1 .. 9999)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y11M11D")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "8.7164,49.413,1|8.7046,49.4366,6")
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
	public void test_1iuy7fwfouk36_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y8M22D")
				.queryParam("bpolys", "h:8.704561,49.403252,8.7108,49.40795,8.71842,49.4161,8.705923,49.412,8.704561,49.403252|Z:8.704561,49.403252,8.74494,49.412,8.720270,49.408,8.702,49.419,8.704561,49.403252|cU:8.704561,49.403252,8.712,49.41464,8.7061,49.4336,8.706,49.4361,8.704561,49.403252")
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
	public void test_1hv8ab2s3t2k6_countDensity2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6647,49.41380,8.715,49.394|8.672,49.412,8.755330,49.3926")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y9M14D")
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
	public void test_1h7tpoo991s2p_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or not geometry:line or id:(1 .. 9999)")
				.queryParam("bboxes", "Z:8.654,49.425715,8.738543,49.385|l:8.657,49.427,8.729,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"h\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7496,49.424],[8.724,49.4089],[8.740,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"VM\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73240,49.426],[8.741,49.4395],[8.728,49.429],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "8.730,49.439,4")
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
	public void test_rhiv1q62vhpi_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.674295,49.425,8.73417,49.393")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y2M8D")
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
	public void test_u87yvkvm24bq_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "msoAG:8.689,49.424,8.740,49.397|gCG:8.655,49.408,8.724,49.3911")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("time", "//P1Y1M5D")
				.queryParam("timeout", "46")
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
	public void test_vf4627unga48_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ElFrD:8.665,49.4246,8.735,49.3848|ur:8.68466,49.4126,8.712,49.388|qh:8.673,49.412,8.7295,49.3937|hk:8.686,49.405,8.716,49.3874")
				.queryParam("keys", "highway")
				.queryParam("timeout", "36")
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
	public void test_to7dhpxk4113_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "U:8.687,49.40268,8.743,49.383|xrUJN:8.6573,49.4232,8.7296,49.39178")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P3Y3M24D")
				.queryParam("timeout", "35")
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
	public void test_1je9v5tzn360l_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* or type:relation")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y4M11D")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "L:8.73154,49.4360,3|X:8.730197,49.403,4")
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
	public void test_rlaoe61ny1py_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:postcode=*")
				.queryParam("format", "csv")
				.queryParam("time", "//P2Y7M6D")
				.queryParam("bpolys", "Ze:8.704561,49.403252,8.7373,49.438,8.7438,49.404305,8.735749,49.435,8.704561,49.403252|TNyxt:8.704561,49.403252,8.724920,49.431,8.704595,49.4066,8.7045,49.40447,8.704561,49.403252|iU:8.704561,49.403252,8.709,49.4026,8.740,49.417686,8.7462,49.4190,8.704561,49.403252")
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
	public void test_ublwvoc8mtdl_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ErM:8.674459,49.420,8.751,49.3801|pobd:8.677,49.400833,8.757,49.3896|k:8.66009,49.4157,8.742,49.380|O:8.678,49.407,8.754,49.3974")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y4M1D")
				.queryParam("timeout", "52")
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
	public void test_vbppnrr4s0ty_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.697,49.419,8.708,49.3988")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "false")
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
	public void test_ublw3ybx2542_countDensity3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.672,49.426,8.758,49.384")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y10M18D")
				.queryParam("timeout", "90")
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
	public void test_s4rvqngaqk36_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn!=* and area:(1.0 .. 1E6)")
				.queryParam("values", "primary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y5M1D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"u\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7417,49.416],[8.7113,49.42154],[8.7271,49.4328],[8.704561,49.403252]]]}}]}")
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
	public void test_u7wujfk3t9o6_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P2Y10M1D")
				.queryParam("bpolys", "8.704561,49.403252,8.721608,49.418,8.7023,49.411,8.704586,49.4252,8.704561,49.403252")
				.queryParam("timeout", "27")
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
	public void test_1h82je87bt8hj_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Y:8.704561,49.403252,8.704,49.418,8.727,49.432,8.714343,49.416,8.704561,49.403252")
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
	public void test_1iyex7s3ei8v7_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "barrier!=* or not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "73")
				.queryParam("bcircles", "8.74297,49.427,1|8.715,49.4279,4")
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
	public void test_1ib3op7igte7p_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6886,49.417,8.701,49.380")
				.queryParam("keys", "highway")
				.queryParam("time", "//P1Y11M11D")
				.queryParam("timeout", "72")
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
	public void test_urp5u5j9m4om_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=*")
				.queryParam("bboxes", "Smzqd:8.692,49.420905,8.7415,49.3823")
				.queryParam("format", "csv")
				.queryParam("timeout", "100")
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
	public void test_urp5u5jlmi5e_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "hrt:8.693,49.409,8.751221,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y6M26D")
				.queryParam("timeout", "62")
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
	public void test_r1a30mwyjv3s_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "O:8.704561,49.403252,8.716,49.424,8.7004,49.405,8.72171,49.4256,8.704561,49.403252|iWD:8.704561,49.403252,8.707,49.40931,8.7481,49.419,8.7417,49.413,8.704561,49.403252|AC:8.704561,49.403252,8.7427,49.433,8.7132,49.4315,8.7440,49.436,8.704561,49.403252")
				.queryParam("timeout", "27")
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
	public void test_1iv12btlweer8_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.674920,49.400278,8.714,49.3896")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "79")
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
	public void test_rlao2m2cx10i_countDensityGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or geometry:line and not id:(1 .. 9999)")
				.queryParam("time", "//P2Y8M19D")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "BoBI:8.7070,49.4293,5")
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
	public void test_r1iv3k2mbdx0_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=* and geometry:point")
				.queryParam("bboxes", "E:8.653,49.4253,8.746,49.397|w:8.665,49.424,8.738067,49.399|N:8.656,49.416,8.711,49.3801")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.7449,49.416,8.7071,49.4006,8.7456,49.4388,8.704561,49.403252|8.704561,49.403252,8.700270,49.430,8.7453,49.428,8.7258,49.4363,8.704561,49.403252")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "hfcV:8.723,49.4176,94449102583|B:8.7157,49.435613,76")
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
	public void test_1hrs2dvih3xib_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.718,49.438,1")
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
	public void test_1jylllrltqctd_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "Rm:8.70551,49.421,36")
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
	public void test_t8a4ghkfnzg9_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "UzTCe:8.704561,49.403252,8.7264,49.4182,8.709098,49.4139,8.713640,49.435,8.704561,49.403252|x:8.704561,49.403252,8.72599,49.431,8.704,49.417,8.702,49.42506,8.704561,49.403252")
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
	public void test_qhtd6vms73ub_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.71821,49.415251,7|8.739,49.414,5|8.726,49.422,81|8.7395,49.4160,917148637513")
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
	public void test_1iv1jel9zc3sh_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y2M7D")
				.queryParam("bpolys", "UR:8.704561,49.403252,8.72869,49.40901,8.70552,49.43912,8.70458,49.413973,8.704561,49.403252|ONE:8.704561,49.403252,8.749,49.431,8.703,49.411,8.702,49.4019,8.704561,49.403252|Tc:8.704561,49.403252,8.7380,49.41381,8.728,49.4081,8.708,49.408,8.704561,49.403252")
				.queryParam("timeout", "54")
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
	public void test_t4ht9il2386v_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed=* or not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("bcircles", "exVgs:8.7149,49.418176,79")
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
	public void test_1hblkksqohv7a_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "//P1Y5M2D")
				.queryParam("bpolys", "gJ:8.704561,49.403252,8.71931,49.4091,8.729,49.410,8.704909,49.429,8.704561,49.403252|zfLoq:8.704561,49.403252,8.730,49.4005,8.704650,49.4295,8.7445,49.434,8.704561,49.403252|kd:8.704561,49.403252,8.735,49.426,8.710,49.423334,8.700,49.419,8.704561,49.403252")
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
	public void test_1ibbivmigvuih_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk!=* and not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "//P3Y10M20D")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "UzW:8.703,49.434,7")
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
	public void test_1jetcp977yfcn_countDensityGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "zJKaH:8.704561,49.403252,8.7052,49.409,8.707,49.42617,8.70593,49.404,8.704561,49.403252|pnoXf:8.704561,49.403252,8.7338,49.404,8.706,49.402,8.739,49.437,8.704561,49.403252|T:8.704561,49.403252,8.713402,49.404,8.729,49.438,8.7027,49.4289,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_qhibnl4ejdd0_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "zI:8.715,49.425533,2|HshU:8.7161,49.414556,5")
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
	public void test_qe9x4eclzzvl_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "turn:lanes=* or type:way")
				.queryParam("groupByValues", "traffic_mirror,construction")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y10M18D")
				.queryParam("bpolys", "8.704561,49.403252,8.742,49.4097,8.705,49.408485,8.7280,49.40271,8.704561,49.403252")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "Bs:8.7434,49.4211,4|kxwV:8.749,49.419,77|Zk:8.726,49.400,46")
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
	public void test_vb6thmpmnho6_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "school,stop,traffic_mirror")
				.queryParam("filter", "network!=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "//P2Y5M2D")
				.queryParam("bpolys", "wrYu:8.704561,49.403252,8.719,49.401843,8.701,49.417,8.707,49.4251,8.704561,49.403252|b:8.704561,49.403252,8.7127,49.435335,8.738048,49.421,8.741,49.426,8.704561,49.403252")
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
	public void test_1jyit4bx86d7m_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* and type:way or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "41")
				.queryParam("bcircles", "8.726,49.43847,143439985")
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
	public void test_skvlruf5nntv_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,primary_link,path")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bcircles", "8.7016,49.419,4|8.7024,49.4156,32")
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
	public void test_1hv5htv0qnnld_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "foot!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y1M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.710,49.431,8.7107,49.403,8.704560,49.418,8.704561,49.403252|8.704561,49.403252,8.72023,49.426,8.70877,49.4268,8.704,49.40748,8.704561,49.403252|8.704561,49.403252,8.746,49.4399,8.730,49.425,8.733,49.410,8.704561,49.403252")
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
	public void test_trwe7tayjhb8_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.745025,49.43836,8.718,49.408107,8.727,49.418,8.704561,49.403252")
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
	public void test_1h84sgixf56b5_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "omaIP:8.7351,49.4214,7|ey:8.72656,49.429,9")
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
	public void test_tolqapya8sol_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "give_way,cycleway")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "8.749,49.425,1")
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
	public void test_1jefeeb69dd81_countDensityGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "tower,office")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "//P1Y3M1D")
				.queryParam("bcircles", "xk:8.743,49.4068,97|M:8.733,49.41541,398|KL:8.743025,49.4343,7|rJwmn:8.71171,49.41857,1")
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
	public void test_ubp69onxp7w7_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "track,station")
				.queryParam("filter", "turn=* and type:way or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.659,49.407,8.7028,49.382554|8.684,49.4203,8.7007,49.3914|8.6734,49.425,8.719,49.387|8.6526,49.406,8.7576,49.398631")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y9M19D")
				.queryParam("timeout", "84")
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
	public void test_1huzxtlhqhfeh_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "turning_circle")
				.queryParam("bboxes", "Vcy:8.671,49.426,8.7172,49.381")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y1M14D")
				.queryParam("bpolys", "J:8.704561,49.403252,8.741,49.414674,8.70269,49.438341,8.70468,49.435226,8.704561,49.403252|L:8.704561,49.403252,8.701,49.439,8.7007,49.4245,8.739,49.4102,8.704561,49.403252|Ycog:8.704561,49.403252,8.7422,49.418,8.70480,49.425,8.713,49.406,8.704561,49.403252")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "8.725,49.421,1")
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
	public void test_1jetubc5pi71w_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "garage,school,secondary_link")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "8.704561,49.403252,8.749,49.432,8.74795,49.4392,8.7408,49.437,8.704561,49.403252|8.704561,49.403252,8.7074,49.416735,8.705,49.4102,8.7006,49.41737,8.704561,49.403252|8.704561,49.403252,8.7042,49.417145,8.7444,49.435,8.709,49.4002,8.704561,49.403252")
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
	public void test_1iuyah6rjsk6p_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,speed_camera")
				.queryParam("filter", "barrier!=* and length:( .. 100)")
				.queryParam("bboxes", "BfMpD:8.68448,49.4108,8.7038,49.383")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2Y1M5D")
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
	public void test_1h82jpf3s7pys_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y8M9D")
				.queryParam("bcircles", "e:8.709,49.430,7")
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
	public void test_u7rtp5gtwin7_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,synagogue")
				.queryParam("filter", "oneway!=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "//P1Y8M19D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"vLehs\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.406185],[8.704424,49.410],[8.705,49.435],[8.704561,49.403252]]]}}]}")
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
	public void test_rhje80qf77le_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("time", "//P2Y4M28D")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "cq:8.746,49.4378,7")
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
	public void test_qdychl6a4wmq_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "dormitory,synagogue")
				.queryParam("filter", "surface!=*")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "//P1Y8M1D")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "hVGja:8.742,49.409,6|ws:8.708,49.4047,5")
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
	public void test_ubu5hg8lqf6r_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and type:way or id:(1 .. 9999)")
				.queryParam("bboxes", "8.692411,49.410,8.750,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y10M16D")
				.queryParam("timeout", "56")
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
	public void test_sof3sn3fiud2_countDensityGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "station,dormitory,tower")
				.queryParam("filter", "turn:lanes=* and geometry:line and not id:(1 .. 9999)")
				.queryParam("bboxes", "xsmt:8.6671,49.4267,8.7469,49.385|Z:8.674,49.421816,8.707,49.385|w:8.686,49.427,8.71974,49.396|EuJeN:8.6946,49.418,8.718,49.384")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "53")
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
	public void test_rhug5h32j9sz_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6626,49.423102,8.714,49.389|8.6618,49.414,8.708672,49.396|8.6540,49.419,8.716162,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "json")
				.queryParam("time", "//P2Y7M13D")
				.queryParam("bcircles", "8.71489,49.411,68")
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
	public void test_trqsbl52m1ps_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("bpolys", "JVPcr:8.704561,49.403252,8.735918,49.43520,8.718204,49.42586,8.714060,49.438039,8.704561,49.403252|V:8.704561,49.403252,8.714,49.408,8.709,49.420013,8.7025,49.400,8.704561,49.403252")
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
	public void test_sl8zkjeklr38_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("bpolys", "8.704561,49.403252,8.7022,49.4144,8.704,49.42843,8.74909,49.428,8.704561,49.403252")
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
	public void test_t4l420i1c0h2_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "OiH:8.6635,49.4123,8.725,49.3950")
				.queryParam("keys", "highway")
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
	public void test_qdq0e3qx5r1v_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "DeP:8.664,49.402677,8.724,49.391|yybIy:8.668967,49.4139,8.7308,49.387")
				.queryParam("time", "//P2Y10M20D")
				.queryParam("timeout", "59")
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
	public void test_1ib0fbmxwxfe9_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bpolys", "8.704561,49.403252,8.746,49.4068,8.7083,49.409,8.704,49.411,8.704561,49.403252")
				.queryParam("timeout", "34")
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
	public void test_u82fnhipzl2d_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "ZfRg:8.730,49.41971,8|Ck:8.731,49.404,8|ah:8.7016,49.40791,2|iv:8.732,49.4342,353077933")
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
	public void test_trww4uuigjzo_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "building!=* or not length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "h:8.724,49.42373,51")
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
	public void test_to4m434dn4u1_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "hB:8.659,49.4280,8.7356,49.393")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y5M28D")
				.queryParam("timeout", "40")
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
	public void test_rh7t47w0604w_countDensityGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.656800,49.407,8.723,49.380")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
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
	public void test_s0xsmh2eooqb_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("values", "cycleway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y1M4D")
				.queryParam("bpolys", "w:8.704561,49.403252,8.725,49.427,8.72233,49.43260,8.743,49.416637,8.704561,49.403252|gQ:8.704561,49.403252,8.722,49.438,8.703069,49.422,8.736,49.403,8.704561,49.403252|V:8.704561,49.403252,8.702,49.4093,8.732140,49.437,8.7040,49.431,8.704561,49.403252")
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
	public void test_toiygbdf6o2t_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* or type:way or not id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "T:8.704561,49.403252,8.746,49.402,8.717,49.413521,8.743,49.41422,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_1ib5zptzjaxx4_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.690,49.4144,8.752,49.3846")
				.queryParam("keys", "highway")
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
	public void test_ubre61y3mg4y_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6539,49.407,8.7313,49.387")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y1M19D")
				.queryParam("timeout", "51")
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
	public void test_uv5tadx5p06q_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("time", "//P1Y9M15D")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "cLyUb:8.74221,49.413,2|d:8.709,49.403109,4")
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
	public void test_vevw82i7pqur_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.439],[8.7094,49.40614],[8.7025,49.424],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "87")
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
	public void test_t4nwzzof4u2h_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "destination=* and area:(1.0 .. 1E6)")
				.queryParam("time", "//P1Y10M17D")
				.queryParam("bcircles", "um:8.730220,49.414885,5")
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
	public void test_t89mjc3ddqnq_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network!=* or type:way and area:(1.0 .. 1E6)")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.40949,8.7043,49.4373,8.70577,49.41975,8.704561,49.403252|8.704561,49.403252,8.7330,49.419317,8.703,49.4308,8.729,49.431364,8.704561,49.403252|8.704561,49.403252,8.7081,49.4353,8.7097,49.4059,8.70455,49.436,8.704561,49.403252")
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
	public void test_toieytx4iura_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.731,49.415,8.703,49.4092,8.70736,49.425,8.704561,49.403252|8.704561,49.403252,8.712,49.401,8.7433,49.424,8.723,49.4164,8.704561,49.403252|8.704561,49.403252,8.7289,49.407029,8.730763,49.404,8.704,49.430665,8.704561,49.403252")
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
	public void test_qxl0ql1sab03_countDensityGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P2Y3M6D")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "Sncur:8.717,49.42566,7")
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
	public void test_t4vpoyjd2ezm_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "W:8.69494,49.416,8.740,49.393")
				.queryParam("keys", "highway")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "8.7451,49.425650,5")
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
	public void test_1ji77a9gyvm1u_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "bxaWp:8.654,49.407,8.730,49.395")
				.queryParam("keys", "highway")
				.queryParam("time", "2018-03-17")
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
	public void test_1hv37zc8qem3q_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.715,49.434140,8.747,49.417,8.742435,49.438,8.704561,49.403252|8.704561,49.403252,8.716,49.4050,8.7003,49.4148,8.7007,49.427,8.704561,49.403252")
				.queryParam("timeout", "49")
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
	public void test_s1h5t5nslr21_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "tracktype!=*")
				.queryParam("bboxes", "UdVlN:8.6740,49.42137,8.711,49.380")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-11-14")
				.queryParam("timeout", "67")
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
	public void test_urxhv8ix6k3b_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "8.721,49.4075,1")
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
	public void test_1k201of4xxn4z_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-01-01")
				.queryParam("timeout", "68")
				.queryParam("bcircles", "wY:8.741150,49.42472,60")
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
	public void test_1ievits9zn31u_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and type:way and id:(1 .. 9999)")
				.queryParam("time", "2014-07-11")
				.queryParam("bcircles", "btL:8.711,49.436,4")
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
	public void test_u7ohnrl9nebc_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "l:8.672,49.429533,8.73479,49.391")
				.queryParam("keys", "highway")
				.queryParam("timeout", "80")
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
	public void test_vevb8x2gaxx5_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "maxspeed!=* or id:(1 .. 9999)")
				.queryParam("format", "json")
				.queryParam("time", "2017-04-07")
				.queryParam("bpolys", "ew:8.704561,49.403252,8.705,49.4251,8.7042,49.436,8.7045,49.431,8.704561,49.403252|Cy:8.704561,49.403252,8.725,49.43088,8.738908,49.435,8.7330,49.438049,8.704561,49.403252|CL:8.704561,49.403252,8.7428,49.4190,8.7488,49.404,8.701,49.4070,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_1hroqqj2p2ed3_countGroupByBoundary2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.65889,49.413,8.75447,49.393")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-04-05")
				.queryParam("timeout", "88")
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
	public void test_sondy5o60chc_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref!=* and not type:way or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6656,49.4085,8.720,49.399")
				.queryParam("values", "cycleway")
				.queryParam("format", "csv")
				.queryParam("time", "2008-07-11")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "b:8.703,49.421194,4")
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
	public void test_qy1pnk7jnkfr_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-06-18")
				.queryParam("bpolys", "OlH:8.704561,49.403252,8.720,49.41721,8.733817,49.416,8.704559,49.434,8.704561,49.403252")
				.queryParam("timeout", "76")
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
	public void test_t8427i7gf5th_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.664,49.411,8.7414,49.3828")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "72")
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
	public void test_s0xbvf9y1y5x_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "8.732,49.412,9|8.734,49.434374,8|8.749145,49.404,1|8.713,49.43675,156")
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
	public void test_qdta3e7a14qa_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-09-19")
				.queryParam("bpolys", "Que:8.704561,49.403252,8.747,49.411870,8.7045,49.41021,8.7317,49.428,8.704561,49.403252|tqkcM:8.704561,49.403252,8.728,49.437,8.742136,49.416008,8.7045,49.410816,8.704561,49.403252")
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
	public void test_uvjpbqfj6053_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("time", "2018-04-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"CApLy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.426],[8.73481,49.4036],[8.74708,49.421932],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"iERF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.4014],[8.704504,49.402],[8.723,49.4339],[8.704561,49.403252]]]}}]}")
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
	public void test_1huzzrt0vsapf_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.68623,49.418,8.756,49.398")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-11-12")
				.queryParam("timeout", "28")
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
	public void test_t8f4zbmgc379_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.686,49.411,8.7302,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "json")
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
	public void test_tonzr1pwbucj_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2009-01-30")
				.queryParam("timeout", "52")
				.queryParam("bcircles", "Rgl:8.72540,49.4371,68")
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
	public void test_tnz2y6nnv3ub_countGroupByBoundary3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "l:8.704561,49.403252,8.748,49.407,8.7232,49.432,8.724,49.417435,8.704561,49.403252|S:8.704561,49.403252,8.745,49.427,8.7390,49.421,8.706,49.403,8.704561,49.403252")
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
	public void test_1h7z981ph3fxg_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* or id:(1 .. 9999)")
				.queryParam("bboxes", "FR:8.661,49.4098,8.729586,49.386")
				.queryParam("format", "json")
				.queryParam("timeout", "51")
				.queryParam("groupByKeys", "lanes:forward,barrier")
				.queryParam("bcircles", "8.722,49.413755,3|8.7262,49.421,9|8.73537,49.428,3")
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
	public void test_t4nwomujht12_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway!=* and area:(1.0 .. 1E6)")
				.queryParam("values", "turning_circle")
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
	public void test_1iun67s2aqwj9_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.71217,49.432,8.7338,49.4332,8.703,49.420,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:street,type,sidewalk")
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
	public void test_sl67c7ovcr4y_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y10M9D")
				.queryParam("timeout", "38")
				.queryParam("groupByKeys", "addr:street,tracktype")
				.queryParam("bcircles", "8.7353,49.439,6|8.7401,49.411,4")
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
	public void test_rhtw9s88738z_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "dp:8.694,49.402038,8.700,49.3912")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y11M1D")
				.queryParam("timeout", "94")
				.queryParam("groupByKeys", "foot,landuse,sidewalk")
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
	public void test_1iv11h6nmfgol_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber=* and not length:( .. 100)")
				.queryParam("bboxes", "TP:8.687069,49.40257,8.752,49.387")
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y4M12D")
				.queryParam("timeout", "70")
				.queryParam("groupByKeys", "barrier,destination,lanes:forward")
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
	public void test_qxzdgqg6det1_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "51")
				.queryParam("groupByKeys", "network,ref,lanes:backward")
				.queryParam("bcircles", "a:8.7348,49.41510,3")
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
	public void test_s4m9uvgt7fp3_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y10M21D")
				.queryParam("bpolys", "T:8.704561,49.403252,8.742,49.432291,8.70864,49.418058,8.70499,49.431,8.704561,49.403252")
				.queryParam("groupByKeys", "maxspeed,turn")
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
	public void test_rl2byzxqpans_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.7417,49.41626,8.715,49.40663,8.749,49.407,8.704561,49.403252")
				.queryParam("timeout", "38")
				.queryParam("groupByKeys", "foot,lanes")
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
	public void test_vbhwz4qdn0pt_countGroupByKey2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "dBu:8.695,49.400,8.7540,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "lit,sidewalk")
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
	public void test_t84mxm488o52_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.658924,49.4247,8.753,49.384|8.651,49.421191,8.75984,49.396")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.72663,49.406,8.705916,49.415640,8.725,49.40886,8.704561,49.403252|8.704561,49.403252,8.72814,49.412,8.704560,49.434,8.723,49.412,8.704561,49.403252|8.704561,49.403252,8.746552,49.4195,8.7039,49.409,8.72471,49.4051,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:housenumber,type")
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
	public void test_1h7wzrke4t3qr_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "natural=wood and id:(1 .. 9999)")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "8.704561,49.403252,8.725,49.4270,8.715,49.4022,8.704987,49.400,8.704561,49.403252|8.704561,49.403252,8.709,49.4014,8.726,49.417,8.702,49.412,8.704561,49.403252")
				.queryParam("timeout", "28")
				.queryParam("bcircles", "agbTO:8.7066,49.410,9")
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
	public void test_1jidb38xvwqif_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "sidewalk=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.6745,49.41779,8.722,49.393|8.660,49.416093,8.737,49.380|8.67338,49.427,8.716,49.39022")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y4M23D")
				.queryParam("groupByKeys", "landuse,maxspeed")
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
	public void test_qxttzljij6ly_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "ref=* and geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("groupByKeys", "addr:city,addr:housenumber,turn:lanes")
				.queryParam("bcircles", "TD:8.712,49.435,83")
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
	public void test_qhw5tqmk2c6u_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6663,49.40270,8.704245,49.392|8.6664,49.4067,8.70108,49.38323|8.6650,49.4230,8.717,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y5M13D")
				.queryParam("groupByKeys", "lanes:forward,name")
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
	public void test_1iev1lqf5cbhv_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "csv")
				.queryParam("groupByKeys", "lit,name")
				.queryParam("bcircles", "8.746,49.4275,1")
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
	public void test_1ibh1kwq5yj52_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "Gv:8.704561,49.403252,8.704,49.40591,8.7008,49.420,8.72155,49.42054,8.704561,49.403252|XHL:8.704561,49.403252,8.716931,49.407,8.704,49.4171,8.709,49.427,8.704561,49.403252|HD:8.704561,49.403252,8.73038,49.43519,8.70465,49.404,8.73620,49.43316,8.704561,49.403252")
				.queryParam("groupByKeys", "oneway,network")
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
	public void test_ubmdn2ct1yyh_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y5M2D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"G\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.4125],[8.703805,49.431],[8.741,49.430],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"QED\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7354,49.437],[8.722,49.40982],[8.7012,49.430],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "smoothness,oneway,building")
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
	public void test_qhvm9ekzg27s_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name!=* and type:way or id:(1 .. 9999)")
				.queryParam("bboxes", "PEoia:8.658331,49.427803,8.7077,49.3936")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "32")
				.queryParam("groupByKeys", "lanes:backward,bicycle")
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
	public void test_1hv8spf4opsmr_countGroupByKey3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "zX:8.686,49.426,8.7224,49.386")
				.queryParam("keys", "highway")
				.queryParam("time", "//P1Y10M10D")
				.queryParam("groupByKeys", "landuse,type")
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
	public void test_r1fls2fmq5o3_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "EEXr:8.662,49.414,8.7198,49.3868")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "service")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-07-28")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"pmvYh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.743,49.4370],[8.701,49.400],[8.7081,49.41750],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "83")
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
	public void test_1jyisq3au8qwk_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "vyWxd:8.660,49.412,8.7454,49.398")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-01-20")
				.queryParam("bpolys", "8.704561,49.403252,8.719,49.4210,8.7018,49.41478,8.702,49.4390,8.704561,49.403252")
				.queryParam("bcircles", "8.730966,49.416,8|8.710,49.428,862|8.7384,49.402056,6")
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
	public void test_1jyds72zqx36p_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop_line,speed_camera,living_street")
				.queryParam("bboxes", "NDlnE:8.6929,49.4237,8.735733,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "34")
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
	public void test_1iut7rndz0yt1_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "ship,house")
				.queryParam("bboxes", "v:8.69438,49.429,8.751,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
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
	public void test_1h7tq4zw972nn_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-08-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"U\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71516,49.431],[8.700,49.429863],[8.700039,49.410],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"NYn\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.4320],[8.704618,49.429162],[8.7088,49.406],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"ZGan\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7247,49.430],[8.708,49.41284],[8.704,49.432],[8.704561,49.403252]]]}}]}")
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
	public void test_rhivweq0hs1g_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "75")
				.queryParam("bcircles", "Bm:8.731,49.424007,9")
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
	public void test_skxvmfimllwy_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* or id:(1 .. 9999)")
				.queryParam("bboxes", "8.6718,49.428,8.724128,49.394|8.668,49.4066,8.7006,49.384|8.654,49.408,8.70914,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-11-20")
				.queryParam("timeout", "50")
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
	public void test_1ib35xbufc38m_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "footway,service")
				.queryParam("bboxes", "i:8.668,49.41296,8.707,49.394")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-12-26")
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
	public void test_urxh35x9r700_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "cycleway,hotel")
				.queryParam("filter", "turn!=* and geometry:polygon")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.722,49.425,84")
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
	public void test_1h7lgp53codgz_countGroupByTag2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-08-28")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "Ap:8.7437,49.432,9|k:8.720,49.400,626467588")
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
	public void test_qhvmq7ydiypk_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "path,platform,secondary_link")
				.queryParam("filter", "foot!=* or type:way and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ohi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726,49.415471],[8.71915,49.410],[8.731,49.434],[8.704561,49.403252]]]}}]}")
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
	public void test_s1h7rdjpfcqd_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "bicycle!=*")
				.queryParam("groupByValues", "crossing")
				.queryParam("bboxes", "U:8.68221,49.419,8.73723,49.3839")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"k\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.712,49.419],[8.744,49.4184],[8.729,49.407],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "67")
				.queryParam("bcircles", "8.726,49.4303,6")
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
	public void test_vbk827n2g3lk_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "platform")
				.queryParam("filter", "destination=* or geometry:polygon or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2008-09-19")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "jK:8.731,49.4104,3|QVw:8.7443,49.4386,9|MOKK:8.74111,49.414,9")
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
	public void test_1h7gdz1yn2zqe_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "church,synagogue,tower")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2007-12-29")
				.queryParam("bcircles", "ae:8.7196,49.4146,1|fC:8.7241,49.4045,4|MGylK:8.704,49.4245,804|ed:8.7487,49.403,973")
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
	public void test_s4xcyedqab05_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "name=* or geometry:polygon")
				.queryParam("bboxes", "MwFE:8.68953,49.418,8.71528,49.393|Zpnem:8.6902,49.4013,8.719,49.381|PDMqD:8.676,49.4264,8.748,49.386")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
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
	public void test_vbq7io0jrbl0_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "stop,speed_camera,turning_circle")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-02-12")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "iNq:8.701,49.427,5|pLH:8.7283,49.414,492")
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
	public void test_qefeqacun707_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "roof,traffic_signals,service")
				.queryParam("bboxes", "TBZl:8.673,49.414174,8.7208,49.390")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
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
	public void test_1ibjvao8kgep1_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit!=* and not id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("bpolys", "zK:8.704561,49.403252,8.726163,49.41206,8.7049,49.4010,8.701698,49.437,8.704561,49.403252|CD:8.704561,49.403252,8.7037,49.414,8.704531,49.411,8.7093,49.4347,8.704561,49.403252")
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
	public void test_1h7qzjf9iex4j_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "public")
				.queryParam("filter", "lit!=* and geometry:polygon and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2013-07-06")
				.queryParam("timeout", "71")
				.queryParam("bcircles", "8.725,49.423,5")
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
	public void test_rhjdrcx0ub03_countGroupByTag3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("groupByValues", "cycleway,construction")
				.queryParam("bboxes", "eOhq:8.6696,49.40510,8.747,49.3988")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("time", "2017-08-15")
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
	public void test_1jy4xe9w20jfp_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "m:8.664924,49.428313,8.748341,49.384")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-05-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"zF\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70891,49.410],[8.7077,49.409],[8.704266,49.423316],[8.704561,49.403252]]]}}]}")
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
	public void test_1iyqld4t9vjg9_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "UJ:8.6636,49.418526,8.702,49.38072|iC:8.666,49.422,8.7361,49.383")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-09-22")
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
	public void test_ubp6zg2elug5_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-02-08")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "bk:8.711,49.407,3")
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
	public void test_1hrgi7gl9bq02_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("timeout", "70")
				.queryParam("bcircles", "8.7209,49.421,19")
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
	public void test_rlam4k45a69g_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:street!=* or not type:way")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"b\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7384,49.413],[8.721,49.406],[8.722,49.421],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7008,49.410],[8.709,49.403],[8.703,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"MX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727674,49.407],[8.7011,49.419],[8.7009,49.421],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "39")
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
	public void test_ubj5w300fh2o_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "lit=* and geometry:polygon and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-12-05")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "i:8.742953,49.406838,7")
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
	public void test_1iyq3w7qq9h6g_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2018-04-22")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"V\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.720,49.410],[8.74480,49.405],[8.718,49.434],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"MYh\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7146,49.43612],[8.7200,49.401],[8.707,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "77")
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
	public void test_1ib6hkhzqn8l2_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("time", "2014-09-11")
				.queryParam("bpolys", "d:8.704561,49.403252,8.722,49.4201,8.708961,49.4272,8.7271,49.414419,8.704561,49.403252|mO:8.704561,49.403252,8.749,49.425,8.737,49.43288,8.707,49.431753,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_trz3ptbpr86v_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("format", "json")
				.queryParam("time", "2010-01-22")
				.queryParam("bpolys", "pvu:8.704561,49.403252,8.738,49.416,8.703,49.4285,8.744,49.435,8.704561,49.403252")
				.queryParam("timeout", "40")
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
	public void test_s0xb0kexpv76_countGroupByType2() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "smoothness=*")
				.queryParam("bboxes", "8.680,49.4177,8.712692,49.392")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_1hrgf39oxw8qc_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "8.6557,49.4203,8.727,49.397664")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-11-11")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UHa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7106,49.4231],[8.7181,49.404],[8.714152,49.4267],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"BnHUl\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.710,49.413],[8.720,49.437],[8.70232,49.406],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"FXg\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.704,49.436],[8.742,49.4224],[8.706,49.43435],[8.704561,49.403252]]]}}]}")
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
	public void test_skscxeg26o8k_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "highway!=* and geometry:polygon and not length:( .. 100)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-01-24")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "Pv:8.722458,49.409,9|e:8.742,49.4210,2")
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
	public void test_s1gpwiwlsmcz_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2018-01-03")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "zDzXC:8.73794,49.412,75")
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
	public void test_1hrgi53dbygqa_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "network=* or geometry:line or length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-04-10")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "BTEz:8.745,49.4131,7|h:8.701,49.425,9")
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
	public void test_rlap6cixf0ac_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "addr:housenumber!=* or geometry:point or length:( .. 100)")
				.queryParam("bboxes", "uz:8.6992,49.423,8.719415,49.385")
				.queryParam("format", "csv")
				.queryParam("time", "2017-04-11")
				.queryParam("timeout", "60")
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
	public void test_1hbj8s2rof9rq_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("filter", "oneway=* and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-08-21")
				.queryParam("bpolys", "C:8.704561,49.403252,8.717795,49.409,8.7207,49.413,8.704355,49.41329,8.704561,49.403252")
				.queryParam("timeout", "96")
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
	public void test_t8f5avlhnbqp_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-08-25")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.712,49.413,12")
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
	public void test_qeexkvm8sjfo_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bboxes", "ds:8.6570,49.4047,8.716,49.388|POF:8.692,49.4122,8.7266,49.399|c:8.650,49.4216,8.71953,49.38929|LDRp:8.690,49.413,8.7169,49.3914")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("time", "2011-04-23")
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
	public void test_s4schx5fo8c4_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("bpolys", "l:8.704561,49.403252,8.745,49.437266,8.726,49.424,8.702873,49.412,8.704561,49.403252|agd:8.704561,49.403252,8.7474,49.4041,8.7045,49.4190,8.70720,49.410,8.704561,49.403252")
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
	public void test_1jy88c19puotv_countGroupByType3() {
		try {
			Response response = RestAssured
			.given()
				.log().all()
				.queryParam("bcircles", "8.723,49.406,49|8.701,49.403,5|8.7218,49.430,5|8.7117,49.400,253417029")
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
