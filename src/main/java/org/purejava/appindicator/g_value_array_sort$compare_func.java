// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*g_value_array_sort$compare_func)(void*,void*);
 * }
 */
public interface g_value_array_sort$compare_func {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_value_array_sort$compare_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$685.const$1, fi, constants$9.const$0, scope);
    }
    static g_value_array_sort$compare_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


