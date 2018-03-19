package com.slyak.support.jpa;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.springframework.core.GenericTypeResolver;

import javax.persistence.AttributeConverter;

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

/*    @Data
    public static class Test{
        String name;
    }

    public static void main(String[] args) {
        JsonConverter<List<Test>> converter = new JsonConverter<List<Test>>() {
        };
        System.out.println(converter.convertToEntityAttribute("[{name:'1'},{name:'2'}]"));
    }*/


}