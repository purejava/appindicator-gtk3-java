// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*gtk_recent_filter_add_custom$func)(struct _GtkRecentFilterInfo*,void*);
 * }
 */
public interface gtk_recent_filter_add_custom$func {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(gtk_recent_filter_add_custom$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3022.const$2, fi, constants$9.const$0, scope);
    }
    static gtk_recent_filter_add_custom$func ofAddress(MemorySegment addr, Arena arena) {
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

