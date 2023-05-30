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
 	email_id VARCHAR(500) NOT NULL,
    user_name VARCHAR(100) NOT NULL,
    gender VARCHAR(50) NOT NULL
);

 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsersVO {
	private String emailId;
	private String userName;
	private String gender;
}
