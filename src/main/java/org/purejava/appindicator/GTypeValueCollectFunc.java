// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * char* (*GTypeValueCollectFunc)(struct _GValue* value,unsigned int n_collect_values,union _GTypeCValue* collect_values,unsigned int collect_flags);
 * }
 */
public interface GTypeValueCollectFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment value, int n_collect_values, java.lang.foreign.MemorySegment collect_values, int collect_flags);
    static MemorySegment allocate(GTypeValueCollectFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$559.const$3, fi, constants$33.const$0, scope);
    }
    static GTypeValueCollectFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _value, int _n_collect_values, java.lang.foreign.MemorySegment _collect_values, int _collect_flags) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$559.const$4.invokeExact(symbol, _value, _n_collect_values, _collect_values, _collect_flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

