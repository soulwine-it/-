package org.zerock.domain;

import lombok.Data;

// Lombok의 @Data를 이용하게 되면 getter/setter, equals(), toString() 등의 메서드를 자동 생성하기 때문에 편리합니다.
@Data
public class SampleDTO {

	private String name;
	private int age;
}
