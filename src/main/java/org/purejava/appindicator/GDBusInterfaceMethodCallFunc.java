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
 * typedef void (*GDBusInterfaceMethodCallFunc)(GDBusConnection *, const gchar *, const gchar *, const gchar *, const gchar *, GVariant *, GDBusMethodInvocation *, gpointer)
 * }
 */
public class GDBusInterfaceMethodCallFunc {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment connection, MemorySegment sender, MemorySegment object_path, MemorySegment interface_name, MemorySegment method_name, MemorySegment parameters, MemorySegment invocation, MemorySegment user_data);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
        app_indicator_h.C_POINTER,
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

    private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(GDBusInterfaceMethodCallFunc.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(GDBusInterfaceMethodCallFunc.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment connection, MemorySegment sender, MemorySegment object_path, MemorySegment interface_name, MemorySegment method_name, MemorySegment parameters, MemorySegment invocation, MemorySegment user_data) {
        try {
             DOWN$MH.invokeExact(funcPtr, connection, sender, object_path, interface_name, method_name, parameters, invocation, user_data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

