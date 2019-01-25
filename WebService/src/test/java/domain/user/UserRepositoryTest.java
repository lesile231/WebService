package domain.user;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import domain.user.common.AbstractSpringTest;
import kr.lesile.practice.domain.user.LesileUser;
import kr.lesile.practice.domain.user.UserRepository;


public class UserRepositoryTest extends AbstractSpringTest{
	
	@Autowired
	UserRepository userRepository;
	
	@Configuration
    static class ContextConfiguration { }


    @After
    public void cleanup() {
        /** 
        이후 테스트 코드에 영향을 끼치지 않기 위해 
        테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
        **/
    		this.userRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
	    	this.userRepository.save(LesileUser.builder()
	                .userName("Lee")
	                .userDesc("Lesile")
	                .sub_type("Admin")
	                .build());

        //when
        List<LesileUser> postsList = (List<LesileUser>) this.userRepository.findAll();

        //then
        LesileUser user = postsList.get(0);
        assertThat(user.getUserName(), is("Lee"));
        assertThat(user.getUserDesc(), is("Lesile"));
    }
}
