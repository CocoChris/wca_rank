package com.wca.rank.pojo;

public class IntentKeywordPojo {
    private Integer id;

    private String keyword;

    private Double weightQa;

    private Double weightDiagnosis;

    private Double weightMonitor;

    public IntentKeywordPojo(Integer id, String keyword, Double weightQa, Double weightDiagnosis, Double weightMonitor) {
        this.id = id;
        this.keyword = keyword;
        this.weightQa = weightQa;
        this.weightDiagnosis = weightDiagnosis;
        this.weightMonitor = weightMonitor;
    }

    public IntentKeywordPojo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Double getWeightQa() {
        return weightQa;
    }

    public void setWeightQa(Double weightQa) {
        this.weightQa = weightQa;
    }

    public Double getWeightDiagnosis() {
        return weightDiagnosis;
    }

    public void setWeightDiagnosis(Double weightDiagnosis) {
        this.weightDiagnosis = weightDiagnosis;
    }

    public Double getWeightMonitor() {
        return weightMonitor;
    }

    public void setWeightMonitor(Double weightMonitor) {
        this.weightMonitor = weightMonitor;
    }
}