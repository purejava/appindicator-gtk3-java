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
 * struct _GtkAppChooserWidgetClass {
 *     GtkBoxClass parent_class;
 *     void (*application_selected)(GtkAppChooserWidget *, GAppInfo *);
 *     void (*application_activated)(GtkAppChooserWidget *, GAppInfo *);
 *     void (*populate_popup)(GtkAppChooserWidget *, GtkMenu *, GAppInfo *);
 *     gpointer padding[16];
 * }
 * }
 */
public class _GtkAppChooserWidgetClass {

    _GtkAppChooserWidgetClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkBoxClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("application_selected"),
        app_indicator_h.C_POINTER.withName("application_activated"),
        app_indicator_h.C_POINTER.withName("populate_popup"),
        MemoryLayout.sequenceLayout(16, app_indicator_h.C_POINTER).withName("padding")
    ).withName("_GtkAppChooserWidgetClass");

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
     * GtkBoxClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkBoxClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkBoxClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkBoxClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*application_selected)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public class application_selected {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(application_selected.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(application_selected.Function fi, Arena arena) {
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

    private static final AddressLayout application_selected$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("application_selected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*application_selected)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static final AddressLayout application_selected$layout() {
        return application_selected$LAYOUT;
    }

    private static final long application_selected$OFFSET = 1008;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*application_selected)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static final long application_selected$offset() {
        return application_selected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*application_selected)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static MemorySegment application_selected(MemorySegment struct) {
        return struct.get(application_selected$LAYOUT, application_selected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*application_selected)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static void application_selected(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(application_selected$LAYOUT, application_selected$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*application_activated)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public class application_activated {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(application_activated.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(application_activated.Function fi, Arena arena) {
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

    private static final AddressLayout application_activated$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("application_activated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*application_activated)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static final AddressLayout application_activated$layout() {
        return application_activated$LAYOUT;
    }

    private static final long application_activated$OFFSET = 1016;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*application_activated)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static final long application_activated$offset() {
        return application_activated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*application_activated)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static MemorySegment application_activated(MemorySegment struct) {
        return struct.get(application_activated$LAYOUT, application_activated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*application_activated)(GtkAppChooserWidget *, GAppInfo *)
     * }
     */
    public static void application_activated(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(application_activated$LAYOUT, application_activated$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*populate_popup)(GtkAppChooserWidget *, GtkMenu *, GAppInfo *)
     * }
     */
    public class populate_popup {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(populate_popup.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(populate_popup.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout populate_popup$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("populate_popup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*populate_popup)(GtkAppChooserWidget *, GtkMenu *, GAppInfo *)
     * }
     */
    public static final AddressLayout populate_popup$layout() {
        return populate_popup$LAYOUT;
    }

    private static final long populate_popup$OFFSET = 1024;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*populate_popup)(GtkAppChooserWidget *, GtkMenu *, GAppInfo *)
     * }
     */
    public static final long populate_popup$offset() {
        return populate_popup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*populate_popup)(GtkAppChooserWidget *, GtkMenu *, GAppInfo *)
     * }
     */
    public static MemorySegment populate_popup(MemorySegment struct) {
        return struct.get(populate_popup$LAYOUT, populate_popup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*populate_popup)(GtkAppChooserWidget *, GtkMenu *, GAppInfo *)
     * }
     */
    public static void populate_popup(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(populate_popup$LAYOUT, populate_popup$OFFSET, fieldValue);
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

    private static final long padding$OFFSET = 1032;

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

