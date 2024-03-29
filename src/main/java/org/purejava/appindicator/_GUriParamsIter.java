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
 * struct _GUriParamsIter {
 *     gint dummy0;
 *     gpointer dummy1;
 *     gpointer dummy2;
 *     guint8 dummy3[256];
 * }
 * }
 */
public class _GUriParamsIter {

    _GUriParamsIter() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("dummy0"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("dummy1"),
        app_indicator_h.C_POINTER.withName("dummy2"),
        MemoryLayout.sequenceLayout(256, app_indicator_h.C_CHAR).withName("dummy3")
    ).withName("_GUriParamsIter");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dummy0$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy0
     * }
     */
    public static final OfInt dummy0$layout() {
        return dummy0$LAYOUT;
    }

    private static final long dummy0$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy0
     * }
     */
    public static final long dummy0$offset() {
        return dummy0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy0
     * }
     */
    public static int dummy0(MemorySegment struct) {
        return struct.get(dummy0$LAYOUT, dummy0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy0
     * }
     */
    public static void dummy0(MemorySegment struct, int fieldValue) {
        struct.set(dummy0$LAYOUT, dummy0$OFFSET, fieldValue);
    }

    private static final AddressLayout dummy1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dummy1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer dummy1
     * }
     */
    public static final AddressLayout dummy1$layout() {
        return dummy1$LAYOUT;
    }

    private static final long dummy1$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer dummy1
     * }
     */
    public static final long dummy1$offset() {
        return dummy1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer dummy1
     * }
     */
    public static MemorySegment dummy1(MemorySegment struct) {
        return struct.get(dummy1$LAYOUT, dummy1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer dummy1
     * }
     */
    public static void dummy1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dummy1$LAYOUT, dummy1$OFFSET, fieldValue);
    }

    private static final AddressLayout dummy2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dummy2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer dummy2
     * }
     */
    public static final AddressLayout dummy2$layout() {
        return dummy2$LAYOUT;
    }

    private static final long dummy2$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer dummy2
     * }
     */
    public static final long dummy2$offset() {
        return dummy2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer dummy2
     * }
     */
    public static MemorySegment dummy2(MemorySegment struct) {
        return struct.get(dummy2$LAYOUT, dummy2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer dummy2
     * }
     */
    public static void dummy2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dummy2$LAYOUT, dummy2$OFFSET, fieldValue);
    }

    private static final SequenceLayout dummy3$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("dummy3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static final SequenceLayout dummy3$layout() {
        return dummy3$LAYOUT;
    }

    private static final long dummy3$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static final long dummy3$offset() {
        return dummy3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static MemorySegment dummy3(MemorySegment struct) {
        return struct.asSlice(dummy3$OFFSET, dummy3$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static void dummy3(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dummy3$OFFSET, dummy3$LAYOUT.byteSize());
    }

    private static long[] dummy3$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static long[] dummy3$dimensions() {
        return dummy3$DIMS;
    }
    private static final VarHandle dummy3$ELEM_HANDLE = dummy3$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static byte dummy3(MemorySegment struct, long index0) {
        return (byte)dummy3$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * guint8 dummy3[256]
     * }
     */
    public static void dummy3(MemorySegment struct, long index0, byte fieldValue) {
        dummy3$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

