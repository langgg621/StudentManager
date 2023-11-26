package com.hvtuan.demovd1.dto;

import com.hvtuan.demovd1.model.TaiKhoan;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Collection;

public class QuyenHanDto {
    private long quyenHanID;
    private String tenQuyenHan;
    private Collection<TaiKhoan> taiKhoans;

    public QuyenHanDto() {
    }

    public QuyenHanDto(long quyenHanID, String tenQuyenHan, Collection<TaiKhoan> taiKhoans) {
        this.quyenHanID = quyenHanID;
        this.tenQuyenHan = tenQuyenHan;
        this.taiKhoans = taiKhoans;
    }

    public long getQuyenHanID() {
        return quyenHanID;
    }

    public void setQuyenHanID(long quyenHanID) {
        this.quyenHanID = quyenHanID;
    }

    public String getTenQuyenHan() {
        return tenQuyenHan;
    }

    public void setTenQuyenHan(String tenQuyenHan) {
        this.tenQuyenHan = tenQuyenHan;
    }

    public Collection<TaiKhoan> getTaiKhoans() {
        return taiKhoans;
    }

    public void setTaiKhoans(Collection<TaiKhoan> taiKhoans) {
        this.taiKhoans = taiKhoans;
    }
}
