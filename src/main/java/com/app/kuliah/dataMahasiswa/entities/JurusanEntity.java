package com.app.kuliah.dataMahasiswa.entities;

import javax.persistence.*;

@Entity
@Table(name = "jurusan")
public class JurusanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String jurusanName;

    @Override
    public String toString() {
        return "JurusanEntity{" +
                "id=" + id +
                ", jurusanName='" + jurusanName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJurusanName() {
        return jurusanName;
    }

    public void setJurusanName(String jurusanName) {
        this.jurusanName = jurusanName;
    }
}
