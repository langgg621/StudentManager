package com.hvtuan.demovd1.dto;

import java.util.Collection;
import java.util.Date;

public class KhoaHocDto {
    private long khoaHocID;
    private String tenKhoaHoc;
    private Date thoiGianHoc;
    private String gioiThieu;
    private String noiDung;
    private int hocPhi;
    private int soHocVien;
    private int soLuongMon;
    private long loaiKhoaHocID;
    private String hinhAnh;
    private Collection<DangKyHocDto> dangKyHocs;
    private LoaiKhoaHocDto loaiKhoaHoc;

    public KhoaHocDto() {
    }

    public KhoaHocDto(long khoaHocID, String tenKhoaHoc, Date thoiGianHoc, String gioiThieu, String noiDung, int hocPhi, int soHocVien, int soLuongMon, long loaiKhoaHocID, String hinhAnh, Collection<DangKyHocDto> dangKyHocs, LoaiKhoaHocDto loaiKhoaHoc) {
        this.khoaHocID = khoaHocID;
        this.tenKhoaHoc = tenKhoaHoc;
        this.thoiGianHoc = thoiGianHoc;
        this.gioiThieu = gioiThieu;
        this.noiDung = noiDung;
        this.hocPhi = hocPhi;
        this.soHocVien = soHocVien;
        this.soLuongMon = soLuongMon;
        this.loaiKhoaHocID = loaiKhoaHocID;
        this.hinhAnh = hinhAnh;
        this.dangKyHocs = dangKyHocs;
        this.loaiKhoaHoc = loaiKhoaHoc;
    }

    public long getKhoaHocID() {
        return khoaHocID;
    }

    public void setKhoaHocID(long khoaHocID) {
        this.khoaHocID = khoaHocID;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public Date getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(Date thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getSoHocVien() {
        return soHocVien;
    }

    public void setSoHocVien(int soHocVien) {
        this.soHocVien = soHocVien;
    }

    public int getSoLuongMon() {
        return soLuongMon;
    }

    public void setSoLuongMon(int soLuongMon) {
        this.soLuongMon = soLuongMon;
    }

    public long getLoaiKhoaHocID() {
        return loaiKhoaHocID;
    }

    public void setLoaiKhoaHocID(long loaiKhoaHocID) {
        this.loaiKhoaHocID = loaiKhoaHocID;
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

    public LoaiKhoaHocDto getLoaiKhoaHoc() {
        return loaiKhoaHoc;
    }

    public void setLoaiKhoaHoc(LoaiKhoaHocDto loaiKhoaHoc) {
        this.loaiKhoaHoc = loaiKhoaHoc;
    }
}
