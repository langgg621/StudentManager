package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taiKhoanID;
    @Column(name = "TenNguoiDung",nullable = false)
    private String tenNguoiDung;
    @Column(name = "TaiKhoan", unique = true,nullable = false)
    private String taiKhoan;
    @Column(name = "MatKhau",nullable = false)
    private String matKhau;
    @Column(name = "QuyenHanID", insertable = false, updatable = false)
    private long quyenHanID;

    @ManyToOne
    @JoinColumn(name = "QuyenHanID")
    @ToStringPlugin.Exclude
    private QuyenHan quyenHan;

    @OneToMany(mappedBy = "taiKhoanID", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<DangKyHoc> dangKyHoc;
    @OneToMany(mappedBy = "taiKhoanID", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<BaiViet> baiViets;
    public TaiKhoan() {
    }

    public TaiKhoan(long taiKhoanID, String tenNguoiDung, String taiKhoan, String matKhau, long quyenHanID, QuyenHan quyenHan, Collection<DangKyHoc> dangKyHoc, Collection<BaiViet> baiViets) {
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

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "taiKhoanID=" + taiKhoanID +
                ", tenNguoiDung='" + tenNguoiDung + '\'' +
                ", taiKhoan='" + taiKhoan + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", quyenHanID=" + quyenHanID +
                ", quyenHan=" + quyenHan +
                ", dangKyHoc=" + dangKyHoc +
                ", baiViets=" + baiViets +
                '}';
    }
}
