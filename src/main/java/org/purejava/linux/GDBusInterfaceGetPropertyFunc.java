// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GDBusInterfaceGetPropertyFunc {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress connection, java.lang.foreign.MemoryAddress sender, java.lang.foreign.MemoryAddress object_path, java.lang.foreign.MemoryAddress interface_name, java.lang.foreign.MemoryAddress property_name, java.lang.foreign.MemoryAddress error, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GDBusInterfaceGetPropertyFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GDBusInterfaceGetPropertyFunc.class, fi, constants$601.GDBusInterfaceGetPropertyFunc$FUNC, session);
    }
    static GDBusInterfaceGetPropertyFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _connection, java.lang.foreign.MemoryAddress _sender, java.lang.foreign.MemoryAddress _object_path, java.lang.foreign.MemoryAddress _interface_name, java.lang.foreign.MemoryAddress _property_name, java.lang.foreign.MemoryAddress _error, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$601.GDBusInterfaceGetPropertyFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_connection, (java.lang.foreign.Addressable)_sender, (java.lang.foreign.Addressable)_object_path, (java.lang.foreign.Addressable)_interface_name, (java.lang.foreign.Addressable)_property_name, (java.lang.foreign.Addressable)_error, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

