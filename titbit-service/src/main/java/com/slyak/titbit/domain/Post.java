package com.slyak.titbit.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Post.
 *
 * @author stormning on 2016/12/9.
 */
@Data
@Entity
@Table(name = "t_post")
public class Post extends AbstractAuditable<Long, Long> {
	String title;

	String content;

	String[] tags;

	SourceType type = SourceType.DEFAULT;

}