package com.app.kuliah.dataMahasiswa.entities;

import javax.persistence.*;

@Entity
@Table(name = "fakultas")
public class FakultasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String facultyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public String toString() {
        return "FakultasEntity{" +
                "id=" + id +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }
}
