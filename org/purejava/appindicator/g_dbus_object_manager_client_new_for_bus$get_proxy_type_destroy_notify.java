// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_dbus_object_manager_client_new_for_bus$get_proxy_type_destroy_notify)(void*);
 * }
 */
public interface g_dbus_object_manager_client_new_for_bus$get_proxy_type_destroy_notify {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_dbus_object_manager_client_new_for_bus$get_proxy_type_destroy_notify fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$918.const$5, fi, constants$13.const$1, scope);
    }
    static g_dbus_object_manager_client_new_for_bus$get_proxy_type_destroy_notify ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$13.const$3.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


