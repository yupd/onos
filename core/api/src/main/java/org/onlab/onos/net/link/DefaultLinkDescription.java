/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onlab.onos.net.link;

import com.google.common.base.MoreObjects;
import org.onlab.onos.net.AbstractDescription;
import org.onlab.onos.net.ConnectPoint;
import org.onlab.onos.net.Link;
import org.onlab.onos.net.SparseAnnotations;

/**
 * Default implementation of immutable link description entity.
 */
public class DefaultLinkDescription extends AbstractDescription
        implements LinkDescription {

    private final ConnectPoint src;
    private final ConnectPoint dst;
    private final Link.Type type;

    /**
     * Creates a link description using the supplied information.
     *
     * @param src         link source
     * @param dst         link destination
     * @param type        link type
     * @param annotations optional key/value annotations
     */
    public DefaultLinkDescription(ConnectPoint src, ConnectPoint dst,
                                  Link.Type type, SparseAnnotations... annotations) {
        super(annotations);
        this.src = src;
        this.dst = dst;
        this.type = type;
    }

    @Override
    public ConnectPoint src() {
        return src;
    }

    @Override
    public ConnectPoint dst() {
        return dst;
    }

    @Override
    public Link.Type type() {
        return type;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("src", src())
                .add("dst", dst())
                .add("type", type()).toString();
    }

}
