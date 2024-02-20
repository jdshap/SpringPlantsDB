package io.github.jdshap.plants;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PlantsApplicationTests {

	@Autowired
	private PlantsApplication app;

	@Test
	void contextLoads() {
		assertThat(app).isNotNull();
	}

}
