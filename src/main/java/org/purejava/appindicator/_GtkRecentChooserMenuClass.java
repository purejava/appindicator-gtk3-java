// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct _GtkRecentChooserMenuClass {
 *     GtkMenuClass parent_class;
 *     void (*gtk_recent1)(void);
 *     void (*gtk_recent2)(void);
 *     void (*gtk_recent3)(void);
 *     void (*gtk_recent4)(void);
 * }
 * }
 */
public class _GtkRecentChooserMenuClass {

    _GtkRecentChooserMenuClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkMenuClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("gtk_recent1"),
        app_indicator_h.C_POINTER.withName("gtk_recent2"),
        app_indicator_h.C_POINTER.withName("gtk_recent3"),
        app_indicator_h.C_POINTER.withName("gtk_recent4")
    ).withName("_GtkRecentChooserMenuClass");

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
     * GtkMenuClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkMenuClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkMenuClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkMenuClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*gtk_recent1)(void)
     * }
     */
    public class gtk_recent1 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(gtk_recent1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(gtk_recent1.Function fi, Arena arena) {
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

    private static final AddressLayout gtk_recent1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("gtk_recent1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*gtk_recent1)(void)
     * }
     */
    public static final AddressLayout gtk_recent1$layout() {
        return gtk_recent1$LAYOUT;
    }

    private static final long gtk_recent1$OFFSET = 1120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*gtk_recent1)(void)
     * }
     */
    public static final long gtk_recent1$offset() {
        return gtk_recent1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*gtk_recent1)(void)
     * }
     */
    public static MemorySegment gtk_recent1(MemorySegment struct) {
        return struct.get(gtk_recent1$LAYOUT, gtk_recent1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*gtk_recent1)(void)
     * }
     */
    public static void gtk_recent1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(gtk_recent1$LAYOUT, gtk_recent1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*gtk_recent2)(void)
     * }
     */
    public class gtk_recent2 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(gtk_recent2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(gtk_recent2.Function fi, Arena arena) {
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

    private static final AddressLayout gtk_recent2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("gtk_recent2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*gtk_recent2)(void)
     * }
     */
    public static final AddressLayout gtk_recent2$layout() {
        return gtk_recent2$LAYOUT;
    }

    private static final long gtk_recent2$OFFSET = 1128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*gtk_recent2)(void)
     * }
     */
    public static final long gtk_recent2$offset() {
        return gtk_recent2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*gtk_recent2)(void)
     * }
     */
    public static MemorySegment gtk_recent2(MemorySegment struct) {
        return struct.get(gtk_recent2$LAYOUT, gtk_recent2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*gtk_recent2)(void)
     * }
     */
    public static void gtk_recent2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(gtk_recent2$LAYOUT, gtk_recent2$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*gtk_recent3)(void)
     * }
     */
    public class gtk_recent3 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(gtk_recent3.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(gtk_recent3.Function fi, Arena arena) {
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

    private static final AddressLayout gtk_recent3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("gtk_recent3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*gtk_recent3)(void)
     * }
     */
    public static final AddressLayout gtk_recent3$layout() {
        return gtk_recent3$LAYOUT;
    }

    private static final long gtk_recent3$OFFSET = 1136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*gtk_recent3)(void)
     * }
     */
    public static final long gtk_recent3$offset() {
        return gtk_recent3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*gtk_recent3)(void)
     * }
     */
    public static MemorySegment gtk_recent3(MemorySegment struct) {
        return struct.get(gtk_recent3$LAYOUT, gtk_recent3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*gtk_recent3)(void)
     * }
     */
    public static void gtk_recent3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(gtk_recent3$LAYOUT, gtk_recent3$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*gtk_recent4)(void)
     * }
     */
    public class gtk_recent4 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(gtk_recent4.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(gtk_recent4.Function fi, Arena arena) {
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

    private static final AddressLayout gtk_recent4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("gtk_recent4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*gtk_recent4)(void)
     * }
     */
    public static final AddressLayout gtk_recent4$layout() {
        return gtk_recent4$LAYOUT;
    }

    private static final long gtk_recent4$OFFSET = 1144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*gtk_recent4)(void)
     * }
     */
    public static final long gtk_recent4$offset() {
        return gtk_recent4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*gtk_recent4)(void)
     * }
     */
    public static MemorySegment gtk_recent4(MemorySegment struct) {
        return struct.get(gtk_recent4$LAYOUT, gtk_recent4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*gtk_recent4)(void)
     * }
     */
    public static void gtk_recent4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(gtk_recent4$LAYOUT, gtk_recent4$OFFSET, fieldValue);
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

