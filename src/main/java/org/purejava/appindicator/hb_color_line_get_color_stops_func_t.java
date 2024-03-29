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
 * typedef unsigned int (*hb_color_line_get_color_stops_func_t)(hb_color_line_t *, void *, unsigned int, unsigned int *, hb_color_stop_t *, void *)
 * }
 */
public class hb_color_line_get_color_stops_func_t {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment color_line, MemorySegment color_line_data, int start, MemorySegment count, MemorySegment color_stops, MemorySegment user_data);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        app_indicator_h.C_INT,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_INT,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(hb_color_line_get_color_stops_func_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(hb_color_line_get_color_stops_func_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment color_line, MemorySegment color_line_data, int start, MemorySegment count, MemorySegment color_stops, MemorySegment user_data) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, color_line, color_line_data, start, count, color_stops, user_data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

