package kr.lesile.practice.domain.user;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class LesileUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(length = 50, nullable = false)
    private String userName;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String userDesc;

    @Column
    private String sub_type;
    
    @Builder
    public LesileUser(String userName, String userDesc, String sub_type) {
        this.userName = userName;
        this.userDesc = userDesc;
        this.sub_type = sub_type;
    }
}
