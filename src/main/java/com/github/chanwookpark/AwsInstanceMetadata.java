package com.github.chanwookpark;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chanwook
 */
@Data
public class AwsInstanceMetadata implements Serializable {

    private String amiId;

    private String data1;
}
