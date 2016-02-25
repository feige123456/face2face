// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cli_def/chat.proto

package protobuf.generate.cli2srv.chat;

public final class Chat {
  private Chat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CPrivateChatOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string self = 1;
    /**
     * <code>required string self = 1;</code>
     *
     * <pre>
     *发送消息者的userid
     * </pre>
     */
    boolean hasSelf();
    /**
     * <code>required string self = 1;</code>
     *
     * <pre>
     *发送消息者的userid
     * </pre>
     */
    java.lang.String getSelf();
    /**
     * <code>required string self = 1;</code>
     *
     * <pre>
     *发送消息者的userid
     * </pre>
     */
    com.google.protobuf.ByteString
        getSelfBytes();

    // required string dest = 2;
    /**
     * <code>required string dest = 2;</code>
     *
     * <pre>
     *消息目标的userid
     * </pre>
     */
    boolean hasDest();
    /**
     * <code>required string dest = 2;</code>
     *
     * <pre>
     *消息目标的userid
     * </pre>
     */
    java.lang.String getDest();
    /**
     * <code>required string dest = 2;</code>
     *
     * <pre>
     *消息目标的userid
     * </pre>
     */
    com.google.protobuf.ByteString
        getDestBytes();

    // required string content = 3;
    /**
     * <code>required string content = 3;</code>
     *
     * <pre>
     *消息内容
     * </pre>
     */
    boolean hasContent();
    /**
     * <code>required string content = 3;</code>
     *
     * <pre>
     *消息内容
     * </pre>
     */
    java.lang.String getContent();
    /**
     * <code>required string content = 3;</code>
     *
     * <pre>
     *消息内容
     * </pre>
     */
    com.google.protobuf.ByteString
        getContentBytes();
  }
  /**
   * Protobuf type {@code CPrivateChat}
   */
  public static final class CPrivateChat extends
      com.google.protobuf.GeneratedMessage
      implements CPrivateChatOrBuilder {
    // Use CPrivateChat.newBuilder() to construct.
    private CPrivateChat(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CPrivateChat(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CPrivateChat defaultInstance;
    public static CPrivateChat getDefaultInstance() {
      return defaultInstance;
    }

    public CPrivateChat getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CPrivateChat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              self_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              dest_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              content_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.generate.cli2srv.chat.Chat.internal_static_CPrivateChat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.generate.cli2srv.chat.Chat.internal_static_CPrivateChat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.generate.cli2srv.chat.Chat.CPrivateChat.class, protobuf.generate.cli2srv.chat.Chat.CPrivateChat.Builder.class);
    }

    public static com.google.protobuf.Parser<CPrivateChat> PARSER =
        new com.google.protobuf.AbstractParser<CPrivateChat>() {
      public CPrivateChat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CPrivateChat(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CPrivateChat> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string self = 1;
    public static final int SELF_FIELD_NUMBER = 1;
    private java.lang.Object self_;
    /**
     * <code>required string self = 1;</code>
     *
     * <pre>
     *发送消息者的userid
     * </pre>
     */
    public boolean hasSelf() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string self = 1;</code>
     *
     * <pre>
     *发送消息者的userid
     * </pre>
     */
    public java.lang.String getSelf() {
      java.lang.Object ref = self_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          self_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string self = 1;</code>
     *
     * <pre>
     *发送消息者的userid
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSelfBytes() {
      java.lang.Object ref = self_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        self_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string dest = 2;
    public static final int DEST_FIELD_NUMBER = 2;
    private java.lang.Object dest_;
    /**
     * <code>required string dest = 2;</code>
     *
     * <pre>
     *消息目标的userid
     * </pre>
     */
    public boolean hasDest() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string dest = 2;</code>
     *
     * <pre>
     *消息目标的userid
     * </pre>
     */
    public java.lang.String getDest() {
      java.lang.Object ref = dest_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          dest_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string dest = 2;</code>
     *
     * <pre>
     *消息目标的userid
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDestBytes() {
      java.lang.Object ref = dest_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string content = 3;
    public static final int CONTENT_FIELD_NUMBER = 3;
    private java.lang.Object content_;
    /**
     * <code>required string content = 3;</code>
     *
     * <pre>
     *消息内容
     * </pre>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string content = 3;</code>
     *
     * <pre>
     *消息内容
     * </pre>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string content = 3;</code>
     *
     * <pre>
     *消息内容
     * </pre>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      self_ = "";
      dest_ = "";
      content_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSelf()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSelfBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDestBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getContentBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSelfBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDestBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getContentBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.generate.cli2srv.chat.Chat.CPrivateChat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf.generate.cli2srv.chat.Chat.CPrivateChat prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CPrivateChat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protobuf.generate.cli2srv.chat.Chat.CPrivateChatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.generate.cli2srv.chat.Chat.internal_static_CPrivateChat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.generate.cli2srv.chat.Chat.internal_static_CPrivateChat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.generate.cli2srv.chat.Chat.CPrivateChat.class, protobuf.generate.cli2srv.chat.Chat.CPrivateChat.Builder.class);
      }

      // Construct using protobuf.generate.cli2srv.chat.Chat.CPrivateChat.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        self_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        dest_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.generate.cli2srv.chat.Chat.internal_static_CPrivateChat_descriptor;
      }

      public protobuf.generate.cli2srv.chat.Chat.CPrivateChat getDefaultInstanceForType() {
        return protobuf.generate.cli2srv.chat.Chat.CPrivateChat.getDefaultInstance();
      }

      public protobuf.generate.cli2srv.chat.Chat.CPrivateChat build() {
        protobuf.generate.cli2srv.chat.Chat.CPrivateChat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf.generate.cli2srv.chat.Chat.CPrivateChat buildPartial() {
        protobuf.generate.cli2srv.chat.Chat.CPrivateChat result = new protobuf.generate.cli2srv.chat.Chat.CPrivateChat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.self_ = self_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dest_ = dest_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.generate.cli2srv.chat.Chat.CPrivateChat) {
          return mergeFrom((protobuf.generate.cli2srv.chat.Chat.CPrivateChat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.generate.cli2srv.chat.Chat.CPrivateChat other) {
        if (other == protobuf.generate.cli2srv.chat.Chat.CPrivateChat.getDefaultInstance()) return this;
        if (other.hasSelf()) {
          bitField0_ |= 0x00000001;
          self_ = other.self_;
          onChanged();
        }
        if (other.hasDest()) {
          bitField0_ |= 0x00000002;
          dest_ = other.dest_;
          onChanged();
        }
        if (other.hasContent()) {
          bitField0_ |= 0x00000004;
          content_ = other.content_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSelf()) {
          
          return false;
        }
        if (!hasDest()) {
          
          return false;
        }
        if (!hasContent()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protobuf.generate.cli2srv.chat.Chat.CPrivateChat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf.generate.cli2srv.chat.Chat.CPrivateChat) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string self = 1;
      private java.lang.Object self_ = "";
      /**
       * <code>required string self = 1;</code>
       *
       * <pre>
       *发送消息者的userid
       * </pre>
       */
      public boolean hasSelf() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string self = 1;</code>
       *
       * <pre>
       *发送消息者的userid
       * </pre>
       */
      public java.lang.String getSelf() {
        java.lang.Object ref = self_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          self_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string self = 1;</code>
       *
       * <pre>
       *发送消息者的userid
       * </pre>
       */
      public com.google.protobuf.ByteString
          getSelfBytes() {
        java.lang.Object ref = self_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          self_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string self = 1;</code>
       *
       * <pre>
       *发送消息者的userid
       * </pre>
       */
      public Builder setSelf(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        self_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string self = 1;</code>
       *
       * <pre>
       *发送消息者的userid
       * </pre>
       */
      public Builder clearSelf() {
        bitField0_ = (bitField0_ & ~0x00000001);
        self_ = getDefaultInstance().getSelf();
        onChanged();
        return this;
      }
      /**
       * <code>required string self = 1;</code>
       *
       * <pre>
       *发送消息者的userid
       * </pre>
       */
      public Builder setSelfBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        self_ = value;
        onChanged();
        return this;
      }

      // required string dest = 2;
      private java.lang.Object dest_ = "";
      /**
       * <code>required string dest = 2;</code>
       *
       * <pre>
       *消息目标的userid
       * </pre>
       */
      public boolean hasDest() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string dest = 2;</code>
       *
       * <pre>
       *消息目标的userid
       * </pre>
       */
      public java.lang.String getDest() {
        java.lang.Object ref = dest_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          dest_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string dest = 2;</code>
       *
       * <pre>
       *消息目标的userid
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDestBytes() {
        java.lang.Object ref = dest_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dest_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string dest = 2;</code>
       *
       * <pre>
       *消息目标的userid
       * </pre>
       */
      public Builder setDest(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        dest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string dest = 2;</code>
       *
       * <pre>
       *消息目标的userid
       * </pre>
       */
      public Builder clearDest() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dest_ = getDefaultInstance().getDest();
        onChanged();
        return this;
      }
      /**
       * <code>required string dest = 2;</code>
       *
       * <pre>
       *消息目标的userid
       * </pre>
       */
      public Builder setDestBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        dest_ = value;
        onChanged();
        return this;
      }

      // required string content = 3;
      private java.lang.Object content_ = "";
      /**
       * <code>required string content = 3;</code>
       *
       * <pre>
       *消息内容
       * </pre>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string content = 3;</code>
       *
       * <pre>
       *消息内容
       * </pre>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string content = 3;</code>
       *
       * <pre>
       *消息内容
       * </pre>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string content = 3;</code>
       *
       * <pre>
       *消息内容
       * </pre>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 3;</code>
       *
       * <pre>
       *消息内容
       * </pre>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 3;</code>
       *
       * <pre>
       *消息内容
       * </pre>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        content_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CPrivateChat)
    }

    static {
      defaultInstance = new CPrivateChat(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CPrivateChat)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CPrivateChat_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CPrivateChat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022cli_def/chat.proto\";\n\014CPrivateChat\022\014\n\004" +
      "self\030\001 \002(\t\022\014\n\004dest\030\002 \002(\t\022\017\n\007content\030\003 \002(" +
      "\tB&\n\036protobuf.generate.cli2srv.chatB\004Cha" +
      "t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CPrivateChat_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CPrivateChat_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CPrivateChat_descriptor,
              new java.lang.String[] { "Self", "Dest", "Content", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
