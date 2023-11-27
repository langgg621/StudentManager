package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="HocVien")
public class HocVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HocVienID", nullable = false)
    private long hocVienID;
    @Column(name = "HoTen")
    private String hoten;

    @Column(name = "Ngaysinh")
    private Date ngaysinh;

    @Column(name = "SDT", unique = true, nullable = false)
    private String sdt;

    @Column(name = "Email", unique = true, nullable = false)
    private String email;

    @Column(name = "TinhThanh")
    private String tinhThanh;

    @Column(name = "QuanHuyen")
    private String quanhuyen;

    @Column(name = "PhuongXa")
    private String phuongxa;

    @Column(name = "SoNha")
    private String sonha;
    @Column(name = "HinhAnh")
    private String hinhAnh;

    @OneToMany(mappedBy = "hocVien", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<DangKyHoc> dangKyHocs;

    public HocVien(){

    }

    public HocVien(long hocVienID, String hoten, Date ngaysinh, String sdt, String email, String tinhThanh, String quanhuyen, String phuongxa, String sonha, String hinhAnh, Collection<DangKyHoc> dangKyHocs) {
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
        this.hoten = hoten.toUpperCase();
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

    public Collection<DangKyHoc> getDangKyHocs() {
        return dangKyHocs;
    }

    public void setDangKyHocs(Collection<DangKyHoc> dangKyHocs) {
        this.dangKyHocs = dangKyHocs;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "hocVienID=" + hocVienID +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", tinhThanh='" + tinhThanh + '\'' +
                ", quanhuyen='" + quanhuyen + '\'' +
                ", phuongxa='" + phuongxa + '\'' +
                ", sonha='" + sonha + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", dangKyHocs=" + dangKyHocs +
                '}';
    }
}
