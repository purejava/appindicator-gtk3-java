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
 * struct _GDBusInterfaceVTable {
 *     GDBusInterfaceMethodCallFunc method_call;
 *     GDBusInterfaceGetPropertyFunc get_property;
 *     GDBusInterfaceSetPropertyFunc set_property;
 *     gpointer padding[8];
 * }
 * }
 */
public class _GDBusInterfaceVTable {

    _GDBusInterfaceVTable() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("method_call"),
        app_indicator_h.C_POINTER.withName("get_property"),
        app_indicator_h.C_POINTER.withName("set_property"),
        MemoryLayout.sequenceLayout(8, app_indicator_h.C_POINTER).withName("padding")
    ).withName("_GDBusInterfaceVTable");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout method_call$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("method_call"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusInterfaceMethodCallFunc method_call
     * }
     */
    public static final AddressLayout method_call$layout() {
        return method_call$LAYOUT;
    }

    private static final long method_call$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusInterfaceMethodCallFunc method_call
     * }
     */
    public static final long method_call$offset() {
        return method_call$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusInterfaceMethodCallFunc method_call
     * }
     */
    public static MemorySegment method_call(MemorySegment struct) {
        return struct.get(method_call$LAYOUT, method_call$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusInterfaceMethodCallFunc method_call
     * }
     */
    public static void method_call(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(method_call$LAYOUT, method_call$OFFSET, fieldValue);
    }

    private static final AddressLayout get_property$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_property"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusInterfaceGetPropertyFunc get_property
     * }
     */
    public static final AddressLayout get_property$layout() {
        return get_property$LAYOUT;
    }

    private static final long get_property$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusInterfaceGetPropertyFunc get_property
     * }
     */
    public static final long get_property$offset() {
        return get_property$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusInterfaceGetPropertyFunc get_property
     * }
     */
    public static MemorySegment get_property(MemorySegment struct) {
        return struct.get(get_property$LAYOUT, get_property$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusInterfaceGetPropertyFunc get_property
     * }
     */
    public static void get_property(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_property$LAYOUT, get_property$OFFSET, fieldValue);
    }

    private static final AddressLayout set_property$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_property"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusInterfaceSetPropertyFunc set_property
     * }
     */
    public static final AddressLayout set_property$layout() {
        return set_property$LAYOUT;
    }

    private static final long set_property$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusInterfaceSetPropertyFunc set_property
     * }
     */
    public static final long set_property$offset() {
        return set_property$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusInterfaceSetPropertyFunc set_property
     * }
     */
    public static MemorySegment set_property(MemorySegment struct) {
        return struct.get(set_property$LAYOUT, set_property$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusInterfaceSetPropertyFunc set_property
     * }
     */
    public static void set_property(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_property$LAYOUT, set_property$OFFSET, fieldValue);
    }

    private static final SequenceLayout padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer padding[8]
     * }
     */
    public static final SequenceLayout padding$layout() {
        return padding$LAYOUT;
    }

    private static final long padding$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer padding[8]
     * }
     */
    public static final long padding$offset() {
        return padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer padding[8]
     * }
     */
    public static MemorySegment padding(MemorySegment struct) {
        return struct.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer padding[8]
     * }
     */
    public static void padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, padding$OFFSET, padding$LAYOUT.byteSize());
    }

    private static long[] padding$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer padding[8]
     * }
     */
    public static long[] padding$dimensions() {
        return padding$DIMS;
    }
    private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer padding[8]
     * }
     */
    public static MemorySegment padding(MemorySegment struct, long index0) {
        return (MemorySegment)padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer padding[8]
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

