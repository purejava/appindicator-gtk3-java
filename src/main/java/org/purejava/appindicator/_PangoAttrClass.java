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
 * struct _PangoAttrClass {
 *     PangoAttrType type;
 *     PangoAttribute *(*copy)(const PangoAttribute *);
 *     void (*destroy)(PangoAttribute *);
 *     gboolean (*equal)(const PangoAttribute *, const PangoAttribute *);
 * }
 * }
 */
public class _PangoAttrClass {

    _PangoAttrClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("copy"),
        app_indicator_h.C_POINTER.withName("destroy"),
        app_indicator_h.C_POINTER.withName("equal")
    ).withName("_PangoAttrClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoAttrType type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoAttrType type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoAttrType type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoAttrType type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * PangoAttribute *(*copy)(const PangoAttribute *)
     * }
     */
    public class copy {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(copy.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(copy.Function fi, Arena arena) {
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

    private static final AddressLayout copy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("copy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoAttribute *(*copy)(const PangoAttribute *)
     * }
     */
    public static final AddressLayout copy$layout() {
        return copy$LAYOUT;
    }

    private static final long copy$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoAttribute *(*copy)(const PangoAttribute *)
     * }
     */
    public static final long copy$offset() {
        return copy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoAttribute *(*copy)(const PangoAttribute *)
     * }
     */
    public static MemorySegment copy(MemorySegment struct) {
        return struct.get(copy$LAYOUT, copy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoAttribute *(*copy)(const PangoAttribute *)
     * }
     */
    public static void copy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(copy$LAYOUT, copy$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*destroy)(PangoAttribute *)
     * }
     */
    public class destroy {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(destroy.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(destroy.Function fi, Arena arena) {
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

    private static final AddressLayout destroy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("destroy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*destroy)(PangoAttribute *)
     * }
     */
    public static final AddressLayout destroy$layout() {
        return destroy$LAYOUT;
    }

    private static final long destroy$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*destroy)(PangoAttribute *)
     * }
     */
    public static final long destroy$offset() {
        return destroy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*destroy)(PangoAttribute *)
     * }
     */
    public static MemorySegment destroy(MemorySegment struct) {
        return struct.get(destroy$LAYOUT, destroy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*destroy)(PangoAttribute *)
     * }
     */
    public static void destroy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(destroy$LAYOUT, destroy$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*equal)(const PangoAttribute *, const PangoAttribute *)
     * }
     */
    public class equal {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(equal.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(equal.Function fi, Arena arena) {
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

    private static final AddressLayout equal$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("equal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*equal)(const PangoAttribute *, const PangoAttribute *)
     * }
     */
    public static final AddressLayout equal$layout() {
        return equal$LAYOUT;
    }

    private static final long equal$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*equal)(const PangoAttribute *, const PangoAttribute *)
     * }
     */
    public static final long equal$offset() {
        return equal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*equal)(const PangoAttribute *, const PangoAttribute *)
     * }
     */
    public static MemorySegment equal(MemorySegment struct) {
        return struct.get(equal$LAYOUT, equal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*equal)(const PangoAttribute *, const PangoAttribute *)
     * }
     */
    public static void equal(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(equal$LAYOUT, equal$OFFSET, fieldValue);
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

