// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum hb_unicode_general_category_t (*hb_unicode_funcs_set_general_category_func$func)(struct hb_unicode_funcs_t*,unsigned int,void*);
 * }
 */
public interface hb_unicode_funcs_set_general_category_func$func {

    int apply(java.lang.foreign.MemorySegment ufuncs, int unicode, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_unicode_funcs_set_general_category_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1428.const$0, fi, constants$150.const$0, scope);
    }
    static hb_unicode_funcs_set_general_category_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _ufuncs, int _unicode, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$315.const$3.invokeExact(symbol, _ufuncs, _unicode, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


