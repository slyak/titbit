package com.slyak.titbit.article.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * .
 *
 * @author stormning 2018/1/20
 * @since 1.3.0
 */
@Entity
@Table(name = "t_article")
@Data
public class Article extends AbstractAuditable<Long, Long> {

    private String title;

}