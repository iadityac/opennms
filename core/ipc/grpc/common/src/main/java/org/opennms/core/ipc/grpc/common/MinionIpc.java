/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2019 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2019 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ipc.proto

package org.opennms.core.ipc.grpc.common;

public final class MinionIpc {
  private MinionIpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RpcMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RpcMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RpcMessage_TracingInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RpcMessage_TracingInfoEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SinkMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SinkMessage_TracingInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SinkMessage_TracingInfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\tipc.proto\"\007\n\005Empty\"\236\002\n\nRpcMessage\022\016\n\006r" +
      "pc_id\030\001 \001(\t\022\023\n\013rpc_content\030\002 \001(\014\022\021\n\tsyst" +
      "em_id\030\003 \001(\t\022\020\n\010location\030\004 \001(\t\022\021\n\tmodule_" +
      "id\030\005 \001(\t\022\027\n\017expiration_time\030\006 \001(\004\022\034\n\024cur" +
      "rent_chunk_number\030\007 \001(\005\022\024\n\014total_chunks\030" +
      "\010 \001(\005\0222\n\014tracing_info\030\t \003(\0132\034.RpcMessage" +
      ".TracingInfoEntry\0322\n\020TracingInfoEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\364\001\n\013SinkMe" +
      "ssage\022\022\n\nmessage_id\030\001 \001(\t\022\017\n\007content\030\002 \001" +
      "(\014\022\020\n\010location\030\003 \001(\t\022\021\n\tmodule_id\030\004 \001(\t\022" +
      "\034\n\024current_chunk_number\030\005 \001(\005\022\024\n\014total_c" +
      "hunks\030\006 \001(\005\0223\n\014tracing_info\030\007 \003(\0132\035.Sink" +
      "Message.TracingInfoEntry\0322\n\020TracingInfoE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\0012d\n\007" +
      "OnmsIpc\022.\n\014RpcStreaming\022\013.RpcMessage\032\013.R" +
      "pcMessage\"\000(\0010\001\022)\n\rSinkStreaming\022\014.SinkM" +
      "essage\032\006.Empty\"\000(\001B/\n org.opennms.core.i" +
      "pc.grpc.commonB\tMinionIpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new String[] { });
    internal_static_RpcMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RpcMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RpcMessage_descriptor,
        new String[] { "RpcId", "RpcContent", "SystemId", "Location", "ModuleId", "ExpirationTime", "CurrentChunkNumber", "TotalChunks", "TracingInfo", });
    internal_static_RpcMessage_TracingInfoEntry_descriptor =
      internal_static_RpcMessage_descriptor.getNestedTypes().get(0);
    internal_static_RpcMessage_TracingInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RpcMessage_TracingInfoEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_SinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SinkMessage_descriptor,
        new String[] { "MessageId", "Content", "Location", "ModuleId", "CurrentChunkNumber", "TotalChunks", "TracingInfo", });
    internal_static_SinkMessage_TracingInfoEntry_descriptor =
      internal_static_SinkMessage_descriptor.getNestedTypes().get(0);
    internal_static_SinkMessage_TracingInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SinkMessage_TracingInfoEntry_descriptor,
        new String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
