package kr.lesile.practice.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDTO {

	private String userName;
    private String userDesc;
    private String sub_type;

    public LesileUser toEntity() {
        return LesileUser.builder()
                .userName("Lee")
                .userDesc("Lesile")
                .sub_type("Admin")
                .build();
    }
	
}
