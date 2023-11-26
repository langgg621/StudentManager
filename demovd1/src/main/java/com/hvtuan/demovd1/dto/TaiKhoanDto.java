package com.hvtuan.demovd1.dto;

import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.DangKyHoc;
import com.hvtuan.demovd1.model.QuyenHan;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

public class TaiKhoanDto {
    private long taiKhoanID;
    private String tenNguoiDung;
    private String taiKhoan;
    private String matKhau;
    private long quyenHanID;
    private QuyenHan quyenHan;

    private Collection<DangKyHoc> dangKyHoc;
    private Collection<BaiViet> baiViets;

    public TaiKhoanDto() {
    }

    public TaiKhoanDto(long taiKhoanID, String tenNguoiDung, String taiKhoan, String matKhau, long quyenHanID, QuyenHan quyenHan, Collection<DangKyHoc> dangKyHoc, Collection<BaiViet> baiViets) {
        this.taiKhoanID = taiKhoanID;
        this.tenNguoiDung = tenNguoiDung;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.quyenHanID = quyenHanID;
        this.quyenHan = quyenHan;
        this.dangKyHoc = dangKyHoc;
        this.baiViets = baiViets;
    }

    public long getTaiKhoanID() {
        return taiKhoanID;
    }

    public void setTaiKhoanID(long taiKhoanID) {
        this.taiKhoanID = taiKhoanID;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public long getQuyenHanID() {
        return quyenHanID;
    }

    public void setQuyenHanID(long quyenHanID) {
        this.quyenHanID = quyenHanID;
    }

    public QuyenHan getQuyenHan() {
        return quyenHan;
    }

    public void setQuyenHan(QuyenHan quyenHan) {
        this.quyenHan = quyenHan;
    }

    public Collection<DangKyHoc> getDangKyHoc() {
        return dangKyHoc;
    }

    public void setDangKyHoc(Collection<DangKyHoc> dangKyHoc) {
        this.dangKyHoc = dangKyHoc;
    }

    public Collection<BaiViet> getBaiViets() {
        return baiViets;
    }

    public void setBaiViets(Collection<BaiViet> baiViets) {
        this.baiViets = baiViets;
    }
}
