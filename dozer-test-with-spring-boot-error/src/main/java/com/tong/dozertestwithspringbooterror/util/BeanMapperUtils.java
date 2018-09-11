package com.tong.dozertestwithspringbooterror.util;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class BeanMapperUtils {
    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    //映射单个对象
    public static <T> T map(Object source, Class<T> tClass) {
        return mapper.map(source, tClass);
    }
}
