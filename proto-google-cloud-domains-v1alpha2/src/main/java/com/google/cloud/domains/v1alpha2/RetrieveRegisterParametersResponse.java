/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1alpha2/domains.proto

package com.google.cloud.domains.v1alpha2;

/**
 *
 *
 * <pre>
 * Response for the `RetrieveRegisterParameters` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse}
 */
public final class RetrieveRegisterParametersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse)
    RetrieveRegisterParametersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetrieveRegisterParametersResponse.newBuilder() to construct.
  private RetrieveRegisterParametersResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetrieveRegisterParametersResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetrieveRegisterParametersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RetrieveRegisterParametersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.domains.v1alpha2.RegisterParameters.Builder subBuilder = null;
              if (registerParameters_ != null) {
                subBuilder = registerParameters_.toBuilder();
              }
              registerParameters_ =
                  input.readMessage(
                      com.google.cloud.domains.v1alpha2.RegisterParameters.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(registerParameters_);
                registerParameters_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.domains.v1alpha2.DomainsProto
        .internal_static_google_cloud_domains_v1alpha2_RetrieveRegisterParametersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1alpha2.DomainsProto
        .internal_static_google_cloud_domains_v1alpha2_RetrieveRegisterParametersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.class,
            com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.Builder.class);
  }

  public static final int REGISTER_PARAMETERS_FIELD_NUMBER = 1;
  private com.google.cloud.domains.v1alpha2.RegisterParameters registerParameters_;
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `RegisterDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
   *
   * @return Whether the registerParameters field is set.
   */
  @java.lang.Override
  public boolean hasRegisterParameters() {
    return registerParameters_ != null;
  }
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `RegisterDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
   *
   * @return The registerParameters.
   */
  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.RegisterParameters getRegisterParameters() {
    return registerParameters_ == null
        ? com.google.cloud.domains.v1alpha2.RegisterParameters.getDefaultInstance()
        : registerParameters_;
  }
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `RegisterDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder
      getRegisterParametersOrBuilder() {
    return getRegisterParameters();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (registerParameters_ != null) {
      output.writeMessage(1, getRegisterParameters());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (registerParameters_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRegisterParameters());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse other =
        (com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse) obj;

    if (hasRegisterParameters() != other.hasRegisterParameters()) return false;
    if (hasRegisterParameters()) {
      if (!getRegisterParameters().equals(other.getRegisterParameters())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRegisterParameters()) {
      hash = (37 * hash) + REGISTER_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getRegisterParameters().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the `RetrieveRegisterParameters` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse)
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_RetrieveRegisterParametersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_RetrieveRegisterParametersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.class,
              com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (registerParametersBuilder_ == null) {
        registerParameters_ = null;
      } else {
        registerParameters_ = null;
        registerParametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_RetrieveRegisterParametersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
        getDefaultInstanceForType() {
      return com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse build() {
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse buildPartial() {
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse result =
          new com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse(this);
      if (registerParametersBuilder_ == null) {
        result.registerParameters_ = registerParameters_;
      } else {
        result.registerParameters_ = registerParametersBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse) {
        return mergeFrom(
            (com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse other) {
      if (other
          == com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
              .getDefaultInstance()) return this;
      if (other.hasRegisterParameters()) {
        mergeRegisterParameters(other.getRegisterParameters());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.domains.v1alpha2.RegisterParameters registerParameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1alpha2.RegisterParameters,
            com.google.cloud.domains.v1alpha2.RegisterParameters.Builder,
            com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>
        registerParametersBuilder_;
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     *
     * @return Whether the registerParameters field is set.
     */
    public boolean hasRegisterParameters() {
      return registerParametersBuilder_ != null || registerParameters_ != null;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     *
     * @return The registerParameters.
     */
    public com.google.cloud.domains.v1alpha2.RegisterParameters getRegisterParameters() {
      if (registerParametersBuilder_ == null) {
        return registerParameters_ == null
            ? com.google.cloud.domains.v1alpha2.RegisterParameters.getDefaultInstance()
            : registerParameters_;
      } else {
        return registerParametersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    public Builder setRegisterParameters(
        com.google.cloud.domains.v1alpha2.RegisterParameters value) {
      if (registerParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registerParameters_ = value;
        onChanged();
      } else {
        registerParametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    public Builder setRegisterParameters(
        com.google.cloud.domains.v1alpha2.RegisterParameters.Builder builderForValue) {
      if (registerParametersBuilder_ == null) {
        registerParameters_ = builderForValue.build();
        onChanged();
      } else {
        registerParametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    public Builder mergeRegisterParameters(
        com.google.cloud.domains.v1alpha2.RegisterParameters value) {
      if (registerParametersBuilder_ == null) {
        if (registerParameters_ != null) {
          registerParameters_ =
              com.google.cloud.domains.v1alpha2.RegisterParameters.newBuilder(registerParameters_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          registerParameters_ = value;
        }
        onChanged();
      } else {
        registerParametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    public Builder clearRegisterParameters() {
      if (registerParametersBuilder_ == null) {
        registerParameters_ = null;
        onChanged();
      } else {
        registerParameters_ = null;
        registerParametersBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParameters.Builder
        getRegisterParametersBuilder() {

      onChanged();
      return getRegisterParametersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    public com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder
        getRegisterParametersOrBuilder() {
      if (registerParametersBuilder_ != null) {
        return registerParametersBuilder_.getMessageOrBuilder();
      } else {
        return registerParameters_ == null
            ? com.google.cloud.domains.v1alpha2.RegisterParameters.getDefaultInstance()
            : registerParameters_;
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `RegisterDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.RegisterParameters register_parameters = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1alpha2.RegisterParameters,
            com.google.cloud.domains.v1alpha2.RegisterParameters.Builder,
            com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>
        getRegisterParametersFieldBuilder() {
      if (registerParametersBuilder_ == null) {
        registerParametersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.domains.v1alpha2.RegisterParameters,
                com.google.cloud.domains.v1alpha2.RegisterParameters.Builder,
                com.google.cloud.domains.v1alpha2.RegisterParametersOrBuilder>(
                getRegisterParameters(), getParentForChildren(), isClean());
        registerParameters_ = null;
      }
      return registerParametersBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse)
  private static final com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse();
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveRegisterParametersResponse> PARSER =
      new com.google.protobuf.AbstractParser<RetrieveRegisterParametersResponse>() {
        @java.lang.Override
        public RetrieveRegisterParametersResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RetrieveRegisterParametersResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RetrieveRegisterParametersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveRegisterParametersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.RetrieveRegisterParametersResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
