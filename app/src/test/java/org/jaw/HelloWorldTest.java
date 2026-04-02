package org.jaw;

import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class HelloWorldTest {

  @Test
  public void helloWorldTest() {
    Log.info("Hello Test World!");
  }
}
