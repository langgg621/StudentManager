package com.hvtuan.demovd1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;

@Entity
@Table(name = "ChuDe")
public class ChuDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChuDeID")
    private long chuDeID;

    @Column(name = "TenChuDe",nullable = false)
    private String tenChuDe;

    @Column(name = "NoiDung",nullable = false)
    private String noiDung;


    @ManyToOne
    @JoinColumn(name = "LoaiBaiVietID")
    @ToStringPlugin.Exclude
    @JsonBackReference
    private LoaiBaiViet loaiBaiViet;

    public ChuDe() {
    }

    public ChuDe(long chuDeID, String tenChuDe, String noiDung, LoaiBaiViet loaiBaiViet) {
        this.chuDeID = chuDeID;
        this.tenChuDe = tenChuDe;
        this.noiDung = noiDung;
        this.loaiBaiViet = loaiBaiViet;
    }

    public long getChuDeID() {
        return chuDeID;
    }

    public void setChuDeID(long chuDeID) {
        this.chuDeID = chuDeID;
    }

    public String getTenChuDe() {
        return tenChuDe;
    }

    public void setTenChuDe(String tenChuDe) {
        this.tenChuDe = tenChuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public LoaiBaiViet getLoaiBaiViet() {
        return loaiBaiViet;
    }

    public void setLoaiBaiViet(LoaiBaiViet loaiBaiViet) {
        this.loaiBaiViet = loaiBaiViet;
    }

    @Override
    public String toString() {
        return "ChuDe{" +
                "chuDeID=" + chuDeID +
                ", tenChuDe='" + tenChuDe + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", loaiBaiViet=" + loaiBaiViet +
                '}';
    }
}
