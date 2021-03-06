/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVirtualNodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     */
    private VirtualNodeData virtualNode;

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     * 
     * @param virtualNode
     *        The full description of your virtual node.
     */

    public void setVirtualNode(VirtualNodeData virtualNode) {
        this.virtualNode = virtualNode;
    }

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     * 
     * @return The full description of your virtual node.
     */

    public VirtualNodeData getVirtualNode() {
        return this.virtualNode;
    }

    /**
     * <p>
     * The full description of your virtual node.
     * </p>
     * 
     * @param virtualNode
     *        The full description of your virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualNodeResult withVirtualNode(VirtualNodeData virtualNode) {
        setVirtualNode(virtualNode);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVirtualNode() != null)
            sb.append("VirtualNode: ").append(getVirtualNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualNodeResult == false)
            return false;
        DescribeVirtualNodeResult other = (DescribeVirtualNodeResult) obj;
        if (other.getVirtualNode() == null ^ this.getVirtualNode() == null)
            return false;
        if (other.getVirtualNode() != null && other.getVirtualNode().equals(this.getVirtualNode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualNode() == null) ? 0 : getVirtualNode().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVirtualNodeResult clone() {
        try {
            return (DescribeVirtualNodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
