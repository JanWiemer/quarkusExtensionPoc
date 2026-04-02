package org.jaw;

import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@QuarkusTest
public class HelloWorldTest {

  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Test
  public void helloWorldTest() {
    Log.info("INFO Hello Test World!");
    log.info("INFO Hello World via SLF4J!");
    Log.warn("WARN Hello Test World!");
    log.warn("WARN Hello World via SLF4J!");
    Log.error("ERROR Hello Test World!");
    log.error("ERROR Hello World via SLF4J!");
  }
}
