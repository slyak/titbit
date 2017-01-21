package com.slyak.titbit.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Table;

/**
 * Post repositories.
 *
 * @author stormning on 2016/12/9.
 */
@Data
//@Entity
@Table(name = "t_repo")
public class Repo extends AbstractAuditable<Long, Long> {
	String url;

	String pattern;
}
