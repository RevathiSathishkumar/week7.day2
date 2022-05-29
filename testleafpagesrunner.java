package runner;



import io.cucumber.testng.CucumberOptions;
import steps.hooksimplementations;

@CucumberOptions(features= {"src/test/java/features/createlead.feature",
                  "src/test/java/features/deletelead.feature",
                  "src/test/java/features/duplicatelead.feature",
                  "src/test/java/features/editlead.feature",
                  "src/test/java/features/mergelead.feature",},
                 glue="steps",
                 publish=true,
                 monochrome=true,
                 tags= "@smoke and @sanity"
                 )
public class testleafpagesrunner extends hooksimplementations {
	
}
