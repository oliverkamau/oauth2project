package com.authorization.server.users.model;

import org.springframework.security.core.GrantedAuthority;

import java.math.BigDecimal;

public class UserAuthority implements GrantedAuthority {

    private String authority;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;

    public UserAuthority(String authority, BigDecimal minAmount, BigDecimal maxAmount) {
        this.authority = authority;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }
    @Override
    public String getAuthority() {
        return authority;
    }

    @Override
    public int hashCode() {
        return authority.hashCode();
    }


    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof UserAuthority)) return false;
        return ((UserAuthority) obj).getAuthority().equals(authority);
    }

}
