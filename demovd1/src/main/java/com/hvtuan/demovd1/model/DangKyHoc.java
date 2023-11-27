package com.hvtuan.demovd1.model;

import com.hvtuan.demovd1.dto.TinhTrangHocDto;
import net.bytebuddy.build.ToStringPlugin;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "DangKyHoc")
public class DangKyHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NgayDangKy")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDangKy;

    @Column(name = "NgayBatDau")
    private Date ngayBatDau;

    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;

    @Column(name = "TinhTrangHocID",insertable = false, updatable = false)
    private long tinhTrangHocID;

    @Column(name = "TaiKhoanID",insertable = false, updatable = false)
    private long taiKhoanID;

    @ManyToOne
    @JoinColumn(name = "KhoaHocID")
    @ToStringPlugin.Exclude
    private KhoaHoc khoaHoc;

    @ManyToOne
    @JoinColumn(name = "HocVienID")
    @ToStringPlugin.Exclude
    private HocVien hocVien;


    @ManyToOne
    @JoinColumn(name = "TinhTrangHocID")
    @ToStringPlugin.Exclude
    private TinhTrangHoc tinhTrangHoc;

    @ManyToOne
    @JoinColumn(name = "TaiKhoanID")
    @ToStringPlugin.Exclude
    private TaiKhoan taiKhoan;

    @Override
    public String toString() {
        return "DangKyHoc{" +
                "id=" + id +
                ", ngayDangKy=" + ngayDangKy +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", tinhTrangHocID=" + tinhTrangHocID +
                ", taiKhoanID=" + taiKhoanID +
                ", khoaHoc=" + khoaHoc +
                ", hocVien=" + hocVien +
                ", tinhTrangHoc=" + tinhTrangHoc +
                ", taiKhoan=" + taiKhoan +
                '}';
    }

    public DangKyHoc() {
    }

    public DangKyHoc(long id, Date ngayDangKy, Date ngayBatDau, Date ngayKetThuc, long tinhTrangHocID, long taiKhoanID, KhoaHoc khoaHoc, HocVien hocVien, TinhTrangHoc tinhTrangHoc, TaiKhoan taiKhoan) {
        this.id = id;
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

    public KhoaHoc getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public HocVien getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public TinhTrangHoc getTinhTrangHoc() {
        return tinhTrangHoc;
    }

    public void setTinhTrangHoc(TinhTrangHoc tinhTrangHoc) {
        this.tinhTrangHoc = tinhTrangHoc;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setTinhTrangHoc(Optional<TinhTrangHocDto> chưaHoànThành) {
    }
}
