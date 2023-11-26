package com.hvtuan.demovd1.dto;

import java.util.Collection;
import java.util.Date;

public class HocVienDto {
    private long hocVienID;
    private String hoten;
    private Date ngaysinh;
    private String sdt;
    private String email;
    private String tinhThanh;
    private String quanhuyen;
    private String phuongxa;
    private String sonha;
    private String hinhAnh;
    private Collection<DangKyHocDto> dangKyHocs;

    public HocVienDto() {
    }

    public HocVienDto(long hocVienID, String hoten, Date ngaysinh, String sdt, String email, String tinhThanh, String quanhuyen, String phuongxa, String sonha, String hinhAnh, Collection<DangKyHocDto> dangKyHocs) {
        this.hocVienID = hocVienID;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.email = email;
        this.tinhThanh = tinhThanh;
        this.quanhuyen = quanhuyen;
        this.phuongxa = phuongxa;
        this.sonha = sonha;
        this.hinhAnh = hinhAnh;
        this.dangKyHocs = dangKyHocs;
    }

    public long getHocVienID() {
        return hocVienID;
    }

    public void setHocVienID(long hocVienID) {
        this.hocVienID = hocVienID;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getQuanhuyen() {
        return quanhuyen;
    }

    public void setQuanhuyen(String quanhuyen) {
        this.quanhuyen = quanhuyen;
    }

    public String getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(String phuongxa) {
        this.phuongxa = phuongxa;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Collection<DangKyHocDto> getDangKyHocs() {
        return dangKyHocs;
    }

    public void setDangKyHocs(Collection<DangKyHocDto> dangKyHocs) {
        this.dangKyHocs = dangKyHocs;
    }
}

