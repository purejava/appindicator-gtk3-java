// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*g_test_log_set_fatal_handler$log_func)(char*,enum GLogLevelFlags,char*,void*);
 * }
 */
public interface g_test_log_set_fatal_handler$log_func {

    int apply(java.lang.foreign.MemorySegment log_domain, int log_level, java.lang.foreign.MemorySegment message, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_test_log_set_fatal_handler$log_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$464.const$1, fi, constants$11.const$0, scope);
    }
    static g_test_log_set_fatal_handler$log_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _log_domain, int _log_level, java.lang.foreign.MemorySegment _message, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$464.const$0.invokeExact(symbol, _log_domain, _log_level, _message, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


