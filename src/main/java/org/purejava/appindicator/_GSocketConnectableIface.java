// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct _GSocketConnectableIface {
 *     GTypeInterface g_iface;
 *     GSocketAddressEnumerator *(*enumerate)(GSocketConnectable *);
 *     GSocketAddressEnumerator *(*proxy_enumerate)(GSocketConnectable *);
 *     gchar *(*to_string)(GSocketConnectable *);
 * }
 * }
 */
public class _GSocketConnectableIface {

    _GSocketConnectableIface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("g_iface"),
        app_indicator_h.C_POINTER.withName("enumerate"),
        app_indicator_h.C_POINTER.withName("proxy_enumerate"),
        app_indicator_h.C_POINTER.withName("to_string")
    ).withName("_GSocketConnectableIface");

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
     * GSocketAddressEnumerator *(*enumerate)(GSocketConnectable *)
     * }
     */
    public class enumerate {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(enumerate.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(enumerate.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout enumerate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("enumerate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*enumerate)(GSocketConnectable *)
     * }
     */
    public static final AddressLayout enumerate$layout() {
        return enumerate$LAYOUT;
    }

    private static final long enumerate$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*enumerate)(GSocketConnectable *)
     * }
     */
    public static final long enumerate$offset() {
        return enumerate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*enumerate)(GSocketConnectable *)
     * }
     */
    public static MemorySegment enumerate(MemorySegment struct) {
        return struct.get(enumerate$LAYOUT, enumerate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*enumerate)(GSocketConnectable *)
     * }
     */
    public static void enumerate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(enumerate$LAYOUT, enumerate$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*proxy_enumerate)(GSocketConnectable *)
     * }
     */
    public class proxy_enumerate {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(proxy_enumerate.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(proxy_enumerate.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout proxy_enumerate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("proxy_enumerate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*proxy_enumerate)(GSocketConnectable *)
     * }
     */
    public static final AddressLayout proxy_enumerate$layout() {
        return proxy_enumerate$LAYOUT;
    }

    private static final long proxy_enumerate$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*proxy_enumerate)(GSocketConnectable *)
     * }
     */
    public static final long proxy_enumerate$offset() {
        return proxy_enumerate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*proxy_enumerate)(GSocketConnectable *)
     * }
     */
    public static MemorySegment proxy_enumerate(MemorySegment struct) {
        return struct.get(proxy_enumerate$LAYOUT, proxy_enumerate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSocketAddressEnumerator *(*proxy_enumerate)(GSocketConnectable *)
     * }
     */
    public static void proxy_enumerate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(proxy_enumerate$LAYOUT, proxy_enumerate$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gchar *(*to_string)(GSocketConnectable *)
     * }
     */
    public class to_string {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(to_string.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(to_string.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout to_string$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("to_string"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *(*to_string)(GSocketConnectable *)
     * }
     */
    public static final AddressLayout to_string$layout() {
        return to_string$LAYOUT;
    }

    private static final long to_string$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *(*to_string)(GSocketConnectable *)
     * }
     */
    public static final long to_string$offset() {
        return to_string$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *(*to_string)(GSocketConnectable *)
     * }
     */
    public static MemorySegment to_string(MemorySegment struct) {
        return struct.get(to_string$LAYOUT, to_string$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *(*to_string)(GSocketConnectable *)
     * }
     */
    public static void to_string(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(to_string$LAYOUT, to_string$OFFSET, fieldValue);
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

