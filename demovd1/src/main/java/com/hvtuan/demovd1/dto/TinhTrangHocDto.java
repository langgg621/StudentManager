package com.hvtuan.demovd1.dto;

import com.hvtuan.demovd1.model.DangKyHoc;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Collection;

public class TinhTrangHocDto {
    private long tinhTrangHocID;
    private String tenTinhTrang;
    private Collection<DangKyHoc> dangKyHocs;

    public TinhTrangHocDto() {
    }

    public TinhTrangHocDto(long tinhTrangHocID, String tenTinhTrang, Collection<DangKyHoc> dangKyHocs) {
        this.tinhTrangHocID = tinhTrangHocID;
        this.tenTinhTrang = tenTinhTrang;
        this.dangKyHocs = dangKyHocs;
    }

    public long getTinhTrangHocID() {
        return tinhTrangHocID;
    }

    public void setTinhTrangHocID(long tinhTrangHocID) {
        this.tinhTrangHocID = tinhTrangHocID;
    }

    public String getTenTinhTrang() {
        return tenTinhTrang;
    }

    public void setTenTinhTrang(String tenTinhTrang) {
        this.tenTinhTrang = tenTinhTrang;
    }

    public Collection<DangKyHoc> getDangKyHocs() {
        return dangKyHocs;
    }

    public void setDangKyHocs(Collection<DangKyHoc> dangKyHocs) {
        this.dangKyHocs = dangKyHocs;
    }
}
