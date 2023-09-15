// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GPollFunc)(struct _GPollFD* ufds,unsigned int nfsd,int timeout_);
 * }
 */
public interface GPollFunc {

    int apply(java.lang.foreign.MemorySegment ufds, int nfsd, int timeout_);
    static MemorySegment allocate(GPollFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$247.const$1, fi, constants$49.const$0, scope);
    }
    static GPollFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _ufds, int _nfsd, int _timeout_) -> {
            try {
                return (int)constants$247.const$2.invokeExact(symbol, _ufds, _nfsd, _timeout_);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


