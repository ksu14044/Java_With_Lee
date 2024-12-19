package chapter17.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Getter
public class Reservation {
    // 각 예약이 가지는 고유한 id 값
    private final String reservationId;
    // 예약자 정보
    private final String userId;
    private final Date reservationTime;

    // 초기값 설정
    // : 해당 예약의 활성화 상태를 저장
    // - true : 에약 완료
    // - false : 예약 취소
    private boolean isActive = true; // 초기값 설정

    // 필드값을 바로 바꿀 수 있게 하기 위해서
    public void cancel() {
        this.isActive = false;
    }
    @Override
    public String toString() {
        String isActiveMessage = isActive ? "예약 중" : "예약 취소" ;

        return "[ 예약 ID : " +reservationId + "사용자 ID : " + userId + "예약 일자 : " + reservationTime + "예약 상태 : " + isActive + " ]";
    }
}
