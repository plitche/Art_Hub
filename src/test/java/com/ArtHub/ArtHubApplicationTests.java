package com.artHub;

import com.artHub.sample.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ArtHubApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private SampleService sampleService;

	@Test
	void contextLoads() {
	}

	@Test
	void sampleTest() throws Exception {
		// API 엔드포인트에 대한 GET 요청을 생성하고 응답을 확인합니다.
		ResultActions resultActions = mockMvc.perform(get("/sample"));

		// 응답 상태 코드를 확인합니다. (예: 200 OK)
		resultActions.andExpect(status().isOk());

		// 응답 본문 내용을 확인합니다.
		resultActions.andExpect(content().contentType("application/json")); // JSON 응답인 경우

		// 추가적인 검증을 수행할 수 있습니다.
		// 예: JSON 응답의 특정 필드 값 확인
		resultActions.andExpect(jsonPath("$.listField", hasSize(3)));
	}

	@Test
	void sampleSampleTest() {
		// when
		List<String> users = sampleService.findUsers();

		// then
		Assertions.assertTrue(users.contains("plitche"));
		Assertions.assertEquals(3, users.size());
	}
}
