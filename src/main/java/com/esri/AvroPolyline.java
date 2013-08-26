/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.esri;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroPolyline extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroPolyline\",\"namespace\":\"com.esri\",\"fields\":[{\"name\":\"spatialReference\",\"type\":{\"type\":\"record\",\"name\":\"AvroSpatialReference\",\"fields\":[{\"name\":\"wkid\",\"type\":\"int\",\"default\":4326}]}},{\"name\":\"paths\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroCoord\",\"fields\":[{\"name\":\"x\",\"type\":\"double\",\"default\":0.0},{\"name\":\"y\",\"type\":\"double\",\"default\":0.0}]}}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.esri.AvroSpatialReference spatialReference;
  @Deprecated public java.util.List<java.util.List<com.esri.AvroCoord>> paths;

  /**
   * Default constructor.
   */
  public AvroPolyline() {}

  /**
   * All-args constructor.
   */
  public AvroPolyline(com.esri.AvroSpatialReference spatialReference, java.util.List<java.util.List<com.esri.AvroCoord>> paths) {
    this.spatialReference = spatialReference;
    this.paths = paths;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return spatialReference;
    case 1: return paths;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: spatialReference = (com.esri.AvroSpatialReference)value$; break;
    case 1: paths = (java.util.List<java.util.List<com.esri.AvroCoord>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'spatialReference' field.
   */
  public com.esri.AvroSpatialReference getSpatialReference() {
    return spatialReference;
  }

  /**
   * Sets the value of the 'spatialReference' field.
   * @param value the value to set.
   */
  public void setSpatialReference(com.esri.AvroSpatialReference value) {
    this.spatialReference = value;
  }

  /**
   * Gets the value of the 'paths' field.
   */
  public java.util.List<java.util.List<com.esri.AvroCoord>> getPaths() {
    return paths;
  }

  /**
   * Sets the value of the 'paths' field.
   * @param value the value to set.
   */
  public void setPaths(java.util.List<java.util.List<com.esri.AvroCoord>> value) {
    this.paths = value;
  }

  /** Creates a new AvroPolyline RecordBuilder */
  public static com.esri.AvroPolyline.Builder newBuilder() {
    return new com.esri.AvroPolyline.Builder();
  }
  
  /** Creates a new AvroPolyline RecordBuilder by copying an existing Builder */
  public static com.esri.AvroPolyline.Builder newBuilder(com.esri.AvroPolyline.Builder other) {
    return new com.esri.AvroPolyline.Builder(other);
  }
  
  /** Creates a new AvroPolyline RecordBuilder by copying an existing AvroPolyline instance */
  public static com.esri.AvroPolyline.Builder newBuilder(com.esri.AvroPolyline other) {
    return new com.esri.AvroPolyline.Builder(other);
  }
  
  /**
   * RecordBuilder for AvroPolyline instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroPolyline>
    implements org.apache.avro.data.RecordBuilder<AvroPolyline> {

    private com.esri.AvroSpatialReference spatialReference;
    private java.util.List<java.util.List<com.esri.AvroCoord>> paths;

    /** Creates a new Builder */
    private Builder() {
      super(com.esri.AvroPolyline.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.esri.AvroPolyline.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing AvroPolyline instance */
    private Builder(com.esri.AvroPolyline other) {
            super(com.esri.AvroPolyline.SCHEMA$);
      if (isValidValue(fields()[0], other.spatialReference)) {
        this.spatialReference = data().deepCopy(fields()[0].schema(), other.spatialReference);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.paths)) {
        this.paths = data().deepCopy(fields()[1].schema(), other.paths);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'spatialReference' field */
    public com.esri.AvroSpatialReference getSpatialReference() {
      return spatialReference;
    }
    
    /** Sets the value of the 'spatialReference' field */
    public com.esri.AvroPolyline.Builder setSpatialReference(com.esri.AvroSpatialReference value) {
      validate(fields()[0], value);
      this.spatialReference = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'spatialReference' field has been set */
    public boolean hasSpatialReference() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'spatialReference' field */
    public com.esri.AvroPolyline.Builder clearSpatialReference() {
      spatialReference = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'paths' field */
    public java.util.List<java.util.List<com.esri.AvroCoord>> getPaths() {
      return paths;
    }
    
    /** Sets the value of the 'paths' field */
    public com.esri.AvroPolyline.Builder setPaths(java.util.List<java.util.List<com.esri.AvroCoord>> value) {
      validate(fields()[1], value);
      this.paths = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'paths' field has been set */
    public boolean hasPaths() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'paths' field */
    public com.esri.AvroPolyline.Builder clearPaths() {
      paths = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AvroPolyline build() {
      try {
        AvroPolyline record = new AvroPolyline();
        record.spatialReference = fieldSetFlags()[0] ? this.spatialReference : (com.esri.AvroSpatialReference) defaultValue(fields()[0]);
        record.paths = fieldSetFlags()[1] ? this.paths : (java.util.List<java.util.List<com.esri.AvroCoord>>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}