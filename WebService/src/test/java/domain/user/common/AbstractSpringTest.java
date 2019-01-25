package domain.user.common;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.lesile.practice.WebServiceApplication;

/**
 * 테스트 진행 시,
 * WebServiceApplication이 없어서, Repository @Autowired가 정상적으로 안되는 상황을 방지하기 위한 기본 테스트 추상화 클래스
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebServiceApplication.class)
@ActiveProfiles("test")
@WebAppConfiguration
public abstract class AbstractSpringTest {
	
}
