package com.computec.computec.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "detalleProducto")
public class DetalleProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleProducto;

    private String c1;
    private String c2;
    private String c3;
    private String c4;
    private String c5;
    private String c6;
    private String c7;
    private String c8;
    private String c9;
    private String c10;
    private String c11;

    @OneToOne(mappedBy = "detalleProducto")
    private Producto producto;

    public DetalleProducto() {
    }

    public DetalleProducto(Integer idDetalleProducto, String c1, String c2, String c3, String c4, String c5, String c6, String c7, String c8, String c9, String c10, String c11) {
        this.idDetalleProducto = idDetalleProducto;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
        this.c9 = c9;
        this.c10 = c10;
        this.c11 = c11;
    }

    public List<String> getValores() {
        List<String> values = new ArrayList<>();
        values.add(c1);
        values.add(c2);
        values.add(c3);
        values.add(c4);
        values.add(c5);
        values.add(c6);
        values.add(c7);
        values.add(c8);
        values.add(c9);
        values.add(c10);
        values.add(c11);
        return values;
    }

    public Integer getIdDetalleProducto() {
        return idDetalleProducto;
    }

    public void setIdDetalleProducto(Integer idDetalleProducto) {
        this.idDetalleProducto = idDetalleProducto;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getC6() {
        return c6;
    }

    public void setC6(String c6) {
        this.c6 = c6;
    }

    public String getC7() {
        return c7;
    }

    public void setC7(String c7) {
        this.c7 = c7;
    }

    public String getC8() {
        return c8;
    }

    public void setC8(String c8) {
        this.c8 = c8;
    }

    public String getC9() {
        return c9;
    }

    public void setC9(String c9) {
        this.c9 = c9;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" +
                "id=" + idDetalleProducto +
                ", c1='" + c1 + '\'' +
                ", c2='" + c2 + '\'' +
                ", c3='" + c3 + '\'' +
                ", c4='" + c4 + '\'' +
                ", c5='" + c5 + '\'' +
                ", c6='" + c6 + '\'' +
                ", c7='" + c7 + '\'' +
                ", c8='" + c8 + '\'' +
                ", c9='" + c9 + '\'' +
                ", c10='" + c10 + '\'' +
                ", c11='" + c11 + '\'' +
                '}';
    }
}

