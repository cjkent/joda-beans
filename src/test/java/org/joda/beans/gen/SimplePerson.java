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
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.impl.flexi.FlexiBean;

/**
 * Mock person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class SimplePerson implements Cloneable, Bean {

    /** The forename. */
    @PropertyDefinition
    private String forename;
    /** The surname. */
    @PropertyDefinition
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
    @Deprecated
    @PropertyDefinition
    private final FlexiBean propDefAnnotationSecondDeprecated = new FlexiBean();
    @XmlElement(name = "additionalAttributes")
    @PropertyDefinition(get = "manual")
    private Map<String, String> propDefAnnotationSecondManual;

    public Map<String, String> getPropDefAnnotationSecondManual() {
        return this.propDefAnnotationSecondManual;
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code SimplePerson}.
     * @return the meta-bean, not null
     */
    public static SimplePerson.Meta meta() {
        return SimplePerson.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(SimplePerson.Meta.INSTANCE);
    }

    @Override
    public SimplePerson.Meta metaBean() {
        return SimplePerson.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename.
     * @return the value of the property
     */
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
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname.
     * @param surname  the new value of the property
     */
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
     * Gets the propDefAnnotationSecondDeprecated.
     * @return the value of the property, not null
     */
    @Deprecated
    public FlexiBean getPropDefAnnotationSecondDeprecated() {
        return propDefAnnotationSecondDeprecated;
    }

    /**
     * Sets the propDefAnnotationSecondDeprecated.
     * @param propDefAnnotationSecondDeprecated  the new value of the property, not null
     */
    @Deprecated
    public void setPropDefAnnotationSecondDeprecated(FlexiBean propDefAnnotationSecondDeprecated) {
        JodaBeanUtils.notNull(propDefAnnotationSecondDeprecated, "propDefAnnotationSecondDeprecated");
        this.propDefAnnotationSecondDeprecated.clear();
        this.propDefAnnotationSecondDeprecated.putAll(propDefAnnotationSecondDeprecated);
    }

    /**
     * Gets the the {@code propDefAnnotationSecondDeprecated} property.
     * @return the property, not null
     */
    @Deprecated
    public Property<FlexiBean> propDefAnnotationSecondDeprecated() {
        return metaBean().propDefAnnotationSecondDeprecated().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the propDefAnnotationSecondManual.
     * @param propDefAnnotationSecondManual  the new value of the property
     */
    public void setPropDefAnnotationSecondManual(Map<String, String> propDefAnnotationSecondManual) {
        this.propDefAnnotationSecondManual = propDefAnnotationSecondManual;
    }

    /**
     * Gets the the {@code propDefAnnotationSecondManual} property.
     * @return the property, not null
     */
    public Property<Map<String, String>> propDefAnnotationSecondManual() {
        return metaBean().propDefAnnotationSecondManual().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public SimplePerson clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            SimplePerson other = (SimplePerson) obj;
            return JodaBeanUtils.equal(getForename(), other.getForename()) &&
                    JodaBeanUtils.equal(getSurname(), other.getSurname()) &&
                    (getNumberOfCars() == other.getNumberOfCars()) &&
                    JodaBeanUtils.equal(getAddressList(), other.getAddressList()) &&
                    JodaBeanUtils.equal(getOtherAddressMap(), other.getOtherAddressMap()) &&
                    JodaBeanUtils.equal(getAddressesList(), other.getAddressesList()) &&
                    JodaBeanUtils.equal(getMainAddress(), other.getMainAddress()) &&
                    JodaBeanUtils.equal(getPropDefAnnotationSecondDeprecated(), other.getPropDefAnnotationSecondDeprecated()) &&
                    JodaBeanUtils.equal(getPropDefAnnotationSecondManual(), other.getPropDefAnnotationSecondManual());
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
        hash = hash * 31 + JodaBeanUtils.hashCode(getPropDefAnnotationSecondDeprecated());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPropDefAnnotationSecondManual());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(320);
        buf.append("SimplePerson{");
        buf.append("forename").append('=').append(getForename()).append(',').append(' ');
        buf.append("surname").append('=').append(getSurname()).append(',').append(' ');
        buf.append("numberOfCars").append('=').append(getNumberOfCars()).append(',').append(' ');
        buf.append("addressList").append('=').append(getAddressList()).append(',').append(' ');
        buf.append("otherAddressMap").append('=').append(getOtherAddressMap()).append(',').append(' ');
        buf.append("addressesList").append('=').append(getAddressesList()).append(',').append(' ');
        buf.append("mainAddress").append('=').append(getMainAddress()).append(',').append(' ');
        buf.append("propDefAnnotationSecondDeprecated").append('=').append(getPropDefAnnotationSecondDeprecated()).append(',').append(' ');
        buf.append("propDefAnnotationSecondManual").append('=').append(JodaBeanUtils.toString(getPropDefAnnotationSecondManual()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code SimplePerson}.
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
                this, "forename", SimplePerson.class, String.class);
        /**
         * The meta-property for the {@code surname} property.
         */
        private final MetaProperty<String> surname = DirectMetaProperty.ofReadWrite(
                this, "surname", SimplePerson.class, String.class);
        /**
         * The meta-property for the {@code numberOfCars} property.
         */
        private final MetaProperty<Integer> numberOfCars = DirectMetaProperty.ofReadWrite(
                this, "numberOfCars", SimplePerson.class, Integer.TYPE);
        /**
         * The meta-property for the {@code addressList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Address>> addressList = DirectMetaProperty.ofReadWrite(
                this, "addressList", SimplePerson.class, (Class) List.class);
        /**
         * The meta-property for the {@code otherAddressMap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, Address>> otherAddressMap = DirectMetaProperty.ofReadWrite(
                this, "otherAddressMap", SimplePerson.class, (Class) Map.class);
        /**
         * The meta-property for the {@code addressesList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<List<Address>>> addressesList = DirectMetaProperty.ofReadWrite(
                this, "addressesList", SimplePerson.class, (Class) List.class);
        /**
         * The meta-property for the {@code mainAddress} property.
         */
        private final MetaProperty<Address> mainAddress = DirectMetaProperty.ofReadWrite(
                this, "mainAddress", SimplePerson.class, Address.class);
        /**
         * The meta-property for the {@code propDefAnnotationSecondDeprecated} property.
         */
        private final MetaProperty<FlexiBean> propDefAnnotationSecondDeprecated = DirectMetaProperty.ofReadWrite(
                this, "propDefAnnotationSecondDeprecated", SimplePerson.class, FlexiBean.class);
        /**
         * The meta-property for the {@code propDefAnnotationSecondManual} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, String>> propDefAnnotationSecondManual = DirectMetaProperty.ofReadWrite(
                this, "propDefAnnotationSecondManual", SimplePerson.class, (Class) Map.class);
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
                "propDefAnnotationSecondDeprecated",
                "propDefAnnotationSecondManual");

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
                case 1897330136:  // propDefAnnotationSecondDeprecated
                    return propDefAnnotationSecondDeprecated;
                case 1276990059:  // propDefAnnotationSecondManual
                    return propDefAnnotationSecondManual;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends SimplePerson> builder() {
            return new DirectBeanBuilder<SimplePerson>(new SimplePerson());
        }

        @Override
        public Class<? extends SimplePerson> beanType() {
            return SimplePerson.class;
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
         * The meta-property for the {@code propDefAnnotationSecondDeprecated} property.
         * @return the meta-property, not null
         */
        @Deprecated
        public MetaProperty<FlexiBean> propDefAnnotationSecondDeprecated() {
            return propDefAnnotationSecondDeprecated;
        }

        /**
         * The meta-property for the {@code propDefAnnotationSecondManual} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Map<String, String>> propDefAnnotationSecondManual() {
            return propDefAnnotationSecondManual;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return ((SimplePerson) bean).getForename();
                case -1852993317:  // surname
                    return ((SimplePerson) bean).getSurname();
                case 926656063:  // numberOfCars
                    return ((SimplePerson) bean).getNumberOfCars();
                case -1377524046:  // addressList
                    return ((SimplePerson) bean).getAddressList();
                case 1368089592:  // otherAddressMap
                    return ((SimplePerson) bean).getOtherAddressMap();
                case -226885792:  // addressesList
                    return ((SimplePerson) bean).getAddressesList();
                case -2032731141:  // mainAddress
                    return ((SimplePerson) bean).getMainAddress();
                case 1897330136:  // propDefAnnotationSecondDeprecated
                    return ((SimplePerson) bean).getPropDefAnnotationSecondDeprecated();
                case 1276990059:  // propDefAnnotationSecondManual
                    return ((SimplePerson) bean).getPropDefAnnotationSecondManual();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    ((SimplePerson) bean).setForename((String) newValue);
                    return;
                case -1852993317:  // surname
                    ((SimplePerson) bean).setSurname((String) newValue);
                    return;
                case 926656063:  // numberOfCars
                    ((SimplePerson) bean).setNumberOfCars((Integer) newValue);
                    return;
                case -1377524046:  // addressList
                    ((SimplePerson) bean).setAddressList((List<Address>) newValue);
                    return;
                case 1368089592:  // otherAddressMap
                    ((SimplePerson) bean).setOtherAddressMap((Map<String, Address>) newValue);
                    return;
                case -226885792:  // addressesList
                    ((SimplePerson) bean).setAddressesList((List<List<Address>>) newValue);
                    return;
                case -2032731141:  // mainAddress
                    ((SimplePerson) bean).setMainAddress((Address) newValue);
                    return;
                case 1897330136:  // propDefAnnotationSecondDeprecated
                    ((SimplePerson) bean).setPropDefAnnotationSecondDeprecated((FlexiBean) newValue);
                    return;
                case 1276990059:  // propDefAnnotationSecondManual
                    ((SimplePerson) bean).setPropDefAnnotationSecondManual((Map<String, String>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((SimplePerson) bean).addressList, "addressList");
            JodaBeanUtils.notNull(((SimplePerson) bean).otherAddressMap, "otherAddressMap");
            JodaBeanUtils.notNull(((SimplePerson) bean).addressesList, "addressesList");
            JodaBeanUtils.notNull(((SimplePerson) bean).propDefAnnotationSecondDeprecated, "propDefAnnotationSecondDeprecated");
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
