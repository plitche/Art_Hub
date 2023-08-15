package com.artHub;

import com.artHub.sample.SampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ArtHubApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private SampleService sampleService;

	@Test
	void contextLoads() {
	}

	@Test
	void sampleTest() throws Exception {
		List<String> expectedUsers = Arrays.asList("User1", "User2", "User3");

		// 모의 데이터 반환 설정
		when(sampleService.findUsers()).thenReturn(expectedUsers);

		mockMvc.perform(get("/sample"))
				.andExpect(status().isOk())
				.andExpect(content().json("[\"User1\", \"User2\", \"User3\"]"));
	}
}
