package com.slyak.support.jpa;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.core.GenericTypeResolver;

import javax.persistence.AttributeConverter;
import java.util.List;

/**
 * .
 *
 * @author stormning 2018/1/24
 * @since 1.3.0
 */
public class JsonConverter<T> implements AttributeConverter<T, String> {

    private Class<T> generic;

    @SuppressWarnings("unchecked")
    public JsonConverter() {
        this.generic = (Class<T>) GenericTypeResolver.resolveTypeArguments(this.getClass(), JsonConverter.class)[0];
    }

    @Override
    @SneakyThrows
    public String convertToDatabaseColumn(T attribute) {
        return attribute == null ? null : JSON.toJSONString(attribute);
    }

    @Override
    @SneakyThrows
    public T convertToEntityAttribute(String dbData) {
        return dbData == null ? null : JSON.parseObject(dbData, generic);
    }

    public static void main(String[] args) {
        JsonConverter<List<String>> converter = new JsonConverter<List<String>>() {
        };
        System.out.println(converter.convertToDatabaseColumn(converter.convertToEntityAttribute("['1','2']")));
    }


}