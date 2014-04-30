package com.strightflow.core.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by yermak on 1/5/14.
 */
public interface FieldType<T> {

    T convert(Object value);

    static final FieldType STRING = new FieldTypeString();
    static final FieldType INTEGER = new FieldTypeInteger();
    static final FieldType DATE = new FieldTypeDate();

    static class FieldTypeString implements FieldType<String> {

        @Override
        public String convert(Object value) {
            return (String) value;
        }
    }

    static class FieldTypeInteger implements FieldType<Integer> {

        @Override
        public Integer convert(Object value) {
            return new Integer((String) value);
        }
    }

    static class FieldTypeDate implements FieldType<Date> {

        @Override
        public Date convert(Object value) {
            return new Date((String) value);
        }
    }

    static class FieldTypeList implements FieldType<List> {

        @Override
        public List convert(Object value) {
            return null;
        }
    }


}
