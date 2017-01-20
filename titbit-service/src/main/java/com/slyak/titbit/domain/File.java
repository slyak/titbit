package com.slyak.titbit.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * .
 *
 * @author stormning on 2016/12/12.
 */
@Data
@Entity
@Table(name = "t_file")
public class File extends AbstractAuditable<Long, Long> {

}
