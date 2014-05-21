package com.strightflow.core.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by yermak on 1/5/14.
 */
public interface FieldType<T> {

    T convert(Object value);

    static final FieldType STRING = new FieldTypeString();
    static final FieldType LONG = new FieldTypeLong();
    static final FieldType DOUBLE = new FieldTypeDouble();
    static final FieldType DATE = new FieldTypeDate();
    static final FieldType LIST = new FieldTypeList();

    static class FieldTypeString implements FieldType<String> {

        @Override
        public String convert(Object value) {
            return (String) value;
        }
    }

    static class FieldTypeLong implements FieldType<Long> {

        @Override
        public Long convert(Object value) {
            return new Long(value.toString());
        }
    }

    static class FieldTypeDouble implements FieldType<Double> {

        @Override
        public Double convert(Object value) {
            return new Double(value.toString());
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
