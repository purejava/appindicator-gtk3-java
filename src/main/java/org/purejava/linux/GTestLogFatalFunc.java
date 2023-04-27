// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GTestLogFatalFunc)(char* log_domain,enum  log_level,char* message,void* user_data);
 * }
 */
public interface GTestLogFatalFunc {

    int apply(java.lang.foreign.MemorySegment log_domain, int log_level, java.lang.foreign.MemorySegment message, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GTestLogFatalFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$323.GTestLogFatalFunc_UP$MH, fi, constants$323.GTestLogFatalFunc$FUNC, scope);
    }
    static GTestLogFatalFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _log_domain, int _log_level, java.lang.foreign.MemorySegment _message, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$323.GTestLogFatalFunc_DOWN$MH.invokeExact(symbol, _log_domain, _log_level, _message, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


