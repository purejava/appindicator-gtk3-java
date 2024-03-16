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
 * struct _GtkStackSwitcherClass {
 *     GtkBoxClass parent_class;
 *     void (*_gtk_reserved1)(void);
 *     void (*_gtk_reserved2)(void);
 *     void (*_gtk_reserved3)(void);
 *     void (*_gtk_reserved4)(void);
 * }
 * }
 */
public class _GtkStackSwitcherClass {

    _GtkStackSwitcherClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkBoxClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved1"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved2"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved3"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved4")
    ).withName("_GtkStackSwitcherClass");

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
     * void (*_gtk_reserved1)(void)
     * }
     */
    public class _gtk_reserved1 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved1.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved1$layout() {
        return _gtk_reserved1$LAYOUT;
    }

    private static final long _gtk_reserved1$OFFSET = 1008;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static final long _gtk_reserved1$offset() {
        return _gtk_reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static MemorySegment _gtk_reserved1(MemorySegment struct) {
        return struct.get(_gtk_reserved1$LAYOUT, _gtk_reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static void _gtk_reserved1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved1$LAYOUT, _gtk_reserved1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public class _gtk_reserved2 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved2.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved2$layout() {
        return _gtk_reserved2$LAYOUT;
    }

    private static final long _gtk_reserved2$OFFSET = 1016;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static final long _gtk_reserved2$offset() {
        return _gtk_reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static MemorySegment _gtk_reserved2(MemorySegment struct) {
        return struct.get(_gtk_reserved2$LAYOUT, _gtk_reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static void _gtk_reserved2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved2$LAYOUT, _gtk_reserved2$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public class _gtk_reserved3 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved3.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved3.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved3$layout() {
        return _gtk_reserved3$LAYOUT;
    }

    private static final long _gtk_reserved3$OFFSET = 1024;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static final long _gtk_reserved3$offset() {
        return _gtk_reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static MemorySegment _gtk_reserved3(MemorySegment struct) {
        return struct.get(_gtk_reserved3$LAYOUT, _gtk_reserved3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static void _gtk_reserved3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved3$LAYOUT, _gtk_reserved3$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public class _gtk_reserved4 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved4.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved4.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved4$layout() {
        return _gtk_reserved4$LAYOUT;
    }

    private static final long _gtk_reserved4$OFFSET = 1032;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static final long _gtk_reserved4$offset() {
        return _gtk_reserved4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static MemorySegment _gtk_reserved4(MemorySegment struct) {
        return struct.get(_gtk_reserved4$LAYOUT, _gtk_reserved4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static void _gtk_reserved4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved4$LAYOUT, _gtk_reserved4$OFFSET, fieldValue);
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

