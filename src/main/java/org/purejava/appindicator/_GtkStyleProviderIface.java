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
 * struct _GtkStyleProviderIface {
 *     GTypeInterface g_iface;
 *     GtkStyleProperties *(*get_style)(GtkStyleProvider *, GtkWidgetPath *);
 *     gboolean (*get_style_property)(GtkStyleProvider *, GtkWidgetPath *, GtkStateFlags, GParamSpec *, GValue *);
 *     GtkIconFactory *(*get_icon_factory)(GtkStyleProvider *, GtkWidgetPath *);
 * }
 * }
 */
public class _GtkStyleProviderIface {

    _GtkStyleProviderIface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("g_iface"),
        app_indicator_h.C_POINTER.withName("get_style"),
        app_indicator_h.C_POINTER.withName("get_style_property"),
        app_indicator_h.C_POINTER.withName("get_icon_factory")
    ).withName("_GtkStyleProviderIface");

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
     * GtkStyleProperties *(*get_style)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public class get_style {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_style.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_style.Function fi, Arena arena) {
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

    private static final AddressLayout get_style$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GtkStyleProperties *(*get_style)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static final AddressLayout get_style$layout() {
        return get_style$LAYOUT;
    }

    private static final long get_style$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkStyleProperties *(*get_style)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static final long get_style$offset() {
        return get_style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkStyleProperties *(*get_style)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static MemorySegment get_style(MemorySegment struct) {
        return struct.get(get_style$LAYOUT, get_style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkStyleProperties *(*get_style)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static void get_style(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_style$LAYOUT, get_style$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*get_style_property)(GtkStyleProvider *, GtkWidgetPath *, GtkStateFlags, GParamSpec *, GValue *)
     * }
     */
    public class get_style_property {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_style_property.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_style_property.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_style_property$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_style_property"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*get_style_property)(GtkStyleProvider *, GtkWidgetPath *, GtkStateFlags, GParamSpec *, GValue *)
     * }
     */
    public static final AddressLayout get_style_property$layout() {
        return get_style_property$LAYOUT;
    }

    private static final long get_style_property$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*get_style_property)(GtkStyleProvider *, GtkWidgetPath *, GtkStateFlags, GParamSpec *, GValue *)
     * }
     */
    public static final long get_style_property$offset() {
        return get_style_property$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*get_style_property)(GtkStyleProvider *, GtkWidgetPath *, GtkStateFlags, GParamSpec *, GValue *)
     * }
     */
    public static MemorySegment get_style_property(MemorySegment struct) {
        return struct.get(get_style_property$LAYOUT, get_style_property$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*get_style_property)(GtkStyleProvider *, GtkWidgetPath *, GtkStateFlags, GParamSpec *, GValue *)
     * }
     */
    public static void get_style_property(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_style_property$LAYOUT, get_style_property$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GtkIconFactory *(*get_icon_factory)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public class get_icon_factory {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_icon_factory.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_icon_factory.Function fi, Arena arena) {
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

    private static final AddressLayout get_icon_factory$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_icon_factory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GtkIconFactory *(*get_icon_factory)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static final AddressLayout get_icon_factory$layout() {
        return get_icon_factory$LAYOUT;
    }

    private static final long get_icon_factory$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkIconFactory *(*get_icon_factory)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static final long get_icon_factory$offset() {
        return get_icon_factory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkIconFactory *(*get_icon_factory)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static MemorySegment get_icon_factory(MemorySegment struct) {
        return struct.get(get_icon_factory$LAYOUT, get_icon_factory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkIconFactory *(*get_icon_factory)(GtkStyleProvider *, GtkWidgetPath *)
     * }
     */
    public static void get_icon_factory(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_icon_factory$LAYOUT, get_icon_factory$OFFSET, fieldValue);
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

