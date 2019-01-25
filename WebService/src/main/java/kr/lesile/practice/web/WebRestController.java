package kr.lesile.practice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lesile.practice.domain.user.UserRepository;
import kr.lesile.practice.domain.user.UserRequestDTO;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

	private UserRepository userRepository;
	
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
    @PostMapping("/users")
    public void saveUser(UserRequestDTO dto) {
    		this.userRepository.save(dto.toEntity());
    }
}
