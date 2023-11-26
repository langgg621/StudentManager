package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "TinhTrangHoc")
public class TinhTrangHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tinhTrangHocID;
    @Column(name = "TenTinhTrang",nullable = false)
    private String tenTinhTrang;
    @OneToMany(mappedBy = "tinhTrangHocID", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<DangKyHoc> dangKyHocs;
    public TinhTrangHoc() {
    }

    public TinhTrangHoc(long tinhTrangHocID, String tenTinhTrang) {
        tinhTrangHocID = tinhTrangHocID;
        tenTinhTrang = tenTinhTrang;
    }

    public long getTinhTrangHocID() {
        return tinhTrangHocID;
    }

    public void setTinhTrangHocID(long tinhTrangHocID) {
        tinhTrangHocID = tinhTrangHocID;
    }

    public String getTenTinhTrang() {
        return tenTinhTrang;
    }

    public void setTenTinhTrang(String tenTinhTrang) {
        tenTinhTrang = tenTinhTrang;
    }

    @Override
    public String toString() {
        return "TinhTrangHoc{" +
                "TinhTrangHocID=" + tinhTrangHocID +
                ", TenTinhTrang='" + tenTinhTrang + '\'' +
                '}';
    }
}
