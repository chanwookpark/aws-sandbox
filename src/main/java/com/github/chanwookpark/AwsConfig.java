package com.github.chanwookpark;

import org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData;
import org.springframework.context.annotation.Configuration;

/**
 * @author chanwook
 */
@Configuration
@EnableContextInstanceData
//@ImportResource(locations = "/applicationContext-aws.xml")
public class AwsConfig {
}
