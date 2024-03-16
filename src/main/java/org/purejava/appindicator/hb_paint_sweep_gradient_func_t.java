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
 * typedef void (*hb_paint_sweep_gradient_func_t)(hb_paint_funcs_t *, void *, hb_color_line_t *, float, float, float, float, void *)
 * }
 */
public class hb_paint_sweep_gradient_func_t {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment funcs, MemorySegment paint_data, MemorySegment color_line, float x0, float y0, float start_angle, float end_angle, MemorySegment user_data);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_FLOAT,
        app_indicator_h.C_FLOAT,
        app_indicator_h.C_FLOAT,
        app_indicator_h.C_FLOAT,
        app_indicator_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(hb_paint_sweep_gradient_func_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(hb_paint_sweep_gradient_func_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment funcs, MemorySegment paint_data, MemorySegment color_line, float x0, float y0, float start_angle, float end_angle, MemorySegment user_data) {
        try {
             DOWN$MH.invokeExact(funcPtr, funcs, paint_data, color_line, x0, y0, start_angle, end_angle, user_data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

