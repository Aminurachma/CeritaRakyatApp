package com.nila.submissionaminurachmadicoding.model;

public class Cerita {

    private String noCerita, judulCerita, detailCerita;
    private int imgCerita;

    public Cerita(String noCerita, String judulCerita, String detailCerita, int imgCerita) {
        this.noCerita = noCerita;
        this.judulCerita = judulCerita;
        this.detailCerita = detailCerita;
        this.imgCerita = imgCerita;
    }

    public String getDetailCerita() {
        return detailCerita;
    }

    public void setDetailCerita(String detailCerita) {
        this.detailCerita = detailCerita;
    }

    public String getNoCerita() {
        return noCerita;
    }

    public void setNoCerita(String noCerita) {
        this.noCerita = noCerita;
    }

    public String getJudulCerita() {
        return judulCerita;
    }

    public void setJudulCerita(String judulCerita) {
        this.judulCerita = judulCerita;
    }

    public int getImgCerita() {
        return imgCerita;
    }

    public void setImgCerita(int imgCerita) {
        this.imgCerita = imgCerita;
    }
}
