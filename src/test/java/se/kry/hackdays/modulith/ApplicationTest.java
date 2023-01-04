package se.kry.hackdays.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.model.ApplicationModules;

@SpringBootTest
class ApplicationTest {

  @Test
  void contextLoads() {
    var modules = ApplicationModules.of(Application.class).verify();

    new Documenter(modules)
        .writeModulesAsPlantUml()
        .writeIndividualModulesAsPlantUml();
  }

}
