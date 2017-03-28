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

import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.MetaBean;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public final class ImmGenericLinkedRefs<A, B extends Comparable<A>> implements ImmutableBean {
    // two generic types are linked

    /** The name. */
    @PropertyDefinition(validate = "notNull")
    private final A value;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code ImmGenericLinkedRefs}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static ImmGenericLinkedRefs.Meta meta() {
        return ImmGenericLinkedRefs.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code ImmGenericLinkedRefs}.
     * @param <R>  the first generic type
     * @param <S>  the second generic type
     * @param cls1  the first generic type
     * @param cls2  the second generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R, S extends Comparable<R>> ImmGenericLinkedRefs.Meta<R, S> metaImmGenericLinkedRefs(Class<R> cls1, Class<S> cls2) {
        return ImmGenericLinkedRefs.Meta.INSTANCE;
    }

    static {
        MetaBean.register(ImmGenericLinkedRefs.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @param <A>  the type
     * @param <B>  the type
     * @return the builder, not null
     */
    public static <A, B extends Comparable<A>> ImmGenericLinkedRefs.Builder<A, B> builder() {
        return new ImmGenericLinkedRefs.Builder<>();
    }

    private ImmGenericLinkedRefs(
            A value) {
        JodaBeanUtils.notNull(value, "value");
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ImmGenericLinkedRefs.Meta<A, B> metaBean() {
        return ImmGenericLinkedRefs.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property, not null
     */
    public A getValue() {
        return value;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder<A, B> toBuilder() {
        return new Builder<>(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmGenericLinkedRefs<?, ?> other = (ImmGenericLinkedRefs<?, ?>) obj;
            return JodaBeanUtils.equal(value, other.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(value);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("ImmGenericLinkedRefs{");
        buf.append("value").append('=').append(JodaBeanUtils.toString(value));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmGenericLinkedRefs}.
     * @param <A>  the type
     * @param <B>  the type
     */
    public static final class Meta<A, B extends Comparable<A>> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code value} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<A> value = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "value", ImmGenericLinkedRefs.class, Object.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "value");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    return value;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmGenericLinkedRefs.Builder<A, B> builder() {
            return new ImmGenericLinkedRefs.Builder<>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends ImmGenericLinkedRefs<A, B>> beanType() {
            return (Class) ImmGenericLinkedRefs.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code value} property.
         * @return the meta-property, not null
         */
        public MetaProperty<A> value() {
            return value;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    return ((ImmGenericLinkedRefs<?, ?>) bean).getValue();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmGenericLinkedRefs}.
     * @param <A>  the type
     * @param <B>  the type
     */
    public static final class Builder<A, B extends Comparable<A>> extends DirectFieldsBeanBuilder<ImmGenericLinkedRefs<A, B>> {

        private A value;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmGenericLinkedRefs<A, B> beanToCopy) {
            this.value = beanToCopy.getValue();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    return value;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder<A, B> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 111972721:  // value
                    this.value = (A) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder<A, B> set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder<A, B> setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder<A, B> setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        /**
         * @deprecated Loop in application code
         */
        @Override
        @Deprecated
        public Builder<A, B> setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmGenericLinkedRefs<A, B> build() {
            return new ImmGenericLinkedRefs<>(
                    value);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the name.
         * @param value  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder<A, B> value(A value) {
            JodaBeanUtils.notNull(value, "value");
            this.value = value;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(64);
            buf.append("ImmGenericLinkedRefs.Builder{");
            buf.append("value").append('=').append(JodaBeanUtils.toString(value));
            buf.append('}');
            return buf.toString();
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
