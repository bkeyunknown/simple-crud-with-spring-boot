package com.app.kuliah.dataMahasiswa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FakultasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
