package io.reactivesw.catalog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this is the starter of project.
 * @author Davis
 *
 */
@SpringBootApplication
// @EnableConfigurationProperties({ApplicationConfig.class})
public class Application {
  /**
   * the main method.
   * @param args - args
   */
  public static void main(final String[] args) {
    SpringApplication app = new SpringApplication(Application.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }
}
