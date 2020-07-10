package org.hsm.detection.model;

import lombok.Data;

@Data
public class Message {
    private String info;
    private String type;
    private String sex;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

