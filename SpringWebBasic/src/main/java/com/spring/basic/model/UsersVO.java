package com.spring.basic.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
  CREATE TABLE users (
 	user_id VARCHAR(30) NOT NULL,
    user_pw VARCHAR(1000) NOT NULL,
    user_name VARCHAR(100) NOT NULL,
    user_email1 VARCHAR(100) NOT NULL,
    user_email2 VARCHAR(100) NOT NULL,
    user_phone int
);
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsersVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail1;
	private String userEmail2;
	private int userPhone;
}
