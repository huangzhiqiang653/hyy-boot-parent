package org.hyy.config.oss;

import org.hyy.common.util.oss.OssBootUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OssBootConfiguration {

    @Value("${hyy.oss.endpoint}")
    private String endpoint;
    @Value("${hyy.oss.accessKey}")
    private String accessKeyId;
    @Value("${hyy.oss.secretKey}")
    private String accessKeySecret;
    @Value("${hyy.oss.bucketName}")
    private String bucketName;
    @Value("${hyy.oss.staticDomain}")
    private String staticDomain;


    @Bean
    public void initOssBootConfiguration() {
        OssBootUtil.setEndPoint(endpoint);
        OssBootUtil.setAccessKeyId(accessKeyId);
        OssBootUtil.setAccessKeySecret(accessKeySecret);
        OssBootUtil.setBucketName(bucketName);
        OssBootUtil.setStaticDomain(staticDomain);
    }
}
