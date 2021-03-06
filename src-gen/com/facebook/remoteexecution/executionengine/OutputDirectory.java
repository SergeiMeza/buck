/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class OutputDirectory implements TBase, java.io.Serializable, Cloneable, Comparable<OutputDirectory> {
  private static final TStruct STRUCT_DESC = new TStruct("OutputDirectory");
  private static final TField PATH_FIELD_DESC = new TField("path", TType.STRING, (short)1);
  private static final TField TREE_DIGEST_FIELD_DESC = new TField("tree_digest", TType.STRUCT, (short)2);

  public String path;
  public com.facebook.remoteexecution.cas.Digest tree_digest;
  public static final int PATH = 1;
  public static final int TREE_DIGEST = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(PATH, new FieldMetaData("path", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(TREE_DIGEST, new FieldMetaData("tree_digest", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.facebook.remoteexecution.cas.Digest.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(OutputDirectory.class, metaDataMap);
  }

  public OutputDirectory() {
  }

  public OutputDirectory(
    String path,
    com.facebook.remoteexecution.cas.Digest tree_digest)
  {
    this();
    this.path = path;
    this.tree_digest = tree_digest;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OutputDirectory(OutputDirectory other) {
    if (other.isSetPath()) {
      this.path = TBaseHelper.deepCopy(other.path);
    }
    if (other.isSetTree_digest()) {
      this.tree_digest = TBaseHelper.deepCopy(other.tree_digest);
    }
  }

  public OutputDirectory deepCopy() {
    return new OutputDirectory(this);
  }

  @Deprecated
  public OutputDirectory clone() {
    return new OutputDirectory(this);
  }

  public String  getPath() {
    return this.path;
  }

  public OutputDirectory setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  // Returns true if field path is set (has been assigned a value) and false otherwise
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public com.facebook.remoteexecution.cas.Digest  getTree_digest() {
    return this.tree_digest;
  }

  public OutputDirectory setTree_digest(com.facebook.remoteexecution.cas.Digest tree_digest) {
    this.tree_digest = tree_digest;
    return this;
  }

  public void unsetTree_digest() {
    this.tree_digest = null;
  }

  // Returns true if field tree_digest is set (has been assigned a value) and false otherwise
  public boolean isSetTree_digest() {
    return this.tree_digest != null;
  }

  public void setTree_digestIsSet(boolean value) {
    if (!value) {
      this.tree_digest = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case TREE_DIGEST:
      if (value == null) {
        unsetTree_digest();
      } else {
        setTree_digest((com.facebook.remoteexecution.cas.Digest)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case PATH:
      return getPath();

    case TREE_DIGEST:
      return getTree_digest();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case PATH:
      return isSetPath();
    case TREE_DIGEST:
      return isSetTree_digest();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OutputDirectory)
      return this.equals((OutputDirectory)that);
    return false;
  }

  public boolean equals(OutputDirectory that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!TBaseHelper.equalsNobinary(this.path, that.path))
        return false;
    }

    boolean this_present_tree_digest = true && this.isSetTree_digest();
    boolean that_present_tree_digest = true && that.isSetTree_digest();
    if (this_present_tree_digest || that_present_tree_digest) {
      if (!(this_present_tree_digest && that_present_tree_digest))
        return false;
      if (!TBaseHelper.equalsNobinary(this.tree_digest, that.tree_digest))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(OutputDirectory other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(path, other.path);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTree_digest()).compareTo(other.isSetTree_digest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(tree_digest, other.tree_digest);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case PATH:
          if (field.type == TType.STRING) {
            this.path = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TREE_DIGEST:
          if (field.type == TType.STRUCT) {
            this.tree_digest = new com.facebook.remoteexecution.cas.Digest();
            this.tree_digest.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeString(this.path);
      oprot.writeFieldEnd();
    }
    if (this.tree_digest != null) {
      oprot.writeFieldBegin(TREE_DIGEST_FIELD_DESC);
      this.tree_digest.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("OutputDirectory");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("path");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getPath() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getPath(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("tree_digest");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getTree_digest() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getTree_digest(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

