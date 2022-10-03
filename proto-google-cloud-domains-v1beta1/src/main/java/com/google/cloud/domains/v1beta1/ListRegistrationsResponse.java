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
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

/**
 *
 *
 * <pre>
 * Response for the `ListRegistrations` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1beta1.ListRegistrationsResponse}
 */
public final class ListRegistrationsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1beta1.ListRegistrationsResponse)
    ListRegistrationsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListRegistrationsResponse.newBuilder() to construct.
  private ListRegistrationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListRegistrationsResponse() {
    registrations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListRegistrationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.domains.v1beta1.DomainsProto
        .internal_static_google_cloud_domains_v1beta1_ListRegistrationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1beta1.DomainsProto
        .internal_static_google_cloud_domains_v1beta1_ListRegistrationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1beta1.ListRegistrationsResponse.class,
            com.google.cloud.domains.v1beta1.ListRegistrationsResponse.Builder.class);
  }

  public static final int REGISTRATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.domains.v1beta1.Registration> registrations_;
  /**
   *
   *
   * <pre>
   * A list of `Registration`s.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.domains.v1beta1.Registration> getRegistrationsList() {
    return registrations_;
  }
  /**
   *
   *
   * <pre>
   * A list of `Registration`s.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.domains.v1beta1.RegistrationOrBuilder>
      getRegistrationsOrBuilderList() {
    return registrations_;
  }
  /**
   *
   *
   * <pre>
   * A list of `Registration`s.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
   */
  @java.lang.Override
  public int getRegistrationsCount() {
    return registrations_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of `Registration`s.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1beta1.Registration getRegistrations(int index) {
    return registrations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of `Registration`s.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1beta1.RegistrationOrBuilder getRegistrationsOrBuilder(
      int index) {
    return registrations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * When present, there are more results to retrieve. Set `page_token` to this
   * value on a subsequent call to get the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * When present, there are more results to retrieve. Set `page_token` to this
   * value on a subsequent call to get the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < registrations_.size(); i++) {
      output.writeMessage(1, registrations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < registrations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, registrations_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.domains.v1beta1.ListRegistrationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1beta1.ListRegistrationsResponse other =
        (com.google.cloud.domains.v1beta1.ListRegistrationsResponse) obj;

    if (!getRegistrationsList().equals(other.getRegistrationsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRegistrationsCount() > 0) {
      hash = (37 * hash) + REGISTRATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRegistrationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse parseFrom(
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
      com.google.cloud.domains.v1beta1.ListRegistrationsResponse prototype) {
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
   * Response for the `ListRegistrations` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1beta1.ListRegistrationsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1beta1.ListRegistrationsResponse)
      com.google.cloud.domains.v1beta1.ListRegistrationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_ListRegistrationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_ListRegistrationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1beta1.ListRegistrationsResponse.class,
              com.google.cloud.domains.v1beta1.ListRegistrationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.domains.v1beta1.ListRegistrationsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (registrationsBuilder_ == null) {
        registrations_ = java.util.Collections.emptyList();
      } else {
        registrations_ = null;
        registrationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_ListRegistrationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ListRegistrationsResponse getDefaultInstanceForType() {
      return com.google.cloud.domains.v1beta1.ListRegistrationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ListRegistrationsResponse build() {
      com.google.cloud.domains.v1beta1.ListRegistrationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ListRegistrationsResponse buildPartial() {
      com.google.cloud.domains.v1beta1.ListRegistrationsResponse result =
          new com.google.cloud.domains.v1beta1.ListRegistrationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (registrationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          registrations_ = java.util.Collections.unmodifiableList(registrations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.registrations_ = registrations_;
      } else {
        result.registrations_ = registrationsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.domains.v1beta1.ListRegistrationsResponse) {
        return mergeFrom((com.google.cloud.domains.v1beta1.ListRegistrationsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.domains.v1beta1.ListRegistrationsResponse other) {
      if (other == com.google.cloud.domains.v1beta1.ListRegistrationsResponse.getDefaultInstance())
        return this;
      if (registrationsBuilder_ == null) {
        if (!other.registrations_.isEmpty()) {
          if (registrations_.isEmpty()) {
            registrations_ = other.registrations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRegistrationsIsMutable();
            registrations_.addAll(other.registrations_);
          }
          onChanged();
        }
      } else {
        if (!other.registrations_.isEmpty()) {
          if (registrationsBuilder_.isEmpty()) {
            registrationsBuilder_.dispose();
            registrationsBuilder_ = null;
            registrations_ = other.registrations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            registrationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRegistrationsFieldBuilder()
                    : null;
          } else {
            registrationsBuilder_.addAllMessages(other.registrations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                com.google.cloud.domains.v1beta1.Registration m =
                    input.readMessage(
                        com.google.cloud.domains.v1beta1.Registration.parser(), extensionRegistry);
                if (registrationsBuilder_ == null) {
                  ensureRegistrationsIsMutable();
                  registrations_.add(m);
                } else {
                  registrationsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.domains.v1beta1.Registration> registrations_ =
        java.util.Collections.emptyList();

    private void ensureRegistrationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        registrations_ =
            new java.util.ArrayList<com.google.cloud.domains.v1beta1.Registration>(registrations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.domains.v1beta1.Registration,
            com.google.cloud.domains.v1beta1.Registration.Builder,
            com.google.cloud.domains.v1beta1.RegistrationOrBuilder>
        registrationsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public java.util.List<com.google.cloud.domains.v1beta1.Registration> getRegistrationsList() {
      if (registrationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(registrations_);
      } else {
        return registrationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public int getRegistrationsCount() {
      if (registrationsBuilder_ == null) {
        return registrations_.size();
      } else {
        return registrationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.Registration getRegistrations(int index) {
      if (registrationsBuilder_ == null) {
        return registrations_.get(index);
      } else {
        return registrationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder setRegistrations(
        int index, com.google.cloud.domains.v1beta1.Registration value) {
      if (registrationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegistrationsIsMutable();
        registrations_.set(index, value);
        onChanged();
      } else {
        registrationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder setRegistrations(
        int index, com.google.cloud.domains.v1beta1.Registration.Builder builderForValue) {
      if (registrationsBuilder_ == null) {
        ensureRegistrationsIsMutable();
        registrations_.set(index, builderForValue.build());
        onChanged();
      } else {
        registrationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder addRegistrations(com.google.cloud.domains.v1beta1.Registration value) {
      if (registrationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegistrationsIsMutable();
        registrations_.add(value);
        onChanged();
      } else {
        registrationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder addRegistrations(
        int index, com.google.cloud.domains.v1beta1.Registration value) {
      if (registrationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegistrationsIsMutable();
        registrations_.add(index, value);
        onChanged();
      } else {
        registrationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder addRegistrations(
        com.google.cloud.domains.v1beta1.Registration.Builder builderForValue) {
      if (registrationsBuilder_ == null) {
        ensureRegistrationsIsMutable();
        registrations_.add(builderForValue.build());
        onChanged();
      } else {
        registrationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder addRegistrations(
        int index, com.google.cloud.domains.v1beta1.Registration.Builder builderForValue) {
      if (registrationsBuilder_ == null) {
        ensureRegistrationsIsMutable();
        registrations_.add(index, builderForValue.build());
        onChanged();
      } else {
        registrationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder addAllRegistrations(
        java.lang.Iterable<? extends com.google.cloud.domains.v1beta1.Registration> values) {
      if (registrationsBuilder_ == null) {
        ensureRegistrationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, registrations_);
        onChanged();
      } else {
        registrationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder clearRegistrations() {
      if (registrationsBuilder_ == null) {
        registrations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        registrationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public Builder removeRegistrations(int index) {
      if (registrationsBuilder_ == null) {
        ensureRegistrationsIsMutable();
        registrations_.remove(index);
        onChanged();
      } else {
        registrationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.Registration.Builder getRegistrationsBuilder(
        int index) {
      return getRegistrationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.RegistrationOrBuilder getRegistrationsOrBuilder(
        int index) {
      if (registrationsBuilder_ == null) {
        return registrations_.get(index);
      } else {
        return registrationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.domains.v1beta1.RegistrationOrBuilder>
        getRegistrationsOrBuilderList() {
      if (registrationsBuilder_ != null) {
        return registrationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(registrations_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.Registration.Builder addRegistrationsBuilder() {
      return getRegistrationsFieldBuilder()
          .addBuilder(com.google.cloud.domains.v1beta1.Registration.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public com.google.cloud.domains.v1beta1.Registration.Builder addRegistrationsBuilder(
        int index) {
      return getRegistrationsFieldBuilder()
          .addBuilder(index, com.google.cloud.domains.v1beta1.Registration.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of `Registration`s.
     * </pre>
     *
     * <code>repeated .google.cloud.domains.v1beta1.Registration registrations = 1;</code>
     */
    public java.util.List<com.google.cloud.domains.v1beta1.Registration.Builder>
        getRegistrationsBuilderList() {
      return getRegistrationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.domains.v1beta1.Registration,
            com.google.cloud.domains.v1beta1.Registration.Builder,
            com.google.cloud.domains.v1beta1.RegistrationOrBuilder>
        getRegistrationsFieldBuilder() {
      if (registrationsBuilder_ == null) {
        registrationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.domains.v1beta1.Registration,
                com.google.cloud.domains.v1beta1.Registration.Builder,
                com.google.cloud.domains.v1beta1.RegistrationOrBuilder>(
                registrations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        registrations_ = null;
      }
      return registrationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * When present, there are more results to retrieve. Set `page_token` to this
     * value on a subsequent call to get the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * When present, there are more results to retrieve. Set `page_token` to this
     * value on a subsequent call to get the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * When present, there are more results to retrieve. Set `page_token` to this
     * value on a subsequent call to get the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When present, there are more results to retrieve. Set `page_token` to this
     * value on a subsequent call to get the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When present, there are more results to retrieve. Set `page_token` to this
     * value on a subsequent call to get the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1beta1.ListRegistrationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1beta1.ListRegistrationsResponse)
  private static final com.google.cloud.domains.v1beta1.ListRegistrationsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1beta1.ListRegistrationsResponse();
  }

  public static com.google.cloud.domains.v1beta1.ListRegistrationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRegistrationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListRegistrationsResponse>() {
        @java.lang.Override
        public ListRegistrationsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListRegistrationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRegistrationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1beta1.ListRegistrationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
