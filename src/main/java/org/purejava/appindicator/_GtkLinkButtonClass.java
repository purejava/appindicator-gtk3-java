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
 * struct _GtkLinkButtonClass {
 *     GtkButtonClass parent_class;
 *     gboolean (*activate_link)(GtkLinkButton *);
 *     void (*_gtk_padding1)(void);
 *     void (*_gtk_padding2)(void);
 *     void (*_gtk_padding3)(void);
 *     void (*_gtk_padding4)(void);
 * }
 * }
 */
public class _GtkLinkButtonClass {

    _GtkLinkButtonClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkButtonClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("activate_link"),
        app_indicator_h.C_POINTER.withName("_gtk_padding1"),
        app_indicator_h.C_POINTER.withName("_gtk_padding2"),
        app_indicator_h.C_POINTER.withName("_gtk_padding3"),
        app_indicator_h.C_POINTER.withName("_gtk_padding4")
    ).withName("_GtkLinkButtonClass");

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
     * GtkButtonClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkButtonClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkButtonClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkButtonClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * gboolean (*activate_link)(GtkLinkButton *)
     * }
     */
    public class activate_link {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(activate_link.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(activate_link.Function fi, Arena arena) {
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

    private static final AddressLayout activate_link$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("activate_link"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*activate_link)(GtkLinkButton *)
     * }
     */
    public static final AddressLayout activate_link$layout() {
        return activate_link$LAYOUT;
    }

    private static final long activate_link$OFFSET = 1088;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*activate_link)(GtkLinkButton *)
     * }
     */
    public static final long activate_link$offset() {
        return activate_link$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*activate_link)(GtkLinkButton *)
     * }
     */
    public static MemorySegment activate_link(MemorySegment struct) {
        return struct.get(activate_link$LAYOUT, activate_link$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*activate_link)(GtkLinkButton *)
     * }
     */
    public static void activate_link(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(activate_link$LAYOUT, activate_link$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_padding1)(void)
     * }
     */
    public class _gtk_padding1 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_padding1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_padding1.Function fi, Arena arena) {
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

    private static final AddressLayout _gtk_padding1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_padding1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_padding1)(void)
     * }
     */
    public static final AddressLayout _gtk_padding1$layout() {
        return _gtk_padding1$LAYOUT;
    }

    private static final long _gtk_padding1$OFFSET = 1096;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_padding1)(void)
     * }
     */
    public static final long _gtk_padding1$offset() {
        return _gtk_padding1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding1)(void)
     * }
     */
    public static MemorySegment _gtk_padding1(MemorySegment struct) {
        return struct.get(_gtk_padding1$LAYOUT, _gtk_padding1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding1)(void)
     * }
     */
    public static void _gtk_padding1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_padding1$LAYOUT, _gtk_padding1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_padding2)(void)
     * }
     */
    public class _gtk_padding2 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_padding2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_padding2.Function fi, Arena arena) {
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

    private static final AddressLayout _gtk_padding2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_padding2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_padding2)(void)
     * }
     */
    public static final AddressLayout _gtk_padding2$layout() {
        return _gtk_padding2$LAYOUT;
    }

    private static final long _gtk_padding2$OFFSET = 1104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_padding2)(void)
     * }
     */
    public static final long _gtk_padding2$offset() {
        return _gtk_padding2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding2)(void)
     * }
     */
    public static MemorySegment _gtk_padding2(MemorySegment struct) {
        return struct.get(_gtk_padding2$LAYOUT, _gtk_padding2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding2)(void)
     * }
     */
    public static void _gtk_padding2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_padding2$LAYOUT, _gtk_padding2$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_padding3)(void)
     * }
     */
    public class _gtk_padding3 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_padding3.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_padding3.Function fi, Arena arena) {
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

    private static final AddressLayout _gtk_padding3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_padding3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_padding3)(void)
     * }
     */
    public static final AddressLayout _gtk_padding3$layout() {
        return _gtk_padding3$LAYOUT;
    }

    private static final long _gtk_padding3$OFFSET = 1112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_padding3)(void)
     * }
     */
    public static final long _gtk_padding3$offset() {
        return _gtk_padding3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding3)(void)
     * }
     */
    public static MemorySegment _gtk_padding3(MemorySegment struct) {
        return struct.get(_gtk_padding3$LAYOUT, _gtk_padding3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding3)(void)
     * }
     */
    public static void _gtk_padding3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_padding3$LAYOUT, _gtk_padding3$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_padding4)(void)
     * }
     */
    public class _gtk_padding4 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_padding4.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_padding4.Function fi, Arena arena) {
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

    private static final AddressLayout _gtk_padding4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_padding4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_padding4)(void)
     * }
     */
    public static final AddressLayout _gtk_padding4$layout() {
        return _gtk_padding4$LAYOUT;
    }

    private static final long _gtk_padding4$OFFSET = 1120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_padding4)(void)
     * }
     */
    public static final long _gtk_padding4$offset() {
        return _gtk_padding4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding4)(void)
     * }
     */
    public static MemorySegment _gtk_padding4(MemorySegment struct) {
        return struct.get(_gtk_padding4$LAYOUT, _gtk_padding4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_padding4)(void)
     * }
     */
    public static void _gtk_padding4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_padding4$LAYOUT, _gtk_padding4$OFFSET, fieldValue);
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

