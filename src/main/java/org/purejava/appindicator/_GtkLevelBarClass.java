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
 * struct _GtkLevelBarClass {
 *     GtkWidgetClass parent_class;
 *     void (*offset_changed)(GtkLevelBar *, const gchar *);
 *     gpointer padding[16];
 * }
 * }
 */
public class _GtkLevelBarClass {

    _GtkLevelBarClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkWidgetClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("offset_changed"),
        MemoryLayout.sequenceLayout(16, app_indicator_h.C_POINTER).withName("padding")
    ).withName("_GtkLevelBarClass");

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
     * GtkWidgetClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkWidgetClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkWidgetClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkWidgetClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*offset_changed)(GtkLevelBar *, const gchar *)
     * }
     */
    public class offset_changed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(offset_changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(offset_changed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout offset_changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("offset_changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*offset_changed)(GtkLevelBar *, const gchar *)
     * }
     */
    public static final AddressLayout offset_changed$layout() {
        return offset_changed$LAYOUT;
    }

    private static final long offset_changed$OFFSET = 824;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*offset_changed)(GtkLevelBar *, const gchar *)
     * }
     */
    public static final long offset_changed$offset() {
        return offset_changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*offset_changed)(GtkLevelBar *, const gchar *)
     * }
     */
    public static MemorySegment offset_changed(MemorySegment struct) {
        return struct.get(offset_changed$LAYOUT, offset_changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*offset_changed)(GtkLevelBar *, const gchar *)
     * }
     */
    public static void offset_changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(offset_changed$LAYOUT, offset_changed$OFFSET, fieldValue);
    }

    private static final SequenceLayout padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static final SequenceLayout padding$layout() {
        return padding$LAYOUT;
    }

    private static final long padding$OFFSET = 832;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static final long padding$offset() {
        return padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static MemorySegment padding(MemorySegment struct) {
        return struct.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static void padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, padding$OFFSET, padding$LAYOUT.byteSize());
    }

    private static long[] padding$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static long[] padding$dimensions() {
        return padding$DIMS;
    }
    private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static MemorySegment padding(MemorySegment struct, long index0) {
        return (MemorySegment)padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer padding[16]
     * }
     */
    public static void padding(MemorySegment struct, long index0, MemorySegment fieldValue) {
        padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

