/*
 * Copyright 2013, The OpenNMS Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.opennms.lucidity;


import java.util.UUID;

import com.google.common.base.Objects;
import com.opennms.lucidity.annotations.Column;
import com.opennms.lucidity.annotations.Entity;
import com.opennms.lucidity.annotations.Id;
import com.opennms.lucidity.annotations.Table;


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

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getStreet(), getCity(), getZipcode());
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        return hashCode() == ((Address) other).hashCode();
    }

}