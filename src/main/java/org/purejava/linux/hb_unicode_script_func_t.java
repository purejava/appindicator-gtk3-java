// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface hb_unicode_script_func_t {

    int apply(java.lang.foreign.MemoryAddress ufuncs, int unicode, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(hb_unicode_script_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(hb_unicode_script_func_t.class, fi, constants$996.hb_unicode_script_func_t$FUNC, session);
    }
    static hb_unicode_script_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ufuncs, int _unicode, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$996.hb_unicode_script_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ufuncs, _unicode, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


