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
 * struct _GPollableInputStreamInterface {
 *     GTypeInterface g_iface;
 *     gboolean (*can_poll)(GPollableInputStream *);
 *     gboolean (*is_readable)(GPollableInputStream *);
 *     GSource *(*create_source)(GPollableInputStream *, GCancellable *);
 *     gssize (*read_nonblocking)(GPollableInputStream *, void *, gsize, GError **);
 * }
 * }
 */
public class _GPollableInputStreamInterface {

    _GPollableInputStreamInterface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("g_iface"),
        app_indicator_h.C_POINTER.withName("can_poll"),
        app_indicator_h.C_POINTER.withName("is_readable"),
        app_indicator_h.C_POINTER.withName("create_source"),
        app_indicator_h.C_POINTER.withName("read_nonblocking")
    ).withName("_GPollableInputStreamInterface");

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
     * gboolean (*can_poll)(GPollableInputStream *)
     * }
     */
    public class can_poll {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(can_poll.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(can_poll.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout can_poll$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("can_poll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*can_poll)(GPollableInputStream *)
     * }
     */
    public static final AddressLayout can_poll$layout() {
        return can_poll$LAYOUT;
    }

    private static final long can_poll$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*can_poll)(GPollableInputStream *)
     * }
     */
    public static final long can_poll$offset() {
        return can_poll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*can_poll)(GPollableInputStream *)
     * }
     */
    public static MemorySegment can_poll(MemorySegment struct) {
        return struct.get(can_poll$LAYOUT, can_poll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*can_poll)(GPollableInputStream *)
     * }
     */
    public static void can_poll(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(can_poll$LAYOUT, can_poll$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*is_readable)(GPollableInputStream *)
     * }
     */
    public class is_readable {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(is_readable.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(is_readable.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout is_readable$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("is_readable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*is_readable)(GPollableInputStream *)
     * }
     */
    public static final AddressLayout is_readable$layout() {
        return is_readable$LAYOUT;
    }

    private static final long is_readable$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*is_readable)(GPollableInputStream *)
     * }
     */
    public static final long is_readable$offset() {
        return is_readable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*is_readable)(GPollableInputStream *)
     * }
     */
    public static MemorySegment is_readable(MemorySegment struct) {
        return struct.get(is_readable$LAYOUT, is_readable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*is_readable)(GPollableInputStream *)
     * }
     */
    public static void is_readable(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(is_readable$LAYOUT, is_readable$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GSource *(*create_source)(GPollableInputStream *, GCancellable *)
     * }
     */
    public class create_source {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(create_source.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(create_source.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout create_source$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("create_source"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSource *(*create_source)(GPollableInputStream *, GCancellable *)
     * }
     */
    public static final AddressLayout create_source$layout() {
        return create_source$LAYOUT;
    }

    private static final long create_source$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSource *(*create_source)(GPollableInputStream *, GCancellable *)
     * }
     */
    public static final long create_source$offset() {
        return create_source$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSource *(*create_source)(GPollableInputStream *, GCancellable *)
     * }
     */
    public static MemorySegment create_source(MemorySegment struct) {
        return struct.get(create_source$LAYOUT, create_source$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSource *(*create_source)(GPollableInputStream *, GCancellable *)
     * }
     */
    public static void create_source(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(create_source$LAYOUT, create_source$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gssize (*read_nonblocking)(GPollableInputStream *, void *, gsize, GError **)
     * }
     */
    public class read_nonblocking {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, MemorySegment _x1, long _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_LONG,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_LONG,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(read_nonblocking.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(read_nonblocking.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, long _x2, MemorySegment _x3) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout read_nonblocking$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("read_nonblocking"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gssize (*read_nonblocking)(GPollableInputStream *, void *, gsize, GError **)
     * }
     */
    public static final AddressLayout read_nonblocking$layout() {
        return read_nonblocking$LAYOUT;
    }

    private static final long read_nonblocking$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gssize (*read_nonblocking)(GPollableInputStream *, void *, gsize, GError **)
     * }
     */
    public static final long read_nonblocking$offset() {
        return read_nonblocking$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gssize (*read_nonblocking)(GPollableInputStream *, void *, gsize, GError **)
     * }
     */
    public static MemorySegment read_nonblocking(MemorySegment struct) {
        return struct.get(read_nonblocking$LAYOUT, read_nonblocking$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gssize (*read_nonblocking)(GPollableInputStream *, void *, gsize, GError **)
     * }
     */
    public static void read_nonblocking(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(read_nonblocking$LAYOUT, read_nonblocking$OFFSET, fieldValue);
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

