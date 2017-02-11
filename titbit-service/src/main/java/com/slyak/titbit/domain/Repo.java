package com.slyak.titbit.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Post repositories.
 *
 * @author stormning on 2016/12/9.
 */
@Data
@Document
public class Repo {
	String url;

	String pattern;
}
