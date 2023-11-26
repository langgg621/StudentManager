package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "LoaiKhoaHoc")
public class LoaiKhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loaiKhoaHocId;

    @Column(name = "TenLoai",nullable = false)
    private String tenLoai;
    @OneToMany(mappedBy = "loaiKhoaHocID", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<KhoaHoc> khoaHocs;

    public LoaiKhoaHoc() {
    }

    public LoaiKhoaHoc(long loaiKhoaHocId, String tenLoai, Collection<KhoaHoc> khoaHocs) {
        this.loaiKhoaHocId = loaiKhoaHocId;
        this.tenLoai = tenLoai;
        this.khoaHocs = khoaHocs;
    }

    public long getLoaiKhoaHocId() {
        return loaiKhoaHocId;
    }

    public void setLoaiKhoaHocId(long loaiKhoaHocId) {
        this.loaiKhoaHocId = loaiKhoaHocId;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Collection<KhoaHoc> getKhoaHocs() {
        return khoaHocs;
    }

    public void setKhoaHocs(Collection<KhoaHoc> khoaHocs) {
        this.khoaHocs = khoaHocs;
    }

    @Override
    public String toString() {
        return "LoaiKhoaHoc{" +
                "loaiKhoaHocId=" + loaiKhoaHocId +
                ", tenLoai='" + tenLoai + '\'' +
                ", khoaHocs=" + khoaHocs +
                '}';
    }
}
