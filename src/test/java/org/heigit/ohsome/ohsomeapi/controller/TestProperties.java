package org.heigit.ohsome.ohsomeapi.controller;

/** Holds the test properties, which are provided as system properties. */
public class TestProperties {

  public static final String DB_FILE_PATH_PROPERTY = "--database.db=./src/main/resources/heidelberg.oshdb.mv.db";
  public static final String PORT1 = "8081";
  public static final String PORT2 = "8082";
  public static final String PORT3 = "8083";
  public static final String JUNIT = System.getProperty("junit");
  public static final String INTEGRATION = System.getProperty("integration");
  public static final String SERVER = "http://localhost:";
}
