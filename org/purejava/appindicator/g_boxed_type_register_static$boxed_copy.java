// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*g_boxed_type_register_static$boxed_copy)(void*);
 * }
 */
public interface g_boxed_type_register_static$boxed_copy {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_boxed_type_register_static$boxed_copy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$620.const$5, fi, constants$5.const$2, scope);
    }
    static g_boxed_type_register_static$boxed_copy ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

