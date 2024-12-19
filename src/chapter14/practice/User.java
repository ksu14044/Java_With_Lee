package chapter14.practice;

// 사용자 객체 정의

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Builder
public class User {
        private Long id; // 사용자 데이터의 구분값
        private String userId;
        private String password;
        private String userName;
        private String email;
        private String phone;
        private String nickname;
        private Date signUpDate; // 회원가입 날짜
}
