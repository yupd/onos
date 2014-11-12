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
package org.onlab.onos.net;

/**
 * Abstraction of a network infrastructure link.
 */
public interface Link extends Annotated, Provided, NetworkResource {

    /**
     * Coarse representation of the link type.
     */
    public enum Type {
        /**
         * Signifies that this is a direct single-segment link.
         */
        DIRECT,

        /**
         * Signifies that this link is potentially comprised from multiple
         * underlying segments or hops, and as such should be used to tag
         * links traversing optical paths, tunnels or intervening 'dark'
         * switches.
         */
        INDIRECT,

        /**
         * Signifies that this link is an edge, i.e. host link.
         */
        EDGE,

        /**
         * Signifies that this link represents a logical link backed by
         * some form of a tunnel.
         */
        TUNNEL,

        /**
         * Signifies that this link is realized by optical connection.
         */
        OPTICAL
    }

    /**
     * Representation of the link state, which applies primarily only to
     * configured durable links, i.e. those that need to remain present,
     * but instead be marked as inactive.
     */
    public enum State {
        /**
         * Signifies that a link is currently active.
         */
        ACTIVE,

        /**
         * Signifies that a link is currently active.
         */
        INACTIVE
    }

    /**
     * Returns the link source connection point.
     *
     * @return link source connection point
     */
    ConnectPoint src();

    /**
     * Returns the link destination connection point.
     *
     * @return link destination connection point
     */
    ConnectPoint dst();

    /**
     * Returns the link type.
     *
     * @return link type
     */
    Type type();

    /**
     * Returns the link state.
     */
    State state();

    /**
     * Indicates if the link is to be considered durable.
     *
     * @return link state
     */
    boolean isDurable();

}
