package org.zerock.jdbcex.domain;

import lombok.Builder;         // 객체 생성시 빌더 패턴 이용
import lombok.Getter;          // 주로 읽기 전용으로 사용
import lombok.ToString;

import java.time.LocalDate;

@Builder
@Getter
@ToString
public class TodoVO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}