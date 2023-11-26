package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;
import org.hibernate.annotations.CreationTimestamp;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BaiViet")
public class BaiViet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long BaiVietID;

    @Column(name = "TenBaiViet",nullable = false)
    private String tenBaiViet;
    @Column(name = "ThoiGianTao",nullable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGianTao;
    @Column(name = "TenTacGia",nullable = false)
    private String tenTacGia;
    @Column(name = "NoiDung",nullable = false)
    private String noiDung;
    @Column(name = "NoiDungNgan",nullable = false)
    private String noiDungNgan;
    @Column(name = "ChuDeID",nullable = false, insertable = false, updatable = false)
    private long chuDeID;
    @Column(name = "HinhAnh",nullable = false)
    private String hinhAnh;
    @Column(name = "TaiKhoanID",nullable = false, insertable = false, updatable = false)
    private long taiKhoanID;
    @ManyToOne
    @JoinColumn(name = "TaiKhoanID")
    private TaiKhoan taiKhoan;
    @ManyToOne
    @ToStringPlugin.Exclude
    @JoinColumn(name = "ChuDeID")
    private ChuDe chuDe;


    public BaiViet() {
    }

    public BaiViet(long baiVietID, String tenBaiViet, Date thoiGianTao, String tenTacGia, String noiDung, String noiDungNgan, long chuDeID, String hinhAnh, long taiKhoanID, TaiKhoan taiKhoan, ChuDe chuDe) {
        BaiVietID = baiVietID;
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
        return BaiVietID;
    }

    public void setBaiVietID(long baiVietID) {
        BaiVietID = baiVietID;
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

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public ChuDe getChuDe() {
        return chuDe;
    }

    public void setChuDe(ChuDe chuDe) {
        this.chuDe = chuDe;
    }
}
