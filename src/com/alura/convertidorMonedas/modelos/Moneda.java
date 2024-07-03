package com.alura.convertidorMonedas.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("base_code")
    private String codigo_base;
    @SerializedName("target_code")
    private String codigo_target;
    @SerializedName("conversion_rate")
    private double tasaConversion;
    @SerializedName("conversion_result")
    private double valorFinal;

    public Moneda(String codigo_base, String codigo_target, double tasaConversion, double valorFinal) {
        this.codigo_base = codigo_base;
        this.codigo_target = codigo_target;
        this.tasaConversion = tasaConversion;
        this.valorFinal = valorFinal;
    }

    public String getCodigo_base() {
        return codigo_base;
    }

    public void setCodigo_base(String codigo_base) {
        this.codigo_base = codigo_base;
    }

    public String getCodigo_target() {
        return codigo_target;
    }

    public void setCodigo_target(String codigo_target) {
        this.codigo_target = codigo_target;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }

    public void setTasaConversion(double tasaConversion) {
        this.tasaConversion = tasaConversion;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

}


