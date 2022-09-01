package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

import java.time.LocalDate;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){                       //모든 테스트 전에 TodoDAO객체를 생성
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception{  // TOdoDAO에 작성한 getTime() 작동 확인
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Title...")
                .dueDate(LocalDate.of(2021,12,31))
                .build();

        todoDAO.insert(todoVO);
    }
}