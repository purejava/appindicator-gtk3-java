// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef cairo_status_t (*cairo_write_func_t)(void *, const unsigned char *, unsigned int)
 * }
 */
public class cairo_write_func_t {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment closure, MemorySegment data, int length);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        app_indicator_h.C_INT,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(cairo_write_func_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(cairo_write_func_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment closure, MemorySegment data, int length) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, closure, data, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

