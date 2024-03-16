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
 * struct _AtkHypertextIface {
 *     GTypeInterface parent;
 *     AtkHyperlink *(*get_link)(AtkHypertext *, gint);
 *     gint (*get_n_links)(AtkHypertext *);
 *     gint (*get_link_index)(AtkHypertext *, gint);
 *     void (*link_selected)(AtkHypertext *, gint);
 * }
 * }
 */
public class _AtkHypertextIface {

    _AtkHypertextIface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("parent"),
        app_indicator_h.C_POINTER.withName("get_link"),
        app_indicator_h.C_POINTER.withName("get_n_links"),
        app_indicator_h.C_POINTER.withName("get_link_index"),
        app_indicator_h.C_POINTER.withName("link_selected")
    ).withName("_AtkHypertextIface");

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
     * AtkHyperlink *(*get_link)(AtkHypertext *, gint)
     * }
     */
    public class get_link {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_link.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_link.Function fi, Arena arena) {
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

    private static final AddressLayout get_link$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_link"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AtkHyperlink *(*get_link)(AtkHypertext *, gint)
     * }
     */
    public static final AddressLayout get_link$layout() {
        return get_link$LAYOUT;
    }

    private static final long get_link$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AtkHyperlink *(*get_link)(AtkHypertext *, gint)
     * }
     */
    public static final long get_link$offset() {
        return get_link$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AtkHyperlink *(*get_link)(AtkHypertext *, gint)
     * }
     */
    public static MemorySegment get_link(MemorySegment struct) {
        return struct.get(get_link$LAYOUT, get_link$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AtkHyperlink *(*get_link)(AtkHypertext *, gint)
     * }
     */
    public static void get_link(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_link$LAYOUT, get_link$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint (*get_n_links)(AtkHypertext *)
     * }
     */
    public class get_n_links {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_n_links.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_n_links.Function fi, Arena arena) {
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

    private static final AddressLayout get_n_links$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_n_links"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint (*get_n_links)(AtkHypertext *)
     * }
     */
    public static final AddressLayout get_n_links$layout() {
        return get_n_links$LAYOUT;
    }

    private static final long get_n_links$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint (*get_n_links)(AtkHypertext *)
     * }
     */
    public static final long get_n_links$offset() {
        return get_n_links$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint (*get_n_links)(AtkHypertext *)
     * }
     */
    public static MemorySegment get_n_links(MemorySegment struct) {
        return struct.get(get_n_links$LAYOUT, get_n_links$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint (*get_n_links)(AtkHypertext *)
     * }
     */
    public static void get_n_links(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_n_links$LAYOUT, get_n_links$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint (*get_link_index)(AtkHypertext *, gint)
     * }
     */
    public class get_link_index {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_link_index.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_link_index.Function fi, Arena arena) {
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

    private static final AddressLayout get_link_index$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_link_index"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint (*get_link_index)(AtkHypertext *, gint)
     * }
     */
    public static final AddressLayout get_link_index$layout() {
        return get_link_index$LAYOUT;
    }

    private static final long get_link_index$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint (*get_link_index)(AtkHypertext *, gint)
     * }
     */
    public static final long get_link_index$offset() {
        return get_link_index$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint (*get_link_index)(AtkHypertext *, gint)
     * }
     */
    public static MemorySegment get_link_index(MemorySegment struct) {
        return struct.get(get_link_index$LAYOUT, get_link_index$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint (*get_link_index)(AtkHypertext *, gint)
     * }
     */
    public static void get_link_index(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_link_index$LAYOUT, get_link_index$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*link_selected)(AtkHypertext *, gint)
     * }
     */
    public class link_selected {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(link_selected.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(link_selected.Function fi, Arena arena) {
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

    private static final AddressLayout link_selected$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("link_selected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*link_selected)(AtkHypertext *, gint)
     * }
     */
    public static final AddressLayout link_selected$layout() {
        return link_selected$LAYOUT;
    }

    private static final long link_selected$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*link_selected)(AtkHypertext *, gint)
     * }
     */
    public static final long link_selected$offset() {
        return link_selected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*link_selected)(AtkHypertext *, gint)
     * }
     */
    public static MemorySegment link_selected(MemorySegment struct) {
        return struct.get(link_selected$LAYOUT, link_selected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*link_selected)(AtkHypertext *, gint)
     * }
     */
    public static void link_selected(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(link_selected$LAYOUT, link_selected$OFFSET, fieldValue);
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

