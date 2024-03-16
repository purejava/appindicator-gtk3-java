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
 * struct _GtkTextIter {
 *     gpointer dummy1;
 *     gpointer dummy2;
 *     gint dummy3;
 *     gint dummy4;
 *     gint dummy5;
 *     gint dummy6;
 *     gint dummy7;
 *     gint dummy8;
 *     gpointer dummy9;
 *     gpointer dummy10;
 *     gint dummy11;
 *     gint dummy12;
 *     gint dummy13;
 *     gpointer dummy14;
 * }
 * }
 */
public class _GtkTextIter {

    _GtkTextIter() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_POINTER.withName("dummy1"),
        app_indicator_h.C_POINTER.withName("dummy2"),
        app_indicator_h.C_INT.withName("dummy3"),
        app_indicator_h.C_INT.withName("dummy4"),
        app_indicator_h.C_INT.withName("dummy5"),
        app_indicator_h.C_INT.withName("dummy6"),
        app_indicator_h.C_INT.withName("dummy7"),
        app_indicator_h.C_INT.withName("dummy8"),
        app_indicator_h.C_POINTER.withName("dummy9"),
        app_indicator_h.C_POINTER.withName("dummy10"),
        app_indicator_h.C_INT.withName("dummy11"),
        app_indicator_h.C_INT.withName("dummy12"),
        app_indicator_h.C_INT.withName("dummy13"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("dummy14")
    ).withName("_GtkTextIter");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long dummy1$OFFSET = 0;

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

    private static final long dummy2$OFFSET = 8;

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

