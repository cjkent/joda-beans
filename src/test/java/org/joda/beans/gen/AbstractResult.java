/*
 *  Copyright 2001-2013 Stephen Colebourne
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

import java.util.List;
import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.DerivedProperty;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public abstract class AbstractResult<T extends Address> extends DirectBean {

    /** The docs. */
    @PropertyDefinition
    private List<T> docs;

    @DerivedProperty
    public abstract String getResultType();

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code AbstractResult}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static AbstractResult.Meta meta() {
        return AbstractResult.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code AbstractResult}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Address> AbstractResult.Meta<R> metaAbstractResult(Class<R> cls) {
        return AbstractResult.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(AbstractResult.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public AbstractResult.Meta<T> metaBean() {
        return AbstractResult.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the docs.
     * @return the value of the property
     */
    public List<T> getDocs() {
        return docs;
    }

    /**
     * Sets the docs.
     * @param docs  the new value of the property
     */
    public void setDocs(List<T> docs) {
        this.docs = docs;
    }

    /**
     * Gets the the {@code docs} property.
     * @return the property, not null
     */
    public final Property<List<T>> docs() {
        return metaBean().docs().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the the {@code resultType} property.
     * @return the property, not null
     */
    public final Property<String> resultType() {
        return metaBean().resultType().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            AbstractResult<?> other = (AbstractResult<?>) obj;
            return JodaBeanUtils.equal(getDocs(), other.getDocs()) &&
                    JodaBeanUtils.equal(getResultType(), other.getResultType());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getDocs());
        hash += hash * 31 + JodaBeanUtils.hashCode(getResultType());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append(getClass().getSimpleName());
        buf.append('{');
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("docs").append('=').append(getDocs()).append(',').append(' ');
        buf.append("resultType").append('=').append(getResultType()).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code AbstractResult}.
     */
    public static class Meta<T extends Address> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code docs} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<T>> docs = DirectMetaProperty.ofReadWrite(
                this, "docs", AbstractResult.class, (Class) List.class);
        /**
         * The meta-property for the {@code resultType} property.
         */
        private final MetaProperty<String> resultType = DirectMetaProperty.ofReadOnly(
                this, "resultType", AbstractResult.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "docs",
                "resultType");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3088955:  // docs
                    return docs;
                case -571837193:  // resultType
                    return resultType;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends AbstractResult<T>> builder() {
            throw new UnsupportedOperationException("AbstractResult is an abstract class");
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends AbstractResult<T>> beanType() {
            return (Class) AbstractResult.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code docs} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<T>> docs() {
            return docs;
        }

        /**
         * The meta-property for the {@code resultType} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> resultType() {
            return resultType;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3088955:  // docs
                    return ((AbstractResult<?>) bean).getDocs();
                case -571837193:  // resultType
                    return ((AbstractResult<?>) bean).getResultType();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3088955:  // docs
                    ((AbstractResult<T>) bean).setDocs((List<T>) newValue);
                    return;
                case -571837193:  // resultType
                    if (quiet) {
                        return;
                    }
                    throw new UnsupportedOperationException("Property cannot be written: resultType");
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
