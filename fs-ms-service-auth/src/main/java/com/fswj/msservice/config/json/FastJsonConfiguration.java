package com.fswj.msservice.config.json;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;

/**
 * FastJson配置
 */
@Configuration
public class FastJsonConfiguration {
    @Bean
    public FastJsonHttpMessageConverter httpMessageConverter() {
        FastJsonHttpMessageConverter httpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setCharset(Charset.forName("utf-8"));
        config.setDateFormat("yyyy-MM-dd HH:mm:ss");
        config.setSerializerFeatures(
                /*
                 *NULL的List集合转为空集合
                 */
                SerializerFeature.WriteNullListAsEmpty,

                /*
                 * Boolean的Null值设为false
                 */
                SerializerFeature.WriteNullBooleanAsFalse,

                /*
                   Null数字转为0
                 */
                SerializerFeature.WriteNullNumberAsZero


        );
        httpMessageConverter.setFastJsonConfig(config);
        return httpMessageConverter;
    }
}
