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
 * struct _GDBusInterfaceSkeletonClass {
 *     GObjectClass parent_class;
 *     GDBusInterfaceInfo *(*get_info)(GDBusInterfaceSkeleton *);
 *     GDBusInterfaceVTable *(*get_vtable)(GDBusInterfaceSkeleton *);
 *     GVariant *(*get_properties)(GDBusInterfaceSkeleton *);
 *     void (*flush)(GDBusInterfaceSkeleton *);
 *     gpointer vfunc_padding[8];
 *     gboolean (*g_authorize_method)(GDBusInterfaceSkeleton *, GDBusMethodInvocation *);
 *     gpointer signal_padding[8];
 * }
 * }
 */
public class _GDBusInterfaceSkeletonClass {

    _GDBusInterfaceSkeletonClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GObjectClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("get_info"),
        app_indicator_h.C_POINTER.withName("get_vtable"),
        app_indicator_h.C_POINTER.withName("get_properties"),
        app_indicator_h.C_POINTER.withName("flush"),
        MemoryLayout.sequenceLayout(8, app_indicator_h.C_POINTER).withName("vfunc_padding"),
        app_indicator_h.C_POINTER.withName("g_authorize_method"),
        MemoryLayout.sequenceLayout(8, app_indicator_h.C_POINTER).withName("signal_padding")
    ).withName("_GDBusInterfaceSkeletonClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * GDBusInterfaceInfo *(*get_info)(GDBusInterfaceSkeleton *)
     * }
     */
    public class get_info {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_info.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_info.Function fi, Arena arena) {
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

    private static final AddressLayout get_info$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_info"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusInterfaceInfo *(*get_info)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final AddressLayout get_info$layout() {
        return get_info$LAYOUT;
    }

    private static final long get_info$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusInterfaceInfo *(*get_info)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final long get_info$offset() {
        return get_info$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusInterfaceInfo *(*get_info)(GDBusInterfaceSkeleton *)
     * }
     */
    public static MemorySegment get_info(MemorySegment struct) {
        return struct.get(get_info$LAYOUT, get_info$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusInterfaceInfo *(*get_info)(GDBusInterfaceSkeleton *)
     * }
     */
    public static void get_info(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_info$LAYOUT, get_info$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GDBusInterfaceVTable *(*get_vtable)(GDBusInterfaceSkeleton *)
     * }
     */
    public class get_vtable {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_vtable.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_vtable.Function fi, Arena arena) {
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

    private static final AddressLayout get_vtable$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_vtable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusInterfaceVTable *(*get_vtable)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final AddressLayout get_vtable$layout() {
        return get_vtable$LAYOUT;
    }

    private static final long get_vtable$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusInterfaceVTable *(*get_vtable)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final long get_vtable$offset() {
        return get_vtable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusInterfaceVTable *(*get_vtable)(GDBusInterfaceSkeleton *)
     * }
     */
    public static MemorySegment get_vtable(MemorySegment struct) {
        return struct.get(get_vtable$LAYOUT, get_vtable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusInterfaceVTable *(*get_vtable)(GDBusInterfaceSkeleton *)
     * }
     */
    public static void get_vtable(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_vtable$LAYOUT, get_vtable$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GVariant *(*get_properties)(GDBusInterfaceSkeleton *)
     * }
     */
    public class get_properties {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_properties.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_properties.Function fi, Arena arena) {
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

    private static final AddressLayout get_properties$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GVariant *(*get_properties)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final AddressLayout get_properties$layout() {
        return get_properties$LAYOUT;
    }

    private static final long get_properties$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GVariant *(*get_properties)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final long get_properties$offset() {
        return get_properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GVariant *(*get_properties)(GDBusInterfaceSkeleton *)
     * }
     */
    public static MemorySegment get_properties(MemorySegment struct) {
        return struct.get(get_properties$LAYOUT, get_properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GVariant *(*get_properties)(GDBusInterfaceSkeleton *)
     * }
     */
    public static void get_properties(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_properties$LAYOUT, get_properties$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*flush)(GDBusInterfaceSkeleton *)
     * }
     */
    public class flush {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(flush.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(flush.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout flush$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("flush"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*flush)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final AddressLayout flush$layout() {
        return flush$LAYOUT;
    }

    private static final long flush$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*flush)(GDBusInterfaceSkeleton *)
     * }
     */
    public static final long flush$offset() {
        return flush$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*flush)(GDBusInterfaceSkeleton *)
     * }
     */
    public static MemorySegment flush(MemorySegment struct) {
        return struct.get(flush$LAYOUT, flush$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*flush)(GDBusInterfaceSkeleton *)
     * }
     */
    public static void flush(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(flush$LAYOUT, flush$OFFSET, fieldValue);
    }

    private static final SequenceLayout vfunc_padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("vfunc_padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static final SequenceLayout vfunc_padding$layout() {
        return vfunc_padding$LAYOUT;
    }

    private static final long vfunc_padding$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static final long vfunc_padding$offset() {
        return vfunc_padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static MemorySegment vfunc_padding(MemorySegment struct) {
        return struct.asSlice(vfunc_padding$OFFSET, vfunc_padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static void vfunc_padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, vfunc_padding$OFFSET, vfunc_padding$LAYOUT.byteSize());
    }

    private static long[] vfunc_padding$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static long[] vfunc_padding$dimensions() {
        return vfunc_padding$DIMS;
    }
    private static final VarHandle vfunc_padding$ELEM_HANDLE = vfunc_padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static MemorySegment vfunc_padding(MemorySegment struct, long index0) {
        return (MemorySegment)vfunc_padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer vfunc_padding[8]
     * }
     */
    public static void vfunc_padding(MemorySegment struct, long index0, MemorySegment fieldValue) {
        vfunc_padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*g_authorize_method)(GDBusInterfaceSkeleton *, GDBusMethodInvocation *)
     * }
     */
    public class g_authorize_method {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(g_authorize_method.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(g_authorize_method.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout g_authorize_method$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("g_authorize_method"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*g_authorize_method)(GDBusInterfaceSkeleton *, GDBusMethodInvocation *)
     * }
     */
    public static final AddressLayout g_authorize_method$layout() {
        return g_authorize_method$LAYOUT;
    }

    private static final long g_authorize_method$OFFSET = 232;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*g_authorize_method)(GDBusInterfaceSkeleton *, GDBusMethodInvocation *)
     * }
     */
    public static final long g_authorize_method$offset() {
        return g_authorize_method$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*g_authorize_method)(GDBusInterfaceSkeleton *, GDBusMethodInvocation *)
     * }
     */
    public static MemorySegment g_authorize_method(MemorySegment struct) {
        return struct.get(g_authorize_method$LAYOUT, g_authorize_method$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*g_authorize_method)(GDBusInterfaceSkeleton *, GDBusMethodInvocation *)
     * }
     */
    public static void g_authorize_method(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(g_authorize_method$LAYOUT, g_authorize_method$OFFSET, fieldValue);
    }

    private static final SequenceLayout signal_padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("signal_padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static final SequenceLayout signal_padding$layout() {
        return signal_padding$LAYOUT;
    }

    private static final long signal_padding$OFFSET = 240;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static final long signal_padding$offset() {
        return signal_padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static MemorySegment signal_padding(MemorySegment struct) {
        return struct.asSlice(signal_padding$OFFSET, signal_padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static void signal_padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, signal_padding$OFFSET, signal_padding$LAYOUT.byteSize());
    }

    private static long[] signal_padding$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static long[] signal_padding$dimensions() {
        return signal_padding$DIMS;
    }
    private static final VarHandle signal_padding$ELEM_HANDLE = signal_padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static MemorySegment signal_padding(MemorySegment struct, long index0) {
        return (MemorySegment)signal_padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer signal_padding[8]
     * }
     */
    public static void signal_padding(MemorySegment struct, long index0, MemorySegment fieldValue) {
        signal_padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

