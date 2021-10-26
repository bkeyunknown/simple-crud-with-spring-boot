package com.app.kuliah.dataMahasiswa.entities;

import javax.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class MahasiswaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String mahasiswaName;
    private String mahasiswaNIM;
    private String mahasiswaJurusan;
    private String mahasiswaFakultas;
    private String password;

    @Override
    public String toString() {
        return "MahasiswaEntity{" +
                "id=" + id +
                ", mahasiswaName='" + mahasiswaName + '\'' +
                ", mahasiswaNIM='" + mahasiswaNIM + '\'' +
                ", mahasiswaJurusan='" + mahasiswaJurusan + '\'' +
                ", mahasiswaFakultas='" + mahasiswaFakultas + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMahasiswaName() {
        return mahasiswaName;
    }

    public void setMahasiswaName(String mahasiswaName) {
        this.mahasiswaName = mahasiswaName;
    }

    public String getMahasiswaNIM() {
        return mahasiswaNIM;
    }

    public void setMahasiswaNIM(String mahasiswaNIM) {
        this.mahasiswaNIM = mahasiswaNIM;
    }

    public String getMahasiswaJurusan() {
        return mahasiswaJurusan;
    }

    public void setMahasiswaJurusan(String mahasiswaJurusan) {
        this.mahasiswaJurusan = mahasiswaJurusan;
    }

    public String getMahasiswaFakultas() {
        return mahasiswaFakultas;
    }

    public void setMahasiswaFakultas(String mahasiswaFakultas) {
        this.mahasiswaFakultas = mahasiswaFakultas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
