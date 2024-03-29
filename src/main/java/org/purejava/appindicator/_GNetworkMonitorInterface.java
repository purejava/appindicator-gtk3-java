// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct _GNetworkMonitorInterface {
 *     GTypeInterface g_iface;
 *     void (*network_changed)(GNetworkMonitor *, gboolean);
 *     gboolean (*can_reach)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GError **);
 *     void (*can_reach_async)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GAsyncReadyCallback, gpointer);
 *     gboolean (*can_reach_finish)(GNetworkMonitor *, GAsyncResult *, GError **);
 * }
 * }
 */
public class _GNetworkMonitorInterface {

    _GNetworkMonitorInterface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("g_iface"),
        app_indicator_h.C_POINTER.withName("network_changed"),
        app_indicator_h.C_POINTER.withName("can_reach"),
        app_indicator_h.C_POINTER.withName("can_reach_async"),
        app_indicator_h.C_POINTER.withName("can_reach_finish")
    ).withName("_GNetworkMonitorInterface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout g_iface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("g_iface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static final GroupLayout g_iface$layout() {
        return g_iface$LAYOUT;
    }

    private static final long g_iface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static final long g_iface$offset() {
        return g_iface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static MemorySegment g_iface(MemorySegment struct) {
        return struct.asSlice(g_iface$OFFSET, g_iface$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static void g_iface(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, g_iface$OFFSET, g_iface$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*network_changed)(GNetworkMonitor *, gboolean)
     * }
     */
    public class network_changed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(network_changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(network_changed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout network_changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("network_changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*network_changed)(GNetworkMonitor *, gboolean)
     * }
     */
    public static final AddressLayout network_changed$layout() {
        return network_changed$LAYOUT;
    }

    private static final long network_changed$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*network_changed)(GNetworkMonitor *, gboolean)
     * }
     */
    public static final long network_changed$offset() {
        return network_changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*network_changed)(GNetworkMonitor *, gboolean)
     * }
     */
    public static MemorySegment network_changed(MemorySegment struct) {
        return struct.get(network_changed$LAYOUT, network_changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*network_changed)(GNetworkMonitor *, gboolean)
     * }
     */
    public static void network_changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(network_changed$LAYOUT, network_changed$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*can_reach)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GError **)
     * }
     */
    public class can_reach {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(can_reach.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(can_reach.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout can_reach$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("can_reach"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*can_reach)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GError **)
     * }
     */
    public static final AddressLayout can_reach$layout() {
        return can_reach$LAYOUT;
    }

    private static final long can_reach$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*can_reach)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GError **)
     * }
     */
    public static final long can_reach$offset() {
        return can_reach$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*can_reach)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GError **)
     * }
     */
    public static MemorySegment can_reach(MemorySegment struct) {
        return struct.get(can_reach$LAYOUT, can_reach$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*can_reach)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GError **)
     * }
     */
    public static void can_reach(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(can_reach$LAYOUT, can_reach$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*can_reach_async)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public class can_reach_async {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(can_reach_async.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(can_reach_async.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout can_reach_async$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("can_reach_async"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*can_reach_async)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static final AddressLayout can_reach_async$layout() {
        return can_reach_async$LAYOUT;
    }

    private static final long can_reach_async$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*can_reach_async)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static final long can_reach_async$offset() {
        return can_reach_async$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*can_reach_async)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static MemorySegment can_reach_async(MemorySegment struct) {
        return struct.get(can_reach_async$LAYOUT, can_reach_async$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*can_reach_async)(GNetworkMonitor *, GSocketConnectable *, GCancellable *, GAsyncReadyCallback, gpointer)
     * }
     */
    public static void can_reach_async(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(can_reach_async$LAYOUT, can_reach_async$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*can_reach_finish)(GNetworkMonitor *, GAsyncResult *, GError **)
     * }
     */
    public class can_reach_finish {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(can_reach_finish.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(can_reach_finish.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout can_reach_finish$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("can_reach_finish"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*can_reach_finish)(GNetworkMonitor *, GAsyncResult *, GError **)
     * }
     */
    public static final AddressLayout can_reach_finish$layout() {
        return can_reach_finish$LAYOUT;
    }

    private static final long can_reach_finish$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*can_reach_finish)(GNetworkMonitor *, GAsyncResult *, GError **)
     * }
     */
    public static final long can_reach_finish$offset() {
        return can_reach_finish$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*can_reach_finish)(GNetworkMonitor *, GAsyncResult *, GError **)
     * }
     */
    public static MemorySegment can_reach_finish(MemorySegment struct) {
        return struct.get(can_reach_finish$LAYOUT, can_reach_finish$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*can_reach_finish)(GNetworkMonitor *, GAsyncResult *, GError **)
     * }
     */
    public static void can_reach_finish(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(can_reach_finish$LAYOUT, can_reach_finish$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

