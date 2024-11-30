//package com.google.calculator.test;
//
//import org.jbehave.core.configuration.Configuration;
//import org.jbehave.core.io.StoryResource;
//import org.jbehave.core.junit.JUnitStories;
//import org.jbehave.core.steps.InjectableStepsFactory;
//import org.jbehave.core.steps.InstanceStepsFactory;
//
//import java.util.List;
//
//public class GoogleCalculatorJBehaveRunner extends JUnitStories {
//
//    public GoogleCalculatorJBehaveRunner() {
//        // Link the step definitions to the story file
//        this.candidateSteps.add(new InstanceStepsFactory(configuration(), new GoogleCalculatorJBehaveSteps()));
//    }
//
//    @Override
//    protected List<String> storyPaths() {
//        // Story file is located in 'src/test/resources'
//        return List.of("src/test/resources/calculator.story");
//    }
//
//    @Override
//    public Configuration configuration() {
//        return new org.jbehave.core.configuration.Configuration();
//    }
//}
