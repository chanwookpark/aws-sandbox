package com.github.chanwookpark.awssandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanwook
 */
@RestController
public class AwsMetadataController {

    @Autowired
    Environment env;

    @RequestMapping("/meta/instance-meta")
    public AwsInstanceMetadata instanceMetadata() {
        final AwsInstanceMetadata meta = new AwsInstanceMetadata();
        meta.setAmiId(env.getProperty("ami-id"));
        meta.setData1(env.getProperty("data1"));

        return meta;
    }

}
