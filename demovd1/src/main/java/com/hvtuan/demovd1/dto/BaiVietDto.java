package com.hvtuan.demovd1.dto;

import java.util.Date;

public class BaiVietDto {
    private long baiVietID;
    private String tenBaiViet;
    private Date thoiGianTao;
    private String tenTacGia;
    private String noiDung;
    private String noiDungNgan;
    private long chuDeID;
    private String hinhAnh;
    private long taiKhoanID;
    private TaiKhoanDto taiKhoan;
    private ChuDeDto chuDe;

    public BaiVietDto() {
    }

    public BaiVietDto(long baiVietID, String tenBaiViet, Date thoiGianTao, String tenTacGia, String noiDung, String noiDungNgan, long chuDeID, String hinhAnh, long taiKhoanID, TaiKhoanDto taiKhoan, ChuDeDto chuDe) {
        this.baiVietID = baiVietID;
        this.tenBaiViet = tenBaiViet;
        this.thoiGianTao = thoiGianTao;
        this.tenTacGia = tenTacGia;
        this.noiDung = noiDung;
        this.noiDungNgan = noiDungNgan;
        this.chuDeID = chuDeID;
        this.hinhAnh = hinhAnh;
        this.taiKhoanID = taiKhoanID;
        this.taiKhoan = taiKhoan;
        this.chuDe = chuDe;
    }

    public long getBaiVietID() {
        return baiVietID;
    }

    public void setBaiVietID(long baiVietID) {
        this.baiVietID = baiVietID;
    }

    public String getTenBaiViet() {
        return tenBaiViet;
    }

    public void setTenBaiViet(String tenBaiViet) {
        this.tenBaiViet = tenBaiViet;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDungNgan() {
        return noiDungNgan;
    }

    public void setNoiDungNgan(String noiDungNgan) {
        this.noiDungNgan = noiDungNgan;
    }

    public long getChuDeID() {
        return chuDeID;
    }

    public void setChuDeID(long chuDeID) {
        this.chuDeID = chuDeID;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public long getTaiKhoanID() {
        return taiKhoanID;
    }

    public void setTaiKhoanID(long taiKhoanID) {
        this.taiKhoanID = taiKhoanID;
    }

    public TaiKhoanDto getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoanDto taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public ChuDeDto getChuDe() {
        return chuDe;
    }

    public void setChuDe(ChuDeDto chuDe) {
        this.chuDe = chuDe;
    }
}

