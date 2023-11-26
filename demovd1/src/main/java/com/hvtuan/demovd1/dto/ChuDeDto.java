package com.hvtuan.demovd1.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class ChuDeDto {
    private long chuDeID;
    private String tenChuDe;
    private String noiDung;
    private long loaiBaiVietID;

    public ChuDeDto() {
    }

    public ChuDeDto(long chuDeID, String tenChuDe, String noiDung, long loaiBaiVietID) {
        this.chuDeID = chuDeID;
        this.tenChuDe = tenChuDe;
        this.noiDung = noiDung;
        this.loaiBaiVietID = loaiBaiVietID;
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

    public long getLoaiBaiVietID() {
        return loaiBaiVietID;
    }

    public void setLoaiBaiVietID(long loaiBaiVietID) {
        this.loaiBaiVietID = loaiBaiVietID;
    }

    @Override
    public String toString() {
        return "ChuDeDto{" +
                "chuDeID=" + chuDeID +
                ", tenChuDe='" + tenChuDe + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", loaiBaiVietID=" + loaiBaiVietID +
                '}';
    }
}
