package com.hvtuan.demovd1.model;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "LoaiBaiViet")
public class LoaiBaiViet {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "TenLoai",nullable = false)
    private String tenLoai;
    @OneToMany(mappedBy = "loaiBaiViet", cascade = CascadeType.ALL)
    @ToStringPlugin.Exclude
    private Collection<ChuDe> chuDes;


    public LoaiBaiViet() {
    }

    public LoaiBaiViet(long id, String tenLoai, Collection<ChuDe> chuDes) {
        this.id = id;
        this.tenLoai = tenLoai;
        this.chuDes = chuDes;
    }

    public long getLoaiBaiVietID() {
        return id;
    }

    public void setLoaiBaiVietID(long loaiBaiVietID) {
        this.id = loaiBaiVietID;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Collection<ChuDe> getChuDes() {
        return chuDes;
    }

    public void setChuDes(Collection<ChuDe> chuDes) {
        this.chuDes = chuDes;
    }
}
