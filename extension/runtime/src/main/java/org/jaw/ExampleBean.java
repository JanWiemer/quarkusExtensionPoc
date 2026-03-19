package org.jaw;


import io.quarkus.logging.Log;
import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class ExampleBean {

  @PostConstruct
  void onStart() {
    Log.info("Hello world from Extension!");
  }

}