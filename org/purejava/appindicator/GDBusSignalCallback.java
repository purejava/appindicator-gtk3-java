// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GDBusSignalCallback)(struct _GDBusConnection* connection,char* sender_name,char* object_path,char* interface_name,char* signal_name,struct _GVariant* parameters,void* user_data);
 * }
 */
public interface GDBusSignalCallback {

    void apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender_name, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment interface_name, java.lang.foreign.MemorySegment signal_name, java.lang.foreign.MemorySegment parameters, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GDBusSignalCallback fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$868.const$2, fi, constants$868.const$1, scope);
    }
    static GDBusSignalCallback ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender_name, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _interface_name, java.lang.foreign.MemorySegment _signal_name, java.lang.foreign.MemorySegment _parameters, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$868.const$3.invokeExact(symbol, _connection, _sender_name, _object_path, _interface_name, _signal_name, _parameters, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

