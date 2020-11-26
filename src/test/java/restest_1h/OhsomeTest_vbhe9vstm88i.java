package restest_1h;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OhsomeTest_vbhe9vstm88i {


	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8080/";
	}

	@Test
	public void test_1hv89j63k510j_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-07-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"w\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.43588],[8.704,49.431],[8.701,49.4088],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"s\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.723722,49.404],[8.722,49.439],[8.706146,49.4020],[8.704561,49.403252]]]}}]}")
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
	public void test_1iavehai0nl12_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "point,line,polygon,other")
				.queryParam("bcircles", "PL:8.7056,49.433,54|sfd:8.716,49.40490,18")
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
	public void test_ubrfqaaderle_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "point,line,polygon,other")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.721,49.425,8")
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
	public void test_1hrrlp2kufos0_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "way,relation")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-06-15")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.4372,8.7281,49.433114,8.707,49.4376,8.704561,49.403252|8.704561,49.403252,8.7002,49.404,8.704269,49.437,8.704579,49.4110,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_1jy4y8qyck0mv_area() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types", "line,polygon,other")
				.queryParam("bboxes", "k:8.652,49.409916,8.70260,49.388|zglyC:8.670,49.4187,8.759,49.390")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-10-13")
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
	public void test_rhiucg8uld2c_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "l:8.6690,49.423,8.722,49.3937")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("time", "2017-01-17")
				.queryParam("bpolys", "8.704561,49.403252,8.7254,49.410915,8.73811,49.433,8.704,49.4044,8.704561,49.403252|8.704561,49.403252,8.749,49.407302,8.724,49.414,8.700672,49.427,8.704561,49.403252")
				.queryParam("timeout", "85")
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
	public void test_1k22aogv7dyye_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.704,49.414,20|8.745,49.42019,59|8.716,49.417,7")
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
	public void test_r17u0fk57giq_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LY:8.6873,49.419,8.7015,49.38379")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-08-19")
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
	public void test_1jew3b3ok8v90_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2013-06-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.732,49.423866],[8.711,49.4043],[8.7050,49.401],[8.704561,49.403252]]]}}]}")
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
	public void test_1h7u98o519xet_area1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ZCoLA:8.659,49.42979,8.742,49.395|aa:8.657,49.4206,8.734,49.3979")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("timeout", "27")
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
	public void test_1hrdp9ncsld80_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-17")
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
	public void test_1jym2tn49kcah_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "Qk:8.732,49.416,6")
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
	public void test_ts1xtvtkfigj_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "93")
				.queryParam("bcircles", "Y:8.74801,49.42373,8|wg:8.7311,49.403,9|usMII:8.734887,49.410,9|wpF:8.70297,49.4011,956")
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
	public void test_1je9ya8g3jqlh_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.713266,49.4318,8.701,49.4218,8.70842,49.425,8.704561,49.403252|8.704561,49.403252,8.7400,49.4174,8.70304,49.41192,8.706,49.4358,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_urundiqf6omv_areaDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2013-11-07")
				.queryParam("bpolys", "bg:8.704561,49.403252,8.712,49.417,8.7020,49.405,8.708,49.436,8.704561,49.403252|mC:8.704561,49.403252,8.706,49.4165,8.708,49.402,8.70457,49.426,8.704561,49.403252")
				.queryParam("timeout", "83")
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
	public void test_t8445huh8dpf_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or length:( .. 100)")
				.queryParam("bboxes", "Zh:8.69608,49.412,8.700000,49.3906")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2010-02-08")
				.queryParam("bpolys", "ijLPc:8.704561,49.403252,8.74587,49.4081,8.70439,49.422,8.732,49.4043,8.704561,49.403252|Q:8.704561,49.403252,8.727,49.40629,8.70201,49.415,8.7009,49.404834,8.704561,49.403252")
				.queryParam("bcircles", "8.745134,49.407,4|8.7096,49.425,2")
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
	public void test_qxobj0m6yiqt_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=*")
				.queryParam("bboxes", "8.6715,49.403,8.751236,49.3864")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "95")
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
	public void test_1h82083l36u5u_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.664690,49.418,8.736,49.390")
				.queryParam("keys", "highway")
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
	public void test_qxfhynou8qbc_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "TKtpd:8.655,49.401,8.7313,49.38075")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("time", "2010-05-04")
				.queryParam("timeout", "87")
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
	public void test_1iext29umef6t_areaDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("time", "2017-08-30")
				.queryParam("bcircles", "8.741,49.426,7")
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
	public void test_rhlm1ftmvrci_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "cc:8.676,49.415,8.7023,49.392")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("time", "2015-11-04")
				.queryParam("bpolys", "8.704561,49.403252,8.726488,49.43268,8.706,49.435,8.730,49.4213,8.704561,49.403252|8.704561,49.403252,8.71618,49.4326,8.704308,49.429,8.7312,49.414804,8.704561,49.403252")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "K:8.740,49.4105,9|hiygg:8.7087,49.41771,24|JYjsM:8.713,49.4066,88|v:8.732,49.4383,1")
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
	public void test_r1fneq0anlus_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=*")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TrO\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74997,49.430],[8.702,49.423],[8.7042,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"X\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703907,49.4198],[8.705,49.430],[8.7045,49.4082],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"VbZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.733,49.420],[8.702,49.43237],[8.737,49.415],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "25")
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
	public void test_qxobzqrfmlwm_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "2017-04-03")
				.queryParam("bpolys", "N:8.704561,49.403252,8.715,49.4232,8.716,49.436,8.732,49.422,8.704561,49.403252|bIxo:8.704561,49.403252,8.71906,49.4054,8.740,49.412334,8.703,49.4202,8.704561,49.403252")
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
	public void test_u7znjti4zyoy_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.68100,49.4027,8.719,49.39240|8.658732,49.417,8.709,49.384")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-11-23")
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
	public void test_1iupx7txmndwx_areaDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6908,49.412,8.7419,49.3971|8.683,49.40069,8.730,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
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
	public void test_1iyqjerc5n035_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or type:way or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("time", "2010-05-10")
				.queryParam("timeout", "61")
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
	public void test_1h82js7dbesz4_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "ySrrb:8.704561,49.403252,8.742,49.406,8.704103,49.40589,8.738,49.4185,8.704561,49.403252")
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
	public void test_u8aq9e13dnw5_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("time", "2011-08-29")
				.queryParam("bcircles", "8.717,49.428,48")
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
	public void test_qy4xsagvt9b6_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("time", "2015-04-08")
				.queryParam("bcircles", "E:8.74074,49.4031,76")
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
	public void test_ublujtieegyp_areaDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.698,49.402,8.751,49.3876")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "28")
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
	public void test_1jyagmd964zfp_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-09-30")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.708,49.40824,8.709,49.40102,8.744,49.432,8.704561,49.403252|BZ:8.704561,49.403252,8.742594,49.403531,8.743,49.400082,8.723,49.43593,8.704561,49.403252|Qfdjk:8.704561,49.403252,8.70437,49.426,8.710,49.4187,8.700,49.414078,8.704561,49.403252")
				.queryParam("bcircles", "8.7455,49.417,2|8.718,49.416,7")
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
	public void test_r17bmq66n5fa_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and not length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-11-16")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"PB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72956,49.41103],[8.721,49.422],[8.736,49.4024],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "42")
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
	public void test_vbeog7hf0w8j_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=*")
				.queryParam("bboxes", "SWX:8.65787,49.423733,8.729665,49.394|a:8.6799,49.404,8.71595,49.385|QDtlC:8.68175,49.40098,8.7263,49.394|OoUgD:8.6993,49.42170,8.733478,49.387157")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "74")
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
	public void test_1jei8il7oxftt_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,construction,public")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "O:8.720,49.434152,5|McAK:8.7184,49.40464,6")
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
	public void test_r1g4y5i1wmsl_areaDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "zdeJk:8.704561,49.403252,8.724,49.4218,8.702,49.4062,8.704,49.418,8.704561,49.403252")
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
	public void test_sobswz5d0vol_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,pedestrian,roof")
				.queryParam("filter", "sidewalk=* or type:way and length:( .. 100)")
				.queryParam("bboxes", "JRmxb:8.6763,49.406334,8.7254,49.381")
				.queryParam("groupByKey", "highway")
				.queryParam("bpolys", "J:8.704561,49.403252,8.728,49.404,8.733,49.417,8.703,49.434,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_1h84rzz0h6erc_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "university,demolished")
				.queryParam("bboxes", "8.6770,49.422597,8.7367,49.382")
				.queryParam("format", "geojson")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "ADs:8.732,49.402,9|aznp:8.740,49.40353,5")
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
	public void test_vf47ment6tkm_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "h:8.660,49.406435,8.703879,49.381|xIjUy:8.694,49.427,8.724765,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("time", "2010-02-03")
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
	public void test_ublw3vyqetyo_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.658,49.426,8.7464,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("timeout", "81")
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
	public void test_s15kdyf87jg3_areaDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,track,hotel")
				.queryParam("bboxes", "8.692762,49.40205,8.75691,49.390")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "67")
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
	public void test_vb3k6ekz8pip_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Ua:8.683676,49.4089,8.751055,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-06-01")
				.queryParam("bpolys", "axc:8.704561,49.403252,8.718,49.436,8.747416,49.416,8.704,49.426,8.704561,49.403252|Hv:8.704561,49.403252,8.7109,49.43346,8.704561,49.4036,8.7464,49.4038,8.704561,49.403252|vQ:8.704561,49.403252,8.748,49.42544,8.7139,49.4152,8.733,49.41106,8.704561,49.403252")
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
	public void test_1hbdqepx0qptl_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tertiary")
				.queryParam("values", "street_lamp")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "hzGN:8.7136,49.40473,3")
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
	public void test_s1dwylqysm5s_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "primary,steps,dormitory")
				.queryParam("bboxes", "8.666,49.404,8.72959,49.392021|8.68438,49.4093,8.73311,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2018-01-13")
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
	public void test_u7zlxa8kkj8k_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7151,49.4321,8.7454,49.4331,8.702407,49.43540,8.704561,49.403252")
				.queryParam("timeout", "32")
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
	public void test_1iun4nhqxxp9s_areaDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("time", "2010-11-18")
				.queryParam("bpolys", "sZ:8.704561,49.403252,8.706,49.416,8.7165,49.42441,8.7030,49.435,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_ts1wnyquthep_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=*")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-10-07")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"GflZT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7442,49.4345],[8.741,49.424],[8.706998,49.42076],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"x\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.711,49.439],[8.7215,49.414],[8.7177,49.435],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "8.739,49.405,6|8.7278,49.42041,67")
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
	public void test_vf97m61ytx6c_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:way or id:(1 .. 9999)")
				.queryParam("groupByValues", "hospital")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "hSq:8.719778,49.422575,549")
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
	public void test_1jyd9vstj1nw6_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "steps,demolished,platform")
				.queryParam("filter", "addr:housenumber!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-03-08")
				.queryParam("bpolys", "x:8.704561,49.403252,8.71732,49.417,8.727,49.4065,8.711,49.409,8.704561,49.403252|pX:8.704561,49.403252,8.711,49.400,8.711,49.4352,8.7402,49.435,8.704561,49.403252")
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
	public void test_t4yfwrvom4ol_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=*")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-05-10")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"mQ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.43337],[8.735,49.425],[8.704561,49.403375],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"d\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.408],[8.703,49.430],[8.727580,49.4186],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "23")
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
	public void test_1jefgciap1lbr_areaDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,roof")
				.queryParam("bboxes", "t:8.6971,49.40253,8.738116,49.387")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "94")
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
	public void test_t84kz8bi3mer_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-10-12")
				.queryParam("bpolys", "L:8.704561,49.403252,8.701,49.41250,8.704584,49.418,8.721,49.4062,8.704561,49.403252|zLN:8.704561,49.403252,8.71467,49.407,8.704,49.40940,8.724,49.4251,8.704561,49.403252")
				.queryParam("bcircles", "bD:8.7239,49.428,25|S:8.7327,49.41901,539")
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
	public void test_qhnbsdol5buc_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-12-29")
				.queryParam("bpolys", "WTs:8.704561,49.403252,8.70753,49.408,8.716,49.408,8.7048,49.4187,8.704561,49.403252")
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
	public void test_u7zl50ho475l_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2009-11-13")
				.queryParam("bcircles", "IcDV:8.729,49.413,46|TH:8.747,49.428,6|p:8.703,49.403803,9|N:8.744,49.433805,7")
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
	public void test_s4pl6t40aam0_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-03-13")
				.queryParam("bpolys", "8.704561,49.403252,8.736,49.423,8.706,49.40890,8.704,49.42813,8.704561,49.403252|8.704561,49.403252,8.705,49.424116,8.726,49.4080,8.718,49.419,8.704561,49.403252")
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
	public void test_1jeqkxnalryw5_areaDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "JkrEz:8.669258,49.4217,8.703,49.38758|pCx:8.667,49.40633,8.752,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-06-19")
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
	public void test_sl90a4vo3iuu_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "nU:8.654,49.417659,8.709,49.387|bSuO:8.661,49.411,8.7414,49.387|uxn:8.688,49.421,8.71560,49.391")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "88")
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
	public void test_1iyfgs1soifqw_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=* and length:( .. 100)")
				.queryParam("bboxes", "PmXhk:8.6918,49.4194,8.75988,49.390")
				.queryParam("format", "csv")
				.queryParam("time", "2008-07-25")
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
	public void test_tony4igka5vc_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.67572,49.403,8.7240,49.395|8.653,49.423,8.75559,49.384|8.68934,49.414,8.719436,49.389|8.675,49.4225,8.706,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
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
	public void test_1hr8otg098unq_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.685,49.406,8.7582,49.3818")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-05-10")
				.queryParam("timeout", "82")
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
	public void test_1jetcpj37rb5d_areaDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or type:node")
				.queryParam("bboxes", "zs:8.652,49.416,8.7408,49.392")
				.queryParam("format", "csv")
				.queryParam("time", "2015-10-03")
				.queryParam("timeout", "33")
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
	public void test_1h84t8lh6k8c6_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.692,49.406,8.75408,49.394|8.657,49.420,8.7019,49.383|8.694,49.410767,8.7014,49.393|8.651,49.419,8.719,49.396208")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-02-10")
				.queryParam("bpolys", "8.704561,49.403252,8.7162,49.41685,8.707673,49.4276,8.747,49.4152,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_qxnrnlzjmfdt_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"cqYS\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7210,49.431],[8.7058,49.40221],[8.732,49.42461],[8.704561,49.403252]]]}}]}")
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
	public void test_sksugs9vu15y_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "8.749,49.412,6|8.732738,49.43404,1|8.714,49.42478,2")
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
	public void test_1jew1fqsgmhr5_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:node or not area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "yuPd:8.705,49.410,5")
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
	public void test_1jxzwmebvmv6s_areaGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("timeout", "45")
				.queryParam("bcircles", "HJwms:8.7015,49.411174,1")
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
	public void test_urmucz7p85di_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and length:( .. 100)")
				.queryParam("bboxes", "8.690,49.404,8.733,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7121,49.43810],[8.7445,49.421],[8.74149,49.424563],[8.704561,49.403252]]]}}]}")
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
	public void test_vb6cqgya2k4j_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:way")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YgU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7062,49.410],[8.7070,49.43829],[8.7049,49.419725],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"fC\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.4302],[8.7294,49.42672],[8.7042,49.4370],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"PPmuX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.726562,49.42301],[8.73206,49.4372],[8.70171,49.404],[8.704561,49.403252]]]}}]}")
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
	public void test_1jxzy3zy7jry1_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-10-25")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"AcSsU\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.411],[8.703,49.422],[8.7479,49.409],[8.704561,49.403252]]]}}]}")
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
	public void test_sl9gpu7w7xo4_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:way")
				.queryParam("bboxes", "M:8.683,49.407,8.755,49.388|Ooj:8.6890,49.417,8.737,49.3871|VMorZ:8.686,49.429567,8.721575,49.3950|V:8.653,49.400723,8.757,49.39902")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "41")
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
	public void test_1if0j78jy0tpi_areaGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or id:(1 .. 9999)")
				.queryParam("bpolys", "O:8.704561,49.403252,8.70041,49.406,8.706112,49.4297,8.703,49.434,8.704561,49.403252|JIiXw:8.704561,49.403252,8.723,49.427,8.733,49.4039,8.741,49.401,8.704561,49.403252|y:8.704561,49.403252,8.729,49.430,8.703479,49.420,8.701322,49.423,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_t4f2ng97efqr_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,emergency_access_point,service")
				.queryParam("bboxes", "8.6701,49.4014,8.730,49.3814|8.650,49.420,8.752766,49.397")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2010-09-12")
				.queryParam("bpolys", "njX:8.704561,49.403252,8.71284,49.4133,8.7494,49.420037,8.742,49.432,8.704561,49.403252|Zhs:8.704561,49.403252,8.716,49.401679,8.743929,49.414,8.741103,49.417,8.704561,49.403252")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "yD:8.709494,49.4171,6")
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
	public void test_1h822675e0e3q_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "chapel")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
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
	public void test_1hux8dqro2qsx_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,church,civic")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "RaiXv:8.7398,49.407,7|Yd:8.7346,49.434657,7|F:8.722,49.415,9|LQCgU:8.718022,49.4139,254")
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
	public void test_1jeyvxsrchc8g_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hD:8.652,49.416,8.727727,49.385299|Ad:8.66869,49.403,8.715,49.397|HlqfA:8.6638,49.4213,8.738894,49.388|TVcF:8.6701,49.427,8.739,49.381783")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-07-20")
				.queryParam("timeout", "29")
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
	public void test_qhkkpxe1d2zl_areaGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,elevator,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2016-05-02")
				.queryParam("bpolys", "8.704561,49.403252,8.715,49.4296,8.70361,49.4074,8.709,49.435494,8.704561,49.403252|8.704561,49.403252,8.724,49.41352,8.702789,49.430348,8.74518,49.431,8.704561,49.403252|8.704561,49.403252,8.728,49.426,8.742,49.433,8.7000,49.417,8.704561,49.403252")
				.queryParam("timeout", "88")
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
	public void test_r1g465m8spr5_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or type:way and not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-09-19")
				.queryParam("bpolys", "pllL:8.704561,49.403252,8.701,49.4317,8.7374,49.420,8.7403,49.403,8.704561,49.403252|DZcpk:8.704561,49.403252,8.7342,49.4364,8.702,49.423,8.704560,49.405,8.704561,49.403252|HZKKC:8.704561,49.403252,8.747,49.4349,8.732045,49.420,8.744,49.420,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_1ib6h99vhw2g3_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "secondary_link")
				.queryParam("bboxes", "oepE:8.6508,49.415,8.726,49.3892")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2016-02-08")
				.queryParam("bpolys", "z:8.704561,49.403252,8.725,49.420,8.709,49.423,8.702,49.418441,8.704561,49.403252|E:8.704561,49.403252,8.714,49.435,8.716,49.425,8.70794,49.431487,8.704561,49.403252|eveE:8.704561,49.403252,8.70439,49.419,8.740,49.408,8.704069,49.4098,8.704561,49.403252")
				.queryParam("bcircles", "8.727294,49.400,7")
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
	public void test_1iun67kj7qezp_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,yes")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-07-13")
				.queryParam("bpolys", "y:8.704561,49.403252,8.72391,49.411,8.7496,49.424,8.7043,49.400,8.704561,49.403252|aSrFC:8.704561,49.403252,8.7150,49.419,8.719163,49.421,8.714,49.41423,8.704561,49.403252|i:8.704561,49.403252,8.747,49.433135,8.704561,49.420,8.7030,49.428118,8.704561,49.403252")
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
	public void test_qhsu3p6c6l42_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or geometry:point and length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "92")
				.queryParam("bcircles", "o:8.714,49.411,8")
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
	public void test_1jy27k850x0tg_areaGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "ship,dormitory,university")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2011-02-04")
				.queryParam("bpolys", "Qbc:8.704561,49.403252,8.700,49.41413,8.720744,49.42588,8.7185,49.430,8.704561,49.403252|VPoD:8.704561,49.403252,8.712,49.4222,8.749,49.409,8.7072,49.4351,8.704561,49.403252|xO:8.704561,49.403252,8.733,49.415,8.70341,49.4045,8.7047,49.411,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_1iusrbu28tvmt_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* and type:way and not length:( .. 100)")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("time", "2014-05-24")
				.queryParam("bpolys", "8.704561,49.403252,8.7003,49.430,8.707372,49.412,8.7193,49.413,8.704561,49.403252|8.704561,49.403252,8.737,49.439,8.710,49.416,8.70458,49.414,8.704561,49.403252|8.704561,49.403252,8.733,49.410,8.701,49.417625,8.7498,49.435038,8.704561,49.403252")
				.queryParam("groupByKeys", "name,type")
				.queryParam("bcircles", "8.705606,49.406,2")
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
	public void test_rh89k94eoaid_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "KNez:8.695,49.402,8.727,49.384")
				.queryParam("bpolys", "E:8.704561,49.403252,8.741842,49.404,8.73221,49.406,8.704504,49.4161,8.704561,49.403252|aA:8.704561,49.403252,8.731770,49.424288,8.730,49.4006,8.702611,49.4306,8.704561,49.403252")
				.queryParam("timeout", "46")
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
	public void test_qhql12ohw8c9_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or not geometry:line")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-05-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.703,49.43516],[8.704579,49.438],[8.7489,49.430],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"I\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.708,49.4004],[8.72818,49.408854],[8.704,49.430],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"s\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7191,49.41889],[8.725,49.435],[8.716,49.439],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "turn,bicycle,ref")
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
	public void test_rkziyk16jp6h_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6860,49.429,8.759,49.388")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("groupByKeys", "building,highway,name")
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
	public void test_1h7whghqe9n3n_areaGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("bpolys", "r:8.704561,49.403252,8.712,49.435,8.743,49.409,8.7072,49.419,8.704561,49.403252|gno:8.704561,49.403252,8.736,49.403,8.709,49.406450,8.747398,49.424,8.704561,49.403252")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "smoothness,maxspeed")
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
	public void test_u8552v87367s_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and geometry:point")
				.queryParam("time", "2012-07-03")
				.queryParam("groupByKeys", "surface")
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
	public void test_qxg07j2v0yep_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "CAroq:8.693,49.4287,8.727,49.382|n:8.669,49.4046,8.7245,49.385|d:8.6576,49.4220,8.744,49.39545|TCeOI:8.6712,49.4033,8.747,49.383")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("time", "2016-11-01")
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
	public void test_urxflq5t1hrq_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-03-26")
				.queryParam("bpolys", "Qa:8.704561,49.403252,8.728,49.421,8.713,49.42962,8.73019,49.4276,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:postcode,landuse,building")
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
	public void test_ubluxl5114dh_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "false")
				.queryParam("groupByKeys", "lanes:forward,addr:country,network")
				.queryParam("bcircles", "UayWb:8.73709,49.4149,3")
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
	public void test_1ibjvre1tngx2_areaGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-08-17")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"rX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.71768,49.4352],[8.70516,49.409],[8.74236,49.4200],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "network,landuse,ref")
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
	public void test_1hrs2rsm1tq9g_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tertiary")
				.queryParam("filter", "maxspeed=* or type:node and not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "aCPJN:8.658,49.41101,8.7495,49.385|N:8.671,49.4174,8.718333,49.391|F:8.655,49.419,8.7132,49.389|x:8.686,49.40610,8.749,49.3983")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-06-27")
				.queryParam("bcircles", "acurz:8.707,49.420,81")
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
	public void test_ubuptiahxd14_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=*")
				.queryParam("values", "tertiary")
				.queryParam("time", "2008-04-09")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "F:8.709,49.4258,3|o:8.7391,49.4010,1")
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
	public void test_1ib0fpmfa2cs9_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.741,49.4073,9")
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
	public void test_vb93c73yrbqr_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,give_way")
				.queryParam("bboxes", "8.692,49.41120,8.718692,49.3801|8.684,49.401,8.737,49.3931")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-02-08")
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
	public void test_t4a1cvshorc1_areaGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "eu:8.704561,49.403252,8.7183,49.407674,8.706,49.419,8.742,49.428,8.704561,49.403252|zin:8.704561,49.403252,8.747,49.424,8.704575,49.422,8.702,49.428501,8.704561,49.403252")
				.queryParam("timeout", "62")
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
	public void test_us099387zq5x_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.665740,49.411,8.7447,49.385|8.668,49.4054,8.740,49.382")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.72482,49.423,8.72215,49.425,8.733,49.4230,8.704561,49.403252|8.704561,49.403252,8.726,49.4215,8.7361,49.40886,8.70404,49.4013,8.704561,49.403252|8.704561,49.403252,8.723,49.418,8.704668,49.423,8.704,49.4347,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_t4sxx0r66vqo_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface!=* or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.6890,49.429,8.707794,49.380")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.705,49.4226,8.7245,49.401,8.745,49.428,8.704561,49.403252|8.704561,49.403252,8.722,49.4319,8.70104,49.4057,8.749,49.439748,8.704561,49.403252")
				.queryParam("bcircles", "8.7456,49.422,2|8.7398,49.4112,32|8.702201,49.43895,1|8.727,49.432,32")
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
	public void test_rkwsctupybsi_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "give_way,street_lamp")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-31")
				.queryParam("timeout", "21")
				.queryParam("bcircles", "p:8.702735,49.430,40|K:8.740,49.436,2")
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
	public void test_1jer2h9ez906o_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "D:8.657,49.421,8.741,49.389687|cU:8.67999,49.4111,8.744,49.3910")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
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
	public void test_qxi99tqqifqq_areaGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform")
				.queryParam("filter", "network!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "n:8.696,49.4080,8.726129,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "22")
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
	public void test_vb41pkyjnv3m_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.671057,49.4151,8.739,49.383|8.652,49.4030,8.729,49.3941|8.6680,49.400,8.743,49.392|8.66277,49.411,8.746,49.3899")
				.queryParam("keys", "highway")
				.queryParam("time", "2008-05-12")
				.queryParam("bpolys", "8.704561,49.403252,8.737,49.426,8.741,49.431,8.707,49.413,8.704561,49.403252")
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
	public void test_toa5zfg5fm1v_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6767,49.420072,8.720,49.383|8.656,49.416,8.703,49.388")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "82")
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
	public void test_ubrg4bg84jsk_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and not geometry:line")
				.queryParam("format", "json")
				.queryParam("time", "2016-05-07")
				.queryParam("bpolys", "Q:8.704561,49.403252,8.70226,49.402187,8.707957,49.426817,8.701,49.411,8.704561,49.403252")
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
	public void test_r1aledvupilh_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.740,49.4040,8.70432,49.42072,8.704004,49.420,8.704561,49.403252|8.704561,49.403252,8.721,49.402,8.735,49.409,8.70458,49.4214,8.704561,49.403252")
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
	public void test_ts1vf6du4aph_areaGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber!=* and geometry:polygon and not area:(1.0 .. 1E6)")
				.queryParam("bpolys", "TkLH:8.704561,49.403252,8.701,49.4247,8.715,49.40400,8.703,49.42513,8.704561,49.403252")
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
	public void test_1ibbhbhonzwwx_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iDR:8.675539,49.4158,8.7122,49.391|hx:8.684,49.418,8.7472,49.398|fB:8.6847,49.4007,8.711,49.395|Y:8.6762,49.42829,8.74847,49.3888")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-12-29")
				.queryParam("bcircles", "z:8.72940,49.409,94")
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
	public void test_sohd8yw3gfvl_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.7171,49.42620,51")
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
	public void test_1jecpqnuirynq_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-09-09")
				.queryParam("timeout", "55")
				.queryParam("bcircles", "8.7091,49.4389,91")
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
	public void test_1h7gdik1s0a43_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "X:8.686,49.418,8.7176,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-12-19")
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
	public void test_skna4sj38z01_areaGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "w:8.650,49.4138,8.757,49.3856")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("timeout", "62")
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
	public void test_s4xdqohmneb7_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,line,")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("time", "2014-05-22")
				.queryParam("bpolys", "ervVD:8.704561,49.403252,8.734,49.4247,8.702,49.4395,8.711,49.4057,8.704561,49.403252|V:8.704561,49.403252,8.722,49.431,8.70283,49.419,8.73813,49.419,8.704561,49.403252|JrjU:8.704561,49.403252,8.732015,49.41439,8.71010,49.4285,8.706069,49.432499,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "100")
				.queryParam("bcircles", "8.726,49.416072,5")
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
	public void test_r1a46q6r4l7o_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "polygon,other")
				.queryParam("format", "csv")
				.queryParam("filter2", "foot=* or geometry:line or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.7069,49.416,121")
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
	public void test_t4f3cvqzm6gm_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "iRlPY:8.704561,49.403252,8.712,49.421,8.70486,49.430,8.7437,49.4325,8.704561,49.403252|MK:8.704561,49.403252,8.717949,49.4288,8.704536,49.427,8.706,49.424,8.704561,49.403252|M:8.704561,49.403252,8.747292,49.4185,8.715323,49.4368,8.7048,49.427,8.704561,49.403252")
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
	public void test_qxg0zrlllgs5_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.417,8.7132,49.397")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "type=* or not type:way")
				.queryParam("time", "2018-04-25")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "38")
				.queryParam("values2", "give_way")
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
	public void test_qe1202xtdlq0_areaRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("filter2", "network=* and type:way")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "ULTzj:8.741703,49.438,5")
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
	public void test_qhw4nkzuqtyo_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or type:node")
				.queryParam("types2", "way,")
				.queryParam("format", "geojson")
				.queryParam("filter2", "highway!=* and not geometry:point")
				.queryParam("time", "2012-11-02")
				.queryParam("bpolys", "8.704561,49.403252,8.739,49.408,8.704592,49.400,8.720,49.411,8.704561,49.403252|8.704561,49.403252,8.726,49.4363,8.731894,49.424,8.73163,49.4067,8.704561,49.403252|8.704561,49.403252,8.729,49.425,8.708,49.431541,8.748,49.435,8.704561,49.403252")
				.queryParam("bcircles", "8.726,49.4116,5")
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
	public void test_rkzk744rcf39_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "relation")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("filter2", "addr:country=* and geometry:line")
				.queryParam("time", "2007-11-02")
				.queryParam("bpolys", "NH:8.704561,49.403252,8.722,49.4059,8.71051,49.42661,8.730260,49.402,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "77")
				.queryParam("values2", "emergency_access_point")
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
	public void test_vf3nnz4hfh2v_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "j:8.690,49.413241,8.71849,49.389|D:8.6531,49.416,8.72405,49.385")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,other")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("filter2", "maxspeed!=* or geometry:line or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "96")
				.queryParam("values2", "tertiary")
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
	public void test_rl7uckoh183d_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "iuWig:8.651414,49.416,8.731,49.3804|ItHvQ:8.665,49.407,8.73811,49.395")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("values", "stop")
				.queryParam("format", "geojson")
				.queryParam("filter2", "building!=* or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "73")
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
	public void test_ure2a5ypw4s0_areaRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LJrJa:8.679,49.4242,8.727,49.383|FEnnU:8.690,49.413588,8.70886,49.390|xFPpc:8.6750,49.418,8.716011,49.389")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("time", "2008-09-03")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
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
	public void test_1iyhsi5gwfqe9_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or geometry:line and id:(1 .. 9999)")
				.queryParam("bboxes", "bvvou:8.671789,49.41900,8.70593,49.397|fGnpr:8.667,49.40590,8.7521,49.3862")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-04-28")
				.queryParam("bpolys", "8.704561,49.403252,8.73123,49.433,8.745,49.428,8.7014,49.432,8.704561,49.403252")
				.queryParam("timeout", "50")
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
	public void test_vbk59l3zovhd_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "G:8.679,49.405,8.704,49.389|N:8.6546,49.403,8.725,49.3888|kz:8.666,49.410,8.72538,49.385976|RbTUf:8.668,49.418,8.7008,49.396")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("filter2", "oneway!=* and type:relation or length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "62")
				.queryParam("values2", "primary_link")
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
	public void test_1jyajqu1zacs3_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway")
				.queryParam("types2", "node,relation")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-04-04")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737,49.433436],[8.74787,49.426],[8.738,49.413617],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715310,49.430],[8.705,49.4089],[8.721,49.4388],[8.704561,49.403252]]]}}]}")
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
	public void test_socct1rj9boj_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,line,polygon,other")
				.queryParam("format", "csv")
				.queryParam("filter2", "addr:postcode!=* or geometry:line")
				.queryParam("time", "2008-05-20")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
				.queryParam("bcircles", "kCS:8.717,49.402,2|uXqbu:8.708,49.438,2|V:8.708,49.404,4")
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
	public void test_1hv8t0ti1wwfn_areaRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-05-30")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "82")
				.queryParam("values2", "pedestrian")
				.queryParam("bcircles", "8.724,49.427,393")
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
	public void test_s163vq3pxy78_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=*")
				.queryParam("keys", "highway")
				.queryParam("time", "2017-05-03")
				.queryParam("keys2", "highway")
				.queryParam("values2", "service")
				.queryParam("bcircles", "8.741769,49.4314,67")
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
	public void test_1iuw0pkwzk7l0_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or geometry:polygon and length:( .. 100)")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("filter2", "addr:city=* or geometry:polygon or not length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "vU:8.72000,49.4285,3|E:8.706029,49.4338,2")
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
	public void test_1jezc8ao6x6b7_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-11-01")
				.queryParam("bpolys", "8.704561,49.403252,8.742428,49.403,8.729,49.418687,8.716,49.439,8.704561,49.403252|8.704561,49.403252,8.717,49.423,8.725,49.4359,8.7045,49.425,8.704561,49.403252|8.704561,49.403252,8.729,49.438,8.732,49.437276,8.736,49.437,8.704561,49.403252")
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
	public void test_1hrgzofbge914_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687307,49.409815,8.759,49.39119|8.653,49.4251,8.7378,49.380|8.661,49.42542,8.737028,49.388")
				.queryParam("keys", "highway")
				.queryParam("time", "2015-12-04")
				.queryParam("timeout", "21")
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
	public void test_ubrevfheqgqg_areaRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "CWQbH:8.6671,49.406,8.7163,49.39930|H:8.681,49.4044,8.7506,49.395|u:8.6811,49.410,8.7563,49.388|Jw:8.665835,49.406,8.728,49.39061")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("filter2", "source:maxspeed!=* and id:(1 .. 9999)")
				.queryParam("time", "2015-10-15")
				.queryParam("timeout", "24")
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
	public void test_rhjcnoeng76s_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2013-02-24")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Be\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7118,49.4047],[8.744,49.4192],[8.7193,49.407739],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "j:8.724,49.433356,6|W:8.712,49.437,2|WFr:8.71249,49.4385,3|Kt:8.728,49.4395,26")
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
	public void test_1iv4bn8wlloir_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "NLDf:8.704561,49.403252,8.730,49.400295,8.704,49.401,8.7088,49.429346,8.704561,49.403252")
				.queryParam("timeout", "62")
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
	public void test_1jefga5gngfae_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-09-26")
				.queryParam("bpolys", "8.704561,49.403252,8.703896,49.400,8.702,49.410,8.725,49.43664,8.704561,49.403252")
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
	public void test_s0v1jz65eeyc_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.694,49.419,8.747,49.399")
				.queryParam("format", "csv")
				.queryParam("timeout", "61")
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
	public void test_1iyl1fa46j7ef_count() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=* and length:( .. 100)")
				.queryParam("bboxes", "ieB:8.691,49.42108,8.7553,49.388")
				.queryParam("time", "2014-09-30")
				.queryParam("timeout", "72")
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
	public void test_urpmj0242bsh_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and geometry:point")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("bcircles", "8.7350,49.418510,3")
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
	public void test_rkzloq6avinn_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2012-08-21")
				.queryParam("timeout", "51")
				.queryParam("bcircles", "GU:8.739,49.410,6")
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
	public void test_urv62rq5jzae_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* and length:( .. 100)")
				.queryParam("time", "2015-02-06")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "lJq:8.7410,49.422792,931")
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
	public void test_t84muv2uvrl2_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=* or type:node and length:( .. 100)")
				.queryParam("bboxes", "oNGaV:8.6947,49.4067,8.754,49.3968")
				.queryParam("format", "geojson")
				.queryParam("timeout", "98")
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
	public void test_t81afcjd1vtu_count1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6586,49.400,8.701,49.392|8.69541,49.401,8.753,49.388")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-07-11")
				.queryParam("timeout", "88")
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
	public void test_1iauu7la4frz5_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-02-07")
				.queryParam("bpolys", "GC:8.704561,49.403252,8.706728,49.430,8.717,49.43708,8.708,49.4230,8.704561,49.403252|UEvxm:8.704561,49.403252,8.723870,49.415,8.7020,49.40924,8.727,49.404,8.704561,49.403252|tFLKl:8.704561,49.403252,8.701849,49.408,8.7075,49.417,8.728,49.402,8.704561,49.403252")
				.queryParam("bcircles", "8.7245,49.4389,6")
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
	public void test_1jeae9tq6ci8y_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2017-08-09")
				.queryParam("timeout", "50")
				.queryParam("bcircles", "g:8.728,49.4350,7")
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
	public void test_rl2byzyaszsh_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.681,49.4269,8.721,49.389|8.698,49.400,8.739208,49.387|8.656,49.404833,8.739,49.394")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-08-08")
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
	public void test_qhqlteqz4tia_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "h:8.6566,49.417,8.7243,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("timeout", "45")
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
	public void test_r1iesslg1anq_countDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "surface=* or not length:( .. 100)")
				.queryParam("time", "2008-08-02")
				.queryParam("bcircles", "8.7289,49.408,2|8.733,49.43289,411")
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
	public void test_s18vc768s7cj_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or type:relation or area:(1.0 .. 1E6)")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"tWyE\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727242,49.425],[8.709,49.422],[8.7045,49.432],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "83")
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
	public void test_1ibc0sx5nlqgm_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* or geometry:line")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2011-11-22")
				.queryParam("bpolys", "8.704561,49.403252,8.70226,49.427,8.711,49.4059,8.709,49.4324,8.704561,49.403252|8.704561,49.403252,8.727,49.40156,8.739,49.40706,8.741,49.4395,8.704561,49.403252|8.704561,49.403252,8.72229,49.438,8.7043,49.42436,8.7464,49.433,8.704561,49.403252")
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
	public void test_qdw1385fljjq_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.654793,49.418,8.704,49.39491|8.677,49.418842,8.714,49.386")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-11-21")
				.queryParam("timeout", "73")
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
	public void test_1jylmdhymr38w_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.7265,49.427,1|8.707,49.405,62|8.71745,49.425,665")
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
	public void test_t4yik51ih0ds_countDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "W:8.6779,49.428407,8.731,49.394")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-09-28")
				.queryParam("timeout", "64")
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
	public void test_qeez7mqriwkm_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"f\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.412],[8.70780,49.401],[8.7290,49.432514],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "8.741,49.402,1|8.713,49.412,9|8.710,49.417,5")
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
	public void test_1iynt9wiy5xt1_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "QgouW:8.65911,49.418,8.712,49.396")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "no")
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
	public void test_t89miwawfodv_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("bpolys", "QsC:8.704561,49.403252,8.729,49.41390,8.7043,49.408,8.70361,49.429,8.704561,49.403252")
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
	public void test_u7okdzebbbjr_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Pop:8.660,49.400,8.727237,49.3869|z:8.654,49.429975,8.7422,49.382|zWI:8.667,49.4246,8.756,49.385|X:8.691,49.427396,8.7366,49.393")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-10-11")
				.queryParam("timeout", "71")
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
	public void test_vb42kfg6h7i0_countDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:relation")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "69")
				.queryParam("bcircles", "kB:8.716,49.43846,7|lc:8.735,49.4029,5")
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
	public void test_us0pmloz2tkh_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "DxJ:8.677668,49.4007,8.719,49.391")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-08-19")
				.queryParam("timeout", "56")
				.queryParam("bcircles", "vz:8.7309,49.416,6")
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
	public void test_1jym3ljfltflf_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("bpolys", "8.704561,49.403252,8.74411,49.4157,8.74921,49.4152,8.721,49.4271,8.704561,49.403252|8.704561,49.403252,8.7034,49.422,8.7033,49.438,8.743,49.414,8.704561,49.403252")
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
	public void test_t844jhceml43_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.691877,49.4181,8.706,49.3895|8.699,49.425,8.7084,49.3865")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "true")
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
	public void test_qxl2m3vwvmna_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("bpolys", "8.704561,49.403252,8.74433,49.433084,8.7049,49.4007,8.738,49.40184,8.704561,49.403252|8.704561,49.403252,8.747,49.415073,8.709,49.426,8.723,49.416,8.704561,49.403252|8.704561,49.403252,8.7356,49.43295,8.720,49.423,8.70488,49.408,8.704561,49.403252")
				.queryParam("timeout", "75")
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
	public void test_1hv8abg9odqgn_countDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=*")
				.queryParam("time", "2016-07-13")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "nTP:8.7155,49.4222,6|M:8.73683,49.425,1")
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
	public void test_1hrgyyxsf69nn_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,construction")
				.queryParam("filter", "lanes:forward=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
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
	public void test_t844jiyy78dw_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness=*")
				.queryParam("groupByValues", "unclassified")
				.queryParam("values", "steps")
				.queryParam("bpolys", "gVNu:8.704561,49.403252,8.742,49.418,8.723152,49.43119,8.7106,49.431,8.704561,49.403252|FPoNy:8.704561,49.403252,8.749,49.403369,8.704,49.4357,8.7239,49.41116,8.704561,49.403252|A:8.704561,49.403252,8.7161,49.428,8.70981,49.427,8.7475,49.4323,8.704561,49.403252")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "8.749,49.4157,70")
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
	public void test_tocwl5yn999v_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("bpolys", "e:8.704561,49.403252,8.703428,49.430,8.700072,49.425,8.701,49.43172,8.704561,49.403252")
				.queryParam("timeout", "80")
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
	public void test_qhvo7xjk0x88_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-04-07")
				.queryParam("bcircles", "F:8.74646,49.4364,42|W:8.708,49.433,6|iXxv:8.735,49.4381,4|n:8.736913,49.422,867640149963")
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
	public void test_rhiw7p5trask_countDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "QIZ:8.67976,49.409493,8.711,49.3945")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "json")
				.queryParam("time", "2011-05-16")
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
	public void test_vb93cb0mugc4_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2013-09-12")
				.queryParam("timeout", "27")
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
	public void test_vbbvkp54xlbt_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and id:(1 .. 9999)")
				.queryParam("groupByValues", "traffic_mirror,dormitory")
				.queryParam("bboxes", "nWIIX:8.679,49.427,8.733915,49.393")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.742,49.4244,2")
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
	public void test_rkxanzrq3xo6_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "path,residential,stop_line")
				.queryParam("bboxes", "sw:8.6768,49.41789,8.739929,49.391|dKB:8.68764,49.409,8.7022,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "32")
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
	public void test_uv8lubzazjhi_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("time", "2013-09-19")
				.queryParam("timeout", "83")
				.queryParam("bcircles", "NHQTm:8.724,49.431,685")
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
	public void test_1jia1gmtib583_countDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,stop_line")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-03-08")
				.queryParam("bcircles", "Q:8.730,49.433,53|b:8.731,49.410,2|dhOnH:8.725,49.4384,2|AhR:8.702,49.4095,6055279612")
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
	public void test_rhlodw01pq3m_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "platform,tower")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-02-21")
				.queryParam("timeout", "40")
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
	public void test_rhgllef2k7xw_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle=* and id:(1 .. 9999)")
				.queryParam("values", "steps")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "MLE:8.704561,49.403252,8.7349,49.4041,8.74567,49.412465,8.713,49.406,8.704561,49.403252|T:8.704561,49.403252,8.739081,49.422,8.74059,49.430,8.709,49.4119,8.704561,49.403252|fJ:8.704561,49.403252,8.704,49.437,8.715,49.420,8.704533,49.422493,8.704561,49.403252")
				.queryParam("bcircles", "ClzA:8.7049,49.429401,3")
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
	public void test_1iuno516hvo6o_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and type:way or not length:( .. 100)")
				.queryParam("bboxes", "oC:8.689,49.4283,8.70606,49.3806|cL:8.663,49.425,8.751,49.3840|K:8.662,49.400,8.708,49.385")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2017-06-23")
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
	public void test_urmeggqs5jdu_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "36")
				.queryParam("bcircles", "8.744,49.4290,4")
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
	public void test_1hrriwagbra5v_countDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("bpolys", "q:8.704561,49.403252,8.7418,49.437,8.701,49.4092,8.70454,49.401937,8.704561,49.403252|h:8.704561,49.403252,8.726278,49.417,8.708610,49.406,8.713,49.411484,8.704561,49.403252|QUp:8.704561,49.403252,8.733,49.4061,8.7110,49.4096,8.72039,49.438045,8.704561,49.403252")
				.queryParam("timeout", "95")
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
	public void test_1iv1k98899d84_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and geometry:line and id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xEDK\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.414],[8.7044,49.413072],[8.70966,49.405],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"K\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7136,49.401],[8.704539,49.436],[8.704504,49.418],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"T\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.742,49.43083],[8.7127,49.422],[8.7065,49.425],[8.704561,49.403252]]]}}]}")
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
	public void test_r1g465algkmc_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "synagogue")
				.queryParam("bboxes", "p:8.696,49.40293,8.701,49.396|I:8.650,49.4232,8.713,49.3934")
				.queryParam("values", "service")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-04-25")
				.queryParam("bpolys", "8.704561,49.403252,8.72877,49.4096,8.7361,49.4037,8.708,49.425,8.704561,49.403252")
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
	public void test_s15jly77zad4_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,school,civic")
				.queryParam("bboxes", "I:8.653,49.424,8.730,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2008-03-04")
				.queryParam("timeout", "23")
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
	public void test_1k1txuy8e9d0z_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,yes,service")
				.queryParam("bboxes", "f:8.687,49.427,8.707,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("timeout", "43")
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
	public void test_urxettwqoa5f_countDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,platform")
				.queryParam("bboxes", "Ybklz:8.669,49.41889,8.7517,49.390|pX:8.653,49.411,8.7491,49.3810")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
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
	public void test_qxwnbjt2afjm_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway or id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2008-01-18")
				.queryParam("timeout", "95")
				.queryParam("bcircles", "pL:8.705,49.407,9")
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
	public void test_qxw481fxnl81_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "WGgCx:8.697,49.4114,8.722247,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "no")
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
	public void test_1hv39gzxnkhno_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-08-05")
				.queryParam("bpolys", "ae:8.704561,49.403252,8.7070,49.43237,8.715841,49.4358,8.74703,49.4024,8.704561,49.403252")
				.queryParam("timeout", "62")
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
	public void test_t8cfv0gdtk6a_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.689574,49.40394,8.713510,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
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
	public void test_u7okryht7bqv_countDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.7209,49.424,4")
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
	public void test_u7u2tywsfby0_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=* and length:( .. 100)")
				.queryParam("bboxes", "u:8.668,49.417821,8.704,49.38377|SE:8.6871,49.421,8.711,49.3940")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "Z:8.704561,49.403252,8.7152,49.421437,8.703,49.416860,8.700,49.42450,8.704561,49.403252")
				.queryParam("bcircles", "pEbIw:8.710,49.430,5")
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
	public void test_qhtctcneq81c_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-05-26")
				.queryParam("bpolys", "8.704561,49.403252,8.745,49.426,8.701,49.4212,8.735,49.40731,8.704561,49.403252")
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
	public void test_1h7z8ues1r1b6_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("bcircles", "KN:8.709,49.428196,2")
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
	public void test_qxns4bssuvjp_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and length:( .. 100)")
				.queryParam("timeout", "29")
				.queryParam("bcircles", "kwHAo:8.7330,49.4235,672")
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
	public void test_rl8drnbqewdd_countDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-05-19")
				.queryParam("bcircles", "8.71912,49.432,71")
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
	public void test_t4vqec2yd16d_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2009-08-14")
				.queryParam("timeout", "69")
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
	public void test_s1bm946hqwj7_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "tqHl:8.704561,49.403252,8.726,49.4180,8.7041,49.429,8.719,49.400,8.704561,49.403252")
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
	public void test_1hux6i5ym2ijl_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and geometry:point")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-04-30")
				.queryParam("timeout", "87")
				.queryParam("bcircles", "W:8.737,49.4029,62")
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
	public void test_t4f3fmf538s0_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* or type:way")
				.queryParam("bboxes", "8.688,49.4163,8.7115,49.3822")
				.queryParam("format", "json")
				.queryParam("time", "2017-04-29")
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
	public void test_1je9v69g0e5o9_countGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country=* and length:( .. 100)")
				.queryParam("bboxes", "8.6850,49.410,8.746,49.388")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-08-12")
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
	public void test_qxobjaj0c676_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and not geometry:polygon and not id:(1 .. 9999)")
				.queryParam("bboxes", "AVb:8.693,49.407160,8.704,49.385")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("time", "2011-08-03")
				.queryParam("bpolys", "FwbKM:8.704561,49.403252,8.7080,49.4160,8.704,49.4223,8.7096,49.409,8.704561,49.403252|k:8.704561,49.403252,8.748,49.429,8.71513,49.4067,8.70350,49.401,8.704561,49.403252")
				.queryParam("bcircles", "zWfrT:8.736,49.43112,75|vb:8.701,49.4186,9")
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
	public void test_1jenra8zsodb8_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.66195,49.424,8.721,49.3851|8.681,49.40063,8.750,49.392")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2013-02-12")
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
	public void test_skxuubcc2ib6_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "OYa:8.68691,49.426,8.71706,49.398")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2010-04-30")
				.queryParam("timeout", "53")
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
	public void test_u8dziawciaew_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or geometry:line and not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "df:8.704561,49.403252,8.73160,49.409,8.706,49.426,8.734,49.402,8.704561,49.403252")
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
	public void test_1h7o5cs1tdh6f_countGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-09-03")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "T:8.717,49.402,3")
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
	public void test_1jyb0f7739bu9_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "mX:8.68950,49.417,8.731,49.389")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("timeout", "33")
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
	public void test_qeffiejxjiw3_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=*")
				.queryParam("groupByValues", "ship")
				.queryParam("time", "2009-08-26")
				.queryParam("bpolys", "8.704561,49.403252,8.7228,49.4149,8.741320,49.431,8.703,49.410,8.704561,49.403252|8.704561,49.403252,8.710,49.414,8.74580,49.403,8.745,49.4223,8.704561,49.403252|8.704561,49.403252,8.7353,49.439,8.70459,49.418,8.700,49.425,8.704561,49.403252")
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
	public void test_1ievhyvfogy1x_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-03-28")
				.queryParam("bcircles", "T:8.732,49.404,13")
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
	public void test_ubrf9en4cdwk_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "72")
				.queryParam("bcircles", "Quwva:8.738,49.41927,36|rwZn:8.720,49.435457,934")
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
	public void test_1iun5icism82r_countGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "station,hospital,track")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-07-03")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "8.7254,49.428,99|8.744,49.405,1|8.734807,49.438742,45|8.72312,49.4296,1946910043")
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
	public void test_1ib0yvj8eolyt_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,stop_line")
				.queryParam("filter", "bicycle!=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "nCijq:8.688,49.4176,8.74116,49.386")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.728,49.41216,2|8.733177,49.4121,5")
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
	public void test_rhrph5g12q7m_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "civic")
				.queryParam("bboxes", "aXlqO:8.694,49.404,8.708,49.382")
				.queryParam("values", "unclassified")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "J:8.745,49.432,7|V:8.730,49.426,5|mO:8.715,49.4183,1")
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
	public void test_s4mapg1wmq7r_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-03-24")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "Fquag:8.704,49.4168,9|I:8.705,49.404,47")
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
	public void test_qe6mbnaia985_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-08-18")
				.queryParam("bpolys", "8.704561,49.403252,8.72515,49.438700,8.747,49.4256,8.708,49.40548,8.704561,49.403252")
				.queryParam("timeout", "82")
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
	public void test_1jy4zq91a0jtu_countGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.689,49.413,8.7216,49.3894")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2012-08-10")
				.queryParam("timeout", "52")
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
	public void test_1h84rzt4rtnw9_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and geometry:line or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.694,49.421093,8.713,49.380")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "XmxFk:8.704561,49.403252,8.708654,49.411,8.7030,49.414,8.723,49.43816,8.704561,49.403252|i:8.704561,49.403252,8.748,49.411,8.70484,49.40368,8.733,49.432,8.704561,49.403252|O:8.704561,49.403252,8.745,49.419,8.700,49.4251,8.7034,49.419,8.704561,49.403252")
				.queryParam("groupByKeys", "highway,building,oneway")
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
	public void test_u7wujhimticy_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.696,49.41037,8.73517,49.39989")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2013-01-24")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "8.720338,49.426,9")
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
	public void test_qe6mbuunch12_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2008-08-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NrhLL\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7350,49.426],[8.726642,49.418572],[8.713,49.431],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "54")
				.queryParam("groupByKeys", "addr:postcode,network,addr:country")
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
	public void test_uve47zy0kmd1_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or type:way or length:( .. 100)")
				.queryParam("timeout", "60")
				.queryParam("groupByKeys", "addr:country,foot")
				.queryParam("bcircles", "sYTt:8.7013,49.4198,454")
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
	public void test_1ibbjl5y38eox_countGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "csv")
				.queryParam("time", "2010-01-21")
				.queryParam("bpolys", "8.704561,49.403252,8.7482,49.412,8.739,49.418,8.714,49.4157,8.704561,49.403252|8.704561,49.403252,8.7496,49.4306,8.732,49.416,8.70088,49.419,8.704561,49.403252|8.704561,49.403252,8.744,49.4360,8.7031,49.437,8.704,49.43040,8.704561,49.403252")
				.queryParam("groupByKeys", "surface,tracktype")
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
	public void test_1h7x0xpouo3tw_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:way or not length:( .. 100)")
				.queryParam("values", "turning_circle")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-03-12")
				.queryParam("bpolys", "8.704561,49.403252,8.7217,49.425,8.742,49.436,8.727,49.417,8.704561,49.403252|8.704561,49.403252,8.72115,49.439,8.7219,49.422,8.741,49.43887,8.704561,49.403252|8.704561,49.403252,8.723,49.409,8.723,49.414,8.7017,49.408,8.704561,49.403252")
				.queryParam("timeout", "48")
				.queryParam("groupByKeys", "turn,landuse")
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
	public void test_t4svicxxtld2_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "25")
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
	public void test_1hv0fqukxef6t_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=*")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "PjMfT:8.704561,49.403252,8.729,49.430,8.7008,49.425,8.704,49.410,8.704561,49.403252|uL:8.704561,49.403252,8.747,49.406,8.729,49.439,8.735,49.410,8.704561,49.403252|Avx:8.704561,49.403252,8.748,49.4070,8.744,49.4337,8.7408,49.430268,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:country,oneway")
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
	public void test_ubjlvlxgpgmd_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-10-04")
				.queryParam("bpolys", "YtVl:8.704561,49.403252,8.742,49.411402,8.707,49.412,8.7029,49.420,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:country,highway,tracktype")
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
	public void test_soel2wez2f6u_countGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"rV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.437],[8.71728,49.422],[8.7045,49.40858],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.701,49.423468],[8.70388,49.404],[8.70455,49.4362],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"xqZ\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.730,49.4374],[8.737428,49.4105],[8.7048,49.4144],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "69")
				.queryParam("groupByKeys", "addr:housenumber,foot,smoothness")
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
	public void test_1hv39h7sfwhma_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,steps")
				.queryParam("filter", "sidewalk=* or geometry:point and not length:( .. 100)")
				.queryParam("bboxes", "L:8.6994,49.40943,8.746,49.386674")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bcircles", "z:8.748,49.412,6|pW:8.709,49.4016,8")
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
	public void test_rhdco1vly2qt_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "2010-12-04")
				.queryParam("bpolys", "u:8.704561,49.403252,8.7119,49.4261,8.705,49.418,8.7144,49.416,8.704561,49.403252|tqJrQ:8.704561,49.403252,8.736,49.401,8.726,49.4340,8.712,49.410,8.704561,49.403252|n:8.704561,49.403252,8.70795,49.40836,8.708,49.412,8.743,49.402,8.704561,49.403252")
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
	public void test_s4m9gzwwdgs7_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "service,apartments,crossing")
				.queryParam("filter", "foot=* and not area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"yhymX\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7106,49.402],[8.714,49.432],[8.7283,49.429],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "93")
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
	public void test_1jiajebair41l_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or type:relation or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "63")
				.queryParam("bcircles", "8.730,49.42007,6|8.724,49.4198,72")
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
	public void test_u8571clw7w3d_countGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,station")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2009-09-23")
				.queryParam("bcircles", "8.7069,49.401,85|8.711,49.4366,134|8.713,49.4171,5|8.7272,49.427,263994299")
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
	public void test_u7xe3hpipmid_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,footway,pedestrian")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
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
	public void test_1h7zrjvnbz6lz_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* or length:( .. 100)")
				.queryParam("groupByValues", "ship")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("bpolys", "k:8.704561,49.403252,8.711,49.4118,8.706,49.404,8.71384,49.4113,8.704561,49.403252|PioBE:8.704561,49.403252,8.74609,49.4316,8.735,49.424,8.741,49.433350,8.704561,49.403252|Nd:8.704561,49.403252,8.72800,49.425,8.7340,49.429,8.70356,49.437,8.704561,49.403252")
				.queryParam("timeout", "90")
				.queryParam("bcircles", "8.74238,49.429,2|8.744,49.436,2|8.74314,49.427,7")
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
	public void test_s1b6qsenal9y_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "TklKm:8.70883,49.403,5")
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
	public void test_qy26swmwuvqq_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and type:way")
				.queryParam("groupByKey", "building")
				.queryParam("format", "csv")
				.queryParam("time", "2016-09-02")
				.queryParam("bpolys", "fwrr:8.704561,49.403252,8.730,49.427,8.701,49.427,8.747551,49.416,8.704561,49.403252|dgEBL:8.704561,49.403252,8.7230,49.408654,8.72035,49.437,8.710,49.408,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_rh4zgx67w5dh_countGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "construction,roof")
				.queryParam("filter", "addr:country!=* or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2011-03-30")
				.queryParam("bcircles", "fuu:8.748,49.422,7")
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
	public void test_tofmsyy76wjd_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and geometry:point and id:(1 .. 9999)")
				.queryParam("bboxes", "U:8.685,49.418405,8.74843,49.39259|p:8.6703,49.410138,8.739,49.384")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-07-19")
				.queryParam("timeout", "82")
				.queryParam("bcircles", "o:8.74045,49.436,416144331|EpH:8.700,49.401,3")
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
	public void test_qhtefrymv4tw_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "qN:8.6733,49.415998,8.7113,49.39694")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2008-04-05")
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
	public void test_1h7zt4013hu1u_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or id:(1 .. 9999)")
				.queryParam("bboxes", "cv:8.694,49.404,8.7457,49.38006|mU:8.67109,49.427,8.74495,49.387")
				.queryParam("timeout", "88")
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
	public void test_1hvb39bh4cgva_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2017-08-09")
				.queryParam("bcircles", "XU:8.7381,49.402,73")
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
	public void test_qxtd5f94rqr9_countGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or not length:( .. 100)")
				.queryParam("bcircles", "wTb:8.7452,49.413257,1")
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
	public void test_rkzj0wwcii45_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ow:8.692,49.4050,8.7118,49.39465")
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "u:8.704561,49.403252,8.7440,49.427675,8.7006,49.427,8.701,49.4084,8.704561,49.403252|BBl:8.704561,49.403252,8.70056,49.403,8.7041,49.430,8.7491,49.410651,8.704561,49.403252|qPnv:8.704561,49.403252,8.7167,49.437,8.7045,49.4353,8.748,49.438,8.704561,49.403252")
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
	public void test_sl3e09dfci0k_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:point")
				.queryParam("time", "2017-11-08")
				.queryParam("bcircles", "e:8.7144,49.431,7")
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
	public void test_1iv3rb4hskx0y_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier!=* or type:relation and id:(1 .. 9999)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2015-09-24")
				.queryParam("bcircles", "YpU:8.700,49.433,3843232310")
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
	public void test_rlapmq46i5o8_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "Rt:8.704561,49.403252,8.724,49.422,8.729,49.4077,8.706,49.411,8.704561,49.403252|SFSe:8.704561,49.403252,8.743,49.423,8.730,49.40338,8.70400,49.432585,8.704561,49.403252")
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
	public void test_1h7fust0sf59d_countGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.728,49.4083,8.724,49.41226,8.7042,49.434737,8.704561,49.403252|8.704561,49.403252,8.74251,49.417,8.713,49.40111,8.733,49.430,8.704561,49.403252|8.704561,49.403252,8.7252,49.42688,8.704,49.41622,8.748,49.432,8.704561,49.403252")
				.queryParam("timeout", "42")
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
	public void test_rl8ejv440msj_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "PN:8.676787,49.413,8.75363,49.381|rqMLu:8.6734,49.420,8.7088,49.380|n:8.6774,49.4174,8.729,49.399|PXQIS:8.684,49.4089,8.7046,49.382")
				.queryParam("types2", "node,relation")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "tracktype!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2015-02-21")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "92")
				.queryParam("values2", "platform")
				.queryParam("bcircles", "8.700086,49.43352,7")
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
	public void test_urseb44prz8y_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "b:8.735,49.407,27")
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
	public void test_1ibbguk063rxz_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city!=* or geometry:line")
				.queryParam("format", "geojson")
				.queryParam("filter2", "sidewalk!=*")
				.queryParam("time", "2017-05-16")
				.queryParam("bcircles", "8.705,49.4365,31")
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
	public void test_ubupqpndecl0_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,")
				.queryParam("values", "steps")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "maxspeed=* or id:(1 .. 9999)")
				.queryParam("time", "2010-12-18")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"awr\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747768,49.407404],[8.7040,49.407],[8.7456,49.4391],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "38")
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
	public void test_somuuf3l9krn_countRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and area:(1.0 .. 1E6)")
				.queryParam("types2", "node,way,")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2011-01-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7150,49.423850],[8.703,49.416155],[8.7084,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"E\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70350,49.40015],[8.7185,49.4095],[8.704526,49.41915],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"pPdI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.72542,49.4004],[8.70917,49.412],[8.704591,49.431444],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "90")
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
	public void test_1ibjuie3k63as_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "yhc:8.695420,49.4027,8.735,49.3834")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("filter2", "lanes:forward=*")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "8.730,49.411044,6|8.7494,49.418,89")
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
	public void test_1if0k21u0ww8h_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("types2", "point,polygon,other")
				.queryParam("time", "2012-08-02")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"W\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.40546],[8.70435,49.4175],[8.7049,49.436811],[8.704561,49.403252]]]}}]}")
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
	public void test_s0x9x3tip3dt_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.687,49.408,8.743,49.3867|8.679856,49.405,8.735,49.3897")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "28")
				.queryParam("values2", "turning_circle")
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
	public void test_urv7bk3hnku0_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:forward!=*")
				.queryParam("format", "csv")
				.queryParam("time", "2016-01-26")
				.queryParam("bpolys", "wNbNB:8.704561,49.403252,8.703968,49.4233,8.727467,49.425,8.70403,49.406380,8.704561,49.403252|Wmt:8.704561,49.403252,8.7308,49.42215,8.704515,49.405,8.703,49.4275,8.704561,49.403252|Jn:8.704561,49.403252,8.704,49.401,8.715,49.4163,8.74737,49.424,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "65")
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
	public void test_1hb86xlcumv5h_countRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.675,49.4139,8.715993,49.395|8.68233,49.402,8.725,49.399")
				.queryParam("keys", "highway")
				.queryParam("types2", "node,")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* and geometry:line and length:( .. 100)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "94")
				.queryParam("values2", "speed_camera")
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
	public void test_ubp6ze2l36ub_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("filter2", "foot=* and type:node and id:(1 .. 9999)")
				.queryParam("time", "2011-03-04")
				.queryParam("timeout", "77")
				.queryParam("values2", "elevator")
				.queryParam("bcircles", "BI:8.712,49.434,4")
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
	public void test_vbq8ovn41fsi_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.688,49.4143,8.736,49.381|8.668,49.407,8.7491,49.3838")
				.queryParam("format", "json")
				.queryParam("time", "2016-06-09")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "53")
				.queryParam("values2", "crossing")
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
	public void test_urekzp78r7tt_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6881,49.416,8.758,49.38247")
				.queryParam("filter2", "tracktype=* or not id:(1 .. 9999)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "99")
				.queryParam("values2", "cycleway")
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
	public void test_r1fl2hdii987_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or type:relation or length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("time", "2015-08-08")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "X:8.7316,49.432,368")
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
	public void test_vbkpix8f7ecl_countRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-11-29")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"ya\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.707835,49.40525],[8.70452,49.435],[8.7364,49.4199],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
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
	public void test_rkws159fly5x_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "lC:8.665,49.417,8.729,49.395|A:8.668,49.41886,8.748,49.391")
				.queryParam("types2", "node,relation")
				.queryParam("time", "2008-07-26")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"no\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737830,49.43393],[8.746925,49.435],[8.701,49.405],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"jNI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7083,49.4325],[8.71393,49.4133],[8.717,49.422],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"yH\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7218,49.406],[8.704081,49.412526],[8.735261,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "55")
				.queryParam("values2", "turning_circle")
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
	public void test_us30n7hano6p_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or not id:(1 .. 9999)")
				.queryParam("types2", "point,")
				.queryParam("format", "csv")
				.queryParam("filter2", "bicycle=* or length:( .. 100)")
				.queryParam("time", "2009-08-19")
				.queryParam("bpolys", "vOKa:8.704561,49.403252,8.719,49.41218,8.741207,49.4330,8.7135,49.426,8.704561,49.403252|KbExX:8.704561,49.403252,8.746,49.400,8.730,49.4080,8.712,49.436,8.704561,49.403252|oI:8.704561,49.403252,8.713,49.4075,8.707,49.437,8.721,49.436361,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("values2", "service")
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
	public void test_uv5u25ws936p_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* or not geometry:point or length:( .. 100)")
				.queryParam("bboxes", "jH:8.6503,49.417,8.7052,49.399|zx:8.677,49.4224,8.7411,49.385")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "oneway=* and type:relation")
				.queryParam("time", "2017-12-10")
				.queryParam("keys2", "highway")
				.queryParam("values2", "stop")
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
	public void test_vf996chfdj6p_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "line,other")
				.queryParam("values", "primary")
				.queryParam("format", "json")
				.queryParam("filter2", "addr:country=* or length:( .. 100)")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "8.736,49.4262,48")
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
	public void test_todewa7zxuet_countRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ycMeq:8.65186,49.4015,8.717,49.399")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("filter2", "sidewalk!=*")
				.queryParam("timeout", "70")
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
	public void test_qxr255axzs4x_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* and id:(1 .. 9999)")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
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
	public void test_1iextdm7uttte_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "zQEYw:8.65883,49.41528,8.7345,49.3815")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "35")
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
	public void test_1ibes6obvt17l_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country!=* and geometry:line")
				.queryParam("bboxes", "w:8.694273,49.409,8.756,49.383")
				.queryParam("timeout", "46")
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
	public void test_t4vou9a4h5k1_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "TsE:8.6570,49.42704,8.709,49.3866")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-12-18")
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
	public void test_1h7zagxmmjy9i_length() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.688,49.4252,8.711437,49.382")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2007-11-22")
				.queryParam("timeout", "46")
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
	public void test_1iauu7qtwh1yt_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ttma:8.692,49.429,8.7471,49.383")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-10-24")
				.queryParam("bcircles", "c:8.734210,49.4216,9|Vi:8.7347,49.4053,2|W:8.71382,49.406638,3")
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
	public void test_s1ef779q8aig_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-01-24")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "Z:8.7007,49.4288,77")
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
	public void test_vb3j2s3aqb02_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2016-01-28")
				.queryParam("timeout", "96")
				.queryParam("bcircles", "E:8.70874,49.4293,3")
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
	public void test_t4q62g8224a8_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("time", "2011-05-20")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "fVJSX:8.719,49.407,5")
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
	public void test_t87dxdf7r48k_length1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or length:( .. 100)")
				.queryParam("bboxes", "xz:8.667,49.405,8.702,49.386")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-03-24")
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
	public void test_qdvirls9bzhg_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or not geometry:point and id:(1 .. 9999)")
				.queryParam("values", "street_lamp")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-06-17")
				.queryParam("timeout", "57")
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
	public void test_t89ohhltpu7t_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "HK:8.6517,49.402,8.734,49.3851")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "csv")
				.queryParam("time", "2017-07-13")
				.queryParam("timeout", "20")
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
	public void test_1iyhpgddnyjj7_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.735,49.403,8.705,49.427,8.7059,49.425,8.704561,49.403252|8.704561,49.403252,8.748629,49.400,8.7476,49.413,8.725,49.407197,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_1k2524sd89yd0_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "a:8.677654,49.400,8.735,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2007-12-31")
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
	public void test_1iyn8xkagwmra_lengthDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("time", "2017-12-02")
				.queryParam("bpolys", "V:8.704561,49.403252,8.74791,49.401,8.742607,49.43835,8.714646,49.403,8.704561,49.403252|s:8.704561,49.403252,8.7279,49.420933,8.704561,49.40329,8.7241,49.433,8.704561,49.403252|hc:8.704561,49.403252,8.700,49.429,8.723,49.42323,8.7217,49.4310,8.704561,49.403252")
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
	public void test_t8fov1pevygk_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "bicycle!=* and not geometry:point or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2018-03-31")
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
	public void test_rhivibmkiq1y_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.68340,49.422833,8.746131,49.3955")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("format", "csv")
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
	public void test_vbhw6umnoilz_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse=*")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "ac:8.704561,49.403252,8.723,49.430,8.704,49.4343,8.7248,49.40209,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_qy4g98cv0n6s_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and geometry:line")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-06-18")
				.queryParam("bcircles", "8.732,49.403,4|8.73485,49.41683,1")
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
	public void test_rhugjfvh45km_lengthDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "UlUeg:8.704561,49.403252,8.733,49.418,8.702,49.411,8.7454,49.400270,8.704561,49.403252|x:8.704561,49.403252,8.7238,49.4370,8.70971,49.400,8.706,49.403,8.704561,49.403252|ZHxkW:8.704561,49.403252,8.719,49.409038,8.716,49.429,8.732,49.402,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_t8a4ucs1c21x_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "stop")
				.queryParam("format", "csv")
				.queryParam("time", "2007-11-11")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "8.7106,49.429,3")
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
	public void test_1hv602mi1ihpv_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"NLT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.715,49.418],[8.7045,49.403],[8.745121,49.420213],[8.704561,49.403252]]]}}]}")
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
	public void test_s1b5hwgucoc7_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2013-02-28")
				.queryParam("bpolys", "hpYvZ:8.704561,49.403252,8.735,49.42281,8.705,49.436,8.716,49.422,8.704561,49.403252|Jpzc:8.704561,49.403252,8.74926,49.411,8.720,49.4232,8.70316,49.408,8.704561,49.403252|J:8.704561,49.403252,8.728,49.438,8.704,49.433,8.703635,49.425263,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_vbmxfa4fnmg6_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "nkk:8.678,49.4049,8.705,49.3948|ef:8.6943,49.420209,8.732,49.397")
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
	public void test_sknag11t8som_lengthDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and not id:(1 .. 9999)")
				.queryParam("bboxes", "wJcS:8.6563,49.408527,8.75807,49.3822")
				.queryParam("time", "2012-06-02")
				.queryParam("timeout", "79")
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
	public void test_qxw4xgxzw0gx_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and type:way and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-02-03")
				.queryParam("timeout", "65")
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
	public void test_1hrosr9cpn52a_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "38")
				.queryParam("bcircles", "8.729,49.41213,8|8.708,49.4186,1")
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
	public void test_urrwrpvws8j8_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2010-04-10")
				.queryParam("bcircles", "a:8.747,49.430621,691563530|H:8.706,49.418,875|O:8.70793,49.438764,772|uYAl:8.72057,49.417,905")
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
	public void test_qxwnms9ambeh_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2014-06-12")
				.queryParam("timeout", "32")
				.queryParam("bcircles", "8.7454,49.4317,2")
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
	public void test_qxtd5j616aes_lengthDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "8.704561,49.403252,8.712,49.425,8.735,49.406,8.745,49.4108,8.704561,49.403252|8.704561,49.403252,8.732,49.4239,8.7144,49.415,8.704574,49.408,8.704561,49.403252|8.704561,49.403252,8.724,49.400979,8.7076,49.4191,8.704067,49.41538,8.704561,49.403252")
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
	public void test_ts572uzomwc2_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hut,service,residential")
				.queryParam("bboxes", "8.659749,49.407,8.7290,49.381|8.654,49.429030,8.752,49.384")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("bpolys", "F:8.704561,49.403252,8.7162,49.4102,8.7034,49.403,8.703245,49.4202,8.704561,49.403252|tHeXu:8.704561,49.403252,8.73629,49.4117,8.704,49.411,8.7079,49.430,8.704561,49.403252")
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
	public void test_to7u6j8qgxme_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,apartments,cycleway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "qbhL:8.704561,49.403252,8.743,49.424,8.704593,49.43046,8.732075,49.409,8.704561,49.403252|g:8.704561,49.403252,8.746,49.432,8.743,49.4362,8.743,49.4085,8.704561,49.403252")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "8.710,49.42120,88|8.714,49.407,2")
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
	public void test_1huxo1nu3n12v_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:street=* and length:( .. 100)")
				.queryParam("bboxes", "8.65466,49.410,8.713,49.383")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "70")
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
	public void test_1hbdr6u5lhfsm_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tertiary,apartments")
				.queryParam("bboxes", "I:8.6659,49.425,8.740357,49.393|DCo:8.682,49.40338,8.705134,49.381|ZAc:8.699,49.412,8.738,49.396|HN:8.6613,49.424,8.7554,49.380174")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-03-16")
				.queryParam("timeout", "80")
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
	public void test_vey4z0poq0jb_lengthDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "school,give_way,commercial")
				.queryParam("bboxes", "8.675820,49.4179,8.735,49.393")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "false")
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
	public void test_t4vqsooacorp_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,street_lamp,speed_camera")
				.queryParam("filter", "ref!=* or type:relation")
				.queryParam("bboxes", "QV:8.6796,49.414,8.715,49.3811|fC:8.651,49.408570,8.7056,49.381|kS:8.6674,49.424,8.72389,49.385|q:8.663,49.422845,8.7535,49.3828")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "yes")
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
	public void test_1hre6swyamwqh_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode!=*")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2010-04-07")
				.queryParam("bcircles", "TkAis:8.749340,49.43711,67")
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
	public void test_1jyg0vity1y5t_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("time", "2011-03-28")
				.queryParam("bpolys", "Qmia:8.704561,49.403252,8.728,49.435,8.74940,49.4003,8.707693,49.42964,8.704561,49.403252|wW:8.704561,49.403252,8.7228,49.401,8.727811,49.4222,8.726,49.433556,8.704561,49.403252|JbILi:8.704561,49.403252,8.73767,49.413,8.70482,49.419,8.700,49.406503,8.704561,49.403252")
				.queryParam("timeout", "59")
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
	public void test_u7u4pjpkejc2_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "f:8.6694,49.4126,8.7496,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2008-02-29")
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
	public void test_1k22b2ee3lb1t_lengthDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=*")
				.queryParam("bboxes", "lv:8.682,49.415791,8.701,49.392|W:8.6926,49.4228,8.736572,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "81")
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
	public void test_skyeq1s5t4kj_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "university,church")
				.queryParam("filter", "barrier!=* or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "building")
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "m:8.704561,49.403252,8.740,49.421,8.700,49.409,8.7137,49.415,8.704561,49.403252|eUPpI:8.704561,49.403252,8.7451,49.43739,8.707,49.4368,8.70008,49.42884,8.704561,49.403252|GmREs:8.704561,49.403252,8.737,49.4181,8.708,49.432,8.7192,49.427022,8.704561,49.403252")
				.queryParam("bcircles", "ZhSxQ:8.7441,49.4051,6")
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
	public void test_vbbwqqgyhhrq_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bcircles", "iS:8.7057,49.415,7|AH:8.741,49.42386,3284585010")
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
	public void test_vbf59tnu7sqc_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "cycleway,public")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "csv")
				.queryParam("time", "2012-12-31")
				.queryParam("bpolys", "8.704561,49.403252,8.718,49.419,8.7045,49.4158,8.7080,49.404,8.704561,49.403252")
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
	public void test_1hblk9eoolwzc_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "8.711,49.4122,97|8.712,49.406678,8")
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
	public void test_rhg2ynuiaud2_lengthDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* or geometry:line and length:( .. 100)")
				.queryParam("bboxes", "8.668,49.409425,8.723,49.39109|8.6936,49.4273,8.741,49.3860|8.684,49.401,8.753,49.388|8.6833,49.409,8.701,49.39724")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
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
	public void test_qhw5d6dmgb4x_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "track,hut,pedestrian")
				.queryParam("filter", "turn=* or length:( .. 100)")
				.queryParam("bboxes", "8.68752,49.412,8.751,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("time", "2009-01-13")
				.queryParam("timeout", "59")
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
	public void test_ts2gh064m5id_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "office,civic")
				.queryParam("time", "2017-07-26")
				.queryParam("bpolys", "8.704561,49.403252,8.739,49.4178,8.731,49.408,8.730065,49.401,8.704561,49.403252|8.704561,49.403252,8.732,49.434,8.710596,49.424248,8.738,49.435,8.704561,49.403252|8.704561,49.403252,8.719,49.413,8.736,49.430,8.722,49.421,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_rhodhz7pvos2_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "m:8.669,49.4105,8.747,49.392|Sj:8.693,49.416,8.717,49.395|tF:8.691,49.42241,8.751,49.388|u:8.670,49.4111,8.723,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
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
	public void test_rl2colrtr6g6_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "demolished,turning_circle,tower")
				.queryParam("bboxes", "c:8.667,49.407,8.7112,49.388")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2008-03-09")
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
	public void test_qhncw47np9va_lengthDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "house,residential")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2014-10-30")
				.queryParam("bcircles", "whDI:8.732,49.42712,9245436868|j:8.747,49.434460,5")
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
	public void test_1ibh1kurd8h29_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or not length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "Xi:8.704561,49.403252,8.740991,49.436,8.708,49.4392,8.7374,49.416,8.704561,49.403252|hsP:8.704561,49.403252,8.7401,49.420942,8.708,49.437655,8.7038,49.404749,8.704561,49.403252")
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
	public void test_1hv5js2xhk0mp_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=*")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"CI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7029,49.40444],[8.713,49.4069],[8.719738,49.40657],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"pBB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.404],[8.704,49.425],[8.701,49.402],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Sp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.748392,49.437],[8.704,49.43837],[8.740,49.405319],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "63")
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
	public void test_skn9qxdnmiia_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.688,49.4097,8.736668,49.3900")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
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
	public void test_vf982lllcab4_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or length:( .. 100)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2016-04-02")
				.queryParam("timeout", "64")
				.queryParam("bcircles", "8.706958,49.419,145")
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
	public void test_qxwmgowy48j4_lengthDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and geometry:point and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "HIoG:8.672,49.420,8.718,49.395|c:8.657,49.406,8.759,49.382|wN:8.6686,49.427,8.73950,49.389|F:8.698,49.404,8.711,49.3800")
				.queryParam("format", "geojson")
				.queryParam("time", "2011-01-28")
				.queryParam("timeout", "57")
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
	public void test_1h7inr6bzwbw2_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* or not geometry:polygon or not area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Gxpu:8.6918,49.40905,8.7411,49.38464|Sw:8.6577,49.428,8.748,49.384|cpPl:8.6740,49.40202,8.7029,49.396|j:8.654,49.428357,8.72862,49.38920")
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "yes")
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
	public void test_qxze8wmw703b_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2014-06-25")
				.queryParam("bpolys", "8.704561,49.403252,8.7395,49.41686,8.749,49.435,8.731,49.43644,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_1jyodremor7zl_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood or id:(1 .. 9999)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-09-27")
				.queryParam("bcircles", "i:8.700,49.416,137966243")
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
	public void test_uvbwbmmu61ya_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and geometry:line")
				.queryParam("bcircles", "fTyu:8.730174,49.430,20|h:8.72718,49.433593,97")
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
	public void test_rhtxrg91cpx4_lengthDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and geometry:line")
				.queryParam("format", "geojson")
				.queryParam("time", "2008-07-22")
				.queryParam("bcircles", "8.7071,49.416661,8|8.745,49.4270,7|8.7268,49.4285,5|8.733,49.4225,376")
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
	public void test_1huxor985djco_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* or length:( .. 100)")
				.queryParam("bboxes", "a:8.672197,49.404,8.741,49.398|TzO:8.6600,49.4088,8.72396,49.3968|zPQ:8.6655,49.42036,8.74637,49.383")
				.queryParam("keys", "highway")
				.queryParam("timeout", "68")
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
	public void test_skv3298rcyn8_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("format", "csv")
				.queryParam("time", "2009-07-27")
				.queryParam("timeout", "47")
				.queryParam("bcircles", "mp:8.713667,49.4120,94")
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
	public void test_sohcjlcu98oj_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("timeout", "88")
				.queryParam("bcircles", "n:8.73272,49.40623,16|RfJfu:8.719,49.41582,3|ht:8.7348,49.4226,7")
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
	public void test_u7ukrhgbya8y_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "p:8.674,49.426,8.7159,49.3886")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("showMetadata", "true")
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
	public void test_1h82101tqec6o_lengthGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* and length:( .. 100)")
				.queryParam("timeout", "98")
				.queryParam("bcircles", "Hx:8.704,49.421,9|NgZlD:8.7337,49.407,4")
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
	public void test_qhi9s8730ppt_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* and not length:( .. 100)")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "csv")
				.queryParam("time", "2015-02-03")
				.queryParam("bpolys", "t:8.704561,49.403252,8.709464,49.4139,8.741,49.4390,8.7246,49.4340,8.704561,49.403252|vD:8.704561,49.403252,8.7036,49.4390,8.7435,49.402408,8.7041,49.425,8.704561,49.403252|LSKXc:8.704561,49.403252,8.7105,49.43818,8.727098,49.401,8.737,49.431976,8.704561,49.403252")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "qsthm:8.71639,49.400,9")
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
	public void test_vb3leypxmhd1_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UQf:8.6986,49.4123,8.7267,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
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
	public void test_veymwhdiu6ux_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "street_lamp")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "XbwM:8.704561,49.403252,8.71529,49.4360,8.70688,49.41229,8.704,49.4130,8.704561,49.403252")
				.queryParam("timeout", "65")
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
	public void test_vf0xuh3fwz7b_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or type:relation")
				.queryParam("bboxes", "za:8.673,49.427,8.714379,49.386|FKKx:8.6826,49.407114,8.728,49.387|v:8.6504,49.406,8.7293,49.393|t:8.691,49.429,8.7569,49.398")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "91")
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
	public void test_1iukwd5odmmnp_lengthGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "B:8.711,49.4165,8|TIdUM:8.71938,49.4387,1")
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
	public void test_vb6t3fnsmqsz_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hospital,crossing")
				.queryParam("filter", "building!=* or not id:(1 .. 9999)")
				.queryParam("bboxes", "8.677,49.425,8.71830,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("format", "json")
				.queryParam("time", "2014-10-17")
				.queryParam("bpolys", "o:8.704561,49.403252,8.732,49.4013,8.705218,49.4159,8.720,49.402,8.704561,49.403252|uimB:8.704561,49.403252,8.7315,49.433396,8.7202,49.415,8.731,49.439,8.704561,49.403252|S:8.704561,49.403252,8.724,49.42686,8.719,49.412,8.727164,49.421,8.704561,49.403252")
				.queryParam("bcircles", "qLPG:8.7449,49.42455,9")
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
	public void test_1jia0m1ubakit_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.672,49.426,8.705,49.395")
				.queryParam("keys", "highway")
				.queryParam("values", "footway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2018-01-15")
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
	public void test_1iexs7r6y2esi_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("bpolys", "8.704561,49.403252,8.70539,49.425,8.707,49.403,8.725,49.40714,8.704561,49.403252|8.704561,49.403252,8.721125,49.42146,8.7386,49.424,8.706,49.433663,8.704561,49.403252")
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
	public void test_skk0qyg75s8k_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "station,primary_link")
				.queryParam("bboxes", "wK:8.688,49.401,8.726,49.385|wWcQQ:8.685178,49.425779,8.7480,49.3902")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2011-02-05")
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
	public void test_ubmeth5grtpv_lengthGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,house,turning_circle")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "xcMI:8.704561,49.403252,8.738112,49.429,8.7031,49.4207,8.7491,49.403,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_r1iv5z7n1et1_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and length:( .. 100)")
				.queryParam("bboxes", "q:8.673,49.424890,8.718,49.388|Q:8.672408,49.422,8.751,49.385")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "38")
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
	public void test_1jeip7a5x9x6f_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "HWJ:8.704561,49.403252,8.74786,49.42075,8.7047,49.4395,8.721,49.414,8.704561,49.403252|Exsn:8.704561,49.403252,8.73738,49.414,8.702,49.409,8.7169,49.40588,8.704561,49.403252|ZV:8.704561,49.403252,8.7089,49.4241,8.742,49.412,8.7047,49.404760,8.704561,49.403252")
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
	public void test_to4l94cyzzvm_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* or not length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.721,49.41312,8.70459,49.437782,8.704556,49.431329,8.704561,49.403252")
				.queryParam("timeout", "83")
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
	public void test_qhl1vifc5uev_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "dormitory,turning_circle")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "ekqUV:8.7341,49.402,1")
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
	public void test_1hruszlzhjz1u_lengthGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "dS:8.687,49.407591,8.722647,49.38673")
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "24")
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
	public void test_rhakw7nk53kx_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.697,49.424552,8.703,49.3970")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"xt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.727471,49.417],[8.702,49.412],[8.742,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"hGi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.724,49.403530],[8.706526,49.4245],[8.7374,49.422024],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Ib\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73591,49.432],[8.700,49.4253],[8.70415,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "100")
				.queryParam("groupByKeys", "lanes:backward,sidewalk")
				.queryParam("bcircles", "YdncB:8.724,49.40463,7")
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
	public void test_1ji782bosuxx5_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2013-11-25")
				.queryParam("bpolys", "zuW:8.704561,49.403252,8.738,49.414,8.728918,49.4187,8.74355,49.435260,8.704561,49.403252|m:8.704561,49.403252,8.715,49.438,8.735254,49.4306,8.7478,49.439323,8.704561,49.403252|j:8.704561,49.403252,8.744,49.438,8.719,49.4089,8.706,49.407,8.704561,49.403252")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "8.710,49.435,1|8.719,49.425,2")
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
	public void test_r1dbxlmlesl4_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BpOVP\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.747,49.43150],[8.701,49.404],[8.719,49.40431],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"znf\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7131,49.4242],[8.70466,49.420],[8.711,49.417],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "lit,surface,foot")
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
	public void test_1k22u8d4wyz4z_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2012-10-01")
				.queryParam("bpolys", "8.704561,49.403252,8.7021,49.401,8.7043,49.404,8.725,49.403,8.704561,49.403252|8.704561,49.403252,8.749,49.40632,8.7301,49.410756,8.701,49.429,8.704561,49.403252")
				.queryParam("groupByKeys", "landuse,source:maxspeed")
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
	public void test_u7xc2jlvm4ol_lengthGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6720,49.42385,8.712,49.396|8.66715,49.425,8.709,49.3997")
				.queryParam("keys", "highway")
				.queryParam("values", "tertiary")
				.queryParam("time", "2015-03-27")
				.queryParam("groupByKeys", "network,addr:street,highway")
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
	public void test_1hruujwcrxoiq_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and type:node or id:(1 .. 9999)")
				.queryParam("bboxes", "A:8.6892,49.42635,8.7118,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "46")
				.queryParam("groupByKeys", "turn:lanes,sidewalk,lit")
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
	public void test_t8ceov7tyh4g_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and length:( .. 100)")
				.queryParam("bboxes", "vkJjZ:8.670,49.4115,8.74214,49.385")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-12-14")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"t\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.740,49.41139],[8.7308,49.407],[8.721,49.400552],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"jRa\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.736,49.423],[8.70524,49.412297],[8.745,49.428849],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7454,49.40776],[8.7211,49.404],[8.709,49.419],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "47")
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
	public void test_1hvb2h39pah4n_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and geometry:point")
				.queryParam("bpolys", "A:8.704561,49.403252,8.72646,49.410,8.738,49.43029,8.704,49.4162,8.704561,49.403252|I:8.704561,49.403252,8.7461,49.4191,8.7421,49.4044,8.7037,49.423,8.704561,49.403252")
				.queryParam("groupByKeys", "turn:lanes,bicycle,addr:country")
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
	public void test_vbk5ncar24bp_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "8.704561,49.403252,8.7399,49.428188,8.70038,49.4314,8.709,49.4056,8.704561,49.403252|8.704561,49.403252,8.71025,49.416,8.74375,49.41008,8.719,49.432,8.704561,49.403252|8.704561,49.403252,8.733,49.409,8.7067,49.432,8.728878,49.406,8.704561,49.403252")
				.queryParam("groupByKeys", "highway,surface,addr:housenumber")
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
	public void test_1hraxhrj0y3w9_lengthGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "N:8.704561,49.403252,8.72456,49.41926,8.726,49.4159,8.702019,49.435,8.704561,49.403252")
				.queryParam("timeout", "76")
				.queryParam("groupByKeys", "surface,name,tracktype")
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
	public void test_s15n70qi0ns5_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* or length:( .. 100)")
				.queryParam("bboxes", "M:8.694,49.400954,8.7420,49.380")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("time", "2013-09-14")
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
	public void test_t4q4wam4v4h2_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "roof,unclassified,tertiary")
				.queryParam("time", "2013-07-19")
				.queryParam("bpolys", "H:8.704561,49.403252,8.715,49.437,8.7040,49.408,8.7384,49.427,8.704561,49.403252|rT:8.704561,49.403252,8.726,49.417,8.704,49.412,8.726609,49.4288,8.704561,49.403252")
				.queryParam("timeout", "62")
				.queryParam("bcircles", "h:8.720,49.413,3")
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
	public void test_1iut7deqz6gc0_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "apartments,street_lamp")
				.queryParam("bboxes", "up:8.676120,49.408,8.75948,49.3896|tlgYZ:8.6713,49.411084,8.731628,49.382|wc:8.668,49.413,8.728,49.3822|oGzbh:8.694,49.423,8.713,49.393")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("timeout", "93")
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
	public void test_urrx87tvhu7o_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "R:8.693,49.4238,8.72465,49.3886|m:8.6583,49.4182,8.727,49.395")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
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
	public void test_s15ke8a3rz1u_lengthGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "living_street,crossing,primary_link")
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and length:( .. 100)")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2017-01-18")
				.queryParam("bpolys", "8.704561,49.403252,8.723,49.4359,8.73753,49.4141,8.7422,49.404,8.704561,49.403252|8.704561,49.403252,8.719,49.415,8.7063,49.402520,8.73864,49.4132,8.704561,49.403252|8.704561,49.403252,8.7293,49.43503,8.722,49.43725,8.7035,49.41967,8.704561,49.403252")
				.queryParam("timeout", "24")
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
	public void test_1hrgyksqpz7ty_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"A\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7493,49.421],[8.7227,49.433],[8.7044,49.415],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "XGlrV:8.731,49.4265,9")
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
	public void test_urjl1zbpnupf_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Q:8.678041,49.417,8.748,49.38465")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("time", "2013-07-01")
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
	public void test_1h7ooin7a4wva_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,public,hospital")
				.queryParam("filter", "addr:street=* and not type:relation or area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "tzA:8.704561,49.403252,8.720,49.4035,8.719838,49.4119,8.7010,49.404,8.704561,49.403252")
				.queryParam("timeout", "25")
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
	public void test_skscuxzvfbqo_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.686,49.429,8.755,49.388|8.689,49.416,8.734101,49.3990")
				.queryParam("groupByKey", "highway")
				.queryParam("time", "2010-12-10")
				.queryParam("timeout", "56")
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
	public void test_u7xcguk21r1t_lengthGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network=* or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"LmXLY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700,49.414],[8.7325,49.409],[8.7099,49.4384],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Z\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7073,49.424],[8.702,49.419711],[8.73252,49.435],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"UKj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.735733,49.407],[8.7315,49.4269],[8.700,49.4392],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "80")
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
	public void test_1iuyqgs38j886_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7114,49.4207,8.710,49.403,8.7454,49.422,8.704561,49.403252")
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
	public void test_t4fkl5g8zwbo_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.666,49.4145,8.711,49.388|8.666262,49.415,8.706,49.399")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
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
	public void test_1hv2ofhxbpqap_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "i:8.674,49.40935,8.745,49.394|G:8.6869,49.407160,8.714,49.386")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-07-11")
				.queryParam("timeout", "94")
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
	public void test_s1gnhxi9nhie_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2017-09-30")
				.queryParam("bpolys", "8.704561,49.403252,8.74231,49.40598,8.739,49.425022,8.705,49.414,8.704561,49.403252|8.704561,49.403252,8.7414,49.426,8.708871,49.405,8.721539,49.420,8.704561,49.403252")
				.queryParam("timeout", "69")
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
	public void test_sonfwl1hrq5y_lengthGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "json")
				.queryParam("bpolys", "R:8.704561,49.403252,8.714,49.4374,8.743,49.431,8.7136,49.43981,8.704561,49.403252|P:8.704561,49.403252,8.7051,49.410,8.724,49.405,8.726,49.4011,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_1iut82rx90k0z_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* and type:way")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "d:8.704561,49.403252,8.701247,49.427,8.7044,49.423,8.704550,49.415,8.704561,49.403252|FRNRJ:8.704561,49.403252,8.738,49.41650,8.704750,49.40083,8.743,49.406448,8.704561,49.403252")
				.queryParam("bcircles", "8.7082,49.425,243")
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
	public void test_qdsqaag5jhb5_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.7237,49.436,8.71763,49.4375,8.728,49.4134,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_sl0m7zrtqkhh_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.7205,49.4031,8.7080,49.42191,8.73251,49.432,8.704561,49.403252")
				.queryParam("timeout", "53")
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
	public void test_urmdoe6h2skz_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("timeout", "77")
				.queryParam("bcircles", "sFGYl:8.7324,49.4028,78")
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
	public void test_qhhu4iq09agg_lengthGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-11-26")
				.queryParam("timeout", "45")
				.queryParam("bcircles", "jQA:8.71982,49.428,2|LG:8.701,49.429,2")
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
	public void test_ubj3jyaqj31y_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("filter2", "bicycle!=*")
				.queryParam("time", "2009-04-19")
				.queryParam("keys2", "highway")
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
	public void test_s1gpfx3kv0ok_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "UK:8.679,49.428,8.7307,49.395|bvCN:8.676,49.404,8.757,49.393")
				.queryParam("keys", "highway")
				.queryParam("types2", "other")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "type!=* and geometry:line and length:( .. 100)")
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
	public void test_1h7whiulju3j9_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.660222,49.4002,8.746359,49.388")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "footway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "network=* and type:node or length:( .. 100)")
				.queryParam("time", "2011-06-12")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "49")
				.queryParam("values2", "path")
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
	public void test_1h7o64ishvk2t_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* or geometry:point and id:(1 .. 9999)")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2012-06-06")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"RD\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.716,49.434278],[8.700,49.414975],[8.7238,49.408],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"DGBx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7445,49.4326],[8.703594,49.416144],[8.7047,49.4214],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "42")
				.queryParam("values2", "traffic_mirror")
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
	public void test_us313nqi5opy_lengthRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.74308,49.43902,8.7420,49.42365,8.700584,49.4012,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "51")
				.queryParam("values2", "traffic_signals")
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
	public void test_uv8nuty5sajp_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("bpolys", "8.704561,49.403252,8.7328,49.4018,8.729,49.417,8.7407,49.408,8.704561,49.403252")
				.queryParam("timeout", "90")
				.queryParam("values2", "residential")
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
	public void test_ubj2dt0kvpkj_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "highway!=* and type:way and id:(1 .. 9999)")
				.queryParam("time", "2015-01-21")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"qk\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7417,49.437],[8.704,49.430],[8.702565,49.419],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "55")
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
	public void test_qhtd77ikxkxi_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and geometry:point")
				.queryParam("types2", "polygon,other")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-12-16")
				.queryParam("keys2", "highway")
				.queryParam("bcircles", "8.728,49.417,9")
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
	public void test_1ies7vp257yar_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6813,49.414,8.741748,49.383|8.671,49.425,8.7583,49.386|8.659,49.411,8.733,49.396|8.682,49.411,8.721,49.394")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-11-20")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "26")
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
	public void test_qdqhxl6jnnfm_lengthRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "JrFRA:8.717,49.43782,75|z:8.7181,49.40276,840062661|FGEFm:8.74196,49.400471,6")
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
	public void test_qdqip80lohgk_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* or type:way")
				.queryParam("bboxes", "wu:8.6986,49.4130,8.749,49.399")
				.queryParam("keys", "highway")
				.queryParam("types2", "line,polygon,other")
				.queryParam("time", "2007-10-23")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "78")
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
	public void test_1jei63xqfvbz8_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* or geometry:point or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "8.670969,49.40319,8.752,49.385|8.681,49.402043,8.7301,49.395")
				.queryParam("types2", "point,polygon,")
				.queryParam("filter2", "building!=* and not type:node and length:( .. 100)")
				.queryParam("timeout", "51")
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
	public void test_vf45lod6vdyc_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=*")
				.queryParam("time", "2009-03-15")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"mIfT\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.700377,49.412],[8.70830,49.4132],[8.70475,49.427],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Gz\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.725,49.4272],[8.7044,49.42974],[8.7389,49.425],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"jZq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7094,49.435913],[8.704,49.41479],[8.704589,49.413],[8.704561,49.403252]]]}}]}")
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
	public void test_t4a1qlf7hdno_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,")
				.queryParam("values", "unclassified")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "DYq:8.704561,49.403252,8.718,49.40948,8.728,49.43399,8.70458,49.4237,8.704561,49.403252")
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
	public void test_1jew2xefzyd6b_lengthRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "node,way,relation")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
				.queryParam("bcircles", "8.738,49.4025,5")
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
	public void test_1hbiqgq9dunuh_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or type:node")
				.queryParam("bboxes", "ggl:8.66144,49.4130,8.713,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "foot=* and type:way")
				.queryParam("keys2", "highway")
				.queryParam("values2", "traffic_signals")
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
	public void test_1h822y1hd3lme_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "z:8.690,49.421,8.738,49.3935|L:8.68707,49.417,8.712,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("filter2", "addr:housenumber!=* and id:(1 .. 9999)")
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
	public void test_1jyjclrs51nw3_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ElVjS:8.6640,49.4170,8.714,49.393|yU:8.6671,49.403,8.714,49.397|yq:8.660,49.429,8.736,49.381|FYVYb:8.662,49.421220,8.70778,49.393538")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("filter2", "type=* or id:(1 .. 9999)")
				.queryParam("time", "2008-07-22")
				.queryParam("keys2", "highway")
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
	public void test_tnyzdhvxda3n_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "polygon,")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "8.74070,49.4343,6|8.740,49.428,2|8.713285,49.4136,4")
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
	public void test_vbf6di7c13qu_lengthRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and length:( .. 100)")
				.queryParam("format", "json")
				.queryParam("keys2", "highway")
				.queryParam("values2", "track")
				.queryParam("bcircles", "X:8.723827,49.412,6568893523")
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
	public void test_1hv8bhdo3bbcm_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"c\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.745,49.432],[8.7077,49.41765],[8.704,49.428],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "26")
				.queryParam("bcircles", "wITE:8.720,49.424,462|RLWJS:8.71278,49.4009,80|Er:8.727837,49.4095,12")
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
	public void test_1h7zaebc4azc4_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=*")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "33")
				.queryParam("bcircles", "Icm:8.745,49.405,3")
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
	public void test_1jew436ajcieq_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("time", "2007-10-08")
				.queryParam("bpolys", "yxuKm:8.704561,49.403252,8.712,49.428,8.709,49.411,8.718,49.435282,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_1hrgf0siebdr5_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.726,49.4340,3|8.703,49.4039,175666397")
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
	public void test_s1dwvv47c0mp_perimeter() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "2014-02-16")
				.queryParam("bcircles", "M:8.726207,49.418226,6|xDV:8.749991,49.413,2")
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
	public void test_1ib35wxnk6rli_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* and not type:way")
				.queryParam("bboxes", "EDECE:8.6893,49.401276,8.725,49.386|hu:8.6942,49.4055,8.746,49.385")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "T:8.704561,49.403252,8.7485,49.436,8.7073,49.417,8.715,49.424748,8.704561,49.403252|JSwaZ:8.704561,49.403252,8.716,49.4230,8.738,49.420,8.706,49.4030,8.704561,49.403252|qNTay:8.704561,49.403252,8.739,49.43124,8.704588,49.417,8.720,49.404,8.704561,49.403252")
				.queryParam("timeout", "93")
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
	public void test_1iunnfvvilkki_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "aJ:8.6675,49.41856,8.7040,49.397|Agxfn:8.6709,49.406,8.708,49.385")
				.queryParam("format", "csv")
				.queryParam("time", "2009-05-11")
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
	public void test_sksa4o8yd6pd_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "m:8.655,49.417021,8.7366,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("format", "json")
				.queryParam("time", "2010-01-04")
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
	public void test_1jygjl7xss129_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and type:way")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-07-21")
				.queryParam("timeout", "86")
				.queryParam("bcircles", "8.739,49.429,832|8.735,49.428,6")
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
	public void test_1k1zjobfx06ye_perimeter1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2009-05-18")
				.queryParam("bpolys", "A:8.704561,49.403252,8.7413,49.41909,8.706,49.430605,8.735,49.421641,8.704561,49.403252|AVujo:8.704561,49.403252,8.7295,49.4005,8.704,49.402,8.7049,49.42103,8.704561,49.403252")
				.queryParam("timeout", "97")
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
	public void test_ubompij65gl0_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "unclassified")
				.queryParam("time", "2016-11-03")
				.queryParam("timeout", "48")
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
	public void test_ubrh7m5zrx9s_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"fy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70352,49.4104],[8.712344,49.409],[8.708,49.417],[8.704561,49.403252]]]}}]}")
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
	public void test_rl5mdy7lfn1e_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=*")
				.queryParam("format", "geojson")
				.queryParam("time", "2009-08-22")
				.queryParam("bpolys", "k:8.704561,49.403252,8.703,49.43512,8.728,49.414,8.745363,49.4108,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_ubopfqnlji2a_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and type:node")
				.queryParam("bboxes", "K:8.66340,49.414079,8.7456,49.391")
				.queryParam("showMetadata", "false")
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
	public void test_1k1wsacsjy2xt_perimeterDensity() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=* and not geometry:line or not id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "25")
				.queryParam("bcircles", "8.723,49.4000,3|8.7330,49.437,8")
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
	public void test_vb928gl4czfq_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and length:( .. 100)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2018-04-17")
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
	public void test_somwepfqa436_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("bcircles", "8.7177,49.432,9|8.720,49.424,1|8.703,49.429,520|8.730,49.409663,7")
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
	public void test_skk1x7d1rgvq_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bpolys", "8.704561,49.403252,8.714729,49.432,8.748851,49.439,8.703728,49.423,8.704561,49.403252|8.704561,49.403252,8.702,49.4378,8.710446,49.404,8.715,49.414,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_r178w2nxxduu_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2014-12-24")
				.queryParam("bpolys", "Oiy:8.704561,49.403252,8.721,49.41756,8.7474,49.4350,8.709,49.4379,8.704561,49.403252|EGteQ:8.704561,49.403252,8.7100,49.4295,8.7093,49.4323,8.7072,49.426575,8.704561,49.403252")
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
	public void test_qe74n5eqwbw3_perimeterDensity1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2010-11-21")
				.queryParam("bpolys", "8.704561,49.403252,8.701778,49.416,8.7006,49.4092,8.745,49.432,8.704561,49.403252")
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
	public void test_qxwnpfbtf2gk_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "sidewalk!=* or type:way")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.7216,49.4122,8.749,49.4149,8.715,49.43548,8.704561,49.403252|8.704561,49.403252,8.714,49.400694,8.7042,49.432,8.720,49.422,8.704561,49.403252")
				.queryParam("timeout", "21")
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
	public void test_qdsqobk2envp_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("time", "2015-10-13")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Q\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.728,49.425],[8.711,49.409],[8.746109,49.432],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "63")
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
	public void test_tnyzfyo1hk4x_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "23")
				.queryParam("bcircles", "Ayr:8.712994,49.419,5|bxO:8.713,49.438491,431|QW:8.702,49.4203,9")
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
	public void test_qhntpsothobm_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "natural=wood and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2015-10-13")
				.queryParam("timeout", "49")
				.queryParam("bcircles", "IUA:8.709,49.416,9")
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
	public void test_s4unzdd9dtm8_perimeterDensityGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes=* and length:( .. 100)")
				.queryParam("bpolys", "wlQ:8.704561,49.403252,8.7390,49.406,8.71406,49.435,8.7040,49.4065,8.704561,49.403252|oxCag:8.704561,49.403252,8.710,49.421,8.7358,49.406,8.700,49.4350,8.704561,49.403252")
				.queryParam("timeout", "89")
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
	public void test_1ji2780w056xw_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2011-08-22")
				.queryParam("timeout", "36")
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
	public void test_urupe4qpy33r_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-06-28")
				.queryParam("bpolys", "dGW:8.704561,49.403252,8.706,49.404,8.7087,49.4082,8.709,49.42634,8.704561,49.403252|ZpEsW:8.704561,49.403252,8.707,49.4136,8.7456,49.406,8.708,49.4398,8.704561,49.403252")
				.queryParam("timeout", "20")
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
	public void test_s15kdyrns605_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "Kf:8.726472,49.439,17")
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
	public void test_qhqmz4b5paap_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-02-18")
				.queryParam("bpolys", "lr:8.704561,49.403252,8.740,49.420,8.7253,49.43740,8.70021,49.428,8.704561,49.403252|sPMm:8.704561,49.403252,8.7158,49.4269,8.702489,49.404,8.7003,49.418,8.704561,49.403252|n:8.704561,49.403252,8.70948,49.414,8.704560,49.436,8.70457,49.438541,8.704561,49.403252")
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
	public void test_1h7rg849esm5w_perimeterDensityGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "h:8.6529,49.409,8.74268,49.382|xRUEe:8.659,49.4038,8.724,49.382019")
				.queryParam("time", "2009-01-04")
				.queryParam("timeout", "86")
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
	public void test_1iuvhx939m7g4_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("values", "secondary_link")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "LLZ:8.705,49.4117,6|D:8.702,49.4253,911179268")
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
	public void test_1jig3ncwcdkyp_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "GHLNf:8.704561,49.403252,8.7167,49.4268,8.7040,49.415,8.70454,49.4359,8.704561,49.403252|Ro:8.704561,49.403252,8.715,49.423,8.726,49.41367,8.718842,49.41382,8.704561,49.403252")
				.queryParam("bcircles", "rLy:8.7319,49.40114,11")
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
	public void test_s13cyf8vcto7_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "church,commercial")
				.queryParam("filter", "building=* and area:(1.0 .. 1E6)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("bcircles", "8.7473,49.4249,2")
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
	public void test_s4xeif7gwlys_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "unclassified")
				.queryParam("format", "json")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "xACK:8.7008,49.410,82")
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
	public void test_1iempkjjnlv7a_perimeterDensityGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed=*")
				.queryParam("bboxes", "OZZ:8.6832,49.4012,8.728830,49.383|dh:8.685,49.408555,8.731,49.399")
				.queryParam("groupByKey", "building")
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
	public void test_1jeiplh5tiwc4_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.69595,49.410,8.7453,49.392|8.697,49.42926,8.7243,49.381631|8.693,49.425,8.726201,49.386|8.697412,49.4181,8.700,49.382")
				.queryParam("groupByKey", "building")
				.queryParam("values", "platform")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-07-16")
				.queryParam("bpolys", "yO:8.704561,49.403252,8.730977,49.43185,8.72044,49.415,8.709,49.436,8.704561,49.403252|Gw:8.704561,49.403252,8.741,49.431,8.728,49.439,8.704,49.411,8.704561,49.403252")
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
	public void test_urgrpp9mvzn5_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=*")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "52")
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
	public void test_tog6ct8rwpd0_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=*")
				.queryParam("bboxes", "HZlle:8.6798,49.404,8.754,49.384|D:8.668,49.415,8.749,49.394")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-03-16")
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
	public void test_us0r6tqfgl0j_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "bbTf:8.704561,49.403252,8.7314,49.408,8.736,49.433,8.704560,49.410,8.704561,49.403252|tdL:8.704561,49.403252,8.7277,49.405930,8.704,49.400899,8.706858,49.410,8.704561,49.403252|v:8.704561,49.403252,8.731,49.432,8.732,49.439,8.7079,49.412,8.704561,49.403252")
				.queryParam("timeout", "82")
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
	public void test_qe6kb2k7r3om_perimeterDensityGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot=* and geometry:line or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2015-11-28")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "8.7378,49.413,68")
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
	public void test_1ib3p34oxe6ar_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.666,49.42577,8.7045,49.387|8.659,49.41938,8.743,49.398|8.694,49.400,8.7403,49.399")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "I:8.716470,49.4070,1")
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
	public void test_vbcd14gwq050_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and area:(1.0 .. 1E6)")
				.queryParam("groupByValues", "hotel,turning_circle,traffic_mirror")
				.queryParam("bboxes", "8.665732,49.4231,8.737,49.39549")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-12-07")
				.queryParam("timeout", "37")
				.queryParam("bcircles", "8.7071,49.4041,7")
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
	public void test_1jy7qq0nyhxdl_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,pedestrian,dormitory")
				.queryParam("bboxes", "8.6937,49.4040,8.722,49.3820")
				.queryParam("groupByKey", "building")
				.queryParam("time", "2014-07-13")
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
	public void test_rhtyxljajxpi_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "hotel,turning_circle")
				.queryParam("bboxes", "8.699,49.414,8.725,49.380|8.696,49.425,8.747,49.3912")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2012-12-12")
				.queryParam("timeout", "72")
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
	public void test_1jefyzh4zazj8_perimeterDensityGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,footway")
				.queryParam("filter", "addr:postcode!=* or length:( .. 100)")
				.queryParam("bboxes", "a:8.669,49.423,8.757,49.397|SJKvQ:8.665,49.4148,8.702,49.38418")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "44")
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
	public void test_qe4csmunskmd_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified,footway")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "residential")
				.queryParam("format", "csv")
				.queryParam("time", "2016-07-05")
				.queryParam("bpolys", "8.704561,49.403252,8.736344,49.4284,8.727,49.4270,8.725,49.41008,8.704561,49.403252|8.704561,49.403252,8.7228,49.4353,8.735,49.413,8.727083,49.41477,8.704561,49.403252")
				.queryParam("timeout", "89")
				.queryParam("bcircles", "8.71843,49.415375,4")
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
	public void test_1ib0h9h0btg6v_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or type:node and area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "31")
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
	public void test_rhtyjnzsxyee_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,give_way")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("time", "2017-04-15")
				.queryParam("bpolys", "j:8.704561,49.403252,8.746446,49.430,8.700,49.40408,8.724,49.405,8.704561,49.403252|F:8.704561,49.403252,8.713456,49.430,8.732,49.4277,8.741,49.411,8.704561,49.403252|aOqfu:8.704561,49.403252,8.736639,49.431,8.746,49.4109,8.70042,49.428348,8.704561,49.403252")
				.queryParam("timeout", "61")
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
	public void test_trrddivh8tv4_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* or geometry:line or not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "66")
				.queryParam("bcircles", "Ho:8.728,49.410,9|RLqud:8.743,49.4215,7|QFF:8.705,49.437,3|h:8.7321,49.431415,769")
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
	public void test_uv8n0f9xme5v_perimeterDensityGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=*")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2016-02-24")
				.queryParam("bpolys", "w:8.704561,49.403252,8.7365,49.411,8.7302,49.405,8.708073,49.436,8.704561,49.403252|NRa:8.704561,49.403252,8.7180,49.438021,8.7378,49.428,8.7418,49.414670,8.704561,49.403252|pmBL:8.704561,49.403252,8.7385,49.426,8.7045,49.423,8.704605,49.409,8.704561,49.403252")
				.queryParam("timeout", "51")
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
	public void test_1ibe9vdsmb22b_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "tertiary")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-12-10")
				.queryParam("bpolys", "FV:8.704561,49.403252,8.7411,49.414,8.708,49.404,8.7474,49.417,8.704561,49.403252|Jo:8.704561,49.403252,8.7292,49.4177,8.733,49.416187,8.7442,49.409,8.704561,49.403252|pHk:8.704561,49.403252,8.700848,49.4000,8.7281,49.413,8.704,49.412,8.704561,49.403252")
				.queryParam("timeout", "97")
				.queryParam("bcircles", "cP:8.7151,49.419,389436104|GqYg:8.712,49.43410,99|V:8.712,49.4004,366")
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
	public void test_r1ic2eljbv3q_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("time", "2007-12-20")
				.queryParam("bpolys", "bP:8.704561,49.403252,8.717027,49.4029,8.7070,49.408,8.741,49.405201,8.704561,49.403252|KLgdy:8.704561,49.403252,8.7363,49.400,8.724,49.405,8.71998,49.4027,8.704561,49.403252|w:8.704561,49.403252,8.718,49.401,8.70496,49.421,8.73439,49.408,8.704561,49.403252")
				.queryParam("timeout", "92")
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
	public void test_1hv88r88846yb_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "M:8.704561,49.403252,8.7354,49.407,8.708,49.434584,8.710,49.426,8.704561,49.403252")
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
	public void test_1h821sblh3cyr_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination=* or not type:node")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2007-11-19")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Ruhm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7106,49.40237],[8.744,49.4138],[8.7083,49.4344],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "37")
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
	public void test_vf978109pxro_perimeterDensityGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("bpolys", "r:8.704561,49.403252,8.747,49.4041,8.718,49.421,8.706,49.407,8.704561,49.403252|z:8.704561,49.403252,8.73344,49.422806,8.7146,49.430,8.702,49.4243,8.704561,49.403252|cV:8.704561,49.403252,8.740,49.40713,8.703,49.416,8.703,49.404,8.704561,49.403252")
				.queryParam("timeout", "48")
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
	public void test_tocvvcn34bc5_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.68512,49.407,8.7407,49.3836|8.663,49.400,8.7042,49.3822")
				.queryParam("keys", "highway")
				.queryParam("values", "steps")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2010-03-05")
				.queryParam("bpolys", "8.704561,49.403252,8.720,49.436,8.724541,49.417,8.730323,49.409,8.704561,49.403252|8.704561,49.403252,8.744,49.418,8.712,49.4035,8.703,49.4214,8.704561,49.403252|8.704561,49.403252,8.707,49.439,8.7410,49.403,8.704975,49.400,8.704561,49.403252")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "u:8.733,49.4042,200|cYTlk:8.711,49.4363,5")
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
	public void test_1jenra13wgaxx_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "2013-11-24")
				.queryParam("bpolys", "ewtrw:8.704561,49.403252,8.714,49.4110,8.73180,49.403,8.700,49.435,8.704561,49.403252|Hj:8.704561,49.403252,8.7181,49.4203,8.748,49.4256,8.724745,49.419263,8.704561,49.403252")
				.queryParam("timeout", "68")
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
	public void test_r1fkoi80zbcn_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("time", "2011-04-23")
				.queryParam("bpolys", "dHVei:8.704561,49.403252,8.749,49.4203,8.706,49.4288,8.711993,49.412,8.704561,49.403252|l:8.704561,49.403252,8.7292,49.4133,8.706,49.4014,8.7060,49.4388,8.704561,49.403252|f:8.704561,49.403252,8.703,49.41711,8.737,49.436,8.730,49.40368,8.704561,49.403252")
				.queryParam("timeout", "72")
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
	public void test_1k1wrike9nn1f_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2009-02-01")
				.queryParam("bcircles", "8.725,49.433428,11|8.732,49.427,9|8.7114,49.427044,3|8.718,49.429,18")
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
	public void test_s1ef79mom1iu_perimeterDensityGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* and id:(1 .. 9999)")
				.queryParam("bpolys", "n:8.704561,49.403252,8.730948,49.43676,8.74852,49.407,8.7296,49.436,8.704561,49.403252|P:8.704561,49.403252,8.727,49.417,8.7041,49.429,8.730,49.4369,8.704561,49.403252|lkUA:8.704561,49.403252,8.725,49.432,8.730,49.40656,8.701,49.438,8.704561,49.403252")
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
	public void test_t81uow79fjub_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn:lanes!=* or not length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_mirror")
				.queryParam("bpolys", "8.704561,49.403252,8.744370,49.41998,8.7075,49.425,8.703,49.436,8.704561,49.403252|8.704561,49.403252,8.7004,49.4172,8.709,49.4040,8.716396,49.425,8.704561,49.403252|8.704561,49.403252,8.703,49.409534,8.7095,49.41026,8.710,49.4035,8.704561,49.403252")
				.queryParam("timeout", "90")
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
	public void test_to7vf5ajulh1_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) and length:( .. 100)")
				.queryParam("bboxes", "qqZnb:8.673,49.402,8.707,49.394|fV:8.6595,49.420,8.753,49.3895")
				.queryParam("format", "json")
				.queryParam("time", "2014-10-13")
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
	public void test_trrc71q0rz95_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway=* or not length:( .. 100)")
				.queryParam("bboxes", "8.672,49.4236,8.758947,49.394")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2008-05-02")
				.queryParam("timeout", "29")
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
	public void test_uv5to6t8v7ec_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=* or geometry:line or id:(1 .. 9999)")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2016-01-29")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.7099,49.403,480")
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
	public void test_t4hv7ilcehx3_perimeterGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6511,49.428,8.7392,49.382|8.664621,49.427,8.735,49.39296")
				.queryParam("time", "2011-03-19")
				.queryParam("timeout", "41")
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
	public void test_vf98e8a2dnqd_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("time", "2014-11-02")
				.queryParam("bpolys", "BD:8.704561,49.403252,8.7164,49.42710,8.704,49.435,8.7037,49.4300,8.704561,49.403252")
				.queryParam("timeout", "24")
				.queryParam("bcircles", "GEXPB:8.739256,49.403,5")
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
	public void test_1iukfm7hi1gma_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=* and not area:(1.0 .. 1E6)")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "L:8.704561,49.403252,8.749,49.4070,8.706,49.430121,8.72589,49.421,8.704561,49.403252|Myut:8.704561,49.403252,8.722981,49.4132,8.711,49.4023,8.705,49.4247,8.704561,49.403252|f:8.704561,49.403252,8.734,49.4265,8.7160,49.414,8.719,49.4043,8.704561,49.403252")
				.queryParam("timeout", "94")
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
	public void test_rhb21ith3m7m_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=* or id:(1 .. 9999)")
				.queryParam("bboxes", "XWV:8.68420,49.41129,8.729,49.383")
				.queryParam("time", "2010-03-09")
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
	public void test_t4q3t3t3egc7_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-06-20")
				.queryParam("bpolys", "8.704561,49.403252,8.747,49.4318,8.704,49.418,8.719,49.41155,8.704561,49.403252|8.704561,49.403252,8.7085,49.43868,8.72563,49.43688,8.70401,49.428,8.704561,49.403252")
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
	public void test_1ieybb5kiuwyr_perimeterGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "Eo:8.704561,49.403252,8.710,49.438,8.706081,49.404,8.704,49.4294,8.704561,49.403252")
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
	public void test_1jecpqw4ijo6o_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "pedestrian,hotel,church")
				.queryParam("bboxes", "is:8.6822,49.409,8.724,49.3900|U:8.6507,49.40203,8.736,49.3819")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"tG\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.70978,49.4384],[8.716255,49.4194],[8.74480,49.410808],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"VsEnu\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.4148],[8.704,49.4147],[8.7043,49.428],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"o\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.729,49.431],[8.717,49.412],[8.7004,49.402],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "86")
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
	public void test_1hvbjay4djgx2_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing")
				.queryParam("bboxes", "8.692,49.403,8.7140,49.386|8.686,49.425,8.7214,49.390")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.726,49.419045,8.733,49.439,8.736,49.419,8.704561,49.403252|8.704561,49.403252,8.703,49.414,8.707,49.415500,8.704555,49.421027,8.704561,49.403252|8.704561,49.403252,8.7277,49.408,8.73007,49.428,8.728,49.40879,8.704561,49.403252")
				.queryParam("timeout", "42")
				.queryParam("bcircles", "8.706,49.4392,9|8.7290,49.41150,3")
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
	public void test_tocx1nuwh2yb_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "tower,service")
				.queryParam("filter", "lit=* and geometry:point or id:(1 .. 9999)")
				.queryParam("bboxes", "8.670,49.4050,8.756,49.392")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-10-15")
				.queryParam("timeout", "48")
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
	public void test_1ibh2clhrpkki_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,synagogue,chapel")
				.queryParam("filter", "destination=* or not length:( .. 100)")
				.queryParam("bboxes", "IA:8.6927,49.4211,8.70803,49.3923|Jh:8.672,49.40765,8.7406,49.3973|VjE:8.650,49.4281,8.738,49.398")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "2011-02-04")
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
	public void test_socc3g0fz5gm_perimeterGroupByBoundaryGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "speed_camera,demolished,give_way")
				.queryParam("bboxes", "DuN:8.684,49.424,8.7544,49.391|R:8.674,49.413,8.719,49.391")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "72")
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
	public void test_s0xbsgqjxf07_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "hZ:8.670,49.429392,8.749,49.381|Ti:8.69160,49.4121,8.7381,49.384541|G:8.667,49.421,8.7501,49.38317|m:8.664,49.4106,8.7293,49.392986")
				.queryParam("groupByKey", "building")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("time", "2012-05-15")
				.queryParam("bcircles", "dAZ:8.741,49.437,2|jofZA:8.7457,49.4199,37|Ts:8.708266,49.413,6|wkL:8.72744,49.4078,2")
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
	public void test_rlaos1jkyici_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "m:8.6554,49.407,8.72312,49.3971")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "no")
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
	public void test_qxiqt80nschi_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2014-08-21")
				.queryParam("bcircles", "h:8.725,49.420,8")
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
	public void test_1h85bhitwh1sx_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop_line,street_lamp")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2010-12-21")
				.queryParam("bcircles", "ODO:8.7060,49.43602,3|CIh:8.7058,49.403,43|m:8.72180,49.406,1|i:8.747,49.416,69230853644")
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
	public void test_vevuqqcxq6gi_perimeterGroupByBoundaryGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:city=* or type:relation and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "W:8.667,49.41012,8.7103,49.387|h:8.684,49.419,8.7553,49.397")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("timeout", "51")
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
	public void test_vb6u9qv3t5yd_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XHskn:8.6756,49.411,8.746,49.383")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "64")
				.queryParam("groupByKeys", "addr:country,lanes")
				.queryParam("bcircles", "aNkXS:8.747,49.406,1|HnRZg:8.734177,49.4176,7")
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
	public void test_1jxzdug9rgta1_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ZVA:8.661,49.415,8.718,49.384|NQ:8.698,49.4094,8.719170,49.396|bmMm:8.68361,49.416,8.7156,49.3819|nE:8.670,49.416,8.747,49.39098")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "60")
				.queryParam("bcircles", "8.740,49.43799,8")
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
	public void test_uv6dk34pus85_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("time", "2017-02-03")
				.queryParam("timeout", "37")
				.queryParam("groupByKeys", "surface,oneway")
				.queryParam("bcircles", "RTfcQ:8.72751,49.421,6|Zr:8.736,49.431,9|Tj:8.7126,49.405,4|t:8.7373,49.41426,4")
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
	public void test_qxntzt1ea3ao_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway) or type:relation and area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"rY\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.418],[8.70894,49.4375],[8.7472,49.421004],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "37")
				.queryParam("groupByKeys", "landuse,bicycle")
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
	public void test_1ji782d9o9vzl_perimeterGroupByKey() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "s:8.659,49.42266,8.7267,49.391|A:8.660,49.406,8.73815,49.383")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2012-12-06")
				.queryParam("groupByKeys", "source:maxspeed")
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
	public void test_1ibkcg1dguj3k_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or length:( .. 100)")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-12-13")
				.queryParam("bpolys", "n:8.704561,49.403252,8.70984,49.4149,8.7040,49.432322,8.7343,49.412,8.704561,49.403252")
				.queryParam("timeout", "32")
				.queryParam("groupByKeys", "maxspeed")
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
	public void test_sksudxpfor3p_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and length:( .. 100)")
				.queryParam("values", "tertiary")
				.queryParam("format", "csv")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "sq:8.701,49.4010,56|j:8.717,49.434,7")
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
	public void test_urjk9p8jre45_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.675675,49.401,8.7464,49.386|8.694,49.416830,8.705,49.394")
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "2013-07-29")
				.queryParam("groupByKeys", "highway,tracktype,turn")
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
	public void test_ubryd6ryxu0h_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "fNYzK:8.66914,49.412953,8.726,49.389|b:8.6861,49.428,8.75420,49.394|X:8.652,49.406,8.753,49.391")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("timeout", "27")
				.queryParam("groupByKeys", "ref,addr:country")
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
	public void test_uvbee7ny304m_perimeterGroupByKey1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "2014-03-19")
				.queryParam("groupByKeys", "sidewalk,addr:country,highway")
				.queryParam("bcircles", "8.71141,49.40281,1")
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
	public void test_qxfj2a9as5dg_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,ship,hotel")
				.queryParam("filter", "addr:street!=* or geometry:point")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("time", "2016-08-10")
				.queryParam("bpolys", "8.704561,49.403252,8.744,49.429,8.7033,49.421,8.700,49.426,8.704561,49.403252|8.704561,49.403252,8.72129,49.410,8.74372,49.4399,8.7027,49.419,8.704561,49.403252")
				.queryParam("timeout", "64")
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
	public void test_1ies7he3l06cy_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not length:( .. 100)")
				.queryParam("time", "2013-02-14")
				.queryParam("timeout", "92")
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
	public void test_1jecnq1wxy8fq_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "stop,construction")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "living_street")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2011-07-28")
				.queryParam("timeout", "61")
				.queryParam("bcircles", "QPN:8.7276,49.4068,827114670|yUYcf:8.708,49.40657,771")
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
	public void test_sl67qasd45ep_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "residential,hospital")
				.queryParam("filter", "surface!=* or not length:( .. 100)")
				.queryParam("bboxes", "8.673,49.405,8.728,49.398")
				.queryParam("groupByKey", "building")
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
	public void test_urmb9bbgcvg0_perimeterGroupByTag() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "commercial,service")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "csv")
				.queryParam("bcircles", "xaL:8.715,49.423,8")
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
	public void test_qhq33vjbspiv_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "cycleway")
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
	public void test_1iev1o59w4gmr_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "destination!=*")
				.queryParam("groupByValues", "steps,church,stop")
				.queryParam("values", "service")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-01-23")
				.queryParam("timeout", "30")
				.queryParam("bcircles", "8.744309,49.402010,6|8.729950,49.40394,8")
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
	public void test_1hb86gpaw76n8_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "crossing,elevator,commercial")
				.queryParam("filter", "smoothness=*")
				.queryParam("bboxes", "rZ:8.688,49.40623,8.724,49.38639")
				.queryParam("groupByKey", "building")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2015-09-22")
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
	public void test_qxljd7nyhohf_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2007-10-29")
				.queryParam("bcircles", "Og:8.705,49.420,7")
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
	public void test_1h7fvze26suns_perimeterGroupByTag1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "traffic_mirror,secondary_link,cycleway")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "track")
				.queryParam("format", "csv")
				.queryParam("bpolys", "zg:8.704561,49.403252,8.7251,49.4356,8.7009,49.432,8.700541,49.404,8.704561,49.403252")
				.queryParam("timeout", "57")
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
	public void test_1jia1gucdagxk_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.674997,49.419,8.730055,49.3888|8.65401,49.429555,8.736,49.399|8.672,49.413,8.71723,49.392|8.67671,49.42622,8.740024,49.397")
				.queryParam("values", "stop_line")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.427093,8.748,49.4130,8.71965,49.40757,8.704561,49.403252|8.704561,49.403252,8.712952,49.401,8.70414,49.435,8.705172,49.419,8.704561,49.403252|8.704561,49.403252,8.735,49.429,8.7041,49.402479,8.70472,49.4182,8.704561,49.403252")
				.queryParam("bcircles", "Bh:8.729,49.419,97")
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
	public void test_1k2022mhlle91_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "b:8.704561,49.403252,8.72956,49.4209,8.704,49.40390,8.731131,49.43470,8.704561,49.403252|I:8.704561,49.403252,8.7262,49.405,8.70378,49.4323,8.700,49.411,8.704561,49.403252|pDC:8.704561,49.403252,8.738,49.4270,8.704,49.43062,8.704,49.4184,8.704561,49.403252")
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
	public void test_vf96fqji1ve9_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway in (secondary,path,unclassified,track,primary,residential,cycleway,service,footway)")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "cH:8.704561,49.403252,8.709,49.40650,8.702,49.404,8.70518,49.43556,8.704561,49.403252|f:8.704561,49.403252,8.70773,49.4057,8.707,49.42981,8.701452,49.435,8.704561,49.403252|KQU:8.704561,49.403252,8.7442,49.40357,8.717,49.405,8.700,49.407,8.704561,49.403252")
				.queryParam("timeout", "83")
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
	public void test_urk2kzejcrw0_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "YV:8.656,49.4255,8.7197,49.381|TXKph:8.677,49.4155,8.750,49.386|c:8.6536,49.419,8.7147,49.39116")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2016-07-03")
				.queryParam("timeout", "77")
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
	public void test_s4mckyxlfbxs_perimeterGroupByType() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "DasDS:8.704561,49.403252,8.7098,49.436,8.7474,49.414212,8.70134,49.411,8.704561,49.403252")
				.queryParam("timeout", "63")
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
	public void test_1hbagrrzussip_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* or type:node")
				.queryParam("bboxes", "eAeHK:8.6868,49.4151,8.700,49.384|w:8.656,49.402,8.7444,49.399|wtJj:8.688,49.424,8.748,49.399")
				.queryParam("values", "platform")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "2008-02-21")
				.queryParam("timeout", "75")
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
	public void test_1k2542ryjhiyd_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "ha:8.704561,49.403252,8.737192,49.435,8.7001,49.4165,8.70507,49.4279,8.704561,49.403252|Z:8.704561,49.403252,8.7191,49.43337,8.7231,49.436,8.704561,49.403032,8.704561,49.403252|R:8.704561,49.403252,8.720,49.408,8.74687,49.414,8.723,49.42777,8.704561,49.403252")
				.queryParam("timeout", "50")
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
	public void test_1hru9w5mtetes_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* or area:(1.0 .. 1E6)")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "py:8.704561,49.403252,8.744,49.422,8.738,49.400,8.70574,49.432,8.704561,49.403252|enX:8.704561,49.403252,8.715,49.423,8.747,49.410128,8.701,49.414023,8.704561,49.403252")
				.queryParam("timeout", "36")
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
	public void test_toien5mxr392_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "platform")
				.queryParam("timeout", "81")
				.queryParam("bcircles", "OlM:8.7092,49.4106,3|zvkKD:8.7336,49.436,5|XR:8.700,49.437,23|iyYV:8.729,49.422,9")
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
	public void test_1iesa7m8a884w_perimeterGroupByType1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6968,49.414454,8.725,49.3880|8.6779,49.4196,8.728626,49.389")
				.queryParam("showMetadata", "false")
				.queryParam("time", "2017-09-22")
				.queryParam("timeout", "63")
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
	public void test_t8a5p39xybmq_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "way,")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "foot=* and type:way or area:(1.0 .. 1E6)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"JW\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7189,49.418],[8.7046,49.407],[8.728,49.406],[8.704561,49.403252]]]}}]}")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
				.queryParam("bcircles", "8.744,49.413869,654")
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
	public void test_s12rue7cth7n_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,other")
				.queryParam("values", "service")
				.queryParam("format", "csv")
				.queryParam("filter2", "destination=* and type:relation and length:( .. 100)")
				.queryParam("time", "2012-08-06")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "44")
				.queryParam("bcircles", "xIVj:8.706,49.403,3")
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
	public void test_s4pmd4c3d2k6_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:housenumber=*")
				.queryParam("bboxes", "a:8.6533,49.4236,8.746,49.382|kE:8.6931,49.428,8.714,49.3992|TfYyE:8.6962,49.4055,8.75185,49.382")
				.queryParam("types2", "way,relation")
				.queryParam("format", "json")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2016-05-23")
				.queryParam("keys2", "highway")
				.queryParam("values2", "steps")
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
	public void test_1jelij0jaux4m_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and not id:(1 .. 9999)")
				.queryParam("types2", "node,way,")
				.queryParam("format", "geojson")
				.queryParam("filter2", "type=* and length:( .. 100)")
				.queryParam("time", "2011-01-30")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "56")
				.queryParam("values2", "traffic_signals")
				.queryParam("bcircles", "xD:8.7231,49.423823,8")
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
	public void test_1iyf0enacwqid_perimeterRatio() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("types2", "point,line,polygon,")
				.queryParam("values", "emergency_access_point")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "2009-04-18")
				.queryParam("bpolys", "LmLP:8.704561,49.403252,8.724,49.436,8.7434,49.402,8.704,49.4202,8.704561,49.403252")
				.queryParam("timeout", "67")
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
	public void test_1iv6j30a6ef5f_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and not geometry:line or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("filter2", "building!=* or geometry:polygon or id:(1 .. 9999)")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Leq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.718,49.412],[8.703,49.404],[8.723904,49.433853],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "40")
				.queryParam("values2", "tertiary")
				.queryParam("bcircles", "bgF:8.719910,49.4145,3")
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
	public void test_1ib0xpg8bfbky_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.690,49.400859,8.7444,49.390")
				.queryParam("types2", "line,polygon,")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("filter2", "oneway!=* or area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "68")
				.queryParam("values2", "residential")
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
	public void test_1hblkkorqfrxv_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("timeout", "74")
				.queryParam("bcircles", "ZyNbV:8.743,49.438,7")
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
	public void test_1jeafw9du0lrk_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6763,49.4013,8.754,49.390")
				.queryParam("keys", "highway")
				.queryParam("types2", "point,polygon,")
				.queryParam("values", "primary_link")
				.queryParam("keys2", "highway")
				.queryParam("values2", "residential")
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
	public void test_s13chtf20db5_perimeterRatio1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* or not geometry:point or not id:(1 .. 9999)")
				.queryParam("bboxes", "g:8.680,49.414630,8.7347,49.395610|K:8.688,49.42437,8.753,49.393|xA:8.670427,49.407884,8.73101,49.396")
				.queryParam("types2", "node,way,")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "oneway!=* and type:node and not id:(1 .. 9999)")
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
	public void test_1if0i3sbum5o5_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and type:node")
				.queryParam("types2", "polygon,")
				.queryParam("values", "unclassified")
				.queryParam("filter2", "building=* and id:(1 .. 9999)")
				.queryParam("time", "2013-04-15")
				.queryParam("bpolys", "mv:8.704561,49.403252,8.72749,49.4053,8.7464,49.416335,8.740,49.410,8.704561,49.403252|tQIk:8.704561,49.403252,8.70236,49.431,8.7045,49.407,8.71551,49.4033,8.704561,49.403252")
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
	public void test_trwbv6w4czsi_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway!=* or geometry:point")
				.queryParam("bboxes", "aYeE:8.672,49.419,8.7139,49.381")
				.queryParam("time", "2017-10-29")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "88")
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
	public void test_skv2olyw79sy_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "aYh:8.67555,49.416,8.711,49.3924")
				.queryParam("keys", "highway")
				.queryParam("values", "traffic_signals")
				.queryParam("showMetadata", "true")
				.queryParam("time", "2014-03-21")
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
	public void test_t4iccr0rc8j6_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "JKAB:8.692,49.403807,8.746956,49.382")
				.queryParam("keys", "highway")
				.queryParam("values", "stop")
				.queryParam("filter2", "sidewalk!=* and type:relation and area:(1.0 .. 1E6)")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "96")
				.queryParam("values2", "crossing")
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
	public void test_1ies94fh8j0ok_perimeterRatioGroupByBoundary() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "source:maxspeed!=* or type:way")
				.queryParam("bpolys", "qb:8.704561,49.403252,8.728233,49.4229,8.74829,49.407,8.7442,49.424,8.704561,49.403252")
				.queryParam("keys2", "highway")
				.queryParam("timeout", "29")
				.queryParam("values2", "track")
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
	public void test_vbhx1trluf5i_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "LNpg:8.688,49.402013,8.75386,49.387")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("bpolys", "8.704561,49.403252,8.707,49.429282,8.70293,49.4048,8.71611,49.4120,8.704561,49.403252|8.704561,49.403252,8.708,49.414,8.74203,49.421,8.735,49.435,8.704561,49.403252|8.704561,49.403252,8.7492,49.4234,8.71494,49.419541,8.7099,49.431228,8.704561,49.403252")
				.queryParam("values2", "footway")
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
	public void test_r1a496yxbaec_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:postcode=* and geometry:line")
				.queryParam("types2", "node,relation")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "addr:street!=*")
				.queryParam("time", "2007-11-27")
				.queryParam("keys2", "highway")
				.queryParam("values2", "pedestrian")
				.queryParam("bcircles", "i:8.72929,49.409,3|ZxNAQ:8.7319,49.403568,2")
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
	public void test_u7rbdl1d2la1_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* or length:( .. 100)")
				.queryParam("bboxes", "y:8.671,49.411,8.7392,49.39776|mY:8.655,49.413,8.7075,49.383")
				.queryParam("showMetadata", "no")
				.queryParam("filter2", "addr:city=* or geometry:polygon and length:( .. 100)")
				.queryParam("time", "2010-12-25")
				.queryParam("timeout", "64")
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
	public void test_vbhxr30owsoi_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type=*")
				.queryParam("types2", "point,line,other")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("filter2", "maxspeed!=* or area:(1.0 .. 1E6)")
				.queryParam("time", "2018-05-08")
				.queryParam("keys2", "highway")
				.queryParam("values2", "service")
				.queryParam("bcircles", "D:8.743,49.420,20")
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
	public void test_1hbd8va1y2jj8_perimeterRatioGroupByBoundary1() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "residential")
				.queryParam("time", "2011-03-29")
				.queryParam("keys2", "highway")
				.queryParam("values2", "path")
				.queryParam("bcircles", "8.748297,49.4266,4")
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
	public void test_1iauvg12vhmpe_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "VcN:8.673,49.415,8.7120,49.396|QbW:8.66030,49.4235,8.7049,49.385|LvvrN:8.693,49.419,8.735,49.388")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y1D")
				.queryParam("bcircles", "DDCqJ:8.72311,49.4138,564971160")
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
	public void test_skmrd0tbzrcj_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Lj:8.67913,49.407979,8.715,49.398")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "30")
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
	public void test_r1fkm332d3js_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3M8D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"eB\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739794,49.417],[8.743,49.432898],[8.722661,49.4330],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "23")
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
	public void test_qdys2rjs5xyt_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "type!=*")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "8.704561,49.403252,8.742,49.415,8.7335,49.415,8.708,49.404,8.704561,49.403252|8.704561,49.403252,8.741,49.436800,8.725,49.415,8.742,49.428035,8.704561,49.403252|8.704561,49.403252,8.743966,49.414,8.703,49.4144,8.712,49.42124,8.704561,49.403252")
				.queryParam("timeout", "66")
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
	public void test_qxqjtfd9iaeo_count2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway and not geometry:line and area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "8.704561,49.403252,8.702,49.416,8.710,49.435,8.7367,49.4276,8.704561,49.403252")
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
	public void test_rhm3yutv3w4k_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "barrier=* and area:(1.0 .. 1E6)")
				.queryParam("bboxes", "nMt:8.68576,49.4141,8.7582,49.380")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("timeout", "71")
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
	public void test_uve68gp4taaq_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("time", "//P3Y1M16D")
				.queryParam("timeout", "39")
				.queryParam("bcircles", "YExVB:8.717,49.432,7")
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
	public void test_t4vno5wzvozd_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "turning_circle")
				.queryParam("showMetadata", "true")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"BCgWm\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7060,49.422],[8.706,49.432],[8.7468,49.43466],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"rlhx\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.737496,49.426],[8.7038,49.4376],[8.715,49.4102],[8.704561,49.403252]]]}}]}")
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
	public void test_1hr84v8s3d3cl_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "maxspeed!=* or type:node and id:(1 .. 9999)")
				.queryParam("bboxes", "8.67248,49.409,8.72746,49.380")
				.queryParam("format", "json")
				.queryParam("time", "//P12D")
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
	public void test_1hvbjmajq0sac_count3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "addr:country!=* or geometry:point and area:(1.0 .. 1E6)")
				.queryParam("time", "//P1Y18D")
				.queryParam("bcircles", "8.7332,49.401,5")
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
	public void test_s4rvqrr4cxtf_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype!=* or geometry:line and length:( .. 100)")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
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
	public void test_skxw35ajwa5f_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "building=* and geometry:line or area:(1.0 .. 1E6)")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y6D")
				.queryParam("bpolys", "vP:8.704561,49.403252,8.718,49.4053,8.712,49.4207,8.700133,49.43022,8.704561,49.403252")
				.queryParam("timeout", "30")
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
	public void test_qxl305c17uqq_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P6M5D")
				.queryParam("bcircles", "8.718,49.4384,4")
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
	public void test_qxnurv8pouar_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("time", "//P14D")
				.queryParam("bpolys", "c:8.704561,49.403252,8.712,49.430,8.719,49.428,8.746,49.408,8.704561,49.403252|Q:8.704561,49.403252,8.72492,49.420,8.719,49.432,8.705249,49.418,8.704561,49.403252|i:8.704561,49.403252,8.741787,49.409,8.7356,49.433,8.70318,49.422,8.704561,49.403252")
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
	public void test_sopn0c19tz6s_countDensity2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "XTME:8.65069,49.4223,8.746,49.382")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "77")
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
	public void test_1ibbgujzm8svm_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Aj:8.66949,49.416302,8.7194,49.3848|L:8.6977,49.42031,8.75634,49.396|A:8.68961,49.4186,8.7397,49.389")
				.queryParam("values", "residential")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P1Y3M28D")
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
	public void test_uvbfy8hqjvqb_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "smoothness!=* and not length:( .. 100)")
				.queryParam("format", "geojson")
				.queryParam("timeout", "35")
				.queryParam("bcircles", "8.7022,49.430198,9")
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
	public void test_ts2ggs9i7ski_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.672,49.414,8.7456,49.386")
				.queryParam("keys", "highway")
				.queryParam("values", "path")
				.queryParam("format", "csv")
				.queryParam("time", "//P11M4D")
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
	public void test_vf995wbkws34_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("bpolys", "r:8.704561,49.403252,8.71541,49.42153,8.703,49.415,8.727,49.428,8.704561,49.403252|EWz:8.704561,49.403252,8.704703,49.41548,8.747,49.40625,8.746,49.4274,8.704561,49.403252")
				.queryParam("timeout", "56")
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
	public void test_rlb6bkzgdn4x_countDensity3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or geometry:polygon or length:( .. 100)")
				.queryParam("bboxes", "Z:8.673607,49.412,8.724066,49.395|CdpaP:8.665,49.411,8.703454,49.386|ARm:8.6883,49.411,8.756,49.392")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "true")
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
	public void test_1h7z9m17y9ru9_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "o:8.686259,49.4292,8.70755,49.395")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("bpolys", "8.704561,49.403252,8.7465,49.4209,8.700,49.404649,8.7015,49.43721,8.704561,49.403252|8.704561,49.403252,8.7143,49.412,8.70371,49.42770,8.70809,49.412540,8.704561,49.403252|8.704561,49.403252,8.715,49.401,8.74336,49.424,8.726,49.4020,8.704561,49.403252")
				.queryParam("timeout", "85")
				.queryParam("bcircles", "8.728,49.4341,7|8.711,49.424278,3")
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
	public void test_1iyhrq57873u9_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.694,49.40145,8.756,49.399|8.699871,49.4298,8.71253,49.3939")
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
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
	public void test_soel5r096q8y_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "turn=* or area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "//P5M14D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"g\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.739,49.401379],[8.72081,49.426],[8.7208,49.406],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Fd\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7204,49.410],[8.704562,49.43409],[8.714698,49.437],[8.704561,49.403252]]]}}]}")
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
	public void test_1hv37wpkote7o_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "pJstb:8.68284,49.4007,8.711,49.3981")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P1M24D")
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
	public void test_1hbis12kw046v_countDensityGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "avn:8.6627,49.4118,8.746783,49.3819|uR:8.6829,49.4039,8.7502,49.381")
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2M15D")
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
	public void test_r1g4k4exbl9d_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "highway!=* and id:(1 .. 9999)")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2Y11M12D")
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
	public void test_t4nwma1xm0yu_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("time", "//P2M24D")
				.queryParam("bpolys", "8.704561,49.403252,8.717,49.430045,8.73253,49.43511,8.703,49.4360,8.704561,49.403252")
				.queryParam("timeout", "77")
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
	public void test_rkxacray9ph5_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "secondary")
				.queryParam("time", "//P8M6D")
				.queryParam("bcircles", "ML:8.741,49.401,7|j:8.72886,49.438,1")
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
	public void test_1iukvntrw8rj7_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes!=* or type:relation or not id:(1 .. 9999)")
				.queryParam("format", "geojson")
				.queryParam("time", "//P6M10D")
				.queryParam("bcircles", "8.7133,49.4223,8|8.711,49.42852,73")
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
	public void test_u8dgsfij6q8z_countDensityGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or geometry:line")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "w:8.7342,49.4005,7")
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
	public void test_qeexnedw8vg9_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and not length:( .. 100)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P1Y7M2D")
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
	public void test_rl2eb2ndvho6_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "foot!=* and type:way")
				.queryParam("groupByValues", "residential")
				.queryParam("bboxes", "W:8.660,49.401,8.728,49.388|YOO:8.691408,49.425,8.7264,49.393|sdI:8.694,49.401,8.7534,49.381")
				.queryParam("keys", "highway")
				.queryParam("bpolys", "rzM:8.704561,49.403252,8.7212,49.4164,8.700530,49.411,8.7015,49.413,8.704561,49.403252")
				.queryParam("timeout", "22")
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
	public void test_socbbdsme4ip_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "unclassified,track")
				.queryParam("bboxes", "UU:8.663,49.409,8.72531,49.394|IZVjV:8.67325,49.4086,8.7313,49.38719")
				.queryParam("groupByKey", "building")
				.queryParam("timeout", "25")
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
	public void test_1hux6ibjhr60m_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "chapel")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"UHV\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.4121],[8.709,49.42867],[8.704,49.427516],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "84")
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
	public void test_1ibhjw0zkitlv_countDensityGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary,secondary_link,garage")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("bcircles", "8.730,49.409,8")
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
	public void test_1jig1pgvgfr5h_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref=* and geometry:line or id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("timeout", "46")
				.queryParam("bcircles", "8.740,49.414,4|8.7164,49.416,6|8.728,49.4191,9")
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
	public void test_1ib0eltn8psu0_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit=* or id:(1 .. 9999)")
				.queryParam("groupByValues", "speed_camera")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"YVoWt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702205,49.4360],[8.70676,49.421],[8.709,49.411],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "78")
				.queryParam("bcircles", "up:8.733,49.4389,7|MG:8.7339,49.435836,6")
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
	public void test_rhlm1va9xnw9_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("timeout", "57")
				.queryParam("bcircles", "8.70617,49.409,6")
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
	public void test_rhtwl7075rg3_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lit!=* and not type:node or id:(1 .. 9999)")
				.queryParam("groupByKey", "building")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P7M8D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"KTb\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.714,49.428086],[8.701,49.40832],[8.70310,49.409],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"nbq\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7076,49.4345],[8.736,49.40716],[8.700,49.41871],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"L\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.749296,49.41739],[8.7072,49.408],[8.7439,49.420],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "98")
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
	public void test_1k1tyn9ynyvqt_countDensityGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "uE:8.739,49.405,82")
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
	public void test_sohevvx7thdj_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P9M15D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HI\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.746,49.425],[8.73853,49.402],[8.73084,49.404],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "pc:8.7150,49.4362,7|CPnB:8.7442,49.400107,6")
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
	public void test_uvjo5t0u6986_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=* or type:way")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "VR:8.736,49.428,821130981")
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
	public void test_1jydsla1mpc1e_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "79")
				.queryParam("bcircles", "wY:8.723,49.42392,2")
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
	public void test_t4cc1vyy8gtw_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "P:8.684,49.403,8.708,49.3843")
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y2M1D")
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
	public void test_s1h7d6k1d3cn_countDensityGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P5M23D")
				.queryParam("bpolys", "yx:8.704561,49.403252,8.726,49.4106,8.70187,49.419,8.7174,49.432,8.704561,49.403252|bD:8.704561,49.403252,8.714,49.4326,8.704,49.438645,8.7109,49.434,8.704561,49.403252")
				.queryParam("timeout", "54")
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
	public void test_s4msk8qh4pyd_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "primary_link")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P2Y1D")
				.queryParam("timeout", "33")
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
	public void test_1hbfyrh6huogx_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.6529,49.429847,8.72844,49.385|8.689,49.4093,8.755,49.3912")
				.queryParam("keys", "highway")
				.queryParam("values", "stop_line")
				.queryParam("format", "csv")
				.queryParam("time", "//P4M27D")
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
	public void test_r1lo1l6bnp6h_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "ps:8.68608,49.420319,8.708,49.387")
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "yes")
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
	public void test_r17ag7gwq34z_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "pedestrian")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P3Y7M11D")
				.queryParam("bpolys", "WwvAZ:8.704561,49.403252,8.702,49.419,8.70388,49.418,8.705,49.413,8.704561,49.403252|j:8.704561,49.403252,8.7310,49.42765,8.743,49.4352,8.72278,49.416,8.704561,49.403252")
				.queryParam("timeout", "35")
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
	public void test_1jeo9wx8ihtgj_countDensityGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "geojson")
				.queryParam("time", "//P2Y9M1D")
				.queryParam("bpolys", "z:8.704561,49.403252,8.7457,49.4368,8.7216,49.419,8.725297,49.411,8.704561,49.403252")
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
	public void test_r1g4voq5tz6s_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "56")
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
	public void test_1iv9v4dsrbwpy_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.422,8.733,49.388|8.68420,49.4173,8.742,49.3912")
				.queryParam("keys", "highway")
				.queryParam("values", "primary")
				.queryParam("time", "//P1Y27D")
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
	public void test_t4hvzoqo7bza_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("format", "csv")
				.queryParam("bcircles", "8.73952,49.4370,3|8.7060,49.4307,5")
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
	public void test_1h84u0nakkrp0_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("time", "//P1Y11M1D")
				.queryParam("bcircles", "8.72400,49.406,98")
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
	public void test_vf6zbneq4185_countGroupByBoundary2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "oneway=* or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "YtStr:8.670,49.414,8.7413,49.387")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P28D")
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
	public void test_1jer2jnuqu59z_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "ref!=* and not type:node")
				.queryParam("bboxes", "jc:8.686,49.418,8.708,49.3993|p:8.695,49.412,8.748,49.393|E:8.689,49.429,8.73037,49.391983|o:8.695,49.426,8.72152,49.3982")
				.queryParam("values", "tertiary")
				.queryParam("time", "//P2Y1M5D")
				.queryParam("timeout", "52")
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
	public void test_u85698f1d6wp_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.690,49.4225,8.751,49.3959|8.683,49.402656,8.755291,49.3947|8.691,49.42805,8.710,49.3966")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("showMetadata", "true")
				.queryParam("timeout", "58")
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
	public void test_u8di1feos08p_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("time", "//P11M6D")
				.queryParam("timeout", "80")
				.queryParam("bcircles", "8.709377,49.434,74")
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
	public void test_1h7rh00hlcs36_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("format", "json")
				.queryParam("time", "//P2Y8M9D")
				.queryParam("bpolys", "8.704561,49.403252,8.7481,49.408,8.7098,49.4262,8.7011,49.405,8.704561,49.403252")
				.queryParam("timeout", "28")
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
	public void test_qe9cv2yhmjox_countGroupByBoundary3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P27D")
				.queryParam("bpolys", "Wnzol:8.704561,49.403252,8.749,49.428,8.73629,49.423,8.7452,49.413,8.704561,49.403252|Z:8.704561,49.403252,8.718,49.4298,8.7084,49.411356,8.7045,49.400,8.704561,49.403252|Ck:8.704561,49.403252,8.7408,49.412822,8.710430,49.400186,8.703,49.4051,8.704561,49.403252")
				.queryParam("timeout", "31")
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
	public void test_s0xs8jwvwm04_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.650,49.401,8.7151,49.3832|8.6630,49.41733,8.749971,49.384656")
				.queryParam("keys", "highway")
				.queryParam("values", "speed_camera")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P3Y2M20D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"Pdoi\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.741,49.437],[8.73984,49.4162],[8.7044,49.4288],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "name,sidewalk")
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
	public void test_s507x5rg4vue_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "landuse!=* and id:(1 .. 9999)")
				.queryParam("values", "stop")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P1Y11M2D")
				.queryParam("bpolys", "8.704561,49.403252,8.706,49.405,8.739021,49.409,8.72418,49.418,8.704561,49.403252|8.704561,49.403252,8.729,49.4088,8.70454,49.4233,8.736,49.4280,8.704561,49.403252|8.704561,49.403252,8.731,49.434,8.704554,49.4041,8.7322,49.431,8.704561,49.403252")
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
	public void test_1k201ofhp3q5u_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("timeout", "20")
				.queryParam("groupByKeys", "landuse,barrier")
				.queryParam("bcircles", "sY:8.723,49.40917,27|y:8.746078,49.409,60")
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
	public void test_rkwuax31efcj_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "cycleway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P11D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"H\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.702,49.427456],[8.702296,49.421537],[8.704115,49.415],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"tVQaj\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7412,49.433],[8.703236,49.4259],[8.7047,49.40985],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"P\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.738,49.403],[8.723648,49.423],[8.715835,49.42315],[8.704561,49.403252]]]}}]}")
				.queryParam("groupByKeys", "ref,maxspeed")
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
	public void test_t81bl9wmbak9_countGroupByKey2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "true")
				.queryParam("groupByKeys", "highway,network,addr:city")
				.queryParam("bcircles", "8.709759,49.4259,2|8.717,49.4007,1|8.73587,49.424,9|8.7186,49.430449,3563021524")
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
	public void test_qxns4g4ekth0_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "network!=* and id:(1 .. 9999)")
				.queryParam("bboxes", "8.655386,49.427,8.7485,49.3838")
				.queryParam("values", "primary_link")
				.queryParam("showMetadata", "yes")
				.queryParam("groupByKeys", "turn:lanes,type,turn")
				.queryParam("bcircles", "8.713,49.4038,288531832")
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
	public void test_skvmy3lrfjug_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "8.683797,49.417,8.7359,49.3982")
				.queryParam("values", "secondary_link")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P2Y2M24D")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"TCRAp\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.722028,49.415],[8.715,49.43199],[8.729,49.41130],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"M\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.716,49.405],[8.742,49.400],[8.703,49.4072],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "84")
				.queryParam("bcircles", "telS:8.7254,49.412,9")
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
	public void test_urv6xim9cqcl_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "no")
				.queryParam("groupByKeys", "addr:postcode,destination")
				.queryParam("bcircles", "vlMVR:8.7201,49.4060,6")
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
	public void test_ubon3fpks08k_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "service")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"HbXac\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.731,49.436438],[8.728,49.42226],[8.729,49.431],[8.704561,49.403252]]]}}]}")
				.queryParam("timeout", "31")
				.queryParam("groupByKeys", "addr:housenumber,turn:lanes,oneway")
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
	public void test_rhofrmseg65x_countGroupByKey3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("values", "bus_stop")
				.queryParam("time", "//P8M16D")
				.queryParam("bpolys", "Wlb:8.704561,49.403252,8.74851,49.405,8.7147,49.4039,8.70963,49.420251,8.704561,49.403252|u:8.704561,49.403252,8.701,49.402,8.7379,49.434,8.70492,49.425019,8.704561,49.403252")
				.queryParam("groupByKeys", "addr:street,lanes,oneway")
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
	public void test_1k1r6v6lt6f5f_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "footway,service")
				.queryParam("filter", "natural=wood or area:(1.0 .. 1E6)")
				.queryParam("bboxes", "Opy:8.6877,49.4010,8.7211,49.38387|Um:8.6825,49.423,8.7194,49.396")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "geojson")
				.queryParam("bcircles", "DXio:8.713,49.417675,4")
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
	public void test_rhgmdildbjnd_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "tracktype=* or not geometry:polygon and id:(1 .. 9999)")
				.queryParam("groupByValues", "street_lamp")
				.queryParam("keys", "highway")
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P4D")
				.queryParam("timeout", "33")
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
	public void test_1k1wr4jacv96g_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "secondary_link,cycleway")
				.queryParam("bboxes", "mM:8.656433,49.411,8.7189,49.387|LB:8.69350,49.4224,8.7352,49.385013|pMn:8.664151,49.403082,8.751,49.387|zSLUm:8.674,49.414,8.739,49.3944")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P2M2D")
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
	public void test_qxwn8v47vbco_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "chapel,public")
				.queryParam("groupByKey", "highway")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("showMetadata", "yes")
				.queryParam("time", "//P19D")
				.queryParam("timeout", "43")
				.queryParam("bcircles", "WXwkd:8.7006,49.407834,6|QFy:8.7373,49.4113,4")
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
	public void test_qxi9qngy2jqa_countGroupByTag2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("showMetadata", "false")
				.queryParam("time", "//P2M27D")
				.queryParam("bpolys", "8.704561,49.403252,8.700,49.4202,8.732730,49.420,8.717401,49.431,8.704561,49.403252|8.704561,49.403252,8.733,49.4322,8.72558,49.414,8.734,49.4030,8.704561,49.403252|8.704561,49.403252,8.735,49.432,8.709,49.406850,8.704266,49.425,8.704561,49.403252")
				.queryParam("timeout", "100")
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
	public void test_ts4px7zcx25v_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "emergency_access_point,residential")
				.queryParam("filter", "ref!=* and geometry:point and id:(1 .. 9999)")
				.queryParam("groupByKey", "highway")
				.queryParam("format", "csv")
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
	public void test_us3imxp1e25g_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByValues", "bus_stop,tower")
				.queryParam("bboxes", "r:8.6780,49.411,8.745073,49.385")
				.queryParam("values", "stop_line")
				.queryParam("showMetadata", "yes")
				.queryParam("bpolys", "{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{\"id\":\"wt\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.74726,49.438812],[8.705,49.415],[8.7415,49.411],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"Qwy\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.73036,49.422],[8.7325,49.426],[8.7045,49.4286],[8.704561,49.403252]]]}},{\"type\":\"Feature\",\"properties\":{\"id\":\"C\"},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[8.704561,49.403252],[8.7205,49.430],[8.721,49.41413],[8.7272,49.403218],[8.704561,49.403252]]]}}]}")
				.queryParam("bcircles", "pg:8.7204,49.43809,3|z:8.7282,49.404,2")
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
	public void test_1iycpbqcz8vug_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "R:8.659,49.406,8.727,49.3883")
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "crossing")
				.queryParam("format", "geojson")
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
	public void test_1hvb0wuw9mpgm_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "give_way")
				.queryParam("format", "json")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y1M1D")
				.queryParam("bpolys", "ElF:8.704561,49.403252,8.720880,49.438,8.70383,49.413,8.725,49.417,8.704561,49.403252")
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
	public void test_vey3cfih9x6d_countGroupByTag3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("groupByKey", "building")
				.queryParam("keys", "highway")
				.queryParam("values", "emergency_access_point")
				.queryParam("time", "//P1Y1M24D")
				.queryParam("bpolys", "8.704561,49.403252,8.739,49.430913,8.7044,49.4005,8.729,49.423533,8.704561,49.403252|8.704561,49.403252,8.715,49.424,8.707,49.400,8.7166,49.419,8.704561,49.403252|8.704561,49.403252,8.717,49.413382,8.72382,49.418,8.719,49.420,8.704561,49.403252")
				.queryParam("timeout", "29")
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
	public void test_1hravuw2kba5s_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "source:maxspeed!=*")
				.queryParam("bboxes", "m:8.676,49.4297,8.741,49.386")
				.queryParam("keys", "highway")
				.queryParam("timeout", "77")
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
	public void test_1iepyt0kg1hrm_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "lanes:backward!=* and type:way or not area:(1.0 .. 1E6)")
				.queryParam("format", "json")
				.queryParam("time", "//P15D")
				.queryParam("bcircles", "kZPb:8.704210,49.4185,1")
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
	public void test_qdqibesrf8f8_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "BrlTb:8.683,49.4283,8.725200,49.392")
				.queryParam("keys", "highway")
				.queryParam("values", "elevator")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y5M6D")
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
	public void test_trrcz3x8shnp_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("format", "csv")
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "8.721350,49.432524,9|8.702,49.4111,62")
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
	public void test_sof46edum82t_countGroupByType2() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("bboxes", "Y:8.68323,49.42899,8.751,49.385|pLBL:8.655,49.421,8.702,49.385487|mtQn:8.6830,49.4220,8.742,49.381|U:8.684,49.411,8.716451,49.3998")
				.queryParam("format", "json")
				.queryParam("time", "//P1Y1M8D")
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
	public void test_urund0o3m1pw_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "name=* or type:node")
				.queryParam("values", "track")
				.queryParam("format", "geojson")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y1M5D")
				.queryParam("bcircles", "dPVWd:8.740,49.427680,6")
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
	public void test_u8apvihie6uq_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("bpolys", "QU:8.704561,49.403252,8.715,49.414,8.704,49.43163,8.725,49.427,8.704561,49.403252|u:8.704561,49.403252,8.7306,49.430,8.740,49.426,8.715317,49.403,8.704561,49.403252|dFnm:8.704561,49.403252,8.714,49.4148,8.7079,49.432,8.710,49.4270,8.704561,49.403252")
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
	public void test_rhlmfuqt9e0h_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("showMetadata", "false")
				.queryParam("bcircles", "f:8.725,49.409645,6|i:8.7380,49.411,9|X:8.745,49.43360,9|fz:8.7273,49.4154,703601444")
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
	public void test_ts2fde05qm3l_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("keys", "highway")
				.queryParam("showMetadata", "true")
				.queryParam("time", "//P6M1D")
				.queryParam("timeout", "31")
				.queryParam("bcircles", "8.713,49.430,3")
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
	public void test_1jetcrxvqfpeu_countGroupByType3() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("filter", "service=driveway")
				.queryParam("bboxes", "V:8.6782,49.429,8.756,49.389|Q:8.676456,49.401,8.706,49.398")
				.queryParam("showMetadata", "no")
				.queryParam("time", "//P3Y9D")
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
