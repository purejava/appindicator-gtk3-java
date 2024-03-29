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
 * struct _GtkGLAreaClass {
 *     GtkWidgetClass parent_class;
 *     gboolean (*render)(GtkGLArea *, GdkGLContext *);
 *     void (*resize)(GtkGLArea *, int, int);
 *     GdkGLContext *(*create_context)(GtkGLArea *);
 *     gpointer _padding[6];
 * }
 * }
 */
public class _GtkGLAreaClass {

    _GtkGLAreaClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkWidgetClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("render"),
        app_indicator_h.C_POINTER.withName("resize"),
        app_indicator_h.C_POINTER.withName("create_context"),
        MemoryLayout.sequenceLayout(6, app_indicator_h.C_POINTER).withName("_padding")
    ).withName("_GtkGLAreaClass");

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
     * gboolean (*render)(GtkGLArea *, GdkGLContext *)
     * }
     */
    public class render {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(render.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(render.Function fi, Arena arena) {
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

    private static final AddressLayout render$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("render"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*render)(GtkGLArea *, GdkGLContext *)
     * }
     */
    public static final AddressLayout render$layout() {
        return render$LAYOUT;
    }

    private static final long render$OFFSET = 824;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*render)(GtkGLArea *, GdkGLContext *)
     * }
     */
    public static final long render$offset() {
        return render$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*render)(GtkGLArea *, GdkGLContext *)
     * }
     */
    public static MemorySegment render(MemorySegment struct) {
        return struct.get(render$LAYOUT, render$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*render)(GtkGLArea *, GdkGLContext *)
     * }
     */
    public static void render(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(render$LAYOUT, render$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*resize)(GtkGLArea *, int, int)
     * }
     */
    public class resize {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(resize.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(resize.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout resize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("resize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*resize)(GtkGLArea *, int, int)
     * }
     */
    public static final AddressLayout resize$layout() {
        return resize$LAYOUT;
    }

    private static final long resize$OFFSET = 832;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*resize)(GtkGLArea *, int, int)
     * }
     */
    public static final long resize$offset() {
        return resize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*resize)(GtkGLArea *, int, int)
     * }
     */
    public static MemorySegment resize(MemorySegment struct) {
        return struct.get(resize$LAYOUT, resize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*resize)(GtkGLArea *, int, int)
     * }
     */
    public static void resize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(resize$LAYOUT, resize$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GdkGLContext *(*create_context)(GtkGLArea *)
     * }
     */
    public class create_context {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(create_context.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(create_context.Function fi, Arena arena) {
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

    private static final AddressLayout create_context$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("create_context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GdkGLContext *(*create_context)(GtkGLArea *)
     * }
     */
    public static final AddressLayout create_context$layout() {
        return create_context$LAYOUT;
    }

    private static final long create_context$OFFSET = 840;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GdkGLContext *(*create_context)(GtkGLArea *)
     * }
     */
    public static final long create_context$offset() {
        return create_context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GdkGLContext *(*create_context)(GtkGLArea *)
     * }
     */
    public static MemorySegment create_context(MemorySegment struct) {
        return struct.get(create_context$LAYOUT, create_context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GdkGLContext *(*create_context)(GtkGLArea *)
     * }
     */
    public static void create_context(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(create_context$LAYOUT, create_context$OFFSET, fieldValue);
    }

    private static final SequenceLayout _padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("_padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static final SequenceLayout _padding$layout() {
        return _padding$LAYOUT;
    }

    private static final long _padding$OFFSET = 848;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static final long _padding$offset() {
        return _padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static MemorySegment _padding(MemorySegment struct) {
        return struct.asSlice(_padding$OFFSET, _padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static void _padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _padding$OFFSET, _padding$LAYOUT.byteSize());
    }

    private static long[] _padding$DIMS = { 6 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static long[] _padding$dimensions() {
        return _padding$DIMS;
    }
    private static final VarHandle _padding$ELEM_HANDLE = _padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static MemorySegment _padding(MemorySegment struct, long index0) {
        return (MemorySegment)_padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer _padding[6]
     * }
     */
    public static void _padding(MemorySegment struct, long index0, MemorySegment fieldValue) {
        _padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

