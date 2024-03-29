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
 * struct _AtkSelectionIface {
 *     GTypeInterface parent;
 *     gboolean (*add_selection)(AtkSelection *, gint);
 *     gboolean (*clear_selection)(AtkSelection *);
 *     AtkObject *(*ref_selection)(AtkSelection *, gint);
 *     gint (*get_selection_count)(AtkSelection *);
 *     gboolean (*is_child_selected)(AtkSelection *, gint);
 *     gboolean (*remove_selection)(AtkSelection *, gint);
 *     gboolean (*select_all_selection)(AtkSelection *);
 *     void (*selection_changed)(AtkSelection *);
 * }
 * }
 */
public class _AtkSelectionIface {

    _AtkSelectionIface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("parent"),
        app_indicator_h.C_POINTER.withName("add_selection"),
        app_indicator_h.C_POINTER.withName("clear_selection"),
        app_indicator_h.C_POINTER.withName("ref_selection"),
        app_indicator_h.C_POINTER.withName("get_selection_count"),
        app_indicator_h.C_POINTER.withName("is_child_selected"),
        app_indicator_h.C_POINTER.withName("remove_selection"),
        app_indicator_h.C_POINTER.withName("select_all_selection"),
        app_indicator_h.C_POINTER.withName("selection_changed")
    ).withName("_AtkSelectionIface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeInterface parent
     * }
     */
    public static final GroupLayout parent$layout() {
        return parent$LAYOUT;
    }

    private static final long parent$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeInterface parent
     * }
     */
    public static final long parent$offset() {
        return parent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeInterface parent
     * }
     */
    public static MemorySegment parent(MemorySegment struct) {
        return struct.asSlice(parent$OFFSET, parent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeInterface parent
     * }
     */
    public static void parent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent$OFFSET, parent$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * gboolean (*add_selection)(AtkSelection *, gint)
     * }
     */
    public class add_selection {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(add_selection.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(add_selection.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout add_selection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("add_selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*add_selection)(AtkSelection *, gint)
     * }
     */
    public static final AddressLayout add_selection$layout() {
        return add_selection$LAYOUT;
    }

    private static final long add_selection$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*add_selection)(AtkSelection *, gint)
     * }
     */
    public static final long add_selection$offset() {
        return add_selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*add_selection)(AtkSelection *, gint)
     * }
     */
    public static MemorySegment add_selection(MemorySegment struct) {
        return struct.get(add_selection$LAYOUT, add_selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*add_selection)(AtkSelection *, gint)
     * }
     */
    public static void add_selection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(add_selection$LAYOUT, add_selection$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*clear_selection)(AtkSelection *)
     * }
     */
    public class clear_selection {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(clear_selection.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(clear_selection.Function fi, Arena arena) {
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

    private static final AddressLayout clear_selection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("clear_selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*clear_selection)(AtkSelection *)
     * }
     */
    public static final AddressLayout clear_selection$layout() {
        return clear_selection$LAYOUT;
    }

    private static final long clear_selection$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*clear_selection)(AtkSelection *)
     * }
     */
    public static final long clear_selection$offset() {
        return clear_selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*clear_selection)(AtkSelection *)
     * }
     */
    public static MemorySegment clear_selection(MemorySegment struct) {
        return struct.get(clear_selection$LAYOUT, clear_selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*clear_selection)(AtkSelection *)
     * }
     */
    public static void clear_selection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(clear_selection$LAYOUT, clear_selection$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * AtkObject *(*ref_selection)(AtkSelection *, gint)
     * }
     */
    public class ref_selection {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(ref_selection.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(ref_selection.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout ref_selection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ref_selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AtkObject *(*ref_selection)(AtkSelection *, gint)
     * }
     */
    public static final AddressLayout ref_selection$layout() {
        return ref_selection$LAYOUT;
    }

    private static final long ref_selection$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AtkObject *(*ref_selection)(AtkSelection *, gint)
     * }
     */
    public static final long ref_selection$offset() {
        return ref_selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AtkObject *(*ref_selection)(AtkSelection *, gint)
     * }
     */
    public static MemorySegment ref_selection(MemorySegment struct) {
        return struct.get(ref_selection$LAYOUT, ref_selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AtkObject *(*ref_selection)(AtkSelection *, gint)
     * }
     */
    public static void ref_selection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ref_selection$LAYOUT, ref_selection$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint (*get_selection_count)(AtkSelection *)
     * }
     */
    public class get_selection_count {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_selection_count.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_selection_count.Function fi, Arena arena) {
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

    private static final AddressLayout get_selection_count$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_selection_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint (*get_selection_count)(AtkSelection *)
     * }
     */
    public static final AddressLayout get_selection_count$layout() {
        return get_selection_count$LAYOUT;
    }

    private static final long get_selection_count$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint (*get_selection_count)(AtkSelection *)
     * }
     */
    public static final long get_selection_count$offset() {
        return get_selection_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint (*get_selection_count)(AtkSelection *)
     * }
     */
    public static MemorySegment get_selection_count(MemorySegment struct) {
        return struct.get(get_selection_count$LAYOUT, get_selection_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint (*get_selection_count)(AtkSelection *)
     * }
     */
    public static void get_selection_count(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_selection_count$LAYOUT, get_selection_count$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*is_child_selected)(AtkSelection *, gint)
     * }
     */
    public class is_child_selected {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(is_child_selected.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(is_child_selected.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout is_child_selected$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("is_child_selected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*is_child_selected)(AtkSelection *, gint)
     * }
     */
    public static final AddressLayout is_child_selected$layout() {
        return is_child_selected$LAYOUT;
    }

    private static final long is_child_selected$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*is_child_selected)(AtkSelection *, gint)
     * }
     */
    public static final long is_child_selected$offset() {
        return is_child_selected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*is_child_selected)(AtkSelection *, gint)
     * }
     */
    public static MemorySegment is_child_selected(MemorySegment struct) {
        return struct.get(is_child_selected$LAYOUT, is_child_selected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*is_child_selected)(AtkSelection *, gint)
     * }
     */
    public static void is_child_selected(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(is_child_selected$LAYOUT, is_child_selected$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*remove_selection)(AtkSelection *, gint)
     * }
     */
    public class remove_selection {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(remove_selection.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(remove_selection.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout remove_selection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("remove_selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*remove_selection)(AtkSelection *, gint)
     * }
     */
    public static final AddressLayout remove_selection$layout() {
        return remove_selection$LAYOUT;
    }

    private static final long remove_selection$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*remove_selection)(AtkSelection *, gint)
     * }
     */
    public static final long remove_selection$offset() {
        return remove_selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*remove_selection)(AtkSelection *, gint)
     * }
     */
    public static MemorySegment remove_selection(MemorySegment struct) {
        return struct.get(remove_selection$LAYOUT, remove_selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*remove_selection)(AtkSelection *, gint)
     * }
     */
    public static void remove_selection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(remove_selection$LAYOUT, remove_selection$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*select_all_selection)(AtkSelection *)
     * }
     */
    public class select_all_selection {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(select_all_selection.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(select_all_selection.Function fi, Arena arena) {
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

    private static final AddressLayout select_all_selection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("select_all_selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*select_all_selection)(AtkSelection *)
     * }
     */
    public static final AddressLayout select_all_selection$layout() {
        return select_all_selection$LAYOUT;
    }

    private static final long select_all_selection$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*select_all_selection)(AtkSelection *)
     * }
     */
    public static final long select_all_selection$offset() {
        return select_all_selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*select_all_selection)(AtkSelection *)
     * }
     */
    public static MemorySegment select_all_selection(MemorySegment struct) {
        return struct.get(select_all_selection$LAYOUT, select_all_selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*select_all_selection)(AtkSelection *)
     * }
     */
    public static void select_all_selection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(select_all_selection$LAYOUT, select_all_selection$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*selection_changed)(AtkSelection *)
     * }
     */
    public class selection_changed {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(selection_changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(selection_changed.Function fi, Arena arena) {
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

    private static final AddressLayout selection_changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("selection_changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*selection_changed)(AtkSelection *)
     * }
     */
    public static final AddressLayout selection_changed$layout() {
        return selection_changed$LAYOUT;
    }

    private static final long selection_changed$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*selection_changed)(AtkSelection *)
     * }
     */
    public static final long selection_changed$offset() {
        return selection_changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*selection_changed)(AtkSelection *)
     * }
     */
    public static MemorySegment selection_changed(MemorySegment struct) {
        return struct.get(selection_changed$LAYOUT, selection_changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*selection_changed)(AtkSelection *)
     * }
     */
    public static void selection_changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(selection_changed$LAYOUT, selection_changed$OFFSET, fieldValue);
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

