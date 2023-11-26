package com.hvtuan.demovd1.dto;

import com.hvtuan.demovd1.model.ChuDe;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Collection;

public class LoaiBaiVietDto {
    private long loaiBaiVietID;
    private String tenLoai;
    private Collection<ChuDe> chuDes;

    public LoaiBaiVietDto() {
    }

    public LoaiBaiVietDto(long loaiBaiVietID, String tenLoai, Collection<ChuDe> chuDes) {
        this.loaiBaiVietID = loaiBaiVietID;
        this.tenLoai = tenLoai;
        this.chuDes = chuDes;
    }

    public long getLoaiBaiVietID() {
        return loaiBaiVietID;
    }

    public void setLoaiBaiVietID(long loaiBaiVietID) {
        this.loaiBaiVietID = loaiBaiVietID;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Collection<ChuDe> getChuDes() {
        return chuDes;
    }

    public void setChuDes(Collection<ChuDe> chuDes) {
        this.chuDes = chuDes;
    }
}
