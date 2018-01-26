package com.slyak.titbit.dict.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * .
 *
 * @author stormning 2018/1/21
 * @since 1.3.0
 */
@Entity
@Table(name = "t_dict", uniqueConstraints = @UniqueConstraint(columnNames = "code"))
@Data
public class Dict extends AbstractAuditable<Long, Long> {
    private String code;
    private String name;
}