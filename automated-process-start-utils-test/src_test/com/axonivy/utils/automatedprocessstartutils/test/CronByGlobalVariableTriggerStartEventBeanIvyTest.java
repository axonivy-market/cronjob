package com.axonivy.utils.automatedprocessstartutils.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.environment.IvyTest;
import ch.ivyteam.ivy.scripting.objects.DateTime;

/**
 * This UnitTest is testing the demo process.
 */
@IvyTest
public class CronByGlobalVariableTriggerStartEventBeanIvyTest {

	@Test
	public void testCronJongStarted() throws Exception {
		TimeUnit.SECONDS.sleep(5);
		
		Path demoLog = Paths.get(System.getProperty("java.io.tmpdir"), "Demo.log");
		assertThat(Files.exists(demoLog)).as("{0} does not exist", demoLog).isTrue();
		assertThat(Files.isReadable(demoLog)).as("{0} is not readable", demoLog).isTrue();
		
		String demoStartTime = Files.readString(demoLog).trim();
		assertThat(demoStartTime).as("{0} is empty", demoLog).isNotBlank();
		
		DateTime startTime = new DateTime(demoStartTime);
		assertThat(startTime).as("Cron job did not started").isNotNull();
		assertThat(startTime).as("Cron job did not started in the past").isLessThan(new DateTime());
	}

}