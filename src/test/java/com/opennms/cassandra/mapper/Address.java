package com.opennms.cassandra.mapper;


import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "addresses")
class Address {

    @Id
    UUID m_id;

    @Column(name = "street")
    String m_street;

    @Column(name = "city")
    String m_city;

    @Column(name = "zipcode")
    String m_zipcode;

    Address() {

    }

    Address(String street, String city, String zipcode) {
        m_street = street;
        m_city = city;
        m_zipcode = zipcode;
    }

    UUID getId() {
        return m_id;
    }

    void setId(UUID id) {
        m_id = id;
    }

    String getStreet() {
        return m_street;
    }

    void setStreet(String street) {
        m_street = street;
    }

    String getCity() {
        return m_city;
    }

    void setCity(String city) {
        m_city = city;
    }

    String getZipcode() {
        return m_zipcode;
    }

    void setZipcode(String zipcode) {
        m_zipcode = zipcode;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s]", getClass().getSimpleName(), getStreet(), getCity(), getZipcode());
    }

}