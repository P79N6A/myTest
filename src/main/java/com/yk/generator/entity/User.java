package com.yk.generator.entity;

/**
 *  t_user
 */
public class User {
    /**
     * ç¼–å�·
     */
    private Integer tId;

    /**
     * å��ç§°
     */
    private String tName;

    /**
     * å¹´é¾„
     */
    private Integer tAge;

    /**
     * å®¶åº­ä½�å�€
     */
    private String tAddress;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress == null ? null : tAddress.trim();
    }
}