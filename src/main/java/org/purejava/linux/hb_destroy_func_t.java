// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*hb_destroy_func_t)(void* user_data);
 * }
 */
public interface hb_destroy_func_t {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(hb_destroy_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$832.hb_destroy_func_t_UP$MH, fi, constants$832.hb_destroy_func_t$FUNC, scope);
    }
    static hb_destroy_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$832.hb_destroy_func_t_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


