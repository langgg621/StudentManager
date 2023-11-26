package com.hvtuan.demovd1.dto;

import com.hvtuan.demovd1.model.KhoaHoc;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Collection;

public class LoaiKhoaHocDto {
    private long loaiKhoaHocId;

    private String tenLoai;
    private Collection<KhoaHoc> khoaHocs;

    public LoaiKhoaHocDto() {
    }

    public LoaiKhoaHocDto(long loaiKhoaHocId, String tenLoai, Collection<KhoaHoc> khoaHocs) {
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
}
