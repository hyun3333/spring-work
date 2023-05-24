package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 CREATE TABLE jdbc_board(
	board_no INT PRIMARY KEY AUTO_INCREMENT,
    writer VARCHAR(30) NOT NULL,
    title VARCHAR(100) NOT NULL,
    content VARCHAR(2000),
    reg_date DATETIME DEFAULT CURRENT_TIMESTAMP
); 
 */
@Getter 
@Setter
@ToString
public class FreeBoardVO {

	private int bno;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	
	// �ϳ��� �Խù��� �� ���� ����� �����ϴ°��� ���� ��.
	private int replyCnt;
	
}
