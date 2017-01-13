/*
 *  Copyright 2001-2016 Stephen Colebourne
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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.light.LightMetaBean;

import com.google.common.base.Optional;

/**
 * Mock light bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "light")
public final class MutableLight implements Bean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private int number;
    /**
     * The number.
     */
    @PropertyDefinition
    private boolean flag;
    /**
     * The street.
     */
    @PropertyDefinition
    private String text;
    /**
     * The city.
     */
    @PropertyDefinition(validate = "notNull")
    private String city;
    /**
     * The list.
     */
    @PropertyDefinition(validate = "notNull")
    private final List<String> list = new ArrayList<String>();
    /**
     * The currency.
     */
    @PropertyDefinition(get = "optionalGuava")
    private Currency currency;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code MutableLight}.
     */
    private static final MetaBean META_BEAN = LightMetaBean.of(MutableLight.class);

    /**
     * The meta-bean for {@code MutableLight}.
     * @return the meta-bean, not null
     */
    public static MetaBean meta() {
        return META_BEAN;
    }

    static {
        JodaBeanUtils.registerMetaBean(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    private MutableLight(
            int number,
            boolean flag,
            String text,
            String city,
            List<String> list,
            Currency currency) {
        setNumber(number);
        setFlag(flag);
        setText(text);
        setCity(city);
        setList(list);
        setCurrency(currency);
    }

    @Override
    public MetaBean metaBean() {
        return META_BEAN;
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
     * Gets the number.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number.
     * @param number  the new value of the property
     */
    public void setNumber(int number) {
        this.number = number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * Sets the number.
     * @param flag  the new value of the property
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the street.
     * @return the value of the property
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the street.
     * @param text  the new value of the property
     */
    public void setText(String text) {
        this.text = text;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the city.
     * @return the value of the property, not null
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * @param city  the new value of the property, not null
     */
    public void setCity(String city) {
        JodaBeanUtils.notNull(city, "city");
        this.city = city;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the list.
     * @return the value of the property, not null
     */
    public List<String> getList() {
        return list;
    }

    /**
     * Sets the list.
     * @param list  the new value of the property, not null
     */
    public void setList(List<String> list) {
        JodaBeanUtils.notNull(list, "list");
        this.list.clear();
        this.list.addAll(list);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the currency.
     * @return the optional value of the property, not null
     */
    public Optional<Currency> getCurrency() {
        return Optional.fromNullable(currency);
    }

    /**
     * Sets the currency.
     * @param currency  the new value of the property
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    //-----------------------------------------------------------------------
    @Override
    public MutableLight clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MutableLight other = (MutableLight) obj;
            return (getNumber() == other.getNumber()) &&
                    (isFlag() == other.isFlag()) &&
                    JodaBeanUtils.equal(getText(), other.getText()) &&
                    JodaBeanUtils.equal(getCity(), other.getCity()) &&
                    JodaBeanUtils.equal(getList(), other.getList()) &&
                    JodaBeanUtils.equal(currency, other.currency);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(isFlag());
        hash = hash * 31 + JodaBeanUtils.hashCode(getText());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCity());
        hash = hash * 31 + JodaBeanUtils.hashCode(getList());
        hash = hash * 31 + JodaBeanUtils.hashCode(currency);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(224);
        buf.append("MutableLight{");
        buf.append("number").append('=').append(getNumber()).append(',').append(' ');
        buf.append("flag").append('=').append(isFlag()).append(',').append(' ');
        buf.append("text").append('=').append(getText()).append(',').append(' ');
        buf.append("city").append('=').append(getCity()).append(',').append(' ');
        buf.append("list").append('=').append(getList()).append(',').append(' ');
        buf.append("currency").append('=').append(JodaBeanUtils.toString(currency));
        buf.append('}');
        return buf.toString();
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}