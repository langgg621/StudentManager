package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "QuyenHan")
public class QuyenHan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long quyenHanID;
    @Column(name = "TenQuyenHan",nullable = false)
    private String tenQuyenHan;

    @OneToMany(mappedBy = "quyenHanID", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<TaiKhoan> taiKhoans;
    public QuyenHan() {
    }

    public QuyenHan(long quyenHanID, String tenQuyenHan, Collection<TaiKhoan> taiKhoans) {
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

    @Override
    public String toString() {
        return "QuyenHan{" +
                "quyenHanID=" + quyenHanID +
                ", tenQuyenHan='" + tenQuyenHan + '\'' +
                ", taiKhoans=" + taiKhoans +
                '}';
    }
}
