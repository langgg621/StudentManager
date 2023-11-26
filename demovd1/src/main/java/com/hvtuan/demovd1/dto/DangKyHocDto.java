package com.hvtuan.demovd1.dto;

import java.util.Date;

public class DangKyHocDto {
    private long id;
    private long khoaHocID;
    private long hocVienID;
    private Date ngayDangKy;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private long tinhTrangHocID;
    private long taiKhoanID;
    private KhoaHocDto khoaHoc;
    private HocVienDto hocVien;
    private TinhTrangHocDto tinhTrangHoc;
    private TaiKhoanDto taiKhoan;

    public DangKyHocDto() {
    }

    public DangKyHocDto(long id, long khoaHocID, long hocVienID, Date ngayDangKy, Date ngayBatDau, Date ngayKetThuc, long tinhTrangHocID, long taiKhoanID, KhoaHocDto khoaHoc, HocVienDto hocVien, TinhTrangHocDto tinhTrangHoc, TaiKhoanDto taiKhoan) {
        this.id = id;
        this.khoaHocID = khoaHocID;
        this.hocVienID = hocVienID;
        this.ngayDangKy = ngayDangKy;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tinhTrangHocID = tinhTrangHocID;
        this.taiKhoanID = taiKhoanID;
        this.khoaHoc = khoaHoc;
        this.hocVien = hocVien;
        this.tinhTrangHoc = tinhTrangHoc;
        this.taiKhoan = taiKhoan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKhoaHocID() {
        return khoaHocID;
    }

    public void setKhoaHocID(long khoaHocID) {
        this.khoaHocID = khoaHocID;
    }

    public long getHocVienID() {
        return hocVienID;
    }

    public void setHocVienID(long hocVienID) {
        this.hocVienID = hocVienID;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public long getTinhTrangHocID() {
        return tinhTrangHocID;
    }

    public void setTinhTrangHocID(long tinhTrangHocID) {
        this.tinhTrangHocID = tinhTrangHocID;
    }

    public long getTaiKhoanID() {
        return taiKhoanID;
    }

    public void setTaiKhoanID(long taiKhoanID) {
        this.taiKhoanID = taiKhoanID;
    }

    public KhoaHocDto getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(KhoaHocDto khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public HocVienDto getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVienDto hocVien) {
        this.hocVien = hocVien;
    }

    public TinhTrangHocDto getTinhTrangHoc() {
        return tinhTrangHoc;
    }

    public void setTinhTrangHoc(TinhTrangHocDto tinhTrangHoc) {
        this.tinhTrangHoc = tinhTrangHoc;
    }

    public TaiKhoanDto getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoanDto taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
}

