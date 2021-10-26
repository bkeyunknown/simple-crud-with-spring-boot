package com.app.kuliah.dataMahasiswa.entities;

import javax.persistence.*;

@Entity
@Table(name = "matkul")
public class MatkulEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String matkulName;
    private String matkulSks;
    private String matkulSemester;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatkulName() {
        return matkulName;
    }

    public void setMatkulName(String matkulName) {
        this.matkulName = matkulName;
    }

    public String getMatkulSks() {
        return matkulSks;
    }

    public void setMatkulSks(String matkulSks) {
        this.matkulSks = matkulSks;
    }

    public String getMatkulSemester() {
        return matkulSemester;
    }

    public void setMatkulSemester(String matkulSemester) {
        this.matkulSemester = matkulSemester;
    }

    @Override
    public String toString() {
        return "MatkulEntity{" +
                "id=" + id +
                ", matkulName='" + matkulName + '\'' +
                ", matkulSks='" + matkulSks + '\'' +
                ", matkulSemester='" + matkulSemester + '\'' +
                '}';
    }
}
