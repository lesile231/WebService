package kr.lesile.practice.domain.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<LesileUser, Long> {
	
}
