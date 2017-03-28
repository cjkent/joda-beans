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
import org.joda.beans.MetaBean;

/**
 * Mock tuple, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class TupleNonFinal<X, Y, Z> extends DirectBean {

    /**
     * The first value.
     */
    @PropertyDefinition
    private X first;
    /**
     * The second value.
     */
    @PropertyDefinition
    private Y second;
    /**
     * The third value.
     */
    @PropertyDefinition
    private Z third;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code TupleNonFinal}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static TupleNonFinal.Meta meta() {
        return TupleNonFinal.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code TupleNonFinal}.
     * @param <R>  the first generic type
     * @param <S>  the second generic type
     * @param <T>  the second generic type
     * @param cls1  the first generic type
     * @param cls2  the second generic type
     * @param cls3  the third generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R, S, T> TupleNonFinal.Meta<R, S, T> metaTupleNonFinal(Class<R> cls1, Class<S> cls2, Class<T> cls3) {
        return TupleNonFinal.Meta.INSTANCE;
    }

    static {
        MetaBean.register(TupleNonFinal.Meta.INSTANCE);
    }

    @SuppressWarnings("unchecked")
    @Override
    public TupleNonFinal.Meta<X, Y, Z> metaBean() {
        return TupleNonFinal.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the first value.
     * @return the value of the property
     */
    public X getFirst() {
        return first;
    }

    /**
     * Sets the first value.
     * @param first  the new value of the property
     */
    public void setFirst(X first) {
        this.first = first;
    }

    /**
     * Gets the the {@code first} property.
     * @return the property, not null
     */
    public final Property<X> first() {
        return metaBean().first().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the second value.
     * @return the value of the property
     */
    public Y getSecond() {
        return second;
    }

    /**
     * Sets the second value.
     * @param second  the new value of the property
     */
    public void setSecond(Y second) {
        this.second = second;
    }

    /**
     * Gets the the {@code second} property.
     * @return the property, not null
     */
    public final Property<Y> second() {
        return metaBean().second().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the third value.
     * @return the value of the property
     */
    public Z getThird() {
        return third;
    }

    /**
     * Sets the third value.
     * @param third  the new value of the property
     */
    public void setThird(Z third) {
        this.third = third;
    }

    /**
     * Gets the the {@code third} property.
     * @return the property, not null
     */
    public final Property<Z> third() {
        return metaBean().third().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public TupleNonFinal<X, Y, Z> clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            TupleNonFinal<?, ?, ?> other = (TupleNonFinal<?, ?, ?>) obj;
            return JodaBeanUtils.equal(getFirst(), other.getFirst()) &&
                    JodaBeanUtils.equal(getSecond(), other.getSecond()) &&
                    JodaBeanUtils.equal(getThird(), other.getThird());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getFirst());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSecond());
        hash = hash * 31 + JodaBeanUtils.hashCode(getThird());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("TupleNonFinal{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("first").append('=').append(JodaBeanUtils.toString(getFirst())).append(',').append(' ');
        buf.append("second").append('=').append(JodaBeanUtils.toString(getSecond())).append(',').append(' ');
        buf.append("third").append('=').append(JodaBeanUtils.toString(getThird())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code TupleNonFinal}.
     * @param <X>  the type
     * @param <Y>  the type
     * @param <Z>  the type
     */
    public static class Meta<X, Y, Z> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code first} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<X> first = (DirectMetaProperty) DirectMetaProperty.ofReadWrite(
                this, "first", TupleNonFinal.class, Object.class);
        /**
         * The meta-property for the {@code second} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Y> second = (DirectMetaProperty) DirectMetaProperty.ofReadWrite(
                this, "second", TupleNonFinal.class, Object.class);
        /**
         * The meta-property for the {@code third} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Z> third = (DirectMetaProperty) DirectMetaProperty.ofReadWrite(
                this, "third", TupleNonFinal.class, Object.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "first",
                "second",
                "third");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 97440432:  // first
                    return first;
                case -906279820:  // second
                    return second;
                case 110331239:  // third
                    return third;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends TupleNonFinal<X, Y, Z>> builder() {
            return new DirectBeanBuilder<>(new TupleNonFinal<X, Y, Z>());
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends TupleNonFinal<X, Y, Z>> beanType() {
            return (Class) TupleNonFinal.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code first} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<X> first() {
            return first;
        }

        /**
         * The meta-property for the {@code second} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Y> second() {
            return second;
        }

        /**
         * The meta-property for the {@code third} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Z> third() {
            return third;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 97440432:  // first
                    return ((TupleNonFinal<?, ?, ?>) bean).getFirst();
                case -906279820:  // second
                    return ((TupleNonFinal<?, ?, ?>) bean).getSecond();
                case 110331239:  // third
                    return ((TupleNonFinal<?, ?, ?>) bean).getThird();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 97440432:  // first
                    ((TupleNonFinal<X, Y, Z>) bean).setFirst((X) newValue);
                    return;
                case -906279820:  // second
                    ((TupleNonFinal<X, Y, Z>) bean).setSecond((Y) newValue);
                    return;
                case 110331239:  // third
                    ((TupleNonFinal<X, Y, Z>) bean).setThird((Z) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
