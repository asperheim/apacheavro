/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Avro.AvroTestMaven;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AndersBlob extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AndersBlob\",\"namespace\":\"Avro.AvroTestMaven\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"int\",\"null\"]},{\"name\":\"bytes\",\"type\":[{\"type\":\"array\",\"items\":\"bytes\"},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.Integer id;
  @Deprecated public java.util.List<java.nio.ByteBuffer> bytes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public AndersBlob() {}

  /**
   * All-args constructor.
   */
  public AndersBlob(java.lang.CharSequence name, java.lang.Integer id, java.util.List<java.nio.ByteBuffer> bytes) {
    this.name = name;
    this.id = id;
    this.bytes = bytes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return id;
    case 2: return bytes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.Integer)value$; break;
    case 2: bytes = (java.util.List<java.nio.ByteBuffer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'bytes' field.
   */
  public java.util.List<java.nio.ByteBuffer> getBytes() {
    return bytes;
  }

  /**
   * Sets the value of the 'bytes' field.
   * @param value the value to set.
   */
  public void setBytes(java.util.List<java.nio.ByteBuffer> value) {
    this.bytes = value;
  }

  /** Creates a new AndersBlob RecordBuilder */
  public static Avro.AvroTestMaven.AndersBlob.Builder newBuilder() {
    return new Avro.AvroTestMaven.AndersBlob.Builder();
  }
  
  /** Creates a new AndersBlob RecordBuilder by copying an existing Builder */
  public static Avro.AvroTestMaven.AndersBlob.Builder newBuilder(Avro.AvroTestMaven.AndersBlob.Builder other) {
    return new Avro.AvroTestMaven.AndersBlob.Builder(other);
  }
  
  /** Creates a new AndersBlob RecordBuilder by copying an existing AndersBlob instance */
  public static Avro.AvroTestMaven.AndersBlob.Builder newBuilder(Avro.AvroTestMaven.AndersBlob other) {
    return new Avro.AvroTestMaven.AndersBlob.Builder(other);
  }
  
  /**
   * RecordBuilder for AndersBlob instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AndersBlob>
    implements org.apache.avro.data.RecordBuilder<AndersBlob> {

    private java.lang.CharSequence name;
    private java.lang.Integer id;
    private java.util.List<java.nio.ByteBuffer> bytes;

    /** Creates a new Builder */
    private Builder() {
      super(Avro.AvroTestMaven.AndersBlob.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Avro.AvroTestMaven.AndersBlob.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bytes)) {
        this.bytes = data().deepCopy(fields()[2].schema(), other.bytes);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AndersBlob instance */
    private Builder(Avro.AvroTestMaven.AndersBlob other) {
            super(Avro.AvroTestMaven.AndersBlob.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bytes)) {
        this.bytes = data().deepCopy(fields()[2].schema(), other.bytes);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public Avro.AvroTestMaven.AndersBlob.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public Avro.AvroTestMaven.AndersBlob.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.Integer getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public Avro.AvroTestMaven.AndersBlob.Builder setId(java.lang.Integer value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'id' field */
    public Avro.AvroTestMaven.AndersBlob.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'bytes' field */
    public java.util.List<java.nio.ByteBuffer> getBytes() {
      return bytes;
    }
    
    /** Sets the value of the 'bytes' field */
    public Avro.AvroTestMaven.AndersBlob.Builder setBytes(java.util.List<java.nio.ByteBuffer> value) {
      validate(fields()[2], value);
      this.bytes = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'bytes' field has been set */
    public boolean hasBytes() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'bytes' field */
    public Avro.AvroTestMaven.AndersBlob.Builder clearBytes() {
      bytes = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    public AndersBlob build() {
      try {
        AndersBlob record = new AndersBlob();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.Integer) defaultValue(fields()[1]);
        record.bytes = fieldSetFlags()[2] ? this.bytes : (java.util.List<java.nio.ByteBuffer>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
