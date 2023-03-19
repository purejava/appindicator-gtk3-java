// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GDBusSignalCallback {

    void apply(java.lang.foreign.MemoryAddress connection, java.lang.foreign.MemoryAddress sender_name, java.lang.foreign.MemoryAddress object_path, java.lang.foreign.MemoryAddress interface_name, java.lang.foreign.MemoryAddress signal_name, java.lang.foreign.MemoryAddress parameters, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GDBusSignalCallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GDBusSignalCallback.class, fi, constants$604.GDBusSignalCallback$FUNC, session);
    }
    static GDBusSignalCallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _connection, java.lang.foreign.MemoryAddress _sender_name, java.lang.foreign.MemoryAddress _object_path, java.lang.foreign.MemoryAddress _interface_name, java.lang.foreign.MemoryAddress _signal_name, java.lang.foreign.MemoryAddress _parameters, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$604.GDBusSignalCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_connection, (java.lang.foreign.Addressable)_sender_name, (java.lang.foreign.Addressable)_object_path, (java.lang.foreign.Addressable)_interface_name, (java.lang.foreign.Addressable)_signal_name, (java.lang.foreign.Addressable)_parameters, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


