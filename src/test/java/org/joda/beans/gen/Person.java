/*
 *  Copyright 2001-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.impl.flexi.FlexiBean;
import org.joda.beans.MetaBean;

/**
 * Mock person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
@XmlSeeAlso(Address.class)
public final class Person extends DirectBean implements IPerson {

    /** The forename. */
    @PropertyDefinition(overrideGet = true)
    private String forename;
    /** The surname. */
    @PropertyDefinition(overrideGet = true, overrideSet = true)
    private String surname;
    /** The number of cars. */
    @PropertyDefinition
    private transient int numberOfCars;
    @PropertyDefinition
    private final List<Address> addressList = new ArrayList<>();
    @PropertyDefinition
    private final Map<String, Address> otherAddressMap = new HashMap<>();
    @PropertyDefinition
    private final List<List<Address>> addressesList = new ArrayList<>();
    @PropertyDefinition
    private Address mainAddress;
    @PropertyDefinition
    @XmlID
    private final FlexiBean extensions = new FlexiBean();

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code Person}.
     * @return the meta-bean, not null
     */
    public static Person.Meta meta() {
        return Person.Meta.INSTANCE;
    }

    static {
        MetaBean.register(Person.Meta.INSTANCE);
    }

    @Override
    public Person.Meta metaBean() {
        return Person.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename.
     * @return the value of the property
     */
    @Override
    public String getForename() {
        return forename;
    }

    /**
     * Sets the forename.
     * @param forename  the new value of the property
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Gets the the {@code forename} property.
     * @return the property, not null
     */
    public Property<String> forename() {
        return metaBean().forename().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property
     */
    @Override
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname.
     * @param surname  the new value of the property
     */
    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the the {@code surname} property.
     * @return the property, not null
     */
    public Property<String> surname() {
        return metaBean().surname().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number of cars.
     * @return the value of the property
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Sets the number of cars.
     * @param numberOfCars  the new value of the property
     */
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    /**
     * Gets the the {@code numberOfCars} property.
     * @return the property, not null
     */
    public Property<Integer> numberOfCars() {
        return metaBean().numberOfCars().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressList.
     * @return the value of the property, not null
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /**
     * Sets the addressList.
     * @param addressList  the new value of the property, not null
     */
    public void setAddressList(List<Address> addressList) {
        JodaBeanUtils.notNull(addressList, "addressList");
        this.addressList.clear();
        this.addressList.addAll(addressList);
    }

    /**
     * Gets the the {@code addressList} property.
     * @return the property, not null
     */
    public Property<List<Address>> addressList() {
        return metaBean().addressList().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the otherAddressMap.
     * @return the value of the property, not null
     */
    public Map<String, Address> getOtherAddressMap() {
        return otherAddressMap;
    }

    /**
     * Sets the otherAddressMap.
     * @param otherAddressMap  the new value of the property, not null
     */
    public void setOtherAddressMap(Map<String, Address> otherAddressMap) {
        JodaBeanUtils.notNull(otherAddressMap, "otherAddressMap");
        this.otherAddressMap.clear();
        this.otherAddressMap.putAll(otherAddressMap);
    }

    /**
     * Gets the the {@code otherAddressMap} property.
     * @return the property, not null
     */
    public Property<Map<String, Address>> otherAddressMap() {
        return metaBean().otherAddressMap().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressesList.
     * @return the value of the property, not null
     */
    public List<List<Address>> getAddressesList() {
        return addressesList;
    }

    /**
     * Sets the addressesList.
     * @param addressesList  the new value of the property, not null
     */
    public void setAddressesList(List<List<Address>> addressesList) {
        JodaBeanUtils.notNull(addressesList, "addressesList");
        this.addressesList.clear();
        this.addressesList.addAll(addressesList);
    }

    /**
     * Gets the the {@code addressesList} property.
     * @return the property, not null
     */
    public Property<List<List<Address>>> addressesList() {
        return metaBean().addressesList().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the mainAddress.
     * @return the value of the property
     */
    public Address getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the mainAddress.
     * @param mainAddress  the new value of the property
     */
    public void setMainAddress(Address mainAddress) {
        this.mainAddress = mainAddress;
    }

    /**
     * Gets the the {@code mainAddress} property.
     * @return the property, not null
     */
    public Property<Address> mainAddress() {
        return metaBean().mainAddress().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the extensions.
     * @return the value of the property, not null
     */
    public FlexiBean getExtensions() {
        return extensions;
    }

    /**
     * Sets the extensions.
     * @param extensions  the new value of the property, not null
     */
    public void setExtensions(FlexiBean extensions) {
        JodaBeanUtils.notNull(extensions, "extensions");
        this.extensions.clear();
        this.extensions.putAll(extensions);
    }

    /**
     * Gets the the {@code extensions} property.
     * @return the property, not null
     */
    public Property<FlexiBean> extensions() {
        return metaBean().extensions().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public Person clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Person other = (Person) obj;
            return JodaBeanUtils.equal(getForename(), other.getForename()) &&
                    JodaBeanUtils.equal(getSurname(), other.getSurname()) &&
                    (getNumberOfCars() == other.getNumberOfCars()) &&
                    JodaBeanUtils.equal(getAddressList(), other.getAddressList()) &&
                    JodaBeanUtils.equal(getOtherAddressMap(), other.getOtherAddressMap()) &&
                    JodaBeanUtils.equal(getAddressesList(), other.getAddressesList()) &&
                    JodaBeanUtils.equal(getMainAddress(), other.getMainAddress()) &&
                    JodaBeanUtils.equal(getExtensions(), other.getExtensions());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSurname());
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumberOfCars());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAddressList());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOtherAddressMap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAddressesList());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMainAddress());
        hash = hash * 31 + JodaBeanUtils.hashCode(getExtensions());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append("Person{");
        buf.append("forename").append('=').append(getForename()).append(',').append(' ');
        buf.append("surname").append('=').append(getSurname()).append(',').append(' ');
        buf.append("numberOfCars").append('=').append(getNumberOfCars()).append(',').append(' ');
        buf.append("addressList").append('=').append(getAddressList()).append(',').append(' ');
        buf.append("otherAddressMap").append('=').append(getOtherAddressMap()).append(',').append(' ');
        buf.append("addressesList").append('=').append(getAddressesList()).append(',').append(' ');
        buf.append("mainAddress").append('=').append(getMainAddress()).append(',').append(' ');
        buf.append("extensions").append('=').append(JodaBeanUtils.toString(getExtensions()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Person}.
     */
    public static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code forename} property.
         */
        private final MetaProperty<String> forename = DirectMetaProperty.ofReadWrite(
                this, "forename", Person.class, String.class);
        /**
         * The meta-property for the {@code surname} property.
         */
        private final MetaProperty<String> surname = DirectMetaProperty.ofReadWrite(
                this, "surname", Person.class, String.class);
        /**
         * The meta-property for the {@code numberOfCars} property.
         */
        private final MetaProperty<Integer> numberOfCars = DirectMetaProperty.ofReadWrite(
                this, "numberOfCars", Person.class, Integer.TYPE);
        /**
         * The meta-property for the {@code addressList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Address>> addressList = DirectMetaProperty.ofReadWrite(
                this, "addressList", Person.class, (Class) List.class);
        /**
         * The meta-property for the {@code otherAddressMap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, Address>> otherAddressMap = DirectMetaProperty.ofReadWrite(
                this, "otherAddressMap", Person.class, (Class) Map.class);
        /**
         * The meta-property for the {@code addressesList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<List<Address>>> addressesList = DirectMetaProperty.ofReadWrite(
                this, "addressesList", Person.class, (Class) List.class);
        /**
         * The meta-property for the {@code mainAddress} property.
         */
        private final MetaProperty<Address> mainAddress = DirectMetaProperty.ofReadWrite(
                this, "mainAddress", Person.class, Address.class);
        /**
         * The meta-property for the {@code extensions} property.
         */
        private final MetaProperty<FlexiBean> extensions = DirectMetaProperty.ofReadWrite(
                this, "extensions", Person.class, FlexiBean.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "forename",
                "surname",
                "numberOfCars",
                "addressList",
                "otherAddressMap",
                "addressesList",
                "mainAddress",
                "extensions");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return forename;
                case -1852993317:  // surname
                    return surname;
                case 926656063:  // numberOfCars
                    return numberOfCars;
                case -1377524046:  // addressList
                    return addressList;
                case 1368089592:  // otherAddressMap
                    return otherAddressMap;
                case -226885792:  // addressesList
                    return addressesList;
                case -2032731141:  // mainAddress
                    return mainAddress;
                case -1809421292:  // extensions
                    return extensions;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends Person> builder() {
            return new DirectBeanBuilder<>(new Person());
        }

        @Override
        public Class<? extends Person> beanType() {
            return Person.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code forename} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> forename() {
            return forename;
        }

        /**
         * The meta-property for the {@code surname} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> surname() {
            return surname;
        }

        /**
         * The meta-property for the {@code numberOfCars} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Integer> numberOfCars() {
            return numberOfCars;
        }

        /**
         * The meta-property for the {@code addressList} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<Address>> addressList() {
            return addressList;
        }

        /**
         * The meta-property for the {@code otherAddressMap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Map<String, Address>> otherAddressMap() {
            return otherAddressMap;
        }

        /**
         * The meta-property for the {@code addressesList} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<List<Address>>> addressesList() {
            return addressesList;
        }

        /**
         * The meta-property for the {@code mainAddress} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Address> mainAddress() {
            return mainAddress;
        }

        /**
         * The meta-property for the {@code extensions} property.
         * @return the meta-property, not null
         */
        public MetaProperty<FlexiBean> extensions() {
            return extensions;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return ((Person) bean).getForename();
                case -1852993317:  // surname
                    return ((Person) bean).getSurname();
                case 926656063:  // numberOfCars
                    return ((Person) bean).getNumberOfCars();
                case -1377524046:  // addressList
                    return ((Person) bean).getAddressList();
                case 1368089592:  // otherAddressMap
                    return ((Person) bean).getOtherAddressMap();
                case -226885792:  // addressesList
                    return ((Person) bean).getAddressesList();
                case -2032731141:  // mainAddress
                    return ((Person) bean).getMainAddress();
                case -1809421292:  // extensions
                    return ((Person) bean).getExtensions();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    ((Person) bean).setForename((String) newValue);
                    return;
                case -1852993317:  // surname
                    ((Person) bean).setSurname((String) newValue);
                    return;
                case 926656063:  // numberOfCars
                    ((Person) bean).setNumberOfCars((Integer) newValue);
                    return;
                case -1377524046:  // addressList
                    ((Person) bean).setAddressList((List<Address>) newValue);
                    return;
                case 1368089592:  // otherAddressMap
                    ((Person) bean).setOtherAddressMap((Map<String, Address>) newValue);
                    return;
                case -226885792:  // addressesList
                    ((Person) bean).setAddressesList((List<List<Address>>) newValue);
                    return;
                case -2032731141:  // mainAddress
                    ((Person) bean).setMainAddress((Address) newValue);
                    return;
                case -1809421292:  // extensions
                    ((Person) bean).setExtensions((FlexiBean) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((Person) bean).addressList, "addressList");
            JodaBeanUtils.notNull(((Person) bean).otherAddressMap, "otherAddressMap");
            JodaBeanUtils.notNull(((Person) bean).addressesList, "addressesList");
            JodaBeanUtils.notNull(((Person) bean).extensions, "extensions");
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
