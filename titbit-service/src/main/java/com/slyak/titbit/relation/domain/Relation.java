package com.slyak.titbit.relation.domain;

import com.slyak.support.jpa.JsonConverter;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * .
 *
 * @author stormning 2018/1/21
 * @since 1.3.0
 */
@Data
@Entity
@Table(name = "t_relation")
public class Relation extends AbstractAuditable<Long, Long> {

    private Long ownerId;

    private int bizType;

    @Convert(converter = JsonConverter.class)
    private List<String> relation;
}
