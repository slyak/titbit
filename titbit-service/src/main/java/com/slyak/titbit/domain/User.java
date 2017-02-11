package com.slyak.titbit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * .
 *
 * @author stormning on 2016/12/9.
 */
@NoArgsConstructor
@Data
@Document
public class User {

	@Id String id;

	String name;
}
