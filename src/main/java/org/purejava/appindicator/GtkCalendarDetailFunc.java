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
 * typedef gchar *(*GtkCalendarDetailFunc)(GtkCalendar *, guint, guint, guint, gpointer)
 * }
 */
public class GtkCalendarDetailFunc {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        MemorySegment apply(MemorySegment calendar, int year, int month, int day, MemorySegment user_data);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_INT,
        app_indicator_h.C_INT,
        app_indicator_h.C_INT,
        app_indicator_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(GtkCalendarDetailFunc.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(GtkCalendarDetailFunc.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment calendar, int year, int month, int day, MemorySegment user_data) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr, calendar, year, month, day, user_data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

