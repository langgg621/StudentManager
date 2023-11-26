package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "KhoaHoc")
public class KhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long khoaHocID;

    @Column(name = "TenKhoaHoc", nullable = false)
    private String tenKhoaHoc;

    @Column(name = "ThoiGianHoc",nullable = false)
    private String thoiGianHoc;

    @Column(name = "GioiThieu",nullable = false)
    private String gioiThieu;

    @Column(name = "NoiDung",nullable = false)
    private String noiDung;

    @Column(name = "HocPhi",nullable = false)
    private int hocPhi;

    @Column(name = "SoHocVien",nullable = false)
    private int soHocVien;
    @Column(name = "SoLuongMon",nullable = false)
    private int soLuongMon;
    @Column(name = "LoaiKhoaHocID",nullable = false, insertable = false, updatable = false)
    private long loaiKhoaHocID;
    @Column(name = "HinhAnh",nullable = false)
    private String hinhAnh;
    @OneToMany(mappedBy = "khoaHoc", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<DangKyHoc> dangKyHocs;
    @ManyToOne
    @JoinColumn(name = "LoaiKhoaHocID")
    @ToStringPlugin.Exclude
    private LoaiKhoaHoc loaiKhoaHoc;
    public KhoaHoc() {
    }

    public KhoaHoc(long khoaHocID, String tenKhoaHoc, String thoiGianHoc, String gioiThieu, String noiDung, int hocPhi, int soHocVien, int soLuongMon, long loaiKhoaHocID, String hinhAnh, Collection<DangKyHoc> dangKyHocs, LoaiKhoaHoc loaiKhoaHoc) {
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

    public String getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(String thoiGianHoc) {
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

    public Collection<DangKyHoc> getDangKyHocs() {
        return dangKyHocs;
    }

    public void setDangKyHocs(Collection<DangKyHoc> dangKyHocs) {
        this.dangKyHocs = dangKyHocs;
    }

    public LoaiKhoaHoc getLoaiKhoaHoc() {
        return loaiKhoaHoc;
    }

    public void setLoaiKhoaHoc(LoaiKhoaHoc loaiKhoaHoc) {
        this.loaiKhoaHoc = loaiKhoaHoc;
    }

    @Override
    public String toString() {
        return "KhoaHoc{" +
                "khoaHocID=" + khoaHocID +
                ", tenKhoaHoc='" + tenKhoaHoc + '\'' +
                ", thoiGianHoc='" + thoiGianHoc + '\'' +
                ", gioiThieu='" + gioiThieu + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", hocPhi=" + hocPhi +
                ", soHocVien=" + soHocVien +
                ", soLuongMon=" + soLuongMon +
                ", loaiKhoaHocID=" + loaiKhoaHocID +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", dangKyHocs=" + dangKyHocs +
                ", loaiKhoaHoc=" + loaiKhoaHoc +
                '}';
    }
}
