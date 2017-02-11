package com.slyak.titbit.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Post.
 *
 * @author stormning on 2016/12/9.
 */
@Data
@Document
public class Post {
	String title;

	String content;

	String[] tags;

	SourceType type = SourceType.DEFAULT;

}