    private static final OfInt dummy3$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy3
     * }
     */
    public static final OfInt dummy3$layout() {
        return dummy3$LAYOUT;
    }

    private static final long dummy3$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy3
     * }
     */
    public static final long dummy3$offset() {
        return dummy3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy3
     * }
     */
    public static int dummy3(MemorySegment struct) {
        return struct.get(dummy3$LAYOUT, dummy3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy3
     * }
     */
    public static void dummy3(MemorySegment struct, int fieldValue) {
        struct.set(dummy3$LAYOUT, dummy3$OFFSET, fieldValue);
    }

    private static final OfInt dummy4$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy4
     * }
     */
    public static final OfInt dummy4$layout() {
        return dummy4$LAYOUT;
    }

    private static final long dummy4$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy4
     * }
     */
    public static final long dummy4$offset() {
        return dummy4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy4
     * }
     */
    public static int dummy4(MemorySegment struct) {
        return struct.get(dummy4$LAYOUT, dummy4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy4
     * }
     */
    public static void dummy4(MemorySegment struct, int fieldValue) {
        struct.set(dummy4$LAYOUT, dummy4$OFFSET, fieldValue);
    }

    private static final OfInt dummy5$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy5"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy5
     * }
     */
    public static final OfInt dummy5$layout() {
        return dummy5$LAYOUT;
    }

    private static final long dummy5$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy5
     * }
     */
    public static final long dummy5$offset() {
        return dummy5$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy5
     * }
     */
    public static int dummy5(MemorySegment struct) {
        return struct.get(dummy5$LAYOUT, dummy5$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy5
     * }
     */
    public static void dummy5(MemorySegment struct, int fieldValue) {
        struct.set(dummy5$LAYOUT, dummy5$OFFSET, fieldValue);
    }

    private static final OfInt dummy6$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy6"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy6
     * }
     */
    public static final OfInt dummy6$layout() {
        return dummy6$LAYOUT;
    }

    private static final long dummy6$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy6
     * }
     */
    public static final long dummy6$offset() {
        return dummy6$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy6
     * }
     */
    public static int dummy6(MemorySegment struct) {
        return struct.get(dummy6$LAYOUT, dummy6$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy6
     * }
     */
    public static void dummy6(MemorySegment struct, int fieldValue) {
        struct.set(dummy6$LAYOUT, dummy6$OFFSET, fieldValue);
    }

    private static final OfInt dummy7$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy7"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy7
     * }
     */
    public static final OfInt dummy7$layout() {
        return dummy7$LAYOUT;
    }

    private static final long dummy7$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy7
     * }
     */
    public static final long dummy7$offset() {
        return dummy7$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy7
     * }
     */
    public static int dummy7(MemorySegment struct) {
        return struct.get(dummy7$LAYOUT, dummy7$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy7
     * }
     */
    public static void dummy7(MemorySegment struct, int fieldValue) {
        struct.set(dummy7$LAYOUT, dummy7$OFFSET, fieldValue);
    }

    private static final OfInt dummy8$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy8"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy8
     * }
     */
    public static final OfInt dummy8$layout() {
        return dummy8$LAYOUT;
    }

    private static final long dummy8$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy8
     * }
     */
    public static final long dummy8$offset() {
        return dummy8$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy8
     * }
     */
    public static int dummy8(MemorySegment struct) {
        return struct.get(dummy8$LAYOUT, dummy8$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy8
     * }
     */
    public static void dummy8(MemorySegment struct, int fieldValue) {
        struct.set(dummy8$LAYOUT, dummy8$OFFSET, fieldValue);
    }

    private static final AddressLayout dummy9$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dummy9"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer dummy9
     * }
     */
    public static final AddressLayout dummy9$layout() {
        return dummy9$LAYOUT;
    }

    private static final long dummy9$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer dummy9
     * }
     */
    public static final long dummy9$offset() {
        return dummy9$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer dummy9
     * }
     */
    public static MemorySegment dummy9(MemorySegment struct) {
        return struct.get(dummy9$LAYOUT, dummy9$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer dummy9
     * }
     */
    public static void dummy9(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dummy9$LAYOUT, dummy9$OFFSET, fieldValue);
    }

    private static final AddressLayout dummy10$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dummy10"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer dummy10
     * }
     */
    public static final AddressLayout dummy10$layout() {
        return dummy10$LAYOUT;
    }

    private static final long dummy10$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer dummy10
     * }
     */
    public static final long dummy10$offset() {
        return dummy10$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer dummy10
     * }
     */
    public static MemorySegment dummy10(MemorySegment struct) {
        return struct.get(dummy10$LAYOUT, dummy10$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer dummy10
     * }
     */
    public static void dummy10(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dummy10$LAYOUT, dummy10$OFFSET, fieldValue);
    }

    private static final OfInt dummy11$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy11"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy11
     * }
     */
    public static final OfInt dummy11$layout() {
        return dummy11$LAYOUT;
    }

    private static final long dummy11$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy11
     * }
     */
    public static final long dummy11$offset() {
        return dummy11$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy11
     * }
     */
    public static int dummy11(MemorySegment struct) {
        return struct.get(dummy11$LAYOUT, dummy11$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy11
     * }
     */
    public static void dummy11(MemorySegment struct, int fieldValue) {
        struct.set(dummy11$LAYOUT, dummy11$OFFSET, fieldValue);
    }

    private static final OfInt dummy12$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy12"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy12
     * }
     */
    public static final OfInt dummy12$layout() {
        return dummy12$LAYOUT;
    }

    private static final long dummy12$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy12
     * }
     */
    public static final long dummy12$offset() {
        return dummy12$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy12
     * }
     */
    public static int dummy12(MemorySegment struct) {
        return struct.get(dummy12$LAYOUT, dummy12$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy12
     * }
     */
    public static void dummy12(MemorySegment struct, int fieldValue) {
        struct.set(dummy12$LAYOUT, dummy12$OFFSET, fieldValue);
    }

    private static final OfInt dummy13$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dummy13"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint dummy13
     * }
     */
    public static final OfInt dummy13$layout() {
        return dummy13$LAYOUT;
    }

    private static final long dummy13$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint dummy13
     * }
     */
    public static final long dummy13$offset() {
        return dummy13$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint dummy13
     * }
     */
    public static int dummy13(MemorySegment struct) {
        return struct.get(dummy13$LAYOUT, dummy13$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint dummy13
     * }
     */
    public static void dummy13(MemorySegment struct, int fieldValue) {
        struct.set(dummy13$LAYOUT, dummy13$OFFSET, fieldValue);
    }

    private static final AddressLayout dummy14$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dummy14"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer dummy14
     * }
     */
    public static final AddressLayout dummy14$layout() {
        return dummy14$LAYOUT;
    }

    private static final long dummy14$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer dummy14
     * }
     */
    public static final long dummy14$offset() {
        return dummy14$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer dummy14
     * }
     */
    public static MemorySegment dummy14(MemorySegment struct) {
        return struct.get(dummy14$LAYOUT, dummy14$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer dummy14
     * }
     */
    public static void dummy14(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dummy14$LAYOUT, dummy14$OFFSET, fieldValue);
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

